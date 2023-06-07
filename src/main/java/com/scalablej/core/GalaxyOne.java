package com.scalablej.core;

public class GalaxyOne extends JustAnotherTraitImpl {
    public void start(String engine){
        System.out.println("Starting Galaxy One with: "+engine);
        traitOps("Java");
    }
}
