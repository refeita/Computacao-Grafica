package cg.principal;

import cg.panels.PlanoCartesiano;
import cg.coordenadas.Normalizacao;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 *
 * @author Rafaela Candido, Leandro Lincoln, Pedro Ramos, Rafael Medeiros
 *
 */
public class App extends javax.swing.JFrame {

	public App() {
		initComponents();
		sistemaCoordenadas();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panelBox = new javax.swing.JPanel();
        panelPlanoCartesiano = cg.panels.PlanoCartesiano.getInstance();
        labelResTela = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        labelY = new javax.swing.JLabel();
        labelX = new javax.swing.JLabel();
        labelNDCY = new javax.swing.JLabel();
        labelNDCX = new javax.swing.JLabel();
        labelDCY = new javax.swing.JLabel();
        labelDCX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Computação Gráfica - 2019.1");
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setName("framePrincipal"); // NOI18N
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                actionResized(evt);
            }
        });

        panelPlanoCartesiano.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelPlanoCartesiano.setPreferredSize(new java.awt.Dimension(550, 550));

        labelResTela.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelResTela.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelResTela.setText("Resolução da tela:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setText("Coord. do Mundo:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel11.setText("Coord. Normalizadas:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel12.setText("Coord. Dispositivo:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setText("DCX:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel14.setText("NDCX:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel15.setText("X:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel16.setText("DCY:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel17.setText("NDCY:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel18.setText("Y:");

        labelY.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelY.setText("0");

        labelX.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelX.setText("0");

        labelNDCY.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelNDCY.setText("0");

        labelNDCX.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelNDCX.setText("0");

        labelDCY.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelDCY.setText("0");

        labelDCX.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelDCX.setText("0");

        javax.swing.GroupLayout panelPlanoCartesianoLayout = new javax.swing.GroupLayout(panelPlanoCartesiano);
        panelPlanoCartesiano.setLayout(panelPlanoCartesianoLayout);
        panelPlanoCartesianoLayout.setHorizontalGroup(
            panelPlanoCartesianoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlanoCartesianoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPlanoCartesianoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPlanoCartesianoLayout.createSequentialGroup()
                        .addGroup(panelPlanoCartesianoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPlanoCartesianoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPlanoCartesianoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelX)
                            .addComponent(labelDCX)
                            .addComponent(labelNDCX, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPlanoCartesianoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPlanoCartesianoLayout.createSequentialGroup()
                                .addGroup(panelPlanoCartesianoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelPlanoCartesianoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelY)
                                    .addComponent(labelDCY)))
                            .addGroup(panelPlanoCartesianoLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelNDCY, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(762, 762, 762))
                    .addGroup(panelPlanoCartesianoLayout.createSequentialGroup()
                        .addComponent(labelResTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(740, 740, 740))))
        );
        panelPlanoCartesianoLayout.setVerticalGroup(
            panelPlanoCartesianoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlanoCartesianoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelResTela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPlanoCartesianoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16)
                    .addComponent(labelDCY)
                    .addComponent(labelDCX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPlanoCartesianoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17)
                    .addComponent(labelNDCY)
                    .addComponent(labelNDCX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPlanoCartesianoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18)
                    .addComponent(labelY)
                    .addComponent(labelX))
                .addContainerGap(606, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBoxLayout = new javax.swing.GroupLayout(panelBox);
        panelBox.setLayout(panelBoxLayout);
        panelBoxLayout.setHorizontalGroup(
            panelBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPlanoCartesiano, javax.swing.GroupLayout.DEFAULT_SIZE, 1086, Short.MAX_VALUE)
        );
        panelBoxLayout.setVerticalGroup(
            panelBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPlanoCartesiano, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(panelBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1096, 759));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        
	
	/**
	 * Evento disparado toda vez que a tela sera redimensinada. Seta a resolu��o da
	 * tela atual.
	 */
	private void actionResized(java.awt.event.ComponentEvent evt) {// GEN-FIRST:event_actionResized
		PlanoCartesiano p = PlanoCartesiano.getInstance();
		labelResTela.setText("Tela: " + p.getLargura() + "x" + p.getAltura());
	}// GEN-LAST:event_actionResized

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new App().setVisible(true);
			}
		});
	}

	/**
	 * Calcula e exibe o sistema de coordenadas de acordo com os pontos no plano
	 * cartesiano. O Evento mouseMoved � utilizado para pegar as coordenadas no
	 * plano cartesiano.
	 */
	private void sistemaCoordenadas() {
		panelPlanoCartesiano.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				super.mouseMoved(e);

				// Pega a instancia do Plano Cartesiano
				PlanoCartesiano planoCartesiano = PlanoCartesiano.getInstance();

				// Calcula o dc - Entrada de dispositivo | Ser� o mesmo que a sa�da
				int dcx = e.getX() - planoCartesiano.getValorCentroX();
				int dcy = (e.getY() - planoCartesiano.getValorCentroY()) * -1;

				// Calcula o ndc - Normaliza��o do dispositivo
				double ndcx = Normalizacao.calcularNDCX(planoCartesiano.getLargura(), dcx);
				double ndcy = Normalizacao.calcularNDCX(planoCartesiano.getAltura(), dcy);

				labelNDCX.setText(String.format("%.6f", ndcx));
				labelNDCY.setText(String.format("%.6f", ndcy));

				labelDCX.setText(String.valueOf(Normalizacao.calcularDCX(planoCartesiano.getLargura(), (float) ndcx)));
				labelDCY.setText(String.valueOf(Normalizacao.calcularDCY(planoCartesiano.getAltura(), (float) ndcy)));

				labelX.setText(String.valueOf(Math.round(dcx)));
				labelY.setText(String.valueOf(Math.round(dcy)));
			}
		});
                
                panelPlanoCartesiano.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        
                        PlanoCartesiano planoCartesiano = PlanoCartesiano.getInstance();

                        planoCartesiano.drawPixel(Double.parseDouble(labelDCX.getText()),Double.parseDouble(labelDCY.getText()),Color.RED);
                    }
                });
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel labelDCX;
    private javax.swing.JLabel labelDCY;
    private javax.swing.JLabel labelNDCX;
    private javax.swing.JLabel labelNDCY;
    private javax.swing.JLabel labelResTela;
    private javax.swing.JLabel labelX;
    private javax.swing.JLabel labelY;
    private javax.swing.JPanel panelBox;
    private static javax.swing.JPanel panelPlanoCartesiano;
    // End of variables declaration//GEN-END:variables
}