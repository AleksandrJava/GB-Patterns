package ru.geekbrains.pattern.lesson3.pattern_dz3;

public class Cake {
    private String cakeBase = null;
    private boolean cherry = false;
    private boolean chocolateChips = false;
    private boolean biscuit = false;
    private boolean meringues = false;
    private boolean whippedCream = false;

    public void setCakeBase(String cakeBase) {
        this.cakeBase = cakeBase;
    }

    public void setCherry(boolean cherry) {
        this.cherry = cherry;
    }

    public void setChocolateChips(boolean chocolateChips) {
        this.chocolateChips = chocolateChips;
    }

    public void setBiscuit(boolean biscuit) {
        this.biscuit = biscuit;
    }

    public void setMeringues(boolean meringues) {
        this.meringues = meringues;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

}
