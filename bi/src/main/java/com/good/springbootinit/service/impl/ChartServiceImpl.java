package com.good.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.good.springbootinit.mapper.ChartMapper;
import com.good.springbootinit.model.entity.Chart;
import com.good.springbootinit.service.ChartService;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




