package com.fredericoferreiracosta.designpatterns.decorator;

/**
 * Concrete implementation for {@link Acai}.
 */
public class AcaiImpl implements Acai {

    private static final double COST = 5.00;

    public double cost() {
        return COST;
    }
}
