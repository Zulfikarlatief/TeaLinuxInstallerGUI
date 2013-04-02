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
        setCommand("IDE_Pack/codeblocks.tea");
        bashExecute();
    }
    
    public void netBeansInstall(){
        setCommand("IDE_Pack/netbeans.tea");
        bashExecute();
    }
    
    public void eclipseInstall(){
        setCommand("IDE_Pack/ceclipse.tea");
        bashExecute();
    }
    
    public void boaConstructorInstall(){
        setCommand("IDE_Pack/boaconstructor.tea");
        bashExecute();
    }
    
    public void gladeInstall(){
        setCommand("IDE_Pack/glade.tea");
        bashExecute();
    }
    
    public void anjutaInstall(){
        setCommand("IDE_Pack/anjuta.tea");
        bashExecute();
    }
    
    public void bluefishInstall(){
        setCommand("IDE_Pack/bluefish.tea");
        bashExecute();
    }
    
    public void gambasInstall(){
        setCommand("IDE_Pack/gambas.tea");
        bashExecute();
    }
    
    public void aptanaInstall(){
        setCommand("IDE_Pack/aptana.tea");
        bashExecute();
    }
}
