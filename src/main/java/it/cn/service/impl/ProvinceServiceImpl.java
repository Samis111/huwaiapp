package it.cn.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import it.cn.Strength.DO.ProvinceDO;
import it.cn.Strength.VO.Province;
import it.cn.mapper.ProvinceMapper;
import it.cn.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 16129
 * @description 针对表【province】的数据库操作Service实现
 * @createDate 2023-09-08 16:05:46
 */
@Service
public class ProvinceServiceImpl extends ServiceImpl<ProvinceMapper, Province> implements ProvinceService {

    @Autowired
    private ProvinceMapper provinceMapper;


    @Override
    public List<Province> listProvince() {
        return provinceMapper.selectList(null);
    }

    @Override
    public int addAll(List<ProvinceDO> provinceList) throws Exception {
        int a = 0;
        try {
            if (provinceList == null || provinceList.size() == 0) {
                return 0;
            }


            for (ProvinceDO pro1 : provinceList
            ) {
                if (pro1 != null) {
                    Province province = new Province();
                    province.setCount(pro1.getCount());
                    province.setMykey(pro1.getKey());
                    province.setProvince(pro1.getProvince());
                    provinceMapper.insert(province);
                    a++;
                }
            }

        } catch (Exception e) {
            System.out.println(e.toString());
            throw new   Exception();
//            return -1;
        }

        return a;
    }

    @Override
    public int addAll(List<ProvinceDO> provinceList, String num) throws Exception {
        int a = 0;
        try {
            if (provinceList == null || provinceList.size() == 0) {
                return 0;
            }


            for (ProvinceDO pro1 : provinceList
            ) {
                if (pro1 != null) {
                    Province province = new Province();
                    province.setCount(pro1.getCount());
                    province.setMykey(pro1.getKey());
                    province.setProvince(pro1.getProvince());
                    province.setUid(num);
                    provinceMapper.insert(province);
                    a++;
                }
            }

        } catch (Exception e) {
            System.out.println(e.toString());
            throw new   Exception();
//            return -1;
        }

        return a;
    }


    @Override
    public List<String> listProvinceByProvinceId() {

        return provinceMapper.listProvinceByProvinceId();

        }

    @Override
    public String listByProvinceName(String str) {

        QueryWrapper<Province> queryWrapper= new QueryWrapper<>();

        queryWrapper.like("mykey",str);

        return provinceMapper.selectOne(queryWrapper).getProvince();

    }
}




