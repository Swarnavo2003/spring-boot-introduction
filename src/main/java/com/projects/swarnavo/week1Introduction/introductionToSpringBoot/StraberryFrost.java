package com.projects.swarnavo.week1Introduction.introductionToSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class StraberryFrost implements Frosting{
    @Override
    public String getFrostingType() {
        return "Straberry Frosting";
    }
}
