package com.campusdual.classroom;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class TVRemote {

    int channel;
    int volume;
    boolean on;
    String color;

    public TVRemote() {
    }

    public TVRemote(String color) {
        this.color = color;
    }

    public TVRemote(int channel, int volume, boolean on, String color) {
        this.channel = channel;
        this.volume = volume;
        this.on = on;
        this.color = color;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void turnOn() {

        if (this.isOn() == FALSE) {
            this.setOn(TRUE);
        }
    }

    public void turnOff() {

        if (this.isOn() == TRUE) {
            this.setOn(FALSE);
        }
    }


    public void channelUp() {

        this.setChannel(this.getChannel() + 1);

    }

    public void channelDown() {

        if (this.getChannel() != 0) {
            this.setChannel(this.getChannel() - 1);
        }else{
            this.setChannel(0);
        }


    }

    public void volumeUp() {
        this.setVolume(this.getVolume() + 1);
    }

    public void volumeDown() {

        if (this.getVolume() != 0) {
            this.setVolume(this.getVolume() - 1);
        } else {
            this.setVolume(0);
        }
    }

}
