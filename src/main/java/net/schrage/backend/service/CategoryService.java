package net.schrage.backend.service;

import lombok.extern.slf4j.Slf4j;
import net.schrage.backend.model.Category;
import net.schrage.backend.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class CategoryService {

  private final CategoryRepository categoryRepository;

  public CategoryService(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
  }

  public List<String> findAllCategories() {
    List<String> result = new ArrayList<>();
    Iterable<Category> categories = categoryRepository.findAll();

    categories.forEach(
        cat -> result.add(cat.getName())
    );

    return result;

  }

}
