package com.kms.www.controller;

import com.kms.www.service.KmsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class KmsController {

  private final KmsService service;

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("rows", service.getList());
    return "index";
  }

}
