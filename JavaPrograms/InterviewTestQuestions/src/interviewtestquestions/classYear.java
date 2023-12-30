/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewtestquestions;

/**
 *
 * @author harid
 */
import java .util.Scanner;
 class classYear {
        
    private  int day;
    private  int mon;
    private  int yea;

   public  classYear(int day,int mon,int yea){
            this.day=day;
            this.mon=mon;
            this.yea=yea;  
            
           
    }

   public void display()
   {
       System.out.println(day+"/"+mon+"/"+yea);
   }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);     
        System.out.println("enter the day,month and year");
        int d=input.nextInt();
        int m=input.nextInt();
        int y=input.nextInt();
        
      //  if(m%2==1&&m>0&&m<=12)
        {
       classYear year=new classYear(d,m,y);
       year.display(); 
        }      
}
 }