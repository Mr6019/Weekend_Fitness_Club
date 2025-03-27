
import javax.swing.JOptionPane;

public class saturday_day extends javax.swing.JFrame {

    static String[][] saturday_day_array = new String[5][7];
    static int i = 0;

    public saturday_day() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        address = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        mobile = new javax.swing.JLabel();
        exercise = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        name_t = new javax.swing.JTextField();
        mobile_t = new javax.swing.JTextField();
        age_t = new javax.swing.JTextField();
        exercise_t = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_t = new javax.swing.JTextArea();
        ok = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        main_heading = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        address.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        address.setText("Address  :");

        name.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        name.setText("Name     :");

        mobile.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        mobile.setText("Mobile   :");

        exercise.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        exercise.setText("Exercise :");

        age.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        age.setText("Age      :");

        name_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        name_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_tActionPerformed(evt);
            }
        });

        mobile_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N

        age_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N

        exercise_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        exercise_t.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---", "YOGA", "BODY SCULE", " " }));
        exercise_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exercise_tActionPerformed(evt);
            }
        });

        address_t.setColumns(20);
        address_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        address_t.setRows(5);
        jScrollPane1.setViewportView(address_t);

        ok.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        main_heading.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        main_heading.setForeground(new java.awt.Color(0, 0, 153));
        main_heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_heading.setText("Saturday bookings");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("---------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ok)
                    .addComponent(mobile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exercise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exercise_t, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mobile_t)
                            .addComponent(name_t)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(age_t))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(name)
                    .addComponent(name_t, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exercise)
                    .addComponent(exercise_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(age_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobile)
                    .addComponent(mobile_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(address))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok)
                    .addComponent(cancel))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void set_dlt_6() {
        Main_runner mr = new Main_runner();
        mr.allinone = 0;
        JOptionPane.showMessageDialog(this, "Your Slot delete Successfully");
    }

    public void set_6(){
        if (i >= 0) {
            JOptionPane.showMessageDialog(this, "Name     : " + this.saturday_day_array[(i - 1)][0] + "\nAge      : " + this.saturday_day_array[(i - 1)][1] + "\nMobile   : " + this.saturday_day_array[(i - 1)][2] + "\nAddress  : " + this.saturday_day_array[(i - 1)][3] + "\nExercise : " + this.saturday_day_array[(i - 1)][4] + "\nDay      : " + this.saturday_day_array[(i - 1)][5] + "\nAmount:      " + this.saturday_day_array[(i - 1)][6]);
        } else {
            JOptionPane.showMessageDialog(this, "There is no slot", "Alert", JOptionPane.WARNING_MESSAGE);
        }
    }
    private void name_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_tActionPerformed

    }//GEN-LAST:event_name_tActionPerformed

    private void exercise_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercise_tActionPerformed

    }//GEN-LAST:event_exercise_tActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        booking_by_days bbd = new booking_by_days();
        bbd.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.name_t.setText("");
        this.age_t.setText("");
        this.mobile_t.setText("");
        this.address_t.setText("");
        this.exercise_t.setSelectedIndex(0);
    }//GEN-LAST:event_cancelActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed

        String name, age, mobile, ex, address, exercise, timing;
        name = name_t.getText().trim();
        age = age_t.getText().trim();
        mobile = this.mobile_t.getText().trim();
        address = this.address_t.getText().trim();
        exercise = String.valueOf(this.exercise_t.getSelectedItem()).trim();
        if (name.equals("") || age.equals("") || mobile.equals("") || address.equals("") || exercise.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Something Went Wrong Please Fill all Fields", "Alert", JOptionPane.WARNING_MESSAGE);
            this.name_t.setText("");
            this.age_t.setText("");
            this.mobile_t.setText("");
            this.address_t.setText("");
            this.exercise_t.setSelectedIndex(0);
        } else {
            try {
                if (Integer.parseInt(age) > 0 && Integer.parseInt(mobile) > 0) {
                    if (Long.parseLong(mobile) >= 100000000 && Long.parseLong(mobile) <= 999999999) {
                        this.name_t.setText("");
                        this.age_t.setText("");
                        this.mobile_t.setText("");
                        this.address_t.setText("");
                        this.exercise_t.setSelectedIndex(0);
                        if (i < 4) {
                            this.saturday_day_array[i][0] = name;
                            this.saturday_day_array[i][1] = age;
                            this.saturday_day_array[i][2] = mobile;
                            this.saturday_day_array[i][3] = address;
                            this.saturday_day_array[i][4] = exercise;
                            this.saturday_day_array[i][5] = "Saturday";
                            if (exercise.equals("YOGA")) {
                                this.saturday_day_array[i][6] = "700/-";
                            } else {
                                this.saturday_day_array[i][6] = "900/-";
                            }
                            JOptionPane.showMessageDialog(this, "Your Slot Booked Successfully");
                            Main_runner mr = new Main_runner();
                            mr.allinone = 6;
                            i++;
                        } else {
                            JOptionPane.showMessageDialog(this, "All Slocts are booked Please Try again later", "Alert", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Please Enter Proper Mobile Number", "Alert", JOptionPane.WARNING_MESSAGE);
                        this.mobile_t.setText("");
                    }
                } else {
                    this.age_t.setText("");
                    this.mobile_t.setText("");
                    JOptionPane.showMessageDialog(this, "Please Enter correct data in Mobile & age", "Alert", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception obj) {
                JOptionPane.showMessageDialog(this, "There is an Problem in your inserted data So pease feed correct data", "Alert", JOptionPane.WARNING_MESSAGE);
                this.name_t.setText("");
                this.age_t.setText("");
                this.mobile_t.setText("");
                this.address_t.setText("");
                this.exercise_t.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_okActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new saturday_day().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JTextArea address_t;
    private javax.swing.JLabel age;
    private javax.swing.JTextField age_t;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel exercise;
    private javax.swing.JComboBox<String> exercise_t;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel main_heading;
    private javax.swing.JLabel mobile;
    private javax.swing.JTextField mobile_t;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name_t;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables
}
