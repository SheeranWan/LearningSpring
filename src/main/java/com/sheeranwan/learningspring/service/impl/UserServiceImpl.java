package com.sheeranwan.learningspring.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.plusdemo.entity.User;
import com.example.plusdemo.mapper.UserMapper;
import com.example.plusdemo.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangbin
 * @since 2019-10-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
