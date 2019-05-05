package com.fredericoferreiracosta.designpatterns.decorator;

/**
 * Granola addon.
 */
public class Granola extends AddonDecorator {

    private static final double COST = 2.00;
    private Acai acai;

    public Granola(Acai acai) {
        this.acai = acai;
    }

    public double cost() {
        return acai.cost() + COST;
    }
}
