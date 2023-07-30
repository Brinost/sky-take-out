package com.sky.service;

import com.sky.dto.ShoppingCartDTO;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.sky.service
 * @ClassName: ShoppingCartService
 * @author: shmily
 * @createTime: 2023/7/30 18:43
 * @version: 17
 * @Description:
 */
public interface ShoppingCartService {

    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);
}
