package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.sky.annotation
 * @ClassName: AutoFill
 * @author: shmily
 * @createTime: 2023/7/21 16:42
 * @version: 17
 * @Description: 标识需要进行公共字段自动填充的方法
 */
@Target(ElementType.METHOD) // 注解只能加在方法上
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    //数据库操作类型, UPDATE  INSERT
    OperationType value();
}
