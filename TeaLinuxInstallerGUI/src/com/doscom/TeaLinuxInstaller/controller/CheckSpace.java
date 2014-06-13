/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.doscom.TeaLinuxInstaller.controller;

import java.io.File;

/**
 *
 * @author zword
 */
public class CheckSpace {
    public static void main(String[] args) {
        File file = new File("/opt");
        System.out.println(file.getUsableSpace()); // hitung berdasar byte , 1 gb = 1.000.000.000
    }
}
