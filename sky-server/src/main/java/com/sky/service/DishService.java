package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.sky.service
 * @ClassName: DishService
 * @author: shmily
 * @createTime: 2023/7/21 21:43
 * @version: 17
 * @Description:
 */
public interface DishService {

    /**
     * 新增菜品和对应的口味数据
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
