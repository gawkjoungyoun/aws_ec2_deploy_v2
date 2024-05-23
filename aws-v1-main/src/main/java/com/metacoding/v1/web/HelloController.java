package com.metacoding.v1.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloController {


    @GetMapping("/aws/v1")
    public String hello(@RequestParam(defaultValue = "1") Integer number){
		String num = "";
        if(number == 1){ // info 로그
            log.info("/aws/v1 이 호출되었어요. info 로그 #####################################");
			num="number 값이 1로 요청했습니다";
        }else if(number == -1){ // error 로그
            log.error("/aws/v1 이 호출되었어요. error 로그 #####################################");
			num="number 값이 -1로 요청했습니다";
        }else if(number == 0){ // warn 로그
            log.warn("/aws/v1 이 호출되었어요. warn 로그 #####################################");
			num="내용은 알 수 없지만 화려한듯 보이는 내용";
        }
        
        return "<h1>"+num+" 수정됨</h1>";
    }
}
