package io;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        RestaurantDataSource dataSource = new RestaurantDataSource("restaurant.txt");

        List<Restaurant> restaurantList = dataSource.readData();

        for (Restaurant restaurant : restaurantList) {
            System.out.println(restaurant);
        }
    }
}
