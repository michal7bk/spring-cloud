package com.example.ratingservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    private RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping("")
    public List<Rating> findRatingsByBookId(@RequestParam Long bookId) {
        return ratingService.findRatingsByBookId(bookId);
    }

    @GetMapping("/all")
    public List<Rating> findAllRatings() {
        return ratingService.findAllRatings();
    }


}
