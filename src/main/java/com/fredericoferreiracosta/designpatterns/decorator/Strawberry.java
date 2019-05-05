package com.fredericoferreiracosta.designpatterns.decorator;

/**
 * Strawberry addon.
 */
public class Strawberry extends AddonDecorator {

    private static final double COST = 3.00;
    private Acai acai;

    public Strawberry(Acai acai) {
        this.acai = acai;
    }

    public double cost() {
        return acai.cost() + COST;
    }
}
