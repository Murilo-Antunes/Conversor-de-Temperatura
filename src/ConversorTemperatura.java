import java.util.Scanner;

public class ConversorTemperatura {
    double grausEmCelsius;
    double resultadoFarenheit;
    double resultadoKelvin;

    public void pedirGrausCelsius(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, por favor digite os graus em Celsius:");
        grausEmCelsius = leitor.nextDouble();

        calcularFahrenheit();

    }

    public void calcularFahrenheit(){
        resultadoFarenheit = (grausEmCelsius * 1.8) +32;

        calcularKelvin();
    }

    public void calcularKelvin(){
        resultadoKelvin = grausEmCelsius + 273.15;

        exibirResultados();
    }

    public void exibirResultados(){
        System.out.println(grausEmCelsius + "°C equivalem a:");

        String farenheitEmDecimais = String.format("%.2f", resultadoFarenheit);
        System.out.println(farenheitEmDecimais + "°F (Fahrenheit)");

        String kelvinEmDecimais = String.format("%.2f", resultadoKelvin);
        System.out.println(kelvinEmDecimais + "°K (Kelvin)");
    }
}
