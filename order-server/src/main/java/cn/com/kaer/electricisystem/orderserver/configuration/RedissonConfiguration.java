package cn.com.kaer.electricisystem.orderserver.configuration;

import lombok.extern.slf4j.Slf4j;
import org.redisson.Redisson;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Caorenpeng
 * 2019/7/12
 */
@Configuration
@Slf4j
public class RedissonConfiguration {
    @Bean
    public Redisson getRedisson() {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://47.101.36.118:6379").setPassword("root");
        Redisson redisson = (Redisson) Redisson.create(config);
        log.info("装配redisson 成功");
        return redisson;
    }
}
