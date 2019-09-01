package com.mqm501.springbootsharding.sharding.service;

import com.mqm501.springbootsharding.sharding.model.Address;

/**
 * Project: springboot-sharding Package: com.mqm501.springbootsharding.sharding.service
 * <p>Create Time: 2019年09月01日 16:44          </p>
 * <p>@author: qingmei.meng               </p>
 * <p>Description:               </p>
 **/
public interface AddressService {
  void save(Address address);
  Address get(Long id);
}
