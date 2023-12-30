/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionquestiontasks;

import java.util.ArrayList;

/**
 *program name : 6 Convert Array too list 
 * @author harid
 */
public class QuestionSix {
public static void main(String[] args) {    
int arr[]=new int[3];
ArrayList ab=new ArrayList();
arr[0]=1;
arr[1]=2;
arr[2]=3;
    for(int i=0;i<3;i++)
    {
        System.out.println("array"+arr[i]);
        ab.add(arr[i]);
    }
 
 
    System.out.println("List is"+ab);
 
    
}}
