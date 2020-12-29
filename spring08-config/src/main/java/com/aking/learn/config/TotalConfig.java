package com.aking.learn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-29
 */
@Configuration
@ComponentScan("com.aking.learn")
@Import(value = MyConfig.class)
public class TotalConfig {

}
