package circunferencia;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import panels.PanelPlanoCartesiano;
import ponto.Ponto;

/**
 * Algoritmos para desenhar circunferencias
 */

public class Circunferencia {

    private static Circunferencia instance;

    private final PanelPlanoCartesiano planoCartesiano;
    private final Graphics g;

    public static int x, y, d_old, x_dif, y_dif;
    private List<Ponto> listaPontos;

    private Circunferencia() {
        listaPontos = new ArrayList<>();
        planoCartesiano = PanelPlanoCartesiano.getInstance();
        g = planoCartesiano.getGraphics();
    }

    public static synchronized Circunferencia getInstance() {
        if (instance == null) {
            instance = new Circunferencia();
        }
        return instance;
    }

    /**
     * Algoritmo função explicita.
     *
     * @param raio
     * @param cor
     */
    
    public void funcaoExplicita(int raio, Color cor) {
        planoCartesiano.redesenha();
        
        for (int i = -raio; i < raio; i++) {
            g.setColor(cor);
            g.fillRect(i + planoCartesiano.getValorCentroX(), planoCartesiano.getValorCentroY() - ((int) Math.sqrt(raio * raio - i * i)), 1, 1);
            g.fillRect(i + planoCartesiano.getValorCentroX(), planoCartesiano.getValorCentroY() - (-1 * (int) Math.sqrt(raio * raio - i * i)), 1, 1);
        }
    }

    /**
     * Algoritmo função trigonométrica
     *
     * @param raio
     * @param cor
     */
    
    public void funcaoTrigonometria(int raio, Color cor) {
        planoCartesiano.redesenha();
        for (int i = -raio; i <= raio; i++) {
            g.setColor(cor);
            g.fillRect(((int) (raio * (double) Math.cos(Math.toRadians(i)))) + planoCartesiano.getValorCentroX(), planoCartesiano.getValorCentroY() - ((int) (raio * (double) Math.sin(Math.toRadians(i)))), 1, 1);
            drawPontos(((int) (raio * (double) Math.cos(Math.toRadians(i)))), -((int) (raio * (double) Math.sin(Math.toRadians(i)))), cor);
        }
    }

    /**
     * Algoritmo ponto médio
     *
     * @param raio
     * @param cor
     */
    
    public void funcaoPontoMedio(int raio, Color cor) {
        planoCartesiano.redesenha();
        
        x = 0;
        y = raio;
        d_old = 1 - raio;
        
        g.setColor(cor);
        g.fillRect(x + planoCartesiano.getValorCentroX(), planoCartesiano.getValorCentroY() - y, 1, 1);
        drawPontos(x, y, cor);
        while (y > x) {
            if (d_old < 0) {
                d_old += 2 * x + 3;
            } else {
                d_old += 2 * x - 2 * y + 5;
                y--;
            }
            x++;
            drawPontos(x, y, cor);
        }

    }


    /**
     * Desenha nos oitantes
     *
     * @param x
     * @param y
     * @param cor
     */
    
    private void drawPontos(int x, int y, Color cor) {
        g.setColor(cor);

        g.fillRect(x + planoCartesiano.getValorCentroX(), planoCartesiano.getValorCentroY() - y, 1, 1);
        g.fillRect(x + planoCartesiano.getValorCentroX(), planoCartesiano.getValorCentroY() + y, 1, 1);
        g.fillRect(-x + planoCartesiano.getValorCentroX(), planoCartesiano.getValorCentroY() - y, 1, 1);
        g.fillRect(-x + planoCartesiano.getValorCentroX(), planoCartesiano.getValorCentroY() + y, 1, 1);

        g.fillRect(y + planoCartesiano.getValorCentroX(), planoCartesiano.getValorCentroY() - x, 1, 1);
        g.fillRect(y + planoCartesiano.getValorCentroX(), planoCartesiano.getValorCentroY() + x, 1, 1);
        g.fillRect(-y + planoCartesiano.getValorCentroX(), planoCartesiano.getValorCentroY() - x, 1, 1);
        g.fillRect(-y + planoCartesiano.getValorCentroX(), planoCartesiano.getValorCentroY() + x, 1, 1);
    }

}
