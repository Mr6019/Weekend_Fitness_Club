import javax.swing.JOptionPane;
public class Zumba extends javax.swing.JFrame {
    static String[][] zumba_array = new String[5][7];
    static int m=0;
    public Zumba() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        exercise_t = new javax.swing.JTextField();
        name_t = new javax.swing.JTextField();
        mobie = new javax.swing.JLabel();
        mobile_t = new javax.swing.JTextField();
        exercise = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        age_t = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_t = new javax.swing.JTextArea();
        ok = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        name.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        name.setText("Name     :");

        age.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        age.setText("Age      :");

        cancel.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        exercise_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        exercise_t.setText("ZUMBA");
        exercise_t.setEnabled(false);
        exercise_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exercise_tActionPerformed(evt);
            }
        });

        name_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        name_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_tActionPerformed(evt);
            }
        });

        mobie.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        mobie.setText("Mobile   :");

        mobile_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N

        exercise.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        exercise.setText("Exercise :");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Zumba Schedule");

        age_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N

        address.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        address.setText("Address  :");

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

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("---------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(exercise, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ok)
                    .addComponent(mobie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mobile_t)
                            .addComponent(name_t)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(age_t)
                            .addComponent(exercise_t))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
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
                    .addComponent(mobie)
                    .addComponent(mobile_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(address))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok)
                    .addComponent(cancel))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        name_t.setText("");
        age_t.setText("");
        mobile_t.setText("");
        address_t.setText("");
    }//GEN-LAST:event_cancelActionPerformed
    public void set_dlt_2()
    {
        Main_runner mr = new Main_runner();
        mr.allinone = 0;
        JOptionPane.showMessageDialog(this,"Your Slot delete Successfully");
    }
    public void set_2()
    {
       JOptionPane.showMessageDialog(this,"Name     : "+this.zumba_array[m-1][0]+"\nAge      : "+this.zumba_array[(m-1)][1]+"\nMobile   : "+this.zumba_array[(m-1)][2]+"\nAddress  : "+this.zumba_array[m-1][3]+"\nExercise : "+this.zumba_array[m-1][0]+"\nDay      : "+this.zumba_array[m-1][5]+"\nAmount      : "+this.zumba_array[m-1][6]);
    }
    private void exercise_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercise_tActionPerformed
        
    }//GEN-LAST:event_exercise_tActionPerformed

    private void name_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_tActionPerformed

    }//GEN-LAST:event_name_tActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        String name,age,mobile,address;
        name = name_t.getText().trim();
        age = age_t.getText().trim();
        mobile = this.mobile_t.getText().trim();
        address = this.address_t.getText().trim();
        if(name.equals("") || age.equals("") || mobile.equals("") || address.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Something Went Wrong Please Fill all Fields","Alert",JOptionPane.WARNING_MESSAGE);
            this.name_t.setText("");
            this.age_t.setText("");
            this.mobile_t.setText("");
            this.address_t.setText("");
        }
        else
        {
            try
            {
                if(Integer.parseInt(age)>0 && Integer.parseInt(mobile)>0 )
                {
                    if(Long.parseLong(mobile)>=100000000 && Long.parseLong(mobile)<=999999999)
                    {
                        this.name_t.setText("");
                        this.age_t.setText("");
                        this.mobile_t.setText("");
                        this.address_t.setText("");                     
                        if(m<5)
                        {
                            this.zumba_array[m][0]=name;
                            this.zumba_array[m][1]=age;
                            this.zumba_array[m][2]=mobile;
                            this.zumba_array[m][3]=address;
                            this.zumba_array[m][4]="ZUMBA";
                            this.zumba_array[m][5]="Sunday";
                            this.zumba_array[m][5]="500/-";
                            JOptionPane.showMessageDialog(this,"Your Slot Booked Successfully");
                            Main_runner mr = new Main_runner();
                            mr.allinone=2;
                            m++;
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this,"All Slocts of Sunday are booked Please Try again later","Alert",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"Please Enter Proper Mobile Number","Alert",JOptionPane.WARNING_MESSAGE);
                        this.mobile_t.setText("");
                    }
                }
                else
                {
                    this.age_t.setText("");
                    this.mobile_t.setText("");
                    JOptionPane.showMessageDialog(this,"Please Enter correct data in Mobile & age","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(Exception obj)
            {
                JOptionPane.showMessageDialog(this,"There is an Problem in your inserted data So pease feed correct data","Alert",JOptionPane.WARNING_MESSAGE);
                this.name_t.setText("");
                this.age_t.setText("");
                this.mobile_t.setText("");
                this.address_t.setText("");
            }
        }
    }//GEN-LAST:event_okActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        booking_by_fitness_type bbft = new booking_by_fitness_type();
        bbft.setVisible(true);
    }//GEN-LAST:event_formWindowClosing
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Zumba().setVisible(true);
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
    private javax.swing.JTextField exercise_t;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mobie;
    private javax.swing.JTextField mobile_t;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name_t;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables
}
