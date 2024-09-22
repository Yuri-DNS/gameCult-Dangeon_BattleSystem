package Personagens;

import java.util.ArrayList;

public class Jogador extends Cultivador {

    public String nomeJogador;

    public Jogador(MetodoCultivo metodoCultivo, ArrayList<Tecnica> tecnicas, ArrayList<Efeitos> efeitos, String nomeJogador, int vidaBase, int kiBase, int menteBase, int reflexoBase, int percepcaoBase, int precisaoBase, int constituicaoBase, int forcaBase, int agilidadeBase, int resistenciaFisicaBase, int resistenciaMentalBase) {
        super(vidaBase, kiBase, menteBase, reflexoBase, percepcaoBase, precisaoBase, constituicaoBase, forcaBase, agilidadeBase, resistenciaFisicaBase, resistenciaMentalBase, metodoCultivo, tecnicas, efeitos);
        this.nomeJogador = nomeJogador;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

}
