
# 概述
spring-boot-starter-validation可以用来校验SpringMVC 的入参，也就是可以用来校验参数的合理性。

# 依赖
```
<!--SpringBoot校验框架-->
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-validation</artifactId>
</dependency>        
```

# 使用validation数据校验
validation常用的校验注解

JSR提供的校验注解：

@Null   被注释的元素必须为null   

@NotNull    被注释的元素必须不为null   

@AssertTrue     被注释的元素必须为true   

@AssertFalse    被注释的元素必须为false   

@Min(value)     被注释的元素必须是一个数字，其值必须大于等于指定的最小值   

@Max(value)     被注释的元素必须是一个数字，其值必须小于等于指定的最大值   

@DecimalMin(value)  被注释的元素必须是一个数字，其值必须大于等于指定的最小值   

@DecimalMax(value)  被注释的元素必须是一个数字，其值必须小于等于指定的最大值   

@Size(max=,min=)   被注释的元素的大小必须在指定的范围内   

@Digits(integer, fraction)     被注释的元素必须是一个数字，其值必须在可接受的范围内   

@Past   被注释的元素必须是一个过去的日期   

@Future     被注释的元素必须是一个将来的日期   

@Pattern(regex=,flag=)  被注释的元素必须符合指定的正则表达式


HibernateValidator提供的校验注解：

@NotBlank(message=)   验证字符串非null，且trim后长度必须大于0   

@Email  被注释的元素必须是电子邮箱地址   

@Length(min=,max=)  被注释的字符串的大小必须在指定的范围内   

@NotEmpty   被注释的字符串的必须非空   

@Range(min=,max=,message=)  被注释的元素必须在合适的范围内

单个参数校验,需要在类上添加@Validated注解，否则不会校验
# 使用validation数据校验之分组校验

# 使用validation数据校验之自定义校验注解

# 使用validation数据校验之国际化