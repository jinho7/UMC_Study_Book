package umc.study.service.StoreService;

import org.springframework.data.domain.Page;
import umc.study.domain.Review;
import umc.study.domain.Store;
import umc.study.web.dto.response.StoreResponseDTO;

import java.util.Optional;

public interface StoreQueryService {

    Optional<Store> findStore(Long id);

    StoreResponseDTO.ReviewPreViewListDTO getReviewList(Long StoreId, Integer page);
}