/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unesa.view;

import javax.persistence.EntityManagerFactory;
import br.com.unesa.control.ControlePessoa;
import br.com.unesa.model.Pessoa;
import br.com.unesa.model.Professor;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 * @author Jonas Silva Carvalho<jonasloop1@gmail.com>
 * @author Gabriel Henrique Santos Marques<gabrielmarques142@gmail.com>
 * @author Marlon Ribeiro da Silva<marlonribeirodasilva@outlook.com.br>
 * @brief
 * @date 20/11/2020.
 */
public class Interface extends javax.swing.JFrame {

    ControlePessoa controle = new ControlePessoa();
    Pessoa pessoa = new Pessoa();
    Professor professor = new Professor();

    /**
     * Creates new form Interface
     */
    public Interface() {
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

        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ButtonCadastrarProfessor = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        ButtonEditarProfessor = new javax.swing.JButton();
        ButtonExcluirProfessor = new javax.swing.JButton();
        ButtonConsultarIdAluno = new javax.swing.JButton();
        ButtonCadastrarAluno = new javax.swing.JButton();
        ButtonEditarAluno = new javax.swing.JButton();
        ButtonExcluirAluno = new javax.swing.JButton();
        ButtonColsutarIdProfessor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CaixaNomeAluno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CaixaNomeProfessor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CaixaIdadeProfessor = new javax.swing.JTextField();
        CaixaCpfProfessor = new javax.swing.JTextField();
        CaixaEmailProfessor = new javax.swing.JTextField();
        CaixaTurnoProfessor = new javax.swing.JTextField();
        CaixaIdadeAluno = new javax.swing.JTextField();
        CaixaCpfAluno = new javax.swing.JTextField();
        CaixaEmailAluno = new javax.swing.JTextField();
        CaixaTurnoAluno = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        CaixaMateriaProfessor = new javax.swing.JTextField();
        CaixaCursoAluno = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        CaixaDependenciaAluno = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        CaixaSalarioProfessor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setFont(new java.awt.Font("Castellar", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 153, 0));
        jLabel11.setText(" INSTITUIÇÃO X");

        jLabel12.setFont(new java.awt.Font("Castellar", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 153, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("PROFESSORES");

        jLabel13.setFont(new java.awt.Font("Castellar", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 153, 0));
        jLabel13.setText("ALUNOS");

        ButtonCadastrarProfessor.setText("Cadastrar");
        ButtonCadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarProfessorActionPerformed(evt);
            }
        });

