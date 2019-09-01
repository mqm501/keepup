package com.mqm501.springbootsharding.sharding.controller;

import com.mqm501.springbootsharding.sharding.model.Address;
import com.mqm501.springbootsharding.sharding.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Project: springboot-sharding Package: com.mqm501.springbootsharding.sharding.controller
 * <p>Create Time: 2019年09月01日 16:45          </p>
 * <p>@author: qingmei.meng               </p>
 * <p>Description:               </p>
 **/
@Controller
public class AddressController {
  @Autowired
  private AddressService addressService;

  @RequestMapping("/address/save")
  @ResponseBody
  public String save() {
    for (int i = 0; i <10 ; i++) {
      Address address=new Address();
      address.setCode("code_"+i);
      address.setName("name_"+i);
      address.setPid(i+"");
      address.setType(0);
      address.setLit(i%2==0?1:2);
      addressService.save(address);
    }

    return "success";
  }

  @RequestMapping("/address/get/{id}")
  @ResponseBody
  public Address get(@PathVariable Long id) {
    return addressService.get(id);
  }
}
