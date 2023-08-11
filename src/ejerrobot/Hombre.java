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
public class Hombre {
   
    private String nombre;

    public Hombre(String nombre) {
      
        this.nombre = nombre;
    }
    
    public void JugarConRobot(Robot robot){
      robot.robotAvanzar(1);
      robot.dormir();
      robot.despertar();
      robot.robotRetroceder(0);
    }
}
