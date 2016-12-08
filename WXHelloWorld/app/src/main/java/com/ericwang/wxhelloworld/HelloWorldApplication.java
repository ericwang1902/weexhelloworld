package com.ericwang.wxhelloworld;

import android.app.Application;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;

/**
 * Created by w on 2016/12/8.
 */

public class HelloWorldApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化WXSDK
        InitConfig config = new InitConfig.Builder().setImgAdapter((new ImageAdapter())).build();
        WXSDKEngine.initialize(this,config);
    }
}
