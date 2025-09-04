/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author Pedro
 */
public class MobileWarrior extends Character {

    public MobileWarrior() {
        this.name = "Guerrero";
        this.platform = "Mobile";
    }

    @Override
    public void attack() {
        System.out.println("Guerrero Mobile ataca con efectos básicos");
    }
    
}
