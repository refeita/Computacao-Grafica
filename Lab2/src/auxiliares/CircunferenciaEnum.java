package auxiliares;

/**
 * Mapeia os algoritmos para desenhar circunfer�ncia
 * 
 */
public enum CircunferenciaEnum {
    EQUACAO_EXPLICITA("Equa��o Expl�cita"), PONTO_MEDIO("Ponto M�dio"), TRIGONOMETRIA("Trigonom�trica");
    
    private final String titulo;

    CircunferenciaEnum(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }
}
