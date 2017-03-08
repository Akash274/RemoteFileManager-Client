/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Vinay
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    String Files[];
    public MainWindow(String f[]) {
        initComponents();
        Files=f;
        displayDemo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
    }
    void displayDemo(){
        final int MAX_PER_ROW=getContentPane().getWidth()/150;
       
        Mypopup jp;
        
        URL url=MainWindow.class.getResource("/images/doc.png");
        ImageIcon icon=new ImageIcon(url);
        Image resized=icon.getImage().getScaledInstance(50, 80, 
                    java.awt.Image.SCALE_SMOOTH);
        ImageIcon doc=new ImageIcon(resized);
        url=MainWindow.class.getResource("/images/ppt.png");
        icon=new ImageIcon(url);
        resized=icon.getImage().getScaledInstance(50, 80, 
                    java.awt.Image.SCALE_SMOOTH);
        ImageIcon ppt=new ImageIcon(resized);
        url=MainWindow.class.getResource("/images/xls.png");
        icon=new ImageIcon(url);
        resized=icon.getImage().getScaledInstance(50, 80, 
                    java.awt.Image.SCALE_SMOOTH);
        ImageIcon xls=new ImageIcon(resized);
        url=MainWindow.class.getResource("/images/unknown.png");
        icon=new ImageIcon(url);
        resized=icon.getImage().getScaledInstance(50, 80, 
                    java.awt.Image.SCALE_SMOOTH);
        ImageIcon kn=new ImageIcon(resized);
        
        
        
        int nor=(int) Math.ceil(Files.length/MAX_PER_ROW);
        JPanel jPanel1=new JPanel(new GridLayout(MAX_PER_ROW-1,nor));
        for(String str1:Files){
          
            if(str1.contains("ppt"))
                  jp=new Mypopup(str1,ppt);
            else if(str1.contains("doc"))
                jp=new Mypopup(str1,doc);
            else if(str1.contains("xls"))
                jp=new Mypopup(str1,xls);
            else
            jp=new Mypopup(str1,kn);
            //jp.setBounds(x,y,150,150);
            
            jPanel1.add(jp);
        }
        JScrollPane jsp=new JScrollPane(jPanel1);
        this.setLayout(new BorderLayout());
        this.add(jsp,BorderLayout.CENTER);
        pack();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}