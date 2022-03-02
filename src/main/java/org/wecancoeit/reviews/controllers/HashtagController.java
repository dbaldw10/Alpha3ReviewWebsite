package org.wecancoeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancoeit.reviews.entities.Console;
import org.wecancoeit.reviews.entities.Hashtag;
import org.wecancoeit.reviews.entities.Review;
import org.wecancoeit.reviews.repos.ConsoleRepository;
import org.wecancoeit.reviews.repos.HashtagRepository;
import org.wecancoeit.reviews.repos.ReviewRepository;

import java.util.Optional;

@Controller
public class HashtagController {
    private ConsoleRepository consoleRepo;
    private ReviewRepository reviewRepo;
    private HashtagRepository hashtagRepo;

    public HashtagController(ConsoleRepository consoleRepo, ReviewRepository reviewRepo, HashtagRepository hashtagRepo) {
        this.consoleRepo = consoleRepo;
        this.reviewRepo = reviewRepo;
        this.hashtagRepo = hashtagRepo;
    }

    @GetMapping("/hashtags")
    public String showHashtagsTemplate(Model model) {
        model.addAttribute("hashtags", hashtagRepo.findAll());
        model.addAttribute("filterName", "All Hashtags");
        return "HashtagsTemplate";
    }

    @GetMapping("/hashtag/{id}")
    public String showHashtagTemplate(Model model, @PathVariable long id) {
        Optional<Hashtag> tempHashtag = hashtagRepo.findById(id);
        if (tempHashtag.isPresent()) {
            model.addAttribute("consoles", tempHashtag.get().getConsoles());
            model.addAttribute("filterName", tempHashtag.get().hashtagbody);
            return "ConsolesTemplate";
        }


        return null;
    }
}
