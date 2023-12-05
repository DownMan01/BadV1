
package order_system;

import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Order extends javax.swing.JFrame {

    public Order() {
        
        initComponents();
        table.getColumnModel().getColumn(0).setPreferredWidth(30);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        
              
    }

  public void addtable(int id ,String Name, int Qty ,Double Price){
  
      DefaultTableModel dt = (DefaultTableModel) table.getModel();
      
      Vector v = new Vector() ;
      
      v.add(id);
      v.add(Name);
      v.add(Qty);
      v.add(Price);
      
      dt.addRow(v);
  }
    
    public void addtables(int id ,String Name,int Qty ,Double Price){
    
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        
       DecimalFormat df = new DecimalFormat("00.00") ;       
       double totPrice = Price * Double.valueOf(Qty) ;
       
       String TotalPrice = df.format(totPrice);
        
        
        
        // product allready add chk
        
        for (int row = 0; row < table.getRowCount(); row++) {
            
            if (Name == table.getValueAt(row, 1)) {
                
                dt.removeRow(table.convertRowIndexToModel(row));
                
            } 
        }
        
        
        
        
        Vector v = new Vector();
        
        v.add(id);
        v.add(Name);
        v.add(Qty);
        v.add(TotalPrice); // total price
        
        dt.addRow(v);
        
    
    }
    
   public void cal(){
    //cal total table values
   
   int numOfRow = table.getRowCount() ;
   double tot = 0.0 ;
   
       for (int i = 0; i < numOfRow; i++) {
           
           double value = Double.parseDouble(table.getValueAt(i, 3).toString());
          
           tot += value ;
           
       }
       
       DecimalFormat df = new DecimalFormat("00.00") ;
       total.setText(df.format(tot));
    
   
   
   } 
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        item = new javax.swing.JButton();
        q1 = new javax.swing.JLabel();
        item2 = new javax.swing.JButton();
        q2 = new javax.swing.JLabel();
        item3 = new javax.swing.JButton();
        q3 = new javax.swing.JLabel();
        item6 = new javax.swing.JButton();
        q6 = new javax.swing.JLabel();
        item5 = new javax.swing.JButton();
        q5 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        item4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        q9 = new javax.swing.JLabel();
        q8 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        item7 = new javax.swing.JButton();
        q7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        totalLabel = new javax.swing.JLabel();
        CashLabel = new javax.swing.JLabel();
        sukliLabel = new javax.swing.JLabel();
        sukli = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        pay = new javax.swing.JTextField();
        PayLabel = new javax.swing.JButton();
        newOrder = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(253, 253, 253));

        jPanel1.setBackground(new java.awt.Color(88, 138, 135));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 4));

        item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/1.png"))); // NOI18N
        item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActionPerformed(evt);
            }
        });

        q1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q1.setForeground(new java.awt.Color(255, 255, 255));
        q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1.setText("0");

        item2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/2.png"))); // NOI18N
        item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2ActionPerformed(evt);
            }
        });

        q2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q2.setForeground(new java.awt.Color(255, 255, 255));
        q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2.setText("0");

        item3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/3.png"))); // NOI18N
        item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item3ActionPerformed(evt);
            }
        });

        q3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q3.setForeground(new java.awt.Color(255, 255, 255));
        q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3.setText("0");

        item6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/6.png"))); // NOI18N
        item6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item6ActionPerformed(evt);
            }
        });

        q6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q6.setForeground(new java.awt.Color(255, 255, 255));
        q6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q6.setText("0");

        item5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/5.png"))); // NOI18N
        item5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item5ActionPerformed(evt);
            }
        });

        q5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q5.setForeground(new java.awt.Color(255, 255, 255));
        q5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q5.setText("0");

        q4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q4.setForeground(new java.awt.Color(255, 255, 255));
        q4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q4.setText("0");

        item4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/4.png"))); // NOI18N
        item4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item4ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/9.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        q9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q9.setForeground(new java.awt.Color(255, 255, 255));
        q9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q9.setText("0");

        q8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q8.setForeground(new java.awt.Color(255, 255, 255));
        q8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q8.setText("0");

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/8.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        item7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/7.png"))); // NOI18N
        item7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item7ActionPerformed(evt);
            }
        });

        q7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q7.setForeground(new java.awt.Color(255, 255, 255));
        q7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q7.setText("0");

        jPanel2.setBackground(new java.awt.Color(88, 138, 135));

        table.setBackground(new java.awt.Color(253, 253, 253));
        table.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Qty.", "Price"
            }
        ));
        table.setGridColor(new java.awt.Color(253, 253, 253));
        table.setSelectionBackground(new java.awt.Color(102, 102, 102));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel3.setBackground(new java.awt.Color(88, 138, 135));

        totalLabel.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalLabel.setText("Total :");

        CashLabel.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        CashLabel.setForeground(new java.awt.Color(255, 255, 255));
        CashLabel.setText("Cash :");

        sukliLabel.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        sukliLabel.setForeground(new java.awt.Color(255, 255, 255));
        sukliLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sukliLabel.setText("Sukli :");

        sukli.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        sukli.setForeground(new java.awt.Color(255, 255, 255));
        sukli.setText("00.00");

        total.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setText("00.00");

        pay.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        pay.setText("0");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });

        PayLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        PayLabel.setText("Pay");
        PayLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayLabelActionPerformed(evt);
            }
        });

        newOrder.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        newOrder.setText("New Order");
        newOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CashLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(sukliLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sukli, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(PayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newOrder))
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLabel)
                    .addComponent(total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pay)
                    .addComponent(CashLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sukli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sukliLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        delete.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        name.setFont(new java.awt.Font("Perpetua Titling MT", 1, 55)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Julie's Cuisine");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(q1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item7, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(q2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(q8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(q3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(name)
                .addGap(0, 347, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(item6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(item5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(item4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(item7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActionPerformed
        // btn code
        int i = Integer.parseInt(q1.getText());
        ++i;
        q1.setText(String.valueOf(i));
        
        addtables(1, "Beef Tapa", i, 89.99);
        
        cal();
        
    }//GEN-LAST:event_itemActionPerformed

    private void item2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item2ActionPerformed
        // btn code
        int i = Integer.parseInt(q2.getText());
        ++i;
        q2.setText(String.valueOf(i));
        
        addtables(2, "Bacon Fried Rice", i, 75.99);
        
        cal();
        
    }//GEN-LAST:event_item2ActionPerformed

    private void item3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item3ActionPerformed
        // btn code
        int i = Integer.parseInt(q3.getText());
        ++i;
        q3.setText(String.valueOf(i));
        
        addtables(3, "Bistek Fried Rice", i, 79.99);
        
        cal();
    }//GEN-LAST:event_item3ActionPerformed

    private void item4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item4ActionPerformed
        // btn code
        int i = Integer.parseInt(q4.getText());
        ++i;
        q4.setText(String.valueOf(i));
        
        addtables(4, "Crispy Potatoes", i, 61.99);
        
        cal();
    }//GEN-LAST:event_item4ActionPerformed

    private void item5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item5ActionPerformed
        // btn code
        int i = Integer.parseInt(q5.getText());
        ++i;
        q5.setText(String.valueOf(i));
        
        addtables(5, "Soup and Sandwich", i, 49.99);
        
        cal();
    }//GEN-LAST:event_item5ActionPerformed

    private void item6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item6ActionPerformed
        // btn code
        int i = Integer.parseInt(q6.getText());
        ++i;
        q6.setText(String.valueOf(i));
        
        addtables(6, "ClubHouse Sandwich", i, 44.99);
        
        cal();
    }//GEN-LAST:event_item6ActionPerformed

    private void item7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item7ActionPerformed
        // btn code
        int i = Integer.parseInt(q7.getText());
        ++i;
        q7.setText(String.valueOf(i));
        
        addtables(7, "Reuben Sandwich", i, 56.99);
        
        cal();
    }//GEN-LAST:event_item7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // btn code
        int i = Integer.parseInt(q8.getText());
        ++i;
        q8.setText(String.valueOf(i));
        
        addtables(8, "Chicken and Biscuits", i, 69.99);
        
        cal();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       // btn code
        int i = Integer.parseInt(q9.getText());
        ++i;
        q9.setText(String.valueOf(i));
        
        addtables(9, "Tasmanian Salmon", i, 47.99);
        
        cal();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
     
        

        // delete some iteam   
        DefaultTableModel dt = (DefaultTableModel) table.getModel(); 
        
        String r = dt.getValueAt(table.getSelectedRow(), 0).toString();
       
        //remove product
        int rw = table.getSelectedRow();
        dt.removeRow(rw);       
        
        
       //remove Qty Lable
        System.out.println(r);
        switch (r) {
                   
                   case "1":                       
                   q1.setText("0");
                   break;
                   
                   case "2":                       
                   q2.setText("0");
                   break;
                   
                   case "3":                       
                   q3.setText("0");
                   break;
                   
                   case "4":                       
                   q4.setText("0");
                   break;
                   
                   case "5":                       
                   q5.setText("0");
                   break;
                   
                   case "6":                       
                   q6.setText("0");
                   
                   case "7":                       
                   q7.setText("0");
                   break;
                   
                   case "8":                       
                   q8.setText("0");
                   break;
                   
                   case "9":                       
                   q9.setText("0");
                   break;
                   
                   default:
                       System.out.println("over");
               }
        
        cal(); // after iteam delete calculate total
        
    }//GEN-LAST:event_deleteActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void PayLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayLabelActionPerformed
        
        
        // pat btn
        double tot = Double.parseDouble(total.getText());
        double paid = Double.parseDouble(pay.getText());
        double balance = paid - tot ;
        
        // popup messages
        if(paid >= tot){
             
             if(tot == 0){
               JOptionPane.showMessageDialog(null, "Please select food!");
             }
             else{
               JOptionPane.showMessageDialog(null, "Payment successful!");
            
                  // sukli : 00.00 output 
                  DecimalFormat df = new DecimalFormat("00.00") ;   
                  sukli.setText(String.valueOf(df.format(balance)));
                 }  
        }
         
        else{
            JOptionPane.showMessageDialog(null, "Not enough cash!");
        }

        
    }//GEN-LAST:event_PayLabelActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
      
    }//GEN-LAST:event_payActionPerformed

    private void newOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderActionPerformed
         // deleting the table
        DefaultTableModel dm = (DefaultTableModel)table.getModel();
            while(dm.getRowCount() > 0)
            {
              dm.removeRow(0);
                q1.setText("0");
                q2.setText("0");
                q3.setText("0");
                q4.setText("0");
                q5.setText("0");
                q6.setText("0");
                q7.setText("0");
                q8.setText("0");
                q9.setText("0");
                sukli.setText("00.00");
                pay.setText("0");
                cal();
            }   
    }//GEN-LAST:event_newOrderActionPerformed

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Order().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CashLabel;
    private javax.swing.JButton PayLabel;
    private javax.swing.JButton delete;
    private javax.swing.JButton item;
    private javax.swing.JButton item2;
    private javax.swing.JButton item3;
    private javax.swing.JButton item4;
    private javax.swing.JButton item5;
    private javax.swing.JButton item6;
    private javax.swing.JButton item7;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private javax.swing.JButton newOrder;
    private javax.swing.JTextField pay;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q9;
    private javax.swing.JLabel sukli;
    private javax.swing.JLabel sukliLabel;
    private javax.swing.JTable table;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
