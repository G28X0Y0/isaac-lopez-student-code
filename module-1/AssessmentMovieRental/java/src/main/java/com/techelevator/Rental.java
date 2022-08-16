package com.techelevator;

public class Rental {
    private String title;
    private String format;
    private boolean isPremium;
    private double rentalPrice = 0;

    public Rental(String title, String format, boolean isPremium) {
        this.title = title;
        this.format = format;
        this.isPremium = isPremium;

        if(format.equals("VHS")){
            this.rentalPrice = .99;
        }else if (format.equals("DVD")){
            this.rentalPrice = 1.99;
        } else if(format.equals("BluRay")){
            this.rentalPrice = 2.99;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getFormat() {
        return format;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public double lateFeeCalculate(int daysLate){
        if(daysLate == 0){
            return rentalPrice;
        }
        else if(daysLate == 1){
            return rentalPrice + 1.99;
        }
        else if(daysLate == 2){
            return rentalPrice + 3.99;
        }
        else if(daysLate >= 3){
            return rentalPrice + 19.99;
        }
        return rentalPrice;

    }

    @Override
    public String toString(){
        String toString = "Movie - " + getTitle() + " - " + getFormat() + " " + getRentalPrice();
        return toString;


    }
}
