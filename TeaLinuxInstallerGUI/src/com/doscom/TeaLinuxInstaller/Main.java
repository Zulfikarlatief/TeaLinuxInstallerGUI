/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doscom.TeaLinuxInstaller;

import com.doscom.TeaLinuxInstaller.view.FrameUtama;
import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author zword
 */
public class Main {// Main class
   
//    File pertama yang dijalankan
    
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            SwingUtilities.invokeLater(new Runnable() {

                @Override
                public void run() {
                    FrameUtama frame;
                    try {
                        frame = new FrameUtama();// Panggil class Frame Utama di view
                        frame.setVisible(true); // ditampilkan
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }

                
            });
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
