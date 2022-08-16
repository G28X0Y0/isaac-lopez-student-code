package com.techelevator;

public class Television {
    private boolean isOn = false;
    private int currentChannel = 3;
    private int currentVolume = 2;

    public void turnOn(){
            isOn = true;
            currentChannel = 3;
            currentVolume = 2;
    }
    public void turnOff(){
        if(isOn)
            isOn = false;
    }

    public void changeChannel(int newChannel){
        if(isOn && newChannel >= 3 && newChannel <= 18)
            currentChannel = newChannel;
    }

    public void channelUp() {
        if (isOn) {
            if (getCurrentChannel() >= 18) {
                currentChannel = 3;
            } else {
                currentChannel += 1;//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            }
        }
    }

     public void channelDown(){
         if (isOn) {
             if (getCurrentChannel() <= 3) {
                 currentChannel = 18;
             } else {
                 currentChannel -= 1;//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
             }
         }
     }

     public void raiseVolume(){
        if(isOn)
            currentVolume++;
     }
     public void lowerVolume(){
        if(isOn)
            if(currentVolume != 0)
                currentVolume--;
     }
    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
