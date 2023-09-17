package it.cn.service;

import it.cn.Strength.DO.ProvinceDO;
import it.cn.Strength.VO.Province;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 16129
* @description 针对表【province】的数据库操作Service
* @createDate 2023-09-08 16:05:46
*/
public interface ProvinceService extends IService<Province> {

    int addAll(List<ProvinceDO> provinceList) throws Exception;

    List<Province> listProvince();

    int addAll(List<ProvinceDO> province, String num)  throws Exception;

    List<String> listProvinceByProvinceId();

    String listByProvinceName(String str);
}
