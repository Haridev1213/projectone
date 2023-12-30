public class Dateloc{
   private int day;
   private int month;
   private int year;
   public  void Dateloc(int da,int mont,int yea)
   {
	day=da;
    month=mont;
    year=yea;	
   }
  
   public  void displayDate()
   {
	   System.out.println(day+"/"+month+"/"+year);
	  
   }   
}   
