/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientfile;

import java.net.Socket;

/**
 *
 * @author BO
 */
public class NotificationThread extends Thread{
    private Socket socket;
    
    public NotificationThread (Socket socket) {
        this.socket = socket;
    }
    
    @Override
    public void run() {
        //baca dari socket
    }
    
}
