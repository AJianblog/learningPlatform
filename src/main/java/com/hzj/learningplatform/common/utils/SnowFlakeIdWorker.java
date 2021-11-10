package com.hzj.learningplatform.common.utils;

import com.hzj.learningplatform.common.entity.SnowFlake;

/**
 * SnowFlake单例模式，饿汉式
 */
public class SnowFlakeIdWorker {

    private static final SnowFlake snowFlake = new SnowFlake(2, 3);

    private SnowFlakeIdWorker() {
    }

    /**
     * 静态工厂方法
     * @return 雪花算法实例对象
     */
    public static SnowFlake getInstance() {
        return snowFlake;
    }
}
