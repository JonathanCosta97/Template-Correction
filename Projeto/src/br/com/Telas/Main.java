/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Telas;

import br.com.Modelos.Funcionario;

/**
 *
 * @author jonat
 */
public class Main extends javax.swing.JFrame {

    Funcionario funcionario = new Funcionario();
    private boolean userFuncionario = true;
    private boolean cadGabaritoOfic = true;
    public String tipoUsuario;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    public Main(String tipo) {
        initComponents();
        this.tipoUsuario = tipo;
        lbUsuario.setText(tipoUsuario);

        if (tipoUsuario.equals("Funcionario")) {
            lbCadFunc.enable(false);
            lbCadGab.enable(false);
            userFuncionario = true;
            cadGabaritoOfic = false;
            lbConsulFunc.enable(false);
            lbConsulGabOfci.enable(false);
            lbConsulAva.enable(false);
        }
        else{
            userFuncionario = false;
        }
    }

    public Main(Funcionario funcionario) {

        this.funcionario = funcionario;
        initComponents();
        this.tipoUsuario = funcionario.getNivelDeAcesso();
        lbUsuario.setText(tipoUsuario);

        if (funcionario.getNivelDeAcesso().equalsIgnoreCase("Funcionario") || tipoUsuario.equalsIgnoreCase("Funcionario")) {
            lbCadFunc.enable(false);
            lbCadGab.enable(false);
            userFuncionario = true;
            cadGabaritoOfic = false;
            lbConsulFunc.enable(false);
            lbConsulGabOfci.enable(false);
            lbConsulAva.enable(false);

        }else{
            userFuncionario = false;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbCadFunc = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbCadPArt = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbCadGab = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbCadAva = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbListaResult = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lbConsulFunc = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lbConsulPart = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lbConsulGabOfci = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lbConsulAva = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lbResultadosFinais = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCadFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/team (1).png"))); // NOI18N
        lbCadFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCadFuncMouseClicked(evt);
            }
        });
        jPanel4.add(lbCadFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 11, -1, 70));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(42, 44, 138));
        jLabel10.setText("Cadastrar Funcionario");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, -1, -1));

        jPanel9.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 138, 113));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCadPArt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/graduate.png"))); // NOI18N
        lbCadPArt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCadPArtMouseClicked(evt);
            }
        });
        jPanel5.add(lbCadPArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 70));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(42, 44, 138));
        jLabel11.setText("Cadastrar Participante");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, -1, -1));

        jPanel9.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 138, 113));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCadGab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/feedback.png"))); // NOI18N
        lbCadGab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCadGabMouseClicked(evt);
            }
        });
        jPanel7.add(lbCadGab, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 70));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(42, 44, 138));
        jLabel13.setText("Cadastrar Gabarito");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, -1));

        jPanel9.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 138, 113));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCadAva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/tick-box-with-a-check-mark.png"))); // NOI18N
        lbCadAva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCadAvaMouseClicked(evt);
            }
        });
        jPanel8.add(lbCadAva, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 80));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(42, 44, 138));
        jLabel14.setText("Cadastrar Avaliação");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, -1));

        jPanel9.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 138, 113));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbListaResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/list.png"))); // NOI18N
        lbListaResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListaResultMouseClicked(evt);
            }
        });
        jPanel3.add(lbListaResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 11, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(42, 44, 138));
        jLabel9.setText("Listar Resultados");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, -1));
        jLabel9.getAccessibleContext().setAccessibleName("Cadastrar Participante");

        jPanel9.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 138, 113));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 1, 76));
        jLabel24.setText("Usuário:");
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lbUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(0, 1, 76));
        lbUsuario.setText("??");
        jPanel9.add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 140, -1));

        jTabbedPane1.addTab("Cadastrar", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbConsulFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/consultar Funcionario.png"))); // NOI18N
        lbConsulFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbConsulFuncMouseClicked(evt);
            }
        });
        jPanel11.add(lbConsulFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 11, -1, 70));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(42, 44, 138));
        jLabel12.setText("Consultar Funcionario");
        jPanel11.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, -1, -1));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbConsulPart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/candidate.png"))); // NOI18N
        lbConsulPart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbConsulPartMouseClicked(evt);
            }
        });
        jPanel12.add(lbConsulPart, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 70));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(42, 44, 138));
        jLabel17.setText("Consultar Participante");
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, -1, -1));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbConsulGabOfci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/consulta gabarito.png"))); // NOI18N
        lbConsulGabOfci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbConsulGabOfciMouseClicked(evt);
            }
        });
        jPanel13.add(lbConsulGabOfci, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 70));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(42, 44, 138));
        jLabel19.setText("Consultar Gabarito");
        jPanel13.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, -1));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbConsulAva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/consulta Avaliacao.png"))); // NOI18N
        lbConsulAva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbConsulAvaMouseClicked(evt);
            }
        });
        jPanel14.add(lbConsulAva, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 80));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(42, 44, 138));
        jLabel21.setText("Consultar Avaliação");
        jPanel14.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, -1));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbResultadosFinais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/list.png"))); // NOI18N
        lbResultadosFinais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbResultadosFinaisMouseClicked(evt);
            }
        });
        jPanel15.add(lbResultadosFinais, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 11, -1, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(42, 44, 138));
        jLabel23.setText(" Resultados");
        jPanel15.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 70, 30));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Consultar", jPanel10);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 830, 360));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 1, 76));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/logo white.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("X");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 621, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(98, 98, 98))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/sign-out.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 830, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void lbCadFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadFuncMouseClicked
        if (!userFuncionario) {
            CadastroFuncionario cf = new CadastroFuncionario(tipoUsuario);
            cf.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_lbCadFuncMouseClicked

    private void lbCadPArtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadPArtMouseClicked
        CadastroParticipante cp = new CadastroParticipante(tipoUsuario);
        cp.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbCadPArtMouseClicked

    private void lbCadGabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadGabMouseClicked
        if (!userFuncionario) {
            CadastrarGabaritoOficial cg = new CadastrarGabaritoOficial(tipoUsuario);
            cg.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_lbCadGabMouseClicked

    private void lbCadAvaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadAvaMouseClicked
        PesquisarParticipantes pp = new PesquisarParticipantes(tipoUsuario);
        pp.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbCadAvaMouseClicked

    private void lbListaResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaResultMouseClicked
        
            ListarPorAnoCurso listAno = new ListarPorAnoCurso(tipoUsuario);
            listAno.setVisible(true);
            dispose();
        
        
    }//GEN-LAST:event_lbListaResultMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Login lg = new Login();
        lg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void lbConsulFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConsulFuncMouseClicked
        if (!userFuncionario) {
            ConsultarFuncionario conf = new ConsultarFuncionario(tipoUsuario);
            conf.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_lbConsulFuncMouseClicked

    private void lbConsulPartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConsulPartMouseClicked
        ConsultarParticipante conp = new ConsultarParticipante(tipoUsuario);
        conp.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbConsulPartMouseClicked

    private void lbConsulGabOfciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConsulGabOfciMouseClicked
        if (!userFuncionario) {
            ConsultarGabaritoOficial conOf = new ConsultarGabaritoOficial(tipoUsuario);
            conOf.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_lbConsulGabOfciMouseClicked

    private void lbConsulAvaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConsulAvaMouseClicked
        if (!userFuncionario) {
        ConsultarResultadoFinal conRF = new ConsultarResultadoFinal(tipoUsuario);
        conRF.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_lbConsulAvaMouseClicked

    private void lbResultadosFinaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbResultadosFinaisMouseClicked
       
        ListarPorAnoCurso listAno = new ListarPorAnoCurso(tipoUsuario);
        listAno.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_lbResultadosFinaisMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbCadAva;
    private javax.swing.JLabel lbCadFunc;
    private javax.swing.JLabel lbCadGab;
    private javax.swing.JLabel lbCadPArt;
    private javax.swing.JLabel lbConsulAva;
    private javax.swing.JLabel lbConsulFunc;
    private javax.swing.JLabel lbConsulGabOfci;
    private javax.swing.JLabel lbConsulPart;
    private javax.swing.JLabel lbListaResult;
    private javax.swing.JLabel lbResultadosFinais;
    private javax.swing.JLabel lbUsuario;
    // End of variables declaration//GEN-END:variables
}