
package ClassDiagramToCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Fhad Khan
 */
public class CodeView extends javax.swing.JFrame {

    /**
     * Creates new form CodeView
     */
    public CodeView() {
        initComponents();
        TextArea_codeView.setText("package Resources; \n\n");
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        Panel_CodeView = new javax.swing.JPanel();
        label_CodeView = new javax.swing.JLabel();
        button_buildClass = new javax.swing.JButton();
        textfield_errorStream = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea_codeView = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItem_Open = new javax.swing.JMenuItem();
        MenuItem_edit = new javax.swing.JMenuItem();
        MenuItem_save = new javax.swing.JMenuItem();
        MenuItem_Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuItem_Help = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        label_CodeView.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        label_CodeView.setText("Code View");

        button_buildClass.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        button_buildClass.setText("Build Class");
        button_buildClass.setEnabled(false);
        button_buildClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_buildClassActionPerformed(evt);
            }
        });

        textfield_errorStream.setEditable(false);
        textfield_errorStream.setForeground(new java.awt.Color(255, 0, 0));

        TextArea_codeView.setColumns(20);
        TextArea_codeView.setRows(5);
        jScrollPane1.setViewportView(TextArea_codeView);

        org.jdesktop.layout.GroupLayout Panel_CodeViewLayout = new org.jdesktop.layout.GroupLayout(Panel_CodeView);
        Panel_CodeView.setLayout(Panel_CodeViewLayout);
        Panel_CodeViewLayout.setHorizontalGroup(
            Panel_CodeViewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(textfield_errorStream)
            .add(Panel_CodeViewLayout.createSequentialGroup()
                .add(376, 376, 376)
                .add(label_CodeView)
                .add(0, 375, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, Panel_CodeViewLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(button_buildClass)
                .add(28, 28, 28))
            .add(jScrollPane1)
        );
        Panel_CodeViewLayout.setVerticalGroup(
            Panel_CodeViewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(Panel_CodeViewLayout.createSequentialGroup()
                .add(26, 26, 26)
                .add(label_CodeView)
                .add(19, 19, 19)
                .add(button_buildClass, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 454, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(textfield_errorStream, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        MenuItem_Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_Open.setText("Open");
        MenuItem_Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_OpenActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItem_Open);

        MenuItem_edit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_edit.setText("Edit");
        MenuItem_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_editActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItem_edit);

        MenuItem_save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_save.setText("Save");
        MenuItem_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_saveActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItem_save);

        MenuItem_Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_Exit.setText("Exit");
        MenuItem_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ExitActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItem_Exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        MenuItem_Help.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_Help.setText("Help");
        MenuItem_Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_HelpActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItem_Help);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(Panel_CodeView, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(Panel_CodeView, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void button_buildClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_buildClassActionPerformed
        textfield_errorStream.setText(null);
        try{
            int check=CodeViewClass.mainFunction(filePath);
            if(check ==1){
                errorContent = new Scanner(new File("..\\ClassDiagramToCode\\src\\resources\\errors.txt")).useDelimiter("\\Z").next();
                textfield_errorStream.setText(errorContent);
            }else{
                button_buildClass.setEnabled(true);
            }
        }catch(Exception e){
            e.getMessage();
        }
    }//GEN-LAST:event_button_buildClassActionPerformed

    private void MenuItem_OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_OpenActionPerformed
      JFileChooser choice=new JFileChooser();
      int option= choice.showOpenDialog(this);
      if(option== JFileChooser.APPROVE_OPTION){                              // If open button is clicked
          File file=choice.getSelectedFile();
          filePath=file.getPath();
          String path=file.getPath();
          if(path.contains(".java")){
              try{
//                String content = new Scanner(new File(path)).useDelimiter("\\Z").next();    // getting the contents of files
                fileInput= new FileInputStream(path);               //  FileInputStream
                button_buildClass.setEnabled(true);                                         // buildClass Button Enabled
                button_buildClass.setEnabled(true); 
                textfield_errorStream.setText("Message: File Meta-data Created SucussFully !! ");
              }catch(Exception e){
                  e.getMessage();
              }
          }else{
              textfield_errorStream.setText("ERROR: File Extension Mismatch!! ");
          }          
      }else if(option==JFileChooser.CANCEL_OPTION){                                     // If Close button/ Cross button clicked
          JOptionPane.showMessageDialog(this,"Cancel Dialouge", "Cancel", 1 );
      }else{}
    }//GEN-LAST:event_MenuItem_OpenActionPerformed

    private void MenuItem_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_editActionPerformed
      JFileChooser choice=new JFileChooser();
      int option= choice.showOpenDialog(this);
      if(option== JFileChooser.APPROVE_OPTION){                                              // If open button is clicked
          File file=choice.getSelectedFile();
          String path=file.getPath();
          filePath=file.getPath();
          if(path.contains(".java")){
              try{
                String content = new Scanner(new File(path)).useDelimiter("\\Z").next();    // getting the contents of files
                EditFile obj=new EditFile();                                                // Object Created for EditFile
                obj.setVisible(true);
                obj.setValues(content,path);
                button_buildClass.setEnabled(true);                                         // buildClass Button Enabled
                button_buildClass.setEnabled(true);
                textfield_errorStream.setText("Message: File Edited SucussFully !! ");
              }catch(Exception e){
                  e.getMessage();
              }
          }else{
              textfield_errorStream.setText("ERROR: File Extension Mismatch!! ");
          }          
      }else if(option==JFileChooser.CANCEL_OPTION){                                        // If Close/Cross button is clicked
          JOptionPane.showMessageDialog(this,"Cancel Dialouge", "Cancel", 1 );
      }else{}

    }//GEN-LAST:event_MenuItem_editActionPerformed

    private void MenuItem_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_saveActionPerformed
       String content=TextArea_codeView.getText();
       
       JFileChooser choice=new JFileChooser();
       choice.setDialogTitle("Save As");
       int option= choice.showSaveDialog(this);
       if(option== JFileChooser.APPROVE_OPTION){
           File file=choice.getSelectedFile();
           filePath= file.getName();
          try{
               fileOutput =new FileOutputStream(filePath);
               fileOutput.write(content.getBytes());
               textfield_errorStream.setText("Message: File Saved SucussFully !! ");
           }catch(Exception e){
               e.getMessage();
           }           
       }else if(option==JFileChooser.CANCEL_OPTION){                                     // If Close button/ Cross button clicked
          JOptionPane.showMessageDialog(this,"Cancel Dialouge", "Cancel", 1 );
      }else{}
      button_buildClass.setEnabled(true);
    }//GEN-LAST:event_MenuItem_saveActionPerformed

    private void MenuItem_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ExitActionPerformed
       dispose();
    }//GEN-LAST:event_MenuItem_ExitActionPerformed

    private void MenuItem_HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_HelpActionPerformed
        JOptionPane.showMessageDialog(this,MESSAGE,"Help",1);
    }//GEN-LAST:event_MenuItem_HelpActionPerformed

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
            java.util.logging.Logger.getLogger(CodeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CodeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CodeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CodeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CodeView().setVisible(true);                
            }
        });
    }
    
    FileInputStream fileInput; 
    FileOutputStream fileOutput;
    final String MESSAGE="Every Component is self explainatry for further more info mail @ contact@fahadkhan.net";
    public String filePath, content, errorContent;
    public static ClassInfo[] info;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItem_Exit;
    private javax.swing.JMenuItem MenuItem_Help;
    private javax.swing.JMenuItem MenuItem_Open;
    private javax.swing.JMenuItem MenuItem_edit;
    private javax.swing.JMenuItem MenuItem_save;
    private javax.swing.JPanel Panel_CodeView;
    private javax.swing.JTextArea TextArea_codeView;
    private javax.swing.JButton button_buildClass;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_CodeView;
    private javax.swing.JTextField textfield_errorStream;
    // End of variables declaration//GEN-END:variables
}