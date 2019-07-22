package com.leo.springbootautoconfig.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * AutoConfigDemoConfig加入spring.factories的EnableAutoConfiguration中
 */
@EnableConfigurationProperties(AutoConfigDemoProperties.class)
@Configuration
public class AutoConfigDemoConfig {
}
