package com.share.shareservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 易洪建
 * @since 2020/1/21 13:45
 */
@RestController
@RequestMapping("/index")
public class IndexController {

  @GetMapping
  public ModelAndView index(ModelAndView view) {
    view.setViewName("index");
    return view;
  }

  @GetMapping("/register")
  public ModelAndView signIn(ModelAndView view) {
    view.setViewName("sign-in");
    return view;
  }
}
