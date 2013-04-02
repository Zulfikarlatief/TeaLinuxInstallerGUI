/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doscom.TeaLinuxInstaller.template;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author zword
 */
public class PanelBackground extends JPanel{
    private Image image;
    
    public PanelBackground() {
        setOpaque(false);

        image = new ImageIcon(getClass().getResource("/com/doscom/TeaLinuxInstaller/picture/tealinuxideinstaller.png")).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gd = (Graphics2D) g.create();
        image = new ImageIcon(getClass().getResource("/com/doscom/TeaLinuxInstaller/picture/tealinuxideinstaller.png")).getImage();
        gd.drawImage(image, 0, 0,350,200,null);
        gd.dispose();
        super.paintComponent(g);
    }
}
