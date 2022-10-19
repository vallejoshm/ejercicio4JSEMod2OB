package com.ejercicio;

import com.clases.*;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Pantalla pantallaXiaomiRj45 = new Pantalla(1.0, 1.5, true, "AMOLED",
                348,442);
        Bateria xiaomiBattRj45 = new Bateria(220, "Y1 3.7V Litio", "14 días", "carga magnética");

        Conectividad conectividadXiaomiRj45 = new Conectividad(false, false, true, false,true);

        Sensores sensoresXiaomiRj45 = new Sensores(true, true, true, true,
                true, true,true);

        LocalDateTime verHora = LocalDateTime.now();

        Malla mallaXiaomiRj45 = new Malla("Silicona", "Azul", 207.0, 20.0,
                true, 50, false);

        SmartWatch miSmartWatch = new SmartWatch("Xiaomi","rj45",2022,"Azul",
                220.0,xiaomiBattRj45, "Android 11", 1.65, pantallaXiaomiRj45,
                conectividadXiaomiRj45, sensoresXiaomiRj45, true, true, true,
                true, true, "16 GB", 3,false, verHora,
                false, false, mallaXiaomiRj45, true, 50);

        int profundidadAgua = miSmartWatch.getWaterResistMetersMax();
        System.out.println(profundidadAgua);

        String tipoCargaBateria =  miSmartWatch.getBattery().getType();
        System.out.println(tipoCargaBateria);



    }

}
