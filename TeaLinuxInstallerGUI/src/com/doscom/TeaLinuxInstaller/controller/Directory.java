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

/*
    class barisi variabel yang menanpung path/letak dari IDE
    yang sudah terinstall , digunakan untuk mengecek apakah IDE sudah terinstall / belum
*/
public class Directory {
    File file;
    
    public static String user = System.getProperty("user.name"); 
    
    private final String codeBlock  = "/usr/bin/codeblocks";
    
    private final String netBeans = "/home/"+user+"/netbeans-8.0/uninstall.sh" ;// rubah nama sesui versi
                        
    
    private final String aptana = "/opt/aptanastudio3" ;
                                
    
    private final String glade = "/usr/bin/glade" ;
                      
    
    private final String geany = "/usr/bin/geany";
    
    private final String lazarus = "/usr/bin/startlazarus";
    
    private final String pycharm = "/opt/pycharm";
    
    private final String pencil = "/usr/bin/pencil";
    
    private final String brackets = "/usr/bin/brackets";
    
    private final String adt = "/opt/adt-bundle";
    
    private final String pintasan = "/home/"+user+"/.local/share/applications";
    
    
    /*
        Method untuk mengecek terinstallnya aplikasi
    */
    public boolean cek(String ide){
           String exec = "";
           if(ide.equals("codeblock")){
               exec =  codeBlock;
           }
           else if (ide.equals("netbeans")) {
               exec = netBeans;
           }
           else if (ide.equals("aptana")) {
               exec = aptana;
           }
           else if (ide.equals("glade")) {
               exec = glade;
           }
           else if (ide.equals("geany")) {
               exec = geany;
           }
           else if (ide.equals("lazarus")) {
               exec = lazarus;
           }
           else if (ide.equals("pycharm")) {
               exec = pycharm;
           }
           else if (ide.equals("pencil")) {
               exec = pencil;
           }
           else if (ide.equals("brackets")) {
               exec = brackets;
           }
           else if (ide.equals("adt")) {
               exec = adt;
           }else if (ide.equals("pintasan")) {
               exec = pintasan;
           }
           
        
           file = new File(exec); // tujuan file yang ter install
           
           //pengecekan
            if(file.exists() && (file.isFile() || file.isDirectory() )){   // jika file ada            
                return true;
            }
            
            return false;
    }
    
}
