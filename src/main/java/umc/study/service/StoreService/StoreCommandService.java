package umc.study.service.StoreService;

import umc.study.domain.Review;
import umc.study.web.dto.request.StoreRequestDTO;

public interface StoreCommandService {

    Review createReview(Long memberId, Long storeId, StoreRequestDTO.ReveiwDTO request);
}