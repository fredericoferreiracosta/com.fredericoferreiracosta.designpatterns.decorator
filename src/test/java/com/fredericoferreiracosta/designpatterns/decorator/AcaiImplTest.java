package com.fredericoferreiracosta.designpatterns.decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for {@link AcaiImpl}.
 */
public class AcaiImplTest {

    private static final double EXPECTED_COST = 12.0;
    private AcaiImpl acai = new AcaiImpl();

    @Test
    public void shouldReturnCorrectCost() {
        Acai myAcai = new Granola(new Banana(new Strawberry(new CondensedMilk(new PowderedMilk(acai)))));
        assertEquals(myAcai.cost(), EXPECTED_COST, 0);
    }
}
