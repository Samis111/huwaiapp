package it.cn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import it.cn.Strength.DO.CityDO;
import it.cn.Strength.VO.City;

import java.util.List;

/**
* @author 16129
* @description 针对表【city】的数据库操作Service
* @createDate 2023-09-09 12:04:03
*/
public interface CityService extends IService<City> {

    int addAll(List<CityDO> cityDOList, String myStr);

    Object listByAll(String id);

    String SelectProvincelistByProvinceName(String str);

    public void SelectUpdateName();
}
