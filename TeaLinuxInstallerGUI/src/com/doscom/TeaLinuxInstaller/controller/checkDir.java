/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doscom.TeaLinuxInstaller.controller;

import java.io.File;
/**
 *
 * @author zword
 */

public class checkDir {
    public static void main(String[] args) {
        File f = new  File("media/TEA5KKC/IDEPACK");
        
        if(f.exists() && f.isDirectory()){
            //do something
        }
    }
}
