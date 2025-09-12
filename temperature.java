import java.util.Scanner;
    public class temperature { 
    public static void main(String arngs[]){
        Scanner in = new Scanner(System.in); 
        
        
        System.out.print("Enter a temperature in Celsius");
        int celsius = in.nextInt();
        
        
        System.out.println("Ok, so " + celsius + " Celsius");
        
        double x = 9.0/5;
        double fahrenheit = celsius * x + 32;
        
        System.out.printf("It is " + fahrenheit);
        
        
        
    }
}
