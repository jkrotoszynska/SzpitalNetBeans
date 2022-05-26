package frontend;

import backend.Lekarz;
import backend.Pacjent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import szpital.Start;


public class DodajPacjentaFrame extends javax.swing.JFrame {

    private EkranGlownyFrame glowny;
    
    public DodajPacjentaFrame(EkranGlownyFrame glowny) {
        initComponents();
        this.glowny = glowny;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jNazwa = new javax.swing.JLabel();
        jOpis = new javax.swing.JLabel();
        powrotButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        PeselText = new javax.swing.JLabel();
        ImieText = new javax.swing.JLabel();
        NazwiskoText = new javax.swing.JLabel();
        DataText = new javax.swing.JLabel();
        PlecText = new javax.swing.JLabel();
        jPesel = new javax.swing.JTextField();
        jImie = new javax.swing.JTextField();
        jNazwisko = new javax.swing.JTextField();
        jDataUrodzenia = new javax.swing.JTextField();
        jPlec = new javax.swing.JTextField();
        dodajButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(java.awt.SystemColor.activeCaption);
        background.setFocusable(false);
        background.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        background.setInheritsPopupMenu(true);
        background.setMinimumSize(new java.awt.Dimension(1000, 670));
        background.setPreferredSize(new java.awt.Dimension(1000, 670));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jNazwa.setFont(new java.awt.Font("Segoe UI", 3, 54)); // NOI18N
        jNazwa.setForeground(new java.awt.Color(255, 255, 255));
        jNazwa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jNazwa.setText("Szpital MediNova");
        background.add(jNazwa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1000, -1));

        jOpis.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jOpis.setForeground(new java.awt.Color(68, 107, 147));
        jOpis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jOpis.setText("centrum zarządzania historią leczeń");
        background.add(jOpis, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        powrotButton.setBackground(new java.awt.Color(68, 107, 147));
        powrotButton.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        powrotButton.setForeground(new java.awt.Color(255, 255, 255));
        powrotButton.setText("POWRÓT DO PANELU GŁÓWNEGO");
        powrotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powrotButtonActionPerformed(evt);
            }
        });
        background.add(powrotButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 630, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        PeselText.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        PeselText.setForeground(new java.awt.Color(0, 0, 0));
        PeselText.setText("Pesel");

        ImieText.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        ImieText.setForeground(new java.awt.Color(0, 0, 0));
        ImieText.setText("Imię");

        NazwiskoText.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        NazwiskoText.setForeground(new java.awt.Color(0, 0, 0));
        NazwiskoText.setText("Nazwisko");
        NazwiskoText.setAlignmentX(5.0F);

        DataText.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        DataText.setForeground(new java.awt.Color(0, 0, 0));
        DataText.setText("Data urodzenia");
        DataText.setAlignmentX(5.0F);

        PlecText.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        PlecText.setForeground(new java.awt.Color(0, 0, 0));
        PlecText.setText("Płeć");
        PlecText.setAlignmentX(5.0F);

        jPesel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPeselActionPerformed(evt);
            }
        });

        jImie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jImieActionPerformed(evt);
            }
        });

        dodajButton.setBackground(new java.awt.Color(68, 107, 147));
        dodajButton.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        dodajButton.setForeground(new java.awt.Color(255, 255, 255));
        dodajButton.setText("DODAJ");
        dodajButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dodajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dodajButton)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PeselText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DataText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NazwiskoText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ImieText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PlecText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPesel, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jImie, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDataUrodzenia, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPlec, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PeselText, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jPesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImieText, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jImie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NazwiskoText, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataText, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jDataUrodzenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlecText, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jPlec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(dodajButton)
                .addGap(30, 30, 30))
        );

        background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 500, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void powrotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powrotButtonActionPerformed
        glowny.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_powrotButtonActionPerformed

    private void jImieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jImieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jImieActionPerformed

    private void jPeselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPeselActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPeselActionPerformed

    private void dodajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajButtonActionPerformed
        // TODO add your handling code here:
        Start p = new Start();
        Pacjent pt = new Pacjent();
        pt.setPesel(Long.parseLong(this.jPesel.getText()));
        pt.setImie(this.jImie.getText());
        pt.setNazwisko(this.jNazwisko.getText());
        try {
            pt.setDataUrodzenia(new SimpleDateFormat("yyyy-MM-dd").parse(this.jDataUrodzenia.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(DodajPacjentaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        pt.setPlec(Boolean.parseBoolean(this.jPlec.getText()));
        p.zapisz(pt);
    }//GEN-LAST:event_dodajButtonActionPerformed

    public static void main(String args[]) {
        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DodajPacjentaFrame().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DataText;
    private javax.swing.JLabel ImieText;
    private javax.swing.JLabel NazwiskoText;
    private javax.swing.JLabel PeselText;
    private javax.swing.JLabel PlecText;
    private javax.swing.JPanel background;
    private javax.swing.JButton dodajButton;
    private javax.swing.JTextField jDataUrodzenia;
    private javax.swing.JTextField jImie;
    private javax.swing.JLabel jNazwa;
    private javax.swing.JTextField jNazwisko;
    private javax.swing.JLabel jOpis;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jPesel;
    private javax.swing.JTextField jPlec;
    private javax.swing.JButton powrotButton;
    // End of variables declaration//GEN-END:variables

}
