package org.wecancoeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.entities.Console;
import org.wecancoeit.reviews.entities.Hashtag;

import java.util.Collection;
import java.util.Optional;

public interface HashtagRepository extends CrudRepository<Hashtag,Long> {
    public Optional<Hashtag> findByHashtagbodyIgnoreCase(String hashtagbody);
}


