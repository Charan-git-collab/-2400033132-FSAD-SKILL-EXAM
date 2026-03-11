package com.klef.fsad.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Restaurant;
import com.klef.fsad.exam.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController 
{
    @Autowired
    private RestaurantService restaurantService;

    // POST → Add Restaurant
    @PostMapping("/add")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant)
    {
        return restaurantService.addRestaurant(restaurant);
    }

    // GET → View Restaurants
    @GetMapping("/view")
    public List<Restaurant> viewRestaurants()
    {
        return restaurantService.getRestaurants();
    }
}
