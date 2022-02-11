package auxiliares;

/**
 * Mapeia os algoritmos para rasterizaçao 
 * 
 */

public enum RasterizacaoEnum {
    DDA("DDA (Digital Differential Analyser)"), PONTO_MEDIO("Ponto Médio");
    
    private final String titulo;

    RasterizacaoEnum(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }
}
