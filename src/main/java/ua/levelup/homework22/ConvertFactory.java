package ua.levelup.homework22;

import ua.levelup.homework22.converter.ConvertFromCelsius;
import ua.levelup.homework22.converter.ConvertFromFahrenheit;
import ua.levelup.homework22.converter.ConvertFromKelvin;

import java.util.Scanner;

public class ConvertFactory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение температуры, которую нужно конвертировать: ");
        if (!scanner.hasNextDouble()){
            System.out.println("Это не число");
        }else {
            double temp = scanner.nextDouble();

            ConvertFactory factory = new ConvertFactory();
            Convert conFromC = factory.getConverter(new ConvertFromCelsius());
            Convert conFromK = factory.getConverter(new ConvertFromKelvin());
            Convert conFromF = factory.getConverter(new ConvertFromFahrenheit());

            conFromC.convert(temp);
            conFromK.convert(temp);
            conFromF.convert(temp);
        }
    }

    public Convert getConverter(Convert convert){
        return convert;
    }
}
