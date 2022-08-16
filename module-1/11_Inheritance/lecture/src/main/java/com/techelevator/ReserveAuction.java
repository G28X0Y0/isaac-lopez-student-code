package com.techelevator;


public class ReserveAuction extends Auction {
    private int reserve;

    public ReserveAuction(String itemForSale; int reserve){
        this.reserve = reserve;

    }

    public int getReserve(){
        return reserve;
    }
}
