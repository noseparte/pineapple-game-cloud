package com.xmbl.dubbo.payment;

import com.alibaba.dubbo.config.annotation.Service;
import com.xmbl.dao.payment.RechargeRecordDao;
import com.xmbl.service.payment.RechargeService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Copyright © 2018 noseparte © BeiJing BoLuo Network Technology Co. Ltd.
 *
 * @Author Noseparte
 * @Compile 2019-01-22 -- 16:00
 * @Version 1.0
 * @Description     平台充值订单管理
 */
@Service
public class RechargeServiceImpl implements RechargeService {

    @Autowired
    private RechargeRecordDao rechargeRecordDao;

}
