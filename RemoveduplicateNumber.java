/**
 * Program to remove duplicates from the sequence entered by the user. 
 *
 * <p> 
 * test case input = -1,-1,-1,0,0,2,2     output = 
 * test case input = 1,1,1,2,2,3,3,3,3,4,5,5,6,7,7,7,11,11,15,17
 * test case input = -10,-9,-5,-5,-5,-3,-3 output = -10,-9,-5,-3
 *
 */

package numbers-util; 

import java.util.Scanner;


public class RemoveduplicateNumber {
  public static void main(String [] args) {
    System.out.println("This program removes duplciates from the series you enter");
    System.out.println("Please enter total numbers in your series:");
    Scanner scanethevalue = new Scanner(System.in);
    System.out.println("Please enter each number in your series in a sorted order:");
    int x = scanethevalue.nextInt();
    int [] array = new int[x];
    int [] temparray = new int[x];
    int j = 0;
    int count = 0;
    for (int i = 0; i < x; i++) {
      array[i] = scanethevalue.nextInt();
    }
    if (x > 1) {
      //if x = 1 the loop is out of bound   
      for (int i = 0; i < x - 1; i++) {
        if (array[i] != array[i + 1]) {
          if (i == 0) {
            temparray[j++] = array[i];
          } else if (array[i - 1] !=  array[i]) {
            temparray[j++] = array[i];
          }
        }
      }
      if (array[x - 2] !=  array[x - 1]) {
        temparray[j++] = array[x - 1];
      }
      System.out.println("Series without the duplicates printed below.");
      for (int i = 0; i < j; i++) {
        System.out.println(temparray[i]);
      }
    } else {
      System.out.println(array[x - 1]);
    }
  }
}
