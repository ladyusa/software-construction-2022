package io;

import java.io.Serializable;

/**
 * Restaurant class stores information about restaurant.
 *
 * @author Usa Sammapun
 * @since 1.0
 */
public class Restaurant implements Serializable {

//    static final long serialVersionUID = 2956058570057296228L;

    private String name;
    private String type;
    private String address;
    private double rating;
    private int numSeats;

    /**
     * a maximum of seats is 100
     */
    public static final int MAX_SEAT = 100;

    /**
     * Constructor that takes all information about restaurant.
     *
     * @param name name of a restaurant
     * @param type
     * @param address
     * @param rating rating of a restaurant. It is a double between 0.0 - 5.0
     */
    public Restaurant(String name, String type, String address, double rating) {
        this.name = name;
        this.type = type;
        this.address = address;
        this.rating = rating;
    }

    /**
     * Return a number of seats
     *
     * @return a number of seats in the restaurant
     */
    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + ',' +
                type + ',' +
                address + ',' +
                rating;
    }
}
