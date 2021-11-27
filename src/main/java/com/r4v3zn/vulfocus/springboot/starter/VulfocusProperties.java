package com.r4v3zn.vulfocus.springboot.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Title: VulfocusProperites
 * Desc: Vulfocus Properites
 * Date:2021/11/27 15:26
 * Email:woo0nise@gmail.com
 * Company:www.r4v3zn.com
 *
 * @author R4v3zn
 * @version 1.0.0
 */
@ConfigurationProperties(prefix = VulfocusProperties.VULFOCUS_PREFIX)
public class VulfocusProperties {

    public static final String VULFOCUS_PREFIX  = "vulfocus";

    /**
     * username
     */
    private String username;

    /**
     * license
     */
    private String license;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "VulfocusProperties{" +
                "username='" + username + '\'' +
                ", license='" + license + '\'' +
                '}';
    }
}
