import javax.swing.JOptionPane;
public class Yoga extends javax.swing.JFrame {
    static String[][] yoga_array = new String[5][7];
    static int l=0;
    public Yoga() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        address = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        exercise_t = new javax.swing.JTextField();
        name_t = new javax.swing.JTextField();
        mobile = new javax.swing.JLabel();
        mobile_t = new javax.swing.JTextField();
        experence = new javax.swing.JLabel();
        age_t = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_t = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        address.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        address.setText("Address  :");

        ok.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
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
        exercise_t.setText("YOGA");
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

        experence.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        experence.setText("Exercise :");

        age_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N

        address_t.setColumns(20);
        address_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        address_t.setRows(5);
        jScrollPane1.setViewportView(address_t);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Zumba Schedule");

        jLabel4.setText("---------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ok)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(experence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(age)
                    .addComponent(mobile))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age_t, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mobile_t, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(name_t)
                                .addComponent(exercise_t)))))
                .addGap(50, 50, 50))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(name_t, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exercise_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(experence))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobile_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(address)
                        .addGap(49, 49, 49)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok)
                    .addComponent(cancel))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void set_dlt_3()
    {
        Main_runner mr = new Main_runner();
        mr.allinone = 0;
        JOptionPane.showMessageDialog(this,"Your Slot delete Successfully");
    }
    public void set_3()
    {
       JOptionPane.showMessageDialog(this,"Name     : "+this.yoga_array[l-1][0]+"\nAge      : "+this.yoga_array[(l-1)][1]+"\nMobile   : "+this.yoga_array[(l-1)][2]+"\nAddress  : "+this.yoga_array[l-1][3]+"\nExercise : "+this.yoga_array[l-1][4]+"\nDay      : "+this.yoga_array[l-1][5]+"\nAmmount      : "+this.yoga_array[l-1][6]);
    }
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
                        if(l<4)
                        {
                            this.yoga_array[l][0]=name;
                            this.yoga_array[l][1]=age;
                            this.yoga_array[l][2]=mobile;
                            this.yoga_array[l][3]=address;
                            this.yoga_array[l][4]="YOGA";
                            this.yoga_array[l][5]="Saturday";
                            this.yoga_array[l][6]="700/-";
                            JOptionPane.showMessageDialog(this,"Your Slot Booked Successfully");
                            Main_runner mr = new Main_runner();
                            mr.allinone=3;
                            l++;
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

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        name_t.setText("");
        age_t.setText("");
        mobile_t.setText("");
        address_t.setText("");
    }//GEN-LAST:event_cancelActionPerformed

    private void name_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_tActionPerformed

    }//GEN-LAST:event_name_tActionPerformed

    private void exercise_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercise_tActionPerformed
        
    }//GEN-LAST:event_exercise_tActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        booking_by_fitness_type bbft = new booking_by_fitness_type();
        bbft.setVisible(true);
    }//GEN-LAST:event_formWindowClosing
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Yoga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JTextArea address_t;
    private javax.swing.JLabel age;
    private javax.swing.JTextField age_t;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField exercise_t;
    private javax.swing.JLabel experence;
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
