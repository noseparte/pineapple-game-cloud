package com.xmbl.achieve.payment;

import com.xmbl.dao.payment.RechargeRecordDao;
import com.xmbl.domain.payment.RechargeRecord;
import com.xmbl.mongodb.dao.GeneralPaymentDaoImpl;
import org.springframework.stereotype.Repository;

/**
 * Copyright © 2018 noseparte © BeiJing BoLuo Network Technology Co. Ltd.
 *
 * @Author Noseparte
 * @Compile 2019-01-22 -- 20:26
 * @Version 1.0
 * @Description
 */
@Repository
public class RechargeRecordDaoImpl extends GeneralPaymentDaoImpl<RechargeRecord> implements RechargeRecordDao {
    @Override
    protected Class<RechargeRecord> getEntityClass() {
        return RechargeRecord.class;
    }
}
