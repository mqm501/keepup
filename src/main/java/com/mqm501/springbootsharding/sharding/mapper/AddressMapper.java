package com.mqm501.springbootsharding.sharding.mapper;

import com.mqm501.springbootsharding.sharding.model.Address;
import org.apache.ibatis.annotations.Mapper;

/**
 * Project: springboot-sharding Package: com.mqm501.springbootsharding.sharding.mapper
 * <p>Create Time: 2019年09月01日 16:45          </p>
 * <p>@author: qingmei.meng               </p>
 * <p>Description:               </p>
 **/
@Mapper
public interface AddressMapper {
  /**
   * 保存
   */
  void save(Address address);

  /**
   * 查询
   * @param id
   * @return
   */
  Address get(Long id);
}

