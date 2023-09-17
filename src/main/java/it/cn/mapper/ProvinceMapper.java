package it.cn.mapper;

import it.cn.Strength.VO.Province;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author 16129
* @description 针对表【province】的数据库操作Mapper
* @createDate 2023-09-08 16:05:46
* @Entity generator.domain.ProvinceDO
*/
@Mapper
public interface ProvinceMapper extends BaseMapper<Province> {

    @Select("select province.province from province")
    List<String> listProvinceByProvinceId();
}




