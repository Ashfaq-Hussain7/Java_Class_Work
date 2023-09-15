/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question8;

/**
 *
 * @author ashfa
 */
public class EXCEPTION {
    public static void main(String[] args) {
        
        int x=45;
        int y=5;
        try{
            System.out.println("Result: "+(x/y));
            int a[]=new int[10];
            for(int i=0; i<12; i++){
                a[i]=i+1;
            }
        }
        catch(ArithmeticException Ex){
            System.out.println("Check the value of y!!");
        }
        catch(ArrayIndexOutOfBoundsException Ex){
            System.out.println("Array out of Bound");
        }
        finally{
            System.out.println("Program executed without any exception");
        }
    }
}


