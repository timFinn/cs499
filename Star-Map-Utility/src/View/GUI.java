/*
 * 
 * 
 * 
 */
package View;

import Controller.*;
import Model.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.util.ArrayList;


/**
 *
 * @author Your Name <timothy>
 */
public class GUI extends javax.swing.JFrame {


    private double latConverted;
    private double longConverted;
    private Date dateConverted;
    private Date timeConverted;
    
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
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
        jTextArea1 = new javax.swing.JTextArea();
        longEntered = new javax.swing.JTextField();
        latEntered = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        latLabel = new javax.swing.JLabel();
        longLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        dateEntered = new javax.swing.JTextField();
        timeEntered = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Star Map Utility");

        longEntered.setText("00.000000");
        longEntered.setToolTipText("");

        latEntered.setText("00.000000");

        submitButton.setText("Submit Query");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        latLabel.setText("Latitude");

        longLabel.setText("Longitude");

        dateLabel.setText("Date");

        timeLabel.setText("Time");

        dateEntered.setText("MM/dd/yyyy");

        timeEntered.setText("23:59:59 CST");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(latLabel)
                            .addComponent(longLabel)
                            .addComponent(dateLabel)
                            .addComponent(timeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(timeEntered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(latEntered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(longEntered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dateEntered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(submitButton)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {latEntered, longEntered});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(latEntered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(latLabel))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(longEntered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(longLabel))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(dateEntered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel)
                    .addComponent(timeEntered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitButton)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        latConverted = Double.parseDouble(latEntered.getText());
        longConverted = Double.parseDouble(longEntered.getText());
        
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");             
        try
        {
            dateConverted = df.parse(dateEntered.getText());

        } catch(ParseException e)
                {
                    e.printStackTrace();
                    System.out.println("Date format incorrect. Try again.");
                    JOptionPane.showMessageDialog(new JDialog(),
                                                    "Date format incorrect. Try again.",
                                                    "Warning!",
                                                    JOptionPane.WARNING_MESSAGE);
                }
        
        DateFormat tf = new SimpleDateFormat("HH:mm:ss z");             
        
        try
        {
            timeConverted = tf.parse(timeEntered.getText());

        } catch(ParseException e)
                {
                    e.printStackTrace();
                    System.out.println("Time format incorrect. Try again.");
                    JOptionPane.showMessageDialog(new JDialog(),
                                                    "Time format incorrect. Try again.",
                                                    "Warning!",
                                                    JOptionPane.WARNING_MESSAGE);
                }
        
        Controller.Observer observed = new Observer(latConverted, longConverted, dateConverted, timeConverted);
    }//GEN-LAST:event_submitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        Model.Database db = Model.Database.getDB();
//        db.startConnection();
        
        // poop
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        // Test Area
        String celestialObjectType;
        ArrayList celestialObjectArray = new ArrayList();
        
        celestialObjectType = "Messier";
        celestialObjectArray = new StarParser().CSVToArrayList(celestialObjectType, celestialObjectArray);
        
        celestialObjectType = "Planet";
        celestialObjectArray = new StarParser().CSVToArrayList(celestialObjectType, celestialObjectArray);
        
        celestialObjectType = "Star";
        celestialObjectArray = new StarParser().CSVToArrayList(celestialObjectType, celestialObjectArray);
        
        System.out.println(celestialObjectArray.toString());
        //
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateEntered;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField latEntered;
    private javax.swing.JLabel latLabel;
    private javax.swing.JTextField longEntered;
    private javax.swing.JLabel longLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField timeEntered;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
