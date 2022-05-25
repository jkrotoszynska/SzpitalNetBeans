package frontend;

public class EkranGlownyFrame extends javax.swing.JFrame {

    public EkranGlownyFrame() {
        initComponents();
        
        pacjenci = new MoiPacjenciFrame();
        pacjenci.setTitle("Panel lekarza");
        pacjenci.setSize(1000,700);
        
        wyszukiwarka = new WyszukiwarkaFrame();
        wyszukiwarka.setTitle("Wyszukiwarka");
        wyszukiwarka.setSize(1000,700);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bPacjent = new javax.swing.JButton();
        historiaButton = new javax.swing.JButton();
        bWyszukiwarka = new javax.swing.JButton();
        szczegolyButton = new javax.swing.JButton();
        bWyloguj = new javax.swing.JButton();
        jNazwa = new javax.swing.JLabel();
        jOpis = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSpecjalizacja = new javax.swing.JLabel();
        jId = new javax.swing.JLabel();
        jOddział = new javax.swing.JLabel();
        jAvatar = new javax.swing.JLabel();
        jImieNazwisko = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(java.awt.SystemColor.activeCaption);
        background.setFocusable(false);
        background.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        background.setInheritsPopupMenu(true);
        background.setMaximumSize(new java.awt.Dimension(1000, 730));
        background.setMinimumSize(new java.awt.Dimension(1000, 700));
        background.setPreferredSize(new java.awt.Dimension(1000, 670));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        bPacjent.setBackground(new java.awt.Color(68, 107, 147));
        bPacjent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bPacjent.setForeground(new java.awt.Color(255, 255, 255));
        bPacjent.setText("MOI PACJENCI");
        bPacjent.setAlignmentY(1.0F);
        bPacjent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bPacjent.setMargin(new java.awt.Insets(6, 20, 6, 20));
        bPacjent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPacjentActionPerformed(evt);
            }
        });

        historiaButton.setBackground(new java.awt.Color(24, 38, 52));
        historiaButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        historiaButton.setForeground(new java.awt.Color(76, 76, 76));
        historiaButton.setText("HISTORIA LECZEŃ");
        historiaButton.setAlignmentY(1.0F);
        historiaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        historiaButton.setMargin(new java.awt.Insets(6, 20, 6, 20));
        historiaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historiaButtonActionPerformed(evt);
            }
        });

        bWyszukiwarka.setBackground(new java.awt.Color(68, 107, 147));
        bWyszukiwarka.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bWyszukiwarka.setForeground(new java.awt.Color(255, 255, 255));
        bWyszukiwarka.setText("WYSZUKIWARKA");
        bWyszukiwarka.setAlignmentY(1.0F);
        bWyszukiwarka.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bWyszukiwarka.setMargin(new java.awt.Insets(6, 20, 6, 20));
        bWyszukiwarka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bWyszukiwarkaActionPerformed(evt);
            }
        });

        szczegolyButton.setBackground(new java.awt.Color(24, 38, 52));
        szczegolyButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        szczegolyButton.setForeground(new java.awt.Color(76, 76, 76));
        szczegolyButton.setText("WIĘCEJ SZCZEGÓŁÓW");
        szczegolyButton.setAlignmentY(1.0F);
        szczegolyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        szczegolyButton.setMargin(new java.awt.Insets(6, 20, 6, 20));
        szczegolyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szczegolyButtonActionPerformed(evt);
            }
        });

        bWyloguj.setBackground(new java.awt.Color(68, 107, 147));
        bWyloguj.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bWyloguj.setForeground(new java.awt.Color(255, 255, 255));
        bWyloguj.setText("WYLOGUJ");
        bWyloguj.setAlignmentY(1.0F);
        bWyloguj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bWyloguj.setMargin(new java.awt.Insets(6, 20, 6, 20));
        bWyloguj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bWylogujActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bPacjent, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historiaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bWyszukiwarka, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(szczegolyButton)
                    .addComponent(bWyloguj, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bPacjent, bWyszukiwarka, historiaButton, szczegolyButton});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(bPacjent)
                .addGap(34, 34, 34)
                .addComponent(historiaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(bWyszukiwarka, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(szczegolyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(bWyloguj, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bPacjent, bWyszukiwarka, historiaButton, szczegolyButton});

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 340, 440));

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jSpecjalizacja.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        jSpecjalizacja.setForeground(new java.awt.Color(0, 0, 0));
        jSpecjalizacja.setText("Specjalizacja:");

        jId.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        jId.setForeground(new java.awt.Color(0, 0, 0));
        jId.setText("ID: ");

        jOddział.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        jOddział.setForeground(new java.awt.Color(0, 0, 0));
        jOddział.setText("Oddział:");

        jAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szpital/images/avat.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jImieNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jOddział, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSpecjalizacja, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                                .addComponent(jId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 29, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jAvatar)
                    .addComponent(jImieNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpecjalizacja)
                .addGap(18, 18, 18)
                .addComponent(jOddział)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 480, 440));

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
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPacjentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPacjentActionPerformed
        pacjenci.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bPacjentActionPerformed

    private void historiaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historiaButtonActionPerformed
    }//GEN-LAST:event_historiaButtonActionPerformed

    private void bWyszukiwarkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bWyszukiwarkaActionPerformed
        wyszukiwarka.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bWyszukiwarkaActionPerformed

    private void szczegolyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szczegolyButtonActionPerformed
    }//GEN-LAST:event_szczegolyButtonActionPerformed

    private void bWylogujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bWylogujActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bWylogujActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EkranGlownyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bPacjent;
    private javax.swing.JButton bWyloguj;
    private javax.swing.JButton bWyszukiwarka;
    private javax.swing.JPanel background;
    private javax.swing.JButton historiaButton;
    private javax.swing.JLabel jAvatar;
    public javax.swing.JLabel jId;
    private javax.swing.JLabel jImieNazwisko;
    private javax.swing.JLabel jNazwa;
    public javax.swing.JLabel jOddział;
    private javax.swing.JLabel jOpis;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel jSpecjalizacja;
    private javax.swing.JButton szczegolyButton;
    // End of variables declaration//GEN-END:variables

    private MoiPacjenciFrame pacjenci;
    private WyszukiwarkaFrame wyszukiwarka; 

}
