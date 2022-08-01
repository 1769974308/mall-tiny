package com.macro.mall.tiny.common.exception;

import com.macro.mall.tiny.common.api.CommonResult;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 * Created by macro on 2020/2/27.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = ApiException.class)
    public CommonResult handle(ApiException e) {
        if (e.getErrorCode() != null) {
            return CommonResult.failed(e.getErrorCode());
        }
        return CommonResult.failed(e.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public CommonResult handleValidException(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        StringBuilder stringBuilder = new StringBuilder();
        for (Object errors : bindingResult.getAllErrors()){
            stringBuilder.append("[");
            stringBuilder.append(((FieldError) errors).getField() + ((FieldError) errors).getDefaultMessage());
            stringBuilder.append("]");
        }
        return CommonResult.validateFailed(stringBuilder.toString());
    }

    @ResponseBody
    @ExceptionHandler(value = BindException.class)
    public CommonResult handleValidException(BindException e) {
        BindingResult bindingResult = e.getBindingResult();
        StringBuilder stringBuilder = new StringBuilder();
        for (Object errors : bindingResult.getAllErrors()){
            stringBuilder.append("[");
            stringBuilder.append(((FieldError) errors).getField() + ((FieldError) errors).getDefaultMessage());
            stringBuilder.append("]");
        }
        return CommonResult.validateFailed(stringBuilder.toString());
    }

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public CommonResult handleValidException(Exception e){
        e.printStackTrace();
        return CommonResult.validateFailed("【未知异常】"+e.getMessage());
    }
}
