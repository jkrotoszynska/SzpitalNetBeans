package frontend;

import backend.Lekarz;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class EkranLogowaniaFrame extends javax.swing.JFrame {

    public EkranLogowaniaFrame() {
        initComponents();
        
        glowny = new EkranGlownyFrame();
        glowny.setTitle("Panel lekarza");
        
        glowny.setSize(1000,700);
    }
    
    EntityManagerFactory emf;
    public EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("SzpitalPU");
        }
        return emf.createEntityManager();
    }
    
    public List<Lekarz> signIn(int login, String password){
        EntityManager em = getEntityManager();
        TypedQuery<Lekarz> q = em.createNamedQuery("Lekarz.findByIdLekarzaAndHaslo", Lekarz.class);
        q.setParameter("idLekarza", login);
        q.setParameter("haslo", password);
        List<Lekarz> result = q.getResultList();
        return result;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLoginText = new javax.swing.JLabel();
        jHasloText = new javax.swing.JLabel();
        tLogin = new javax.swing.JTextField();
        jOpis = new javax.swing.JLabel();
        jNazwa = new javax.swing.JLabel();
        bZaloguj = new javax.swing.JButton();
        jStopka = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jGrafika = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 204));

        background.setBackground(new java.awt.Color(249, 249, 249));
        background.setFocusable(false);
        background.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        background.setInheritsPopupMenu(true);
        background.setMinimumSize(new java.awt.Dimension(1000, 670));
        background.setPreferredSize(new java.awt.Dimension(1000, 670));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setPreferredSize(new java.awt.Dimension(570, 680));

        jLoginText.setFont(new java.awt.Font("SF Pro Display", 0, 21)); // NOI18N
        jLoginText.setForeground(new java.awt.Color(255, 255, 255));
        jLoginText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLoginText.setText("Login:");

        jHasloText.setFont(new java.awt.Font("SF Pro Display", 0, 21)); // NOI18N
        jHasloText.setForeground(new java.awt.Color(255, 255, 255));
        jHasloText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jHasloText.setText("Hasło:");

        tLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLoginActionPerformed(evt);
            }
        });

        jOpis.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jOpis.setForeground(new java.awt.Color(68, 107, 147));
        jOpis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jOpis.setText("centrum zarządzania historią leczeń");

        jNazwa.setFont(new java.awt.Font("Segoe UI", 3, 54)); // NOI18N
        jNazwa.setForeground(new java.awt.Color(255, 255, 255));
        jNazwa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jNazwa.setText("Szpital MediNova");

        bZaloguj.setBackground(new java.awt.Color(68, 108, 148));
        bZaloguj.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        bZaloguj.setForeground(new java.awt.Color(255, 255, 255));
        bZaloguj.setText("ZALOGUJ");
        bZaloguj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bZalogujActionPerformed(evt);
            }
        });

        jStopka.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jStopka.setForeground(new java.awt.Color(255, 255, 255));
        jStopka.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jStopka.setText("<html><div style='text-align: center'; WIDTH=265px> W razie problemów prosimy o kontakt z naszą infolinią pod numerem 789-571-876, w godzinach 08:00 - 16:00 </div></html>");
        jStopka.setToolTipText("");
        jStopka.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jOpis)
                .addGap(122, 122, 122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jNazwa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jStopka, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField1)
                    .addComponent(tLogin, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jHasloText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLoginText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(183, 183, 183))
                    .addComponent(bZaloguj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(160, 160, 160))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jNazwa, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jOpis)
                .addGap(89, 89, 89)
                .addComponent(jLoginText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jHasloText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(bZaloguj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jStopka, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 570, -1));

        jGrafika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szpital/images/tloszpital.jpg"))); // NOI18N
        background.add(jGrafika, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLoginActionPerformed
    }//GEN-LAST:event_tLoginActionPerformed

    private void bZalogujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bZalogujActionPerformed
        // TODO add your handling code here:
        int login = Integer.parseInt(this.tLogin.getText());
        String password = String.valueOf(jPasswordField1.getPassword());
        
        if (signIn(login, password) != null) {
            this.setVisible(false);
            glowny.setVisible(true);
        }
        
    }//GEN-LAST:event_bZalogujActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
    }//GEN-LAST:event_jPasswordField1ActionPerformed


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
            java.util.logging.Logger.getLogger(EkranLogowaniaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EkranLogowaniaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EkranLogowaniaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EkranLogowaniaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EkranLogowaniaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bZaloguj;
    private javax.swing.JPanel background;
    private javax.swing.JLabel jGrafika;
    private javax.swing.JLabel jHasloText;
    private javax.swing.JLabel jLoginText;
    private javax.swing.JLabel jNazwa;
    private javax.swing.JLabel jOpis;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel jStopka;
    private javax.swing.JTextField tLogin;
    // End of variables declaration//GEN-END:variables

    private EkranGlownyFrame glowny;

}
