package it.cn.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import it.cn.Strength.DO.RecordsDO;
import it.cn.Strength.VO.CampRecords;
import it.cn.Strength.VO.Campgroundtype;
import it.cn.Strength.VO.Records;
import it.cn.Strength.VO.ResultEntity;
import it.cn.mapper.RecordsMapper;
import it.cn.service.CampRecordsService;
import it.cn.service.CampgroundtypeService;
import it.cn.service.RecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 16129
 * @description 针对表【records】的数据库操作Service实现
 * @createDate 2023-09-09 14:36:32
 */
@Service
public class RecordsServiceImpl extends ServiceImpl<RecordsMapper, Records>
        implements RecordsService {


    @Autowired
    private RecordsMapper recordsMapper;

    @Autowired
    private CampgroundtypeService campgroundtypeService;

    @Autowired
    private CampRecordsService campRecordsService;

    @Override
    public void addListALl(List<RecordsDO> records) {

        for (RecordsDO rec : records) {
            Records newRecords = new Records();
            List<Campgroundtype> campgroundtypeList;

            if (rec.getAddress() != null) {
                newRecords.setAddress(rec.getAddress());
            }
            if (rec.getArea() != null) {
                newRecords.setArea(rec.getArea());

            }
            if (rec.getBrowse() != null) {
                newRecords.setBrowse(rec.getBrowse());

            }
            if (rec.getCampname() != null) {
                newRecords.setCampname(rec.getCampname());

            }
            if (rec.getCity() != null) {
                newRecords.setCity(rec.getCity());

            }
            if (rec.getCreatetime() != null) {
                newRecords.setCreatetime(rec.getCreatetime());

            }
            if (rec.getLatitude() != null) {
                newRecords.setLatitude(rec.getLatitude());

            }
            if (rec.getLongitude() != null) {
                newRecords.setLongitude(rec.getLongitude());
            }

            if (rec.getImageurl() != null) {
                newRecords.setImageurl(rec.getImageurl());
            }
            if (rec.getIntro() != null) {
                newRecords.setIntro(rec.getIntro());
            }
            if (rec.getPhone() != null) {
                newRecords.setPhone(rec.getPhone());
            }

            if (rec.getPhotos() != null) {
                newRecords.setPhotos(rec.getPhotos());
            }
            if (rec.getProvince() != null) {
                newRecords.setProvince(rec.getProvince());
            }
            if (rec.getCover()!=null){
                newRecords.setCover(rec.getCover());
            }

            recordsMapper.insert(newRecords);

            if (rec.getCampgroundTypes().size() > 0) {
                campgroundtypeList = rec.getCampgroundTypes();


                for (Campgroundtype campgroundtype : campgroundtypeList) {

                    String typeName = campgroundtype.getTypeName();
                    Campgroundtype thisCampgroundType = campgroundtypeService.selectByTypeName(typeName);
                    if (thisCampgroundType != null) {
                        CampRecords campRecords1 = new CampRecords();
                        campRecords1.setCampgroundtypeid(thisCampgroundType.getId());
                        campRecords1.setRecordsid(newRecords.getId());
                        campRecordsService.addOne(campRecords1);
                    }

                }
            }

        }


    }


    @Override
    public ResultEntity<Page<Records>> listByCity(Integer province, Integer city, Integer page, Integer limit) {
        QueryWrapper<Records> queryWrapper = new QueryWrapper<>();

        if (province != null) {
            queryWrapper.eq("province", province);
        }

        if (city != null) {
            queryWrapper.eq("city", city);
        }

        Page<Records> objectPage = new Page<>(page, limit);
        Page<Records> recordsPage  = recordsMapper.selectPage(objectPage, queryWrapper);

        ResultEntity<Page<Records>> resultEntity = new ResultEntity<>();
        resultEntity.setData(recordsPage);
        return resultEntity;
    }
}




