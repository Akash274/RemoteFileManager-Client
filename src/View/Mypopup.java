/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

/**
 *
 * @author Vinay
 */
public class Mypopup extends JPanel {
    JPopupMenu menu = new JPopupMenu("Popup");
    Mypopup p1;
    JLabel img;
    JLabel name1;
    public Mypopup(String name,ImageIcon ic) {
        menuConfig();
        p1=this;
        img=new JLabel(ic);
        name1=new JLabel(name);
        p1.add(img);
        p1.add(name1);
        addMouseListener(new PopupTriggerListener());
    }

        class PopupTriggerListener extends MouseAdapter {
          @Override
          public void mousePressed(MouseEvent ev) {
            
              menu.show(ev.getComponent(), ev.getX(), ev.getY());
            
          }

          @Override
          public void mouseReleased(MouseEvent ev) {
            if (ev.isPopupTrigger()) {
              menu.show(ev.getComponent(), ev.getX(), ev.getY());
            }
          }

          @Override
          public void mouseClicked(MouseEvent ev) {
          }
        }
    public void menuConfig() {
        JMenuItem item = new JMenuItem("View");
        item.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            System.out.println("View "+p1.name1.getText());
            //call download and open exe
          }
        });
        menu.add(item);

        item = new JMenuItem("Edit");
        item.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            System.out.println("Edit");
            //call download and open exe
          }
        });
        menu.add(item);
         item = new JMenuItem("Share");
        item.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            System.out.println("Share");
            // call copy function
          }
        });
        menu.add(item);
         item = new JMenuItem("Delete");
        item.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            System.out.println("Delete");
            //call delete function
          }
        });
        menu.add(item);
    }
}
