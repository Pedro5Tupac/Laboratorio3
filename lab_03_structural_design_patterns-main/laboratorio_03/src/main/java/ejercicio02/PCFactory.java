/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author Pedro
 */
public class PCFactory implements GameElementFactory{

    @Override
    public Character createWarrior() {
        return new PCWarrior();
    }

    @Override
    public Weapon createWeapon() {
        return new PCSword();
    }
    
}
