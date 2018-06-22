package com.sao.controller;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sao.model.User;
import com.sao.service.UserService;

import com.sao.util.HttpRequest;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.spec.InvalidParameterSpecException;
import java.text.DateFormat;
import java.util.*;

/**
 * Created by Administrator on 2017/8/16.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    private static final Log log = LogFactory.getLog(UserController.class);
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return userService.findAllUser(pageNum,pageSize);
    }

    @ResponseBody
    @RequestMapping(value = "/login")
    public Map<String,Object> doLogin(Model model,
                                      @RequestParam(value = "code",required = false) String code,
                                      @RequestParam(value = "rawData",required = false) String rawData,
                                      @RequestParam(value = "signature",required = false) String signature,
                                      @RequestParam(value = "encrypteData",required = false) String encrypteData,
                                      @RequestParam(value = "iv",required = false) String iv){
        log.info( "Start get SessionKey" );
        Map<String,Object> map = new HashMap<String, Object>();
        System.out.println("用户非敏感信息"+rawData);

        JSONObject rawDataJson = JSON.parseObject( rawData );

        System.out.println("签名"+signature);
        JSONObject SessionKeyOpenId = getSessionKeyOrOpenId( code );
        System.out.println("post请求获取的SessionAndopenId="+SessionKeyOpenId);

        String openid = SessionKeyOpenId.getString("openid" );

        String sessionKey = SessionKeyOpenId.getString( "session_key" );

        System.out.println("openid="+openid+",session_key="+sessionKey);

        User user = userService.findByOpenId(openid);
        //uuid生成唯一key
        String skey = UUID.randomUUID().toString();
        if(user==null){
            //入库
            String nickName = rawDataJson.getString( "nickName" );
            String avatarUrl = rawDataJson.getString( "avatarUrl" );
            String gender  = rawDataJson.getString( "gender" );

            user = new User();
            user.setOpenid( openid );
            user.setCreatetime( new Date(  ) );
            user.setSessionKey( sessionKey );
            user.setSkey( skey );
            user.setAvatarurl( avatarUrl );
            user.setNickname( nickName );
            byte a=0;
            user.setIsdoctor(a);
            userService.addUser( user );
        }else {
            //已存在
            log.info( "用户openid已存在,不需要插入" );
        }
        map.put( "result","0" );
        map.put( "openid",openid );
        map.put( "createTime",user.getCreatetime() );
        map.put( "nickName",user.getNickname() );
        map.put( "avatarUrl",user.getAvatarurl());
        map.put( "isDoctor",user.getIsdoctor() );
        return map;
    }

    public static JSONObject getSessionKeyOrOpenId(String code){

        String requestUrl = "https://api.weixin.qq.com/sns/jscode2session";
        //小程序唯一标识  (在微信小程序管理后台获取)
        String wxspAppid = "wx72462d9ff414efb8";
        //小程序的 app secret (在微信小程序管理后台获取)
        String wxspSecret = "812f25cd435714a87dff28f3b6b917ff";
        //授权（必填）
        String grant_type = "authorization_code";

        //请求参数
        String params = "appid=" + wxspAppid + "&secret=" + wxspSecret + "&js_code=" + code + "&grant_type=" + grant_type;
        //发送post请求读取调用微信接口获取openid用户唯一标识
        JSONObject jsonObject = JSON.parseObject(HttpRequest.sendPost(requestUrl, params));
        return jsonObject;
    }
}