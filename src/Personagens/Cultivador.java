package Personagens;

import java.util.ArrayList;

public class Cultivador extends Atributos {

    private MetodoCultivo metodoCultivo;

    private ArrayList<Tecnica> tecnicas;

    private ArrayList<Efeitos> efeitos;

    private int vidaModif;
    private int kiModif;
    private int menteModif;
    private int reflexoModif;
    private int percepcaoModif;
    private int precisaoModif;
    private int constituicaoModif;
    private int forcaModif;
    private int agilidadeModif;
    private int resistenciaFisicaModif;
    private int resistenciaMentalModif;

    public Cultivador(int vidaBase, int kiBase, int menteBase, int reflexoBase, int percepcaoBase, int precisaoBase, int constituicaoBase, int forcaBase, int agilidadeBase, int resistenciaFisicaBase, int resistenciaMentalBase, MetodoCultivo metodoCultivo, ArrayList<Tecnica> tecnicas, ArrayList<Efeitos> efeitos) {
        super(vidaBase, kiBase, menteBase, reflexoBase, percepcaoBase, precisaoBase, constituicaoBase, forcaBase, agilidadeBase, resistenciaFisicaBase, resistenciaMentalBase);
        this.metodoCultivo = metodoCultivo;
        this.tecnicas = tecnicas;
        this.efeitos = efeitos;

        recriarAtributos();
    }

    public void recriarAtributos() {
        gerarAtributosModif();

        this.setVidaAtual(this.getVidaBase()+this.vidaModif);
        this.setKiAtual(this.getKiBase()+this.kiModif);
        this.setMenteAtual(this.getMenteBase()+this.menteModif);
        this.setReflexoAtual(this.getReflexoBase()+this.reflexoModif);
        this.setPercepcaoAtual(this.getPercepcaoBase()+this.percepcaoModif);
        this.setPrecisaoAtual(this.getPrecisaoBase()+this.precisaoModif);
        this.setConstituicaoAtual(this.getConstituicaoBase()+this.constituicaoModif);
        this.setForcaAtual(this.getForcaBase()+this.forcaModif);
        this.setAgilidadeAtual(this.getAgilidadeBase()+this.agilidadeModif);
        this.setResistenciaFisicaAtual(this.getResistenciaFisicaBase()+this.resistenciaFisicaModif);
        this.setResistenciaMentalAtual(this.getResistenciaMentalBase()+this.resistenciaMentalModif);
    }

    public void gerarAtributosModif() {
        zerarModif();

        for (Efeitos efeito : this.metodoCultivo.getEfeitoStatus()){
            this.vidaModif += efeito.getVida();
            this.kiModif += efeito.getKi();
            this.menteModif += efeito.getMente();
            this.reflexoModif += efeito.getReflexo();
            this.percepcaoModif += efeito.getPercepcao();
            this.precisaoModif += efeito.getPrecisao();
            this.constituicaoModif += efeito.getConstituicao();
            this.forcaModif += efeito.getForca();
            this.agilidadeModif += efeito.getAgilidade();
            this.resistenciaFisicaModif += efeito.getResistenciaFisica();
            this.resistenciaMentalModif += efeito.getResistenciaMental();
        }
        for (Efeitos efeito : this.metodoCultivo.getEnergia().getEfeitos()){
            this.vidaModif += efeito.getVida();
            this.kiModif += efeito.getKi();
            this.menteModif += efeito.getMente();
            this.reflexoModif += efeito.getReflexo();
            this.percepcaoModif += efeito.getPercepcao();
            this.precisaoModif += efeito.getPrecisao();
            this.constituicaoModif += efeito.getConstituicao();
            this.forcaModif += efeito.getForca();
            this.agilidadeModif += efeito.getAgilidade();
            this.resistenciaFisicaModif += efeito.getResistenciaFisica();
            this.resistenciaMentalModif += efeito.getResistenciaMental();
        }
    }

    public void zerarModif (){
        setVidaModif(0);
        setKiModif(0);
        setMenteModif(0);
        setReflexoModif(0);
        setPercepcaoModif(0);
        setPrecisaoModif(0);
        setConstituicaoModif(0);
        setForcaModif(0);
        setAgilidadeModif(0);
        setResistenciaFisicaModif(0);
        setResistenciaMentalModif(0);
    }

