package it.cn.service;

import it.cn.Strength.VO.Campgroundtype;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 16129
* @description 针对表【campgroundtype】的数据库操作Service
* @createDate 2023-09-09 12:04:58
*/
public interface CampgroundtypeService extends IService<Campgroundtype> {

    void addAll(List<Campgroundtype> list);

    Campgroundtype selectByTypeName(String typeName);
}
