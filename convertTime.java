import java.util.Scanner;
public class convertTime {
    public static void main(String arngs[]){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Put in seconds you want to convert");
        int totalSec = in.nextInt();
        
        System.out.println("Okay, so " + totalSec + " seconds");
        
        int hours = totalSec / 3600;
        int minutes = (totalSec%3600)/60;
        int seconds = totalSec%60;
        
        System.out.println(totalSec + " = " + hours + " hours " + minutes + " minutes" +  " and " + seconds + " seconds");
        
        
    }       
}