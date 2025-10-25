package com.lxy.shardingjdbcsourcetest;

import com.lxy.shardingjdbcsourcetest.dao.SUserDao;
import com.lxy.shardingjdbcsourcetest.entity.SUser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class ShardingJdbcSourceTestApplication implements CommandLineRunner {
    @Resource
    private SUserDao sUserDao;
    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcSourceTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("正常启动");
        sUserDao.insert(new SUser(3, "lxy"));
    }
}
