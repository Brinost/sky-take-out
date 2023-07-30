package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.sky.service
 * @ClassName: UserService
 * @author: shmily
 * @createTime: 2023/7/29 18:55
 * @version: 17
 * @Description:
 */
public interface UserService {

    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
