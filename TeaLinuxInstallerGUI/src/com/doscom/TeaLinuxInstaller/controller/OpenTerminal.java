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
public class OpenTerminal {
    public static void main(String[] args)
	{
		try  {
			Process proc=Runtime.getRuntime().exec("sh /media/zword/tealinux/teaide/pencil-i386.tea");
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
}
