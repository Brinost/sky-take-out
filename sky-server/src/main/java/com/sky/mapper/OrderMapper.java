package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.sky.mapper
 * @ClassName: OrderMapper
 * @author: shmily
 * @createTime: 2023/7/31 11:29
 * @version: 17
 * @Description:
 */
@Mapper
public interface OrderMapper {

    /**
     * 插入订单数据
     * @param orders
     */
    void insert(Orders orders);
}
