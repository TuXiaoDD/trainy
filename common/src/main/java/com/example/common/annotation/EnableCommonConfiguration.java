package com.example.common.annotation;

import com.example.common.config.CommonConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({CommonConfiguration.class})
public @interface EnableCommonConfiguration {
}
