/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doscom.TeaLinuxInstaller.controller;

import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author zword
 */
public class IdeController {
    private String command;
    
 
    public void setCommand(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
    
    public void bashExecute(){
            try  {
			Process proc=Runtime.getRuntime().exec(getCommand());
			JOptionPane read=new JOptionPane(new InputStreamReader(proc.getInputStream()));

			while(read.getWantsInput())
			{
				JOptionPane.showMessageDialog(null, read.getMessage());
			}
                        
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
    }
    
    public void codeBlockInstall(){
        setCommand("sh /media/TEA5KKC/IDEPACK/Codeblocks.tea");
        bashExecute();
    }
    
    public void netBeansInstall(){
        setCommand("sh /media/TEA5KKC/IDEPACK/netbeans-7.2.1-ml-linux.sh");
        bashExecute();
    }
    
    public void eclipseInstall(){
        setCommand("sh /media/TEA5KKC/IDEPACK/Eclipse.tea");
        bashExecute();
    }
    
    public void boaConstructorInstall(){
        setCommand("sh /media/TEA5KKC/IDEPACK/Boa.tea");
        bashExecute();
    }
    
    public void gladeInstall(){
        setCommand("sh /media/TEA5KKC/IDEPACK/Glade.tea");
        bashExecute();
    }
    
    public void anjutaInstall(){
        setCommand("sh /media/TEA5KKC/IDEPACK/Anjuta.tea");
        bashExecute();
    }
    
    public void bluefishInstall(){
        setCommand("sh /media/TEA5KKC/IDEPACK/Bluefish.tea");
        bashExecute();
    }
    
    public void gambasInstall(){
        setCommand("sh /media/TEA5KKC/IDEPACK/Gambas.tea");
        bashExecute();
    }
    
    public void aptanaInstall(){
        setCommand("sh /media/TEA5KKC/IDEPACK/Aptana.tea");
        bashExecute();
    }
}
