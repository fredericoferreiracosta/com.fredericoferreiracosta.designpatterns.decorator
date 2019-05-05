package com.fredericoferreiracosta.designpatterns.decorator;

/**
 * Condensed milk addon.
 */
public class CondensedMilk extends AddonDecorator {

    private static final double COST = 0.50;
    private Acai acai;

    public CondensedMilk(Acai acai) {
        this.acai = acai;
    }

    public double cost() {
        return acai.cost() + COST;
    }
}
