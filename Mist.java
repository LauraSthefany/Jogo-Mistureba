package mistureba;

//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laure
 */
public class Mist extends javax.swing.JPanel {
    Janela j;
    
    //List <String> listaDeString;
    int pontuacao;
    Map<String,Boolean> palavra;
    
    public Mist(Janela j) {
      initComponents();
      this.j=j;
      
    }
    
    
    public void eeeee()  {
        /*listaDeString = new ArrayList<>();


      listaDeString.add("BOMBACHA");
      listaDeString.add("BOLACHA");
      listaDeString.add("BOLA");
      listaDeString.add("BOMBEIRO");
      listaDeString.add("BOMBOM");*/
      palavra = new HashMap<>();
      
      String[] palavras = j.jogo.getMistureba().getPalavras();
      
        for (int i = 0; i < palavras.length ; i++) {
            
            palavra.put(palavras[i], Boolean.FALSE);
            
        }
            /*
            palavra.put("BOMBA", Boolean.FALSE);
            palavra.put("BOMBACHA", Boolean.FALSE);
            palavra.put("BOLA", Boolean.FALSE);
            palavra.put("BOMBEIRO", Boolean.FALSE);
            palavra.put("BOMBOM", Boolean.FALSE);
            palavra.put("BACIA", Boolean.FALSE);
            palavra.put("BOLACHA", Boolean.FALSE);
            palavra.put("BEISEBOL", Boolean.FALSE);
            palavra.put("ROCHA", Boolean.FALSE);
            palavra.put("BASE", Boolean.FALSE);
            */
      pontuacao = 0;
      
      if (j.jogo instanceof JogoI){
          botaoteste.setText("TEST");
          finaliza.setText("FINISH");
      }
      else{
          finaliza.setText("FINALIZAR");
      }
      
      String[] silabas = j.jogo.getMistureba().getSilabas();
      
      botao00.setText(silabas[0]);
      botao01.setText(silabas[1]);
      botao02.setText(silabas[2]);
      
      botao10.setText(silabas[3]);
      botao11.setText(silabas[4]);
      botao12.setText(silabas[5]);
      
      botao20.setText(silabas[6]);
      botao21.setText(silabas[7]);
      botao22.setText(silabas[8]);
      
    }
    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jTextField2 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botao00 = new javax.swing.JButton();
        botao21 = new javax.swing.JButton();
        botao01 = new javax.swing.JButton();
        botao02 = new javax.swing.JButton();
        botao20 = new javax.swing.JButton();
        botao11 = new javax.swing.JButton();
        botao10 = new javax.swing.JButton();
        botao22 = new javax.swing.JButton();
        botao12 = new javax.swing.JButton();
        caixa = new javax.swing.JTextField();
        botaoteste = new javax.swing.JButton();
        pontos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        achadas = new javax.swing.JTextArea();
        finaliza = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextPane2.setBackground(new java.awt.Color(240, 240, 240));
        jTextPane2.setBorder(null);
        jTextPane2.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jTextPane2.setCaretColor(new java.awt.Color(240, 240, 240));
        jTextPane2.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        jScrollPane2.setViewportView(jTextPane2);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTextField2.setText("jTextField2");

