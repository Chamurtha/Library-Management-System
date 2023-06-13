
import java.awt.print.PrinterException;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thisath Dewsen
 */
public class AllBooks extends javax.swing.JFrame {
        Connection conn;
        ResultSet rs;
        PreparedStatement pst; 
         
    /**
     * Creates new form NewMember
     */
    public AllBooks() {
        super("All Books");
        initComponents();
        //conn = Javaconnect.ConnecrDB(); 
        setExtendedState(MAXIMIZED_BOTH);
        tableLoard();
       
        //setExtendedState(MAXIMIZED_BOTH);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AllBooks = new rojeru_san.complementos.RSTableMetro();
        txtSearch = new javax.swing.JTextField();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover2 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover3 = new rojeru_san.complementos.RSButtonHover();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jPanel1.setBackground(new java.awt.Color(240, 168, 76));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 917));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setText("All Books");

        AllBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        AllBooks.setColorBackgoundHead(new java.awt.Color(255, 255, 204));
        AllBooks.setColorBordeFilas(new java.awt.Color(204, 204, 204));
        AllBooks.setColorBordeHead(new java.awt.Color(204, 204, 204));
        AllBooks.setColorFilasBackgound1(new java.awt.Color(204, 204, 204));
        AllBooks.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        AllBooks.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        AllBooks.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        AllBooks.setColorForegroundHead(new java.awt.Color(51, 51, 51));
        AllBooks.setColorSelBackgound(new java.awt.Color(51, 153, 255));
        AllBooks.setFuenteFilas(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AllBooks.setFuenteFilasSelect(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AllBooks.setFuenteHead(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        AllBooks.setGridColor(new java.awt.Color(153, 153, 153));
        AllBooks.setIntercellSpacing(new java.awt.Dimension(0, 0));
        AllBooks.setRowHeight(28);
        jScrollPane1.setViewportView(AllBooks);

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        rSButtonHover1.setText("Print");
        rSButtonHover1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });

        rSButtonHover2.setBackground(new java.awt.Color(204, 204, 204));
        rSButtonHover2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undo.png"))); // NOI18N
        rSButtonHover2.setText("Back");
        rSButtonHover2.setColorText(new java.awt.Color(0, 0, 0));
        rSButtonHover2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rSButtonHover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover2ActionPerformed(evt);
            }
        });

        rSButtonHover3.setBackground(new java.awt.Color(204, 204, 204));
        rSButtonHover3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cleaning.png"))); // NOI18N
        rSButtonHover3.setText("Clear");
        rSButtonHover3.setColorText(new java.awt.Color(0, 0, 0));
        rSButtonHover3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Book ID or BookName");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSButtonHover2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(rSButtonHover3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1267, Short.MAX_VALUE))))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSButtonHover2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonHover3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonHover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_rSButtonHover2ActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        try{
            conn = Javaconnect.ConnecrDB();
            String sql = "SELECT `bid` AS BookID,`bname` AS BookName, `author` AS Author, `price` AS Price, `page` AS Pages, `categorie` AS CategorieNo, `date` AS ReciveDate, `rackno` AS RackNo, `status`  AS 'Status' FROM`book` WHERE bname LIKE  '%"+txtSearch.getText()+"%' OR bid = '"+txtSearch.getText()+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            AllBooks.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            pst.close();
            rs.close();
            conn.close();
        }catch(Exception e){
             JOptionPane.showMessageDialog(rootPane,e);
             
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
            try {
                // TODO add your handling code here:
                AllBooks.print();
            } catch (PrinterException ex) {
                Logger.getLogger(AllBooks.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    
    
        
        

    
    //retrieve data from database to table
  
    private void tableLoard(){
        //load table from database
        try{
            conn = Javaconnect.ConnecrDB();
            String sql = "SELECT `bid` AS BookID,`bname` AS BookName, `author` AS Author, `price` AS Price, `page` AS Pages, `categorie` AS CategorieNo, `date` AS ReciveDate, `rackno` AS RackNo, `status`  AS 'Status' FROM`book`";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            AllBooks.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            pst.close();
            rs.close();
            conn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,e);
        }
   
   
        
    }
    

   
    


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
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSTableMetro AllBooks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover2;
    private rojeru_san.complementos.RSButtonHover rSButtonHover3;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}