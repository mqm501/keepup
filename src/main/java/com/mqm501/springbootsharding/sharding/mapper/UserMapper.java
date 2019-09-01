package com.mqm501.springbootsharding.sharding.mapper;

import com.mqm501.springbootsharding.sharding.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Project: springboot-sharding Package: com.mqm501.springbootsharding.sharding.mapper
 * <p>Create Time: 2019年09月01日 16:20          </p>
 * <p>@author: qingmei.meng               </p>
 * <p>Description:               </p>
 **/
@Mapper
public interface UserMapper {
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
