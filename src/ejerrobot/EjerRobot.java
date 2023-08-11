/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerrobot;

/**
 *
 * @author Usuario
 */
public class EjerRobot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Robot robotito=new Robot(7252);
        Robot robotote=new Robot(5225);
        Hombre juan=new Hombre("Juan");
        
        juan.JugarConRobot(robotote);
        juan.JugarConRobot(robotito);
        
        
    }
    
}
