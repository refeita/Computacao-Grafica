package auxiliares;

/**
 * Mapeia os algoritmos para rasteriza�ao 
 * 
 */

public enum RasterizacaoEnum {
    DDA("DDA (Digital Differential Analyser)"), PONTO_MEDIO("Ponto M�dio");
    
    private final String titulo;

    RasterizacaoEnum(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }
}
