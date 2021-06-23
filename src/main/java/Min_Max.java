
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER-PC
 */
public class Min_Max {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("—————————————");
        System.out.println("      WELCOME TO");
        System.out.println("Patrick STAT CALCULATOR");
        System.out.println("—————————————");
        System.out.println("    DETERMINING THE");
        System.out.println("OCCURANCE OF ELEMENTS");
        System.out.println("     IN AN ARRAY");
        System.out.println("—————————————");
        System.out.println("Enter prefered array size");
        int size = input.nextInt();
        
        int list[]=new int[size];
        System.out.println("Enter the array values");
        for (int i =0; i<list.length;i++){
            System.out.println("Value @ index "+i);
            list[i] = input.nextInt();}
        
        System.out.println("—————————————");
        System.out.println("inputed array values: ");
        for (int i =0; i<list.length;i++){
            System.out.print(list[i]+", ");}

        
        int temp = 0;
        for(int i =0;i<list.length;i++){
            for(int j= i+1;j<list.length;j++){
                if(list[i]>list[j]){
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println(" ");
        System.out.println("—————————————");
        System.out.println("arranged array values");
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i]+", ");
        }
        

        System.out.println(" ");
        System.out.println("—————————————");
        System.out.println("   Final Analysis:");
        System.out.println("—————————————");
        
        int min = list[0];
        int max = list[0];
        for(int i =0;i<list.length;i++){
            if(list[i]<min){
                min = list[i];
            }
            if(list[i]>max){
                max = list[i];
            }
        }
        System.out.println("MAXIMUM VALUE: "+ max);
        System.out.println("MINIMUM VALUE: "+ min);
        System.out.println("—————————————");
    }
}
