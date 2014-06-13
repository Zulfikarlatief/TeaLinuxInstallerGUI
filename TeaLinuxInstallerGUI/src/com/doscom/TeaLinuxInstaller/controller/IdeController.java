/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doscom.TeaLinuxInstaller.controller;

import static com.doscom.TeaLinuxInstaller.controller.Directory.user;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author zword
 */
public class IdeController {
    private String command;
    
    File file ;

 
    public void setCommand(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
    
    
    public void bashExecute(){
            try {
                String line;
                Process p = Runtime.getRuntime().exec(getCommand());
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
    
    
//    public void makedir(){
//        file = new File("/home/"+user+"/tea");
//        if(!(file.exists() && (file.isFile() || file.isDirectory() ))){
//            setCommand("mkdir /home/"+user+"/tea");
//            bashExecute();
//        }
//    }
    
//    Install
    public void codeBlockInstall(){
        setCommand("sh /media/"+user+"/tealinux/teaide/codeblocks-i386.tea");
        bashExecute();
    }
    
    public void netBeansInstall(){
        setCommand("sh /media/"+user+"/tealinux/teaide/netbeans.sh");
        bashExecute();
    }
    
    public void gladeInstall(){
        setCommand("sh /media/"+user+"/tealinux/teaide/glade-i386.tea");
        bashExecute();
    }
    
    public void aptanaInstall(){
//        makedir();
        file = new File("/opt");
        if(file.getUsableSpace()<1000000000l){
            JOptionPane.showMessageDialog(null, "Memori hardisk penuh");
        }else{
            setCommand("gksudo -- (unzip /media/"+user+"/tealinux/teaide"
                    + "/aptanastudio3.zip -d /opt/) cp /media/"+user+"/tealinux"
                    + "/teaide/pintasan/aptana.desktop /usr/share/applications/");
            bashExecute();
            setCommand("cp /media/"+user+"/tealinux/teaide/pintasan/aptana.desktop /home/"+user+"/Desktop/");
            bashExecute();

        }
    }
    
    public void geanyInstall(){
        setCommand("sh /media/"+user+"/tealinux/teaide/geany-i386.tea");
        bashExecute();
    }
    
    public void lazarusInstall(){
        setCommand("sh /media/"+user+"/tealinux/teaide/lazarus-i386.tea");
        bashExecute();
    }
    
    public void pycharmInstall(){
//        makedir();
        file = new File("/opt");
        if(file.getUsableSpace()<1000000000l){
            JOptionPane.showMessageDialog(null, "Memori hardisk penuh");
        }
        else{
            setCommand("gksudo -- (unzip /media/"+user+"/tealinux/teaide"
                    + "/pycharm.zip -d /opt/) cp /media/"+user+"/tealinux/teaide"
                    + "/pintasan/pycharm.desktop  /usr/share/applications/");
            bashExecute();
            setCommand("cp /media/"+user+"/tealinux/teaide/pintasan/pycharm.desktop  /home/"+user+"/Desktop/");
            bashExecute();

 
        }
    }
    
    public void pencilInstall(){
        setCommand("sh /media/"+user+"/tealinux/teaide/pencil-i386.tea");
        bashExecute();
    }
    
    public void bracketsInstall(){
        setCommand("sh /media/"+user+"/tealinux/teaide/brackets-i386.tea");
        bashExecute();
    }
    
    public void adtInstall(){
        
//        makedir();
        file = new File("/opt");
        if(file.getUsableSpace()<2000000000l){
            JOptionPane.showMessageDialog(null, "Memori hardisk penuh");
        }
        else{
            setCommand("gksudo -- (unzip /media/"+user+"/tealinux/teaide"
                    + "/adt-bundle.zip -d /opt/) cp /media/"+user+"/tealinux"
                    + "/teaide/pintasan/adt.desktop  /usr/share/applications/");
            bashExecute();
            setCommand("cp /media/"+user+"/tealinux/teaide/pintasan/adt.desktop  /home/"+user+"/Desktop/");
            bashExecute();

        }
    }
    
    
    
//    Uninstall
    public void codeBlocksUninstall(){
        setCommand("gksudo -- apt-get remove codeblocks -y");
        bashExecute();        
    }
    
    public void netBeansUninstall(){
        setCommand("sh /home/"+user+"/netbeans-8.0/uninstall.sh");
        bashExecute();        
    }
   
    public void pencilUninstall(){
        setCommand("gksudo -- apt-get remove evoluspencil -y");
        bashExecute();   
    }
    
    public void gladeUnInstall(){
        setCommand("gksudo -- apt-get remove glade -y");
        bashExecute();
    }
    
    public void aptanaUnInstall(){
        setCommand("gksudo -- (rm -rf /opt/aptanastudio3) rm /usr/share/applications/aptana.desktop");
        bashExecute();
        setCommand("rm /home/"+user+"/Desktop/aptana.desktop");
        bashExecute();
    }
    
    public void geanyUnInstall(){
        setCommand("gksudo -- apt-get remove geany -y");
        bashExecute();
    }
    
    public void lazarusUnInstall(){
        setCommand("gksudo -- apt-get remove lazarus -y");
        bashExecute();
    }
    
    public void pycharmUnInstall(){
        setCommand("gksudo -- (rm -rf /opt/pycharm) rm /usr/share/applications/pycharm.desktop");
        bashExecute();
        setCommand("rm /home/"+user+"/Desktop/pycharm.desktop");
        bashExecute();

    }
    
    public void bracketsUnInstall(){
        setCommand("gksudo -- apt-get remove brackets -y");
        bashExecute();
    }
    
    public void adtUnInstall(){
        setCommand("gksudo -- (rm -rf /opt/adt-bundle) rm /usr/share/applications/adt.desktop");
        bashExecute();
        setCommand("rm /home/"+user+"/Desktop/adt.desktop");
        bashExecute();

    }
}
