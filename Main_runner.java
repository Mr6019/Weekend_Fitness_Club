import javax.swing.JOptionPane;
public class Main_runner extends javax.swing.JFrame { //Main Constructor
    static int allinone=0;
    public Main_runner() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_heading = new javax.swing.JLabel();
        ex_book = new javax.swing.JButton();
        ex_show = new javax.swing.JButton();
        ex_can = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        main_heading.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        main_heading.setForeground(new java.awt.Color(0, 0, 153));
        main_heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_heading.setText("Welcome Weekend Fitness Club");

        ex_book.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        ex_book.setText("Book Your Exercise");
        ex_book.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        ex_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex_bookActionPerformed(evt);
            }
        });

        ex_show.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        ex_show.setText("See your Booking");
        ex_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex_showActionPerformed(evt);
            }
        });

        ex_can.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        ex_can.setText("Cancel the Booking");
        ex_can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex_canActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("---------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ex_show, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ex_book, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(ex_can, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(150, Short.MAX_VALUE))
            .addComponent(main_heading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(ex_book)
                .addGap(50, 50, 50)
                .addComponent(ex_show)
                .addGap(50, 50, 50)
                .addComponent(ex_can)
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     public Integer Age(String name) //our function
     {
        int i=0;
        switch(name)
        {
            case "Bhavesh":
                i=22;
            break;
            case "Anuj":
                i=26;
            break;
            case "Mahir":
                i=80;
            break;
            case "Raju":
                i=89;
            break;
            default:
                i=40;
        }
        return i;
     }
     
    private void ex_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex_bookActionPerformed
        By_showing_days bsd = new By_showing_days();
        bsd.setVisible(true);
    }//GEN-LAST:event_ex_bookActionPerformed

    private void ex_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex_showActionPerformed
        switch(allinone)
        {
            case 2:
                Zumba z = new Zumba();
                z.set_2();
            break;
            case 3:
                Yoga y = new Yoga();
                y.set_3();
            break;
            case 4:
                Body_Sculpt bb = new Body_Sculpt();
                bb.set_4();
            break;
            case 5:
                Spin bf = new Spin();
                bf.set_5();
            break;
            case 6:
                saturday_day sad = new saturday_day();
                sad.set_6();
            break;
            case 7:
                sunday_day sud = new sunday_day();
                sud.set_7();
            break;
            default:
                JOptionPane.showMessageDialog(this,"There is no record at this time for Showing","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ex_showActionPerformed

    private void ex_canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex_canActionPerformed

        switch(allinone)
        {
            case 2:
                Zumba z = new Zumba();
                z.set_dlt_2();
            break;
            case 3:
                Yoga y = new Yoga();
                y.set_dlt_3();
            break;
            case 4:
                Body_Sculpt bb = new Body_Sculpt();
                bb.set_dlt_4();
            break;
            case 5:
                Spin bf = new Spin();
                bf.set_dlt_5();
            break;
            case 6:
                saturday_day sad = new saturday_day();
                sad.set_dlt_6();
            break;
            case 7:
                sunday_day sud = new sunday_day();
                sud.set_dlt_7();
            break;
            default:
                JOptionPane.showMessageDialog(this,"There is no record at this time for Delete","Alert",JOptionPane.WARNING_MESSAGE);
        }   
    }//GEN-LAST:event_ex_canActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        String a = JOptionPane.showInputDialog(this,"1:  Very dissatisfied\n2:  Dissatisfied\n3:  Ok\n4:  Satisfied\n5:  Very Satisfied\nPlease Enter Your Feed Back");
    }//GEN-LAST:event_formWindowClosing
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_runner().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ex_book;
    private javax.swing.JButton ex_can;
    private javax.swing.JButton ex_show;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel main_heading;
    // End of variables declaration//GEN-END:variables
}
