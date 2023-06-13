
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thisath Dewsen
 */
public class IssueBook extends javax.swing.JFrame {
    
        Connection conn;
        ResultSet rs;
        PreparedStatement pst; 
    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
        super("Issue Book");
        initComponents();
        //conn = Javaconnect.ConnecrDB(); 
        autoID();
        
        LocalDate today = LocalDate.now();
        LocalDate reday = today.plus(14, ChronoUnit.DAYS);
        
        txtissuedate.setText(today.toString());
        txtreturndate.setText(reday.toString());
        tableLoard();
        setExtendedState(MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        rSScrollBar1 = new rojeru_san.complementos.RSScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtbid = new javax.swing.JTextField();
        txtmid = new javax.swing.JTextField();
        txtmname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtIssueID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtbname = new javax.swing.JTextField();
        txtissuedate = new javax.swing.JTextField();
        txtreturndate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcatno = new javax.swing.JTextField();
        issue = new rojeru_san.complementos.RSButtonHover();
        back = new rojeru_san.complementos.RSButtonHover();
        clear = new rojeru_san.complementos.RSButtonHover();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldetail = new rojeru_san.complementos.RSTableMetro();

        jPanel1.setBackground(new java.awt.Color(240, 168, 76));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 917));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setText("Issue Book");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Due Date");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("MemberID");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Issue Date");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("MemberName");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("BookID");

        txtbid.setBackground(new java.awt.Color(255, 255, 204));
        txtbid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtbid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbidKeyReleased(evt);
            }
        });

        txtmid.setBackground(new java.awt.Color(255, 255, 204));
        txtmid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtmid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmidKeyReleased(evt);
            }
        });

        txtmname.setBackground(new java.awt.Color(255, 255, 204));
        txtmname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("IssueID");

        txtIssueID.setBackground(new java.awt.Color(255, 255, 204));
        txtIssueID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("BookName");

        txtbname.setBackground(new java.awt.Color(255, 255, 204));
        txtbname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtissuedate.setBackground(new java.awt.Color(255, 255, 204));
        txtissuedate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtreturndate.setBackground(new java.awt.Color(255, 255, 204));
        txtreturndate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("CategorieNo");

        txtcatno.setBackground(new java.awt.Color(255, 255, 204));
        txtcatno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        issue.setBackground(new java.awt.Color(204, 204, 204));
        issue.setBorder(null);
        issue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checklist.png"))); // NOI18N
        issue.setText("Issue");
        issue.setColorText(new java.awt.Color(0, 0, 0));
        issue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setBorder(null);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/previous.png"))); // NOI18N
        back.setText("Back");
        back.setColorText(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(204, 204, 204));
        clear.setBorder(null);
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cleaning.png"))); // NOI18N
        clear.setText("Clear");
        clear.setColorText(new java.awt.Color(0, 0, 0));
        clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(240, 168, 76));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbldetail.setModel(new javax.swing.table.DefaultTableModel(
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
        tbldetail.setColorBackgoundHead(new java.awt.Color(255, 255, 204));
        tbldetail.setColorBordeFilas(new java.awt.Color(204, 204, 204));
        tbldetail.setColorBordeHead(new java.awt.Color(204, 204, 204));
        tbldetail.setColorFilasBackgound1(new java.awt.Color(204, 204, 204));
        tbldetail.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tbldetail.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tbldetail.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tbldetail.setColorForegroundHead(new java.awt.Color(51, 51, 51));
        tbldetail.setColorSelBackgound(new java.awt.Color(51, 153, 255));
        tbldetail.setFuenteFilas(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbldetail.setFuenteFilasSelect(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbldetail.setFuenteHead(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbldetail.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbldetail.setRowHeight(28);
        jScrollPane2.setViewportView(tbldetail);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(113, 113, 113)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcatno, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtmid, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                        .addComponent(txtmname, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                        .addComponent(txtbid, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                                    .addComponent(txtIssueID, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbname, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5))
                                .addGap(143, 143, 143)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtissuedate)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtreturndate, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(issue, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(txtIssueID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtmid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtmname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtbid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtbname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtcatno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtissuedate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtreturndate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(issue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        clearField();
    }//GEN-LAST:event_clearActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueActionPerformed
        // TODO add your handling code here:
        String issueid = txtIssueID.getText();
        String mid = txtmid.getText();
        String bid = txtbid.getText();
        String mname = txtmname.getText();
        String bname = txtbname.getText();
        String idate = txtissuedate.getText();
        String rdate = txtreturndate.getText();
        String catno = txtcatno.getText();

        try{
            conn = Javaconnect.ConnecrDB(); 
            String sql = "INSERT INTO `issue`(`iid`, `mid`, `bid`, `bname`, `cat_no`, `i_date`, `r_date`, `status`) VALUES ('"+issueid+"','"+mid+"','"+bid+"','"+bname+"','"+catno+"','"+idate+"','"+rdate+"','Issued')";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(rootPane,"Book Issued Succesfully");
            updateBookStatus();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,e);
        }finally{
            try {
                pst.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }

        autoID();

        tableLoard();
        clearField();

        //data insert to full report

    }//GEN-LAST:event_issueActionPerformed

    private void txtmidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmidKeyReleased
        // TODO add your handling code here:
        //checking already two books issued
        checkIssued();
           
                    
            
        try{
            conn = Javaconnect.ConnecrDB();
            String sql = "SELECT  fullname FROM `member` WHERE mid = '"+txtmid.getText()+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            if(rs.next()){
                txtmname.setText(rs.getString("fullname"));

            }else{
                txtmname.setText("");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try {
                pst.close();
                rs.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_txtmidKeyReleased

    private void txtbidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbidKeyReleased
        // TODO add your handling code here:
        checkBookAvalable();
        try{
            conn = Javaconnect.ConnecrDB();
            String sql = "SELECT  bname, categorie FROM `book` WHERE bid = '"+txtbid.getText()+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            if(rs.next()){
                txtbname.setText(rs.getString("bname"));
                txtcatno.setText(rs.getString("categorie"));

            }else{
                txtbname.setText("");
                txtcatno.setText("");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try {
                pst.close();
                rs.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_txtbidKeyReleased

    
    
    
    private void tableLoard(){
        //load table from database
        
        try{
            conn = Javaconnect.ConnecrDB();
        String sql = "SELECT `iid` as IssueId,`mid` as MemberID, `bid` as BookID, `bname` as BookName, `i_date` as IssueDate, `r_date`as DueDate FROM `issue` WHERE status = 'Issued'";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        tbldetail.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
            JOptionPane.showConfirmDialog(rootPane , e);
        }finally{
            try {
                pst.close();
                rs.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }

    private void autoID(){
        //generate nextId and show
        
        try{
            conn = Javaconnect.ConnecrDB();
        String sql = "SELECT iid FROM issue ORDER BY iid DESC LIMIT 1";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        
        if(rs.next()){
            String idno = rs.getString(1);
            int n = Integer.parseInt(idno);
            n++;
            
            String iid = Integer.toString(n);
            txtIssueID.setText(iid);
        }else{
             txtIssueID.setText("000");
        }
        
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
            
        }finally{
            try {
                pst.close();
                rs.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
      
    }
    
    
    private void clearField(){
        
        //clear textfield
   
 
        txtmid.setText("");
        txtmname.setText(""); 
        txtbid.setText("");
        txtbname.setText("");
        txtcatno.setText("");
        issue.setEnabled(true);
     
    }
    
    //update method book status after issue
    private void updateBookStatus(){
        
        
        try{
            conn = Javaconnect.ConnecrDB();
            String sql = "UPDATE book  SET status = 'Book is Issued' WHERE bid ='"+txtbid.getText()+"'";
        
        pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(rootPane, "Book Status Updated Succesfully");
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }finally{
            try {
                pst.close();
                
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    private void checkIssued(){
        try{
            conn = Javaconnect.ConnecrDB();
            String sql = "SELECT COUNT(iid) FROM issue WHERE mid = '"+txtmid.getText()+"' AND status = 'Issued'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                String count = rs.getString(1);
                int n = Integer.parseInt(count);
                if(n>=2){
                JOptionPane.showMessageDialog(rootPane, "Already two book issued","ALERT",JOptionPane.WARNING_MESSAGE);
                issue.setEnabled(false);
               
               }else{
                    issue.setEnabled(true);
                }
            }
  
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }finally{
            try {
                pst.close();
                rs.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    
     private void checkBookAvalable(){
        try{
            conn = Javaconnect.ConnecrDB();
            String sql = "SELECT COUNT(bid) FROM book WHERE bid = '"+txtbid.getText()+"' AND status = 'Book is Issued';";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                String count = rs.getString(1);
                int n = Integer.parseInt(count);
                if(n == 1){
                JOptionPane.showMessageDialog(rootPane, "This Book Already Issued Check Book Status","ALERT",JOptionPane.WARNING_MESSAGE);
                issue.setEnabled(false);
               
               }else if(n<1){
                   issue.setEnabled(true);
               }
            }
  
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }finally{
            try {
                pst.close();
                rs.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }
            
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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover back;
    private rojeru_san.complementos.RSButtonHover clear;
    private rojeru_san.complementos.RSButtonHover issue;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private rojeru_san.complementos.RSScrollBar rSScrollBar1;
    private rojeru_san.complementos.RSTableMetro tbldetail;
    private javax.swing.JTextField txtIssueID;
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextField txtbname;
    private javax.swing.JTextField txtcatno;
    private javax.swing.JTextField txtissuedate;
    private javax.swing.JTextField txtmid;
    private javax.swing.JTextField txtmname;
    private javax.swing.JTextField txtreturndate;
    // End of variables declaration//GEN-END:variables
}
