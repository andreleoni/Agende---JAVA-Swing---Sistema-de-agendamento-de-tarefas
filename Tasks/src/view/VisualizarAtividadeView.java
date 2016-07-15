package view;

import control.ConexaoDB;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import model.TabelaModel;
import modeldao.RelatoriosDAO;
import modeldao.TarefasDAO;

public class VisualizarAtividadeView extends javax.swing.JFrame {

    int idTarefas;
    ConexaoDB conexaodb = new ConexaoDB();
    RelatoriosDAO relatoriosdao = new RelatoriosDAO();
    TarefasDAO tarefasdao = new TarefasDAO();


    public VisualizarAtividadeView(String idTarefas) {
        initComponents();
        imprimirAtividade(Integer.parseInt(idTarefas));
        preencherTabelaPausasRetomadas(Integer.parseInt(idTarefas));

    }

    VisualizarAtividadeView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void imprimirAtividade(int idtarefas) {

        conexaodb.conexao();
        conexaodb.executasql("select * from tarefas where id_tarefas=" + idtarefas);

        try {
            conexaodb.rs.first();

            jTextFieldIdTarefaVisualizar.setText(conexaodb.rs.getString("id_tarefas"));
            jTextFieldStatusTarefaVisualizar.setText(relatoriosdao.statusConcluidoCaracter(conexaodb.rs.getInt("concluido")));

            String qttempoconclusao = "";
            if (conexaodb.rs.getString("qttempoconclusao") == null) {
                qttempoconclusao = "NA";
                jLabelPorcentagemVisualizar.setText("não");
                jLabelPanel1.setText("Tarefa");
                jLabelPanel2.setText("finalizada.");

            } else {
                qttempoconclusao = relatoriosdao.comboboxTempoDBparaUser(conexaodb.rs.getString("qttempoconclusao").trim());
                double porcentagem = relatoriosdao.porcentagem(conexaodb.rs.getInt("qttempoconclusao"), conexaodb.rs.getInt("qttempoprevistoconclusao"));
                jLabelPorcentagemVisualizar.setText("" + porcentagem + "%");
            }

            String dataEncerramento = "";
            if (conexaodb.rs.getString("dataencerramento") == null) {
                dataEncerramento = "NA";
            } else {
                dataEncerramento = relatoriosdao.formatarData(conexaodb.rs.getString("dataencerramento"));
            }

            jTextFieldTarefaVisualizar.setText(conexaodb.rs.getString("tarefa").trim());
            jTextFieldDescricaoVisualizar.setText(conexaodb.rs.getString("descricao").trim());
            jTextFieldTempoPrevistoVisualizar.setText(relatoriosdao.comboboxTempoDBparaUser(conexaodb.rs.getString("qttempoprevistoconclusao").trim()));
            jTextFieldRealizado.setText(qttempoconclusao);
            jTextFieldDataTarefaRealizar.setText(relatoriosdao.formatarData(conexaodb.rs.getString("dataprevistaencerramento")));
            jTextFieldDataFinalizacaoTarefaVisualizar.setText(dataEncerramento);
            jTextFieldTDataCriacaoTarefaVisualizar.setText(relatoriosdao.formatarData(conexaodb.rs.getString("datacriacao")));
            jTextFieldCriadorTarefaVisualizar.setText(conexaodb.rs.getString("nomeusuariocriador").trim());
            jTextFieldResponsavelVisualizar.setText(tarefasdao.buscaResponsavelTarefaPeloID(conexaodb.rs.getInt("id_usuario_responsavel")));

            if ((conexaodb.rs.getString("qttempoconclusao") == "")) {
                //double porcentagem = relatoriosdao.porcentagem(conexaodb.rs.getInt("qttempoconclusao"), conexaodb.rs.getInt("qttempoprevistoconclusao"));
                //jLabelPorcentagemTarefaVisualizar.setText("A porcentagem de desvio da relação tempo Previsto / Tempo Realizado foi de " + porcentagem + "%.");
            } else {
                //jLabelPorcentagemTarefaVisualizar.setText("Porcentagem ainda não pode ser calculada pois a tarefa não foi finalizada.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(VisualizarAtividadeView.class.getName()).log(Level.SEVERE, null, ex);
        }

        conexaodb.desconexao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelTarefa = new javax.swing.JLabel();
        jTextFieldTarefaVisualizar = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jLabelDataEncerramento = new javax.swing.JLabel();
        jLabelTempoAtividade = new javax.swing.JLabel();
        jLabelResponsavel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextFieldDescricaoVisualizar = new javax.swing.JTextArea();
        jTextFieldIdTarefaVisualizar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCriadorTarefaVisualizar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldStatusTarefaVisualizar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDataFinalizacaoTarefaVisualizar = new javax.swing.JTextField();
        jTextFieldDataTarefaRealizar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldTDataCriacaoTarefaVisualizar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePausasRetomadasVisualizador = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelPanel1 = new javax.swing.JLabel();
        jLabelPorcentagemVisualizar = new javax.swing.JLabel();
        jLabelPanel2 = new javax.swing.JLabel();
        jTextFieldTempoPrevistoVisualizar = new javax.swing.JTextField();
        jTextFieldRealizado = new javax.swing.JTextField();
        jTextFieldResponsavelVisualizar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Visualizador de Tarefas");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTarefa.setText("Tarefa:");
        jLabelTarefa.setEnabled(false);

        jTextFieldTarefaVisualizar.setEnabled(false);

        jLabelDescricao.setText("Descrição");
        jLabelDescricao.setEnabled(false);

        jLabelDataEncerramento.setText("Data da Tarefa:");
        jLabelDataEncerramento.setEnabled(false);

        jLabelTempoAtividade.setText("Tempo de Atividade Previsto: ");
        jLabelTempoAtividade.setEnabled(false);

        jLabelResponsavel.setText("Responsável:");
        jLabelResponsavel.setEnabled(false);

        jTextFieldDescricaoVisualizar.setColumns(20);
        jTextFieldDescricaoVisualizar.setLineWrap(true);
        jTextFieldDescricaoVisualizar.setRows(5);
        jTextFieldDescricaoVisualizar.setEnabled(false);
        jScrollPane2.setViewportView(jTextFieldDescricaoVisualizar);

        jTextFieldIdTarefaVisualizar.setEnabled(false);
        jTextFieldIdTarefaVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdTarefaVisualizarActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");
        jLabel2.setEnabled(false);

        jTextFieldCriadorTarefaVisualizar.setEnabled(false);

        jLabel3.setText("Criador:");
        jLabel3.setEnabled(false);

        jLabel4.setText("Status:");
        jLabel4.setEnabled(false);

        jTextFieldStatusTarefaVisualizar.setEnabled(false);

        jLabel5.setText("Data de Finalização:");
        jLabel5.setEnabled(false);

        jTextFieldDataFinalizacaoTarefaVisualizar.setEnabled(false);

        jTextFieldDataTarefaRealizar.setEnabled(false);

        jLabel6.setText("Tempo de Atividade Realizado:");
        jLabel6.setEnabled(false);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Data de Criação");
        jLabel7.setEnabled(false);

        jTextFieldTDataCriacaoTarefaVisualizar.setEnabled(false);

        jTablePausasRetomadasVisualizador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePausasRetomadasVisualizador.setEnabled(false);
        jScrollPane1.setViewportView(jTablePausasRetomadasVisualizador);

        jLabel8.setText("Status:");
        jLabel8.setEnabled(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelPanel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPanel1.setText("Atividade realizada cumprindo ");
        jPanel1.add(jLabelPanel1);

        jLabelPorcentagemVisualizar.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabelPorcentagemVisualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPorcentagemVisualizar.setText("jLabel10");
        jPanel1.add(jLabelPorcentagemVisualizar);

        jLabelPanel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPanel2.setText("do tempo proposto.");
        jPanel1.add(jLabelPanel2);

        jTextFieldTempoPrevistoVisualizar.setEnabled(false);

        jTextFieldRealizado.setEnabled(false);
        jTextFieldRealizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRealizadoActionPerformed(evt);
            }
        });

