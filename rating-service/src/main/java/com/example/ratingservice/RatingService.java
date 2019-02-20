package com.example.ratingservice;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RatingService {
    private List<Rating> ratingList = Arrays.asList(
            new Rating(1L, 1L, 2),
            new Rating(2L, 1L, 3),
            new Rating(3L, 2L, 4),
            new Rating(4L, 2L, 5)
    );

    public List<Rating> findRatingsByBookId(Long bookId) {
        return bookId == null || bookId.equals(0L) ?
                Collections.emptyList() : ratingList.stream().filter(r -> r.getBookId().equals(bookId)).collect(Collectors.toList());
    }

    public List<Rating> findAllRatings() {
        return ratingList;
    }


}
