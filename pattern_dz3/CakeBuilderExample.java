package ru.geekbrains.pattern.lesson3.pattern_dz3;

public class CakeBuilderExample {
    public static void main(String[] args) {
        Confectioner confectioner = new Confectioner();
        CakeBuilder chocolateCakeBuilder = new ChocolateCakeBuilder();

        confectioner.setCakeBuilder(chocolateCakeBuilder);
        confectioner.constructCake();

        Cake cake = confectioner.getCake();
    }
}
