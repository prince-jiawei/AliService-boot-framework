package com.yazuo.nacos.config;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "user")
@Data
// @NacosConfigurationProperties(prefix = "user", dataId = "${nacos.config.data-id}", type = ConfigType.YAML)
public class PasswordProperties {

    /**
     * 密码
     */
    private String password;

}