package panels;

import retas.Rasterizacao;

import javax.swing.JPanel;

import ponto.Ponto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.List;

/**
 * Representa um plano cartesiano.
 */
public class PanelPlanoCartesiano extends JPanel {

	private static final long serialVersionUID = 1L;

	private static PanelPlanoCartesiano instance;

    private PanelPlanoCartesiano() {
        /**
         * Evento click do mouse. Denha um ponto no plano cartesiano.
         */
        super.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent event) {
                Graphics g = event.getComponent().getGraphics();
                g.setColor(Color.RED);
                g.fillOval(event.getX() - 3, event.getY() - 3, 6, 6);
            }
        });

        /**
         * Evento arrastar do mouse. Desenha a mÃ£o livre no plano cartesiano.
         */
        super.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Graphics g = e.getComponent().getGraphics();
                g.setColor(Color.RED);
                g.fillOval(e.getX() - 2, e.getY() - 2, 4, 4);
            }
        });
    }

    /**
     * Fornece instância do Plano Cartesiano
     *
     * @return
     */
    public static synchronized PanelPlanoCartesiano getInstance() {
        if (instance == null) {
            instance = new PanelPlanoCartesiano();
        }

        return instance;
    }

    /**
     * Retorna a largura/comprimento do plano cartesiano.
     *
     * @return
     */
    public int getLargura() {
        return super.getWidth();
    }

    /**
     * Retorna a altura do plano cartesiano.
     *
     * @return
     */
    public int getAltura() {
        return super.getHeight();
    }

    /**
     * width/2
     *
     * @return
     */
    public int getValorCentroX() {
        return getLargura() / 2;
    }

    /**
     * height/2
     *
     * @return
     */
    public int getValorCentroY() {
        return getAltura() / 2;
    }

    /**
     * Desenha o plano
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.setBackground(Color.white);
        g.setColor(Color.LIGHT_GRAY);

        // Reta x
        g.drawLine(0, getValorCentroY(), getLargura(), getValorCentroY()); // x1, y1, x2, y2 

        // Reta y
        g.drawLine(getValorCentroX(), 0, getValorCentroX(), getAltura()); // x1, y1, x2, y2 
    }

    /**
     * Redesenha o plano cartesiano. útil quando se quer apagar os objetos
     * desenhado nele e desenhar novos.
     */
    public void redesenha() {
        if (instance != null) {
            instance.getGraphics().clearRect(0, 0, this.getLargura(), this.getAltura());
            this.paint(this.getGraphics()); // Desenha o plano cartesiano novamente
        }
    }

    /**
     * Desenha o eixo Z no plano cartesiano.
     */
    public void desenhaEixoZ() {
        // Desenha a reta do eixo Z
        Rasterizacao.getInstance().pontoMedio(new Ponto(0, 0), new Ponto(-getAltura(), -getAltura()), Color.LIGHT_GRAY, null);
        Rasterizacao.getInstance().pontoMedio(new Ponto(0, 0), new Ponto(getAltura(), getAltura()), Color.LIGHT_GRAY, null);
    }

    public void redesenha3D() {
        redesenha();
        desenhaEixoZ();
    }

    /**
     * Desenha o pixel no plano cartesiano de acordo com os parametros. OBS. Os
     * pontos não são normalizados.
     *
     * @param x - Coordenada x
     * @param y - Coordenada y
     * @param color - Cor do pixel
     */
    public void drawPixel(int x, int y, Color color) {
        // Pega instância do graphics para desenhar no plano cartesiano
        Graphics g = super.getGraphics();
        g.setColor(color);
        g.fillRect(x, y, 1, 1);

    }

    /**
     * Desenha o pixel no plano cartesiano de acordo com os parametros. OBS. Os
     * pontos são normalizados!
     *
     * @param x - Coordenada x
     * @param y - Coordenada y
     * @param color - Cor do pixel
     */
    public void drawPixel(double x, double y, Color color) {
        // Normalizando os pontos
        x = (x + PanelPlanoCartesiano.getInstance().getValorCentroX());
        y = (PanelPlanoCartesiano.getInstance().getValorCentroY() - y);

        drawPixel(Math.round((float) x), Math.round((float) y), color);
    }

    public void drawImageROBSON(int[][] matrizImage, double[][] matrizPosicao) {
        redesenha();
        
        BufferedImage bufferedImg = new BufferedImage(matrizImage.length, matrizImage.length, BufferedImage.TYPE_INT_RGB);
        for (int row = 0; row < bufferedImg.getWidth(); row++) {
            for (int col = 0; col < bufferedImg.getHeight(); col++) {
                // Prepara a imagem para ser desenhada no jpanel
                bufferedImg.setRGB(col, row, getCorPixel((int) matrizImage[row][col]));
            }
        }

        this.drawImage(bufferedImg);
    }

    /**
     * Desenha imagem no plano cartesiano.
     *
     * @param bufferedImg BufferedImage
     */
    public void drawImage(BufferedImage bufferedImg) {
        redesenha();
        this.getGraphics().drawImage(bufferedImg, getValorCentroX(), getValorCentroY() - bufferedImg.getHeight(), null);
    }

  

    /**
     * Retorna o valor em RGB de acordo com o valor do pixel
     *
     * @param corRGB
     * @return
     */
    public int getCorPixel(int corRGB) {
        return new Color(corRGB, corRGB, corRGB).getRGB();
    }

    public void desenhaViewPort(List<Ponto> listaPontos) {
        this.redesenha();
        Rasterizacao rast = Rasterizacao.getInstance();
        /**
         * a-b b-c c-d
         */
        rast.pontoMedio(listaPontos.get(0), listaPontos.get(1), Color.BLACK, null);
        rast.pontoMedio(listaPontos.get(1), listaPontos.get(2), Color.BLACK, null);
        rast.pontoMedio(listaPontos.get(2), listaPontos.get(3), Color.BLACK, null);
        rast.pontoMedio(listaPontos.get(3), listaPontos.get(0), Color.BLACK, null);

    }
}
