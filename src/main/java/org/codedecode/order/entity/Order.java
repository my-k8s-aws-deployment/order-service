package org.codedecode.order.entity;

import org.codedecode.order.dto.FoodItemsDTO;
import org.codedecode.order.dto.Restaurant;
import org.codedecode.order.dto.UserDTO;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("order")
public class Order {
    private Integer orderId;
    private List<FoodItemsDTO> foodItemsList;
    private Restaurant restaurant;
    private UserDTO userDTO;

    public Order() {
    }

    public Order(Integer id, List<FoodItemsDTO> foodItems, Restaurant restaurant, UserDTO userDTO) {
        this.orderId = id;
        this.foodItemsList = foodItems;
        this.restaurant = restaurant;
        this.userDTO = userDTO;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Integer getId() {
        return orderId;
    }

    public void setId(Integer id) {
        this.orderId = id;
    }

    public List<FoodItemsDTO> getFoodItems() {
        return foodItemsList;
    }

    public void setFoodItems(List<FoodItemsDTO> foodItems) {
        this.foodItemsList = foodItems;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }
}
