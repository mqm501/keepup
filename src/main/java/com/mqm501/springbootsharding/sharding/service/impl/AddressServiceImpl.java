package com.mqm501.springbootsharding.sharding.service.impl;

import com.mqm501.springbootsharding.sharding.mapper.AddressMapper;
import com.mqm501.springbootsharding.sharding.model.Address;
import com.mqm501.springbootsharding.sharding.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Project: springboot-sharding Package: com.mqm501.springbootsharding.sharding.service.impl
 * <p>Create Time: 2019年09月01日 16:44          </p>
 * <p>@author: qingmei.meng               </p>
 * <p>Description:               </p>
 **/
@Service(value = "addressService")
public class AddressServiceImpl implements AddressService {
  @Autowired
  private AddressMapper addressMapper;//这里会报错，但是并不会影响
  /**
   * 保存
   */
  @Override
  public void save(Address address){
    addressMapper.save(address);
  }

  /**
   * 查询
   * @param id
   * @return
   */
  @Override
  public Address get(Long id){
    return addressMapper.get(id);
  }
}