    public void aplicarEfeitosExternos(ArrayList<Efeitos> efeitosLista){

        for (Efeitos efeito : efeitosLista){

            setVidaAtual(getVidaAtual() + efeito.getVida());
            setKiAtual(getKiAtual() + efeito.getKi());
            setMenteAtual(getMenteAtual() + efeito.getMente());
            setReflexoAtual(getReflexoAtual() + efeito.getReflexo());
            setPercepcaoAtual(getPercepcaoAtual() + efeito.getPercepcao());
            setPrecisaoAtual(getPrecisaoAtual() + efeito.getPrecisao());
            setConstituicaoAtual(getConstituicaoAtual() + efeito.getConstituicao());
            setForcaAtual(getForcaAtual() + efeito.getForca());
            setAgilidadeAtual(getAgilidadeAtual() + efeito.getAgilidade());
            setResistenciaFisicaAtual(getResistenciaFisicaAtual() + efeito.getResistenciaFisica());
            setResistenciaMentalAtual(getResistenciaMentalAtual() + efeito.getResistenciaMental());
            System.out.println("Mod");
        }

    }

    public void receberEfeitosTecnica(ArrayList<Tecnica> tecnicas){

        for (Tecnica tecnica : tecnicas){

            setVidaAtual(getVidaAtual() + tecnica.getVida());
            setKiAtual(getKiAtual() + tecnica.getKi());
            setMenteAtual(getMenteAtual() + tecnica.getMente());
            setReflexoAtual(getReflexoAtual() + tecnica.getReflexo());
            setPercepcaoAtual(getPercepcaoAtual() + tecnica.getPercepcao());
            setPrecisaoAtual(getPrecisaoAtual() + tecnica.getPrecisao());
            setConstituicaoAtual(getConstituicaoAtual() + tecnica.getConstituicao());
            setForcaAtual(getForcaAtual() + tecnica.getForca());
            setAgilidadeAtual(getAgilidadeAtual() + tecnica.getAgilidade());
            setResistenciaFisicaAtual(getResistenciaFisicaAtual() + tecnica.getResistenciaFisica());
            setResistenciaMentalAtual(getResistenciaMentalAtual() + tecnica.getResistenciaMental());
            System.out.println("Mod");
        }
    }




    // Getters e Setters


    public MetodoCultivo getMetodoCultivo() {
        return metodoCultivo;
    }

    public void setMetodoCultivo(MetodoCultivo metodoCultivo) {
        this.metodoCultivo = metodoCultivo;
    }

    public ArrayList<Tecnica> getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(ArrayList<Tecnica> tecnicas) {
        this.tecnicas = tecnicas;
    }

    public ArrayList<Efeitos> getEfeitos() {
        return efeitos;
    }

    public void setEfeitos(ArrayList<Efeitos> efeitos) {
        this.efeitos = efeitos;
    }

    public int getVidaModif() {
        return vidaModif;
    }

    public void setVidaModif(int vidaModif) {
        this.vidaModif = vidaModif;
    }

    public int getKiModif() {
        return kiModif;
    }

    public void setKiModif(int kiModif) {
        this.kiModif = kiModif;
    }

    public int getMenteModif() {
        return menteModif;
    }

    public void setMenteModif(int menteModif) {
        this.menteModif = menteModif;
    }

    public int getReflexoModif() {
        return reflexoModif;
    }

    public void setReflexoModif(int reflexoModif) {
        this.reflexoModif = reflexoModif;
    }

    public int getPercepcaoModif() {
        return percepcaoModif;
    }

    public void setPercepcaoModif(int percepcaoModif) {
        this.percepcaoModif = percepcaoModif;
    }

    public int getPrecisaoModif() {
        return precisaoModif;
    }

    public void setPrecisaoModif(int precisaoModif) {
        this.precisaoModif = precisaoModif;
    }

    public int getConstituicaoModif() {
        return constituicaoModif;
    }

    public void setConstituicaoModif(int constituicaoModif) {
        this.constituicaoModif = constituicaoModif;
    }

    public int getForcaModif() {
        return forcaModif;
    }

    public void setForcaModif(int forcaModif) {
        this.forcaModif = forcaModif;
    }

    public int getAgilidadeModif() {
        return agilidadeModif;
    }

    public void setAgilidadeModif(int agilidadeModif) {
        this.agilidadeModif = agilidadeModif;
    }

    public int getResistenciaFisicaModif() {
        return resistenciaFisicaModif;
    }

    public void setResistenciaFisicaModif(int resistenciaFisicaModif) {
        this.resistenciaFisicaModif = resistenciaFisicaModif;
    }

    public int getResistenciaMentalModif() {
        return resistenciaMentalModif;
    }

    public void setResistenciaMentalModif(int resistenciaMentalModif) {
        this.resistenciaMentalModif = resistenciaMentalModif;
    }
}
