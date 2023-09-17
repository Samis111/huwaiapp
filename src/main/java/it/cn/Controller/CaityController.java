package it.cn.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("api/huwai")
public class CaityController {



    @GetMapping("/Cait")
    public Object CaityAll(){
        return "[\n" +
                "        {\n" +
                "            \"count\": 335,\n" +
                "            \"province\": \"370000\",\n" +
                "            \"key\": \"山东\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 42,\n" +
                "            \"province\": \"120000\",\n" +
                "            \"key\": \"天津\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 261,\n" +
                "            \"province\": \"320000\",\n" +
                "            \"key\": \"江苏\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 62,\n" +
                "            \"province\": \"110000\",\n" +
                "            \"key\": \"北京\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 28,\n" +
                "            \"province\": \"310000\",\n" +
                "            \"key\": \"上海\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 210,\n" +
                "            \"province\": \"340000\",\n" +
                "            \"key\": \"安徽\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 182,\n" +
                "            \"province\": \"130000\",\n" +
                "            \"key\": \"河北\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 112,\n" +
                "            \"province\": \"410000\",\n" +
                "            \"key\": \"河南\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 281,\n" +
                "            \"province\": \"330000\",\n" +
                "            \"key\": \"浙江\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 202,\n" +
                "            \"province\": \"210000\",\n" +
                "            \"key\": \"辽宁\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 129,\n" +
                "            \"province\": \"140000\",\n" +
                "            \"key\": \"山西\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 178,\n" +
                "            \"province\": \"420000\",\n" +
                "            \"key\": \"湖北\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 298,\n" +
                "            \"province\": \"150000\",\n" +
                "            \"key\": \"内蒙古\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 187,\n" +
                "            \"province\": \"360000\",\n" +
                "            \"key\": \"江西\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 127,\n" +
                "            \"province\": \"220000\",\n" +
                "            \"key\": \"吉林\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 194,\n" +
                "            \"province\": \"610000\",\n" +
                "            \"key\": \"陕西\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 236,\n" +
                "            \"province\": \"350000\",\n" +
                "            \"key\": \"福建\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 144,\n" +
                "            \"province\": \"430000\",\n" +
                "            \"key\": \"湖南\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 203,\n" +
                "            \"province\": \"230000\",\n" +
                "            \"key\": \"黑龙江\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 36,\n" +
                "            \"province\": \"710000\",\n" +
                "            \"key\": \"台湾\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 43,\n" +
                "            \"province\": \"640000\",\n" +
                "            \"key\": \"宁夏\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 161,\n" +
                "            \"province\": \"620000\",\n" +
                "            \"key\": \"甘肃\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 101,\n" +
                "            \"province\": \"500000\",\n" +
                "            \"key\": \"重庆\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 471,\n" +
                "            \"province\": \"440000\",\n" +
                "            \"key\": \"广东\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 492,\n" +
                "            \"province\": \"510000\",\n" +
                "            \"key\": \"四川\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 80,\n" +
                "            \"province\": \"630000\",\n" +
                "            \"key\": \"青海\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 325,\n" +
                "            \"province\": \"520000\",\n" +
                "            \"key\": \"贵州\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 1,\n" +
                "            \"province\": \"820000\",\n" +
                "            \"key\": \"澳门\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 298,\n" +
                "            \"province\": \"450000\",\n" +
                "            \"key\": \"广西\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 265,\n" +
                "            \"province\": \"460000\",\n" +
                "            \"key\": \"海南\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 616,\n" +
                "            \"province\": \"530000\",\n" +
                "            \"key\": \"云南\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 224,\n" +
                "            \"province\": \"540000\",\n" +
                "            \"key\": \"西藏\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"count\": 436,\n" +
                "            \"province\": \"650000\",\n" +
                "            \"key\": \"新疆\"\n" +
                "        }\n" +
                "    ]";
    }


}
