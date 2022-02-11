package retas;

import java.awt.Color;
import javax.swing.JTextArea;

import panels.PanelPlanoCartesiano;
import ponto.Ponto;

/**
 * Classe que impementa os algoritmos de rasterização da reta.
 *
 */
public class Rasterizacao {

    private static Rasterizacao instance;

    private final PanelPlanoCartesiano planoCartesiano;

    public Rasterizacao() {
        planoCartesiano = PanelPlanoCartesiano.getInstance();
    }

    public static synchronized Rasterizacao getInstance() {
        if (instance == null) {
            instance = new Rasterizacao();
        }
        return instance;
    }

    /**
     * Algoritmo DDA (Digital Differential Analyser)
     *
     * @param pInicial Ponto inicial
     * @param pFinal Ponto Final
     * @param cor Cor da reta
     * @param textAreaSolution jTextArea para exibir solução
     */
    
    public void dda(Ponto pInicial, Ponto pFinal, Color cor, JTextArea textAreaSolution) {
    	 double x1 = pInicial.getX();
         double x2 = pFinal.getX();
         double y1 = pInicial.getY();
         double y2 = pFinal.getY();
         double dx = (x2 - x1);
         double dy = (y2 - y1);
         

         if (Math.abs(y2 - y1) <= Math.abs(x2 - x1)) {
             if ((x1 == x2) && (y1 == y2)) {
                 planoCartesiano.drawPixel(x1, y1, cor);
             } else {
                 if (x2 < x1) {
                     double tmp = x2;
                     x2 = x1;
                     x1 = tmp;

                     tmp = y2;
                     y2 = y1;
                     y1 = tmp;
                 }
                
             }
         } else if (y2 < y1) {
             double tmp = x2;
             x2 = x1;
             x1 = tmp;

             tmp = y2;
             y2 = y1;
             y1 = tmp;
         }

         double k = dx / dy;
         double x = x1;
         for (int y = (int) y1; y <= y2; y++) {
             planoCartesiano.drawPixel(x, y, cor);
             x += k;
         }
    }

    /**
     * Algoritmo do ponto médio 
     *
     * @param pInicial Ponto inicial
     * @param pFinal Ponto Final
     * @param cor Cor da reta
     * @param textAreaSolution jTextArea para exibir solução
     */
    
    public void pontoMedio(Ponto pInicial, Ponto pFinal, Color cor, JTextArea textAreaSolution) {
        int x1 = (int) (pInicial.getX() + pInicial.getZ());
        int x2 = (int) (pFinal.getX() + pInicial.getZ());
        int y1 = (int) (pInicial.getY() + pFinal.getZ());
        int y2 = (int) (pFinal.getY() + pFinal.getZ());

        if ((x1 == x2) && (y1 == y2)) {
            planoCartesiano.drawPixel(x1, y1, cor);
        } else {
            double dx = Math.abs(x2 - x1);
            double dy = Math.abs(y2 - y1);
            double rozdil = dx - dy;
            int posun_x, posun_y;

            // Determinando Incremento
            if (x1 < x2) {
                posun_x = 1;
            } else {
                posun_x = -1;
            }
            if (y1 < y2) {
                posun_y = 1;
            } else {
                posun_y = -1;
            }

            
            planoCartesiano.drawPixel((double) x1, (double) y1, cor); // Pinta o primeiro ponto
//            setSolution(textAreaSolution, x1, y1, ++count, null);

            //Desenha a reta, fazendo o somatório em x e y.
            while ((x1 != x2) || (y1 != y2)) {
                double p = 2 * rozdil;

                if (p > -dy) {
                    rozdil = rozdil - dy;
                    x1 = x1 + posun_x;
                }
                if (p < dx) {
                    rozdil = rozdil + dx;
                    y1 = y1 + posun_y;
                }

                planoCartesiano.drawPixel((double) x1, (double) y1, cor);
//                
            }
        }
    }


}
