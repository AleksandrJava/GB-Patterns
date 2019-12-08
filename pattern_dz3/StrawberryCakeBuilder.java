package ru.geekbrains.pattern.lesson3.pattern_dz3;

public class StrawberryCakeBuilder extends CakeBuilder{

    @Override
    public CakeBuilder buildCakeBase() {
        cake.setCakeBase("strawberryBase");
        return this;
    }

    @Override
    public CakeBuilder buildCherry() {
        cake.setCherry(false);
        return this;
    }

    @Override
    public CakeBuilder buildChocolateChips() {
        cake.setChocolateChips(false);
        return this;
    }

    @Override
    public CakeBuilder buildBiscuit() {
        cake.setBiscuit(false);
        return this;
    }

    @Override
    public CakeBuilder buildMeringues() {
        cake.setMeringues(true);
        return this;
    }

    @Override
    public CakeBuilder buildWhippedCream() {
        cake.setWhippedCream(true);
        return this;
    }
}
