public class booking_by_days extends javax.swing.JFrame {
    public booking_by_days() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sat_schedule = new javax.swing.JButton();
        sun_schedule = new javax.swing.JButton();
        main = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        sat_schedule.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        sat_schedule.setText("Book Saturday Schedules");
        sat_schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sat_scheduleActionPerformed(evt);
            }
        });

        sun_schedule.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        sun_schedule.setText("Book Sunday Schedules");
        sun_schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sun_scheduleActionPerformed(evt);
            }
        });

        main.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        main.setForeground(new java.awt.Color(153, 0, 153));
        main.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main.setText("Booking Slot By Day's");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("---------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sat_schedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sun_schedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 80, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(sat_schedule)
                .addGap(25, 25, 25)
                .addComponent(sun_schedule)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sat_scheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat_scheduleActionPerformed
        saturday_day sd = new saturday_day();
        sd.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sat_scheduleActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
            By_showing_days bsd = new By_showing_days();
            bsd.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void sun_scheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun_scheduleActionPerformed
        setVisible(false);
        sunday_day sd = new sunday_day();
        sd.setVisible(true);
    }//GEN-LAST:event_sun_scheduleActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booking_by_days().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel main;
    private javax.swing.JButton sat_schedule;
    private javax.swing.JButton sun_schedule;
    // End of variables declaration//GEN-END:variables
}
