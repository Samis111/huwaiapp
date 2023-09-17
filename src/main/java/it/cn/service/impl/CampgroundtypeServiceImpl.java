package it.cn.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import it.cn.Strength.VO.Campgroundtype;
import it.cn.mapper.CampgroundtypeMapper;
import it.cn.service.CampgroundtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 16129
 * @description 针对表【campgroundtype】的数据库操作Service实现
 * @createDate 2023-09-09 12:04:58
 */
@Service
public class CampgroundtypeServiceImpl extends ServiceImpl<CampgroundtypeMapper, Campgroundtype>
        implements CampgroundtypeService {

    @Autowired
    private CampgroundtypeMapper campgroundtypeMapper;

    @Override
    public void addAll(List<Campgroundtype> list) {

        for (Campgroundtype campgroundtype:list){
            campgroundtype.setId(null);
            campgroundtype.setColor("blue");
            campgroundtypeMapper.insert(campgroundtype);
        }

    }


    @Override
    public Campgroundtype selectByTypeName(String typeName) {
        QueryWrapper<Campgroundtype> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("type_name",typeName);
        List<Campgroundtype> campgroundtypeList = campgroundtypeMapper.selectList(queryWrapper);
        return campgroundtypeList.get(0);
    }
}




