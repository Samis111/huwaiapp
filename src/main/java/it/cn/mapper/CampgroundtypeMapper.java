package it.cn.mapper;

import it.cn.Strength.VO.Campgroundtype;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 16129
* @description 针对表【campgroundtype】的数据库操作Mapper
* @createDate 2023-09-09 12:04:58
* @Entity it.cn.Strength.VO.Campgroundtype
*/
@Mapper
public interface CampgroundtypeMapper extends BaseMapper<Campgroundtype> {

    Campgroundtype selectByTypeName(String typeName);
}




