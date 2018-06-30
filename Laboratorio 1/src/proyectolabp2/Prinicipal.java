/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolabp2;

import com.sun.xml.internal.ws.util.StringUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.OptionPaneUI;

/**
 *
 * @author Inspiron
 */
public class Prinicipal extends javax.swing.JFrame {

    /**
     * Creates new form Prinicipal
     */
    public Prinicipal() throws FileNotFoundException, IOException {
        this.setTitle("Proyecto Lab Progra 2");
        initComponents();
        quitar.add("in");
        quitar.add("at");
        quitar.add("by");
        quitar.add("of");
        quitar.add("you");
        quitar.add("to");
        quitar.add("and");
        quitar.add("for");
        quitar.add("an");
        quitar.add("a");
        quitar.add("I");
        quitar.add("on");
        quitar.add("is");
        quitar.add("from");
        quitar.add("the");
        leer("./input.txt");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Escoger Archivo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Frecuencia de Palabras Linea");

        jList1.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jList1);

        jButton2.setText("Siguiente Linea");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jList2.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jList2);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Top Ten Frecuencia Archivo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jButton2))
                            .addComponent(jButton1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Frecuencias", jPanel1);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Texto", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        leer_archivo();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:

        try {
            JFileChooser jfc = new JFileChooser("./");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archvivos de Texto", "txt");

            //jfc.setFileFilter(filtro);

            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                leer(jfc.getSelectedFile().getAbsolutePath());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Prinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Prinicipal().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Prinicipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Prinicipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private void leer(String path) throws FileNotFoundException, IOException {
        try {
            Archivo = new File(path);
            if (BR != null) {
                BR.close();
                FR.close();
                palabras_principal = new ArrayList();
                jTextArea1.setText("");
            }
            FR = new FileReader(Archivo);
            BR = new BufferedReader(FR);
            leer_archivo();
        } catch (Exception e) {
        }

    }

    private void leer_archivo() {

        try {

            String line = "";
            if ((line = BR.readLine()) != null) {
                if (line.isEmpty()) {
                } else {
                    jTextArea1.append(line + "\n");
                    String letrasvalidas = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

                    line.replaceAll("[^a-zA-Z]", "");
                    ArrayList<palabras> palabras = new ArrayList();
                    ArrayList<palabras> cominaciones = new ArrayList<>();
                    String[] apalabras = line.split(" ");
                    for (int i = 0; i < apalabras.length; i++) {
                        String p = "";
                        for (int j = 0; j < apalabras[i].length(); j++) {
                            if (letrasvalidas.contains(apalabras[i].substring(j, j + 1))) {
                                p += apalabras[i].substring(j, j + 1);
                            }

                        }
                        if (p.isEmpty() || quitar.contains(p.toLowerCase())) {

                        } else {
                            palabras.add(new palabras(p));
                            cominaciones.add(new palabras(p.toLowerCase()));
                        }

                    }
                    int size = palabras.size();
                    for (int i = 0; i < size - 1; i++) {
                        String temp = palabras.get(i).getPalabra() + " ";
                        temp += palabras.get(i + 1).getPalabra();

                        cominaciones.add(new palabras(temp.toLowerCase()));
                    }
                    for (int i = 0; i < size - 2; i++) {
                        String temp = palabras.get(i).getPalabra() + " ";
                        temp += palabras.get(i + 1).getPalabra() + " ";
                        temp += palabras.get(i + 2).getPalabra();

                        cominaciones.add(new palabras(temp.toLowerCase()));
                    }
                    ArrayList<palabras> palabras2 = new ArrayList<>();
                    ArrayList<palabras> palabras3 = new ArrayList<>();
                    for (int i = 0; i < palabras.size() - 1; i++) {
                        for (int j = i; j < palabras.size() - 1; j++) {
                            String temp;
                            temp = palabras.get(i).getPalabra() + " ";
                            temp += palabras.get(j + 1).getPalabra();

                            palabras2.add(new palabras(temp));
                        }
                    }

                    for (int i = 0; i < palabras.size() - 2; i++) {
                        for (int j = i; j < palabras.size() - 2; j++) {
                            String temp;
                            temp = palabras.get(i).getPalabra() + " ";
                            temp += palabras.get(j + 1).getPalabra() + " ";
                            temp += palabras.get(j + 2).getPalabra();

                            palabras3.add(new palabras(temp));
                        }
                    }
                    palabras.addAll(palabras2);
                    palabras.addAll(palabras3);

                    for (int i = 0; i < palabras.size(); i++) {
                        for (int j = 0; j < cominaciones.size(); j++) {
                            if (palabras.get(i).getPalabra().toLowerCase().equals(cominaciones.get(j).getPalabra())) {
                                palabras.get(i).setRepite(palabras.get(i).getRepite() + 1);
                            }
                        }
                        if (palabras.get(i).getRepite() == 0) {
                            palabras.get(i).setRepite(1);
                        }
                    }
                    for (int i = 0; i < palabras.size(); i++) {
                        for (int j = i + 1; j < palabras.size(); j++) {
                            if (palabras.get(i).getPalabra().toLowerCase().equals(palabras.get(j).getPalabra().toLowerCase())) {
                                palabras.remove(j);
                            }
                        }
                    }
                    DefaultListModel m = (DefaultListModel) jList1.getModel();
                    m.removeAllElements();
                    for (int i = 0; i < palabras.size(); i++) {
                        m.addElement(palabras.get(i));

                    }
                    jList1.setModel(m);
                    palabras_principal.addAll(palabras);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Lectura de Archivo Terminada", "Fin de Archivo", JOptionPane.INFORMATION_MESSAGE, javax.swing.UIManager.getIcon("OptionPane.informationIcon"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

        } catch (Exception e) {
            e.printStackTrace();
        }

        palabras aux;
        int i, j;
        for (i = 0; i < palabras_principal.size() - 1; i++) {
            for (j = 0; j < palabras_principal.size() - i - 1; j++) {
                if (palabras_principal.get(j + 1).getRepite() > palabras_principal.get(j).getRepite()) {
                    aux = palabras_principal.get(j + 1);
                    palabras_principal.set(j + 1, palabras_principal.get(j));
                    palabras_principal.set(j, aux);
                }
            }
        }
        try {
            DefaultListModel m2 = (DefaultListModel) jList2.getModel();
            m2.removeAllElements();
            for (i = 0; i < 10; i++) {
                m2.addElement(palabras_principal.get(i));
            }
            jList2.setModel(m2);
        } catch (Exception e) {
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
    ArrayList<palabras> palabras_principal = new ArrayList();
    ArrayList<String> quitar = new ArrayList<>();
    File Archivo = null;
    FileReader FR = null;
    BufferedReader BR = null;
}
