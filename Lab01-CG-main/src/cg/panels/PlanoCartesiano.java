package cg.panels;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

/**
 * Representa um plano cartesiano.
 *
 * @author 
 */
public class PlanoCartesiano extends JPanel {

    private static PlanoCartesiano instance;

    /**
     * Construtor default.
     */
    private PlanoCartesiano() {

    }

    /**
     * Fornece instancia do Plano Cartesiano
     */
    public static synchronized PlanoCartesiano getInstance() {
        if (instance == null) {
            instance = new PlanoCartesiano();
        }
        return instance;
    }

    /**
     * Retorna a largura/comprimento do plano cartesiano.
     */
    public int getLargura() {
        return super.getWidth();
    }

    /**
     * Retorna a altura do plano cartesiano.
     */
    public int getAltura() {
        return super.getHeight();
    }

    /**
     * Retorna o valor central X (width/2)
     */
    public int getValorCentroX() {
        return getLargura() / 2;
    }

    /**
     * Retorna o valor central Y (height/2)
     */
    public int getValorCentroY() {
        return getAltura() / 2;
    }

    /**
     * Desenha o plano cartesiano.
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.setBackground(Color.WHITE);
        g.setColor(Color.LIGHT_GRAY);
        g.drawLine(0, getValorCentroY(), getLargura(), getValorCentroY()); //reta x
        g.drawLine(getValorCentroX(), 0, getValorCentroX(), getAltura()); //reta y
    }

    /**
     * Desenha o pixel no plano cartesiano de acordo com os parametros. OBS: Os pontos n�o s�o normalizados.
     */
    public void drawPixel(int x, int y, Color color) {
        Graphics g = super.getGraphics();
        g.setColor(color);
        g.fillRect(x, y, 1, 1); //acende um pixel (x,y) no plano.
    }

    /**
     * Desenha um pixel no plano cartesiano de acordo com os parametros. OBS: Os pontos s�o normalizados!
     */
    public void drawPixel(double x, double y, Color color) {
        //Normalizando os pontos
        x = (x + PlanoCartesiano.getInstance().getValorCentroX());
        y = (PlanoCartesiano.getInstance().getValorCentroY() - y);
        drawPixel(Math.round((float) x), Math.round((float) y), color);
    }
}