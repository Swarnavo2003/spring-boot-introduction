package com.projects.swarnavo.week1Introduction.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
    @Autowired
    ChocolateSyrup chocolateSyrup;
    @Autowired
    StraberryFrost straberryFrost;
    public void bakeCake() {
        System.out.println("Baking Cake with " + chocolateSyrup.getSyrupType() + " and " + straberryFrost.getFrostingType());
    }
}
