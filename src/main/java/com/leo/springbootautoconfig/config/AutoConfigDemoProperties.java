package com.leo.springbootautoconfig.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@ConfigurationProperties("auto-config-demo")
@Data
@Validated
public class AutoConfigDemoProperties {
    @NotEmpty
    private String name;

    @NotEmpty
    private String email;
}
