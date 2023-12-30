
package menucard;

/**
 *program name : Food menu card program
 * @author harid
 */
import java.util.TreeMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Set;
import java.util.*;

public class MainFunction {
public static void main(String[] args) {
    TreeMap <Integer,VegFood>ab=new TreeMap<>();
    HashMap<Integer,NonVeg>ac=new HashMap<>();
    VegFood vf1=new VegFood("Dosai",60);
    VegFood vf2=new VegFood("Idli",20);
    VegFood vf3=new VegFood("poori",40);
    ab.put(1,vf1);
    ab.put(2,vf2);
    ab.put(3,vf3);
    System.out.println("\tVEGETARIAN\n");   
    Iterator i=ab.entrySet().iterator();
    while(i.hasNext())
    {
        Map.Entry menu=(Map.Entry)i.next();
        VegFood f=(VegFood)menu.getValue();
        System.out.println(menu.getKey()+"\t"+f.item1+"\t"+f.price);
    }
    System.out.println("\n\tNON VEGETARIAN\n");
    NonVeg nv1=new NonVeg("Chicken gravy",120);
    NonVeg nv2=new NonVeg("Fish fry",100);
    NonVeg nv3=new NonVeg("Mutton fry",120);
    ac.put(4, nv1);
    ac.put(5, nv2);
    ac.put(6,nv3);
    Iterator j=ac.entrySet().iterator();
    while(j.hasNext())
    {
        Map.Entry menu1=(Map.Entry)j.next();
        NonVeg v=(NonVeg)menu1.getValue();
        System.out.println(menu1.getKey()+"\t"+v.item2+"\t"+v.cost);
              
    }
    HashSet<Juice> bc=new HashSet<>();
    Juice j1=new Juice("apple Juice",40);
    Juice j2=new Juice("Lemon juice",30);
            
   bc.add(j1);
   bc.add(j2);
    //Set s=Comparator.naturalOrder();
    for(Juice k:bc)
    {
    System.out.println(k.ju+"\t"+k.cost1);
    }
    
    }
    
}
