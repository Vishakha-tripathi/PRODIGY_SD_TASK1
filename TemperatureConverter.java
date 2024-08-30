import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature value: ");
        double value = scanner.nextDouble();

        System.out.println("Enter the current scale (C, F, K): ");
        char fromScale = scanner.next().toUpperCase().charAt(0);

        System.out.println("Enter the scale to convert to (C, F, K): ");
        char toScale = scanner.next().toUpperCase().charAt(0);

        double convertedValue = 0;

        switch (fromScale) {
            case 'C':
                if (toScale == 'F') {
                    convertedValue = celsiusToFahrenheit(value);
                } else if (toScale == 'K') {
                    convertedValue = celsiusToKelvin(value);
                }
                break;
            case 'F':
                if (toScale == 'C') {
                    convertedValue = fahrenheitToCelsius(value);
                } else if (toScale == 'K') {
                    convertedValue = fahrenheitToKelvin(value);
                }
                break;
            case 'K':
                if (toScale == 'C') {
                    convertedValue = kelvinToCelsius(value);
                } else if (toScale == 'F') {
                    convertedValue = kelvinToFahrenheit(value);
                }
                break;
            default:
                System.out.println("Invalid scale entered.");
                return;
        }

        System.out.printf("%.2f %c is equal to %.2f %c%n", value, fromScale, convertedValue, toScale);
    }
}
