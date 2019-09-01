package com.mqm501.springbootsharding.sharding.service.impl;

import com.mqm501.springbootsharding.sharding.mapper.UserMapper;
import com.mqm501.springbootsharding.sharding.model.User;
import com.mqm501.springbootsharding.sharding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Project: springboot-sharding Package: com.mqm501.springbootsharding.sharding.service.impl
 * <p>Create Time: 2019年09月01日 16:23          </p>
 * <p>@author: qingmei.meng               </p>
 * <p>Description:               </p>
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
  @Autowired
  UserMapper userMapper;//这里会报错，但是并不会影响
  /**
   * 保存
   */
  public void save(User user){
    userMapper.save(user);
  }

  /**
   * 查询
   * @param id
   * @return
   */
  public User get(Long id){
    return userMapper.get(id);
  }
}

