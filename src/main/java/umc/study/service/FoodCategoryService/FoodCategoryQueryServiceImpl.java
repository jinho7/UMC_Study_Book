package umc.study.service.FoodCategoryService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.study.repository.FoodCategoryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodCategoryQueryServiceImpl implements FoodCategoryQeuryService{

    private final FoodCategoryRepository foodCategoryRepository;

    @Override
    public boolean checkCategoriesExist(List<Long> categoryIds) {
        return categoryIds.stream()
                .allMatch(categoryId -> foodCategoryRepository.existsById(categoryId));
    }
}