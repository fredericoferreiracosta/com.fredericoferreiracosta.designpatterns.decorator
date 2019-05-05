package com.fredericoferreiracosta.designpatterns.decorator;

public class Runner {
    public static void main(String[] args) {
        Acai acai = new Granola(new Banana(new PowderedMilk(new AcaiImpl())));
        System.out.println(acai.cost());
    }
}
