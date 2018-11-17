package tp2_lp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JFrame;

public class MyUI extends javax.swing.JFrame {
    public static ArrayList<Pessoa> pessoas = new ArrayList<>();
    public static ArrayList<SugestaoServico> sugestoesDeServicos = new ArrayList<>();
    public int logado = 0; //0 para nao logado, 1 para logado como adm, 2 para logado como profissional e 3 para logado como cliente
    public static Pessoa pessoaAtual;
    public static ArrayList<Servico> servicos = new ArrayList<>();
    public static ArrayList<Orcamento> orcamentos = new ArrayList<>();
    
    public MyUI() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnEnviar = new javax.swing.JButton();
        btnNovoUsuario = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Fazer login");

        jLabel2.setText("Email:");

        jLabel3.setText("Senha:");

        btnEnviar.setText("Logar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnNovoUsuario.setText("Ainda não tenho login");
        btnNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnNovoUsuario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEnviar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtPassword))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEnviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btnNovoUsuario)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        String email = txtEmail.getText();
        String senha = txtPassword.getText();
        for(Pessoa p : pessoas){
            if(p.getEmail().equals(email)){
                if(p.getPassword().equals(senha)){
                    logado = p.getTipo();
                    pessoaAtual = p;
                }
            }
        }
        if(logado != 0){
            switch(logado){
                case 1: AdmUI admView = new AdmUI(this, (Administrador) pessoaAtual);
                        this.hide();
                        admView.setLocationRelativeTo(null);
                        admView.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
                        admView.show();
                        break;
                case 2: ProfUI profView = new ProfUI(this, (Profissional) pessoaAtual);
                        this.hide();
                        profView.setLocationRelativeTo(null);
                        profView.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
                        profView.show();
                        break;
                case 3: CltUI cltView = new CltUI(this, (Cliente) pessoaAtual);
                        this.hide();
                        cltView.setLocationRelativeTo(null);
                        cltView.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
                        cltView.show();
                        break;
            }
        }else{
            //JOptionPane.showMessageDialog(null, "Usuário inexistente");
            NaoLogado tela = new NaoLogado(this);
            this.hide();
            tela.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            tela.show();
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioActionPerformed
        // TODO add your handling code here:
        CriarNovoUsuario tela2 = new CriarNovoUsuario(this);
        this.hide();
        tela2.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        tela2.show();        
    }//GEN-LAST:event_btnNovoUsuarioActionPerformed

    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(MyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        int id = 0;
        String username = null;
        String nome = null;
        String endereco = null;
        String email = null;
        String telefone = null;
        String password = null;
        int idProfissional = 0;
        int tipo = 0;
        double preco = 0.0;
        boolean validade = false;
        int idCliente = 0;
        int idServico = 0;
        boolean aceito = false;
        int status = 1;
        
        try{
            // Leitura do arquivo de pessoas.
            BufferedReader buffReadPessoas = new BufferedReader(new FileReader("arqs/pessoas.txt"));
            String linha = "";
            while (true) {
                if (linha != null) {
                    StringTokenizer tokens = new StringTokenizer(linha, ";");
                    if(tokens.hasMoreTokens()){
                        id = Integer.parseInt(tokens.nextToken());
                    }
                    if(tokens.hasMoreTokens()){
                        username = tokens.nextToken();
                    }
                    if(tokens.hasMoreTokens()){
                        nome = tokens.nextToken();
                    }
                    if(tokens.hasMoreTokens()){
                        endereco = tokens.nextToken();
                    }
                    if(tokens.hasMoreTokens()){
                        email = tokens.nextToken();
                    }
                    if(tokens.hasMoreTokens()){
                        telefone = tokens.nextToken();
                    }
                    if(tokens.hasMoreTokens()){
                        password = tokens.nextToken();
                    }
                    if(tokens.hasMoreTokens()){
                        tipo = Integer.parseInt(tokens.nextToken());
                    }
                    if(tipo==1){
                        pessoas.add(new Administrador(id, username, nome, endereco, email, telefone, password, tipo));
                    }else if(tipo==2){
                        pessoas.add(new Profissional(id, username, nome, endereco, email, telefone, password, tipo));
                    }else if(tipo==3){
                        pessoas.add(new Cliente(id, username, nome, endereco, email, telefone, password, tipo));
                    }
                } else
                    break;
                linha = buffReadPessoas.readLine();
            }
            buffReadPessoas.close();
            
            // Leitura do arquivo de Servicos
            BufferedReader buffReadServicos = new BufferedReader(new FileReader("arqs/servicos.txt"));
            linha = "";
            while (true) {
                if (linha != null) {
                    StringTokenizer tokens = new StringTokenizer(linha, ";");
                    if(tokens.hasMoreTokens()){
                        id = Integer.parseInt(tokens.nextToken());
                    }
                    if(tokens.hasMoreTokens()){
                        idProfissional = Integer.parseInt(tokens.nextToken());
                    }
                    if(tokens.hasMoreTokens()){
                        preco = Double.parseDouble(tokens.nextToken());
                    }
                    if(tokens.hasMoreTokens()){
                        nome = tokens.nextToken();
                        servicos.add(new Servico(id, idProfissional, preco, nome));
                    }
                } else
                    break;
                linha = buffReadServicos.readLine();
            }
            buffReadServicos.close();
            
            // Leitura das Sugestões de Serviços.
            BufferedReader buffReadSugestaoServicos = new BufferedReader(new FileReader("arqs/sugestaoservicos.txt"));
            linha = "";
            while (true) {
                if (linha != null) {
                    StringTokenizer tokens = new StringTokenizer(linha, ";");
                    if(tokens.hasMoreTokens()){
                        validade = Boolean.parseBoolean(tokens.nextToken());
                    }
                    if(tokens.hasMoreTokens()){
                        nome = tokens.nextToken();
                        sugestoesDeServicos.add(new SugestaoServico(nome, validade));
                    }
                } else
                    break;
                linha = buffReadSugestaoServicos.readLine();
            }
            buffReadSugestaoServicos.close();
            
            // Leitura dos orcamentos.
            BufferedReader buffReadOrcamentos = new BufferedReader(new FileReader("arqs/orcamentos.txt"));
            linha = "";
            while (true) {
                if (linha != null) {
                    StringTokenizer tokens = new StringTokenizer(linha, ";");
                    if(tokens.hasMoreTokens()){
                        id = Integer.parseInt(tokens.nextToken());
                    }
                    if(tokens.hasMoreTokens()){
                        idCliente = Integer.parseInt(tokens.nextToken());
                    }
                    if(tokens.hasMoreTokens()){
                        idServico = Integer.parseInt(tokens.nextToken());
                    }
                    if(tokens.hasMoreTokens()){
                        preco = Double.parseDouble(tokens.nextToken());
                    }
                    if(tokens.hasMoreTokens()){
                        aceito = Boolean.parseBoolean(tokens.nextToken());
                    }
                    if(tokens.hasMoreTokens()){
                        status = Integer.parseInt(tokens.nextToken());
                        orcamentos.add(new Orcamento(id, idCliente, idServico, preco, aceito, status));
                    }
                } else
                    break;
                linha = buffReadOrcamentos.readLine();
            }
            buffReadOrcamentos.close();
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame UI = new MyUI();
                UI.setLocationRelativeTo(null);
                UI.setVisible(true);
                UI.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                UI.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
                            try{ // Tentativa de escrita nos arquivos.
                                // Abrindo os arquivos.
                                BufferedWriter buffWritePessoas = new BufferedWriter(new FileWriter("arqs/pessoas.txt"));
                                BufferedWriter buffWriteServicos = new BufferedWriter(new FileWriter("arqs/servicos.txt"));
                                BufferedWriter buffWriteSugestaoServicos = new BufferedWriter(new FileWriter("arqs/sugestaoservicos.txt"));
                                BufferedWriter buffWriteOrcamentos = new BufferedWriter(new FileWriter("arqs/orcamentos.txt"));
                                String linha = "";
                                
                                // Escrevendo nos arquivos.
                                for(Pessoa p : pessoas){
                                    linha = p.getId()+ ";" +p.getUsername()+ ";" +p.getNome()+ ";" +p.getEndereco()+ ";" +p.getEmail()+ ";" +p.getTelefone()+ ";" +p.getPassword()+ ";" +p.getTipo()+"\n";
                                    buffWritePessoas.append(linha);
                                    linha="";
                                }
                                for(Servico s : servicos){
                                    linha = s.getIdServico()+ ";" +s.getProfissional()+ ";" +s.getPreco()+ ";" +s.getNome()+"\n";
                                    buffWriteServicos.append(linha);
                                    linha="";
                                }
                                for(SugestaoServico ss : sugestoesDeServicos){
                                    linha = ss.isValid()+ ";" +ss.getNome()+"\n";
                                    buffWriteSugestaoServicos.append(linha);
                                    System.out.println(linha);
                                    linha="";
                                }
                                for(Orcamento o : orcamentos){
                                    linha = o.getIdOrcamento()+ ";" +o.getCliente()+ ";" +o.getServico()+ ";" +o.getPreco()+ ";" +o.getAceito()+ ";" +o.getStatus()+"\n";
                                    buffWriteOrcamentos.append(linha);
                                    System.out.println(linha);
                                    linha="";
                                }
                                // Fechando os arquivos.
                                buffWritePessoas.close();
                                buffWriteServicos.close();
                                buffWriteSugestaoServicos.close();
                                buffWriteOrcamentos.close();
                                System.exit(0);
                            }catch(Exception x){
                                x.printStackTrace();
                                System.exit(0);
                            }
                            // 
			}
                });
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnNovoUsuario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
