package com.bridgelabz;
public class Hotel {
    private String name;
    private int weekdayrate;
    private int weekendrate;

    public String toString(){
        return "Hotel [name=" + name + ", weekdayrate=" + weekdayrate +", weekendrate=" + weekendrate + "]";
    }


    public String getName() {
        return name;
    }

    // Getter And Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public int getWeekdayrate() {
        return weekdayrate;
    }

    public void setWeekdayrate(int weekdayrate) {
        this.weekdayrate = weekdayrate;
    }

   public void setWeekendrate(int weekendrate) {
       this.weekendrate = weekendrate;
   }
   public Hotel(String name, int weekdayrate, int weekendrate){
        super();
        this.name = name;
        this.weekdayrate = weekdayrate;
        this.weekendrate = weekendrate;
    }
}