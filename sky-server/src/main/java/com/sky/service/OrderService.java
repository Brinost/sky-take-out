package com.sky.service;

import com.sky.dto.OrdersSubmitDTO;
import com.sky.vo.OrderSubmitVO;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.sky.service
 * @ClassName: OrderService
 * @author: shmily
 * @createTime: 2023/7/31 11:25
 * @version: 17
 * @Description:
 */

public interface OrderService {

    /**
     * 用户下单
     * @param ordersSubmitDTO
     * @return
     */
    OrderSubmitVO submitOrder(OrdersSubmitDTO ordersSubmitDTO);
}
