
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.awt.geom.RoundRectangle2D;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class PayrollMainFrame extends javax.swing.JFrame {

    int positionX=0, positionY=0;
    
    public PayrollMainFrame() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        //Rounded Corners        
        setShape(new RoundRectangle2D.Double(0,0, getWidth(), getHeight(), 50,50));
        //Text field design
        employeeID_jTextField.setBackground(new java.awt.Color(0, 0, 0,1));
        workDays_jTextField.setBackground(new java.awt.Color(0, 0, 0,1));              
    }
   
    //==================================Update Payroll Database Function===============================
    public void updateDB(int grossPay, int Tax, int SSS, int Pagibig, int NetPay){
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");           
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","jesus123"); 
            String sql = "update employee set WorkDays=?, GrossSalary=?, Tax=?, SSS=?, Pagibig=?, NetPay=? where EmployeeID=? ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(workDays_jTextField.getText()));
            pstmt.setInt(2, grossPay);
            pstmt.setInt(3, Tax);
            pstmt.setInt(4, SSS);
            pstmt.setInt(5, Pagibig);
            pstmt.setInt(6, NetPay);            
            pstmt.setInt(7,Integer.parseInt(employeeID_jTextField.getText()));
         
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated Successfully");
            conn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
            
        }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        back_payroll2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        employeeID_jTextField = new javax.swing.JTextField();
        workDays_jTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        done_jButton = new javax.swing.JButton();
        back_payroll3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        back_payroll1 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        employeeID_jLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        employeeName_jLabel = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        pagibigWord_jLabel = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        grossPay_jLabel = new javax.swing.JLabel();
        logout_icon1 = new javax.swing.JLabel();
        tax_jLabel = new javax.swing.JLabel();
        sss_jLabel = new javax.swing.JLabel();
        pagibig_jLabel = new javax.swing.JLabel();
        netPay_jLabel = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        employeeID_jLabel1 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        employeeName_jLabel1 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        logout_icon2 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Log In");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 459, 190, 50));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Making the world better");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 300, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Database");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 190, 50));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("one app at a time");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Purple_Trend_in_Logo_Design___25_Examples___Logos___Graphic_Design_Junction-removebg-preview.png"))); // NOI18N
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 100, 30));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Innotec");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 120, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PurpleGUI_Menu.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 650));

        back_payroll2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/left-arrow (2).png"))); // NOI18N
        back_payroll2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_payroll2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_payroll2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 101, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(back_payroll2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(back_payroll2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab1", jPanel2);

        jPanel8.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 255));
        jLabel14.setText("Days of Work");
        jPanel8.add(jLabel14);
        jLabel14.setBounds(160, 330, 160, 21);

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 255));
        jLabel15.setText("Employee Number:");
        jPanel8.add(jLabel15);
        jLabel15.setBounds(150, 250, 190, 21);

        employeeID_jTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        employeeID_jTextField.setForeground(new java.awt.Color(255, 255, 255));
        employeeID_jTextField.setBorder(null);
        employeeID_jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                employeeID_jTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                employeeID_jTextFieldKeyReleased(evt);
            }
        });
        jPanel8.add(employeeID_jTextField);
        employeeID_jTextField.setBounds(150, 290, 180, 30);

        workDays_jTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        workDays_jTextField.setForeground(new java.awt.Color(255, 255, 255));
        workDays_jTextField.setBorder(null);
        workDays_jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                workDays_jTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                workDays_jTextFieldKeyReleased(evt);
            }
        });
        jPanel8.add(workDays_jTextField);
        workDays_jTextField.setBounds(150, 362, 180, 30);

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Innotec");
        jPanel8.add(jLabel17);
        jLabel17.setBounds(160, 90, 132, 43);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel11);
        jLabel11.setBounds(370, 10, 32, 30);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Purple_Trend_in_Logo_Design___25_Examples___Logos___Graphic_Design_Junction-removebg-preview.png"))); // NOI18N
        jPanel8.add(jLabel18);
        jLabel18.setBounds(60, 70, 100, 80);

        done_jButton.setBackground(new java.awt.Color(159, 74, 227));
        done_jButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        done_jButton.setForeground(new java.awt.Color(255, 255, 255));
        done_jButton.setText("Done");
        done_jButton.setEnabled(false);
        done_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                done_jButtonActionPerformed(evt);
            }
        });
        jPanel8.add(done_jButton);
        done_jButton.setBounds(130, 470, 160, 50);

        back_payroll3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/left-arrow (2).png"))); // NOI18N
        back_payroll3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_payroll3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_payroll3MouseClicked(evt);
            }
        });
        jPanel8.add(back_payroll3);
        back_payroll3.setBounds(20, 20, 32, 32);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PurpleGUI_MenuFinal.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel8.add(jLabel13);
        jLabel13.setBounds(0, 0, 420, 640);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 101, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmployeeID", "Name", "Rate", "Days", "Gross Salary", "Tax", "SSS", "Pagibig", "Net Pay"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(204, 153, 255));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 400, 209));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 153, 255));
        jLabel8.setText("Payroll");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 140, -1));

        back_payroll1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/left-arrow (2).png"))); // NOI18N
        back_payroll1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_payroll1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_payroll1MouseClicked(evt);
            }
        });
        jPanel4.add(back_payroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel32.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 255));
        jLabel32.setText("Innotec");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Purple_Trend_in_Logo_Design___25_Examples___Logos___Graphic_Design_Junction-removebg-preview.png"))); // NOI18N
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 100, 30));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel38.setText("Employee");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross.png"))); // NOI18N
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PurpleGUI_Table.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 420, 640));

        jTabbedPane1.addTab("tab3", jPanel4);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setText("jLabel20");
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 259, 43, -1));

        jLabel22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 23)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 255));
        jLabel22.setText("Innotec");
        jPanel9.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 90, 30));

        jLabel19.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Employee ID:");
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        employeeID_jLabel.setFont(new java.awt.Font("Segoe UI", 0, 43)); // NOI18N
        employeeID_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        employeeID_jLabel.setText("jLabel24");
        jPanel9.add(employeeID_jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 280, 60));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Database");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 300, 100, 30));

        employeeName_jLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        employeeName_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        employeeName_jLabel.setText("jLabel23");
        jPanel9.add(employeeName_jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 255));
        jLabel23.setText("Gross Pay:");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 255));
        jLabel24.setText("Tax:");
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 255));
        jLabel25.setText("SSS:");
        jPanel9.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));

        pagibigWord_jLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pagibigWord_jLabel.setForeground(new java.awt.Color(204, 204, 255));
        pagibigWord_jLabel.setText("Pagibig:");
        jPanel9.add(pagibigWord_jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 255));
        jLabel27.setText("Net Pay:");
        jPanel9.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 120, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Net Pay");
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 300, 100, 30));

        grossPay_jLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        grossPay_jLabel.setForeground(new java.awt.Color(153, 153, 255));
        grossPay_jLabel.setText("jLabel32");
        jPanel9.add(grossPay_jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 200, -1));

        logout_icon1.setForeground(new java.awt.Color(255, 255, 255));
        logout_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout (1).png"))); // NOI18N
        logout_icon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_icon1MouseClicked(evt);
            }
        });
        jPanel9.add(logout_icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        tax_jLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tax_jLabel.setForeground(new java.awt.Color(255, 102, 102));
        tax_jLabel.setText("jLabel33");
        jPanel9.add(tax_jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, -1));

        sss_jLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sss_jLabel.setForeground(new java.awt.Color(255, 102, 102));
        sss_jLabel.setText("jLabel34");
        jPanel9.add(sss_jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        pagibig_jLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pagibig_jLabel.setForeground(new java.awt.Color(255, 102, 102));
        pagibig_jLabel.setText("jLabel35");
        jPanel9.add(pagibig_jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, -1, -1));

        netPay_jLabel.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        netPay_jLabel.setForeground(new java.awt.Color(51, 51, 51));
        netPay_jLabel.setText("jLabel26");
        jPanel9.add(netPay_jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 230, 60));

        jLabel26.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 255));
        jLabel26.setText("Employee's Salary");
        jPanel9.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross.png"))); // NOI18N
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PurpleGUI_ResultChange.png"))); // NOI18N
        jLabel21.setText("jLabel21");
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 102, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", jPanel5);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Net Pay");
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 100, 30));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Database");
        jPanel11.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 300, 100, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmployeeID", "Name", "Rate", "Days of Work", "Gross Pay", "Tax", "SSS", "Pagibig", "Net Pay"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setSelectionBackground(new java.awt.Color(204, 153, 255));
        jScrollPane2.setViewportView(jTable2);

        jPanel11.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 400, 200));

        employeeID_jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 43)); // NOI18N
        employeeID_jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        employeeID_jLabel1.setText("jLabel24");
        jPanel11.add(employeeID_jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 280, 60));

        jLabel33.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 23)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 255));
        jLabel33.setText("Innotec");
        jPanel11.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 90, 30));

        jLabel35.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Employee ID:");
        jPanel11.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        employeeName_jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        employeeName_jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        employeeName_jLabel1.setText("jLabel23");
        jPanel11.add(employeeName_jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel34.setText("Payroll Database");
        jPanel11.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        logout_icon2.setForeground(new java.awt.Color(255, 255, 255));
        logout_icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout (1).png"))); // NOI18N
        logout_icon2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_icon2MouseClicked(evt);
            }
        });
        jPanel11.add(logout_icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross.png"))); // NOI18N
        jLabel41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PurpleGUI_Result.png"))); // NOI18N
        jLabel31.setText("jLabel31");
        jPanel11.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 103, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", jPanel6);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       jTabbedPane1.setSelectedIndex(2);
       //Input values of database into JTable
       try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll?useSSL=false","root","jesus123");
        
        Statement st = con.createStatement();
        String sql= "select * from  employee";
        ResultSet rs = st.executeQuery(sql);
        
        while(rs.next()){
            //data will be added until finish
            String EmployeeID = String.valueOf(rs.getInt("EmployeeID"));
            String EmployeeName = rs.getString("EmployeeName");
            String Rate = String.valueOf(rs.getInt("Rate"));
            String WorkDays = String.valueOf(rs.getInt("WorkDays"));
            String GrossSalary = String.valueOf(rs.getInt("GrossSalary"));
            String TaxDeduction = String.valueOf(rs.getInt("Tax"));
            String SSS = String.valueOf(rs.getInt("SSS"));
            String Pagibig = String.valueOf(rs.getInt("Pagibig"));
            String NetPay = String.valueOf(rs.getInt("NetPay"));
            
            String tbData[] = {EmployeeID, EmployeeName, Rate,WorkDays, GrossSalary, TaxDeduction, SSS, Pagibig, NetPay };
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
              
            tblModel.addRow(tbData);
        }        
        con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void back_payroll1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_payroll1MouseClicked
        jTabbedPane1.setSelectedIndex(0);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_back_payroll1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
       
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void done_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_done_jButtonActionPerformed
                    
        try{           
            //open connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll?useSSL=false","root","jesus123");            
            String employeeID = employeeID_jTextField.getText();
            employeeID_jLabel.setText(employeeID);
            
            Statement stm = con.createStatement();
            String sql = "select * from employee where EmployeeID =" +employeeID;            
            ResultSet rs = stm.executeQuery(sql);
            
            if(rs.next()) {                   
                jTabbedPane1.setSelectedIndex(3);
                
                //Set and get Employee Name from database
                String EmployeeName = rs.getString("EmployeeName");
                employeeName_jLabel.setText(EmployeeName);
                
                //Get Employee Rate from database
                String employeeRate = String.valueOf(rs.getInt("Rate"));
                int rate = Integer.parseInt(employeeRate);
                
                //Get gross pay
                int workDays = Integer.parseInt(workDays_jTextField.getText());
                int grossPay = rate * workDays;
                grossPay_jLabel.setText("P " +grossPay);
                
                //Get Tax
                SalaryDeduction salaryDeduction = new SalaryDeduction( workDays,rate, grossPay);
                salaryDeduction.deductTax();
                int Tax = (int)salaryDeduction.tax;               
                tax_jLabel.setText("P " +Tax);
                
                //Get Pagibig deduction
                salaryDeduction.deductPagibig();
                int Pagibig = (int) salaryDeduction.pagibig;                
                pagibig_jLabel.setText("P " + Pagibig);
                
                //Get SSS deduction
                salaryDeduction.deductSSS();
                int SSS = (int) salaryDeduction.sss;
                sss_jLabel.setText("P " + SSS);
                               
                //Get Net Pay
                int salaryDeductions = Tax + Pagibig + SSS;
                int NetPay= grossPay - salaryDeductions;
                netPay_jLabel.setText("P " + NetPay);
                
                
                //Function to get the updated values and store into database
                updateDB( grossPay, Tax, SSS, Pagibig, NetPay);                                                                                                              
            }
            else{
                JOptionPane.showMessageDialog(null, "Empoyee Number entered doesn't exist.");
            }                                    
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_done_jButtonActionPerformed

    
    private void employeeID_jTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeeID_jTextFieldKeyReleased
        if (employeeID_jTextField.getText().length()>0 && workDays_jTextField.getText().length()>0){
            done_jButton.setEnabled(true);
        }
        else {
            done_jButton.setEnabled(false);
        }       
    }//GEN-LAST:event_employeeID_jTextFieldKeyReleased

    private void workDays_jTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_workDays_jTextFieldKeyReleased
         if (employeeID_jTextField.getText().length()>0 && workDays_jTextField.getText().length()>0 ){
            done_jButton.setEnabled(true);
        }
        else {
            done_jButton.setEnabled(false);
        }
    }//GEN-LAST:event_workDays_jTextFieldKeyReleased

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
       jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        String employeeID = employeeID_jTextField.getText();
        employeeID_jLabel1.setText(employeeID);
        jTabbedPane1.setSelectedIndex(4);
        String EmployeeName1 = employeeName_jLabel.getText();
        employeeName_jLabel1.setText(EmployeeName1);
        
        //Input values of database into JTable
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll?useSSL=false","root","jesus123");
        
        Statement st = con.createStatement();
        String sql= "select * from  employee";
        ResultSet rs = st.executeQuery(sql);
        
        while(rs.next()){
            //data will be added until finish
            String EmployeeID = String.valueOf(rs.getInt("EmployeeID"));
            String EmployeeName = rs.getString("EmployeeName");
            String Rate = String.valueOf(rs.getInt("Rate"));
            String WorkDays = String.valueOf(rs.getInt("WorkDays"));
            String GrossSalary = String.valueOf(rs.getInt("GrossSalary"));
            String TaxDeduction = String.valueOf(rs.getInt("Tax"));
            String SSS = String.valueOf(rs.getInt("SSS"));
            String Pagibig = String.valueOf(rs.getInt("Pagibig"));
            String NetPay = String.valueOf(rs.getInt("NetPay"));
            
            String tbData[] = {EmployeeID, EmployeeName, Rate,WorkDays, GrossSalary, TaxDeduction, SSS, Pagibig, NetPay };
            DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
            
            
            tblModel.addRow(tbData);
        }                        
        con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void logout_icon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_icon1MouseClicked
                
        if (JOptionPane.showConfirmDialog(null, "Do you want to log out?", "WARNING",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                 jTabbedPane1.setSelectedIndex(0);
                 employeeID_jTextField.setText("");
                 workDays_jTextField.setText("");
            } else {
                      jTabbedPane1.setSelectedIndex(3);
                   }
    }//GEN-LAST:event_logout_icon1MouseClicked

    private void back_payroll2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_payroll2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_back_payroll2MouseClicked

    private void back_payroll3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_payroll3MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_back_payroll3MouseClicked

    private void logout_icon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_icon2MouseClicked
        if (JOptionPane.showConfirmDialog(null, "Do you want to log out?", "WARNING",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                 jTabbedPane1.setSelectedIndex(0);
                 employeeID_jTextField.setText("");
                 workDays_jTextField.setText("");
            } else {
                      jTabbedPane1.setSelectedIndex(4);
                   }
    }//GEN-LAST:event_logout_icon2MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel41MouseClicked

    private void workDays_jTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_workDays_jTextFieldKeyPressed
        String days = workDays_jTextField.getText();
        int length = days.length();
        
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
        
            if (length<2){
                workDays_jTextField.setEditable(true);
        }else{
            workDays_jTextField.setEditable(false);
        }
    }else{
            //Allows user to back space
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE){
                workDays_jTextField.setEditable(true);
            }else{
                workDays_jTextField.setEditable(false);
            }
        }
    }//GEN-LAST:event_workDays_jTextFieldKeyPressed

    private void employeeID_jTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeeID_jTextFieldKeyPressed
        String id = employeeID_jTextField.getText();
        int length = id.length();
        
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
        
            if (length<5){
                employeeID_jTextField.setEditable(true);
        }else{
            employeeID_jTextField.setEditable(false);
        }
    }else{
            //Allows user to back space
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE){
                employeeID_jTextField.setEditable(true);
            }else{
                employeeID_jTextField.setEditable(false);
            }
        }
    }//GEN-LAST:event_employeeID_jTextFieldKeyPressed

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
            java.util.logging.Logger.getLogger(PayrollMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayrollMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayrollMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayrollMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayrollMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back_payroll1;
    private javax.swing.JLabel back_payroll2;
    private javax.swing.JLabel back_payroll3;
    private javax.swing.JButton done_jButton;
    private javax.swing.JLabel employeeID_jLabel;
    private javax.swing.JLabel employeeID_jLabel1;
    private javax.swing.JTextField employeeID_jTextField;
    private javax.swing.JLabel employeeName_jLabel;
    private javax.swing.JLabel employeeName_jLabel1;
    private javax.swing.JLabel grossPay_jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel logout_icon1;
    private javax.swing.JLabel logout_icon2;
    private javax.swing.JLabel netPay_jLabel;
    private javax.swing.JLabel pagibigWord_jLabel;
    private javax.swing.JLabel pagibig_jLabel;
    private javax.swing.JLabel sss_jLabel;
    private javax.swing.JLabel tax_jLabel;
    private javax.swing.JTextField workDays_jTextField;
    // End of variables declaration//GEN-END:variables
}