package ru.geekbrains.pattern.lesson3.pattern_dz3;

public class ChocolateCakeBuilder extends CakeBuilder {

    @Override
    public CakeBuilder buildCakeBase() {
        cake.setCakeBase("chocolateBase");
        return this;
    }

    @Override
    public CakeBuilder buildCherry() {
        cake.setCherry(true);
        return this;
    }

    @Override
    public CakeBuilder buildChocolateChips() {
        cake.setChocolateChips(true);
        return this;
    }

    @Override
    public CakeBuilder buildBiscuit() {
        cake.setBiscuit(true);
        return this;
    }

    @Override
    public CakeBuilder buildMeringues() {
        cake.setMeringues(false);
        return this;
    }

    @Override
    public CakeBuilder buildWhippedCream() {
        cake.setWhippedCream(false);
        return this;
    }
}
