import java.util.Scanner;
public class temperature { 
    public static void main(String arngs[]){
        Scanner in = new Scanner(System.in); 
        
        double celsius;
        System.out.print("Enter a temperature in Celsius");
        celsius = in.nextDouble();
        
        
        double x = 9.0/5;
        double fahrenheit = celsius * x + 32;
        
        System.out.printf("%.1f C = %.1f F", celsius, fahrenheit);
        
        
        
    }
}

