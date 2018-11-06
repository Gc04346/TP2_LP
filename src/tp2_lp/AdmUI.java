/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_lp;

/**
 *
 * @author daniel
 */
public class AdmUI extends PessoaUI{
    private static MyUI main;
    public static Administrador p;
    /**
     * Creates new form AdmUI
     */
    public AdmUI(MyUI main, Administrador p) {
        initComponents();
        this.main = main;
        this.p = p;
        txtNome.setText(p.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsername = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        btnValidarServicos = new javax.swing.JButton();
        btnNovoAdm = new javax.swing.JButton();
        btnCadastrarServico = new javax.swing.JButton();
        btnOrcamentos = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnAlterarDados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUsername.setText(" ");

        txtNome.setText("jLabel1");

        btnValidarServicos.setText("Validar servicos");
        btnValidarServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarServicosActionPerformed(evt);
            }
        });

        btnNovoAdm.setText("Novo administrador");
        btnNovoAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoAdmActionPerformed(evt);
            }
        });

        btnCadastrarServico.setText("Novo servico");
        btnCadastrarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarServicoActionPerformed(evt);
            }
        });

        btnOrcamentos.setText("Listar orcamentos");
        btnOrcamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrcamentosActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAlterarDados.setText("Alterar dados");
        btnAlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAlterarDados)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrarServico)
                            .addComponent(btnOrcamentos)
                            .addComponent(btnNovoAdm)
                            .addComponent(btnValidarServicos)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 96, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername)
                    .addComponent(txtNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnAlterarDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrcamentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrarServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNovoAdm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnValidarServicos)
                .addGap(26, 26, 26)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarDadosActionPerformed
        // TODO add your handling code here:
        AdministradorView alteraDados = new AdministradorView(main, p, this);
        this.hide();
        alteraDados.show();
    }//GEN-LAST:event_btnAlterarDadosActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        main.logado = 0;
        main.pessoaAtual = new Pessoa();
        this.hide();
        main.show();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnValidarServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarServicosActionPerformed
        // TODO add your handling code here:
        ValidarServicosView vldsView = new ValidarServicosView(main,p,this);
        this.hide();
        vldsView.show();
    }//GEN-LAST:event_btnValidarServicosActionPerformed

    private void btnCadastrarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarServicoActionPerformed
        // TODO add your handling code here:
        NovoServico novoServicoView = new NovoServico(main, this);
        this.hide();
        novoServicoView.show();
    }//GEN-LAST:event_btnCadastrarServicoActionPerformed

    private void btnNovoAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoAdmActionPerformed
        // TODO add your handling code here:
        CriarNovoAdministrador view = new CriarNovoAdministrador(main,this);
        this.hide();
        view.show();
    }//GEN-LAST:event_btnNovoAdmActionPerformed

    private void btnOrcamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrcamentosActionPerformed
        // TODO add your handling code here:
        TodosOsOrcamentosView listarOrcamentos = new TodosOsOrcamentosView(this,main);
        this.hide();
        listarOrcamentos.show();
    }//GEN-LAST:event_btnOrcamentosActionPerformed

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
            java.util.logging.Logger.getLogger(AdmUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmUI(main, p).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarDados;
    private javax.swing.JButton btnCadastrarServico;
    private javax.swing.JButton btnNovoAdm;
    private javax.swing.JButton btnOrcamentos;
    private javax.swing.JButton btnValidarServicos;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtUsername;
    // End of variables declaration//GEN-END:variables
}
