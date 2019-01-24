package com.xmbl;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDubboConfig
@DubboComponentScan(basePackages = "com.xmbl.service")
@EnableSwagger2
public class PineappleGameCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(PineappleGameCloudApplication.class, args);
    }

}

