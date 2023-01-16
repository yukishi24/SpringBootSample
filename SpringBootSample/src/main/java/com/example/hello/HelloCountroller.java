package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloCountroller {
  @GetMapping("/hello")
  public String getHello() {
    // helloに遷移
    return "hello";
  }
}
