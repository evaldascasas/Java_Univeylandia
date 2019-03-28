/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alumne
 */
public class Main extends javax.swing.JFrame {

    static final String DB_URL = "jdbc:mysql://univeylandia.cat:3306/univeylandia_test2";
    static final String DB_DRV = "com.mysql.jdbc.Driver";
    static final String DB_USER = "super";
    static final String DB_PASSWD = "Alumne123";

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Univeylandia Database Management");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        //this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        selectStatement = new javax.swing.JTextArea();
        connectionStatus = new javax.swing.JLabel();
        executeSelect = new javax.swing.JButton();
        clearWindow = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        executeSql = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        sqlStatement = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectStatement.setColumns(20);
        selectStatement.setRows(5);
        jScrollPane1.setViewportView(selectStatement);

        connectionStatus.setText("No connectat");

        executeSelect.setText("Executar SQL 1");
        executeSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeSelectActionPerformed(evt);
            }
        });

        clearWindow.setText("Netejar");
        clearWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearWindowActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabla);

        executeSql.setText("Executar SQL 2");
        executeSql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeSqlActionPerformed(evt);
            }
        });

        sqlStatement.setColumns(20);
        sqlStatement.setRows(5);
        jScrollPane3.setViewportView(sqlStatement);

        jLabel1.setText("Sentències SQL 1");

        jLabel2.setText("Sentències SQL 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(240, 240, 240)
                                .addComponent(connectionStatus)
                                .addGap(137, 137, 137))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(executeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clearWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(executeSql, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(connectionStatus)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(executeSelect)
                    .addComponent(clearWindow)
                    .addComponent(executeSql))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void executeSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeSelectActionPerformed
        // TODO add your handling code here:
        try {

            ArrayList columnNames = new ArrayList();
            //ArrayList data = new ArrayList();

            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);

            connectionStatus.setText("Connectat com: " + DB_USER);

            String query = selectStatement.getText();

            statement = connection.createStatement();

            if (query.toLowerCase().startsWith("select")) {
                resultSet = statement.executeQuery(query);

                // obtenir metadades del resultat de la consulta
                ResultSetMetaData md = resultSet.getMetaData();

                // comptar el numero de columnes del resultat
                int columnCount = md.getColumnCount();

                // emmagatzemar el nom de les columnes en un ArrayList
                for (int i = 1; i <= columnCount; i++) {
                    //System.out.print(md.getColumnName(i)+"\t");
                    columnNames.add(md.getColumnName(i));
                }

                // Generar taula
                DefaultTableModel model = new DefaultTableModel();
                tabla.setModel(model);

                for (int i = 0; i < columnNames.size(); i++) {
                    model.addColumn(columnNames.get(i));
                }

                // mostrar les dades en la taula despres d'haver-les guardat en un Objecte[]
                while (resultSet.next()) {
                    Object[] row = new Object[columnCount];

                    for (int i = 0; i < columnCount; ++i) {
                        //row.add(resultSet.getObject(i));
                        row[i] = resultSet.getObject(i + 1);
                    }
                    //data.add(row);
                    model.addRow(row);
                }

                resultSet.close();

                /*// DEBUG - imprimir els ArrayList
            for (int i = 0; i < data.size(); i++) {
                System.out.print(columnNames.get(i));
                System.out.println(data.get(i));
            }*/
            } else {
                statement.executeUpdate(query);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, ex);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_executeSelectActionPerformed

    private void clearWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearWindowActionPerformed
        // TODO add your handling code here:
        selectStatement.setText(null);
        sqlStatement.setText(null);
    }//GEN-LAST:event_clearWindowActionPerformed

    private void executeSqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeSqlActionPerformed
        // TODO add your handling code here:
        /*try {

            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);

            connectionStatus.setText("Connectat com: " + DB_USER);

            String query = sqlStatement.getText();

            statement = connection.createStatement();

            statement.executeUpdate(query);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, ex);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(this, ex);
            }
        }*/
        try {

            ArrayList columnNames = new ArrayList();
            //ArrayList data = new ArrayList();

            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);

            connectionStatus.setText("Connectat com: " + DB_USER);

            String query = sqlStatement.getText();

            statement = connection.createStatement();

            if (query.toLowerCase().startsWith("select")) {
                resultSet = statement.executeQuery(query);

                // obtenir metadades del resultat de la consulta
                ResultSetMetaData md = resultSet.getMetaData();

                // comptar el numero de columnes del resultat
                int columnCount = md.getColumnCount();

                // emmagatzemar el nom de les columnes en un ArrayList
                for (int i = 1; i <= columnCount; i++) {
                    //System.out.print(md.getColumnName(i)+"\t");
                    columnNames.add(md.getColumnName(i));
                }

                // Generar taula
                DefaultTableModel model = new DefaultTableModel();
                tabla.setModel(model);

                for (int i = 0; i < columnNames.size(); i++) {
                    model.addColumn(columnNames.get(i));
                }

                // mostrar les dades en la taula despres d'haver-les guardat en un Objecte[]
                while (resultSet.next()) {
                    Object[] row = new Object[columnCount];

                    for (int i = 0; i < columnCount; ++i) {
                        //row.add(resultSet.getObject(i));
                        row[i] = resultSet.getObject(i + 1);
                    }
                    //data.add(row);
                    model.addRow(row);
                }

                resultSet.close();

                /*// DEBUG - imprimir els ArrayList
            for (int i = 0; i < data.size(); i++) {
                System.out.print(columnNames.get(i));
                System.out.println(data.get(i));
            }*/
            } else {
                statement.executeUpdate(query);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, ex);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(this, ex);
            }
        }

    }//GEN-LAST:event_executeSqlActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearWindow;
    public javax.swing.JLabel connectionStatus;
    private javax.swing.JButton executeSelect;
    private javax.swing.JButton executeSql;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea selectStatement;
    private javax.swing.JTextArea sqlStatement;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
