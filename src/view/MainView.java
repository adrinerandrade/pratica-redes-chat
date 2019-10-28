/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.GameCommand;
import model.Message;
import model.User;
import service.LarcService;

/**
 *
 * @author ctomazoni
 */
public class MainView extends javax.swing.JFrame {

    LarcService larcService;
    
    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        larcService = new LarcService();
        larcService.sendGame(GameCommand.ENTER);
        new Thread(atualizar).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dsMensagens = new javax.swing.JTextArea();
        mensagem = new javax.swing.JTextField();
        enviarMsgSelec = new javax.swing.JButton();
        enviarMsgTodos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        listCartasEu = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listCartasOponente = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btJogar = new javax.swing.JButton();
        btPedir = new javax.swing.JButton();
        btParar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dsMensagens.setColumns(20);
        dsMensagens.setRows(5);
        dsMensagens.setEnabled(false);
        jScrollPane1.setViewportView(dsMensagens);

        enviarMsgSelec.setText("Enviar mensagem para usuário selecionado");
        enviarMsgSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarMsgSelecActionPerformed(evt);
            }
        });

        enviarMsgTodos.setText("Enviar mensagem para todos os usuários");
        enviarMsgTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarMsgTodosActionPerformed(evt);
            }
        });

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Vitórias", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableUser);

        jScrollPane2.setViewportView(listCartasEu);

        jScrollPane4.setViewportView(listCartasOponente);

        jLabel1.setText("Eu");

        jLabel2.setText("Oponente");

        btJogar.setText("Jogar");
        btJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJogarActionPerformed(evt);
            }
        });

        btPedir.setText("Pedir");
        btPedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPedirActionPerformed(evt);
            }
        });

        btParar.setText("Parar");
        btParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mensagem)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btParar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPedir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enviarMsgSelec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enviarMsgTodos))
                    .addComponent(jScrollPane1))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btJogar)
                            .addComponent(btPedir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btParar))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enviarMsgSelec, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(enviarMsgTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarMsgTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarMsgTodosActionPerformed
        larcService.sendMessage(0, mensagem.getText());
    }//GEN-LAST:event_enviarMsgTodosActionPerformed

    private void enviarMsgSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarMsgSelecActionPerformed
        if (tableUser.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione algum usuário!");
        } else if (tableUser.getSelectedRowCount() == 1) {
            larcService.sendMessage((Integer) tableUser.getValueAt(tableUser.getSelectedRow(), 0), mensagem.getText());
        } else if (tableUser.getSelectedRowCount() > 1) {
            JOptionPane.showMessageDialog(null, "Selecione apenas um usuário!");
        }
    }//GEN-LAST:event_enviarMsgSelecActionPerformed

    private void btPedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPedirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPedirActionPerformed

    private void btJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJogarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btJogarActionPerformed

    private void btPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPararActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPararActionPerformed

    Runnable atualizar = new Runnable() {
        public void run() {
            DefaultTableModel modelUser = (DefaultTableModel) tableUser.getModel();
            while (true) {
                modelUser.setRowCount(0);
                larcService.getUsers().ifSuccess(users -> {
                    for (User user : users) {
                        modelUser.addRow(new Object [] {
                            user.getId(), user.getName(), user.getWinCount()
                        });
                    }
                });
                /*DefaultTableModel modelPlayer = new DefaultTableModel();
                larcService.getPlayers().ifSuccess(players -> {
                    for (Player player : players) {
                        //modelPlayer.addRow(player.getUserId());
                    }
                });
                tablePlayer.setModel(modelPlayer);*/
                larcService.getMessage().ifSuccess(message -> {
                    Optional<Message> msg = message;
                    dsMensagens.append(msg.toString()+"\n");
                });
                /*larcService.getCard()
                    .ifSuccess(System.out::println);*/
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btJogar;
    private javax.swing.JButton btParar;
    private javax.swing.JButton btPedir;
    private javax.swing.JTextArea dsMensagens;
    private javax.swing.JButton enviarMsgSelec;
    private javax.swing.JButton enviarMsgTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> listCartasEu;
    private javax.swing.JList<String> listCartasOponente;
    private javax.swing.JTextField mensagem;
    private javax.swing.JTable tableUser;
    // End of variables declaration//GEN-END:variables
}