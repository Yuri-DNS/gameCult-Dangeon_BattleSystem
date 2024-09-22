package Personagens;

public class Efeitos {

    private String nomeEfeito;
    private String tipoEfeito;
    private boolean isEfeitoContinuo;
    private boolean isEfeitoTecnica;
    private int duracaoEfeito;

    // Atributos
    private int vida;
    private int ki;
    private int mente;
    private int reflexo;
    private int percepcao;
    private int precisao;
    private int constituicao;
    private int forca;
    private int agilidade;
    private int resistenciaFisica;
    private int resistenciaMental;

    public Efeitos(String nomeEfeito, String tipoEfeito, boolean isEfeitoContinuo, boolean isEfeitoTecnica, int duracaoEfeito, int vida, int ki, int mente, int reflexo, int percepcao, int precisao, int constituicao, int forca, int agilidade, int resistenciaFisica, int resistenciaMental) {
        this.nomeEfeito = nomeEfeito;
        this.tipoEfeito = tipoEfeito;
        this.isEfeitoContinuo = isEfeitoContinuo;
        this.isEfeitoTecnica = isEfeitoTecnica;
        this.duracaoEfeito = duracaoEfeito;
        this.vida = vida;
        this.ki = ki;
        this.mente = mente;
        this.reflexo = reflexo;
        this.percepcao = percepcao;
        this.precisao = precisao;
        this.constituicao = constituicao;
        this.forca = forca;
        this.agilidade = agilidade;
        this.resistenciaFisica = resistenciaFisica;
        this.resistenciaMental = resistenciaMental;
    }

    public String getNomeEfeito() {
        return nomeEfeito;
    }

    public void setNomeEfeito(String nomeEfeito) {
        this.nomeEfeito = nomeEfeito;
    }

    public String getTipoEfeito() {
        return tipoEfeito;
    }

    public void setTipoEfeito(String tipoEfeito) {
        this.tipoEfeito = tipoEfeito;
    }

    public boolean isEfeitoContinuo() {
        return isEfeitoContinuo;
    }

    public void setEfeitoContinuo(boolean efeitoContinuo) {
        isEfeitoContinuo = efeitoContinuo;
    }

    public boolean isEfeitoTecnica() {
        return isEfeitoTecnica;
    }

    public void setEfeitoTecnica(boolean efeitoTecnica) {
        isEfeitoTecnica = efeitoTecnica;
    }

    public int getDuracaoEfeito() {
        return duracaoEfeito;
    }

    public void setDuracaoEfeito(int duracaoEfeito) {
        this.duracaoEfeito = duracaoEfeito;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public int getMente() {
        return mente;
    }

    public void setMente(int mente) {
        this.mente = mente;
    }

    public int getReflexo() {
        return reflexo;
    }

    public void setReflexo(int reflexo) {
        this.reflexo = reflexo;
    }

    public int getPercepcao() {
        return percepcao;
    }

    public void setPercepcao(int percepcao) {
        this.percepcao = percepcao;
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getResistenciaFisica() {
        return resistenciaFisica;
    }

    public void setResistenciaFisica(int resistenciaFisica) {
        this.resistenciaFisica = resistenciaFisica;
    }

    public int getResistenciaMental() {
        return resistenciaMental;
    }

    public void setResistenciaMental(int resistenciaMental) {
        this.resistenciaMental = resistenciaMental;
    }
}
