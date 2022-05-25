package frontend;

public class EkranGlownyFrame extends javax.swing.JFrame {

    public EkranGlownyFrame() {
        initComponents();
        
        pacjenci = new MoiPacjenciFrame();
        pacjenci.setTitle("Panel lekarza");
        pacjenci.setSize(1000,700);
        
        historia = new HistoriaLeczenFrame();
        historia.setTitle("Historia leczeń");
        historia.setSize(1000,700);
        
        wyszukiwarka = new WyszukiwarkaFrame();
        wyszukiwarka.setTitle("Wyszukiwarka");
        wyszukiwarka.setSize(1000,700);
        
        szczegoly = new WiecejSzczegolowFrame();
        szczegoly.setTitle("Więcej szczegółów");
        szczegoly.setSize(1000,700);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pacjentButton = new javax.swing.JButton();
        historiaButton = new javax.swing.JButton();
        wyszukiwarkaButton = new javax.swing.JButton();
        szczegolyButton = new javax.swing.JButton();
        wylogujButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        specjalizacjaLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        oddzialLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        pacjentButton.setBackground(new java.awt.Color(68, 107, 147));
        pacjentButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pacjentButton.setForeground(new java.awt.Color(255, 255, 255));
        pacjentButton.setText("MOI PACJENCI");
        pacjentButton.setAlignmentY(1.0F);
        pacjentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pacjentButton.setMargin(new java.awt.Insets(6, 20, 6, 20));
        pacjentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacjentButtonActionPerformed(evt);
            }
        });

        historiaButton.setBackground(new java.awt.Color(68, 107, 147));
        historiaButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        historiaButton.setForeground(new java.awt.Color(255, 255, 255));
        historiaButton.setText("HISTORIA LECZEŃ");
        historiaButton.setAlignmentY(1.0F);
        historiaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historiaButton.setMargin(new java.awt.Insets(6, 20, 6, 20));
        historiaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historiaButtonActionPerformed(evt);
            }
        });

        wyszukiwarkaButton.setBackground(new java.awt.Color(68, 107, 147));
        wyszukiwarkaButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        wyszukiwarkaButton.setForeground(new java.awt.Color(255, 255, 255));
        wyszukiwarkaButton.setText("WYSZUKIWARKA");
        wyszukiwarkaButton.setAlignmentY(1.0F);
        wyszukiwarkaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wyszukiwarkaButton.setMargin(new java.awt.Insets(6, 20, 6, 20));
        wyszukiwarkaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyszukiwarkaButtonActionPerformed(evt);
            }
        });

        szczegolyButton.setBackground(new java.awt.Color(68, 107, 147));
        szczegolyButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        szczegolyButton.setForeground(new java.awt.Color(255, 255, 255));
        szczegolyButton.setText("WIĘCEJ SZCZEGÓŁÓW");
        szczegolyButton.setAlignmentY(1.0F);
        szczegolyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        szczegolyButton.setMargin(new java.awt.Insets(6, 20, 6, 20));
        szczegolyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szczegolyButtonActionPerformed(evt);
            }
        });

        wylogujButton.setBackground(new java.awt.Color(68, 107, 147));
        wylogujButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        wylogujButton.setForeground(new java.awt.Color(255, 255, 255));
        wylogujButton.setText("WYLOGUJ");
        wylogujButton.setAlignmentY(1.0F);
        wylogujButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wylogujButton.setMargin(new java.awt.Insets(6, 20, 6, 20));
        wylogujButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wylogujButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pacjentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historiaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wyszukiwarkaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(szczegolyButton)
                    .addComponent(wylogujButton, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {historiaButton, pacjentButton, szczegolyButton, wyszukiwarkaButton});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(pacjentButton)
                .addGap(34, 34, 34)
                .addComponent(historiaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(wyszukiwarkaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(szczegolyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(wylogujButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {historiaButton, pacjentButton, szczegolyButton, wyszukiwarkaButton});

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 340, 440));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 54)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Szpital MediNova");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1000, -1));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(68, 107, 147));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("centrum zarządzania historią leczeń");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        specjalizacjaLabel.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        specjalizacjaLabel.setForeground(new java.awt.Color(0, 0, 0));
        specjalizacjaLabel.setText("Specjalizacja:");

        idLabel.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        idLabel.setForeground(new java.awt.Color(0, 0, 0));
        idLabel.setText("ID: ");

        oddzialLabel.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        oddzialLabel.setForeground(new java.awt.Color(0, 0, 0));
        oddzialLabel.setText("Oddział:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szpital/images/avat.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(310, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(oddzialLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(specjalizacjaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                                .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(54, 54, 54)
                .addComponent(idLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(specjalizacjaLabel)
                .addGap(18, 18, 18)
                .addComponent(oddzialLabel)
                .addContainerGap(110, Short.MAX_VALUE))
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

    private void pacjentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacjentButtonActionPerformed
        pacjenci.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pacjentButtonActionPerformed

    private void historiaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historiaButtonActionPerformed
        historia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_historiaButtonActionPerformed

    private void wyszukiwarkaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyszukiwarkaButtonActionPerformed
        wyszukiwarka.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_wyszukiwarkaButtonActionPerformed

    private void szczegolyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szczegolyButtonActionPerformed
        szczegoly.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_szczegolyButtonActionPerformed

    private void wylogujButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wylogujButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_wylogujButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EkranGlownyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton historiaButton;
    public javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel oddzialLabel;
    private javax.swing.JButton pacjentButton;
    public javax.swing.JLabel specjalizacjaLabel;
    private javax.swing.JButton szczegolyButton;
    private javax.swing.JButton wylogujButton;
    private javax.swing.JButton wyszukiwarkaButton;
    // End of variables declaration//GEN-END:variables

    private MoiPacjenciFrame pacjenci;
    private HistoriaLeczenFrame historia;
    private WyszukiwarkaFrame wyszukiwarka;
    private WiecejSzczegolowFrame szczegoly;
    private EkranLogowaniaFrame logowanie;    
    
}
