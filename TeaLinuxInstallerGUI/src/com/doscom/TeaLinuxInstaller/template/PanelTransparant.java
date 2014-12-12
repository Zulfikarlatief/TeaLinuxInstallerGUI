/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doscom.TeaLinuxInstaller.template;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author zword
 */

// pengaturan panel transparant
public class PanelTransparant extends JPanel{
    private Color color;

    public PanelTransparant() {
        setOpaque(false);
        color = new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 200);
       
    }

    @Override
    public void setBackground(Color bg) {
        super.setBackground(bg);
        color = new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 200);
        repaint();
            }

    @Override
    protected void paintComponent(Graphics g) {
     Graphics2D gd = (Graphics2D) g.create();
      color = new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 200);
       gd.setColor(color);
       // gd.fillRoundRect(0, 0, getWidth(), getHeight(), getHeight(), getHeight());
       gd.fillRect(0, 0, getWidth(), getHeight());
       gd.dispose();
       super.paintComponent(g);
    }
}
