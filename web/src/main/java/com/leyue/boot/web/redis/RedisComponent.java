package com.leyue.boot.web.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.data.redis.connection.RedisConnectionCommands;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by lihao on 17/12/4.
 */
@Component
public class RedisComponent {

    @Resource(name="redisTemplate")
    protected StringRedisTemplate stringRedisTemplate;

//    @Autowired
//    protected StringRedisTemplate stringRedisTemplate;

    private final Logger logger = LoggerFactory.getLogger(RedisComponent.class);

    public void set(String key, String value) {
        //选择index
        stringRedisTemplate.getConnectionFactory().getConnection().select(2);
//
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();


        if (!this.stringRedisTemplate.hasKey(key)) {
            ops.set(key, value);
            logger.info(key + "  保存成功------");
        } else {
            logger.info(key + "  已存在------" + ops.get(key));
        }

    }


    public Object get(String key) {
        return this.stringRedisTemplate.opsForValue().get(key);
    }
}
