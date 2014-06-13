/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doscom.TeaLinuxInstaller.view;

import com.doscom.TeaLinuxInstaller.controller.Description;
import static com.doscom.TeaLinuxInstaller.controller.Directory.user;
import com.doscom.TeaLinuxInstaller.controller.IdeController;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.text.Caret;
import javax.swing.text.DefaultCaret;

/**
 *
 * @author zword
 */

// Frame Utama
public class InstallerFrame extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form Test
     */
    File file = new  File("/media/"+user+"/tealinux/teaide");
    

    
    DisplayPanel dp;
    String ide ;
    private IdeController controller;
    Timer time = new Timer(4000,this); // set timer 4 detik setelah dibuat
    
    public boolean install=false; // acuan apakah sedang proses install / tidak
    
    public InstallerFrame() throws IOException {
        initComponents();
        listIDE2.setFrame(this);
        setScroll();
        
        controller = new IdeController();
       // this.initForm();
        this.setResizable(false);// fungsi agar tidak bisa diubah ukurannya
        Image i = ImageIO.read(getClass().getResource("/com/doscom/TeaLinuxInstaller/picture/tealogo.png"));
        setIconImage(i);       
        centerWindow();
        setDisplay("init");
        setDescription("init");
        
        time.start();
    }
    
    
    private void setScroll(){// scroll handle sementara 
       DefaultCaret caret = (DefaultCaret) textAreaDescription.getCaret();
        caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
    }

    public JButton getInstallButton() {
        return installButton;
    }

    public JTextArea getTextAreaDescription() {
        return textAreaDescription;
    }
    
    
    
    private void initForm(){
        Toolkit tk = Toolkit.getDefaultToolkit();  
        int xSize = ((int) tk.getScreenSize().getWidth());  
        int ySize = ((int) tk.getScreenSize().getHeight());  
        this.setSize(xSize,ySize);   
    }
    
    public void setDisplay(String Ide){// method untuk mensetting display di display panel
        if(null!=dp)
            dp.dispose();
  
        dp = new DisplayPanel(Ide);
        jDesktopPane1.add(dp);
        dp.setVisible(true);
        this.ide = Ide;
  
    }
    
    public void setDescription(String Ide){// method utuk menyetting deskripsi di text area
        if(Ide.equals("init")){
            textAreaDescription.setText(Description.init);
        }
        else if (Ide.equals("codeblock")) {
            textAreaDescription.setText(Description.codeBlock);
        }
        else if (Ide.equals("netbeans")) {
            textAreaDescription.setText(Description.netBeans);
        }
        else if (Ide.equals("glade")) {
            textAreaDescription.setText(Description.glade);
        }
        else if (Ide.equals("aptana")) {
            textAreaDescription.setText(Description.aptana);
        }
        else if (Ide.equals("geany")) {
            textAreaDescription.setText(Description.geany);
        }
        else if (Ide.equals("lazarus")) {
            textAreaDescription.setText(Description.lazarus);
        }
        else if (Ide.equals("pycharm")) {
            textAreaDescription.setText(Description.pycharm);
        }
        else if (Ide.equals("pencil")) {
            textAreaDescription.setText(Description.pencil);
        }
        else if (Ide.equals("brackets")) {
            textAreaDescription.setText(Description.brackets);
        }
        else if (Ide.equals("adt")) {
            textAreaDescription.setText(Description.adt);
        }

        
    }
    
    
    private void warning() throws IOException{
        
        JOptionPane jop = new JOptionPane(
            "Please Insert TeaLinux 6.0 DVD ",
            JOptionPane.QUESTION_MESSAGE,
            JOptionPane.DEFAULT_OPTION
            );

        JDialog dialog = jop.createDialog("Warning");

        Image image = ImageIO.read(getClass().getResource(
            "/com/doscom/TeaLinuxInstaller/picture/tealogo.png"));
        dialog.setIconImage( image );
        dialog.setVisible(true);
    }
    
    private void centerWindow(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

       
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;

        
        this.setLocation(x, y);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        remake1 = new com.doscom.TeaLinuxInstaller.view.Remake();
        jScrollPane1 = new javax.swing.JScrollPane();
        listIDE2 = new com.doscom.TeaLinuxInstaller.view.ListIDE();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaDescription = new javax.swing.JTextArea();
        installButton = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TeaLinux IDE Installer");

        remake1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane1.setViewportView(listIDE2);

        javax.swing.GroupLayout remake1Layout = new javax.swing.GroupLayout(remake1);
        remake1.setLayout(remake1Layout);
        remake1Layout.setHorizontalGroup(
            remake1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, remake1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        remake1Layout.setVerticalGroup(
            remake1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, remake1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        textAreaDescription.setColumns(20);
        textAreaDescription.setFont(new java.awt.Font("NanumGothic", 0, 14)); // NOI18N
        textAreaDescription.setLineWrap(true);
        textAreaDescription.setRows(5);
        textAreaDescription.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        textAreaDescription.setOpaque(false);
        jScrollPane2.setViewportView(textAreaDescription);

        installButton.setText("Install");
        installButton.setEnabled(false);
        installButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                installButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(installButton)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)))
                .addComponent(remake1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(remake1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(installButton)
                        .addGap(18, 18, 18)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void installButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_installButtonActionPerformed
        // TODO add your handling code here:
        file = new File("/media/"+user+"/tealinux/teaide");
        installButton.setEnabled(false); // button di disable selama proses
        this.install = true; //dalam proses install jadi
        if((!(file.exists() && file.isDirectory())) && (installButton.getText().equals("Install"))){ // apakah file ada ? , dam apakah tombol install
            try {
                warning();
            } catch (IOException ex) {
                Logger.getLogger(InstallerFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            
            if(installButton.getText().equals("Install")){
                if(this.ide.equals("codeblock"))
                    controller.codeBlockInstall();
                else if (this.ide.equals("netbeans")) {
                    controller.netBeansInstall();
                }
                else if (this.ide.equals("aptana")) {
                    controller.aptanaInstall();
                }
                else if (this.ide.equals("glade")) {
                    controller.gladeInstall();
                }
                else if (this.ide.equals("geany")) {
                    controller.geanyInstall();
                }
                else if (this.ide.equals("lazarus")) {
                    controller.lazarusInstall();
                }
                else if (this.ide.equals("pycharm")) {
                    controller.pycharmInstall();
                }
                else if (this.ide.equals("pencil")) {
                    controller.pencilInstall();
                }
                else if (this.ide.equals("brackets")) {
                    controller.bracketsInstall();
                }
                else if (this.ide.equals("adt")) {
                    controller.adtInstall();
                }
            // tambahan
                
                if(listIDE2.directory.cek(this.ide)){// ketika file berhasi terinstall
                    JOptionPane.showMessageDialog(null, "Install Finished");
                    installButton.setText("Uninstall");
                }
            
            }
            else if(installButton.getText().equals("Uninstall")){
                if(0==JOptionPane.showConfirmDialog(null, "<html>Apakah anda yakin ingin menghapus "
                        + "<b><i>"+ide.toUpperCase()+"</i></b></html>"
                        , "Uninstall" , 2)){
                    
                    if(this.ide.equals("codeblock")){
                        controller.codeBlocksUninstall();
                    }
                    else if(this.ide.equals("netbeans")){
                        controller.netBeansUninstall();
                    }
                    else if(this.ide.equals("pencil")){
                        controller.pencilUninstall();
                    }
                    else if (this.ide.equals("aptana")) {
                        controller.aptanaUnInstall();
                    }
                    else if (this.ide.equals("glade")) {
                        controller.gladeUnInstall();
                    }
                    else if (this.ide.equals("geany")) {
                        controller.geanyUnInstall();
                    }
                    else if (this.ide.equals("lazarus")) {
                        controller.lazarusUnInstall();
                    }
                    else if (this.ide.equals("pycharm")) {
                        controller.pycharmUnInstall();
                    }
                    else if (this.ide.equals("brackets")) {
                        controller.bracketsUnInstall();
                    }
                    else if (this.ide.equals("adt")) {
                        controller.adtUnInstall();
                    }

                    
                    if(!listIDE2.directory.cek(ide)){
                        JOptionPane.showMessageDialog(null, "Uninstall Finished");
                        installButton.setText("Install");
                    }
                }
            }
        
        }
        
        this.install = false; // proses install selesai
        installButton.setEnabled(true); //button di enabled
    }//GEN-LAST:event_installButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton installButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.doscom.TeaLinuxInstaller.view.ListIDE listIDE2;
    private com.doscom.TeaLinuxInstaller.view.Remake remake1;
    private javax.swing.JTextArea textAreaDescription;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent arg0) {
        
        
        if(!(file.exists() && file.isDirectory())){ // cek directory
            try {
                warning();
            } catch (IOException ex) {
                Logger.getLogger(InstallerFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        time.stop();
    }
}
