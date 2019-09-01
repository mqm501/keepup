package com.mqm501.springbootsharding.sharding.model;

import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Project: springboot-sharding Package: com.mqm501.springbootsharding.sharding.model
 * <p>Create Time: 2019年09月01日 16:19          </p>
 * <p>@author: qingmei.meng               </p>
 * <p>Description:               </p>
 **/
@NoArgsConstructor
@Data
public class User {
  private Long id;
  private String name;
  private String phone;
  private String email;
  private String password;
  private Integer cityId;
  private Date createTime;
  private Integer sex;
}
