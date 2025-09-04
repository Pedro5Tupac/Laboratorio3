/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author jacks
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //GameElementCreator creator = new GameElementCreator();

        // ❌ PROBLEMA: Nada garantiza que sean compatibles
        //Character pcWarrior = creator.createCharacter("PC", "Warrior");
        //Weapon mobileSwold = creator.createWeapon("Mobile", "Sword"); // Error de compatibilidad!

        //pcWarrior.attack();
        //mobileSwold.use(); // Inconsistencia visual!
        
        GameElementFactory factory=new PCFactory();
        
        Character warrior=factory.createWarrior();
        Weapon weapon=factory.createWeapon();
        
        System.out.println(warrior.getInfo());
        warrior.attack();
        
        System.out.println(weapon.getInfo());
        weapon.use();
        
        System.out.println("//////");
        GameElementFactory factory2=new MobileFactory();
        
        Character warrior2=factory2.createWarrior();
        Weapon weapon2=factory2.createWeapon();
        
        System.out.println(warrior2.getInfo());
        warrior2.attack();
        
        System.out.println(weapon2.getInfo());
        weapon2.use();        
        //Character pcWarrior= new PCWarrior();
        //pcWarrior.attack();
        //Weapon pcSword= new PCSword();
        //pcSword.use();
        //System.out.println(pcSword.getInfo());
    }

}
