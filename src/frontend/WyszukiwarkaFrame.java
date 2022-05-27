package frontend;

import backend.Pacjent;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.table.DefaultTableModel;

public class WyszukiwarkaFrame extends javax.swing.JFrame {

    private EkranGlownyFrame glowny;
    
    public WyszukiwarkaFrame(EkranGlownyFrame glowny) {
        initComponents();
        this.glowny = glowny;
    }
    
    public class PacjentEntity {
        public Long pesel;
        public String imie;
        public String nazwisko;
        public String dataUrodzenia;
        public String plec;
        
        public PacjentEntity(Long Pesel, String Imie, String Nazwisko, String DataUrodzenia, String Plec) {
            this.pesel = Pesel;
            this.imie = Imie;
            this.nazwisko = Nazwisko;
            this.dataUrodzenia = DataUrodzenia;
            this.plec = Plec;
        }
    }
    
    
    EntityManagerFactory emf;
    public EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("SzpitalPU");
        }
        return emf.createEntityManager();
    }
    
    public List<Pacjent> wyszukaj(Long pesel){
        EntityManager em = this.getEntityManager();
        TypedQuery<Pacjent> q = em.createNamedQuery("Pacjent.findByPeselLike", Pacjent.class);
        q.setParameter("pesel", "%"+pesel+"%");
        return q.getResultList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jNazwa = new javax.swing.JLabel();
        jOpis = new javax.swing.JLabel();
        bWyszukaj = new javax.swing.JButton();
        jWyszukiwanie = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        powrotButton = new javax.swing.JButton();

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

        bWyszukaj.setBackground(new java.awt.Color(68, 107, 147));
        bWyszukaj.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        bWyszukaj.setForeground(new java.awt.Color(255, 255, 255));
        bWyszukaj.setText("WYSZUKAJ");
        bWyszukaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bWyszukajActionPerformed(evt);
            }
        });
        background.add(bWyszukaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 130, 30));

        jWyszukiwanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWyszukiwanieActionPerformed(evt);
            }
        });
        background.add(jWyszukiwanie, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 280, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pesel", "Imię", "Nazwisko", "Data Urodzenia", "Płeć"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 420, 420));

        powrotButton.setBackground(new java.awt.Color(68, 107, 147));
        powrotButton.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        powrotButton.setForeground(new java.awt.Color(255, 255, 255));
        powrotButton.setText("POWRÓT DO PANELU GŁÓWNEGO");
        powrotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powrotButtonActionPerformed(evt);
            }
        });
        background.add(powrotButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 630, -1, -1));

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

    private void jWyszukiwanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWyszukiwanieActionPerformed
    }//GEN-LAST:event_jWyszukiwanieActionPerformed

    private void bWyszukajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bWyszukajActionPerformed
        List<Pacjent> listaPacjentow = wyszukaj(Long.parseLong(this.jWyszukiwanie.getText()));
//        ArrayList<PacjentEntity> pacjentsList = new ArrayList<PacjentEntity>();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        if (model.getRowCount() > 0) {
            model.setRowCount(0);
        }
        
        System.out.println(listaPacjentow);

//        for (int i=0; i < listaPacjentow.size(); i++) {
//            Long pesel = listaPacjentow.get(i).getPesel();
//            String imie = listaPacjentow.get(i).getImie();
//            String nazwisko = listaPacjentow.get(i).getNazwisko();
//            String dataUrodzenia = listaPacjentow.get(i).getDataUrodzenia().toString();
//            String plec;
//                if (String.valueOf(listaPacjentow.get(i).getPlec()).equals("0")) {
//                    plec = "Kobieta";
//                } else {
//                    plec = "Mezczyzna";
//                }
//            PacjentEntity pacjent = new PacjentEntity(pesel, imie, nazwisko, dataUrodzenia, plec);
//            pacjentsList.add(pacjent);           
//        }
        
        Object rowData[] = new Object[5];
        for(int i=0; i < listaPacjentow.size(); i++) {
            rowData[0] = listaPacjentow.get(i).getPesel();
            rowData[1] = listaPacjentow.get(i).getImie();
            rowData[2] = listaPacjentow.get(i).getNazwisko();
            rowData[3] =
                    String.valueOf(listaPacjentow.get(i).getDataUrodzenia().getDate()) + "/" +
                    String.valueOf(listaPacjentow.get(i).getDataUrodzenia().getMonth() + 1) + "/" +
                    String.valueOf(listaPacjentow.get(i).getDataUrodzenia().getYear() + 1900);
            
            if(listaPacjentow.get(i).getPlec()) {
                rowData[4] = "Mężczyzna";
            } else {
                rowData[4] = "Kobieta";
            }
            
            model.addRow(rowData);
        }
        
    }//GEN-LAST:event_bWyszukajActionPerformed

    private void powrotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powrotButtonActionPerformed
        glowny.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_powrotButtonActionPerformed

    public static void main(String args[]) {

//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new WyszukiwarkaFrame().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bWyszukaj;
    private javax.swing.JPanel background;
    private javax.swing.JLabel jNazwa;
    private javax.swing.JLabel jOpis;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jWyszukiwanie;
    private javax.swing.JButton powrotButton;
    // End of variables declaration//GEN-END:variables

}
