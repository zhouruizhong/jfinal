package com.zrz.utils;

import com.jfinal.plugin.redis.Cache;
import com.jfinal.plugin.redis.Redis;

public class RedisUtils {

    public void redisDemo() {
        // 获取名称为bbs的Redis Cache对象
        Cache bbsCache = Redis.use("bbs");
        bbsCache.set("key", "value");
        bbsCache.get("key");

        // 获取名称为news的Redis Cache对象
        Cache newsCache = Redis.use("news");
        newsCache.set("k", "v");
        newsCache.get("k");

        // 最先创建的Cache将成为主Cache，所以可以省去cacheName参数来获取
        bbsCache = Redis.use();    // 主缓存可以省去cacheName参数
        bbsCache.set("jfinal", "awesome");
    }
}
