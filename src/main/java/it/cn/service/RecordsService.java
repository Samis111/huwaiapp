package it.cn.service;

import it.cn.Strength.DO.RecordsDO;
import it.cn.Strength.VO.Records;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 16129
* @description 针对表【records】的数据库操作Service
* @createDate 2023-09-09 14:36:32
*/
public interface RecordsService extends IService<Records> {

    void addListALl(List<RecordsDO> records);

    Object listByCity(Integer province, Integer city, Integer page, Integer limit);
}
