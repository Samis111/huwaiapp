package it.cn.Controller;

import it.cn.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/huwai")
public class shuhangController {


    @Autowired
    private CityService cityService;

    @GetMapping("/CaitAll")
    public Object AllByOne(@RequestParam("id")String id){

     return    cityService.listByAll(id);
    }

}
