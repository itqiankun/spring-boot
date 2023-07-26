package com.itqiankun.properties.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 项目配置
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-09-29 10:50
 */
@Data
@Component
public class ApplicationProperty {
    @Value("${application.name}")
    private String name;
    @Value("${application.version}")
    private String version;
}
