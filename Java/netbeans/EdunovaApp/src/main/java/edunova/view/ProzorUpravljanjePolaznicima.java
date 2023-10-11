/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edunova.view;

import edunova.controller.ObradaPolaznik;
import edunova.model.Polaznik;
import edunova.util.Alati;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Polaznik
 */
public class ProzorUpravljanjePolaznicima extends javax.swing.JFrame {

    private ProzorGrupa prozorGrupa;
    private ObradaPolaznik obradaPolaznik;

    /**
     * Creates new form ProzorUpravljanjePolaznicima
     */
    public ProzorUpravljanjePolaznicima(ProzorGrupa prozorGrupa) {
        initComponents();
        this.prozorGrupa = prozorGrupa;
        obradaPolaznik = new ObradaPolaznik();
        setTitle(Alati.NAZIV_APP + " | Polaznici, " + prozorGrupa.getObradaGrupa().getEntitet().getNaziv());

        DefaultListModel<Polaznik> m = new DefaultListModel<>();
        m.addAll(prozorGrupa.getObradaGrupa().getEntitet().getPolaznici());
        lstPolazniciNaGrupi.setModel(m);
        lstPolazniciNaGrupi.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPolazniciNaGrupi = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPolazniciUBazi = new javax.swing.JList<>();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        chbPrikaziClanoveGrupe = new javax.swing.JCheckBox();
        lblUkupnoPolaznika = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Polaznici na grupi");

        jScrollPane1.setViewportView(lstPolazniciNaGrupi);

        lstPolazniciUBazi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstPolazniciUBazi);

        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUvjetKeyPressed(evt);
            }
        });

        btnTrazi.setText("Traži");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        jLabel2.setText("Svi polaznici");

        chbPrikaziClanoveGrupe.setText("Prikaži članove grupe");
        chbPrikaziClanoveGrupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbPrikaziClanoveGrupeActionPerformed(evt);
            }
        });

        btnDodaj.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDodaj.setText("<<");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnObrisi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnObrisi.setText(">>");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDodaj)
                            .addComponent(btnObrisi))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtUvjet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTrazi))
                    .addComponent(chbPrikaziClanoveGrupe, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUkupnoPolaznika, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnTrazi))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(48, Short.MAX_VALUE)
                                .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbPrikaziClanoveGrupe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUkupnoPolaznika, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnDodaj)
                        .addGap(87, 87, 87)
                        .addComponent(btnObrisi)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        DefaultListModel<Polaznik> m = new DefaultListModel<>();

        List<Polaznik> polazniciIzBaze = obradaPolaznik.read(txtUvjet.getText(), 1000);

        if (!chbPrikaziClanoveGrupe.isSelected()) {
            DefaultListModel<Polaznik> png = (DefaultListModel<Polaznik>) lstPolazniciNaGrupi.getModel();

            boolean postoji;

            for (Polaznik p : polazniciIzBaze) {
                postoji = false;
                for (int i = 0; i < png.getSize(); i++) {
                    if (p.getSifra().equals(png.get(i).getSifra())) {
                        postoji = true;
                        break;
                    }
                }
                if (!postoji) {
                    m.addElement(p);
                }
            }
        } else {
            m.addAll(polazniciIzBaze);
        }

        lblUkupnoPolaznika.setText("Pronađeno rezultata: " + m.size());
        lstPolazniciUBazi.setModel(m);
        lstPolazniciUBazi.repaint();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void chbPrikaziClanoveGrupeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbPrikaziClanoveGrupeActionPerformed
        btnTraziActionPerformed(evt);
    }//GEN-LAST:event_chbPrikaziClanoveGrupeActionPerformed

    private void txtUvjetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnTraziActionPerformed(null);
        }
    }//GEN-LAST:event_txtUvjetKeyPressed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        if (lstPolazniciUBazi.getSelectedValue() == null) {
            return;
        }

        var p = lstPolazniciUBazi.getSelectedValue();

        boolean mozeDodati = true;
        DefaultListModel<Polaznik> m = (DefaultListModel<Polaznik>) lstPolazniciNaGrupi.getModel();
        List<Polaznik> polaznici = new ArrayList<>();

        for (int i = 0; i < m.size(); i++) {
            if (p.getSifra().equals(m.get(i).getSifra())) {
                mozeDodati = false;
                //break;
            }
            polaznici.add(m.get(i));
        }

        if (!mozeDodati) {
            return;
        }

        m.addElement(p);

        polaznici.add(p);

        prozorGrupa.getObradaGrupa().getEntitet().setPolaznici(polaznici);

        try {
            prozorGrupa.getObradaGrupa().update();
        } catch (Exception e) {
        }

        prozorGrupa.popuniView();

        lstPolazniciNaGrupi.repaint();


    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        if (lstPolazniciNaGrupi.getSelectedValue() == null) {
            return;
        }

        DefaultListModel<Polaznik> m = (DefaultListModel<Polaznik>) lstPolazniciNaGrupi.getModel();
        m.removeElementAt(lstPolazniciNaGrupi.getSelectedIndex());

        List<Polaznik> polaznici = new ArrayList<>();

        for (int i = 0; i < m.size(); i++) {
            polaznici.add(m.get(i));
        }

        prozorGrupa.getObradaGrupa().getEntitet().setPolaznici(polaznici);

        try {
            prozorGrupa.getObradaGrupa().update();
        } catch (Exception e) {
        }

        prozorGrupa.popuniView();
        lstPolazniciNaGrupi.repaint();

        btnTraziActionPerformed(null);
    }//GEN-LAST:event_btnObrisiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JCheckBox chbPrikaziClanoveGrupe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblUkupnoPolaznika;
    private javax.swing.JList<Polaznik> lstPolazniciNaGrupi;
    private javax.swing.JList<Polaznik> lstPolazniciUBazi;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables
}