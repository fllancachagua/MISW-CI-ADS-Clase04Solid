/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactor;

import common.Util;

/**
 *
 * @author Felipe
 */
public class Printer implements DeviceOutput {

    @Override
    public void write(String value) {
        Util.output("Printer: " + value);
    }

}
