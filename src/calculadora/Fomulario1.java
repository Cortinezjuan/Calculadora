/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Juanjo
 */
public class Fomulario1 extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Fomulario1
     */
    public Fomulario1() {
        initComponents();
        
        this.jB_Suma.addActionListener(this);
        this.jB_Resta.addActionListener(this);
        this.jBReset.addActionListener(this);
        this.jBpotencia.addActionListener(this);
        this.jBporcentaje.addActionListener(this);
        this.jBraiz.addActionListener(this);
        this.jB_multiplicacion.addActionListener(this);
        this.jBdivision.addActionListener(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jL1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jT1 = new javax.swing.JTextField();
        jT2 = new javax.swing.JTextField();
        jB_Suma = new javax.swing.JButton();
        jB_Resta = new javax.swing.JButton();
        jT_Resul = new javax.swing.JTextField();
        jL3 = new javax.swing.JLabel();
        jB_multiplicacion = new javax.swing.JButton();
        jBReset = new javax.swing.JButton();
        jBdivision = new javax.swing.JButton();
        jBpotencia = new javax.swing.JButton();
        jBraiz = new javax.swing.JButton();
        jBporcentaje = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 60));

        jP1.setBackground(new java.awt.Color(0, 51, 51));
        jP1.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Castellar", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CALCULADORA");

        jL1.setBackground(new java.awt.Color(255, 255, 255));
        jL1.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        jL1.setForeground(new java.awt.Color(0, 0, 0));
        jL1.setText("Ingrese 1?? Numero:");

        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese 2?? Numero:");

        jB_Suma.setBackground(new java.awt.Color(0, 153, 0));
        jB_Suma.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 0, 18)); // NOI18N
        jB_Suma.setForeground(new java.awt.Color(0, 0, 0));
        jB_Suma.setText("+");

        jB_Resta.setBackground(new java.awt.Color(0, 153, 0));
        jB_Resta.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 0, 18)); // NOI18N
        jB_Resta.setForeground(new java.awt.Color(0, 0, 0));
        jB_Resta.setText("-");

        jT_Resul.setBackground(new java.awt.Color(255, 51, 51));
        jT_Resul.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jT_Resul.setForeground(new java.awt.Color(0, 0, 0));
        jT_Resul.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jT_Resul.setCaretColor(new java.awt.Color(0, 0, 0));
        jT_Resul.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jT_Resul.setEnabled(false);

        jL3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL3.setForeground(new java.awt.Color(153, 255, 255));
        jL3.setText("Resultado:");

        jB_multiplicacion.setBackground(new java.awt.Color(0, 153, 0));
        jB_multiplicacion.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 0, 18)); // NOI18N
        jB_multiplicacion.setForeground(new java.awt.Color(0, 0, 0));
        jB_multiplicacion.setText("*");

        jBReset.setBackground(new java.awt.Color(0, 153, 153));
        jBReset.setText("Reset");

        jBdivision.setBackground(new java.awt.Color(0, 153, 0));
        jBdivision.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 0, 18)); // NOI18N
        jBdivision.setForeground(new java.awt.Color(0, 0, 0));
        jBdivision.setText("/");

        jBpotencia.setBackground(new java.awt.Color(0, 153, 0));
        jBpotencia.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 0, 18)); // NOI18N
        jBpotencia.setForeground(new java.awt.Color(0, 0, 0));
        jBpotencia.setText("^");

        jBraiz.setBackground(new java.awt.Color(0, 153, 0));
        jBraiz.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 0, 18)); // NOI18N
        jBraiz.setForeground(new java.awt.Color(0, 0, 0));
        jBraiz.setText("sqrt");

        jBporcentaje.setBackground(new java.awt.Color(0, 153, 0));
        jBporcentaje.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 0, 18)); // NOI18N
        jBporcentaje.setForeground(new java.awt.Color(0, 0, 0));
        jBporcentaje.setText("%");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/files/Sin t??tulo.png"))); // NOI18N

        javax.swing.GroupLayout jP1Layout = new javax.swing.GroupLayout(jP1);
        jP1.setLayout(jP1Layout);
        jP1Layout.setHorizontalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jT1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
            .addGroup(jP1Layout.createSequentialGroup()
                .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBraiz))
                            .addGroup(jP1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jBdivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP1Layout.createSequentialGroup()
                                .addComponent(jBpotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jBporcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jL3)
                        .addGap(77, 77, 77))
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jP1Layout.createSequentialGroup()
                                .addComponent(jB_Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jB_Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jB_multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jT_Resul, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)))
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
            .addGroup(jP1Layout.createSequentialGroup()
                .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP1Layout.setVerticalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jL1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jB_Suma)
                            .addComponent(jB_Resta)
                            .addComponent(jB_multiplicacion))
                        .addGap(27, 27, 27)
                        .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBdivision, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBpotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBporcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBraiz, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBReset, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jL3)
                        .addGap(18, 18, 18)
                        .addComponent(jT_Resul, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Fomulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fomulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fomulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fomulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fomulario1().setVisible(true);
            }
        });
    }
    
    public boolean ValidaDato(String a){
        try{
           Double.parseDouble(a);
           return true;
        }catch(NumberFormatException nfe){
            return false;
        }
    }
    
    public double Suma(double a, double b){
        return a+b;
    }
    
    public double Resta(double a, double b){
        return a-b;
    }
    public double Multiplicacion(double a, double b){
        return a*b;
    }
    public double Potencia(double a, double b){
        return Math.pow(a, b);
    }
    public double RaizCuadrada(double a){
        return Math.sqrt(a);
    }
    public double Porcentaje(double a, double b){
        return a*b/100;
    }
    
    public double Division(double a, double b){
        if(b == 0){
           return -1;
        }else{
           return a/b; 
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(ValidaDato(this.jT1.getText()) && ValidaDato(this.jT2.getText())){
         if(e.getSource().equals(jB_Suma)){
            this.jT_Resul.setText(String.valueOf(Suma(Double.parseDouble(this.jT1.getText()), Double.parseDouble(this.jT2.getText()))));
         }
         else if(e.getSource().equals(jB_Resta)){
            this.jT_Resul.setText(String.valueOf(Resta(Double.parseDouble(this.jT1.getText()), Double.parseDouble(this.jT2.getText()))));   
         }
         else if(e.getSource().equals(jBReset)){
            this.jT_Resul.setText("");  
            this.jT1.setText(""); 
            this.jT2.setText(""); 
         }
         else if(e.getSource().equals(jB_multiplicacion)){
             this.jT_Resul.setText(String.valueOf(Multiplicacion(Double.parseDouble(this.jT1.getText()), Double.parseDouble(this.jT2.getText()))));
         }
         else if(e.getSource().equals(jBdivision)){
             this.jT_Resul.setText(String.valueOf(Division(Double.parseDouble(this.jT1.getText()), Double.parseDouble(this.jT2.getText()))));
         }
         else if(e.getSource().equals(jBpotencia)){
             this.jT_Resul.setText(String.valueOf(Potencia(Double.parseDouble(this.jT1.getText()), Double.parseDouble(this.jT2.getText()))));
         }
         else if(e.getSource().equals(jBraiz)){
             this.jT_Resul.setText(String.valueOf(RaizCuadrada(Double.parseDouble(this.jT1.getText()))));
         }
         else if(e.getSource().equals(jBporcentaje)){
             this.jT_Resul.setText(String.valueOf(Porcentaje(Double.parseDouble(this.jT1.getText()), Double.parseDouble(this.jT2.getText()))));
         }
      }
      else{
           JOptionPane.showMessageDialog(null, "DEBE INGRESAR SOLO NUMEROS");
            this.jT_Resul.setText("");  
            this.jT1.setText(""); 
            this.jT2.setText(""); 
      }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBReset;
    private javax.swing.JButton jB_Resta;
    private javax.swing.JButton jB_Suma;
    private javax.swing.JButton jB_multiplicacion;
    private javax.swing.JButton jBdivision;
    private javax.swing.JButton jBporcentaje;
    private javax.swing.JButton jBpotencia;
    private javax.swing.JButton jBraiz;
    private javax.swing.JLabel jL1;
    private javax.swing.JLabel jL3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jP1;
    private javax.swing.JTextField jT1;
    private javax.swing.JTextField jT2;
    private javax.swing.JTextField jT_Resul;
    // End of variables declaration//GEN-END:variables


}
