package oopsinterviewquestions;
public class Invoice {
       private  String partnumber;
       private String partdescription;
       private int quantity;
       private double price;
       
public Invoice(String partnumber,String partdescription,int quantity,double price)
{
	   this.partnumber=partnumber;
	   this.partdescription=partdescription;
	   this.quantity=quantity;
	   this.price=price;
}	

public  double getInvoiceAmount(){
	  if(quantity>0)
	  {
		  price=quantity*price;
		  return price;
	  }
	  else
	  {
		  return (0.0);
	  }
      
}
}

    

