package com.bridgelabz;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class HotelReservationService {

    List<Hotel> hotelList = new ArrayList<>();

    public void addHotel (Hotel hotel){
        hotelList.add(hotel);
    }

    public List<Hotel> getHotels() {
        return hotelList;
    }
    public int countDays(String firstDate,String lastDate) {
        LocalDate startDate = LocalDate.parse(firstDate);
        LocalDate endDate = LocalDate.parse(lastDate);
        return (int) ChronoUnit.DAYS.between(startDate,endDate);
    }

    public Hotel findCheapestHotel() {
    Hotel cheapestRate = hotelList.stream().min(Comparator.comparing(Hotel::getWeekdayrate)).orElseThrow(NoSuchElementException::new);
    System.out.println(cheapestRate);
    return cheapestRate;
    }
}
