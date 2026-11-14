/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence.system;

import javax.swing.JTextArea;

/**
 *
 * @author Janidu
 */
public class Message {

    private String sender;
    private String message;

    public Message(String sender, String message) {
        this.sender = sender;
        this.message = message;
    }
    public String getSender() {
        return sender;
    }
    public String getMessage() {
        return message;
    }
}

class MessageCenter {

    private static JTextArea helicopterArea;
    private static JTextArea mainControllerArea;
    private static JTextArea tankArea;
    private static JTextArea submarineArea;

    public static void registerHelicopter(JTextArea area) {
        helicopterArea = area;
    }

    public static void registerMainController(JTextArea area) {
        mainControllerArea = area;
    }

    public static void registerTank(JTextArea area) {
        tankArea = area;
    }

    public static void registerSubmarine(JTextArea area) {
        submarineArea = area;
    }

    public static void sendMessage(String sender, String message) {
        if (message.isEmpty()) {
            return;
        }
        Message newMessage = new Message(sender, message.trim());
        String text = newMessage.getSender() + ": " + newMessage.getMessage() + "\n";
        if (helicopterArea != null) {
            helicopterArea.append(text);
        }
        if (mainControllerArea != null) {
            mainControllerArea.append(text);
        }
        if (tankArea != null) {
            tankArea.append(text);
        }
        if (submarineArea != null) {
            submarineArea.append(text);
        }
    }
}
