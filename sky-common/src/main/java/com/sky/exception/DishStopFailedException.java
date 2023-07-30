package com.sky.exception;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.sky.exception
 * @ClassName: DishStopFailedException
 * @author: shmily
 * @createTime: 2023/7/30 12:18
 * @version: 17
 * @Description: 菜品停售失败异常
 */

public class DishStopFailedException extends BaseException {

    public DishStopFailedException(){}

    public DishStopFailedException(String msg){
        super(msg);
    }
}