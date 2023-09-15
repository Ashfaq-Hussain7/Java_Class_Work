/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question6;

/**
 *
 * @author ashfa
 */
public class NumException {
    private String number="123";
    private String character="xyz";
    private int num_only;
    private int exption;
    
    public NumException(){
        this.num_only= Integer.parseInt(number);
        try{
            this.exption=Integer.parseInt(character);
        }
        catch(NumberFormatException ex){
            System.out.println("Number Format Exception Ocurred!!");
        }
    }
}
