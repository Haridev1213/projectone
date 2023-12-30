import java.util.Scanner;
public class KilometerMiles {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("enter the miles and kilometer");
    double miles=input.nextDouble();
    double kilometer=input.nextDouble();
    double resultmil=0.0;
    double resultkilo=0.0;
        System.out.println("Miles"+"\t"+"Kilometer"+"\n");
        int num=1;
    while(num<=10)
     {
          resultmil=resultmil+miles;
          resultkilo=resultkilo+kilometer;
          System.out.print(resultmil+"\t"+resultkilo+"\n");
          num++;
     }
        
    }
}
