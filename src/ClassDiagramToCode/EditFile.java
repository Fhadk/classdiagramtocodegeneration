/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDiagramToCode;

import java.io.FileOutputStream;

/**
 *
 * @author Fhad Khan
 */
public class EditFile extends javax.swing.JFrame {

    /**
     * Creates new form EditFile
     */
    public EditFile() {
//        super();
        initComponents();
    }
    public void setValues(String content,String path){
        TextArea_editFile.setText(content);
        this.path=path;
    }
    
    
    /*public String getContent(String content){
        if(count==0){
            TextArea_editFile.setText(content);
            count++;
        }
        return this.content;
    }*/
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_editFile = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea_editFile = new javax.swing.JTextArea();
        button_UpdateFile = new javax.swing.JButton();
        label_designView = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit File");
        setResizable(false);

        TextArea_editFile.setColumns(20);
        TextArea_editFile.setRows(5);
        jScrollPane1.setViewportView(TextArea_editFile);

        button_UpdateFile.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        button_UpdateFile.setText("Update File");
        button_UpdateFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_UpdateFileActionPerformed(evt);
            }
        });

        label_designView.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        label_designView.setText("Edit File");

        javax.swing.GroupLayout Panel_editFileLayout = new javax.swing.GroupLayout(Panel_editFile);
        Panel_editFile.setLayout(Panel_editFileLayout);
        Panel_editFileLayout.setHorizontalGroup(
            Panel_editFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(Panel_editFileLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(button_UpdateFile))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_editFileLayout.createSequentialGroup()
                .addContainerGap(307, Short.MAX_VALUE)
                .addComponent(label_designView)
                .addGap(305, 305, 305))
        );
        Panel_editFileLayout.setVerticalGroup(
            Panel_editFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_editFileLayout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(label_designView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_UpdateFile, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_editFile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_editFile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("EditFile");

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void button_UpdateFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_UpdateFileActionPerformed
      String content=TextArea_editFile.getText();
      try{  
        file = new FileOutputStream(path);
        file.write(content.getBytes());
        DesignView.content=content;
      }catch(Exception e){
          e.getMessage();
      }
//       getContent(content);
       dispose();
    }//GEN-LAST:event_button_UpdateFileActionPerformed

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
            java.util.logging.Logger.getLogger(EditFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditFile().setVisible(true);
            }
        });
    }
    public String path;
    FileOutputStream file;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_editFile;
    private javax.swing.JTextArea TextArea_editFile;
    private javax.swing.JButton button_UpdateFile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_designView;
    // End of variables declaration//GEN-END:variables
}