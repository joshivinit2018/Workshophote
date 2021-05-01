package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationService {

    private List<Hotel> hotelList = new ArrayList<>();

    public void addHotel (Hotel hotel){
        hotelList.add(hotel);
    }

    public List<Hotel> getHotels() {
        return hotelList;
    }
}
