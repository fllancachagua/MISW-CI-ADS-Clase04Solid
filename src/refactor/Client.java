/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactor;

import java.io.IOException;

/**
 *
 * @author Felipe
 */
public class Client {

    public static void main(String[] args) throws IOException {
        //Sin Dependency Inversion   
//        DeviceInput keyboard = new Keyboard();
//        DeviceInput scanner = new Scanner();
//        DeviceOutput printer = new Printer();
//        DeviceOutput database = new Database();
       // Copier.copy(scanner, printer);
       // Copier.copy(keyboard, database);

        //Con Dependency Inversion
        Copier.copy(Container.getInstanceInput("Scanner"), Container.getInstanceOutput("Printer"));
       // Copier.copy(Container.getInstanceInput("Keyboard"), Container.getInstanceOutput("Database"));
    }

}
