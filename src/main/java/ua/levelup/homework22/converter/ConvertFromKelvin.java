package ua.levelup.homework22.converter;

import ua.levelup.homework22.Convert;

public class ConvertFromKelvin implements Convert {

    @Override
    public void convert(double temp) {
        if (temp<0){
            System.out.println("Значение температуры не может быть меньше абсолютного нуля");
            return;
        }
        double tempKtoC=temp-273.15;
        double tempKtoF=9*tempKtoC/5+32;
        System.out.println("Конвертирование заданой температуры из градусов Кельвина:\n" +
                "в градусы Цельсия: "+tempKtoC+"K"+"\u00B0\n"+
                "в градусы Фаренгейта: "+tempKtoF+"F"+"\u00B0\n");
    }
}
