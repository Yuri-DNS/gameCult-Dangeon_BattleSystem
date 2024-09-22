package Personagens;

import java.util.ArrayList;

public class Tecnica {

    private String nomeTecnica;
    private String tipoTecnica;
    private boolean efeitoStatus;
    private ArrayList<Efeitos> efeitos;

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

    private float multiplicadorDano;

    public Tecnica(String nomeTecnica, String tipoTecnica, boolean efeitoStatus, ArrayList<Efeitos> efeitos) {
        this.nomeTecnica = nomeTecnica;
        this.tipoTecnica = tipoTecnica;
        this.efeitoStatus = efeitoStatus;
        this.efeitos = efeitos;
        gerarAtributosTecnica();
    }

    public void gerarAtributosTecnica(){

        for (Efeitos efeito : this.efeitos){
            setVida(getVida() + efeito.getVida());
            setKi(getKi() + efeito.getKi());
            setMente(getMente() + efeito.getMente());
            setReflexo(getReflexo() + efeito.getReflexo());
            setPercepcao(getPercepcao() + efeito.getPercepcao());
            setPrecisao(getPrecisao() + efeito.getPrecisao());
            setConstituicao(getConstituicao() + efeito.getConstituicao());
            setForca(getForca() + efeito.getForca());
            setAgilidade(getAgilidade() + efeito.getAgilidade());
            setResistenciaFisica(getResistenciaFisica() + efeito.getResistenciaFisica());
            setResistenciaMental(getResistenciaMental() + efeito.getResistenciaMental());
        }
    }

    public String getNomeTecnica() {
        return nomeTecnica;
    }

    public void setNomeTecnica(String nomeTecnica) {
        this.nomeTecnica = nomeTecnica;
    }

    public String getTipoTecnica() {
        return tipoTecnica;
    }

    public void setTipoTecnica(String tipoTecnica) {
        this.tipoTecnica = tipoTecnica;
    }

    public boolean isEfeitoStatus() {
        return efeitoStatus;
    }

    public void setEfeitoStatus(boolean efeitoStatus) {
        this.efeitoStatus = efeitoStatus;
    }

    public ArrayList<Efeitos> getEfeitos() {
        return efeitos;
    }

    public void setEfeitos(ArrayList<Efeitos> efeitos) {
        this.efeitos = efeitos;
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

    public float getMultiplicadorDano() {
        return multiplicadorDano;
    }

    public void setMultiplicadorDano(float multiplicadorDano) {
        this.multiplicadorDano = multiplicadorDano;
    }
}