        jButton10.setBackground(new java.awt.Color(117, 209, 172));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton10.setText("Testar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\laure\\Downloads\\tit.png")); // NOI18N

        botao00.setBackground(new java.awt.Color(255, 255, 255));
        botao00.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botao00.setText("BOM");
        botao00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao00ActionPerformed(evt);
            }
        });

        botao21.setBackground(new java.awt.Color(255, 255, 255));
        botao21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botao21.setText("A");
        botao21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao21ActionPerformed(evt);
            }
        });

        botao01.setBackground(new java.awt.Color(255, 255, 255));
        botao01.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botao01.setText("CHA");
        botao01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao01ActionPerformed(evt);
            }
        });

        botao02.setBackground(new java.awt.Color(255, 255, 255));
        botao02.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botao02.setText("RO");
        botao02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao02ActionPerformed(evt);
            }
        });

        botao20.setBackground(new java.awt.Color(255, 255, 255));
        botao20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botao20.setText("BOL");
        botao20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao20ActionPerformed(evt);
            }
        });

        botao11.setBackground(new java.awt.Color(255, 255, 255));
        botao11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botao11.setText("BA");
        botao11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao11ActionPerformed(evt);
            }
        });

        botao10.setBackground(new java.awt.Color(255, 255, 255));
        botao10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botao10.setText("SE");
        botao10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao10ActionPerformed(evt);
            }
        });

        botao22.setBackground(new java.awt.Color(255, 255, 255));
        botao22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botao22.setText("CIA");
        botao22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao22ActionPerformed(evt);
            }
        });

        botao12.setBackground(new java.awt.Color(255, 255, 255));
        botao12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botao12.setText("BEI");
        botao12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao12ActionPerformed(evt);
            }
        });

        caixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaActionPerformed(evt);
            }
        });

        botaoteste.setBackground(new java.awt.Color(153, 204, 255));
        botaoteste.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoteste.setText("TESTAR");
        botaoteste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaotesteActionPerformed(evt);
            }
        });

        pontos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pontos.setText("0 ");
        pontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontosActionPerformed(evt);
            }
        });

        achadas.setColumns(20);
        achadas.setRows(5);
        jScrollPane1.setViewportView(achadas);

        finaliza.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        finaliza.setText("jButton1");
        finaliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(pontos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(finaliza)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(caixa, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoteste, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botao00, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao01, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao02, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(botao20, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botao10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(botao11, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                            .addComponent(botao21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botao12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botao22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caixa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoteste, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao02, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao01, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao00, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao20, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao21, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao22, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(finaliza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pontos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
        );

        jLabel1.getAccessibleContext().setAccessibleName("Mistureba");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botao01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao01ActionPerformed
        // TODO add your handling code here:
        String silaba = botao01.getText();
        caixa.setText(caixa.getText()+silaba);
    }//GEN-LAST:event_botao01ActionPerformed

    private void botao00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao00ActionPerformed
        // TODO add your handling code here:
        String silaba = botao00.getText();
        caixa.setText(caixa.getText()+silaba);
//        botao00.setEnabled(false);
    }//GEN-LAST:event_botao00ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void botao12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao12ActionPerformed
        // TODO add your handling code here:
        String silaba = botao12.getText();
        caixa.setText(caixa.getText()+silaba);
    }//GEN-LAST:event_botao12ActionPerformed

    private void botao20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao20ActionPerformed
        // TODO add your handling code here:
        String silaba = botao20.getText();
        caixa.setText(caixa.getText()+silaba);
    }//GEN-LAST:event_botao20ActionPerformed

    private void botao02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao02ActionPerformed
        // TODO add your handling code here:
        String silaba = botao02.getText();
        caixa.setText(caixa.getText()+silaba);
    }//GEN-LAST:event_botao02ActionPerformed

    private void botao10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao10ActionPerformed
        // TODO add your handling code here:
        String silaba = botao10.getText();
        caixa.setText(caixa.getText()+silaba);
    }//GEN-LAST:event_botao10ActionPerformed

    private void botao11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao11ActionPerformed
        // TODO add your handling code here:
        String silaba = botao11.getText();
        caixa.setText(caixa.getText()+silaba);
    }//GEN-LAST:event_botao11ActionPerformed

    private void botao21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao21ActionPerformed
        // TODO add your handling code here:
        String silaba = botao21.getText();
        caixa.setText(caixa.getText()+silaba);
    }//GEN-LAST:event_botao21ActionPerformed

    private void botao22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao22ActionPerformed
        // TODO add your handling code here:
        String silaba = botao22.getText();
        caixa.setText(caixa.getText()+silaba);
    }//GEN-LAST:event_botao22ActionPerformed

    private void caixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaActionPerformed

    private void botaotesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaotesteActionPerformed
        // TODO add your handling code here:
        String tentativa = caixa.getText(); 
        //implemente com laco, pra aprender
        /*if (listaDeString.contains(tentativa)){
            caixa.setText("");
            pontuacao= pontuacao +1 ;
            pontos.setText(pontuacao+" pontos");
        }
        */
        //for (String resposta : palavra.keySet())
        //{
            caixa.setText("");
            if (palavra.containsKey (tentativa))
            {
                if (!palavra.get(tentativa)){
                    palavra.put(tentativa,Boolean.TRUE);
                    achadas.setText(achadas.getText()+tentativa+"\n");
                    caixa.setText("");
                    pontuacao= pontuacao +1 ;
                    pontos.setText(pontuacao+" pontos");
                    if (pontuacao==10){
                        JOptionPane.showMessageDialog(this,"Parab??ns!\nVoc?? venceu!");
                    }
                }
            }
            else
            {
                caixa.setText("");
            }
        //}
    }//GEN-LAST:event_botaotesteActionPerformed

    private void pontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_pontosActionPerformed

    private void finalizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizaActionPerformed
        try{
                FileWriter arq = new FileWriter("C:\\arquivo.txt");
                    PrintWriter gravarArq = new PrintWriter(arq);
                    gravarArq.printf("Rank:");
                    gravarArq.printf(j.jogo.nome+"="+pontuacao+"/10");
                    arq.close();
        }catch(Exception e){}
    }//GEN-LAST:event_finalizaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea achadas;
    private javax.swing.JButton botao00;
    private javax.swing.JButton botao01;
    private javax.swing.JButton botao02;
    private javax.swing.JButton botao10;
    private javax.swing.JButton botao11;
    private javax.swing.JButton botao12;
    private javax.swing.JButton botao20;
    private javax.swing.JButton botao21;
    private javax.swing.JButton botao22;
    private javax.swing.JButton botaoteste;
    public javax.swing.JTextField caixa;
    private javax.swing.JButton finaliza;
    private javax.swing.JButton jButton10;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane2;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JTextField pontos;
    // End of variables declaration//GEN-END:variables
}
