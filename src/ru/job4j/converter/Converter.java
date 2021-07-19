package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
       return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inEvro = 140;
        float outEuro = Converter.rubleToEuro(inEvro);
        float exprectedEuro = 2;
        boolean passedTest1 = outEuro == exprectedEuro;
        float inDollar = 180;
        float outdollar = Converter.rubleToDollar(inDollar);
        float exprectedDollar = 3;
        boolean passedTest2 = outdollar == exprectedDollar;

        System.out.println("140 rubles are 2. Test resultat: " + passedTest1);
        System.out.println("180 rubles are 3. Test resultat: " + passedTest2);
    }

}
