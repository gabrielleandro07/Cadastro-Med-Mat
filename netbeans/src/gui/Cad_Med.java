/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dados.Med;
import dao.Conexao;
import dao.Med_DAO;
import javax.swing.JOptionPane;

/**
 *
 * @author 276970
 */
public class Cad_Med extends javax.swing.JFrame {    
    private Med medicamento = null;
    private Med_DAO medicamentoDAO = new Med_DAO();

    int codigo = 0;
    /**
     * Creates new form Cad_Mat
     */
   
    public Cad_Med() throws ClassNotFoundException, Exception {
        initComponents();

        codigo = medicamentoDAO.recuperarcodigo().getCodigo();        

        txt_codigo.setText(String.valueOf(codigo));        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        valor = new javax.swing.JTextField();
        quantidade = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        txt_codigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código");

        jLabel2.setText("Nome");

        jLabel3.setText("Quantidade");

        jLabel4.setText("Valor");

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });
        valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorKeyTyped(evt);
            }
        });

        quantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10000000, 1));
        quantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantidadeKeyTyped(evt);
            }
        });

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_codigo.setEnabled(false);
        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(txt_codigo)
                            .addComponent(valor)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton1)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorActionPerformed

    private void quantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidadeKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (validarForm()) {        
            medicamento = new Med();
            medicamento.setNome(nome.getText().trim());
            medicamento.setQuantidade((int) quantidade.getValue());
            medicamento.setValor(Double.parseDouble(valor.getText()));
            
            try {
                medicamentoDAO.inserir(medicamento);

                JOptionPane.showMessageDialog(this,"Dados Inseridos com sucesso");

                codigo = codigo + 1; 

                txt_codigo.setText(String.valueOf(codigo));
                valor.setText("");
                nome.setText("");
                quantidade.setValue(1);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao inserir o produto.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }          
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorKeyTyped
        // TODO add your handling code here:
        // definindo quais caracteres podem ser digitados pelo usuário 
        String caracteres="0987654321.";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_valorKeyTyped

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoKeyTyped

    private boolean validarForm() {
        
        // verificando se os campos estão preenchidos
        if (nome.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha o campo Nome.", "Alerta", JOptionPane.WARNING_MESSAGE);
            nome.requestFocus();
            return false;
        }
        
        if (valor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe um valor para o produto.", "Alerta", JOptionPane.WARNING_MESSAGE);
            valor.requestFocus();
            return false;
        }
        
        // campo JSpinner
        if (((int) quantidade.getValue())  <= 0) {
            JOptionPane.showMessageDialog(this, "Quantidade de produto inválida", "Alerta", JOptionPane.WARNING_MESSAGE);
            quantidade.requestFocus();
            return false;
        }
        
        // campo quantidade não precisa verificar pois por padrão já inicia com 1

        // validadndo os dados preenchidos pelos usúarios
        
        // campo JTextField
        if (nome.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "Nome do produto inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            nome.requestFocus();
            return false;
        }

        // campo JFormattedTextField        
        if (Double.parseDouble(valor.getText()) <= 0) {             
            JOptionPane.showMessageDialog(this, "Preço inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            valor.requestFocus();
            return false;
        }

        // campo JSpinner
        if (((int) quantidade.getValue())  <= 0) {
            JOptionPane.showMessageDialog(this, "Quantidade de produto inválida", "Alerta", JOptionPane.WARNING_MESSAGE);
            quantidade.requestFocus();
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {  
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nome;
    private javax.swing.JSpinner quantidade;
    public javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}