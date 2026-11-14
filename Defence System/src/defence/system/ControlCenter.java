/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence.system;

/**
 *
 * @author Janidu
 */
public class ControlCenter {

    private HelicopterWindow helicopter;
    private TankWindow tank;
    private SubMarineWindow submarine;

    public void registerWindows(HelicopterWindow h,TankWindow t,SubMarineWindow s) {
        helicopter = h;
        tank = t;
        submarine = s;
    }

    public void setAreaClear(boolean clear) {
        if (helicopter != null) {
            helicopter.setAreaClear(clear);
        }
        if (tank != null) {
            tank.setAreaClear(clear);
        }
        if (submarine != null) {
            submarine.setAreaClear(clear);
        }
    }
}
