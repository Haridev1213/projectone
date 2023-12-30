import java.util.Scanner;
public class MtoKM {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the miles");
        double miles=input.nextDouble();
        double result=0.0;
        double kilometer=1.609;
        for(double i=1.0;i<=miles;i++)
        {
            result=result+kilometer;
        }
        System.out.println("Kilometer="+result);
    }
    
}
