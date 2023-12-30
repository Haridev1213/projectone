
package Collections;

/**
 *program name : Collection Array List
 * @author harid
 */
import java.util.ArrayList;
import java.util.List;
public class AddandAddall {
public static void main(String[] args) {
List<Double>firstfiveprimenumber=new ArrayList<>();
firstfiveprimenumber.add(2.0);
firstfiveprimenumber.add(3.0);
firstfiveprimenumber.add(5.0);
firstfiveprimenumber.add(7.0);
firstfiveprimenumber.add(11.0);
// Create an Arraylist from Another Collection
List<Double>firsttenprimenumber=new ArrayList<>(firstfiveprimenumber);
List<Double>nextfiveprimenumber=new ArrayList<>();
nextfiveprimenumber.add(13.0);
nextfiveprimenumber.add(17.0);
nextfiveprimenumber.add(19.0);
nextfiveprimenumber.add(23.0);
nextfiveprimenumber.add(29.0);
//add all the array list
firsttenprimenumber.addAll(nextfiveprimenumber);
    System.out.println(firsttenprimenumber);
    
    }
    
}
