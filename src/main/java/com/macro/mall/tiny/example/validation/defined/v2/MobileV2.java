package com.macro.mall.tiny.example.validation.defined.v2;

import com.macro.mall.tiny.example.validation.defined.v1.MobileValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;
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
@Constraint(validatedBy={})
@Pattern(regexp = "^0?1[1|2|3|4|5|6|7|8|9][0-9]\\d{8}$")
public @interface MobileV2 {

    String message() default"手机号校验错误";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
