package it.cn.Request;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import it.cn.Strength.DO.*;
import it.cn.Strength.VO.Campgroundtype;
import it.cn.Strength.VO.Province;
import it.cn.Strength.VO.ResultEntity;
import it.cn.service.CampgroundtypeService;
import it.cn.service.CityService;
import it.cn.service.ProvinceService;
import it.cn.service.RecordsService;
import it.cn.utill.GostUtill;
import it.cn.utill.OkHttp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class pythonCirty {


    @Autowired
    private OkHttp okHttp;

    @Autowired
    private ProvinceService provinceService;

    @Autowired
    private CityService cityService;

    @Autowired
    private CampgroundtypeService campgroundtypeService;

    @Autowired
    private RecordsService recordsService;

    @GetMapping("text")
    public Object text01() {



//        ResultEntity<? extends Object> resultEntity = GostUtill.jsonToObject(str, ResultEntity.class);
//
//        DateList jsonToList=(DateList) GostUtill.jsonToObject( resultEntity.getData().toString(), DateList.class);


            String str="{id=73d4229af6397e6525d2663a1fb34e35, status=3, campName=北京市蜗蜗牛房车驿站营地, typeId=1.0, phone=13811207179, contactMan=于立堂, sparePhone=, spareContactMan=, fixedPhone=, cover=, address=北京市海淀区上地西路和后厂村路西北角, businessHours=, latitude=40.054619, longitude=116.296033, description=, content=, score=4.5, browse=2561.0, province=110000, city=110100, area=110108, createTime=2023-08-12 09:43:11, updateManPhone=19951681877, deleted=0.0, altitude=51.0, distance=566.19, getVip=false, browseLimit=false, commentsTo=0.0, campgroundTypes=[{id=11, typeName=推荐, sort=2.0, icon=tuijian, color=yellow, campId=73d4229af6397e6525d2663a1fb34e35}, {id=5, typeName=认证, sort=4.0, icon=renzheng, color=green, campId=73d4229af6397e6525d2663a1fb34e35}, {id=16, typeName=电, sort=7.0, icon=nengliangzhi, color=blue, campId=73d4229af6397e6525d2663a1fb34e35}, {id=14, typeName=卫, sort=8.0, icon=weishengjian, color=orange, campId=73d4229af6397e6525d2663a1fb34e35}, {id=15, typeName=水, sort=9.0, icon=icon-humidity, color=blue, campId=73d4229af6397e6525d2663a1fb34e35}, {id=2, typeName=拖挂, sort=13.0, icon=tuoguafangche, color=red, campId=73d4229af6397e6525d2663a1fb34e35}], altitudeLevel=低}";


            String str2="{\n" +
                    "            \"id\": \"85a3412e6419e79396e9f0b6af086063\",\n" +
                    "            \"status\": \"3\",\n" +
                    "            \"campName\": \"天津市西青区品速汽车（房车）维修公司\",\n" +
                    "            \"typeId\": 4,\n" +
                    "            \"phone\": \"13920255717\",\n" +
                    "            \"contactMan\": \"老张\",\n" +
                    "            \"sparePhone\": \"\",\n" +
                    "            \"spareContactMan\": \"\",\n" +
                    "            \"fixedPhone\": \"\",\n" +
                    "            \"cover\": \"https://touringcar.oss-cn-beijing.aliyuncs.com/cover/20220108160307044962027.jpg?Expires=2006696674&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=%2BexhXznNXy5mPksHLqMhLi%2BnXMM%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10\",\n" +
                    "            \"mapHeader\": \"https://touringcar.oss-cn-beijing.aliyuncs.com/base/position-bg.png?Expires=2006696674&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=MI35b8QUaKIVaTls943E5hN%2BsLU%3D&x-oss-process=image%2Fresize%2Cw_128%2Ch_128%2Fwatermark%2Cimage_Y292ZXIvMjAyMjAxMDgxNjAzMDcwNDQ5NjIwMjcuanBnP3gtb3NzLXByb2Nlc3M9aW1hZ2UvcmVzaXplLG1fZmlsbCx3Xzk3LGhfOTcvY2lyY2xlLHJfNTAwL2Zvcm1hdCxwbmc%3D%2Cg_west%2Cvoffset_12%2Cx_15\",\n" +
                    "            \"address\": \"天津市西青区梨双公路与山深线交叉口东400米百日侠院内B10号\",\n" +
                    "            \"businessHours\": \"\",\n" +
                    "            \"latitude\": 39.031496,\n" +
                    "            \"longitude\": 117.199471,\n" +
                    "            \"description\": \"\",\n" +
                    "            \"content\": \"\",\n" +
                    "            \"maintainMan\": \"6df7d57107c2b7a640cb043d041e62c3\",\n" +
                    "            \"intro\": \"房车、汽车维修、保养、检查，厕所，加水。场地800平米\",\n" +
                    "            \"photos\": \"https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20220108161854861759813.jpg?Expires=2006696674&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=17HMcgthxCBL2CQeeBFBVxvlkUk%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20220108161854848589427.jpg?Expires=2006696674&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=72kGkSoDZuL3Z3XYClq6jgLeEaE%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20220108161854852645909.jpg?Expires=2006696674&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=oBhpx2ajDtkM9E%2BX1qXbWPPN6bI%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20220108161854831838120.jpg?Expires=2006696674&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=ovhULkm6b6jLS7lUg2KJbCGX1S8%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20220108161854843942126.jpg?Expires=2006696674&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=j9XWtHHDFyJ%2BcTbAj5mjJkx%2Fxew%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20220108161854883698486.jpg?Expires=2006696674&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=hNWFnDvyCaMdmEzRbPaZfpOj44U%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10\",\n" +
                    "            \"score\": 2.5,\n" +
                    "            \"browse\": 523,\n" +
                    "            \"province\": \"120000\",\n" +
                    "            \"city\": \"120100\",\n" +
                    "            \"area\": \"120111\",\n" +
                    "            \"createTime\": \"2022-01-08 16:03:06\",\n" +
                    "            \"deleted\": 0,\n" +
                    "            \"altitude\": 5,\n" +
                    "            \"distance\": 429.58,\n" +
                    "            \"getVip\": false,\n" +
                    "            \"browseLimit\": false,\n" +
                    "            \"commentsTo\": 0,\n" +
                    "            \"campgroundTypes\": [\n" +
                    "                {\n" +
                    "                    \"id\": \"15\",\n" +
                    "                    \"typeName\": \"水\",\n" +
                    "                    \"sort\": 9,\n" +
                    "                    \"icon\": \"icon-humidity\",\n" +
                    "                    \"color\": \"blue\",\n" +
                    "                    \"campId\": \"85a3412e6419e79396e9f0b6af086063\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"id\": \"9\",\n" +
                    "                    \"typeName\": \"维修\",\n" +
                    "                    \"sort\": 15,\n" +
                    "                    \"icon\": \"weixiu\",\n" +
                    "                    \"color\": \"purple\",\n" +
                    "                    \"campId\": \"85a3412e6419e79396e9f0b6af086063\"\n" +
                    "                }\n" +
                    "            ],\n" +
                    "            \"altitudeLevel\": \"低\"\n" +
                    "        }\n" +
                    "    ";

//        String s = str.replaceAll("=", ":");


        Object dateLists = GostUtill.jsonToObject(str2, RecordsDO.class);

        return dateLists;
    }


    @GetMapping("detailPage")
    public Object detailPage() {

        List<String> stringList = provinceService.listProvinceByProvinceId();

        for (String strMY:stringList){

            List<RequestHeaderDO> requestHeaderDOList = new ArrayList<>();
            requestHeaderDOList.add(new RequestHeaderDO("token", "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJvaGFlLTVKcm1xNV9tNzdpcC1IMENpcUp4UnNJIiwiZXhwIjoxNjk0ODM1ODk2LCJpYXQiOjE2OTQ4Mjg2OTYsIm9wZW5pZCI6Im9oYWUtNUpybXE1X203N2lwLUgwQ2lxSnhSc0kiLCJqdGkiOiIzOWE5OTk1Yi05MzM3LTQ4NGYtYWJiMS0yMzhjMWU0Y2E2ZDgifQ.gEJcaWQuxjNcfSZeBiHXBhQM3GFEZaKRfaGglnwoAnk"));
            String str;
            try {
                str = OkHttp.sendGet(
                        "http://123.56.79.197/api/camp/tabListByCity",
                        "province="+ strMY +"&city=&longitude=120.43293762207031&latitude=36.14508056640625&page=1&limit=1000",
                        OkHttp.CHARSET_NAME, requestHeaderDOList);
            } catch (Exception e) {
                return "异常";
            }
//        ResultEntity<? extends Object> resultEntity = GostUtill.jsonToObject(str, ResultEntity.class);


            JSONObject jsonArray = JSONArray.parseObject(str);

            newDateDO records = jsonArray.getObject("data", newDateDO.class);


            recordsService.addListALl(records.getRecords());
        }



        return "ok";
    }

    @GetMapping("/campType")
    public Object CampType() {
        List<RequestHeaderDO> requestHeaderDOList = new ArrayList<>();
        requestHeaderDOList.add(new RequestHeaderDO("token", "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJvaGFlLTVKcm1xNV9tNzdpcC1IMENpcUp4UnNJIiwiZXhwIjoxNjk0MzMyODc2LCJpYXQiOjE2OTQzMjU2NzYsIm9wZW5pZCI6Im9oYWUtNUpybXE1X203N2lwLUgwQ2lxSnhSc0kiLCJqdGkiOiI2YWFkNmMyOC1kMTBjLTQxY2ItOGUwYy02ZGNlNGZjZDhkM2IifQ.mHDH48R9Ds0nULR1vhD4zy1u_qof7jSjgIOMpe7T4GI"));

        String str;
        try {
            str = OkHttp.sendGet("http://123.56.79.197/api/map/campType", null, OkHttp.CHARSET_NAME, requestHeaderDOList);
        } catch (Exception e) {
            return "异常";
        }

        ResultEntity<? extends Object> resultEntity = GostUtill.jsonToObject(str, ResultEntity.class);
    List<Campgroundtype> list = (List<Campgroundtype>) GostUtill.jsonToObject(resultEntity.getData().toString(), Campgroundtype.class);


        campgroundtypeService.addAll(list);


        return list;

    }


    @GetMapping("/cirtyFind")
    public Object CirtyFind() throws Exception {
        //api/camp/CityByProvince?typeId=&longitude=120.43293762207031&latitude=36.14508056640625&province=320000
        //?typeId=&longitude=120.43293762207031&latitude=36.14508056640625&province=340000
        List<RequestHeaderDO> requestHeaderDOList = new ArrayList<>();
        requestHeaderDOList.add(new RequestHeaderDO("token", "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJvaGFlLTVKcm1xNV9tNzdpcC1IMENpcUp4UnNJIiwiZXhwIjoxNjk0MTg2NDQ3LCJpYXQiOjE2OTQxNzkyNDcsIm9wZW5pZCI6Im9oYWUtNUpybXE1X203N2lwLUgwQ2lxSnhSc0kiLCJqdGkiOiI3OTIwMzJiNi1kNGVkLTQ4ZWMtYjU1MC1lODRmZGE2ZjJjNzYifQ.NZd71gWlTAArrqRVFyKrbZ7QIT9vDPnMSgVMC47V0VQ"));

        List<Province> provinces = provinceService.listProvince();

        for (Province pro : provinces) {


            String str = null;
            String myStr = pro.getProvince();
            try {
                str = OkHttp.sendGet("http://123.56.79.197/api/camp/CityByProvince", "typeId=&longitude=120.43293762207031&latitude=36.14508056640625&province=" + myStr, OkHttp.CHARSET_NAME, requestHeaderDOList);
            } catch (Exception e) {
                return "异常";
            }


            ResultEntity<? extends Object> resultEntity = GostUtill.jsonToObject(str, ResultEntity.class);
            List<CityDO> cityDOList = (List<CityDO>) GostUtill.jsonToList(resultEntity.getData().toString(), CityDO.class);

            int i = cityService.addAll(cityDOList, myStr);

        }

        return "成功";


    }

    @GetMapping("/cirty")
    public Object cirty() throws Exception {

        List<RequestHeaderDO> requestHeaderDOList = new ArrayList<>();
        requestHeaderDOList.add(new RequestHeaderDO("token", "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJvaGFlLTVKcm1xNV9tNzdpcC1IMENpcUp4UnNJIiwiZXhwIjoxNjk0MTc4MDcxLCJpYXQiOjE2OTQxNzA4NzEsIm9wZW5pZCI6Im9oYWUtNUpybXE1X203N2lwLUgwQ2lxSnhSc0kiLCJqdGkiOiI4MWFlNzc4Mi05OWYzLTRkN2ItODRjMS0xYzMxYjQyNzA4ZTQifQ.cIOB0y1D0U8n_bPsnfuaWH_UjG4hF4vRs4b5fpZlUUw"));
        String str;
        try {
            str = OkHttp.sendGet("http://123.56.79.197/api/camp/provinceByType", "typeId=&longitude=120.43293762207031&latitude=36.14508056640625", OkHttp.CHARSET_NAME, requestHeaderDOList);
        } catch (Exception e) {
            return "异常";
        }

        ResultEntity<? extends Object> resultEntity = GostUtill.jsonToObject(str, ResultEntity.class);

        List<ProvinceDO> province = (List<ProvinceDO>) GostUtill.jsonToList(resultEntity.getData().toString(), ProvinceDO.class);


        int i = provinceService.addAll(province);
        System.out.println(i);

        return province;
    }


    @GetMapping("text01")
    public void Text01(){

      cityService.SelectUpdateName();
    }


}
