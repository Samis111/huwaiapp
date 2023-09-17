package it.cn.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import it.cn.Strength.DO.CityDO;
import it.cn.Strength.VO.City;
import it.cn.service.CityService;
import it.cn.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 16129
* @description 针对表【city】的数据库操作Service实现
* @createDate 2023-09-09 12:04:03
*/

@Service
public class CityServiceImpl extends  ServiceImpl<CityMapper,City> implements CityService{

    @Autowired
    private CityMapper cityMapper;

    @Override
    public int addAll(List<CityDO> cityDOList, String myStr) {
        return 0;
    }

    @Override
    public Object listByAll(String id) {
        QueryWrapper<City> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uid",id);
        return cityMapper.selectList(queryWrapper);
    }

    @Override
    public String SelectProvincelistByProvinceName(String str) {

        QueryWrapper<City> queryWrapper =new QueryWrapper<>();

        queryWrapper.eq("mykey",str);

        return cityMapper.selectOne(queryWrapper).getUid()+"";
    }


    public void SelectUpdateName(){

        List<City> cities = cityMapper.selectList(null);

        for (City city:cities
        ) {

            String city1 = city.getMykey();
            city1+="市";
            city.setMykey(city1);
            cityMapper.updateById(city);

        }


    }


}


