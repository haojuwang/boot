package com.leyue.boot.web.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by lihao on 17/12/4.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
   private RedisComponent redisComponent;

    @Test
    public void set() {
        redisComponent.set("key1","this key1");
    }
}
