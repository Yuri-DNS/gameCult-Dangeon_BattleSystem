package Personagens;

import java.util.ArrayList;

public class MetodoCultivo {

    private String nomeMetodo;
    private Energia energia;
    private ArrayList<Efeitos> efeitoStatus;

    public MetodoCultivo(String metodoNome, Energia energia, ArrayList<Efeitos> efeitoStatus) {
        this.nomeMetodo = metodoNome;
        this.energia = energia;
        this.efeitoStatus = efeitoStatus;
    }

    public String getNomeMetodo() {
        return nomeMetodo;
    }

    public void setNomeMetodo(String nomeMetodo) {
        this.nomeMetodo = nomeMetodo;
    }

    public Energia getEnergia() {
        return energia;
    }

    public void setEnergia(Energia energia) {
        this.energia = energia;
    }

    public ArrayList<Efeitos> getEfeitoStatus() {
        return efeitoStatus;
    }

    public void setEfeitoStatus(ArrayList<Efeitos> efeitoStatus) {
        this.efeitoStatus = efeitoStatus;
    }
}
