package com.mqm501.springbootsharding.sharding.controller;

import com.mqm501.springbootsharding.sharding.model.User;
import com.mqm501.springbootsharding.sharding.service.UserService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Project: springboot-sharding Package: com.mqm501.springbootsharding.sharding.controller
 * <p>Create Time: 2019年09月01日 16:18          </p>
 * <p>@author: qingmei.meng               </p>
 * <p>Description:               </p>
 **/
@Controller
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping("/user/save")
  @ResponseBody
  public String save() {
    for (int i = 0; i <10 ; i++) {
      User user=new User();
      user.setName("test"+i);
      user.setCityId(i%2==0?1:2);
      user.setCreateTime(new Date());
      user.setSex(i%2==0?1:2);
      user.setPhone("11111111"+i);
      user.setEmail("xxxxx");
      user.setCreateTime(new Date());
      user.setPassword("eeeeeeeeeeee");
      userService.save(user);
    }

    return "success";
  }

  @RequestMapping("/user/get/{id}")
  @ResponseBody
  public User get(@PathVariable Long id) {
    User user =  userService.get(id);
    System.out.println(user.getId());
    return user;
  }
}

