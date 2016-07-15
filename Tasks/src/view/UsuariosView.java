package view;

import modeldao.*;
import model.*;
import control.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class UsuariosView extends javax.swing.JFrame {

    UsuariosModel usuariosmodel = new UsuariosModel();
    UsuariosDAO usuariosdao = new UsuariosDAO();
    ConexaoDB conexaodb = new ConexaoDB();

    int flag = 0;

    public UsuariosView() {
        initComponents();
        preencherTabelaUsuarios("select * from usuarios order by nome");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jLabelAdicionareEditarUsuarios = new javax.swing.JLabel();
        jLabelNomeCompleto = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldNomeCompleto = new javax.swing.JTextField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonAdicionarEditar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jLabelPesquisaRapida = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCodigoDoUsuario = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuariosView = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonNovoCadastro = new javax.swing.JButton();
        jButtonEditarCadastro = new javax.swing.JButton();
        jButtonExcluirCadastro = new javax.swing.JButton();
        jButtonAlterarSenha = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuários");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jLabelAdicionareEditarUsuarios.setText("Adicionar e Editar Usuários");

        jLabelNomeCompleto.setText("Nome Completo:");
        jLabelNomeCompleto.setEnabled(false);

        jLabelUsuario.setText("Usuário: ");
        jLabelUsuario.setEnabled(false);

        jLabelSenha.setText("Senha: ");
        jLabelSenha.setEnabled(false);

        jLabelEmail.setText("E-mail:");
        jLabelEmail.setEnabled(false);

        jTextFieldNomeCompleto.setEnabled(false);
        jTextFieldNomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCompletoActionPerformed(evt);
            }
        });

        jTextFieldUsuario.setEnabled(false);
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });

        jTextFieldEmail.setEnabled(false);
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jPasswordFieldSenha.setEnabled(false);
        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });

        jButtonAdicionarEditar.setText("Adicionar");
        jButtonAdicionarEditar.setEnabled(false);
        jButtonAdicionarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarEditarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Cancelar");
        jButtonLimpar.setEnabled(false);
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jLabelPesquisaRapida.setText("Pesquisa Rápida");

        jLabel2.setText("Codigo do Usuário: ");
        jLabel2.setEnabled(false);

        jTextFieldCodigoDoUsuario.setText("0");
        jTextFieldCodigoDoUsuario.setEnabled(false);
        jTextFieldCodigoDoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoDoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPesquisa)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUsuario))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldSenha))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelNomeCompleto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jButtonAdicionarEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonLimpar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAdicionareEditarUsuarios)
                .addGap(37, 37, 37))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigoDoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabelPesquisaRapida))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabelPesquisaRapida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPesquisar)
                .addGap(24, 24, 24)
                .addComponent(jLabelAdicionareEditarUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCodigoDoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeCompleto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonAdicionarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTableUsuariosView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableUsuariosView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuariosView);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Usuários");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonNovoCadastro.setText("Novo");
        jButtonNovoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoCadastroActionPerformed(evt);
            }
        });

        jButtonEditarCadastro.setText("Editar");
        jButtonEditarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarCadastroActionPerformed(evt);
            }
        });

        jButtonExcluirCadastro.setText("Excluir");
        jButtonExcluirCadastro.setEnabled(false);
        jButtonExcluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirCadastroActionPerformed(evt);
            }
        });

        jButtonAlterarSenha.setText("Alterar uma Senha");
        jButtonAlterarSenha.setEnabled(false);
        jButtonAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonNovoCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEditarCadastro)
                .addGap(18, 18, 18)
                .addComponent(jButtonExcluirCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAlterarSenha)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEditarCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jButtonNovoCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlterarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluirCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(845, 513));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        usuariosmodel.setPesquisa(jTextFieldPesquisa.getText());
        UsuariosModel model = usuariosdao.pesquisarUsuarios(usuariosmodel);

        jTextFieldEmail.setText(model.getEmail());
        jTextFieldNomeCompleto.setText(model.getNome());
        jTextFieldUsuario.setText(model.getUsuario());
        jPasswordFieldSenha.setText(model.getSenha());
        jTextFieldCodigoDoUsuario.setText(Integer.toString(model.getIdusuarios()));
        jButtonExcluirCadastro.setEnabled(true);

        preencherTabelaUsuarios("select * from usuarios where lower(nome) like '%" + usuariosmodel.getPesquisa().toLowerCase() + "%' order by nome");
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed

    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonNovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoCadastroActionPerformed
        flag = 1;

        jTextFieldUsuario.setText("");
        jTextFieldNomeCompleto.setText("");
        jTextFieldEmail.setText("");
        jPasswordFieldSenha.setText("");
        jTextFieldUsuario.setEnabled(true);
        jTextFieldNomeCompleto.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jLabelUsuario.setEnabled(true);
        jLabelSenha.setEnabled(true);
        jLabelEmail.setEnabled(true);
        jLabelNomeCompleto.setEnabled(true);
        jButtonLimpar.setEnabled(true);
        jButtonAdicionarEditar.setEnabled(true);
        jButtonAdicionarEditar.setText("Adicionar");
        jButtonNovoCadastro.setEnabled(!true);
        jButtonEditarCadastro.setEnabled(!true);
        jButtonExcluirCadastro.setEnabled(!true);

    }//GEN-LAST:event_jButtonNovoCadastroActionPerformed

    private void jButtonEditarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarCadastroActionPerformed
        String cond = jTextFieldCodigoDoUsuario.getText();

        if (!"0".equals(cond)) {
            flag = 2;
            jButtonAdicionarEditar.setText("Editar");
        } else {
            flag = 1;
            jButtonAdicionarEditar.setText("Adicionar");
        }

        jTextFieldUsuario.setEnabled(true);
        jTextFieldNomeCompleto.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jLabelUsuario.setEnabled(true);
        jLabelSenha.setEnabled(true);
        jLabelEmail.setEnabled(true);
        jLabelNomeCompleto.setEnabled(true);
        jButtonLimpar.setEnabled(true);
        jButtonAdicionarEditar.setEnabled(true);
        jButtonEditarCadastro.setEnabled(!true);
        jButtonNovoCadastro.setEnabled(true);
        jButtonExcluirCadastro.setEnabled(true);
    }//GEN-LAST:event_jButtonEditarCadastroActionPerformed

    private void jTextFieldNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCompletoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeCompletoActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed

    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed

    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButtonAdicionarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarEditarActionPerformed

        if (flag == 1) {
            usuariosmodel.setNome(jTextFieldNomeCompleto.getText());
            usuariosmodel.setEmail(jTextFieldEmail.getText());
            usuariosmodel.setSenha(jPasswordFieldSenha.getText());
            usuariosmodel.setUsuario(jTextFieldUsuario.getText());
            if (jTextFieldNomeCompleto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o nome completo.");
                jTextFieldNomeCompleto.requestFocus();
            } else if (jTextFieldUsuario.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o nome do usuario.");
                jTextFieldUsuario.requestFocus();
            } else if (jPasswordFieldSenha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha a senha.");
                jPasswordFieldSenha.requestFocus();
            } else {
                usuariosdao.salvar(usuariosmodel);
                jTextFieldUsuario.setEnabled(!true);
                jTextFieldNomeCompleto.setEnabled(!true);
                jTextFieldEmail.setEnabled(!true);
                jPasswordFieldSenha.setEnabled(!true);
                jLabelUsuario.setEnabled(!true);
                jLabelSenha.setEnabled(!true);
                jLabelEmail.setEnabled(!true);
                jLabelNomeCompleto.setEnabled(!true);
                jButtonLimpar.setEnabled(!true);
                jButtonAdicionarEditar.setEnabled(!true);
                jButtonAdicionarEditar.setText("Adicionar");
                jButtonNovoCadastro.setEnabled(true);
                jButtonEditarCadastro.setEnabled(true);
                jTextFieldUsuario.setText("");
                jTextFieldNomeCompleto.setText("");
                jTextFieldEmail.setText("");
                jTextFieldCodigoDoUsuario.setText("0");
                jPasswordFieldSenha.setText("");

            }
        } else {
            usuariosmodel.setIdusuarios(Integer.parseInt(jTextFieldCodigoDoUsuario.getText()));
            usuariosmodel.setNome(jTextFieldNomeCompleto.getText());
            usuariosmodel.setEmail(jTextFieldEmail.getText());
            usuariosmodel.setSenha(jPasswordFieldSenha.getText());
            usuariosmodel.setUsuario(jTextFieldUsuario.getText());
            if (jTextFieldNomeCompleto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o nome completo.");
                jTextFieldNomeCompleto.requestFocus();
            } else if (jTextFieldUsuario.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o nome do usuario.");
                jTextFieldUsuario.requestFocus();
            } else if (jPasswordFieldSenha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha a senha.");
                jPasswordFieldSenha.requestFocus();
            } else {
                usuariosdao.editarUsuario(usuariosmodel);
                jTextFieldUsuario.setEnabled(!true);
                jTextFieldNomeCompleto.setEnabled(!true);
                jTextFieldEmail.setEnabled(!true);
                jPasswordFieldSenha.setEnabled(!true);
                jLabelUsuario.setEnabled(!true);
                jLabelSenha.setEnabled(!true);
                jLabelEmail.setEnabled(!true);
                jLabelNomeCompleto.setEnabled(!true);
                jButtonLimpar.setEnabled(!true);
                jButtonAdicionarEditar.setEnabled(!true);
                jButtonAdicionarEditar.setText("Adicionar");
                jButtonNovoCadastro.setEnabled(true);
                jButtonEditarCadastro.setEnabled(true);
                jTextFieldUsuario.setText("");
                jTextFieldNomeCompleto.setText("");
                jTextFieldEmail.setText("");
                jTextFieldCodigoDoUsuario.setText("0");
                jPasswordFieldSenha.setText("");
            }
        }
        preencherTabelaUsuarios("select * from usuarios order by nome");
    }//GEN-LAST:event_jButtonAdicionarEditarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldUsuario.setEnabled(!true);
        jTextFieldNomeCompleto.setEnabled(!true);
        jTextFieldEmail.setEnabled(!true);
        jPasswordFieldSenha.setEnabled(!true);
        jLabelUsuario.setEnabled(!true);
        jLabelSenha.setEnabled(!true);
        jLabelEmail.setEnabled(!true);
        jLabelNomeCompleto.setEnabled(!true);
        jButtonLimpar.setEnabled(!true);
        jButtonAdicionarEditar.setEnabled(!true);
        jButtonAdicionarEditar.setText("Adicionar");
        jButtonNovoCadastro.setEnabled(true);
        jButtonEditarCadastro.setEnabled(true);
        jTextFieldUsuario.setText("");
        jTextFieldNomeCompleto.setText("");
        jTextFieldEmail.setText("");
        jTextFieldCodigoDoUsuario.setText("0");
        jPasswordFieldSenha.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTextFieldCodigoDoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoDoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoDoUsuarioActionPerformed

    private void jButtonExcluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirCadastroActionPerformed
        String cond = jTextFieldCodigoDoUsuario.getText();

        if (!"0".equals(cond)) {
            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente exluir?");
            if (resposta == JOptionPane.YES_OPTION) {
                usuariosmodel.setIdusuarios(Integer.parseInt(jTextFieldCodigoDoUsuario.getText()));
                usuariosdao.excluirUsuario(usuariosmodel);

                jTextFieldUsuario.setEnabled(!true);
                jTextFieldNomeCompleto.setEnabled(!true);
                jTextFieldEmail.setEnabled(!true);
                jPasswordFieldSenha.setEnabled(!true);
                jLabelUsuario.setEnabled(!true);
                jLabelSenha.setEnabled(!true);
                jLabelEmail.setEnabled(!true);
                jLabelNomeCompleto.setEnabled(!true);
                jButtonLimpar.setEnabled(!true);
                jButtonAdicionarEditar.setEnabled(!true);
                jButtonAdicionarEditar.setText("Adicionar");
                jButtonNovoCadastro.setEnabled(true);
                jButtonEditarCadastro.setEnabled(true);
                jButtonExcluirCadastro.setEnabled(!true);
                jTextFieldUsuario.setText("");
                jTextFieldNomeCompleto.setText("");
                jTextFieldEmail.setText("");
                jTextFieldCodigoDoUsuario.setText("0");
                jPasswordFieldSenha.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuário para exclusão não selecionado");
        }
        preencherTabelaUsuarios("select * from usuarios order by nome");

    }//GEN-LAST:event_jButtonExcluirCadastroActionPerformed

    private void jTableUsuariosViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosViewMouseClicked
        String id = "" + jTableUsuariosView.getValueAt(jTableUsuariosView.getSelectedRow(), 0);
        conexaodb.conexao();
        conexaodb.executasql("select * from usuarios where id_usuarios='" + id + "'");

        try {
            conexaodb.rs.first();
            jTextFieldCodigoDoUsuario.setText(String.valueOf(conexaodb.rs.getInt("id_usuarios")).trim());
            jTextFieldUsuario.setText(conexaodb.rs.getString("usuario").trim());
            jTextFieldNomeCompleto.setText(conexaodb.rs.getString("nome").trim());
            jTextFieldEmail.setText(conexaodb.rs.getString("email").trim());
            jPasswordFieldSenha.setText(conexaodb.rs.getString("senha").trim());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Campo não pode ser selecionado.: \n" + ex);
        }

        conexaodb.desconexao();
        jButtonAdicionarEditar.setText("Editar");
        jButtonExcluirCadastro.setEnabled(true);
        jButtonAlterarSenha.setEnabled(true);
    }//GEN-LAST:event_jTableUsuariosViewMouseClicked

    private void jButtonAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarSenhaActionPerformed
        String idTabelaUser = "" + jTableUsuariosView.getValueAt(jTableUsuariosView.getSelectedRow(), 0);
        AlterarSenhaView alterarsenha = new AlterarSenhaView(Integer.parseInt(idTabelaUser));

        if (alterarsenha == null) {
            alterarsenha = new AlterarSenhaView();
            alterarsenha.setVisible(true);
            alterarsenha.setResizable(false);
        } else {
            alterarsenha.setVisible(true);
            alterarsenha.setResizable(false);
        }
    }//GEN-LAST:event_jButtonAlterarSenhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void preencherTabelaUsuarios(String Sql) {

        ArrayList dados = new ArrayList();
        String[] coluna = new String[]{
            "ID", "Usuario", "Nome", "Email"};

        conexaodb.conexao();
        conexaodb.executasql(Sql);

        try {
            conexaodb.rs.first();
            do {
                dados.add(new Object[]{conexaodb.rs.getInt("id_usuarios"), conexaodb.rs.getString("nome").trim(), conexaodb.rs.getString("usuario").trim(), conexaodb.rs.getString("email").trim()});
            } while (conexaodb.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário(os) inexistente(s).");
        }
        TabelaModel tabelaUsuarios = new TabelaModel(dados, coluna);

        jTableUsuariosView.setModel(tabelaUsuarios);
        jTableUsuariosView.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTableUsuariosView.getColumnModel().getColumn(0).setResizable(false);
        jTableUsuariosView.getColumnModel().getColumn(1).setPreferredWidth(180);
        jTableUsuariosView.getColumnModel().getColumn(1).setResizable(false);
        jTableUsuariosView.getColumnModel().getColumn(2).setPreferredWidth(180);
        jTableUsuariosView.getColumnModel().getColumn(2).setResizable(false);
        jTableUsuariosView.getColumnModel().getColumn(3).setPreferredWidth(180);
        jTableUsuariosView.getColumnModel().getColumn(3).setResizable(false);
        jTableUsuariosView.getTableHeader().setReorderingAllowed(false);
        jTableUsuariosView.setAutoResizeMode(jTableUsuariosView.AUTO_RESIZE_OFF);
        jTableUsuariosView.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        conexaodb.desconexao();

    }

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
            java.util.logging.Logger.getLogger(UsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuariosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdicionarEditar;
    private javax.swing.JButton jButtonAlterarSenha;
    private javax.swing.JButton jButtonEditarCadastro;
    private javax.swing.JButton jButtonExcluirCadastro;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonNovoCadastro;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAdicionareEditarUsuarios;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNomeCompleto;
    private javax.swing.JLabel jLabelPesquisaRapida;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuariosView;
    private javax.swing.JTextField jTextFieldCodigoDoUsuario;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNomeCompleto;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
