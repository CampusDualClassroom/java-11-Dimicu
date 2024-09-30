package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        redRemote.channelUp();
        redRemote.channelDown();
        redRemote.turnOff();
        redRemote.getColor();
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        redRemote.turnOn();
        System.out.println(redRemote.isOn());
        System.out.println(redRemote.getChannel());
        System.out.println(redRemote.getVolume());
        System.out.println(redRemote.isOn());

    }

}