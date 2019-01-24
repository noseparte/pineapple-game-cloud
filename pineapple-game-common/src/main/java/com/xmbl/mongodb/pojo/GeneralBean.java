package com.xmbl.mongodb.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

/**
 * Copyright © 2018 noseparte © BeiJing BoLuo Network Technology Co. Ltd. @Author Noseparte @Compile
 * 2018年7月3日 -- 下午3:34:18 @Version 1.0 @Description 通用GeneralBean, 为所有POJO实体类初始化
 */
@Data
public class GeneralBean implements Serializable {

  @Id
  @Field("_id")
  private String id;

  private Boolean isDelete; // 是否删除(默认为：false)
  private Date createTime; // 创建时间

  public GeneralBean() {
    this.createTime = new Date(); // 创建时间
    this.isDelete = false; //
  }
}
