import java.util.Scanner;
class Stringrev{
    public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
        System.out.println("enter the statement");
        String stat=input.nextLine();
        int length=stat.length();
       // System.out.println(length);
        for(int i=length-1;i>=0;i--)
        {
            System.out.println(stat.charAt(i));
        }
    }
    
}