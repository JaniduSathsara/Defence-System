/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defence.system;

/**
 *
 * @author Janidu
 */
public class DefenceSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new MainController().setVisible(true);
        new HelicopterWindow().setVisible(true);
        new TankWindow().setVisible(true);
        new SubMarineWindow().setVisible(true);
    }
}
