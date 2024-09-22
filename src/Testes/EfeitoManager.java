package Testes;

import Personagens.Efeitos;

import java.util.ArrayList;

public class EfeitoManager {
    private static ArrayList<Efeitos> efeitosDisponiveis = new ArrayList<>();

    // Método para inicializar todos os efeitos
    public static void inicializarEfeitos() {
        efeitosDisponiveis.add(new Efeitos(
                "Curar",
                "Cura",
                false,
                false,
                1,
                100,
                100,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0
        ));

        efeitosDisponiveis.add(new Efeitos(
                "Buff de Energia",
                "Buff",
                false,
                false,
                1,
                3,
                3,
                3,
                3,
                3,
                3,
                3,
                3,
                3,
                3,
                3
        ));

        efeitosDisponiveis.add(new Efeitos(
                "Machucar",
                "Dano",
                false,
                true,
                1,
                -30,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0
        ));

        efeitosDisponiveis.add(new Efeitos(
                "Buff de Metodo de Cultivo",
                "Buff",
                false,
                false,
                1,
                4,
                4,
                4,
                4,
                4,
                4,
                4,
                4,
                4,
                4,
                4
        ));
        // Adicione mais efeitos conforme necessário
    }

    // Método para retornar todos os efeitos
    public static ArrayList<Efeitos> getEfeitosDisponiveis() {
        return new ArrayList<>(efeitosDisponiveis); // Retorna uma cópia da lista para evitar modificação direta
    }

    // Buscar efeito por nome (ou outro critério)
    public static Efeitos buscarEfeitoPorNome(String nome) {
        for (Efeitos efeito : efeitosDisponiveis) {
            if (efeito.getNomeEfeito().equalsIgnoreCase(nome)) {
                return efeito;
            }
        }
        return null; // Ou lançar uma exceção se necessário
    }
}

