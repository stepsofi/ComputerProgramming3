

public class temperature
{
    static double celsiusToKelvin(double temp){
        return temp+273.5f; 
    }
    static double celsiusToFahrenheit (double temp){
        return temp*(9/5)+32; 
    }
    static double kelvinToCelsius (double temp){
        return temp*(9/5)+32; 
    }
    static double kelvinToFahrenheit(double temp){
        return (temp-213.15f)*(9/5)+32;
    }
    static double fahrenheitToCelsius(double temp){
        return (temp-32)*(5/9);
    }
    static double fahrenheitToKelvin(double temp){
        return (temp-273.15f)+32;
    }

public static void main(String[] args){
    System.out.println(celsiusToKelvin(25));
    System.out.println(celsiusToFahrenheit(25));
    System.out.println(fahrenheitToCelsius(100));
    System.out.println(fahrenheitToKelvin(100));
    System.out.println(kelvinToCelsius(0));
    System.out.println(kelvinToFahrenheit(0));
}
}