package ua.levelup.homework22.converter;

import ua.levelup.homework22.Convert;

public class ConvertFromCelsius implements Convert {

    @Override
    public void convert(double temp) {
        if (temp<-273.15){
            System.out.println("Значение температуры не может быть меньше абсолютного нуля");
            return;
        }
        double tempCtoK=temp+273.15;
        double tempCtoF=9*temp/5+32;
        System.out.println("Конвертирование заданой температуры из градусов Цельсия:\n" +
                "в градусы Кельвина: "+tempCtoK+"K"+"\u00B0\n"+
                "в градусы Фаренгейта: "+tempCtoF+"F"+"\u00B0\n");
    }
}
