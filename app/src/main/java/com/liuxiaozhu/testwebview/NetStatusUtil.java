package com.liuxiaozhu.testwebview;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Author：Created by liuxiaozhu on 2018/3/29.
 * Email: chenhuixueba@163.com
 */

class NetStatusUtil {
//    检测是否联网
    public static boolean isConnected(Context context) {
        if (context != null) {
            // 获取手机所有连接管理对象(包括对wi-fi,net等连接的管理)
            ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            // 获取NetworkInfo对象
            NetworkInfo networkInfo = manager.getActiveNetworkInfo();
            //判断NetworkInfo对象是否为空
            if (networkInfo != null)
                return networkInfo.isAvailable();
        }
        return false;
    }
}
