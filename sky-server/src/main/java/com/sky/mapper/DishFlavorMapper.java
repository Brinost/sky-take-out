package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.sky.mapper
 * @ClassName: DishFlavorMapper
 * @author: shmily
 * @createTime: 2023/7/21 21:58
 * @version: 17
 * @Description:
 */

@Mapper
public interface DishFlavorMapper {
    /**
     * 批量插入口味数据
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);

    /**
     * 根据菜品id删除口味数据
     * @param dishId
     */
    @Delete("delete  from dish_flavor where dish_id = #{dishId}")
    void deleteByDishId(Long dishId);
}