package cn.com.kaer.electricisystem.orderserver.util;

import cn.com.kaer.electricisystem.orderserver.configuration.RedissonConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created by Caorenpeng
 * 2019/7/12
 */
@Service
@Slf4j
public class LockUtil {
    @Autowired
    RedissonConfiguration redissonConfiguration;

    public boolean acquire(String lockName) {
        String key = "redisKey_" + lockName;
        RLock lock = redissonConfiguration.getRedisson().getLock(key);
        lock.lock(2, TimeUnit.MINUTES);
        log.info("线程:【{}】获取到了锁",Thread.currentThread().getName());
        return true;
    }

    public void realase(String lockName) {
        String key = "redisKey_" + lockName;
        RLock lock = redissonConfiguration.getRedisson().getLock(key);
        lock.unlock();
    }

}
