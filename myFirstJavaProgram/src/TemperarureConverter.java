public class TemperarureConverter {
    public static double celsiusToFahrenheit(double celsius){
        return (celsius*9/5)+32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit-32)*5/9;
    }

    public static void main(String[] args) {
        double celsiusValue = 36.0;
        double fahrenheitValue = 89.6;

        double convertedToFahrenheit = TemperarureConverter.celsiusToFahrenheit(celsiusValue);
        System.out.println(celsiusValue + " degrees Celsius is " + convertedToFahrenheit + " degrees Fahrenheit.");

        double convertedToCelsius = TemperarureConverter.fahrenheitToCelsius(fahrenheitValue);
        System.out.println(fahrenheitValue + " degrees Fahrenheit is " + convertedToCelsius + " degrees Celsius.");
    }
}
