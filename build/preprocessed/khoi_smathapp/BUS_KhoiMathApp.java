/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package khoi_smathapp;

import javax.microedition.lcdui.Display;

/**
 *
 * @author Khoi Nguyen
 */
public class BUS_KhoiMathApp {
    
    public int Plus (int firstnumber, int secondnumber){
        return firstnumber+secondnumber;
    }
    public int Minus (int firstnumber, int secondnumber){
        return firstnumber-secondnumber;
    }
    public int Multi (int firstnumber, int secondnumber){
        return firstnumber*secondnumber;
    }
    public int Didvi (int firstnumber, int secondnumber , double Du){
        if(Du != firstnumber%secondnumber )
        {
           System.out.print("Cannot Did");

        }
        else{
            return firstnumber/secondnumber;
        }            
        return 0;

    }   
}
