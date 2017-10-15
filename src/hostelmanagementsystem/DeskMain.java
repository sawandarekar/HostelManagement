/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DeskMain.java
 *
 * Created on Sep 24, 2010, 4:32:39 PM
 */

package hostelmanagementsystem;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultDesktopManager;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Shreeyash
 */
public class DeskMain extends javax.swing.JFrame {
    private JDesktopPane desk;
   

    /** Creates new form DeskMain */
    public DeskMain() {
        initComponents();
        //this.setIconImage(new ImageIcon("/Images/hostellogo.jpg").getImage());
        //this.setIconImage(Toolkit.getDefaultToolkit().getImage("/Images/hostellogo.jpg"));
        desk = new JDesktopPane();
        desk.add(logolbl);
    setContentPane(desk);

    desk.setDesktopManager(new demoMgr());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logolbl = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        showinfo = new javax.swing.JMenuItem();
        showall = new javax.swing.JMenuItem();
        messmenu = new javax.swing.JMenu();
        roominward = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        updatestud = new javax.swing.JMenuItem();
        edit_del = new javax.swing.JMenuItem();
        hostelfee = new javax.swing.JMenu();
        hostelf = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        changepass = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hostel Management System");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        logolbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logolbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/host_)desk.jpg"))); // NOI18N
        logolbl.setLabelFor(jPanel1);
        logolbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(logolbl);
        logolbl.setBounds(180, 220, 480, 120);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(50, 20, 0, 2);

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStudent(evt);
            }
        });
        jMenu1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jMenu1PropertyChange(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Block.pgt.jpg"))); // NOI18N
        jMenuItem1.setText("New Student");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStudent(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        showinfo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        showinfo.setText("Show Information");
        showinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showInfo(evt);
            }
        });
        jMenu1.add(showinfo);

        showall.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        showall.setText("Show All");
        showall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAll(evt);
            }
        });
        jMenu1.add(showall);

        messmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Notes.jpg"))); // NOI18N
        messmenu.setText("Fee's Inward");
        messmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messMenuClicked(evt);
            }
        });

        roominward.setText("Room");
        roominward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomInward(evt);
            }
        });
        messmenu.add(roominward);

        jMenuItem11.setText("Mess");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messMenuClicked(evt);
            }
        });
        messmenu.add(jMenuItem11);

        jMenu1.add(messmenu);
        jMenu1.add(jSeparator1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/es.jpg"))); // NOI18N
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Edit");

        updatestud.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        updatestud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BrushSZ.jpg"))); // NOI18N
        updatestud.setText("Update");
        updatestud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_Update_Clicked(evt);
            }
        });
        jMenu3.add(updatestud);

        edit_del.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        edit_del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Recycle Bin Full.jpg"))); // NOI18N
        edit_del.setText("Delete");
        edit_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDeleteClicked(evt);
            }
        });
        jMenu3.add(edit_del);

        jMenuBar1.add(jMenu3);

        hostelfee.setText("View");
        hostelfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostelFeeClicked(evt);
            }
        });

        hostelf.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        hostelf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fee.jpg"))); // NOI18N
        hostelf.setText("Hostel Fee's");
        hostelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostelFeeClicked(evt);
            }
        });
        hostelfee.add(hostelf);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fee.jpg"))); // NOI18N
        jMenuItem5.setText("Mess Fee's");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messFeeClicked(evt);
            }
        });
        hostelfee.add(jMenuItem5);

        jMenuBar1.add(hostelfee);

        jMenu4.setText("User Info");

        changepass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/System_Locked.jpg"))); // NOI18N
        changepass.setText("Change Password");
        changepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepassActionPerformed(evt);
            }
        });
        jMenu4.add(changepass);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-900)/2, (screenSize.height-700)/2, 900, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jMenu1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1PropertyChange

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void newStudent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStudent
        // TODO add your handling code here:
        System.out.println("clicked on new student");
        //this.setEnabled(false);
       // NewStudent ns = new NewStudent();
        //ns.setVisible(true);
        //this.setEnabled(false);
        NewStudent ns;
        try {
            ns = new NewStudent();
            this.add(ns);
            try {
                ns.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        //ns1.doDefaultCloseAction();
        //ns1.setIcon(true);      

        /*
        NewStudent ns = new NewStudent();
        this.setContentPane(ns.getContentPane());
        this.requestFocus();*/
        //JOptionPane.showMessageDialog(this, ns.getContentPane());
    }//GEN-LAST:event_newStudent

    private void showInfo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showInfo
        // TODO add your handling code here:
        ShowStudentInformation si = null;
        try {
            si = new ShowStudentInformation();
            this.add(si);
            try {
                si.setSelected(true);
            } catch (Exception ex) {
                Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_showInfo

    private void showAll(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAll
        // TODO add your handling code here:
        ShowInformation si;
        try {
            si = new ShowInformation();
            this.add(si);
            try {
                si.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_showAll

    private void roomInward(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomInward
        // TODO add your handling code here:
        RoomInwardEntry si;
        try {
            si = new RoomInwardEntry();
            this.add(si);
            try {
                si.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_roomInward

    private void messMenuClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messMenuClicked
        // TODO add your handling code here:
        MessInwardEntry si;
        try {
            si = new MessInwardEntry();
            this.add(si);
            try {
                si.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_messMenuClicked

    private void Edit_Update_Clicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_Update_Clicked
        // TODO add your handling code here:
        UpdateStudent si;
        try {
            si = new UpdateStudent();
            this.add(si);
            try {
                si.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Edit_Update_Clicked

    private void editDeleteClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDeleteClicked
        // TODO add your handling code here:
        DeleteStudent si;
        try {
            si = new DeleteStudent();
            this.add(si);
            try {
                si.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editDeleteClicked

    private void hostelFeeClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostelFeeClicked
        // TODO add your handling code here:
        HostelFees si;
        try {
            si = new HostelFees();
            this.add(si);
            try {
                si.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hostelFeeClicked

    private void messFeeClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messFeeClicked
        // TODO add your handling code here:
         MessFees si;
        try {
            si = new MessFees();
            this.add(si);
            try {
                si.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_messFeeClicked

    private void changepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepassActionPerformed
        // TODO add your handling code here:
        
        ChangePassword si;

        try {
            si = new ChangePassword();
            this.add(si);
            try {
                si.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(DeskMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_changepassActionPerformed
  
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeskMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem changepass;
    private javax.swing.JMenuItem edit_del;
    private javax.swing.JMenuItem hostelf;
    private javax.swing.JMenu hostelfee;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logolbl;
    private javax.swing.JMenu messmenu;
    private javax.swing.JMenuItem roominward;
    private javax.swing.JMenuItem showall;
    private javax.swing.JMenuItem showinfo;
    private javax.swing.JMenuItem updatestud;
    // End of variables declaration//GEN-END:variables

}
class demoMgr extends DefaultDesktopManager {

  // This is called anytime a frame is moved. This
  // implementation keeps the frame from leaving the desktop.
  public void dragFrame(JComponent f, int x, int y) {
    if (f instanceof JInternalFrame) { // Deal only w/internal frames
      JInternalFrame frame = (JInternalFrame) f;
      JDesktopPane desk = frame.getDesktopPane();
      Dimension d = desk.getSize();

      // Nothing all that fancy below, just figuring out how to adjust
      // to keep the frame on the desktop.
      if (x < 0) { // too far left?
        x = 0; // flush against the left side
      } else {
        if (x + frame.getWidth() > d.width) { // too far right?
          x = d.width - frame.getWidth(); // flush against right side
        }
      }
      if (y < 0) { // too high?
        y = 0; // flush against the top
      } else {
        if (y + frame.getHeight() > d.height) { // too low?
          y = d.height - frame.getHeight(); // flush against the
                            // bottom
        }
      }
    }

    // Pass along the (possibly cropped) values to the normal drag handler.
    super.dragFrame(f, x, y);
  }
}