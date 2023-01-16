package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloCountroller {
  @GetMapping("/hello")
  public String getHello() {
    // helloに遷移
    return "hello";
  }
  @PostMapping("/hello")
  public String postReqest(@RequestParam("text1")String str,Model model) {
    //画面から受け取った文字列をmodelに登録
    model.addAttribute("sample",str);
    
    //response.htmlに遷移
    return "hello/response";
  }
}
