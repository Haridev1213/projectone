/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeSet;

/**
 *program name : TreeSet Operations
 * @author harid
 */
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetOperation {
public static void main(String[] args) {
TreeSet ab=new TreeSet();
TreeSet ac=new TreeSet();
//add operation
ab.add("vanakam");
ab.add("namasthae");
    System.out.println("add operation"+ab);
// add all operation
ac.add("helo");
ac.add("namasthae");  
ac.addAll(ab);
System.out.println("add all operation"+ac);
//size() operation
System.out.println("size () operration\t"+ab.size());
//Ceiling Operation

    System.out.println("Ceiling operation\t"+ab.ceiling("hai"));
//floor operation
System.out.println("Floor operation\t"+ab.floor("namasthae"));
//Higher operation
System.out.println("Higher operation \t"+ab.higher("namasthae") );
//lower operation
System.out.println("lower opera tion\t"+ab.lower("vanakam"));
//poll first operationn
System.out.println("poll first\t"+ac.pollFirst());
//poll last operation
System.out.println("poll last\t"+ac.pollLast());
// first operation
System.out.println("first operation\t"+ac.first());
// last operation
System.out.println("last operation\t"+ac.last());
//contains operation
System.out.println("contains operation\t"+ab.contains("hai"));
//remove operation
System.out.println("remove operation\t"+ac.remove("namasthae"));
//clear operation
ac.clear();
System.out.println("clear operation\t"+ac);
//clone operation
ab.clone();
System.out.println("clone operation"+ab);
//itearator operations
TreeSet i=new TreeSet();
i.add("heaven ");
i.add("god");
i.add("india");      
Iterator he=i.iterator();
while(he .hasNext())
{
    System.out.println("iterator operation\t"+he.next( ));
}
//Descending Iterator
Iterator de=i.descendingIterator();
while(de.hasNext())
{
    System.out.println("descending operator\t"+de.next()); 
}

}}
