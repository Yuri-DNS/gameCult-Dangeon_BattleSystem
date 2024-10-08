import Personagens.*;
import Testes.EfeitoManager;
import Testes.EnergiaManager;
import Testes.TecnicaManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        EfeitoManager.inicializarEfeitos();

        EnergiaManager.inicializarEnergias();

        TecnicaManager.inicializarTecnicas();

        ArrayList<Tecnica> lTec1 = new ArrayList<>();
        lTec1.add(TecnicaManager.buscarTecnicaPorNome("Punhos do Dragão"));

        ArrayList<Efeitos> lista2 = new ArrayList<>();
        lista2.add(EfeitoManager.buscarEfeitoPorNome("Buff de Metodo de Cultivo"));

        MetodoCultivo metodo = new MetodoCultivo("Arte Proibida", EnergiaManager.buscarEnergiaPorNome("KI do Dragão"), lista2);

        Jogador jogador1 = new Jogador(metodo, lTec1, lista2, "Yo Rin",
                10,
                10,
                10,
                10,
                10,
                10,
                10,
                10,
                10,
                10,
                10
        );

        ArrayList<Efeitos> lista3 = new ArrayList<>();
        lista3.add(EfeitoManager.buscarEfeitoPorNome("Curar"));

        System.out.println(jogador1.getNomeJogador()+" "+jogador1.getVidaAtual());

        jogador1.aplicarEfeitosExternos(lista3);

        System.out.println(jogador1.getVidaAtual());

        ArrayList<Efeitos> lista4 = new ArrayList<>();
        lista4.add(EfeitoManager.buscarEfeitoPorNome("Machucar"));

        jogador1.aplicarEfeitosExternos(lista4);

        System.out.println(jogador1.getVidaAtual());


    }
}