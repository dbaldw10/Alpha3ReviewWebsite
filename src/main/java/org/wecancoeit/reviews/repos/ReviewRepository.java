package org.wecancoeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.entities.Review;

public interface ReviewRepository extends CrudRepository<Review,Long> {
}


