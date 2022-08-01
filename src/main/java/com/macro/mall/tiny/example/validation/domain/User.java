package com.macro.mall.tiny.example.validation.domain;

import com.macro.mall.tiny.example.validation.defined.v1.MobileV1;
import com.macro.mall.tiny.example.validation.defined.v2.MobileV2;
import com.macro.mall.tiny.example.validation.group.ValidGroup;
import lombok.Data;


import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


/**
 * @author ASUS
 * @date 2022/8/1
 */
@Data
public class User {

    /**
     * 只能在Add或Update时才能够进行生效
     */
    @NotEmpty(message = "姓名不能为空",groups = {ValidGroup.Add.class,ValidGroup.Update.class})
    private String name;

    @DecimalMin(value = "18",message = "年龄不能小于18岁",groups = {ValidGroup.Add.class,ValidGroup.Update.class})
    private int age;

    @NotEmpty(message = "地址不能为空",groups = {ValidGroup.Update.class})
    private String address;

    //@MobileV2(groups ={ValidGroup.Update.class} )
    @Pattern(regexp = "^0?1[1|2|3|4|5|6|7|8|9][0-9]\\d{8}$",groups ={ValidGroup.Update.class})
    private String mobile;
}
