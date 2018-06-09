/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactor;

/**
 *
 * @author Felipe
 */
public class Container {

    public static DeviceInput getInstanceInput(String device) {
        if (device.equals("Keyboard")) {return new Keyboard();}
        if (device.equals("Scanner")) {return new Scanner();}
        return null;
    }
    public static DeviceOutput getInstanceOutput(String device) {
        if (device.equals("Printer")) {return new Printer();}
        if (device.equals("Database")) {return new Database();}
        return null;
    }    
}
