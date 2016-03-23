package Vista;

import Controlador.Controlador_FRM_Matriculas;

/**
 *
 * @author daniel
 */


public class FRM_Matriculas extends javax.swing.JFrame
{
    Controlador_FRM_Matriculas controladorMatriculas;
    /**
     * Creates new form FRM_Matricula
     */
    public FRM_Matriculas()
    {
        initComponents();
        setVisible(false);
        setResizable(false);
        controladorMatriculas = new Controlador_FRM_Matriculas(this);
        jb_Matricular.addActionListener(controladorMatriculas);
        buscarPanel.agregarEventosGUI(controladorMatriculas);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_InstruccionesTitle = new javax.swing.JLabel();
        jl_Instrucciones1 = new javax.swing.JLabel();
        jl_Instrucciones2 = new javax.swing.JLabel();
        jl_Buscar = new javax.swing.JLabel();
        jl_Instrucciones3 = new javax.swing.JLabel();
        jb_Matricular = new javax.swing.JButton();
        jl_Buscar1 = new javax.swing.JLabel();
        buscarPanel = new Vista.GUI_BuscarPanelMatriculas();

        setTitle("Matriculas");

        jl_InstruccionesTitle.setText("Instrucciones");

        jl_Instrucciones1.setText("1. Introduzca la cédula del estudiante a la izquierda, y presione");

        jl_Instrucciones2.setText("2. Introduzca las siglas del curso a la derecha, y presione");

        jl_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jl_Buscar.setText("Buscar.");

        jl_Instrucciones3.setText("3. Presione \"Matricular Estudiante\".");

        jb_Matricular.setText("Matricular Estudiante");
        jb_Matricular.setToolTipText("");
        jb_Matricular.setActionCommand("Matricular");
        jb_Matricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_MatricularActionPerformed(evt);
            }
        });

        jl_Buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jl_Buscar1.setText("Buscar.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jb_Matricular, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_InstruccionesTitle)
                    .addComponent(jl_Instrucciones3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_Instrucciones2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_Buscar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_Instrucciones1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_Buscar1)))
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buscarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jl_InstruccionesTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Instrucciones1)
                    .addComponent(jl_Buscar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Instrucciones2)
                    .addComponent(jl_Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_Instrucciones3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_Matricular, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jb_MatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_MatricularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_MatricularActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GUI_BuscarPanelMatriculas buscarPanel;
    private javax.swing.JButton jb_Matricular;
    private javax.swing.JLabel jl_Buscar;
    private javax.swing.JLabel jl_Buscar1;
    private javax.swing.JLabel jl_Instrucciones1;
    private javax.swing.JLabel jl_Instrucciones2;
    private javax.swing.JLabel jl_Instrucciones3;
    private javax.swing.JLabel jl_InstruccionesTitle;
    // End of variables declaration//GEN-END:variables
}
