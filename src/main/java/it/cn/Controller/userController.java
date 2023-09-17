package it.cn.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/huwai")
public class userController {



        @PostMapping("")
        public Object loginMessage(){
         return null;
        }


}
