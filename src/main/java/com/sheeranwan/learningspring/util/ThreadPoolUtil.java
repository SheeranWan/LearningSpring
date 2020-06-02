package com.sheeranwan.learningspring.util;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Project :
 * @Package Name : com.example.plusdemo.util
 * @Description : 
 * @Author : zhangbin
 * @Create Date : 2019-11-07 14:06
 * @ModificationHistory Who   When     What
 * ------------    --------------    ---------------------------------
 */
public class ThreadPoolUtil {


    public static ExecutorService getThreadPool(String name,Integer corePoolSize,Integer maximunPoolSize,Integer queueNum){
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat(name).build();
        return new ThreadPoolExecutor(corePoolSize, maximunPoolSize, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(queueNum), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
    }
}
