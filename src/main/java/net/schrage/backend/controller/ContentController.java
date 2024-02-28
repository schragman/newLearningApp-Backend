package net.schrage.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("LearningApp")
public class ContentController {

  @GetMapping("/test")
  public String test() {
    return "Dies ist ein Test";
  }
}
