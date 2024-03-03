package com.mycompany.igu;

public class Principal extends javax.swing.JFrame 
{

    public Principal() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        btnParqueadero = new javax.swing.JButton();
        btnRestaurante = new javax.swing.JButton();
        btnAdministrador = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setForeground(new java.awt.Color(51, 0, 255));

        btnParqueadero.setBackground(new java.awt.Color(255, 0, 51));
        btnParqueadero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnParqueadero.setForeground(new java.awt.Color(255, 255, 255));
        btnParqueadero.setIcon(new javax.swing.ImageIcon("C:\\Users\\CARLOS VILLADA\\Documents\\NetBeansProjects\\Proyecto X\\ProyectoXX\\Imagenes\\parqueadero.png")); // NOI18N
        btnParqueadero.setText("PARQUEADERO");
        btnParqueadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParqueaderoActionPerformed(evt);
            }
        });

        btnRestaurante.setBackground(new java.awt.Color(255, 0, 51));
        btnRestaurante.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRestaurante.setForeground(new java.awt.Color(255, 255, 255));
        btnRestaurante.setIcon(new javax.swing.ImageIcon("C:\\Users\\CARLOS VILLADA\\Documents\\NetBeansProjects\\Proyecto X\\ProyectoXX\\Imagenes\\restaurante.png")); // NOI18N
        btnRestaurante.setText("RESTAURANTE");
        btnRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestauranteActionPerformed(evt);
            }
        });

        btnAdministrador.setBackground(new java.awt.Color(255, 0, 51));
        btnAdministrador.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        btnAdministrador.setIcon(new javax.swing.ImageIcon("C:\\Users\\CARLOS VILLADA\\Documents\\NetBeansProjects\\Proyecto X\\ProyectoXX\\Imagenes\\administrador.png")); // NOI18N
        btnAdministrador.setText("ADMINISTRADOR");
        btnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRestaurante)
                .addGap(21, 21, 21)
                .addComponent(btnAdministrador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnParqueadero)
                    .addComponent(btnRestaurante)
                    .addComponent(btnAdministrador))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnParqueaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParqueaderoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnParqueaderoActionPerformed

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdministradorActionPerformed

    private void btnRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestauranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestauranteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrador;
    private javax.swing.JButton btnParqueadero;
    private javax.swing.JButton btnRestaurante;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
