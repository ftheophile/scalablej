package com.scalablej.core;

public class Startup {
    public static void main(String[] args) {
        System.out.println("Hello Java Core");
        GalaxyOne galaxyOne = new GalaxyOne();
        galaxyOne.start("Java");

        Starship starship = new Starship();
        starship.start("Java");
    }
}
