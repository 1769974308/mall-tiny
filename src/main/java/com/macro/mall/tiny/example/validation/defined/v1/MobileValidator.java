package com.macro.mall.tiny.example.validation.defined.v1;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ASUS
 * @date 2022/8/1
 */
public class MobileValidator implements ConstraintValidator<MobileV1,String> {

    /**
     * 电话正则表达式
     */
    private  Pattern p = Pattern.compile("^0?1[1|2|3|4|5|6|7|8|9][0-9]\\d{8}$");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {

        if (value == null){
            return false;
        }
        Matcher matcher = p.matcher(value);
        return matcher.matches();
    }
}
