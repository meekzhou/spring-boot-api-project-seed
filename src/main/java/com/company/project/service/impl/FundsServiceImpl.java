package com.company.project.service.impl;

import com.company.project.dao.FundsMapper;
import com.company.project.model.Funds;
import com.company.project.service.FundsService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by CodeGenerator on 2017/07/03.
 */
@Service
@Transactional
public class FundsServiceImpl extends AbstractService<Funds> implements FundsService {
    @Resource
    private FundsMapper fundsMapper;

    @Override
    public void save(Funds model) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSSS");
        model.setDate(sdf.format(new Date()));
        fundsMapper.insert(model);
    }
}
