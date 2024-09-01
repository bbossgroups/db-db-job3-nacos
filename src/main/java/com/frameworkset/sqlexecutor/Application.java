package com.frameworkset.sqlexecutor;


import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.core.env.StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME;
import static org.springframework.core.env.StandardEnvironment.SYSTEM_PROPERTIES_PROPERTY_SOURCE_NAME;

/**
 *  @author yinbp [122054810@qq.com]
 *
 */

//改变自动扫描的包
//@ComponentScan(basePackages = {"org.bboss.elasticsearchtest.springboot",
//        "org.frameworkset.elasticsearch.boot"})
@SpringBootApplication(scanBasePackages = "com.frameworkset.sqlexecutor")
@NacosPropertySource(dataId = "db-db-job3", autoRefreshed = true, first = true, before = SYSTEM_PROPERTIES_PROPERTY_SOURCE_NAME,
        after = SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME)
public class Application {

    private Logger logger = LoggerFactory.getLogger(Application.class);
    public Application(){
//        System.out.println("aa");
//        db2DBdemo.scheduleImportData();
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }




}
