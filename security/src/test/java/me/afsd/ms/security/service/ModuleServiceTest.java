package me.afsd.ms.security.service;

import me.afsd.ms.security.SecurityApplication;
import me.afsd.ms.security.domain.Module;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author XuHui (416422546@qq.com)
 * @version 0.0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SecurityApplication.class)
@Transactional
@Rollback(false)
public class ModuleServiceTest {
    @Autowired
    ModuleService moduleService;

    private Long id;

    @Before
    public void setUp(){
        Module module=new Module();
        module.setName("模块1");
        module.setDomain("/module1");
        module.setCode("module1");
        Optional<Module> moduleOptional=moduleService.save(module);
        id=moduleOptional.get().getId();
        System.out.println("set up 1");
    }

    @Test
    public void test(){
        System.out.println(id);
        System.out.println("in");
        System.out.println(moduleService.getDomainName());
        System.out.println(moduleService.getOne(id).get().getName());
        Module module=moduleService.getOne(id).get();
        Integer version=module.getVersion();
        module.setName("hello2");
        System.out.println(version);
        module.setVersion(module.getVersion()+3);
        System.out.println(moduleService.saveAndFlush(module).get().getVersion());
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }
}
