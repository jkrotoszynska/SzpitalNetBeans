package frontend;

import backend.HistoriaLeczen;
import backend.Lekarz;
import backend.Pacjent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class MoiPacjenciFrame extends javax.swing.JFrame {
    
    private EkranGlownyFrame glowny;
    Lekarz lekarz;

    public MoiPacjenciFrame(EkranGlownyFrame glowny, Lekarz lekarz) {
        initComponents();
        this.glowny = glowny;
        this.lekarz = lekarz;
        
        //zmniejszenie kolumny ID
        historiaLeczeniaTable.getColumnModel().getColumn(0).setPreferredWidth(10);
        
        DefaultListModel listModel = new DefaultListModel();
        
        List<HistoriaLeczen> wszystkieHistorieLekarza =  wylistujHistorie(lekarz);
        List<Long> peselePowtorzone = new ArrayList<>();
        
        for (int i=0; i < wszystkieHistorieLekarza.size(); i++) {
            peselePowtorzone.add(wszystkieHistorieLekarza.get(i).getPesel().getPesel());
        }
        
        List<Long> pesele = new ArrayList<>(new HashSet<>(peselePowtorzone));
        
        for (int i=0; i < pesele.size(); i++) {
            listModel.addElement(pesele.get(i));
        }
        
        jListaPacjentow.setModel(listModel);
        
        jListaPacjentow.addListSelectionListener(e -> {
            wypelnijFormularz(String.valueOf(jListaPacjentow.getSelectedValue()));
        });
    }
    
    public void wypelnijFormularz(String pesel) {
        Long peselLong = Long.valueOf(pesel);
        
        //Informacje o pacjencie
        List<Pacjent> pacjentEntity = wyszukajPacjenta(peselLong);
        pacjentImieLabel.setText("IMIĘ: " + String.valueOf(pacjentEntity.get(0).getImie()));
        pacjentNazwiskoLabel.setText("NAZWISKO: " + String.valueOf(pacjentEntity.get(0).getNazwisko()));
        pacjentPeselLabel.setText("PESEL: " + String.valueOf(pacjentEntity.get(0).getPesel()));
        pacjentDataUrodzeniaLabel.setText("D. URO.: " + String.valueOf(pacjentEntity.get(0).getDataUrodzenia().getDate()) + "/" +
                    String.valueOf(pacjentEntity.get(0).getDataUrodzenia().getMonth() + 1) + "/" +
                    String.valueOf(pacjentEntity.get(0).getDataUrodzenia().getYear() + 1900));
        
        if (pacjentEntity.get(0).getPlec()) {
            pacjentPlecLabel.setText("PŁEĆ: M");
        } else {
            pacjentPlecLabel.setText("PŁEĆ: K");
        }
        
        //Historia lczenia
        List<HistoriaLeczen> historiaPacjentaEntity = historiePacjenta(pacjentEntity.get(0));
        DefaultTableModel tableModel = (DefaultTableModel) historiaLeczeniaTable.getModel();
        
        if (tableModel.getRowCount() > 0) {
            tableModel.setRowCount(0);
        }
        
        Object rowData[] = new Object[4];
        for(int i=0; i < historiaPacjentaEntity.size(); i++) {
            rowData[0] = historiaPacjentaEntity.get(i).getId();
            rowData[1] = historiaPacjentaEntity.get(i).getChoroba();
            rowData[2] = 
                    String.valueOf(historiaPacjentaEntity.get(i).getDataPrzyjecia().getDate()) + "/" +
                    String.valueOf(historiaPacjentaEntity.get(i).getDataPrzyjecia().getMonth() + 1) + "/" +
                    String.valueOf(historiaPacjentaEntity.get(i).getDataPrzyjecia().getYear() + 1900);
            rowData[3] = 
                    String.valueOf(historiaPacjentaEntity.get(i).getDataWypisu().getDate()) + "/" +
                    String.valueOf(historiaPacjentaEntity.get(i).getDataWypisu().getMonth() + 1) + "/" +
                    String.valueOf(historiaPacjentaEntity.get(i).getDataWypisu().getYear() + 1900);
            
            tableModel.addRow(rowData);
        }
        
    }
    
    EntityManagerFactory emf;
    public EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("SzpitalPU");
        }
        return emf.createEntityManager();
    }
    //pobierz historie leczeń pacjentów zalogowanego lekarza
    public List<HistoriaLeczen> wylistujHistorie(Lekarz idLekarza){
        EntityManager em = this.getEntityManager();
        TypedQuery<HistoriaLeczen> q = em.createNamedQuery("HistoriaLeczen.findByIdLekarza", HistoriaLeczen.class);
        q.setParameter("idLekarza", idLekarza.getIdLekarza());
//        System.out.println(q.getResultList());
        return q.getResultList();
    }
    
    //z pobranej historii leczeń wyciągnij pesele
    public List<Pacjent> wylistujPacjentow(List<HistoriaLeczen> historiaLeczen){
        EntityManager em = this.getEntityManager();
        TypedQuery<Pacjent> q = em.createNamedQuery("Pacjent.findByPesel", Pacjent.class);
        for(int i=0; i<historiaLeczen.size(); i++) {
            q.setParameter("pesel", historiaLeczen.get(i).getPesel().getPesel());
//            System.out.println(q.getResultList());
        }
        return q.getResultList();
    }
    
    public List<Pacjent> wyszukajPacjenta(Long pesel){
        EntityManager em = this.getEntityManager();
        TypedQuery<Pacjent> q = em.createNamedQuery("Pacjent.findByPesel", Pacjent.class);
        q.setParameter("pesel", pesel);
        return q.getResultList();
    }
    
    public List<HistoriaLeczen> historiePacjenta(Pacjent pacjent){
        EntityManager em = this.getEntityManager();
        TypedQuery<HistoriaLeczen> q = em.createNamedQuery("HistoriaLeczen.findByPesel", HistoriaLeczen.class);
        q.setParameter("pesel", pacjent.getPesel());
//        System.out.println(q.getResultList());
        
        return q.getResultList();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListaPacjentow = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historiaLeczeniaTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        pacjentNazwiskoLabel = new javax.swing.JLabel();
        pacjentImieLabel = new javax.swing.JLabel();
        pacjentPeselLabel = new javax.swing.JLabel();
        pacjentDataUrodzeniaLabel = new javax.swing.JLabel();
        pacjentPlecLabel = new javax.swing.JLabel();
        jNazwa = new javax.swing.JLabel();
        jOpis = new javax.swing.JLabel();
        powrotButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(java.awt.SystemColor.activeCaption);
        background.setFocusable(false);
        background.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        background.setInheritsPopupMenu(true);
        background.setMinimumSize(new java.awt.Dimension(1000, 670));
        background.setPreferredSize(new java.awt.Dimension(1000, 670));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jListaPacjentow.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListaPacjentow);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 240, 440));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        historiaLeczeniaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Choroba", "Data Przyjęcia", "Data Wypisu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(historiaLeczeniaTable);

        pacjentNazwiskoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pacjentNazwiskoLabel.setForeground(new java.awt.Color(0, 0, 0));
        pacjentNazwiskoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pacjentNazwiskoLabel.setText("NAZWISKO: ");

        pacjentImieLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pacjentImieLabel.setForeground(new java.awt.Color(0, 0, 0));
        pacjentImieLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pacjentImieLabel.setText("IMIĘ: ");

        pacjentPeselLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pacjentPeselLabel.setForeground(new java.awt.Color(0, 0, 0));
        pacjentPeselLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pacjentPeselLabel.setText("PESEL: ");

        pacjentDataUrodzeniaLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pacjentDataUrodzeniaLabel.setForeground(new java.awt.Color(0, 0, 0));
        pacjentDataUrodzeniaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pacjentDataUrodzeniaLabel.setText("D. URO.:");

        pacjentPlecLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pacjentPlecLabel.setForeground(new java.awt.Color(0, 0, 0));
        pacjentPlecLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pacjentPlecLabel.setText("PŁEĆ: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pacjentImieLabel)
                            .addComponent(pacjentNazwiskoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pacjentPeselLabel)
                            .addComponent(pacjentDataUrodzeniaLabel))
                        .addGap(127, 127, 127)
                        .addComponent(pacjentPlecLabel)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pacjentImieLabel)
                    .addComponent(pacjentDataUrodzeniaLabel)
                    .addComponent(pacjentPlecLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pacjentNazwiskoLabel)
                    .addComponent(pacjentPeselLabel))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 480, 440));

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
        background.add(powrotButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 630, -1, -1));

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

    public static void main(String args[]) {

//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MoiPacjenciFrame().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    public javax.swing.JTable historiaLeczeniaTable;
    public javax.swing.JList<String> jListaPacjentow;
    private javax.swing.JLabel jNazwa;
    private javax.swing.JLabel jOpis;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel pacjentDataUrodzeniaLabel;
    private javax.swing.JLabel pacjentImieLabel;
    private javax.swing.JLabel pacjentNazwiskoLabel;
    private javax.swing.JLabel pacjentPeselLabel;
    private javax.swing.JLabel pacjentPlecLabel;
    private javax.swing.JButton powrotButton;
    // End of variables declaration//GEN-END:variables

}
