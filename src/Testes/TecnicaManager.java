package Testes;

import Personagens.Efeitos;
import Personagens.Tecnica;

import java.util.ArrayList;

public class TecnicaManager {
    private static ArrayList<Tecnica> tecnicasDisponiveis = new ArrayList<>();

    // Método para inicializar todas as técnicas
    public static void inicializarTecnicas() {
        ArrayList<Efeitos> listaEfeitos1 = new ArrayList<>();
        listaEfeitos1.add(EfeitoManager.buscarEfeitoPorNome("Machucar"));

        tecnicasDisponiveis.add(new Tecnica("Punhos do Dragão", "Combate", false, listaEfeitos1));

        ArrayList<Efeitos> listaEfeitos2 = new ArrayList<>();
        listaEfeitos2.add(EfeitoManager.buscarEfeitoPorNome("Machucar"));

        tecnicasDisponiveis.add(new Tecnica("Defesa da Serpente", "Defesa", true, listaEfeitos2));

        // Adicione mais técnicas conforme necessário
    }

    // Método para retornar todas as técnicas
    public static ArrayList<Tecnica> getTecnicasDisponiveis() {
        return new ArrayList<>(tecnicasDisponiveis); // Retorna uma cópia da lista
    }

    // Buscar técnica por nome
    public static Tecnica buscarTecnicaPorNome(String nome) {
        for (Tecnica tecnica : tecnicasDisponiveis) {
            if (tecnica.getNomeTecnica().equalsIgnoreCase(nome)) {
                return tecnica;
            }
        }
        return null; // Ou lançar uma exceção, se necessário
    }
}

