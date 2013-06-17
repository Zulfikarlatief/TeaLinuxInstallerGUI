/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doscom.TeaLinuxInstaller.template;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author zword
 */
public class ButtonImage extends JButton{
     private boolean over;
    private Image image;

    public ButtonImage() {
        setOpaque(false);
       
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorder(new EmptyBorder(3, 3, 3, 3));
        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                setOver(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setOver(false);
            }

        });

    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
        repaint();
    }
    public void setImage(Image image){
        this.image = image;
    }



    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gd = (Graphics2D) g.create();     
        gd.drawImage(image, 0, 0,400,230,null);
        gd.dispose();
        super.paintComponent(g);
    }
}
