/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactor;

import common.Util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felipe
 */
public class Keyboard implements DeviceInput {

    @Override
    public String read() {
        String answer = "";
        Util.outputInLine("Keyboard - Enter String:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Keyboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        return answer;
    }

}
