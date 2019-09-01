package com.mqm501.springbootsharding.sharding.model;

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
public class Address {
  private Long id;
  private String code;
  private String name;
  private String pid;
  private Integer type;
  private Integer lit;
}
