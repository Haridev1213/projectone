/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *program name: Array initialization and Declaration
 * @author harid
 */
public class Array {
public static void main(String[] args) {
int a[]=new int[5];//Declaration
a[0]=10;a[1]=5;a[2]=3;a[3]=4;a[4]=4;//Initialization
for(int i=0;i<a.length;i++)
System.out.println(a[i]);   
}}        
    