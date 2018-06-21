package com.example.jianqiang.mypluginlibrary;

import android.content.Intent;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jianqiang on 17/1/11.
 */
public class ProxyServiceManager {
    private HashMap<String, String> pluginServices = null;

    private static ProxyServiceManager instance = null;

    private ProxyServiceManager() {
        pluginServices = new HashMap<String, String>();
        pluginServices.put("jianqiang.com.plugin1.TestService1", "jianqiang.com.hostapp.ProxyService1");
        pluginServices.put("jianqiang.com.plugin2.TestService2", "jianqiang.com.hostapp.ProxyService1");
        pluginServices.put("jianqiang.com.plugin1.TestService3", "jianqiang.com.hostapp.ProxyService1");
    }

    public static ProxyServiceManager getInstance() {
        if(instance == null)
            instance = new ProxyServiceManager();

        return instance;
    }

    public String getProxyServiceName(String className) {
        return pluginServices.get(className);
    }
}
