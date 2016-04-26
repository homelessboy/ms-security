package me.afsd.ms.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author XuHui (416422546@qq.com)
 * @version 0.0.1
 */
@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass =me.afsd.dao.base.impl.BaseRepositoryImpl.class)
@EnableTransactionManagement
public class SecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }
}
