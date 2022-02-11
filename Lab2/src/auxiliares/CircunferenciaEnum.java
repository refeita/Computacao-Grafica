package auxiliares;

/**
 * Mapeia os algoritmos para desenhar circunferência
 * 
 */
public enum CircunferenciaEnum {
    EQUACAO_EXPLICITA("Equação Explícita"), PONTO_MEDIO("Ponto Médio"), TRIGONOMETRIA("Trigonométrica");
    
    private final String titulo;

    CircunferenciaEnum(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }
}
