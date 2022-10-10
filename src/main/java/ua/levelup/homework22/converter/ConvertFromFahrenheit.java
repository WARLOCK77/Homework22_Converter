package ua.levelup.homework22.converter;

import ua.levelup.homework22.Convert;

public class ConvertFromFahrenheit implements Convert {

    @Override
    public void convert(double temp) {
        if (temp < -459.67){
            System.out.println("Значение температуры не может быть меньше абсолютного нуля");
            return;
        }
        double tempFtoC=5*(temp-32)/9;
        double tempFtoK=tempFtoC-273.15;
        System.out.println("Конвертирование заданой температуры из градусов Фаренгейта:\n" +
                "в градусы Цельсия: "+tempFtoC+"K"+"\u00B0\n"+
                "в градусы Кельвина: "+tempFtoK+"F"+"\u00B0\n");
    }
}
