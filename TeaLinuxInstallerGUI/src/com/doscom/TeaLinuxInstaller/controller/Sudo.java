/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.doscom.TeaLinuxInstaller.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author zword
 */
public class Sudo {
    // class ga kepake
    public static void main(String[] args) throws IOException {
        String pass = "echo pass" ;
        String[] cmd = {"/bin/bash","-c",""+pass+"| sudo -S ls"};
        Process pb = Runtime.getRuntime().exec(cmd);

        String line;
        BufferedReader input = new BufferedReader(new InputStreamReader(pb.getInputStream()));
        while ((line = input.readLine()) != null) {
            System.out.println(line);
        }
        input.close();
    }
}
