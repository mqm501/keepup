package com.mqm501.springbootsharding.sharding.service;

import com.mqm501.springbootsharding.sharding.model.User;

/**
 * Project: springboot-sharding Package: com.mqm501.springbootsharding.sharding.service.impl
 * <p>Create Time: 2019年09月01日 16:20          </p>
 * <p>@author: qingmei.meng               </p>
 * <p>Description:               </p>
 **/
public interface UserService {
  /**
   * 保存
   */
  void save(User user);

  /**
   * 查询
   * @param id
   * @return
   */
  User get(Long id);
}
