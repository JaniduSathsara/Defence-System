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
        MainController controller = new MainController();

        HelicopterWindow helicopter = new HelicopterWindow();
        TankWindow tank = new TankWindow();
        SubMarineWindow submarine = new SubMarineWindow();

        controller.setVisible(true);
        helicopter.setVisible(true);
        tank.setVisible(true);
        submarine.setVisible(true);

    }

}
