public class By_showing_days extends javax.swing.JFrame {
    public By_showing_days() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        main = new javax.swing.JLabel();
        book_day = new javax.swing.JButton();
        book_ex = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jButton2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jButton2.setText("2. Sunday Schedules");

        jButton3.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jButton3.setText("2. Book By FitnessType");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        main.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        main.setForeground(new java.awt.Color(153, 0, 153));
        main.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main.setText("Booking Type's");

        book_day.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        book_day.setForeground(new java.awt.Color(0, 0, 153));
        book_day.setText("By Days");
        book_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_dayActionPerformed(evt);
            }
        });

        book_ex.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        book_ex.setForeground(new java.awt.Color(0, 0, 153));
        book_ex.setText("By Type");
        book_ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_exActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("---------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(book_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(book_day, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(8, 8, 8)
                .addComponent(book_day)
                .addGap(25, 25, 25)
                .addComponent(book_ex)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void book_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_dayActionPerformed
        booking_by_days bpd = new booking_by_days();
        bpd.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_book_dayActionPerformed

    private void book_exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_exActionPerformed
        booking_by_fitness_type bbft = new booking_by_fitness_type();
        bbft.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_book_exActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new By_showing_days().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton book_day;
    private javax.swing.JButton book_ex;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel main;
    // End of variables declaration//GEN-END:variables
}
