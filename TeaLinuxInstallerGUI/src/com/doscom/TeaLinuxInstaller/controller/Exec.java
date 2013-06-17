/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doscom.TeaLinuxInstaller.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author zword
 */
public class Exec {
    public static void main(String args[]) {
    try {
      String line;
      Process p = Runtime.getRuntime().exec("xpad");
      BufferedReader bri = 
              new BufferedReader(new InputStreamReader(p.getInputStream()));
      BufferedReader bre = 
              new BufferedReader(new InputStreamReader(p.getErrorStream()));
      while ((line = bri.readLine()) != null) {
          System.out.println("input...");
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
