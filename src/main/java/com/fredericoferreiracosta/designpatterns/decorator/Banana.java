package com.fredericoferreiracosta.designpatterns.decorator;

/**
 * Addon banana.
 */
public class Banana extends AddonDecorator {

    private static final double COST = 1.00;
    private Acai acai;

    public Banana(Acai acai) {
        this.acai = acai;
    }

    public double cost() {
        return acai.cost() + COST;
    }
}
