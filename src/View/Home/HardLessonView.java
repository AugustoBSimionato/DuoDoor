package View.Home;

import View.Content.HardContentView;

/**
 *
 * @author augustosimionato
 */
public class HardLessonView extends javax.swing.JFrame {

    public HardLessonView() {
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

        jLabel1 = new javax.swing.JLabel();
        phraseTextLabel1 = new javax.swing.JLabel();
        answerTextField1 = new javax.swing.JTextField();
        checkButton = new javax.swing.JButton();
        phraseTextLabel2 = new javax.swing.JLabel();
        answerTextField2 = new javax.swing.JTextField();
        phraseTextLabel3 = new javax.swing.JLabel();
        answerTextField3 = new javax.swing.JTextField();
        phraseTextLabel4 = new javax.swing.JLabel();
        answerTextField4 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        goBackMenu = new javax.swing.JMenu();
        hintMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Finalizando a jornada");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Traduza as frases a seguir");

        phraseTextLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        phraseTextLabel1.setText("Frase 1 aqui");

        checkButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        checkButton.setText("Verificar");
        checkButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkButtonMouseClicked(evt);
            }
        });

        phraseTextLabel2.setText("Frase 2 aqui");

        phraseTextLabel3.setText("Frase 3 aqui");

        phraseTextLabel4.setText("Frase 4 aqui");

        goBackMenu.setText("Voltar");
        goBackMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(goBackMenu);

        hintMenu.setText("Conteúdo");
        hintMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hintMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(hintMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(phraseTextLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                    .addComponent(answerTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                    .addComponent(answerTextField3)
                    .addComponent(answerTextField2)
                    .addComponent(answerTextField1)
                    .addComponent(phraseTextLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phraseTextLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phraseTextLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(phraseTextLabel1)
                .addGap(18, 18, 18)
                .addComponent(answerTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(phraseTextLabel2)
                .addGap(18, 18, 18)
                .addComponent(answerTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(phraseTextLabel3)
                .addGap(18, 18, 18)
                .addComponent(answerTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(phraseTextLabel4)
                .addGap(18, 18, 18)
                .addComponent(answerTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        setSize(new java.awt.Dimension(857, 614));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void goBackMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMenuMouseClicked
        dispose();
    }//GEN-LAST:event_goBackMenuMouseClicked

    private void checkButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkButtonMouseClicked
        new CongratsView().setVisible(true);
    }//GEN-LAST:event_checkButtonMouseClicked

    private void hintMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hintMenuMouseClicked
        new HardContentView().setVisible(true);
    }//GEN-LAST:event_hintMenuMouseClicked

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
            java.util.logging.Logger.getLogger(HardLessonView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HardLessonView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HardLessonView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HardLessonView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HardLessonView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerTextField1;
    private javax.swing.JTextField answerTextField2;
    private javax.swing.JTextField answerTextField3;
    private javax.swing.JTextField answerTextField4;
    private javax.swing.JButton checkButton;
    private javax.swing.JMenu goBackMenu;
    private javax.swing.JMenu hintMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel phraseTextLabel1;
    private javax.swing.JLabel phraseTextLabel2;
    private javax.swing.JLabel phraseTextLabel3;
    private javax.swing.JLabel phraseTextLabel4;
    // End of variables declaration//GEN-END:variables
}
