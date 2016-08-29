package com.innotech.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by sunyuqin on 16/8/26.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface AnnotationTest {
    String value();
}
