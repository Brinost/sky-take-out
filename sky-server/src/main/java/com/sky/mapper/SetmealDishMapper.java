package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.sky.mapper
 * @ClassName: SetmealDishMapper
 * @author: shmily
 * @createTime: 2023/7/27 21:06
 * @version: 17
 * @Description:
 */

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id查询对应套餐
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}
