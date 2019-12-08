package ru.geekbrains.pattern.lesson3.pattern_dz3;

public abstract class CakeBuilder {
    protected Cake cake;

    public Cake getCake() {
        return cake;
    }

    public CakeBuilder createNewCake() {
        cake = new Cake();
        return this;
    }

    public abstract CakeBuilder buildCakeBase();
    public abstract CakeBuilder buildCherry();
    public abstract CakeBuilder buildChocolateChips();
    public abstract CakeBuilder buildBiscuit();
    public abstract CakeBuilder buildMeringues();
    public abstract CakeBuilder buildWhippedCream();
}
