package Relojes;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

    SmartDevice smartDevice = new SmartDevice();
    SmartPhone smartPhone = new SmartPhone();
    SmartWatch smartWatch = new SmartWatch();


        System.out.println(smartDevice);
        System.out.println(smartPhone);
        System.out.println(smartWatch);



        double totalCaloriasPerdidasPorminuto = smartDevice.calcularCaloriasPorMinuto(5.8, 6.9);
        System.out.println(totalCaloriasPerdidasPorminuto);

    }
}
