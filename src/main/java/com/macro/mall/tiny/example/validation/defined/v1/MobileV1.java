package com.macro.mall.tiny.example.validation.defined.v1;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 自定义电话校验
 * @author ASUS
 * @date 2022/8/1
 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy={MobileValidator.class})
public @interface MobileV1 {

    String message() default"手机号校验错误";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
