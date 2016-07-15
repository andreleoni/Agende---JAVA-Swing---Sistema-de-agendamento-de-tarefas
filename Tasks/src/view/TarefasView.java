package view;

import modeldao.*;
import model.*;
import control.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class TarefasView extends javax.swing.JFrame {

    TarefasModel tarefasmodel = new TarefasModel();
    TarefasDAO tarefasdao = new TarefasDAO();
    ConexaoDB conexaodb = new ConexaoDB();
    SessaoControl sessaocontrol = new SessaoControl();
    RelatoriosDAO relatoriosdao = new RelatoriosDAO();
    RelatoriosModel relatoriosmodel = new RelatoriosModel();
    PausasTarefasModel pausastarefasmodel = new PausasTarefasModel();

    int flag;

    public TarefasView() {
        initComponents();
        preecherUsuariosComboBox();
        preencherTabelaTarefas("select * from tarefas order by dataprevistaencerramento desc");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupStatusNovaTarefa = new javax.swing.ButtonGroup();
        buttonGroupStatusPesquisar = new javax.swing.ButtonGroup();
        buttonGroupOrdemPesquisa = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButtonNovaTarefa = new javax.swing.JButton();
        jButtonEditarTarefa = new javax.swing.JButton();
        jButtonExcluirTarefa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelTarefa = new javax.swing.JLabel();
        jTextFieldTarefa = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jLabelDataEncerramento = new javax.swing.JLabel();
        jLabelTempoAtividade = new javax.swing.JLabel();
        jComboBoxTempoAtividade = new javax.swing.JComboBox<>();
        jComboBoxResponsavel = new javax.swing.JComboBox<>();
        jLabelResponsavel = new javax.swing.JLabel();
        jCheckBoxResponsavel = new javax.swing.JCheckBox();
        jButtonCriarTarefa = new javax.swing.JButton();
        jButtonLimparTarefa = new javax.swing.JButton();
        jDateChooserDataEncerramento = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextFieldDescricao = new javax.swing.JTextArea();
        jTextFieldIdTarefaEditar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTarefas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldCampoPesquisar = new javax.swing.JTextField();
        jLabelPesquisar = new javax.swing.JLabel();
        jCheckBoxNomeTarefaPesquisar = new javax.swing.JCheckBox();
        jCheckBoxDescricaoTarefaPesquisar = new javax.swing.JCheckBox();
        jLabelDataInicialPesquisar = new javax.swing.JLabel();
        jLabelDataFinalPesquisar = new javax.swing.JLabel();
        jLabelResponsavelPesquisar = new javax.swing.JLabel();
        jComboBoxResposavelPesquisar = new javax.swing.JComboBox<>();
        jRadioButtonEmAndamentoPesquisar = new javax.swing.JRadioButton();
        jRadioButtonConcluidasPesquisar = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        jDateChooserDataInicialPesquisar = new com.toedter.calendar.JDateChooser();
        jDateChooserDataFinalPesquisar = new com.toedter.calendar.JDateChooser();
        jRadioButtonTodasPesquisar = new javax.swing.JRadioButton();
        jCheckBoxResponsavelTodos = new javax.swing.JCheckBox();
        jRadioButtonAbertasPesquisar = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jRadioButtonOrdemCrescentePesquisa = new javax.swing.JRadioButton();
        jRadioButtonOrdemDecrescentePesquisa = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButtonEmPausaRelatorios = new javax.swing.JRadioButton();
        jButtonPausarConcluirAtividades = new javax.swing.JButton();
        jButtonPausarMinhasAtividades = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Tarefas");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonNovaTarefa.setText("Nova Tarefa");
        jButtonNovaTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovaTarefaActionPerformed(evt);
            }
        });

        jButtonEditarTarefa.setText("Editar Tarefa");
        jButtonEditarTarefa.setEnabled(false);
        jButtonEditarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarTarefaActionPerformed(evt);
            }
        });

        jButtonExcluirTarefa.setText("Excluir Tarefa");
        jButtonExcluirTarefa.setEnabled(false);
        jButtonExcluirTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirTarefaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(446, 446, 446)
                .addComponent(jButtonNovaTarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEditarTarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExcluirTarefa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEditarTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jButtonNovaTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluirTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Tarefas");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTarefa.setText("Tarefa");
        jLabelTarefa.setEnabled(false);

        jTextFieldTarefa.setEnabled(false);

        jLabelDescricao.setText("Descrição");
        jLabelDescricao.setEnabled(false);

        jLabelDataEncerramento.setText("Data de encerramento: ");
        jLabelDataEncerramento.setEnabled(false);

        jLabelTempoAtividade.setText("Tempo de Atividade: ");
        jLabelTempoAtividade.setEnabled(false);

        jComboBoxTempoAtividade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00:15", "00:30", "00:45", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "07:00", "08:00", "O Dia Todo" }));
        jComboBoxTempoAtividade.setEnabled(false);

        jComboBoxResponsavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxResponsavel.setEnabled(false);
        jComboBoxResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxResponsavelActionPerformed(evt);
            }
        });

        jLabelResponsavel.setText("Responsável:");
        jLabelResponsavel.setEnabled(false);

        jCheckBoxResponsavel.setText("Eu mesmo.");
        jCheckBoxResponsavel.setEnabled(false);
        jCheckBoxResponsavel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBoxResponsavelMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxResponsavelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCheckBoxResponsavelMouseExited(evt);
            }
        });
        jCheckBoxResponsavel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxResponsavelItemStateChanged(evt);
            }
        });
        jCheckBoxResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxResponsavelActionPerformed(evt);
            }
        });

        jButtonCriarTarefa.setText("Salvar");
        jButtonCriarTarefa.setEnabled(false);
        jButtonCriarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarTarefaActionPerformed(evt);
            }
        });

        jButtonLimparTarefa.setText("Limpar");
        jButtonLimparTarefa.setEnabled(false);
        jButtonLimparTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparTarefaActionPerformed(evt);
            }
        });

        jDateChooserDataEncerramento.setDateFormatString("dd/MM/yyyy");
        jDateChooserDataEncerramento.setEnabled(false);
        jDateChooserDataEncerramento.setMaxSelectableDate(new java.util.Date(2524618898000L));
        jDateChooserDataEncerramento.setMinSelectableDate(new java.util.Date(1451617298000L));

        jTextFieldDescricao.setColumns(20);
        jTextFieldDescricao.setLineWrap(true);
        jTextFieldDescricao.setRows(5);
        jTextFieldDescricao.setEnabled(false);
        jScrollPane2.setViewportView(jTextFieldDescricao);

        jTextFieldIdTarefaEditar.setEnabled(false);
        jTextFieldIdTarefaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdTarefaEditarActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");
        jLabel2.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTarefa)
                    .addComponent(jLabelDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldTarefa)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxResponsavel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelTempoAtividade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxTempoAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelDataEncerramento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooserDataEncerramento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIdTarefaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonLimparTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jButtonCriarTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelTarefa)
                                .addComponent(jTextFieldTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelDataEncerramento))
                            .addComponent(jDateChooserDataEncerramento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDescricao)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 3, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelTempoAtividade)
                                    .addComponent(jComboBoxTempoAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelResponsavel)
                                    .addComponent(jCheckBoxResponsavel))
                                .addGap(25, 25, 25))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCriarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldIdTarefaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimparTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTableTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableTarefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTarefasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableTarefasMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTarefas);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelPesquisar.setText("Pesquisar:");

        jCheckBoxNomeTarefaPesquisar.setText("Noma da Tarefa");

        jCheckBoxDescricaoTarefaPesquisar.setText("Descrição da Tarefa");

        jLabelDataInicialPesquisar.setText("Data Inicial:");

        jLabelDataFinalPesquisar.setText("Data Final:");

        jLabelResponsavelPesquisar.setText("Responsável");

        jComboBoxResposavelPesquisar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxResposavelPesquisar.setEnabled(false);
        jComboBoxResposavelPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxResposavelPesquisarActionPerformed(evt);
            }
        });

        buttonGroupStatusPesquisar.add(jRadioButtonEmAndamentoPesquisar);
        jRadioButtonEmAndamentoPesquisar.setText("Em Andamento");

        buttonGroupStatusPesquisar.add(jRadioButtonConcluidasPesquisar);
        jRadioButtonConcluidasPesquisar.setText("Concluidas");

        jButton7.setText("Pesquisar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jDateChooserDataInicialPesquisar.setDateFormatString("dd/MM/yyyy");

        jDateChooserDataFinalPesquisar.setDateFormatString("dd/MM/yyyy");

        buttonGroupStatusPesquisar.add(jRadioButtonTodasPesquisar);
        jRadioButtonTodasPesquisar.setSelected(true);
        jRadioButtonTodasPesquisar.setText("Todas");

        jCheckBoxResponsavelTodos.setSelected(true);
        jCheckBoxResponsavelTodos.setText("Todos");
        jCheckBoxResponsavelTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBoxResponsavelTodosMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxResponsavelTodosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCheckBoxResponsavelTodosMouseExited(evt);
            }
        });
        jCheckBoxResponsavelTodos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxResponsavelTodosItemStateChanged(evt);
            }
        });
        jCheckBoxResponsavelTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxResponsavelTodosActionPerformed(evt);
            }
        });

        buttonGroupStatusPesquisar.add(jRadioButtonAbertasPesquisar);
        jRadioButtonAbertasPesquisar.setText("Abertas");

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Visualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroupOrdemPesquisa.add(jRadioButtonOrdemCrescentePesquisa);
        jRadioButtonOrdemCrescentePesquisa.setText("Crescente");

        buttonGroupOrdemPesquisa.add(jRadioButtonOrdemDecrescentePesquisa);
        jRadioButtonOrdemDecrescentePesquisa.setSelected(true);
        jRadioButtonOrdemDecrescentePesquisa.setText("Decrescente");

        jLabel5.setText("Ordem de Pesquisa:");

        buttonGroupStatusPesquisar.add(jRadioButtonEmPausaRelatorios);
        jRadioButtonEmPausaRelatorios.setText("Em Pausa");

        jButtonPausarConcluirAtividades.setText("Atividade");
        jButtonPausarConcluirAtividades.setEnabled(false);
        jButtonPausarConcluirAtividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPausarConcluirAtividadesActionPerformed(evt);
            }
        });

        jButtonPausarMinhasAtividades.setText("Pausar Tarefa");
        jButtonPausarMinhasAtividades.setEnabled(false);
        jButtonPausarMinhasAtividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPausarMinhasAtividadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jCheckBoxNomeTarefaPesquisar)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxDescricaoTarefaPesquisar))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCampoPesquisar)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDataFinalPesquisar)
                            .addComponent(jLabelDataInicialPesquisar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooserDataInicialPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jDateChooserDataFinalPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelResponsavelPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxResposavelPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxResponsavelTodos))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonConcluidasPesquisar)
                            .addComponent(jRadioButtonTodasPesquisar))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonEmPausaRelatorios)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButtonEmAndamentoPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonAbertasPesquisar)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonOrdemDecrescentePesquisa)
                    .addComponent(jRadioButtonOrdemCrescentePesquisa)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonPausarConcluirAtividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonPausarMinhasAtividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonOrdemCrescentePesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonOrdemDecrescentePesquisa))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldCampoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelPesquisar)
                                        .addComponent(jLabelDataInicialPesquisar)
                                        .addComponent(jLabelResponsavelPesquisar)
                                        .addComponent(jComboBoxResposavelPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBoxResponsavelTodos))
                                    .addComponent(jDateChooserDataInicialPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCheckBoxNomeTarefaPesquisar)
                                        .addComponent(jCheckBoxDescricaoTarefaPesquisar)
                                        .addComponent(jLabelDataFinalPesquisar)
                                        .addComponent(jRadioButtonEmAndamentoPesquisar)
                                        .addComponent(jRadioButtonConcluidasPesquisar)
                                        .addComponent(jRadioButtonAbertasPesquisar))
                                    .addComponent(jDateChooserDataFinalPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonPausarConcluirAtividades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonPausarMinhasAtividades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton7)
                                .addComponent(jRadioButtonTodasPesquisar)
                                .addComponent(jRadioButtonEmPausaRelatorios))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2))))))
        );

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Pesquisar Tarefas");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Nova / Editar Tarefas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(438, 438, 438)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(547, 547, 547)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(528, 528, 528)
                        .addComponent(jLabel3)
                        .addGap(602, 602, 602))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovaTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovaTarefaActionPerformed
        flag = 1;

        jButtonNovaTarefa.setEnabled(!true);
        jButtonCriarTarefa.setEnabled(true);
        jButtonLimparTarefa.setEnabled(true);
        jComboBoxResponsavel.setEnabled(true);
        jCheckBoxResponsavel.setEnabled(true);
        jLabelTarefa.setEnabled(true);
        jTextFieldTarefa.setEnabled(true);
        jLabelDescricao.setEnabled(true);
        jTextFieldDescricao.setEnabled(true);
        jLabelDataEncerramento.setEnabled(true);
        jDateChooserDataEncerramento.setEnabled(true);
        jLabelTempoAtividade.setEnabled(true);
        jComboBoxTempoAtividade.setEnabled(true);
        jLabelResponsavel.setEnabled(true);
        jComboBoxResponsavel.setEnabled(true);
        jCheckBoxResponsavel.setEnabled(true);
        jCheckBoxResponsavel.setEnabled(true);
        jTextFieldTarefa.setText("");
        jTextFieldDescricao.setText("");
        jDateChooserDataEncerramento.setDate(null);
        jButtonEditarTarefa.setEnabled(!true);
    }//GEN-LAST:event_jButtonNovaTarefaActionPerformed

    private void jButtonEditarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarTarefaActionPerformed
        flag = 2;

        jButtonNovaTarefa.setEnabled(!true);
        jButtonCriarTarefa.setEnabled(true);
        jButtonLimparTarefa.setEnabled(true);
        jComboBoxResponsavel.setEnabled(true);
        jCheckBoxResponsavel.setEnabled(true);
        jLabelTarefa.setEnabled(true);
        jTextFieldTarefa.setEnabled(true);
        jLabelDescricao.setEnabled(true);
        jTextFieldDescricao.setEnabled(true);
        jLabelDataEncerramento.setEnabled(true);
        jDateChooserDataEncerramento.setEnabled(true);
        jLabelTempoAtividade.setEnabled(true);
        jComboBoxTempoAtividade.setEnabled(true);
        jLabelResponsavel.setEnabled(true);
        jComboBoxResponsavel.setEnabled(true);
        jCheckBoxResponsavel.setEnabled(true);
        jCheckBoxResponsavel.setEnabled(true);
        jButtonEditarTarefa.setEnabled(!true);

    }//GEN-LAST:event_jButtonEditarTarefaActionPerformed

    private void jComboBoxResposavelPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxResposavelPesquisarActionPerformed

    }//GEN-LAST:event_jComboBoxResposavelPesquisarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        relatoriosmodel.setTfPesquisar(jTextFieldCampoPesquisar.getText());

        //Datas inicial e final
        SimpleDateFormat formatador = new SimpleDateFormat("ddMMyyyy");
        if (jDateChooserDataInicialPesquisar.getDate() == null) {
            String dataInicialPesquisaFormatada = "";
            relatoriosmodel.setDateDatainicial(dataInicialPesquisaFormatada);

        } else {
            java.util.Date dataInicialPesquisa = jDateChooserDataInicialPesquisar.getDate();
            String dataInicialPesquisaFormatada = formatador.format(dataInicialPesquisa);
            relatoriosmodel.setDateDatainicial(dataInicialPesquisaFormatada);
        }

        if (jDateChooserDataFinalPesquisar.getDate() == null) {
            String dataFinalPesquisaFormatada = "";
            relatoriosmodel.setDateDatafinal(dataFinalPesquisaFormatada);
        } else {
            java.util.Date dataFinalPesquisa = jDateChooserDataFinalPesquisar.getDate();
            String dataFinalPesquisaFormatada = formatador.format(dataFinalPesquisa);
            relatoriosmodel.setDateDatafinal(dataFinalPesquisaFormatada);
        }

        //Checkbox Responsavel pela Tarefa
        if (jCheckBoxResponsavelTodos.isSelected()) {
            relatoriosmodel.setComboBoxresponsavel(0);
        } else {
            Object nome_id_usuario = jComboBoxResposavelPesquisar.getSelectedItem();
            relatoriosmodel.setComboBoxresponsavel(tarefasdao.buscaResponsavelTarefa((String) nome_id_usuario));
        }

        //Checkbox se é para pesquisar em tarefa
        if (jCheckBoxNomeTarefaPesquisar.isSelected()) {
            relatoriosmodel.setCheckboxTarefa(1);
        } else {
            relatoriosmodel.setCheckboxTarefa(0);
        }

        //Checkbox se é para pesquisar em Descricao
        if (jCheckBoxDescricaoTarefaPesquisar.isSelected()) {
            relatoriosmodel.setCheckboxDescricao(1);
        } else {
            relatoriosmodel.setCheckboxDescricao(0);
        }

        //Radio Button Opção Status        
        if (jRadioButtonConcluidasPesquisar.isSelected()) {
            relatoriosmodel.setRadiobuttonStatus(2);
        } else if (jRadioButtonEmAndamentoPesquisar.isSelected()) {
            relatoriosmodel.setRadiobuttonStatus(1);
        } else if (jRadioButtonAbertasPesquisar.isSelected()) {
            relatoriosmodel.setRadiobuttonStatus(0);
        } else if (jRadioButtonEmPausaRelatorios.isSelected()) {
            relatoriosmodel.setRadiobuttonStatus(3);
        } else if (jRadioButtonTodasPesquisar.isSelected()) {
            relatoriosmodel.setRadiobuttonStatus(4);
        }

        //RadioButtonOrdemPesquisa
        if (jRadioButtonOrdemCrescentePesquisa.isSelected()) {
            relatoriosmodel.setOrderby(1);
        } else if (jRadioButtonOrdemDecrescentePesquisa.isSelected()) {
            relatoriosmodel.setOrderby(2);
        }

        preencherTabelaTarefas(relatoriosdao.campoPesquisarTarefas(relatoriosmodel));

        //TarefasModel model = tarefasdao.pesquisarTarefas(tarefasmodel);
        //preencherTabelaTarefas("select * from tarefas where lower(tarefa) like '%" + tarefasmodel.getPesquisar().toLowerCase() + "%' order by datacriacao desc");

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTableTarefasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTarefasMouseClicked

        jComboBoxResponsavel.setEnabled(!true);
        jCheckBoxResponsavel.setEnabled(!true);
        jLabelTarefa.setEnabled(!true);
        jTextFieldTarefa.setEnabled(!true);
        jLabelDescricao.setEnabled(!true);
        jTextFieldDescricao.setEnabled(!true);
        jLabelDataEncerramento.setEnabled(!true);
        jDateChooserDataEncerramento.setEnabled(!true);
        jLabelTempoAtividade.setEnabled(!true);
        jComboBoxTempoAtividade.setEnabled(!true);
        jLabelResponsavel.setEnabled(!true);
        jComboBoxResponsavel.setEnabled(!true);
        jCheckBoxResponsavel.setEnabled(!true);
        jCheckBoxResponsavel.setEnabled(!true);
        jButtonNovaTarefa.setEnabled(true);
        jButtonCriarTarefa.setEnabled(!true);
        jButtonLimparTarefa.setEnabled(!true);
        jButtonEditarTarefa.setEnabled(!true);
        jButtonExcluirTarefa.setEnabled(!true);
        jButtonPausarConcluirAtividades.setEnabled(!true);
        jButtonPausarConcluirAtividades.setText("Atividade");
        jButtonPausarMinhasAtividades.setEnabled(!true);

        String id = "" + jTableTarefas.getValueAt(jTableTarefas.getSelectedRow(), 0);
        conexaodb.conexao();
        conexaodb.executasql("select * from tarefas where id_tarefas='" + id + "'");
        try {
            conexaodb.rs.first();
            int status = conexaodb.rs.getInt("concluido");

            //Eventos com um click
            if ((status == 1) && (sessaocontrol.getIdUsuarioLogado()) == conexaodb.rs.getInt("id_usuario_responsavel")) {
                jButtonPausarMinhasAtividades.setText("Pausar Tarefa");
                jButtonPausarMinhasAtividades.setEnabled(true);
                jButtonPausarConcluirAtividades.setText("Concluir Tarefa");
                jButtonPausarConcluirAtividades.setEnabled(true);
            } else if ((status ==0) && (sessaocontrol.getIdUsuarioLogado()) == conexaodb.rs.getInt("id_usuario_responsavel")) {
                jButtonPausarMinhasAtividades.setEnabled(!true);
                jButtonPausarConcluirAtividades.setText("Iniciar Tarefa");
                jButtonPausarConcluirAtividades.setEnabled(true);
            } else if ((status == 3) && (sessaocontrol.getIdUsuarioLogado()) == conexaodb.rs.getInt("id_usuario_responsavel")) {
                jButtonPausarMinhasAtividades.setText("Retomar Tarefa");
                jButtonPausarMinhasAtividades.setEnabled(true);
                jButtonPausarConcluirAtividades.setEnabled(!true);
            }
            jTextFieldTarefa.setText(conexaodb.rs.getString("tarefa").trim());
            jTextFieldDescricao.setText(conexaodb.rs.getString("descricao").trim());
            jTextFieldIdTarefaEditar.setText(conexaodb.rs.getString("id_tarefas"));
            jComboBoxTempoAtividade.setSelectedItem(relatoriosdao.comboboxTempoDBparaUser(conexaodb.rs.getString("qttempoprevistoconclusao").trim()));

            //String to date
            String dataEncerramentoEditar = conexaodb.rs.getString("dataprevistaencerramento");
            String formato = "ddMMyyyy";
            java.util.Date dataEncerramentoEditarFormatada = new SimpleDateFormat(formato).parse(dataEncerramentoEditar);
            jDateChooserDataEncerramento.setDate(dataEncerramentoEditarFormatada);

            if (evt.getClickCount() == 2 && !evt.isConsumed()) {
                evt.consume();

                if ((conexaodb.rs.getInt("id_usuario_responsavel") == sessaocontrol.getIdUsuarioLogado()) && (conexaodb.rs.getInt("concluido") == 1)) {
                    int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja encerrar a atividade?");
                    if (resposta == JOptionPane.YES_OPTION) {

                        EncerrarTarefaView encerrartarefa = new EncerrarTarefaView(conexaodb.rs.getInt("id_tarefas"));

                        if (encerrartarefa == null) {
                            encerrartarefa = new EncerrarTarefaView(conexaodb.rs.getInt("id_tarefas"));
                            encerrartarefa.setVisible(true);
                            encerrartarefa.setResizable(false);
                        } else {
                            encerrartarefa.setVisible(true);
                            encerrartarefa.setResizable(false);
                        }
                    }
                    jButtonEditarTarefa.setEnabled(true);
                    jButtonExcluirTarefa.setEnabled(true);

                    //jDateChooserDataEncerramento.setDate();
                } else if ((conexaodb.rs.getInt("id_usuario_responsavel") == sessaocontrol.getIdUsuarioLogado()) && (conexaodb.rs.getInt("concluido") == 2)) {
                    int resposta = JOptionPane.showConfirmDialog(rootPane, "Tarefa já concluída, deseja abrir uma nova tarefa?");
                    if (resposta == JOptionPane.YES_OPTION) {
                        flag = 1;

                        jButtonNovaTarefa.setEnabled(!true);
                        jButtonCriarTarefa.setEnabled(true);
                        jButtonLimparTarefa.setEnabled(true);
                        jComboBoxResponsavel.setEnabled(true);
                        jCheckBoxResponsavel.setEnabled(true);
                        jLabelTarefa.setEnabled(true);
                        jTextFieldTarefa.setEnabled(true);
                        jLabelDescricao.setEnabled(true);
                        jTextFieldDescricao.setEnabled(true);
                        jLabelDataEncerramento.setEnabled(true);
                        jDateChooserDataEncerramento.setEnabled(true);
                        jLabelTempoAtividade.setEnabled(true);
                        jComboBoxTempoAtividade.setEnabled(true);
                        jLabelResponsavel.setEnabled(true);
                        jComboBoxResponsavel.setEnabled(true);
                        jCheckBoxResponsavel.setEnabled(true);
                        jCheckBoxResponsavel.setEnabled(true);
                        jButtonEditarTarefa.setEnabled(!true);
                    }
                    jButtonEditarTarefa.setEnabled(true);
                    jButtonExcluirTarefa.setEnabled(true);
                } else if ((conexaodb.rs.getInt("id_usuario_responsavel") == sessaocontrol.getIdUsuarioLogado()) && (conexaodb.rs.getInt("concluido") == 0)) {
                    int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja iniciar as atividades da tarefa?");
                    if (resposta == JOptionPane.YES_OPTION) {
                        tarefasmodel.setIdtarefas(conexaodb.rs.getInt("id_tarefas"));
                        tarefasdao.iniciarAtividadeTarefa(tarefasmodel);

                    }
                    jButtonEditarTarefa.setEnabled(true);
                    jButtonExcluirTarefa.setEnabled(true);
                } else {
                    jButtonEditarTarefa.setEnabled(!true);
                    jButtonExcluirTarefa.setEnabled(!true);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Não foi possivel selecionar a tarefa: \n" + ex);
        } catch (ParseException ex) {
            Logger.getLogger(TarefasView.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexaodb.desconexao();

    }//GEN-LAST:event_jTableTarefasMouseClicked

    private void jCheckBoxResponsavelTodosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxResponsavelTodosMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxResponsavelTodosMouseReleased

    private void jCheckBoxResponsavelTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxResponsavelTodosMouseClicked

    }//GEN-LAST:event_jCheckBoxResponsavelTodosMouseClicked

    private void jCheckBoxResponsavelTodosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxResponsavelTodosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxResponsavelTodosMouseExited

    private void jCheckBoxResponsavelTodosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxResponsavelTodosItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxResponsavelTodosItemStateChanged

    private void jCheckBoxResponsavelTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxResponsavelTodosActionPerformed
        if (jCheckBoxResponsavelTodos.isSelected()) {
            jComboBoxResposavelPesquisar.setEnabled(!true);
        } else {
            jComboBoxResposavelPesquisar.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBoxResponsavelTodosActionPerformed

    private void jButtonLimparTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparTarefaActionPerformed
        jComboBoxResponsavel.setEnabled(!true);
        jCheckBoxResponsavel.setEnabled(!true);
        jLabelTarefa.setEnabled(!true);
        jTextFieldTarefa.setEnabled(!true);
        jLabelDescricao.setEnabled(!true);
        jTextFieldDescricao.setEnabled(!true);
        jLabelDataEncerramento.setEnabled(!true);
        jDateChooserDataEncerramento.setEnabled(!true);
        jLabelTempoAtividade.setEnabled(!true);
        jComboBoxTempoAtividade.setEnabled(!true);
        jLabelResponsavel.setEnabled(!true);
        jComboBoxResponsavel.setEnabled(!true);
        jCheckBoxResponsavel.setEnabled(!true);
        jCheckBoxResponsavel.setEnabled(!true);
        jButtonNovaTarefa.setEnabled(true);
        jButtonCriarTarefa.setEnabled(!true);
        jButtonLimparTarefa.setEnabled(!true);
        jTextFieldTarefa.setText("");
        jTextFieldDescricao.setText("");
        jDateChooserDataEncerramento.setDate(null);

    }//GEN-LAST:event_jButtonLimparTarefaActionPerformed

    private void jButtonCriarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarTarefaActionPerformed
        if (flag == 1) {
            //Verificar preenchimento dos campos
            if (jTextFieldTarefa.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o nome da Tarefa.");
                jTextFieldTarefa.requestFocus();
            } else if (jDateChooserDataEncerramento.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Preencha a data previsa de encerramento da atividade.");
                jDateChooserDataEncerramento.requestFocus();
            } else {
                //Criar nova tarefa
                tarefasmodel.setTarefa(jTextFieldTarefa.getText());
                tarefasmodel.setDescricao(jTextFieldDescricao.getText());

                //DataEncerramento
                SimpleDateFormat formatador = new SimpleDateFormat("ddMMyyyy");
                java.util.Date data = jDateChooserDataEncerramento.getDate();
                String dataFormatada = formatador.format(data);
                tarefasmodel.setDataencerramento(dataFormatada);

                //DataAtual
                String dataAtualFormatada = formatador.format(System.currentTimeMillis());
                tarefasmodel.setDatacriacao(dataAtualFormatada);

                //Tempo estimado de coonclusao
                tarefasmodel.setQttempoprevistoconclusao(relatoriosdao.comboboxTempoUserparaDB(jComboBoxTempoAtividade.getSelectedItem().toString()));

                //Concluido = 1 para concluido e 0 para nao concluido
                //tarefasmodel.setConcluido(tarefasmodel.getJbuttonstatus());
                //tarefasmodel.setQttempoconclusao((float) (jComboBoxTempoAtividade.getSelectedItem()));
                if (jCheckBoxResponsavel.isSelected()) {
                    tarefasmodel.setId_usuario_responsavel(sessaocontrol.getNomeUsuarioLogado());
                } else {
                    Object nome_id_usuario = jComboBoxResponsavel.getSelectedItem();
                    tarefasmodel.setId_usuario_responsavel(nome_id_usuario.toString());
                }

                tarefasdao.novaTarefa(tarefasmodel);

                jComboBoxResponsavel.setEnabled(!true);
                jCheckBoxResponsavel.setEnabled(!true);
                jLabelTarefa.setEnabled(!true);
                jTextFieldTarefa.setEnabled(!true);
                jLabelDescricao.setEnabled(!true);
                jTextFieldDescricao.setEnabled(!true);
                jLabelDataEncerramento.setEnabled(!true);
                jDateChooserDataEncerramento.setEnabled(!true);
                jLabelTempoAtividade.setEnabled(!true);
                jComboBoxTempoAtividade.setEnabled(!true);
                jLabelResponsavel.setEnabled(!true);
                jComboBoxResponsavel.setEnabled(!true);
                jCheckBoxResponsavel.setEnabled(!true);
                jCheckBoxResponsavel.setEnabled(!true);
                jButtonNovaTarefa.setEnabled(true);
                jButtonCriarTarefa.setEnabled(!true);
                jButtonLimparTarefa.setEnabled(!true);
                jTextFieldTarefa.setText("");
                jTextFieldDescricao.setText("");
                jDateChooserDataEncerramento.setDate(null);

            }

            preencherTabelaTarefas("select * from tarefas order by dataprevistaencerramento desc");
        } else if (flag == 2) {
            //Verificar preenchimento dos campos
            if (jTextFieldTarefa.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o nome da Tarefa.");
                jTextFieldTarefa.requestFocus();
            } else if (jDateChooserDataEncerramento.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Preencha a data previsa de encerramento da atividade.");
                jDateChooserDataEncerramento.requestFocus();
            } else {
                //Editar Usuario
                tarefasmodel.setTarefa(jTextFieldTarefa.getText());
                tarefasmodel.setDescricao(jTextFieldDescricao.getText());
                tarefasmodel.setIdtarefas(Integer.parseInt(jTextFieldIdTarefaEditar.getText()));

                //DataEncerramento
                java.util.Date data = jDateChooserDataEncerramento.getDate();
                SimpleDateFormat formatador = new SimpleDateFormat("ddMMyyyy");
                String dataFormatada = formatador.format(data);
                tarefasmodel.setDataprevistaencerramento(dataFormatada);

                //Tempo estimado de coonclusao
                tarefasmodel.setQttempoprevistoconclusao(relatoriosdao.comboboxTempoUserparaDB(jComboBoxTempoAtividade.getSelectedItem().toString()));

                //0 = aberto, 1 = em andamento, 2 = concluido, 3 = pausa
                tarefasmodel.setConcluido(tarefasmodel.getJbuttonstatus());

                //tarefasmodel.setQttempoconclusao((float) (jComboBoxTempoAtividade.getSelectedItem()));
                if (jCheckBoxResponsavel.isSelected()) {
                    tarefasmodel.setId_usuario_responsavel(sessaocontrol.getNomeUsuarioLogado());
                } else {
                    Object nome_id_usuario = jComboBoxResponsavel.getSelectedItem();
                    tarefasmodel.setId_usuario_responsavel(nome_id_usuario.toString());
                }

                //Verificar preenchimento dos campos
                if (jTextFieldTarefa.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha o campo tabela.");
                    jTextFieldTarefa.requestFocus();
                } else if ("".equals(dataFormatada)) {
                    JOptionPane.showMessageDialog(null, "Preencha a data previsa de encerramento da atividade.");
                    jDateChooserDataEncerramento.requestFocus();
                } else {
                    //Criar nova tarefa
                    tarefasdao.editarTarefa(tarefasmodel);

                    jComboBoxResponsavel.setEnabled(!true);
                    jCheckBoxResponsavel.setEnabled(!true);
                    jLabelTarefa.setEnabled(!true);
                    jTextFieldTarefa.setEnabled(!true);
                    jLabelDescricao.setEnabled(!true);
                    jTextFieldDescricao.setEnabled(!true);
                    jLabelDataEncerramento.setEnabled(!true);
                    jDateChooserDataEncerramento.setEnabled(!true);
                    jLabelTempoAtividade.setEnabled(!true);
                    jComboBoxTempoAtividade.setEnabled(!true);
                    jLabelResponsavel.setEnabled(!true);
                    jComboBoxResponsavel.setEnabled(!true);
                    jCheckBoxResponsavel.setEnabled(!true);
                    jCheckBoxResponsavel.setEnabled(!true);
                    jButtonNovaTarefa.setEnabled(true);
                    jButtonCriarTarefa.setEnabled(!true);
                    jButtonLimparTarefa.setEnabled(!true);
                    jTextFieldTarefa.setText("");
                    jTextFieldDescricao.setText("");
                    jDateChooserDataEncerramento.setDate(null);
                }

                preencherTabelaTarefas("select * from tarefas order by dataprevistaencerramento desc");
            }
        }
    }//GEN-LAST:event_jButtonCriarTarefaActionPerformed

    private void jCheckBoxResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxResponsavelActionPerformed
        if (jCheckBoxResponsavel.isSelected()) {
            jComboBoxResponsavel.setEnabled(!true);
        } else {
            jComboBoxResponsavel.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBoxResponsavelActionPerformed

    private void jCheckBoxResponsavelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxResponsavelItemStateChanged

    }//GEN-LAST:event_jCheckBoxResponsavelItemStateChanged

    private void jCheckBoxResponsavelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxResponsavelMouseExited

    }//GEN-LAST:event_jCheckBoxResponsavelMouseExited

    private void jCheckBoxResponsavelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxResponsavelMouseClicked

    }//GEN-LAST:event_jCheckBoxResponsavelMouseClicked

    private void jCheckBoxResponsavelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxResponsavelMouseReleased

    }//GEN-LAST:event_jCheckBoxResponsavelMouseReleased

    private void jComboBoxResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxResponsavelActionPerformed

    private void jTextFieldIdTarefaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdTarefaEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdTarefaEditarActionPerformed

    private void jButtonExcluirTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirTarefaActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente exluir?");
        if (resposta == JOptionPane.YES_OPTION) {
            tarefasmodel.setIdtarefas(Integer.parseInt(jTextFieldIdTarefaEditar.getText()));
            tarefasdao.excluirTarefas(tarefasmodel);
            preencherTabelaTarefas("select * from tarefas order by dataprevistaencerramento desc");

        } else {
            JOptionPane.showMessageDialog(null, "Tarefa para exclusão não selecionada.");
        }
    }//GEN-LAST:event_jButtonExcluirTarefaActionPerformed

    private void jTableTarefasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTarefasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableTarefasMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        preencherTabelaTarefas("select * from tarefas order by dataprevistaencerramento desc");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String idMinhasTarefas = "" + jTableTarefas.getValueAt(jTableTarefas.getSelectedRow(), 0);

        VisualizarAtividadeView visualizaratividade = new VisualizarAtividadeView(idMinhasTarefas);

        if (visualizaratividade == null) {
            visualizaratividade = new VisualizarAtividadeView(idMinhasTarefas);
            visualizaratividade.setVisible(true);
            visualizaratividade.setResizable(false);
        } else {
            visualizaratividade.setVisible(true);
            visualizaratividade.setResizable(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonPausarConcluirAtividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPausarConcluirAtividadesActionPerformed

        String idMinhasTarefas = "" + jTableTarefas.getValueAt(jTableTarefas.getSelectedRow(), 0);
        conexaodb.conexao();
        conexaodb.executasql("select * from tarefas where id_tarefas=" + idMinhasTarefas);

        try {
            conexaodb.rs.first();

            if (conexaodb.rs.getInt("concluido") == 1) {
                EncerrarTarefaView encerrartarefa = new EncerrarTarefaView(conexaodb.rs.getInt("id_tarefas"));
                if (encerrartarefa == null) {
                    encerrartarefa = new EncerrarTarefaView(conexaodb.rs.getInt("id_tarefas"));
                    encerrartarefa.setVisible(true);
                    encerrartarefa.setResizable(false);
                } else {
                    encerrartarefa.setVisible(true);
                    encerrartarefa.setResizable(false);
                }

            } else if (conexaodb.rs.getInt("concluido") == 0) {

                tarefasmodel.setIdtarefas(conexaodb.rs.getInt("id_tarefas"));
                tarefasdao.iniciarAtividadeTarefa(tarefasmodel);

            } else if (conexaodb.rs.getInt("concluido") == 3) {
                String idMinhasTarefasPausar = "" + jTableTarefas.getValueAt(jTableTarefas.getSelectedRow(), 0);

                SimpleDateFormat formatadorData = new SimpleDateFormat("ddMMyyyy");
                SimpleDateFormat formatadorHora = new SimpleDateFormat("KKmm");

                pausastarefasmodel.setStatus_pausa(1);
                pausastarefasmodel.setIdtarefapausa(Integer.parseInt(idMinhasTarefasPausar));
                String data_pausa = formatadorData.format(System.currentTimeMillis());
                String hora_pausa = formatadorHora.format(System.currentTimeMillis());
                pausastarefasmodel.setData_pausa(data_pausa);
                pausastarefasmodel.setHora_pausa(hora_pausa);
                tarefasdao.pausarRetomarAtividade(pausastarefasmodel);
                preencherTabelaTarefas("select * from tarefas order by dataprevistaencerramento desc");
            }

        } catch (SQLException ex) {
            System.out.println("Não foi possivel selecionar a tarefa: \n" + ex);
        }
        conexaodb.desconexao();
        preencherTabelaTarefas("select * from tarefas order by dataprevistaencerramento desc");
    }//GEN-LAST:event_jButtonPausarConcluirAtividadesActionPerformed

    private void jButtonPausarMinhasAtividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPausarMinhasAtividadesActionPerformed

        String idMinhasTarefasPausar = "" + jTableTarefas.getValueAt(jTableTarefas.getSelectedRow(), 0);

        //buscarStatusTarefa
        conexaodb.conexao();
        int statusTarefas = 0;
        try {
            conexaodb.executasql("select * from tarefas where id_tarefas=" + idMinhasTarefasPausar);
            conexaodb.rs.first();
            statusTarefas = conexaodb.rs.getInt("concluido");
        } catch (SQLException ex) {
            System.out.println("Erro ao preencher jComboBox." + ex);
        }
        conexaodb.desconexao();

        SimpleDateFormat formatadorData = new SimpleDateFormat("ddMMyyyy");
        SimpleDateFormat formatadorHora = new SimpleDateFormat("HHmm");

        //se tarefa estiver em andamento ira adicionar que voltou
        if (statusTarefas == 3) {
            pausastarefasmodel.setStatus_pausa(1);
            pausastarefasmodel.setIdtarefapausa(Integer.parseInt(idMinhasTarefasPausar));
            String data_pausa = formatadorData.format(System.currentTimeMillis());
            String hora_pausa = formatadorHora.format(System.currentTimeMillis());

            pausastarefasmodel.setData_pausa(data_pausa);
            pausastarefasmodel.setHora_pausa(hora_pausa);

            tarefasdao.pausarRetomarAtividade(pausastarefasmodel);

        } else if (statusTarefas == 1) {
            pausastarefasmodel.setStatus_pausa(3);
            pausastarefasmodel.setIdtarefapausa(Integer.parseInt(idMinhasTarefasPausar));
            String data_pausa = formatadorData.format(System.currentTimeMillis());
            String hora_pausa = formatadorHora.format(System.currentTimeMillis());

            pausastarefasmodel.setData_pausa(data_pausa);
            pausastarefasmodel.setHora_pausa(hora_pausa);

            tarefasdao.pausarRetomarAtividade(pausastarefasmodel);
        } else {
            JOptionPane.showMessageDialog(null, "Tarefa já concluída ou em aberto, favor atualizar no botão ao lado.");
        }
        preencherTabelaTarefas("select * from tarefas order by dataprevistaencerramento desc");
    }//GEN-LAST:event_jButtonPausarMinhasAtividadesActionPerformed

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
            java.util.logging.Logger.getLogger(TarefasView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TarefasView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TarefasView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TarefasView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TarefasView().setVisible(true);
            }
        });
    }

    public void preencherTabelaTarefas(String Sql) {

        if (Sql == "pesquisa") {
            //chamar funcao;
        }

        ArrayList dados = new ArrayList();
        String[] coluna = new String[]{
            //"ID","Tarefa","Descrição","Data de Criação","Data Prevista de Encerramento","Tempo Estimado de Conclusão","Responsável","Criador","Concluída","Data de Conclusão"};
            "ID", "Tarefa", "Descrição", "Data de Criação", "Dia da Atividade", "Tempo",
            "Responsável", "Criador", "Status", "Data de Conclusão"};
        conexaodb.conexao();
        conexaodb.executasql(Sql);

        try {
            conexaodb.rs.first();

            do {

                //status
                String status = relatoriosdao.statusConcluidoCaracter(conexaodb.rs.getInt("concluido"));;
                String tempoAtividade = relatoriosdao.comboboxTempoDBparaUser(conexaodb.rs.getString("qttempoprevistoconclusao").trim());;
                String nomeResponsavelTarefa = tarefasdao.buscaResponsavelTarefaPeloID(conexaodb.rs.getInt("id_usuario_responsavel"));
                String dataCriacao = relatoriosdao.formatarData(conexaodb.rs.getString("datacriacao").trim());
                String dataPrevistaEncerramento = relatoriosdao.formatarData(conexaodb.rs.getString("dataprevistaencerramento").trim());
                String dataEncerramento = relatoriosdao.formatarData(conexaodb.rs.getString("dataencerramento"));

                dados.add(new Object[]{conexaodb.rs.getInt("id_tarefas"), conexaodb.rs.getString("tarefa").trim(), conexaodb.rs.getString("descricao").trim(),
                    dataCriacao, dataPrevistaEncerramento,
                    tempoAtividade.trim(), nomeResponsavelTarefa.trim(),
                    conexaodb.rs.getString("nomeusuariocriador").trim(), status, dataEncerramento});
            } while (conexaodb.rs.next());
        } catch (SQLException ex) {
            System.out.println("Tarefa(as) inexistente(s).");
        }

        TabelaModel tabletarefas = new TabelaModel(dados, coluna);
        jTableTarefas.setModel(tabletarefas);
        jTableTarefas.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTableTarefas.getColumnModel().getColumn(0).setResizable(false);
        jTableTarefas.getColumnModel().getColumn(1).setPreferredWidth(220);
        jTableTarefas.getColumnModel().getColumn(1).setResizable(true);
        jTableTarefas.getColumnModel().getColumn(2).setPreferredWidth(310);
        jTableTarefas.getColumnModel().getColumn(2).setResizable(false);
        jTableTarefas.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableTarefas.getColumnModel().getColumn(3).setResizable(false);
        jTableTarefas.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTableTarefas.getColumnModel().getColumn(4).setResizable(false);
        jTableTarefas.getColumnModel().getColumn(5).setPreferredWidth(80);
        jTableTarefas.getColumnModel().getColumn(5).setResizable(false);
        jTableTarefas.getColumnModel().getColumn(6).setPreferredWidth(110);
        jTableTarefas.getColumnModel().getColumn(6).setResizable(false);
        jTableTarefas.getColumnModel().getColumn(7).setPreferredWidth(110);
        jTableTarefas.getColumnModel().getColumn(7).setResizable(false);
        jTableTarefas.getColumnModel().getColumn(8).setPreferredWidth(100);
        jTableTarefas.getColumnModel().getColumn(8).setResizable(false);
        jTableTarefas.getColumnModel().getColumn(9).setPreferredWidth(100);
        jTableTarefas.getColumnModel().getColumn(9).setResizable(false);
        jTableTarefas.getTableHeader().setReorderingAllowed(true);
        jTableTarefas.setAutoResizeMode(jTableTarefas.AUTO_RESIZE_OFF);
        jTableTarefas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        conexaodb.desconexao();
    }

    public void preecherUsuariosComboBox() {
        conexaodb.conexao();

        try {
            conexaodb.executasql("select * from usuarios");
            conexaodb.rs.first();
            jComboBoxResponsavel.removeAllItems();
            jComboBoxResposavelPesquisar.removeAllItems();
            do {
                jComboBoxResponsavel.addItem(conexaodb.rs.getString("nome").trim());
                jComboBoxResposavelPesquisar.addItem(conexaodb.rs.getString("nome").trim());
            } while (conexaodb.rs.next());

        } catch (SQLException ex) {
            System.out.println("Erro ao preencher jComboBox." + ex);
        }
        conexaodb.desconexao();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupOrdemPesquisa;
    public static javax.swing.ButtonGroup buttonGroupStatusNovaTarefa;
    private javax.swing.ButtonGroup buttonGroupStatusPesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonCriarTarefa;
    private javax.swing.JButton jButtonEditarTarefa;
    private javax.swing.JButton jButtonExcluirTarefa;
    private javax.swing.JButton jButtonLimparTarefa;
    private javax.swing.JButton jButtonNovaTarefa;
    private javax.swing.JButton jButtonPausarConcluirAtividades;
    private javax.swing.JButton jButtonPausarMinhasAtividades;
    private javax.swing.JCheckBox jCheckBoxDescricaoTarefaPesquisar;
    private javax.swing.JCheckBox jCheckBoxNomeTarefaPesquisar;
    private javax.swing.JCheckBox jCheckBoxResponsavel;
    private javax.swing.JCheckBox jCheckBoxResponsavelTodos;
    private javax.swing.JComboBox<String> jComboBoxResponsavel;
    private javax.swing.JComboBox<String> jComboBoxResposavelPesquisar;
    private javax.swing.JComboBox<String> jComboBoxTempoAtividade;
    private com.toedter.calendar.JDateChooser jDateChooserDataEncerramento;
    private com.toedter.calendar.JDateChooser jDateChooserDataFinalPesquisar;
    private com.toedter.calendar.JDateChooser jDateChooserDataInicialPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDataEncerramento;
    private javax.swing.JLabel jLabelDataFinalPesquisar;
    private javax.swing.JLabel jLabelDataInicialPesquisar;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelPesquisar;
    private javax.swing.JLabel jLabelResponsavel;
    private javax.swing.JLabel jLabelResponsavelPesquisar;
    private javax.swing.JLabel jLabelTarefa;
    private javax.swing.JLabel jLabelTempoAtividade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonAbertasPesquisar;
    private javax.swing.JRadioButton jRadioButtonConcluidasPesquisar;
    private javax.swing.JRadioButton jRadioButtonEmAndamentoPesquisar;
    private javax.swing.JRadioButton jRadioButtonEmPausaRelatorios;
    private javax.swing.JRadioButton jRadioButtonOrdemCrescentePesquisa;
    private javax.swing.JRadioButton jRadioButtonOrdemDecrescentePesquisa;
    private javax.swing.JRadioButton jRadioButtonTodasPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableTarefas;
    private javax.swing.JTextField jTextFieldCampoPesquisar;
    private javax.swing.JTextArea jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldIdTarefaEditar;
    private javax.swing.JTextField jTextFieldTarefa;
    // End of variables declaration//GEN-END:variables
}
