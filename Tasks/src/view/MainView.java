package view;

import java.sql.SQLException;
import control.ConexaoDB;
import model.UsuariosModel;
import control.SessaoControl;
import model.TarefasModel;
import model.PausasTarefasModel;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import model.TabelaModel;
import modeldao.RelatoriosDAO;
import modeldao.TarefasDAO;

public class MainView extends javax.swing.JFrame {

    ConexaoDB conexaodb = new ConexaoDB();
    UsuariosModel usuariosmodel = new UsuariosModel();
    UsuariosView usuariosview = new UsuariosView();
    TarefasView tarefasview = new TarefasView();
    SessaoControl sessaocontrol = new SessaoControl();
    TarefasModel tarefasmodel = new TarefasModel();
    TarefasDAO tarefasdao = new TarefasDAO();
    RelatoriosDAO relatoriosdao = new RelatoriosDAO();
    PausasTarefasModel pausastarefasmodel = new PausasTarefasModel();

    public MainView() {
        initComponents();
        conexaodb.conexao();
        jLabelUsuario.setText(sessaocontrol.getNomeUsuarioLogado());
        preencherTabelaMinhasTarefas("select * from tarefas where id_usuario_responsavel=" + sessaocontrol.getIdUsuarioLogado() + " and not concluido=2 order by dataprevistaencerramento desc");
        preencherTabelaTodasTarefas("select * from tarefas where not concluido=2 and not id_usuario_responsavel=" + sessaocontrol.getIdUsuarioLogado() + " order by dataprevistaencerramento desc");
        preecherUsuariosComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTodasTarefas = new javax.swing.JTable();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableMinhasTarefas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonVisualizarAtividadeQualquer = new javax.swing.JButton();
        jButtonVisualizarAtividadeMinha = new javax.swing.JButton();
        jButtonPausarMinhasAtividades = new javax.swing.JButton();
        jButtonPausarConcluirAtividades = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGENDE - Sua agenda rápida de tarefas!");

        jInternalFrameBemVindo.setClosable(true);
        jInternalFrameBemVindo.setMaximizable(true);
        jInternalFrameBemVindo.setResizable(true);
        jInternalFrameBemVindo.setTitle("Bem Vindo!");
        jInternalFrameBemVindo.setVisible(true);

        jPanelInternal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelInternal.setLayout(null);

        jTableTodasTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableTodasTarefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTodasTarefasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTodasTarefas);

        jPanelInternal.add(jScrollPane1);
        jScrollPane1.setBounds(10, 440, 980, 190);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTarefa.setText("Tarefa");

        jLabelDescricao.setText("Descrição");

        jLabelDataEncerramento.setText("Data de encerramento: ");

        jLabelTempoAtividade.setText("Tempo de Atividade: ");

        jComboBoxTempoAtividade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00:15", "00:30", "00:45", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "07:00", "08:00", "O Dia Todo" }));

        jComboBoxResponsavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxResponsavelActionPerformed(evt);
            }
        });

        jLabelResponsavel.setText("Responsável:");

        jCheckBoxResponsavel.setText("Eu mesmo.");
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
        jButtonCriarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarTarefaActionPerformed(evt);
            }
        });

        jButtonLimparTarefa.setText("Limpar");
        jButtonLimparTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparTarefaActionPerformed(evt);
            }
        });

        jDateChooserDataEncerramento.setDateFormatString("dd/MM/yyyy");
        jDateChooserDataEncerramento.setMaxSelectableDate(new java.util.Date(2524618898000L));
        jDateChooserDataEncerramento.setMinSelectableDate(new java.util.Date(1451617298000L));

        jTextFieldDescricao.setColumns(20);
        jTextFieldDescricao.setLineWrap(true);
        jTextFieldDescricao.setRows(5);
        jTextFieldDescricao.setMaximumSize(new java.awt.Dimension(262, 74));
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelDataEncerramento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooserDataEncerramento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelTempoAtividade)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxTempoAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIdTarefaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxResponsavel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonLimparTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jButtonCriarTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(448, 448, 448))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
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
                                .addComponent(jLabelDescricao)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabelTempoAtividade)
                                            .addComponent(jComboBoxTempoAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabelResponsavel)
                                            .addComponent(jComboBoxResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCheckBoxResponsavel))))
                                .addGap(70, 70, 70))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCriarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldIdTarefaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimparTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70))))
        );

        jPanelInternal.add(jPanel2);
        jPanel2.setBounds(70, 40, 850, 110);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Criação Rápida de Atividade");
        jPanelInternal.add(jLabel4);
        jLabel4.setBounds(370, 10, 250, 20);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("Minhas Atividades Pendentes ");
        jPanelInternal.add(jLabel5);
        jLabel5.setBounds(20, 160, 220, 17);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setText("Todas as Atividades");
        jPanelInternal.add(jLabel6);
        jLabel6.setBounds(20, 410, 160, 17);

        jTableMinhasTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableMinhasTarefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMinhasTarefasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableMinhasTarefas);

        jPanelInternal.add(jScrollPane3);
        jScrollPane3.setBounds(10, 190, 980, 210);

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButton1);
        jButton1.setBounds(880, 160, 100, 30);

        jButton2.setText("Atualizar");
        jButton2.setPreferredSize(new java.awt.Dimension(105, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButton2);
        jButton2.setBounds(880, 410, 100, 30);

        jButtonVisualizarAtividadeQualquer.setText("Visualizar");
        jButtonVisualizarAtividadeQualquer.setEnabled(false);
        jButtonVisualizarAtividadeQualquer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarAtividadeQualquerActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonVisualizarAtividadeQualquer);
        jButtonVisualizarAtividadeQualquer.setBounds(770, 410, 105, 30);

        jButtonVisualizarAtividadeMinha.setText("Visualizar");
        jButtonVisualizarAtividadeMinha.setEnabled(false);
        jButtonVisualizarAtividadeMinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarAtividadeMinhaActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonVisualizarAtividadeMinha);
        jButtonVisualizarAtividadeMinha.setBounds(770, 160, 105, 30);

        jButtonPausarMinhasAtividades.setText("Pausar Tarefa");
        jButtonPausarMinhasAtividades.setEnabled(false);
        jButtonPausarMinhasAtividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPausarMinhasAtividadesActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonPausarMinhasAtividades);
        jButtonPausarMinhasAtividades.setBounds(620, 160, 140, 30);

        jButtonPausarConcluirAtividades.setText("Atividade");
        jButtonPausarConcluirAtividades.setEnabled(false);
        jButtonPausarConcluirAtividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPausarConcluirAtividadesActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonPausarConcluirAtividades);
        jButtonPausarConcluirAtividades.setBounds(470, 160, 140, 30);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("AGENDE¿ - O Sistema de Gerenciamento de Tarefas");

        jButton3.setText("Fechar Bem Vindo");
        jButton3.setToolTipText("Fechar Tela Bem Vindo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameBemVindoLayout = new javax.swing.GroupLayout(jInternalFrameBemVindo.getContentPane());
        jInternalFrameBemVindo.getContentPane().setLayout(jInternalFrameBemVindoLayout);
        jInternalFrameBemVindoLayout.setHorizontalGroup(
            jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                .addGroup(jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                        .addContainerGap(324, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(117, 117, 117)
                        .addComponent(jButton3))
                    .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanelInternal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrameBemVindoLayout.setVerticalGroup(
            jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addComponent(jPanelInternal, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jInternalFrameBemVindo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jInternalFrameBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jInternalFrameBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Usuário: ");

        jLabelUsuario.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabelUsuario.setText("Usuário");

        jMenu5.setText("Arquivo");

        jMenuItem8.setText("Bem-Vindo");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuBar1.add(jMenu5);

        jMenu1.setText("Cadastros");

        jMenuItem7.setText("Usuarios");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tarefas");

        jMenuItem1.setText("Tarefas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Meu Perfil");

        jMenuItem4.setText("Alterar Minha Senha");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelUsuario))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        MainView tela = new MainView();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed

        if (usuariosview == null) {
            usuariosview = new UsuariosView();
            usuariosview.setVisible(true);
            usuariosview.setResizable(false);
        } else {
            usuariosview.setVisible(true);
            usuariosview.setResizable(false);
        }

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (tarefasview == null) {
            tarefasview = new TarefasView();
            tarefasview.setVisible(true);
            tarefasview.setResizable(false);
        } else {
            tarefasview.setVisible(true);
            tarefasview.setResizable(false);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldIdTarefaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdTarefaEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdTarefaEditarActionPerformed

    private void jButtonLimparTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparTarefaActionPerformed

        jTextFieldTarefa.setText("");
        jTextFieldDescricao.setText("");
        jDateChooserDataEncerramento.setDate(null);
    }//GEN-LAST:event_jButtonLimparTarefaActionPerformed

    private void jButtonCriarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarTarefaActionPerformed
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

            jTextFieldTarefa.setText("");
            jTextFieldDescricao.setText("");
            jDateChooserDataEncerramento.setDate(null);
            preencherTabelaMinhasTarefas("select * from tarefas where id_usuario_responsavel=" + sessaocontrol.getIdUsuarioLogado() + " and not concluido=2 order by dataprevistaencerramento desc");
            preencherTabelaTodasTarefas("select * from tarefas where not concluido=2 and not id_usuario_responsavel=" + sessaocontrol.getIdUsuarioLogado() + " order by dataprevistaencerramento desc");
            jButtonPausarMinhasAtividades.setEnabled(!true);
        }
        conexaodb.desconexao();
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        preencherTabelaMinhasTarefas("select * from tarefas where id_usuario_responsavel=" + sessaocontrol.getIdUsuarioLogado() + " and not concluido=2 order by dataprevistaencerramento desc");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        preencherTabelaTodasTarefas("select * from tarefas where not concluido=2 and not id_usuario_responsavel=" + sessaocontrol.getIdUsuarioLogado() + " order by dataprevistaencerramento desc");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTableMinhasTarefasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMinhasTarefasMouseClicked
        jButtonVisualizarAtividadeMinha.setEnabled(true);
        String idMinhasTarefas = "" + jTableMinhasTarefas.getValueAt(jTableMinhasTarefas.getSelectedRow(), 0);
        conexaodb.conexao();
        conexaodb.executasql("select * from tarefas where id_tarefas=" + idMinhasTarefas);

        try {
            conexaodb.rs.first();

            int status = conexaodb.rs.getInt("concluido");

            //Eventos com um click
            if (status == 1) {
                jButtonPausarMinhasAtividades.setText("Pausar Tarefa");
                jButtonPausarMinhasAtividades.setEnabled(true);
                jButtonPausarConcluirAtividades.setText("Concluir Tarefa");
                jButtonPausarConcluirAtividades.setEnabled(true);
            } else if (status == 0) {
                jButtonPausarMinhasAtividades.setEnabled(!true);
                jButtonPausarConcluirAtividades.setText("Iniciar Tarefa");
                jButtonPausarConcluirAtividades.setEnabled(true);
            } else if (status == 3) {
                jButtonPausarMinhasAtividades.setText("Retomar Tarefa");
                jButtonPausarMinhasAtividades.setEnabled(true);
                jButtonPausarConcluirAtividades.setEnabled(!true);
            }

            //Eventos com Double Click
            if (evt.getClickCount() == 2 && !evt.isConsumed()) {
                evt.consume();

                if (conexaodb.rs.getInt("concluido") == 1) {
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
                } else if (conexaodb.rs.getInt("concluido") == 0) {
                    int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja iniciar as atividades da tarefa?");
                    if (resposta == JOptionPane.YES_OPTION) {
                        tarefasmodel.setIdtarefas(conexaodb.rs.getInt("id_tarefas"));
                        tarefasdao.iniciarAtividadeTarefa(tarefasmodel);
                    }
                } else if (conexaodb.rs.getInt("concluido") == 3) {
                    int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja retomar as atividades da tarefa?");
                    if (resposta == JOptionPane.YES_OPTION) {
                        String idMinhasTarefasPausar = "" + jTableMinhasTarefas.getValueAt(jTableMinhasTarefas.getSelectedRow(), 0);

                        SimpleDateFormat formatadorData = new SimpleDateFormat("ddMMyyyy");
                        SimpleDateFormat formatadorHora = new SimpleDateFormat("KKmm");

                        pausastarefasmodel.setStatus_pausa(1);
                        pausastarefasmodel.setIdtarefapausa(Integer.parseInt(idMinhasTarefasPausar));
                        String data_pausa = formatadorData.format(System.currentTimeMillis());
                        String hora_pausa = formatadorHora.format(System.currentTimeMillis());
                        pausastarefasmodel.setData_pausa(data_pausa);
                        pausastarefasmodel.setHora_pausa(hora_pausa);
                        tarefasdao.pausarRetomarAtividade(pausastarefasmodel);
                        preencherTabelaMinhasTarefas("select * from tarefas where id_usuario_responsavel=" + sessaocontrol.getIdUsuarioLogado() + " and not concluido=2 order by dataprevistaencerramento desc");
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println("Não foi possivel selecionar a tarefa: \n" + ex);
        }
        conexaodb.desconexao();
    }//GEN-LAST:event_jTableMinhasTarefasMouseClicked


    private void jTableTodasTarefasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTodasTarefasMouseClicked
        jButtonVisualizarAtividadeQualquer.setEnabled(true);
    }//GEN-LAST:event_jTableTodasTarefasMouseClicked

    private void jButtonVisualizarAtividadeQualquerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarAtividadeQualquerActionPerformed
        String idMinhasTarefas = "" + jTableTodasTarefas.getValueAt(jTableTodasTarefas.getSelectedRow(), 0);

        VisualizarAtividadeView visualizaratividade = new VisualizarAtividadeView(idMinhasTarefas);

        if (visualizaratividade == null) {
            visualizaratividade = new VisualizarAtividadeView(idMinhasTarefas);
            visualizaratividade.setVisible(true);
            visualizaratividade.setResizable(false);
        } else {
            visualizaratividade.setVisible(true);
            visualizaratividade.setResizable(false);
        }
    }//GEN-LAST:event_jButtonVisualizarAtividadeQualquerActionPerformed

    private void jButtonPausarMinhasAtividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPausarMinhasAtividadesActionPerformed

        String idMinhasTarefasPausar = "" + jTableMinhasTarefas.getValueAt(jTableMinhasTarefas.getSelectedRow(), 0);

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
        preencherTabelaMinhasTarefas("select * from tarefas where id_usuario_responsavel=" + sessaocontrol.getIdUsuarioLogado() + " and not concluido=2 order by dataprevistaencerramento desc");

    }//GEN-LAST:event_jButtonPausarMinhasAtividadesActionPerformed

    private void jButtonVisualizarAtividadeMinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarAtividadeMinhaActionPerformed
        String idMinhasTarefas = "" + jTableMinhasTarefas.getValueAt(jTableMinhasTarefas.getSelectedRow(), 0);

        VisualizarAtividadeView visualizaratividade = new VisualizarAtividadeView(idMinhasTarefas);

        if (visualizaratividade == null) {
            visualizaratividade = new VisualizarAtividadeView(idMinhasTarefas);
            visualizaratividade.setVisible(true);
            visualizaratividade.setResizable(false);
        } else {
            visualizaratividade.setVisible(true);
            visualizaratividade.setResizable(false);
        }
    }//GEN-LAST:event_jButtonVisualizarAtividadeMinhaActionPerformed

    private void jButtonPausarConcluirAtividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPausarConcluirAtividadesActionPerformed

        String idMinhasTarefas = "" + jTableMinhasTarefas.getValueAt(jTableMinhasTarefas.getSelectedRow(), 0);
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
                String idMinhasTarefasPausar = "" + jTableMinhasTarefas.getValueAt(jTableMinhasTarefas.getSelectedRow(), 0);

                SimpleDateFormat formatadorData = new SimpleDateFormat("ddMMyyyy");
                SimpleDateFormat formatadorHora = new SimpleDateFormat("KKmm");

                pausastarefasmodel.setStatus_pausa(1);
                pausastarefasmodel.setIdtarefapausa(Integer.parseInt(idMinhasTarefasPausar));
                String data_pausa = formatadorData.format(System.currentTimeMillis());
                String hora_pausa = formatadorHora.format(System.currentTimeMillis());
                pausastarefasmodel.setData_pausa(data_pausa);
                pausastarefasmodel.setHora_pausa(hora_pausa);
                tarefasdao.pausarRetomarAtividade(pausastarefasmodel);
                preencherTabelaMinhasTarefas("select * from tarefas where id_usuario_responsavel=" + sessaocontrol.getIdUsuarioLogado() + " and not concluido=2 order by dataprevistaencerramento desc");
            }

        } catch (SQLException ex) {
            System.out.println("Não foi possivel selecionar a tarefa: \n" + ex);
        }
        conexaodb.desconexao();
        preencherTabelaMinhasTarefas("select * from tarefas where id_usuario_responsavel=" + sessaocontrol.getIdUsuarioLogado() + " and not concluido=2 order by dataprevistaencerramento desc");
    }//GEN-LAST:event_jButtonPausarConcluirAtividadesActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        AlterarSenhaView alterarsenha = new AlterarSenhaView(sessaocontrol.getIdUsuarioLogado());

        if (alterarsenha == null) {
            alterarsenha = new AlterarSenhaView();
            alterarsenha.setVisible(true);
            alterarsenha.setResizable(false);
        } else {
            alterarsenha.setVisible(true);
            alterarsenha.setResizable(false);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void preencherTabelaMinhasTarefas(String Sql) {

        ArrayList dados = new ArrayList();
        String[] coluna = new String[]{
            //"ID","Tarefa","Descrição","Data de Criação","Data Prevista de Encerramento","Tempo Estimado de Conclusão","Responsável","Criador","Concluída","Data de Conclusão"};
            "ID", "Tarefa", "Descrição", "Data", "Tempo", "Criador", "Status"};
        conexaodb.conexao();
        conexaodb.executasql(Sql);

        try {
            conexaodb.rs.first();

            do {

                //status
                String status = relatoriosdao.statusConcluidoCaracter(conexaodb.rs.getInt("concluido"));

                String dataPrevistaEncerramento = relatoriosdao.formatarData(conexaodb.rs.getString("dataprevistaencerramento").trim());
                dados.add(new Object[]{conexaodb.rs.getInt("id_tarefas"), conexaodb.rs.getString("tarefa").trim(), conexaodb.rs.getString("descricao").trim(), dataPrevistaEncerramento,
                    relatoriosdao.comboboxTempoDBparaUser(conexaodb.rs.getString("qttempoprevistoconclusao")).trim(), conexaodb.rs.getString("nomeusuariocriador").trim(), status});
            } while (conexaodb.rs.next());
        } catch (SQLException ex) {
            System.out.println("Tarefa(as) inexistente(s).");
        }

        TabelaModel tableMinhasTarefas = new TabelaModel(dados, coluna);
        jTableMinhasTarefas.setModel(tableMinhasTarefas);
        jTableMinhasTarefas.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTableMinhasTarefas.getColumnModel().getColumn(0).setResizable(false);
        jTableMinhasTarefas.getColumnModel().getColumn(1).setPreferredWidth(210);
        jTableMinhasTarefas.getColumnModel().getColumn(1).setResizable(false);
        jTableMinhasTarefas.getColumnModel().getColumn(2).setPreferredWidth(350);
        jTableMinhasTarefas.getColumnModel().getColumn(2).setResizable(true);
        jTableMinhasTarefas.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableMinhasTarefas.getColumnModel().getColumn(3).setResizable(false);
        jTableMinhasTarefas.getColumnModel().getColumn(4).setPreferredWidth(60);
        jTableMinhasTarefas.getColumnModel().getColumn(4).setResizable(false);
        jTableMinhasTarefas.getColumnModel().getColumn(5).setPreferredWidth(110);
        jTableMinhasTarefas.getColumnModel().getColumn(5).setResizable(false);
        jTableMinhasTarefas.getColumnModel().getColumn(6).setPreferredWidth(110);
        jTableMinhasTarefas.getColumnModel().getColumn(6).setResizable(false);
        jTableMinhasTarefas.getTableHeader().setReorderingAllowed(true);
        jTableMinhasTarefas.setAutoResizeMode(jTableMinhasTarefas.AUTO_RESIZE_OFF);
        jTableMinhasTarefas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        conexaodb.desconexao();
        jButtonPausarMinhasAtividades.setEnabled(!true);
        jButtonVisualizarAtividadeMinha.setEnabled(!true);
        jButtonPausarConcluirAtividades.setEnabled(!true);
    }

    private void preencherTabelaTodasTarefas(String Sql) {

        ArrayList dados = new ArrayList();
        String[] coluna = new String[]{
            //"ID","Tarefa","Descrição","Data de Criação","Data Prevista de Encerramento","Tempo Estimado de Conclusão","Responsável","Criador","Concluída","Data de Conclusão"};
            "ID", "Tarefa", "Descrição", "Data", "Tempo", "Responsável", "Status"};
        conexaodb.conexao();
        conexaodb.executasql(Sql);

        try {
            conexaodb.rs.first();

            do {

                //status
                String status = relatoriosdao.statusConcluidoCaracter(conexaodb.rs.getInt("concluido"));

                String dataPrevistaEncerramento = relatoriosdao.formatarData(conexaodb.rs.getString("dataprevistaencerramento").trim());
                String nomeResponsavelTarefa = tarefasdao.buscaResponsavelTarefaPeloID(conexaodb.rs.getInt("id_usuario_responsavel"));

                dados.add(new Object[]{conexaodb.rs.getInt("id_tarefas"), conexaodb.rs.getString("tarefa").trim(), conexaodb.rs.getString("descricao").trim(), dataPrevistaEncerramento,
                    relatoriosdao.comboboxTempoDBparaUser(conexaodb.rs.getString("qttempoprevistoconclusao").trim()), nomeResponsavelTarefa.trim(), status});
            } while (conexaodb.rs.next());
        } catch (SQLException ex) {
            System.out.println("Tarefa(as) inexistente(s).");
        }

        TabelaModel tableTodasTarefas = new TabelaModel(dados, coluna);
        jTableTodasTarefas.setModel(tableTodasTarefas);
        jTableTodasTarefas.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTableTodasTarefas.getColumnModel().getColumn(0).setResizable(false);
        jTableTodasTarefas.getColumnModel().getColumn(1).setPreferredWidth(210);
        jTableTodasTarefas.getColumnModel().getColumn(1).setResizable(false);
        jTableTodasTarefas.getColumnModel().getColumn(2).setPreferredWidth(350);
        jTableTodasTarefas.getColumnModel().getColumn(2).setResizable(true);
        jTableTodasTarefas.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableTodasTarefas.getColumnModel().getColumn(3).setResizable(false);
        jTableTodasTarefas.getColumnModel().getColumn(4).setPreferredWidth(60);
        jTableTodasTarefas.getColumnModel().getColumn(4).setResizable(false);
        jTableTodasTarefas.getColumnModel().getColumn(5).setPreferredWidth(110);
        jTableTodasTarefas.getColumnModel().getColumn(5).setResizable(false);
        jTableTodasTarefas.getColumnModel().getColumn(6).setPreferredWidth(110);
        jTableTodasTarefas.getColumnModel().getColumn(6).setResizable(false);
        jTableTodasTarefas.getTableHeader().setReorderingAllowed(true);
        jTableTodasTarefas.setAutoResizeMode(jTableMinhasTarefas.AUTO_RESIZE_OFF);
        jTableTodasTarefas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        conexaodb.desconexao();
        jButtonVisualizarAtividadeQualquer.setEnabled(!true);

    }

    public void preecherUsuariosComboBox() {
        conexaodb.conexao();

        try {
            conexaodb.executasql("select * from usuarios");
            conexaodb.rs.first();
            jComboBoxResponsavel.removeAllItems();
            do {
                jComboBoxResponsavel.addItem(conexaodb.rs.getString("nome").trim());
            } while (conexaodb.rs.next());

        } catch (SQLException ex) {
            System.out.println("Erro ao preencher jComboBox." + ex);
        }
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
            java.util.logging.Logger.getLogger(MainView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonCriarTarefa;
    private javax.swing.JButton jButtonLimparTarefa;
    private javax.swing.JButton jButtonPausarConcluirAtividades;
    private javax.swing.JButton jButtonPausarMinhasAtividades;
    private javax.swing.JButton jButtonVisualizarAtividadeMinha;
    private javax.swing.JButton jButtonVisualizarAtividadeQualquer;
    private javax.swing.JCheckBox jCheckBoxResponsavel;
    private javax.swing.JComboBox<String> jComboBoxResponsavel;
    private javax.swing.JComboBox<String> jComboBoxTempoAtividade;
    private com.toedter.calendar.JDateChooser jDateChooserDataEncerramento;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelDataEncerramento;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelResponsavel;
    private javax.swing.JLabel jLabelTarefa;
    private javax.swing.JLabel jLabelTempoAtividade;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelInternal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableMinhasTarefas;
    private javax.swing.JTable jTableTodasTarefas;
    private javax.swing.JTextArea jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldIdTarefaEditar;
    private javax.swing.JTextField jTextFieldTarefa;
    // End of variables declaration//GEN-END:variables
}
