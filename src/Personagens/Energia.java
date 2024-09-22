package Personagens;

import java.util.ArrayList;

public class Energia {

    private String nomeEnergia;
    private String energiaTipo;
    private ArrayList<Efeitos> efeitos;

    public Energia(String energiaNome, String energiaTipo, ArrayList<Efeitos> efeitos) {
        this.nomeEnergia = energiaNome;
        this.energiaTipo = energiaTipo;
        this.efeitos = efeitos;
    }

    public String getNomeEnergia() {
        return nomeEnergia;
    }

    public void setNomeEnergia(String nomeEnergia) {
        this.nomeEnergia = nomeEnergia;
    }

    public String getEnergiaTipo() {
        return energiaTipo;
    }

    public void setEnergiaTipo(String energiaTipo) {
        this.energiaTipo = energiaTipo;
    }

    public ArrayList<Efeitos> getEfeitos() {
        return efeitos;
    }

    public void setEfeitos(ArrayList<Efeitos> efeitos) {
        this.efeitos = efeitos;
    }
}
