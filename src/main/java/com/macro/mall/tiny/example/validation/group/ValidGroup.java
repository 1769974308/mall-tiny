package com.macro.mall.tiny.example.validation.group;

import javax.validation.GroupSequence;

/** 分组校验 - 定义分组
 * @author ASUS
 * @date 2022/8/1
 */
public class ValidGroup {

    public interface  Add{};

    public interface Update{};

    public interface Delete{};

    @GroupSequence({Add.class,Update.class,Delete.class})
    public interface All{};
}
