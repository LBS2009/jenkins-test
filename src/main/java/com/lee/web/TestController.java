package com.lee.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * desc:
 *
 * @author libosheng
 * @version v1.0
 * @date 2019-05-17
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test success";
    }
}
