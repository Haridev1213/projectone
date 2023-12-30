/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopsinterviewquestions;
 class Car {
public void m1(){
    System.out.println("car 1");
    
}    
public void m2(){
    System.out.println("car2");
}
public String tostring(){
//    String name="vroom";
    return "vroom";
}
}
class truck extends Car{
    public void m1(){
        System.out.println("Truck1");
    }
    public void m2(){
        super.m1();
    }
    
    public String tostring(){
       return super.tostring()+super.tostring();
    }            
}

public class MonsterTruck extends truck{
    public void m1(){
        System.out.println("Monster 1");
    }
    public void m2(){
        super.m1();
        super.m2();
    }
    public String tostring(){
        String name ="monster";
        String method=super.tostring();
      System.out.println("''"+name+" "+method+"''");
        return name;
        
    }            
    public static void main(String[] args) {
        MonsterTruck getresult=new MonsterTruck();
        getresult.m1();
        getresult.m2();
        getresult.tostring();
    }
}