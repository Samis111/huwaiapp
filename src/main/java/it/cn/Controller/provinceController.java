package it.cn.Controller;

import it.cn.service.CityService;
import it.cn.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/huwai")
public class provinceController {


    @Autowired
    private ProvinceService provinceService;

    @Autowired
    private CityService cityService;

    @GetMapping("provinceFind/{findId}")
    public String provinceFind(@PathVariable("findId")String str){
      return   cityService.SelectProvincelistByProvinceName(str);

    }
}
