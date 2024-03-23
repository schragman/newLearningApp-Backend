package net.schrage.backend.controller;

import net.schrage.backend.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("LearningApp")
public class ContentController {

  private final CategoryService categoryService;

  public ContentController(CategoryService categoryService) {
    this.categoryService = categoryService;
  }

  @GetMapping("/test")
  public String test() {
    return "Dies ist ein Test";
  }

  @GetMapping("/categories")
  public List<String> getCategories() {
    return categoryService.findAllCategories();
  }

}
