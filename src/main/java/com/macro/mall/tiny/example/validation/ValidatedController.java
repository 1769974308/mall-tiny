package com.macro.mall.tiny.example.validation;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.example.validation.domain.User;
import com.macro.mall.tiny.example.validation.group.ValidGroup;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** validation参数校验
 * @author ASUS
 * @date 2022/8/1
 */
@Api(tags = "ValidatedController")
@Tag(name = "ValidatedController",description = "validation参数校验")
@RestController
@RequestMapping("/validated")
public class ValidatedController {


    @ApiOperation(value = "新增用户校验")
    @PostMapping("/add")
    public CommonResult<User> addUser(@RequestBody @Validated({ValidGroup.Add.class}) User user){
        return CommonResult.success(user);
    }

    @ApiOperation(value = "更新用户校验")
    @PostMapping("/edit")
    public CommonResult<User> editUser(@RequestBody @Validated({ValidGroup.Update.class}) User user){

        return CommonResult.success(user);
    }
}
