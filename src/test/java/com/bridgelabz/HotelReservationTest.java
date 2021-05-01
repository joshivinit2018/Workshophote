package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationTest {
    static HotelReservationService hotelReservationService;
    @BeforeAll
    public static void initialize() {
        hotelReservationService = new HotelReservationService();
    }
    @BeforeAll
    public void shouldPrintWelcomeMessage() {
        hotelReservationService.printWelcomeMessage();
    }

    @Test
    public void givenDate_WeekDayshouldReturn_CheapestHotelNameBridgeWood() throws Exception {
        hotelReservationService.addHotelDetails();
        ArrayList<String> hotelNameList = hotelReservationService.calculateCheapestHotelAndRate("2020-09-14", "2020-09-16");
        Object[] hotelName = hotelNameList.toArray();
        Object[] arrayExpectedOutput = { "LakeWood" };
        Assertions.assertArrayEquals(arrayExpectedOutput, hotelName);
    }

 /* UC2 Cheapest Hotel with weekday weekend */
 @Test
 public void givenDateWeekend_shouldReturn_CheapestHotelNameBrideWood1() throws Exception {
     hotelReservationService.addHotelDetails();
     ArrayList<String> hotelNameList = hotelReservationService.calculateCheapestHotelAndRate("2020-09-12", "2020-09-13");
     Object[] hotelName = hotelNameList.toArray();
     Object[] arrayExpectedOutput = { "LakeWood", "BridgeWood" };
     Assertions.assertArrayEquals(arrayExpectedOutput, hotelName);
 }

 @Test
 public void givenDateWeekend_shouldReturn_CheapestHotelNameBridgeWood() throws Exception {
     ArrayList<String> hotelNameList = hotelReservationService.calculateCheapestHotelAndRate("2020-09-12", "2020-09-13");
     Object[] hotelName = hotelNameList.toArray();
     Object[] arrayExpectedOutput = { "BridgeWood" };
     Assertions.assertArrayEquals(arrayExpectedOutput, hotelName);
 }

 /* UC6 Minimum Cost with maximum Ratings on Weekday*/
 @Test
 public void givenDate_WeekDayshouldReturn_CheapestHotelNameLakeWood() throws Exception {
     String hotelName = hotelReservationService.findCheapestCostWithMaxRatings("2020-09-14", "2020-09-16");
     Assertions.assertEquals("LakeWood", hotelName);
 }

 /* UC6 Minimum Cost with maximum Ratings on Weekend days */
 @Test
 public void givenDateWeekend_shouldReturn_CheapestHotelNameBrideWood() throws Exception {
     String hotelName = hotelReservationService.findCheapestCostWithMaxRatings("2020-09-12", "2020-09-13");
     Assertions.assertEquals("BridgeWood", hotelName);
 }

 /* UC6 Minimum Cost with maximum Ratings on weekday adn weekend day*/
 @Test
 public void givenDateWeekDayWeekend_shouldReturn_CheapestHotelNameGivesBridgeWood() throws Exception {
     String hotelName = hotelReservationService.findCheapestCostWithMaxRatings("2020-09-11", "2020-09-12");
     Assertions.assertEquals("BridgeWood", hotelName);
 }


 /* UC7 Cost with maximum Ratings weekday*/
 @Test
 public void givenDate_WeekDayshouldReturn_CheapestHotelNameRidgeWood() throws Exception {
     String hotelName = hotelReservationService.calculateCheapestHotelAndRateByRating("2020-09-14", "2020-09-16");
     Assertions.assertEquals("RidgeWood", hotelName);
 }

 /* UC7 Cost with maximum Ratings weekend*/
 @Test
 public void givenDateWeekend_shouldReturn_CheapestHotelNameRidgeeWood() throws Exception {
     String hotelName = hotelReservationService.calculateCheapestHotelAndRateByRating("2020-09-12", "2020-09-13");
     Assertions.assertEquals("RidgeWood", hotelName);
 }

 /* UC7 Cost with maximum Ratings weekday weekend*/
 @Test
 public void givenDateWeekDayWeekend_shouldReturn_CheapestHotelNameGivenBridgeWood() throws Exception {
     String hotelName = hotelReservationService.calculateCheapestHotelAndRateByRating("2020-09-11", "2020-09-12");
     Assertions.assertEquals("RidgeWood", hotelName);
 }
}