        ButtonEditarProfessor.setText("Editar");
        ButtonEditarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarProfessorActionPerformed(evt);
            }
        });

        ButtonExcluirProfessor.setText("Excluir");
        ButtonExcluirProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirProfessorActionPerformed(evt);
            }
        });

        ButtonConsultarIdAluno.setText("Consultar ID");

        ButtonCadastrarAluno.setText("Cadastrar");

        ButtonEditarAluno.setText("Editar");

        ButtonExcluirAluno.setText("Excluir");

        ButtonColsutarIdProfessor.setText("Consultar ID");
        ButtonColsutarIdProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonColsutarIdProfessorActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Idade:");

        jLabel4.setText("Idade:");

        jLabel5.setText("CPF:");

        jLabel6.setText("CPF:");

        jLabel7.setText("E-mail:");

        jLabel8.setText("E-mail:");

        jLabel9.setText("Turno:");

        jLabel10.setText("Turno:");

        jLabel14.setText("Curso:");

        jLabel15.setText("Matéria:");

        jLabel16.setText("Possui depêndencia?");

        jLabel17.setText("Salário:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(111, 111, 111))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CaixaEmailProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel17))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CaixaTurnoProfessor)
                                            .addComponent(CaixaMateriaProfessor)
                                            .addComponent(CaixaSalarioProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CaixaCpfProfessor))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(CaixaNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(CaixaIdadeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(CaixaDependenciaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel14)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(CaixaEmailAluno)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(CaixaCpfAluno, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(CaixaIdadeAluno))
                                                    .addGap(1, 1, 1))
                                                .addComponent(CaixaTurnoAluno)
                                                .addComponent(CaixaCursoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(CaixaNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonCadastrarProfessor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonEditarProfessor)
                                .addGap(10, 10, 10)
                                .addComponent(ButtonExcluirProfessor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonColsutarIdProfessor)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonCadastrarAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonEditarAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonExcluirAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonConsultarIdAluno)
                                .addGap(8, 8, 8))
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CaixaNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CaixaIdadeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CaixaCpfProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CaixaEmailProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CaixaTurnoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(CaixaMateriaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(CaixaSalarioProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCadastrarProfessor)
                    .addComponent(ButtonEditarProfessor)
                    .addComponent(ButtonExcluirProfessor)
                    .addComponent(ButtonColsutarIdProfessor))
                .addGap(16, 16, 16)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CaixaNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CaixaIdadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CaixaCpfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CaixaEmailAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(CaixaTurnoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(CaixaCursoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(CaixaDependenciaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCadastrarAluno)
                    .addComponent(ButtonEditarAluno)
                    .addComponent(ButtonExcluirAluno)
                    .addComponent(ButtonConsultarIdAluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarProfessorActionPerformed

        professor.setNome(CaixaNomeProfessor.getText());
        pessoa.setCpf(CaixaCpfProfessor.getText());
        pessoa.setIdade(CaixaIdadeProfessor.getText());
        pessoa.setEmail(CaixaEmailProfessor.getText());
        pessoa.setTurno(CaixaTurnoProfessor.getText());
        professor.setDisciplina(CaixaMateriaProfessor.getText());
        professor.setSalario(CaixaSalarioProfessor.getText());
        controle.inserir(pessoa);

        JOptionPane.showMessageDialog(rootPane, "Professor  Cadastrado com sucesso!");

        CaixaNomeProfessor.setText("");
        CaixaCpfProfessor.setText("");
        CaixaIdadeProfessor.setText("");
        CaixaEmailProfessor.setText("");
        CaixaTurnoProfessor.setText("");
        CaixaMateriaProfessor.setText("");
        CaixaSalarioProfessor.setText("");

    }//GEN-LAST:event_ButtonCadastrarProfessorActionPerformed

    private void ButtonEditarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarProfessorActionPerformed

        pessoa.setNome(CaixaNomeProfessor.getText());
        pessoa.setCpf(CaixaCpfProfessor.getText());
        pessoa.setIdade(CaixaIdadeProfessor.getText());
        pessoa.setEmail(CaixaEmailProfessor.getText());
        pessoa.setTurno(CaixaTurnoProfessor.getText());
        professor.setDisciplina(CaixaMateriaProfessor.getText());
        professor.setSalario(CaixaSalarioProfessor.getText());
        controle.inserir(pessoa);

        JOptionPane.showMessageDialog(rootPane, "Alteração feita com sucesso!");

        CaixaNomeProfessor.setText("");
        CaixaCpfProfessor.setText("");
        CaixaIdadeProfessor.setText("");
        CaixaEmailProfessor.setText("");
        CaixaTurnoProfessor.setText("");
        CaixaMateriaProfessor.setText("");
        CaixaSalarioProfessor.setText("");

    }//GEN-LAST:event_ButtonEditarProfessorActionPerformed

    private void ButtonExcluirProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirProfessorActionPerformed

        professor.setNome(CaixaNomeProfessor.getText());
        professor.setCpf(CaixaCpfProfessor.getText());
        professor.setIdade(CaixaIdadeProfessor.getText());
        professor.setEmail(CaixaEmailProfessor.getText());
        professor.setTurno(CaixaTurnoProfessor.getText());
        professor.setDisciplina(CaixaMateriaProfessor.getText());
        professor.setSalario(CaixaSalarioProfessor.getText());
        controle.entityManager.remove(professor);


    }//GEN-LAST:event_ButtonExcluirProfessorActionPerformed

    private void ButtonColsutarIdProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonColsutarIdProfessorActionPerformed
        /**
         * Consulta o pessoa pelo ID.
         *
         * @param id
         * @return o objeto Pessoa.
         */

        EntityManager entityManager = getEntityManager();
        Pessoa pessoa = null;
        try {

            pessoa = entityManager.find(Pessoa.class, id);
        } finally {
            entityManager.close();
        }


    }//GEN-LAST:event_ButtonColsutarIdProfessorActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCadastrarAluno;
    private javax.swing.JButton ButtonCadastrarProfessor;
    private javax.swing.JButton ButtonColsutarIdProfessor;
    private javax.swing.JButton ButtonConsultarIdAluno;
    private javax.swing.JButton ButtonEditarAluno;
    private javax.swing.JButton ButtonEditarProfessor;
    private javax.swing.JButton ButtonExcluirAluno;
    private javax.swing.JButton ButtonExcluirProfessor;
    private javax.swing.JTextField CaixaCpfAluno;
    private javax.swing.JTextField CaixaCpfProfessor;
    private javax.swing.JTextField CaixaCursoAluno;
    private javax.swing.JTextField CaixaDependenciaAluno;
    private javax.swing.JTextField CaixaEmailAluno;
    private javax.swing.JTextField CaixaEmailProfessor;
    private javax.swing.JTextField CaixaIdadeAluno;
    private javax.swing.JTextField CaixaIdadeProfessor;
    private javax.swing.JTextField CaixaMateriaProfessor;
    private javax.swing.JTextField CaixaNomeAluno;
    private javax.swing.JTextField CaixaNomeProfessor;
    private javax.swing.JTextField CaixaSalarioProfessor;
    private javax.swing.JTextField CaixaTurnoAluno;
    private javax.swing.JTextField CaixaTurnoProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
