/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flappybird.view;

import com.flappybird.service.GameService;
import com.flappybird.service.GameService_Service;
import com.flappybird.service.User;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author luuhu
 */
public class AddView extends javax.swing.JFrame {

    private User user;
    /**
     * Creates new form AddView
     */
    public AddView(User user) {
        initComponents();
        this.user = user;
        nameUser.setText(user.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        cbPosition = new javax.swing.JComboBox<>();
        cbStatus = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        nameUser = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title.setText("Add user");

        username.setText("Username");

        password.setText("Password");

        name.setText("Name");

        phone.setText("Phone");

        position.setText("Position");

        status.setText("Status");

        cbPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activity", "Disable" }));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        nameUser.setText("jLabel8");

        admin.setText("Admin:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username)
                    .addComponent(password)
                    .addComponent(name)
                    .addComponent(phone)
                    .addComponent(position)
                    .addComponent(status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsername)
                    .addComponent(txtPassword)
                    .addComponent(txtName)
                    .addComponent(txtPhone)
                    .addComponent(cbStatus, javax.swing.GroupLayout.Alignment.TRAILING, 0, 83, Short.MAX_VALUE)
                    .addComponent(cbPosition, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel))
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(admin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameUser)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameUser)
                            .addComponent(admin))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(position)
                    .addComponent(cbPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(status)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnSave))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String name = txtName.getText();
        String phone = txtPhone.getText();
        String position = cbPosition.getSelectedItem().toString().toLowerCase();
        boolean status = false;
        if(cbStatus.getSelectedItem().toString().toLowerCase().equals("activity")){
            status = true;
        }else if(cbStatus.getSelectedItem().toString().toLowerCase().equals("disable")){
            status = false;
        }
        if(username.trim().isEmpty() || username.trim().split(" ").length > 1){
            JOptionPane.showMessageDialog(this, "Username can not empty or have space!");
        }
        if(password.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "password is require!");
        }
        if(name.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Name is require!");
        }
        if(phone.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Phone is require!");
        }
           
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setName(name);
        user.setPhone(phone);
        user.setPosition(position);
        user.setStatus(status);
        boolean check = addUser(user);
        if(check == true){
            JOptionPane.showMessageDialog(this, "successfully added account!");
            this.dispose();
            new ManageUserView(this.user).setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Username is duplicate! please try again.");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        new ManageUserView(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbPosition;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nameUser;
    private javax.swing.JLabel password;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel position;
    private javax.swing.JLabel status;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
    private boolean addUser(User user){
        GameService_Service service = new GameService_Service();
        GameService port = service.getGameServicePort();
        return port.addUser(user);
    }
}
