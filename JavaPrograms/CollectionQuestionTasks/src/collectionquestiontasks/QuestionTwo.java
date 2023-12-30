/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionquestiontasks;

/**
 *program name:2. write a program to convert list to array
 * @author harid
 */
import java.util.*;
public class QuestionTwo {
    public static void main(String[] args) {
   
    List<Integer> ab=new ArrayList<>();
  ab.add(1);
  ab.add(2);
  ab.add(3);
        for(int j:ab)
        {
            System.out.println("the list is "+ j);
        }
  int arr[]=new int[ab.size()];     
        
  for(int i=0;i<ab.size();i++)
  {
      arr[i]=ab.get(i);
  }
  
      System.out.println(Arrays.toString(arr));  
    
}}
