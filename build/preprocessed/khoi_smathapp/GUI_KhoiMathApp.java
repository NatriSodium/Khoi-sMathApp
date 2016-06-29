/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khoi_smathapp;

import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDlet;
/**
 * @author Khoi Nguyen
 */
public class GUI_KhoiMathApp extends MIDlet implements CommandListener{

    private Form frmMain;
    private Display display; 
    private static TextField txtFirstnumber = new TextField("First Number", "", 99, 1);
    private static TextField txtSecondnumber = new TextField("Second Number", "", 99, 1);
    private static TextField txtResult = new TextField("Result", "", 99, 1);
    private static Command cmdExit = new Command("Exit", 7, 1);
    private static Command cmdPlus = new Command("+", 4, 1);
    private static Command cmdMinus = new Command("-", 4, 1);
    private static Command cmdMulti = new Command("*", 4, 1);
    private static Command cmdDidvi = new Command("/", 4, 1);
    private static Command cmdBack = new Command("Back", 2, 1);
    private boolean Firsttime;
    private static BUS_KhoiMathApp Bus = new BUS_KhoiMathApp();
    
    public GUI_KhoiMathApp(){
        Firsttime = true;
        frmMain = new Form("Math Application");
        display = Display.getDisplay(this);
    } 
    
    public void startApp() {
        if(Firsttime){
            frmMain.append("Khoi's Math Application");
            frmMain.addCommand(cmdExit);
            frmMain.addCommand(cmdPlus);
            frmMain.addCommand(cmdMinus);
            frmMain.addCommand(cmdMulti);
            frmMain.addCommand(cmdDidvi);
            frmMain.append(txtFirstnumber);
            frmMain.append(txtSecondnumber);
            frmMain.append(txtResult);
            frmMain.setCommandListener(this);
            Firsttime = false;
        }
        display.setCurrent(frmMain);
    }
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable d) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(c == cmdExit){
            destroyApp(Firsttime);
            notifyDestroyed();
        }
        else if (c == cmdPlus){
            int firstnumber = Integer.parseInt(txtFirstnumber.getString());
            int secondnumber = Integer.parseInt(txtSecondnumber.getString());
            int result = Bus.Plus(firstnumber, secondnumber);
            txtResult.setString(String.valueOf(result));
        }
        else if(c == cmdMinus){
            int firstnumber = Integer.parseInt(txtFirstnumber.getString());
            int secondnumber = Integer.parseInt(txtSecondnumber.getString());
            int result = Bus.Minus(firstnumber, secondnumber);
            txtResult.setString(String.valueOf(result));
            
        }
        else if(c == cmdMulti){
            int firstnumber = Integer.parseInt(txtFirstnumber.getString());
            int secondnumber = Integer.parseInt(txtSecondnumber.getString());
            int result = Bus.Multi(firstnumber, secondnumber);
            txtResult.setString(String.valueOf(result));
        }
        else if(c == cmdDidvi){
            int firstnumber = Integer.parseInt(txtFirstnumber.getString());
            int secondnumber = Integer.parseInt(txtSecondnumber.getString());
            double Du = 0;
            int result = Bus.Didvi(firstnumber, secondnumber, Du);
            txtResult.setString(String.valueOf(result));
        }
        else{
            display.setCurrent (frmMain);
        }
        
    }
}
