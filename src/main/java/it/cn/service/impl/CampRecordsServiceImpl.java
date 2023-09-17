package it.cn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import it.cn.Strength.VO.CampRecords;
import it.cn.service.CampRecordsService;
import it.cn.mapper.CampRecordsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author 16129
* @description 针对表【camp_records】的数据库操作Service实现
* @createDate 2023-09-14 10:40:05
*/
@Service
public class CampRecordsServiceImpl extends ServiceImpl<CampRecordsMapper, CampRecords>
    implements CampRecordsService{

    @Autowired
    private CampRecordsMapper campRecordsMapper;

    @Override
    public void addOne(CampRecords campRecords1) {
        campRecordsMapper.insert(campRecords1);
    }
}




