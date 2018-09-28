
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Indunil Sensly
 */
public class Issue_Books extends javax.swing.JFrame {
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    
    public Issue_Books() {
        super("Issue Book");
        initComponents();
        con=DBConnection.getConnection();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField4_publisher = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2_Bname = new javax.swing.JTextField();
        jButton1_search_book = new javax.swing.JButton();
        jTextField3_edition = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField5_price = new javax.swing.JTextField();
        jTextField1_Book_ID = new javax.swing.JTextField();
        jTextField6_pages = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField8_Sname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField7_student_id = new javax.swing.JTextField();
        jTextField12_year = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField10_caurse = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField9_father_name = new javax.swing.JTextField();
        jButton1_search_student = new javax.swing.JButton();
        jTextField11_branch = new javax.swing.JTextField();
        jTextField13_semester = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        dateChooserPanel1 = new datechooser.beans.DateChooserPanel();
        jButton1_issue = new javax.swing.JButton();
        jButton2_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 102, 0))); // NOI18N

        jLabel3.setText("Edition");

        jTextField4_publisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4_publisherActionPerformed(evt);
            }
        });

        jLabel1.setText("Boolk ID");

        jButton1_search_book.setText("Search");
        jButton1_search_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_search_bookActionPerformed(evt);
            }
        });

        jLabel6.setText("Pages");

        jLabel2.setText("Name");

        jTextField1_Book_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_Book_IDActionPerformed(evt);
            }
        });

        jTextField6_pages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6_pagesActionPerformed(evt);
            }
        });

        jLabel5.setText("Price");

        jLabel4.setText("Publisher");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1_Book_ID)
                    .addComponent(jTextField2_Bname)
                    .addComponent(jTextField3_edition)
                    .addComponent(jTextField4_publisher)
                    .addComponent(jTextField5_price)
                    .addComponent(jTextField6_pages, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1_search_book)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1_Book_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1_search_book))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2_Bname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3_edition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4_publisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6_pages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 102, 0))); // NOI18N

        jLabel13.setText("Semester");

        jLabel11.setText("Branch");

        jLabel7.setText("Student ID");

        jLabel9.setText("Father Name");

        jLabel12.setText("Year");

        jButton1_search_student.setText("Search");
        jButton1_search_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_search_studentActionPerformed(evt);
            }
        });

        jLabel10.setText("Course");

        jLabel8.setText("Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField7_student_id)
                    .addComponent(jTextField8_Sname)
                    .addComponent(jTextField9_father_name)
                    .addComponent(jTextField10_caurse)
                    .addComponent(jTextField11_branch)
                    .addComponent(jTextField12_year)
                    .addComponent(jTextField13_semester, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton1_search_student)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7_student_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1_search_student))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextField8_Sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField9_father_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField10_caurse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField11_branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField12_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField13_semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLabel14.setText("Date of Issue");

        jButton1_issue.setText("Issue");
        jButton1_issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_issueActionPerformed(evt);
            }
        });

        jButton2_back.setText("Back");
        jButton2_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1_issue)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel14)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(dateChooserPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2_back)
                                .addGap(121, 121, 121)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateChooserPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1_issue)
                            .addComponent(jButton2_back))))
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1000, 944));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6_pagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6_pagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6_pagesActionPerformed

    private void jTextField1_Book_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_Book_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_Book_IDActionPerformed

    private void jButton2_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_backActionPerformed
        setVisible(false);
        Home ob = new Home();
        ob.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2_backActionPerformed

    private void jButton1_search_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_search_bookActionPerformed
            String sql="select * from Book where Book_ID=?";
            try{
                pst=con.prepareStatement(sql);
                pst.setString(1,jTextField1_Book_ID.getText());
                rs=pst.executeQuery();
                if(rs.next()){
                    String add1=rs.getString("Name");
                    jTextField2_Bname.setText(add1);
                    
                    String add2=rs.getString("Edition");
                    jTextField3_edition.setText(add2);
                    
                    String add3=rs.getString("Publisher");
                    jTextField4_publisher.setText(add3);
                    
                    String add4=rs.getString("Price");
                    jTextField5_price.setText(add4);
                    
                    String add5=rs.getString("Pages");
                    jTextField6_pages.setText(add5);
                    
                    rs.close();
                    pst.close();                   
                }else{
                    JOptionPane.showMessageDialog(null,"Book ID is not found ");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }finally{
                try{
                    rs.close();
                    pst.close();
                }catch(Exception e){
                    
                }
            }
            
    }//GEN-LAST:event_jButton1_search_bookActionPerformed

    private void jTextField4_publisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4_publisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_publisherActionPerformed

    private void jButton1_search_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_search_studentActionPerformed
            String sql="select * from students where Student_ID=?";
            try{
                pst=con.prepareStatement(sql);
                pst.setString(1,jTextField7_student_id.getText());
                rs=pst.executeQuery();
                if(rs.next()){
                    String add1=rs.getString("Name");
                    jTextField8_Sname.setText(add1);
                    
                    String add2=rs.getString("Father_Name");
                    jTextField9_father_name.setText(add2);
                    
                    String add3=rs.getString("Course");
                    jTextField10_caurse.setText(add3);
                    
                    String add4=rs.getString("Branch");
                    jTextField11_branch.setText(add4);
                    
                    String add5=rs.getString("Year");
                    jTextField12_year.setText(add5);
                    
                    String add6=rs.getString("Semester");
                    jTextField13_semester.setText(add6);
                    
                    rs.close();
                    pst.close();                   
                }else{
                    JOptionPane.showMessageDialog(null,"Student ID is not found ");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }finally{
                try{
                    rs.close();
                    pst.close();
                }catch(Exception e){
                    
                }
            }
            
    }//GEN-LAST:event_jButton1_search_studentActionPerformed

    private void jButton1_issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_issueActionPerformed
            String sql="insert into Issue(Book_ID,B_Name,Edition,Publisher,Price,Pages,Student_id,S_name,F_name,Course,Branch,Year,Semester,DateOfIssue) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try{
                pst=con.prepareStatement(sql);
                pst.setString(1,jTextField1_Book_ID.getText());
                pst.setString(2,jTextField2_Bname.getText());
                pst.setString(3,jTextField3_edition.getText());
                pst.setString(4,jTextField4_publisher.getText());
                pst.setString(5,jTextField5_price.getText());
                pst.setString(6,jTextField6_pages.getText());
                pst.setString(7,jTextField7_student_id.getText());
                pst.setString(8,jTextField8_Sname.getText());
                pst.setString(9,jTextField9_father_name.getText());
                pst.setString(10,jTextField10_caurse.getText());
                pst.setString(11,jTextField11_branch.getText());
                pst.setString(12,jTextField12_year.getText());
                pst.setString(13,jTextField13_semester.getText());
                pst.setString(14,jTextField12_year.getText());
                //pst.setString(14,(JTextField)dateChooserPanel1.getDebugGraphicsOptions().get;
                pst.execute();
                JOptionPane.showMessageDialog(null,"Book Issued");
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_issueActionPerformed

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
            java.util.logging.Logger.getLogger(Issue_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Issue_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Issue_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issue_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Issue_Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserPanel dateChooserPanel1;
    private javax.swing.JButton jButton1_issue;
    private javax.swing.JButton jButton1_search_book;
    private javax.swing.JButton jButton1_search_student;
    private javax.swing.JButton jButton2_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTextField jTextField10_caurse;
    private javax.swing.JTextField jTextField11_branch;
    private javax.swing.JTextField jTextField12_year;
    private javax.swing.JTextField jTextField13_semester;
    private javax.swing.JTextField jTextField1_Book_ID;
    private javax.swing.JTextField jTextField2_Bname;
    private javax.swing.JTextField jTextField3_edition;
    private javax.swing.JTextField jTextField4_publisher;
    private javax.swing.JTextField jTextField5_price;
    private javax.swing.JTextField jTextField6_pages;
    private javax.swing.JTextField jTextField7_student_id;
    private javax.swing.JTextField jTextField8_Sname;
    private javax.swing.JTextField jTextField9_father_name;
    // End of variables declaration//GEN-END:variables
}
