package me.afsd.ms.security.service;

import me.afsd.ms.security.SecurityApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author XuHui (416422546@qq.com)
 * @version 0.0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SecurityApplication.class)
public class ModuleServiceTest {
    @Autowired
    ModuleService moduleService;

    @Test
    public void test(){
        System.out.println("in");
        System.out.println(moduleService.getDomainName());
    }
}
