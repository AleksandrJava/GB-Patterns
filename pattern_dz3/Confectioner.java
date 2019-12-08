package ru.geekbrains.pattern.lesson3.pattern_dz3;

public class Confectioner {
    private CakeBuilder cakeBuilder;

    public void setCakeBuilder(CakeBuilder cakeBuilder) {
        this.cakeBuilder = cakeBuilder;
    }

    public Cake getCake() {
        return cakeBuilder.getCake();
    }

    public void constructCake() {
        cakeBuilder.createNewCake()
                .buildCakeBase()
                .buildBiscuit()
                .buildCherry()
                .buildChocolateChips()
                .buildMeringues()
                .buildWhippedCream();
    }
}
