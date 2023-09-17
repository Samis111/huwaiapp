package it.cn.Controller;

import it.cn.service.RecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/huwai")
public class detailController {


    @GetMapping("find")
    public Object listGet(){



        return "[\n" +
                "    {\n" +
                "        \"id\": \"85a3412e6419e79396e9f0b6af086063\",\n" +
                "        \"campname\": \"天津市西青区品速汽车（房车）维修公司\",\n" +
                "        \"phone\": \"13920255717\",\n" +
                "        \"address\": \"天津市西青区梨双公路与山深线交叉口东400米百日侠院内B10号\",\n" +
                "        \"latitude\": \"39.031496\",\n" +
                "        \"longitude\": \"117.199471\",\n" +
                "        \"intro\": \"房车、汽车维修、保养、检查，厕所，加水。场地800平米\",\n" +
                "        \"photos\": \"https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20220108161854861759813.jpg?Expires=2006696674&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=17HMcgthxCBL2CQeeBFBVxvlkUk%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20220108161854848589427.jpg?Expires=2006696674&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=72kGkSoDZuL3Z3XYClq6jgLeEaE%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20220108161854852645909.jpg?Expires=2006696674&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=oBhpx2ajDtkM9E%2BX1qXbWPPN6bI%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20220108161854831838120.jpg?Expires=2006696674&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=ovhULkm6b6jLS7lUg2KJbCGX1S8%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20220108161854843942126.jpg?Expires=2006696674&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=j9XWtHHDFyJ%2BcTbAj5mjJkx%2Fxew%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20220108161854883698486.jpg?Expires=2006696674&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=hNWFnDvyCaMdmEzRbPaZfpOj44U%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10\",\n" +
                "        \"province\": \"120000\",\n" +
                "        \"city\": \"120100\",\n" +
                "        \"area\": \"120111\",\n" +
                "        \"browse\": \"537\",\n" +
                "        \"createtime\": \"2022-01-08 16:03:06\",\n" +
                "        \"imageurl\": \"-1\",\n" +
                "        \"spareContactMan\": \"\",\n" +
                "        \"campgroundTypes\": [\n" +
                "            {\n" +
                "                \"id\": 15,\n" +
                "                \"typeName\": \"水\",\n" +
                "                \"icon\": \"icon-humidity\",\n" +
                "                \"color\": \"blue\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 9,\n" +
                "                \"typeName\": \"维修\",\n" +
                "                \"icon\": \"weixiu\",\n" +
                "                \"color\": \"purple\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"3934bd85a5a618bf02de3199269ead2b\",\n" +
                "        \"campname\": \"天津天勤房车维修改装厂\",\n" +
                "        \"phone\": \"13920350825\",\n" +
                "        \"address\": \"天津市武清区定福庄\",\n" +
                "        \"latitude\": \"39.473304\",\n" +
                "        \"longitude\": \"117.028703\",\n" +
                "        \"intro\": \"\",\n" +
                "        \"photos\": \"https://touringcar.oss-cn-beijing.aliyuncs.com/carousel/20211204103704084580900.jpg?Expires=2006696669&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=x1Zp6qKgeReB5hQUIkH9pqwbsGg%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/carousel/20211204103704238144399.jpg?Expires=2006696669&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=WRakI80I%2FggyKuqxcmCQnOXIqo0%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/carousel/20211204103704340487162.jpg?Expires=2006696669&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=gNGrPw9wVx1TBvHnXc79XKmoOjE%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/carousel/20211204103704433578706.jpg?Expires=2006696669&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=qLzcswwWg4cjWJHX62VHdtILcR8%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/carousel/20211204103704531999923.jpg?Expires=2006696669&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=HzntQfPvP4ETvPOEGcRv%2BIljS4E%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/carousel/20211204103704634208040.jpg?Expires=2006696669&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=FjOFHgpozCD%2FBrm8z2phPFPOotA%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10\",\n" +
                "        \"province\": \"120000\",\n" +
                "        \"city\": \"120100\",\n" +
                "        \"area\": \"120114\",\n" +
                "        \"browse\": \"715\",\n" +
                "        \"createtime\": \"2023-04-28 15:32:57\",\n" +
                "        \"imageurl\": \"-1\",\n" +
                "        \"spareContactMan\": \"王振斌 \",\n" +
                "        \"campgroundTypes\": [\n" +
                "            {\n" +
                "                \"id\": 8,\n" +
                "                \"typeName\": \"免费\",\n" +
                "                \"icon\": \"mianfei\",\n" +
                "                \"color\": \"pink\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 9,\n" +
                "                \"typeName\": \"维修\",\n" +
                "                \"icon\": \"weixiu\",\n" +
                "                \"color\": \"purple\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"02b634bdcec9dca3f483ed6979205150\",\n" +
                "        \"campname\": \"天津市滨海新区港佳道停车点\",\n" +
                "        \"phone\": \"\",\n" +
                "        \"address\": \"天津市滨海新区\",\n" +
                "        \"latitude\": \"38.722649\",\n" +
                "        \"longitude\": \"117.485390\",\n" +
                "        \"intro\": \"免费停车场，有水有公厕，环境不错；卫生间非常干净、24小时开放，可以用桶提水。有收费快慢充电桩。\",\n" +
                "        \"photos\": \"https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230503122610068707649.jpg?Expires=2006696664&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=l40sY9HCS%2Fsf26xt6aq8ZsNkTiU%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230503122618645201732.jpg?Expires=2006696664&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=jZE1%2FkwOWZtDmkAzieBAqlBt70g%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10\",\n" +
                "        \"province\": \"120000\",\n" +
                "        \"city\": \"120100\",\n" +
                "        \"area\": \"120105\",\n" +
                "        \"browse\": \"302\",\n" +
                "        \"createtime\": \"2023-09-04 22:39:51\",\n" +
                "        \"imageurl\": \"-1\",\n" +
                "        \"spareContactMan\": \"\",\n" +
                "        \"campgroundTypes\": [\n" +
                "            {\n" +
                "                \"id\": 11,\n" +
                "                \"typeName\": \"推荐\",\n" +
                "                \"icon\": \"tuijian\",\n" +
                "                \"color\": \"yellow\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 8,\n" +
                "                \"typeName\": \"免费\",\n" +
                "                \"icon\": \"mianfei\",\n" +
                "                \"color\": \"pink\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 16,\n" +
                "                \"typeName\": \"电\",\n" +
                "                \"icon\": \"nengliangzhi\",\n" +
                "                \"color\": \"blue\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 14,\n" +
                "                \"typeName\": \"卫\",\n" +
                "                \"icon\": \"weishengjian\",\n" +
                "                \"color\": \"orange\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 15,\n" +
                "                \"typeName\": \"水\",\n" +
                "                \"icon\": \"icon-humidity\",\n" +
                "                \"color\": \"blue\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 2,\n" +
                "                \"typeName\": \"拖挂\",\n" +
                "                \"icon\": \"tuoguafangche\",\n" +
                "                \"color\": \"red\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 23,\n" +
                "                \"typeName\": \"做饭\",\n" +
                "                \"icon\": \"kezuofan-\",\n" +
                "                \"color\": \"green\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 10,\n" +
                "                \"typeName\": \"停车点\",\n" +
                "                \"icon\": \"map-stopping\",\n" +
                "                \"color\": \"pink\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"fae90d328356125e62f5fe8e652f5cea\",\n" +
                "        \"campname\": \"天津市临港海岸线东停车场\",\n" +
                "        \"phone\": \"\",\n" +
                "        \"address\": \"天津市滨海新区黄浦江道与珠江二街交口\",\n" +
                "        \"latitude\": \"38.894477\",\n" +
                "        \"longitude\": \"117.710986\",\n" +
                "        \"intro\": \"有多个停车场，停车免费，有厕所，能赶海，能海钓，不能搭帐篷，带娃玩，过夜。目前阶段卫生间晚上6电后就停水关门了\",\n" +
                "        \"photos\": \"https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230605083709945111493.jpg?Expires=2006696682&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=CaKIBZ2wyQbeJll5aI6pbH4TjdU%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230605083737499537550.jpg?Expires=2006696682&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=ETWwVl%2BFo33I4iAdV%2Buhk9Lx5LE%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230605083759244305614.jpg?Expires=2006696682&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=4GhjYgWB1R4OocXIynjy0mUHHLU%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230605083818406694429.jpg?Expires=2006696682&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=v81GzcyujgcVCEWkWXsFr2s6fr4%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10\",\n" +
                "        \"province\": \"120000\",\n" +
                "        \"city\": \"120100\",\n" +
                "        \"area\": \"120116\",\n" +
                "        \"browse\": \"282\",\n" +
                "        \"createtime\": \"2023-07-04 22:30:13\",\n" +
                "        \"imageurl\": \"-1\",\n" +
                "        \"spareContactMan\": \"\",\n" +
                "        \"campgroundTypes\": [\n" +
                "            {\n" +
                "                \"id\": 8,\n" +
                "                \"typeName\": \"免费\",\n" +
                "                \"icon\": \"mianfei\",\n" +
                "                \"color\": \"pink\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 14,\n" +
                "                \"typeName\": \"卫\",\n" +
                "                \"icon\": \"weishengjian\",\n" +
                "                \"color\": \"orange\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 2,\n" +
                "                \"typeName\": \"拖挂\",\n" +
                "                \"icon\": \"tuoguafangche\",\n" +
                "                \"color\": \"red\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 23,\n" +
                "                \"typeName\": \"做饭\",\n" +
                "                \"icon\": \"kezuofan-\",\n" +
                "                \"color\": \"green\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 21,\n" +
                "                \"typeName\": \"钓鱼\",\n" +
                "                \"icon\": \"diaoyu\",\n" +
                "                \"color\": \"purple\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 10,\n" +
                "                \"typeName\": \"停车点\",\n" +
                "                \"icon\": \"map-stopping\",\n" +
                "                \"color\": \"pink\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"5b3cdc2dea571828b6014802cc82f804\",\n" +
                "        \"campname\": \"天津市滨海新区东疆港停车点\",\n" +
                "        \"phone\": \"\",\n" +
                "        \"address\": \"天津市滨海新区东疆保税港区观澜路以东贺兰道以北\",\n" +
                "        \"latitude\": \"39.014251\",\n" +
                "        \"longitude\": \"117.827399\",\n" +
                "        \"intro\": \"免费停车，卫生间较远，外面有赶海洗漱 冲鞋的水嘴可加水，无电\",\n" +
                "        \"photos\": \"https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230518165152511969526.jpg?Expires=2006696671&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=7AHFgrFsgnAu20rWiXy%2B4LGsUlM%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230518165152609325680.jpg?Expires=2006696671&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=8aZ%2BUbOc%2FCEYNuQZdMvTVNe8mMA%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230518165152721629652.jpg?Expires=2006696671&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=rwkuNVbrQ94nY0mxfouSunAm214%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230518165152836374631.jpg?Expires=2006696671&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=hPM5pDaV13wG5xOMLzJrH6CV5ek%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10\",\n" +
                "        \"province\": \"120000\",\n" +
                "        \"city\": \"120100\",\n" +
                "        \"area\": \"120116\",\n" +
                "        \"browse\": \"275\",\n" +
                "        \"createtime\": \"2023-05-18 23:41:09\",\n" +
                "        \"imageurl\": \"-1\",\n" +
                "        \"spareContactMan\": \"\",\n" +
                "        \"campgroundTypes\": [\n" +
                "            {\n" +
                "                \"id\": 8,\n" +
                "                \"typeName\": \"免费\",\n" +
                "                \"icon\": \"mianfei\",\n" +
                "                \"color\": \"pink\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 14,\n" +
                "                \"typeName\": \"卫\",\n" +
                "                \"icon\": \"weishengjian\",\n" +
                "                \"color\": \"orange\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 15,\n" +
                "                \"typeName\": \"水\",\n" +
                "                \"icon\": \"icon-humidity\",\n" +
                "                \"color\": \"blue\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 10,\n" +
                "                \"typeName\": \"停车点\",\n" +
                "                \"icon\": \"map-stopping\",\n" +
                "                \"color\": \"pink\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"2bcd135edf1584c478b00747d0f86f42\",\n" +
                "        \"campname\": \"天津滨海新区生态城东堤公园\",\n" +
                "        \"phone\": \"\",\n" +
                "        \"address\": \"天津市滨海新区东堤路东堤公园\",\n" +
                "        \"latitude\": \"39.091366\",\n" +
                "        \"longitude\": \"117.837722\",\n" +
                "        \"intro\": \"免费，停房车选砂石子场地可支帐篷做饭，边上有厕所，吹海风，安静，有儿童城堡和砂地，周边有个妈祖庙。\",\n" +
                "        \"photos\": \"https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230424203130645176333.png?Expires=2006696668&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=DsSAPWrqbCLSzHaavXdA9TCmb4M%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10\",\n" +
                "        \"province\": \"120000\",\n" +
                "        \"city\": \"120100\",\n" +
                "        \"area\": \"120116\",\n" +
                "        \"browse\": \"566\",\n" +
                "        \"createtime\": \"2023-05-25 20:29:31\",\n" +
                "        \"imageurl\": \"-1\",\n" +
                "        \"spareContactMan\": \"\",\n" +
                "        \"campgroundTypes\": [\n" +
                "            {\n" +
                "                \"id\": 8,\n" +
                "                \"typeName\": \"免费\",\n" +
                "                \"icon\": \"mianfei\",\n" +
                "                \"color\": \"pink\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 14,\n" +
                "                \"typeName\": \"卫\",\n" +
                "                \"icon\": \"weishengjian\",\n" +
                "                \"color\": \"orange\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 10,\n" +
                "                \"typeName\": \"停车点\",\n" +
                "                \"icon\": \"map-stopping\",\n" +
                "                \"color\": \"pink\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"ff63b4cea8d5eceac52c2a1eddb75b0e\",\n" +
                "        \"campname\": \"天津滨海新区科技馆停车点\",\n" +
                "        \"phone\": \"\",\n" +
                "        \"address\": \"天津市滨海新区洞庭路与解放路交叉口东南角\",\n" +
                "        \"latitude\": \"39.015434\",\n" +
                "        \"longitude\": \"117.683400\",\n" +
                "        \"intro\": \"停车场大，而且免费，卫生间在馆内很干净，购物有万达广场。好窝\",\n" +
                "        \"photos\": \"https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230505115905477256905.jpg?Expires=2006696682&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=OjBHuVd0RwooNYZJHsqw6LbxCCE%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10\",\n" +
                "        \"province\": \"120000\",\n" +
                "        \"city\": \"120100\",\n" +
                "        \"area\": \"120116\",\n" +
                "        \"browse\": \"293\",\n" +
                "        \"createtime\": \"2023-05-05 23:35:12\",\n" +
                "        \"imageurl\": \"-1\",\n" +
                "        \"spareContactMan\": \"\",\n" +
                "        \"campgroundTypes\": [\n" +
                "            {\n" +
                "                \"id\": 8,\n" +
                "                \"typeName\": \"免费\",\n" +
                "                \"icon\": \"mianfei\",\n" +
                "                \"color\": \"pink\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 14,\n" +
                "                \"typeName\": \"卫\",\n" +
                "                \"icon\": \"weishengjian\",\n" +
                "                \"color\": \"orange\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 2,\n" +
                "                \"typeName\": \"拖挂\",\n" +
                "                \"icon\": \"tuoguafangche\",\n" +
                "                \"color\": \"red\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 18,\n" +
                "                \"typeName\": \"餐饮\",\n" +
                "                \"icon\": \"canyin\",\n" +
                "                \"color\": \"red\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 10,\n" +
                "                \"typeName\": \"停车点\",\n" +
                "                \"icon\": \"map-stopping\",\n" +
                "                \"color\": \"pink\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"c2872c02bf8dc9228d92145f5180a76e\",\n" +
                "        \"campname\": \"天津海洋公园停车场\",\n" +
                "        \"phone\": \"\",\n" +
                "        \"address\": \"天津市滨海新区海轩道377号\",\n" +
                "        \"latitude\": \"39.107196\",\n" +
                "        \"longitude\": \"117.793542\",\n" +
                "        \"intro\": \"每天封顶12元，停车场很大，干净，收费合理，卫生间干净。\",\n" +
                "        \"photos\": \"https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230531162505696576995.jpg?Expires=2006696678&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=85WiPnkJTZpeUBkbdEUb8uhgtcw%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230531162507676147610.jpg?Expires=2006696678&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=1Ykr%2BTTiPtOQYF2WrDiGJVF5ayw%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230531162510626562069.jpg?Expires=2006696678&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=qBY%2Fg8YI8R2ndxPeWMf5YWzhD7Q%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230531162512609391289.jpg?Expires=2006696678&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=SchT9CEl7XOobw4PDGar0%2FCfxBI%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230531162515580375419.jpg?Expires=2006696678&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=0vLrax%2BLMLM1qVBrIHzuEhvjg6Y%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10\",\n" +
                "        \"province\": \"120000\",\n" +
                "        \"city\": \"120100\",\n" +
                "        \"area\": \"120116\",\n" +
                "        \"browse\": \"196\",\n" +
                "        \"createtime\": \"2023-05-31 23:17:58\",\n" +
                "        \"imageurl\": \"-1\",\n" +
                "        \"spareContactMan\": \"\",\n" +
                "        \"campgroundTypes\": [\n" +
                "            {\n" +
                "                \"id\": 14,\n" +
                "                \"typeName\": \"卫\",\n" +
                "                \"icon\": \"weishengjian\",\n" +
                "                \"color\": \"orange\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 15,\n" +
                "                \"typeName\": \"水\",\n" +
                "                \"icon\": \"icon-humidity\",\n" +
                "                \"color\": \"blue\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 12,\n" +
                "                \"typeName\": \"住宿\",\n" +
                "                \"icon\": \"zhusu\",\n" +
                "                \"color\": \"purple\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 10,\n" +
                "                \"typeName\": \"停车点\",\n" +
                "                \"icon\": \"map-stopping\",\n" +
                "                \"color\": \"pink\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"a2dd8bbb179d50b26bd1384e8897924f\",\n" +
                "        \"campname\": \"天津市滨海新区绿岛公园停车点\",\n" +
                "        \"phone\": \"\",\n" +
                "        \"address\": \"天津市滨海新区福州道绿岛公园\",\n" +
                "        \"latitude\": \"39.043184\",\n" +
                "        \"longitude\": \"117.662892\",\n" +
                "        \"intro\": \"-1\",\n" +
                "        \"photos\": \"https://touringcar.oss-cn-beijing.aliyuncs.com/carousel/20211130155906899182740.jpg?Expires=2006696676&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=D8BDChIQnK27aLeg5%2Fe5nz63uvI%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/carousel/20211130155907029179854.jpg?Expires=2006696676&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=htvgWMfPE1odzuqrXgxd6LQbvrU%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/carousel/20211130155907138503391.jpg?Expires=2006696676&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=9J119IphGXOxcfk7mavB9Oz6%2FPU%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/carousel/20211130155907266510155.jpg?Expires=2006696676&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=izLEiyeiaQ3b9qkpgQgxiVYZmBA%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/carousel/20211130155907636918023.jpg?Expires=2006696676&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=JkpWMGMzXmLLsF%2F1lZvK%2Fk8Tmq4%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10\",\n" +
                "        \"province\": \"120000\",\n" +
                "        \"city\": \"120100\",\n" +
                "        \"area\": \"120116\",\n" +
                "        \"browse\": \"630\",\n" +
                "        \"createtime\": \"2023-05-27 21:23:50\",\n" +
                "        \"imageurl\": \"-1\",\n" +
                "        \"spareContactMan\": \"\",\n" +
                "        \"campgroundTypes\": [\n" +
                "            {\n" +
                "                \"id\": 8,\n" +
                "                \"typeName\": \"免费\",\n" +
                "                \"icon\": \"mianfei\",\n" +
                "                \"color\": \"pink\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 10,\n" +
                "                \"typeName\": \"停车点\",\n" +
                "                \"icon\": \"map-stopping\",\n" +
                "                \"color\": \"pink\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"4686ea4a87024cc85b4b103438512caa\",\n" +
                "        \"campname\": \"天津市滨海新区南堤公园一号停车场\",\n" +
                "        \"phone\": \"\",\n" +
                "        \"address\": \"天津市滨海新区的滨海新区,在生态旅游区的南面\",\n" +
                "        \"latitude\": \"39.096303\",\n" +
                "        \"longitude\": \"117.750339\",\n" +
                "        \"intro\": \"本停车场卫生环境好，车位多，卫生间里有电，卫生纸，洗手液，全部都有。周边旅游，早市近在咫尺。1号-2号-3号停车场，都是免费的，有公厕24小时开放内有空调，园里可搭帐篷，有儿童乐园，散步。\",\n" +
                "        \"photos\": \"https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230328065003806527266.jpg?Expires=2006696670&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=7zvctQBxURFZVFNKTc%2FQAMTFRvA%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230328065018604968292.jpg?Expires=2006696670&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=oFQWus0qpJLqTd%2BJbL6RPXJCqnw%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10,https://touringcar.oss-cn-beijing.aliyuncs.com/photos/20230328065036728697057.jpg?Expires=2006696670&OSSAccessKeyId=LTAI5tRyb7trPT5gZ7w6Mq3x&Signature=xiBTEXvCWM9P2Tpq5poEHthOenA%3D&x-oss-process=image%2Fauto-orient%2C1%2Fresize%2Cm_lfit%2Cw_768%2Fquality%2Cq_90%2Fwatermark%2Cimage_c2h1aXlpbi5wbmc_eC1vc3MtcHJvY2Vzcz1pbWFnZS9yZXNpemUsUF8yMA%2Cg_se%2Ct_80%2Cx_10%2Cy_10\",\n" +
                "        \"province\": \"120000\",\n" +
                "        \"city\": \"120100\",\n" +
                "        \"area\": \"120116\",\n" +
                "        \"browse\": \"551\",\n" +
                "        \"createtime\": \"2023-06-25 15:47:37\",\n" +
                "        \"imageurl\": \"-1\",\n" +
                "        \"spareContactMan\": \"\",\n" +
                "        \"campgroundTypes\": [\n" +
                "            {\n" +
                "                \"id\": 8,\n" +
                "                \"typeName\": \"免费\",\n" +
                "                \"icon\": \"mianfei\",\n" +
                "                \"color\": \"pink\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 16,\n" +
                "                \"typeName\": \"电\",\n" +
                "                \"icon\": \"nengliangzhi\",\n" +
                "                \"color\": \"blue\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 14,\n" +
                "                \"typeName\": \"卫\",\n" +
                "                \"icon\": \"weishengjian\",\n" +
                "                \"color\": \"orange\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 15,\n" +
                "                \"typeName\": \"水\",\n" +
                "                \"icon\": \"icon-humidity\",\n" +
                "                \"color\": \"blue\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 2,\n" +
                "                \"typeName\": \"拖挂\",\n" +
                "                \"icon\": \"tuoguafangche\",\n" +
                "                \"color\": \"red\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 10,\n" +
                "                \"typeName\": \"停车点\",\n" +
                "                \"icon\": \"map-stopping\",\n" +
                "                \"color\": \"pink\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "]";
    }

    @Autowired
    private RecordsService recordsService;

    @GetMapping("/tabListByCity")
    public Object tabListByCity(
            @RequestParam(value = "typeId",defaultValue = "")Integer typeId,
            @RequestParam(value = "province",defaultValue = "")Integer province,
            @RequestParam(value = "city",defaultValue = "")Integer city,
            @RequestParam(value = "longitude",defaultValue = "")Integer longitude,
            @RequestParam(value = "latitude",defaultValue = "")Integer latitude,
            @RequestParam(value = "page",defaultValue = "0")Integer page,
            @RequestParam(value = "limit",defaultValue = "5")Integer limit
    ){

        if (page==0){
            return "参数请求错误";
        }

        return recordsService.listByCity(province,city,page,limit);


    }



}
