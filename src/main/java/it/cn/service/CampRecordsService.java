package it.cn.service;

import it.cn.Strength.VO.CampRecords;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 16129
* @description 针对表【camp_records】的数据库操作Service
* @createDate 2023-09-14 10:40:05
*/
public interface CampRecordsService extends IService<CampRecords> {

    void addOne(CampRecords campRecords1);
}
