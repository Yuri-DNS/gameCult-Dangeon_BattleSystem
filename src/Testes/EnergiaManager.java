package Testes;

import Personagens.Efeitos;
import Personagens.Energia;

import java.util.ArrayList;

public class EnergiaManager {
    private static ArrayList<Energia> energiasDisponiveis = new ArrayList<>();

    // Método para inicializar todas as energias
    public static void inicializarEnergias() {
        ArrayList<Efeitos> listaEfeitos1 = new ArrayList<>();
        listaEfeitos1.add(EfeitoManager.buscarEfeitoPorNome("Buff de Energia"));

        energiasDisponiveis.add(new Energia("KI do Dragão", "Yang", listaEfeitos1));

        ArrayList<Efeitos> listaEfeitos2 = new ArrayList<>();
        listaEfeitos2.add(EfeitoManager.buscarEfeitoPorNome("Buff de Metodo de Cultivo"));

        energiasDisponiveis.add(new Energia("Aura Sagrada", "Yin", listaEfeitos2));

        // Adicione mais energias conforme necessário
    }

    // Método para retornar todas as energias
    public static ArrayList<Energia> getEnergiasDisponiveis() {
        return new ArrayList<>(energiasDisponiveis); // Retorna uma cópia da lista
    }

    // Buscar energia por nome
    public static Energia buscarEnergiaPorNome(String nome) {
        for (Energia energia : energiasDisponiveis) {
            if (energia.getNomeEnergia().equalsIgnoreCase(nome)) {
                return energia;
            }
        }
        return null; // Ou lançar uma exceção, se necessário
    }
}
