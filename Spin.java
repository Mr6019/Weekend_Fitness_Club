import javax.swing.JOptionPane;
public class Spin extends javax.swing.JFrame {
    static String[][] box_array = new String[5][7];
    static int n=0;
    public Spin() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        age_t = new javax.swing.JTextField();
        addresss = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_t = new javax.swing.JTextArea();
        Age = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        exercise_t = new javax.swing.JTextField();
        name_t = new javax.swing.JTextField();
        mobile = new javax.swing.JLabel();
        mobile_t = new javax.swing.JTextField();
        exercise = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        age_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N

        addresss.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        addresss.setText("Address  :");

        name.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        name.setText("Name     :");

        address_t.setColumns(20);
        address_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        address_t.setRows(5);
        jScrollPane1.setViewportView(address_t);

        Age.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        Age.setText("Age      :");

        cancel.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        cancel.setForeground(new java.awt.Color(153, 0, 153));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        ok.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        ok.setForeground(new java.awt.Color(153, 0, 153));
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        exercise_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        exercise_t.setText("SPIN");
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

        mobile.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        mobile.setText("Mobile   :");

        mobile_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N

        exercise.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        exercise.setText("Exercise :");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Spin Schedule");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("---------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(exercise, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ok)
                        .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addresss, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Age, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(mobile))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mobile_t)
                            .addComponent(name_t)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(age_t)
                            .addComponent(exercise_t))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel4)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_t, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exercise)
                    .addComponent(exercise_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Age)
                    .addComponent(age_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobile)
                    .addComponent(mobile_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addresss)
                        .addGap(13, 13, 13)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(ok))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void set_dlt_5()
    {
       Main_runner mr = new Main_runner();
       mr.allinone = 0;
       JOptionPane.showMessageDialog(this,"Your Slot delete Successfully");
    }
    public void set_5()
    {
        JOptionPane.showMessageDialog(this,"Name     : "+this.box_array[n-1][0]+"\nAge      : "+this.box_array[(n-1)][1]+"\nMobile   : "+this.box_array[(n-1)][2]+"\nAddress  : "+this.box_array[n-1][3]+"\nExercise : "+this.box_array[n-1][4]+"\nDay      : "+this.box_array[n-1][5]+"\nAmount      : "+this.box_array[n-1][6]);
    }
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        name_t.setText("");
        age_t.setText("");
        mobile_t.setText("");
        address_t.setText("");
    }//GEN-LAST:event_cancelActionPerformed

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
                        if(n<5)
                        {
                            this.box_array[n][0]=name;
                            this.box_array[n][1]=age;
                            this.box_array[n][2]=mobile;
                            this.box_array[n][3]=address;
                            this.box_array[n][4]="SPIN";
                            this.box_array[n][5]="Sunday";
                            this.box_array[n][5]="1000/-";
                            JOptionPane.showMessageDialog(this,"Your Slot Booked Successfully");
                            Main_runner mr = new Main_runner();
                            mr.allinone=5;
                            n++;
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

    private void exercise_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercise_tActionPerformed

    }//GEN-LAST:event_exercise_tActionPerformed

    private void name_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_tActionPerformed

    }//GEN-LAST:event_name_tActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Spin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JTextArea address_t;
    private javax.swing.JLabel addresss;
    private javax.swing.JTextField age_t;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel exercise;
    private javax.swing.JTextField exercise_t;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mobile;
    private javax.swing.JTextField mobile_t;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name_t;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables
}
