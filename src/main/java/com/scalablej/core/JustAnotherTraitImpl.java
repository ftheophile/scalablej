package com.scalablej.core;

import com.scalablej.traits.JustAnotherTrait;

public class JustAnotherTraitImpl implements JustAnotherTrait {

    @Override
    public void traitOps(String opt){
        System.out.println("Trait Operations in: "+opt);
    }
}