        jTextFieldResponsavelVisualizar.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelTarefa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTarefaVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldIdTarefaVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldStatusTarefaVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldTDataCriacaoTarefaVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldCriadorTarefaVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabelTempoAtividade)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldTempoPrevistoVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldRealizado)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabelDataEncerramento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldDataTarefaRealizar))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldDataFinalizacaoTarefaVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabelResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldResponsavelVisualizar))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabelDescricao)
                                .addGap(150, 150, 150))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIdTarefaVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldStatusTarefaVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTarefa)
                            .addComponent(jTextFieldTarefaVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTempoAtividade)
                            .addComponent(jTextFieldTempoPrevistoVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelResponsavel)
                            .addComponent(jTextFieldResponsavelVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDataTarefaRealizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDataEncerramento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldDataFinalizacaoTarefaVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldCriadorTarefaVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldTDataCriacaoTarefaVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldIdTarefaVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdTarefaVisualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdTarefaVisualizarActionPerformed

    private void jTextFieldRealizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRealizadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRealizadoActionPerformed


    private void preencherTabelaPausasRetomadas(int idtarefas) {

        ArrayList dados = new ArrayList();
        String[] coluna = new String[]{
            //"ID","Tarefa","Descrição","Data de Criação","Data Prevista de Encerramento","Tempo Estimado de Conclusão","Responsável","Criador","Concluída","Data de Conclusão"};
            "ID", "Data da Pausa", "Hora da Pausa", "Status da Pausa"};
        conexaodb.conexao();
        conexaodb.executasql("select * from pausas_tarefas where id_tarefa_pausa=" + idtarefas + " order by id_pausa");

        try {
            conexaodb.rs.first();
            do {
                //status
                String dataDaPausa = relatoriosdao.formatarData(conexaodb.rs.getString("data_pausa").trim());
                String horaDaPausa = relatoriosdao.formatarHora(conexaodb.rs.getString("hora_pausa").trim());

                String statusPausa;
                if (conexaodb.rs.getInt("status_pausa") == 1) {
                    statusPausa = "Em Andamento";
                } else {
                    statusPausa = "Pausada";
                }

                dados.add(new Object[]{conexaodb.rs.getInt("id_pausa"), dataDaPausa, horaDaPausa, statusPausa});
            } while (conexaodb.rs.next());
        } catch (SQLException ex) {
            System.out.println("Pausa(s) inexistente(s).");
        }

        TabelaModel tableTodasTarefas = new TabelaModel(dados, coluna);
        jTablePausasRetomadasVisualizador.setModel(tableTodasTarefas);
        jTablePausasRetomadasVisualizador.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTablePausasRetomadasVisualizador.getColumnModel().getColumn(0).setResizable(false);
        jTablePausasRetomadasVisualizador.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTablePausasRetomadasVisualizador.getColumnModel().getColumn(1).setResizable(false);
        jTablePausasRetomadasVisualizador.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTablePausasRetomadasVisualizador.getColumnModel().getColumn(2).setResizable(true);
        jTablePausasRetomadasVisualizador.getColumnModel().getColumn(3).setPreferredWidth(110);
        jTablePausasRetomadasVisualizador.getColumnModel().getColumn(3).setResizable(false);
        jTablePausasRetomadasVisualizador.getTableHeader().setReorderingAllowed(true);
        jTablePausasRetomadasVisualizador.setAutoResizeMode(jTablePausasRetomadasVisualizador.AUTO_RESIZE_OFF);
        jTablePausasRetomadasVisualizador.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        conexaodb.desconexao();
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(VisualizarAtividadeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarAtividadeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarAtividadeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarAtividadeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarAtividadeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelDataEncerramento;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelPanel1;
    private javax.swing.JLabel jLabelPanel2;
    private javax.swing.JLabel jLabelPorcentagemVisualizar;
    private javax.swing.JLabel jLabelResponsavel;
    private javax.swing.JLabel jLabelTarefa;
    private javax.swing.JLabel jLabelTempoAtividade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePausasRetomadasVisualizador;
    private javax.swing.JTextField jTextFieldCriadorTarefaVisualizar;
    private javax.swing.JTextField jTextFieldDataFinalizacaoTarefaVisualizar;
    private javax.swing.JTextField jTextFieldDataTarefaRealizar;
    private javax.swing.JTextArea jTextFieldDescricaoVisualizar;
    private javax.swing.JTextField jTextFieldIdTarefaVisualizar;
    private javax.swing.JTextField jTextFieldRealizado;
    private javax.swing.JTextField jTextFieldResponsavelVisualizar;
    private javax.swing.JTextField jTextFieldStatusTarefaVisualizar;
    private javax.swing.JTextField jTextFieldTDataCriacaoTarefaVisualizar;
    private javax.swing.JTextField jTextFieldTarefaVisualizar;
    private javax.swing.JTextField jTextFieldTempoPrevistoVisualizar;
    // End of variables declaration//GEN-END:variables
}
