/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doscom.TeaLinuxInstaller.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author zword
 */
public class Exec {
    // class ga kepake
    public static void main(String args[]) {
            Exec e = new Exec();
            
            e.exec("gksu -- && cp /home/zword/Music/a  /home/zword/Desktop/ cp /home/zword/Music/a /usr/share/applications/");
//            e.exec("");
    }
    
    private void exec(String command){
        try {
              String line;
              Process p = Runtime.getRuntime().exec(command);
              BufferedReader bri = 
                      new BufferedReader(new InputStreamReader(p.getInputStream()));
              BufferedReader bre = 
                      new BufferedReader(new InputStreamReader(p.getErrorStream()));
              while ((line = bri.readLine()) != null) {
                 // System.out.println("input...");
                System.out.println(line);

              }
              bri.close();
              while ((line = bre.readLine()) != null) {
                  System.out.println("error...");
                System.out.println(line);

              }
              bre.close();
              p.waitFor();
              System.out.println("Done.");
            }
            catch (Exception err) {
              err.printStackTrace();
            }
    }
}
