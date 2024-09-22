package Personagens;

public abstract class Atributos {

    // Atriubutos Basicos:
    private int vidaBase;
    private int vidaAtual;

    private int kiBase;
    private int kiAtual;

    private int menteBase;
    private int menteAtual;

    private int reflexoBase;
    private int reflexoAtual;

    private int percepcaoBase;
    private int percepcaoAtual;

    private int precisaoBase;
    private int precisaoAtual;

    private int constituicaoBase;
    private int constituicaoAtual;

    private int forcaBase;
    private int forcaAtual;

    private int agilidadeBase;
    private int agilidadeAtual;

    private int resistenciaFisicaBase;
    private int resistenciaFisicaAtual;

    private int resistenciaMentalBase;
    private int resistenciaMentalAtual;

    public Atributos(int vidaBase, int kiBase, int menteBase, int reflexoBase, int percepcaoBase, int precisaoBase, int constituicaoBase, int forcaBase, int agilidadeBase, int resistenciaFisicaBase, int resistenciaMentalBase) {
        this.vidaBase = vidaBase;
        this.kiBase = kiBase;
        this.menteBase = menteBase;
        this.reflexoBase = reflexoBase;
        this.percepcaoBase = percepcaoBase;
        this.precisaoBase = precisaoBase;
        this.constituicaoBase = constituicaoBase;
        this.forcaBase = forcaBase;
        this.agilidadeBase = agilidadeBase;
        this.resistenciaFisicaBase = resistenciaFisicaBase;
        this.resistenciaMentalBase = resistenciaMentalBase;
    }

    public int getVidaBase() {
        return vidaBase;
    }

    public void setVidaBase(int vidaBase) {
        this.vidaBase = vidaBase;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public int getKiBase() {
        return kiBase;
    }

    public void setKiBase(int kiBase) {
        this.kiBase = kiBase;
    }

    public int getKiAtual() {
        return kiAtual;
    }

    public void setKiAtual(int kiAtual) {
        this.kiAtual = kiAtual;
    }

    public int getMenteBase() {
        return menteBase;
    }

    public void setMenteBase(int menteBase) {
        this.menteBase = menteBase;
    }

    public int getMenteAtual() {
        return menteAtual;
    }

    public void setMenteAtual(int menteAtual) {
        this.menteAtual = menteAtual;
    }

    public int getReflexoBase() {
        return reflexoBase;
    }

    public void setReflexoBase(int reflexoBase) {
        this.reflexoBase = reflexoBase;
    }

    public int getReflexoAtual() {
        return reflexoAtual;
    }

    public void setReflexoAtual(int reflexoAtual) {
        this.reflexoAtual = reflexoAtual;
    }

    public int getPercepcaoBase() {
        return percepcaoBase;
    }

    public void setPercepcaoBase(int percepcaoBase) {
        this.percepcaoBase = percepcaoBase;
    }

    public int getPercepcaoAtual() {
        return percepcaoAtual;
    }

    public void setPercepcaoAtual(int percepcaoAtual) {
        this.percepcaoAtual = percepcaoAtual;
    }

    public int getPrecisaoBase() {
        return precisaoBase;
    }

    public void setPrecisaoBase(int precisaoBase) {
        this.precisaoBase = precisaoBase;
    }

    public int getPrecisaoAtual() {
        return precisaoAtual;
    }

    public void setPrecisaoAtual(int precisaoAtual) {
        this.precisaoAtual = precisaoAtual;
    }

    public int getConstituicaoBase() {
        return constituicaoBase;
    }

    public void setConstituicaoBase(int constituicaoBase) {
        this.constituicaoBase = constituicaoBase;
    }

    public int getConstituicaoAtual() {
        return constituicaoAtual;
    }

    public void setConstituicaoAtual(int constituicaoAtual) {
        this.constituicaoAtual = constituicaoAtual;
    }

    public int getForcaBase() {
        return forcaBase;
    }

    public void setForcaBase(int forcaBase) {
        this.forcaBase = forcaBase;
    }

    public int getForcaAtual() {
        return forcaAtual;
    }

    public void setForcaAtual(int forcaAtual) {
        this.forcaAtual = forcaAtual;
    }

    public int getAgilidadeBase() {
        return agilidadeBase;
    }

    public void setAgilidadeBase(int agilidadeBase) {
        this.agilidadeBase = agilidadeBase;
    }

    public int getAgilidadeAtual() {
        return agilidadeAtual;
    }

    public void setAgilidadeAtual(int agilidadeAtual) {
        this.agilidadeAtual = agilidadeAtual;
    }

    public int getResistenciaFisicaBase() {
        return resistenciaFisicaBase;
    }

    public void setResistenciaFisicaBase(int resistenciaFisicaBase) {
        this.resistenciaFisicaBase = resistenciaFisicaBase;
    }

    public int getResistenciaFisicaAtual() {
        return resistenciaFisicaAtual;
    }

    public void setResistenciaFisicaAtual(int resistenciaFisicaAtual) {
        this.resistenciaFisicaAtual = resistenciaFisicaAtual;
    }

    public int getResistenciaMentalBase() {
        return resistenciaMentalBase;
    }

    public void setResistenciaMentalBase(int resistenciaMentalBase) {
        this.resistenciaMentalBase = resistenciaMentalBase;
    }

    public int getResistenciaMentalAtual() {
        return resistenciaMentalAtual;
    }

    public void setResistenciaMentalAtual(int resistenciaMentalAtual) {
        this.resistenciaMentalAtual = resistenciaMentalAtual;
    }
}
