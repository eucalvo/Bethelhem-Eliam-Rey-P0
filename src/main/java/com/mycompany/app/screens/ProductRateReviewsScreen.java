package com.mycompany.app.screens;

import java.util.Scanner;

import com.mycompany.app.models.Product;
import com.mycompany.app.services.ReviewService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductRateReviewsScreen implements IScreen {
    private final ReviewService reviewService;
    @Override
    public void start(Scanner scan) {
        System.out.println("Ratings and Reviews");
        System.out.println("[1] Write a Review and give Rating");
        System.out.println("[2] go back");
        scan.nextLine();
    }

    public void showProductRating(Product product) {
        product.getRating();
    }

    public void showProductReviews(Product product) {
        reviewService.getAllReviewsSameId(product.getProduct_id());
    }
    
}
