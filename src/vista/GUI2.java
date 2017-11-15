/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author jmcordoba
 */
public class GUI2 extends javax.swing.JFrame {

    /**
     * Creates new form GUI2
     */
    public GUI2() {
        initComponents();
        inicializarMapa();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pFondo = new javax.swing.JPanel();
        lFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(8, 8));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        lFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/recursos/fondo.jpg"))); // NOI18N

        javax.swing.GroupLayout pFondoLayout = new javax.swing.GroupLayout(pFondo);
        pFondo.setLayout(pFondoLayout);
        pFondoLayout.setHorizontalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addComponent(lFondo)
                .addGap(0, 112, Short.MAX_VALUE))
        );
        pFondoLayout.setVerticalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFondoLayout.createSequentialGroup()
                .addComponent(lFondo)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(pFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int teclaPresionada = evt.getKeyCode();
        switch (teclaPresionada) {
            case KeyEvent.VK_LEFT:
                if(posY!=0){
                    if (!(iconos[posX][posY-1].getIcon()==iconosImagen[2])) {
                        iconos[posX][posY].setIcon(null);
                        posY--;
                        iconos[posX][posY].setIcon(iconosImagen[1]);
                    }
                }
                break;
            case KeyEvent.VK_RIGHT:
                if(posY!=7){
                    if (!(iconos[posX][posY+1].getIcon()==iconosImagen[2])) {
                        iconos[posX][posY].setIcon(null);
                        posY++;
                        iconos[posX][posY].setIcon(iconosImagen[1]);
                    }
                }
                break;
            case KeyEvent.VK_UP:
                if(posX!=0){
                    if (!(iconos[posX-1][posY].getIcon()==iconosImagen[2])) {
                        iconos[posX][posY].setIcon(null);
                        posX--;
                        iconos[posX][posY].setIcon(iconosImagen[1]);
                    }
                }
                break;
            case KeyEvent.VK_DOWN:
                if(posX!=7){
                    if (!(iconos[posX+1][posY].getIcon()==iconosImagen[2])) {
                        iconos[posX][posY].setIcon(null);
                        posX++;
                        iconos[posX][posY].setIcon(iconosImagen[1]);
                    }
                }
                break;
        }
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI2().setVisible(true);
            }
        });
    }

    private void inicializarMapa() {
        iconosImagen[1] = new ImageIcon(getClass().
                getResource("/vista/recursos/1.gif"));
        iconosImagen[0] = new ImageIcon(getClass().
                getResource("/vista/recursos/0.gif"));

        iconosImagen[2] = new ImageIcon(getClass().
                getResource("/vista/recursos/2.gif"));

        for (int i = 0; i < iconos.length; i++) {
            for (int j = 0; j < iconos[i].length; j++) {
                iconos[i][j] = new javax.swing.JLabel();

                iconos[i][j].setIcon(null);

                jPanel1.add(iconos[i][j]);

            }

        }

        iconos[0][0].setIcon(iconosImagen[1]);

        iconos[0][2].setIcon(iconosImagen[2]);
        iconos[1][2].setIcon(iconosImagen[2]);
        iconos[2][2].setIcon(iconosImagen[2]);
        iconos[2][0].setIcon(iconosImagen[2]);
        iconos[2][1].setIcon(iconosImagen[2]);
    }

    int posX = 0, posY = 0;
    private JLabel[][] iconos = new JLabel[8][8];
    private ImageIcon[] iconosImagen = new ImageIcon[5];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lFondo;
    private javax.swing.JPanel pFondo;
    // End of variables declaration//GEN-END:variables
}
