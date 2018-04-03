package pri.holysu.test.springcloudconfigautorefreshclientspecial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pri.holysu.test.springcloudconfigautorefreshclientspecial.Config;

@RestController
public class TestController {

    @Autowired
    private Config config;


    @GetMapping("/profile")
    public String getProfile(){
        return config.getProfile();
    }
}
