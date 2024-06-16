package umc.study.service.FoodCategoryService;

import java.util.List;

public interface FoodCategoryQeuryService {

    public boolean checkCategoriesExist(List<Long> categoryIds);
}
