package com.fredericoferreiracosta.designpatterns.decorator;

/**
 * Powdered milk addon.
 */
public class PowderedMilk extends AddonDecorator {

    private static final double COST = 0.50;
    private Acai acai;

    public PowderedMilk(Acai acai) {
        this.acai = acai;
    }

    public double cost() {
        return acai.cost() + COST;
    }
}
