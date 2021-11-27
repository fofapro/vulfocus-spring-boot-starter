package com.r4v3zn.vulfocus.springboot.starter;

import com.r4v3zn.vulfocus.core.client.VulfocusClinet;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Title: VulfocusAutoConfiguration
 * Desc: Vulfocus Auto Configuration
 * Date:2021/11/27 15:27
 * Email:woo0nise@gmail.com
 * Company:www.r4v3zn.com
 *
 * @author R4v3zn
 * @version 1.0.0
 */
@Configuration
@EnableConfigurationProperties(VulfocusProperties.class)
@SpringBootConfiguration
public class VulfocusAutoConfiguration {

    @Bean
    public VulfocusClinet vulfocusClinet(VulfocusProperties vulfocusProperties){
        return new VulfocusClinet(vulfocusProperties.getUsername(), vulfocusProperties.getLicense());
    }

}
