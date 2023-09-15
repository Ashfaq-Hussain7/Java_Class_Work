/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question6;


/**
 *
 * @author ashfa
 */
public class NullException {
    private String str=null;
    
    public NullException(){
        try{
            int length=str.length();
        }
        catch(NullPointerException ex){
            System.out.println("Null Pointer Exception Detected!!");
        }
    }
}
