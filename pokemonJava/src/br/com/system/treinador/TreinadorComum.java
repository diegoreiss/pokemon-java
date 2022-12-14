package br.com.system.treinador;

import br.com.system.mochila.Mochila;
import br.com.system.pokemon.Genero;
import java.util.ArrayList;
import java.util.List;

public class TreinadorComum extends Treinador {

    private List<Insignia> insignias;

    public TreinadorComum(String nome, int idade, Genero genero, Mochila mochila) {
        super(nome, idade, genero, mochila);
        this.insignias = new ArrayList<>();
    }

    public List<Insignia> getInsignias() {
        return insignias;
    }

    public void setInsignias(List<Insignia> insignias) {
        this.insignias = insignias;
    }

    @Override
    public void mostrarCartao() {
        System.out.println("==============================");
        System.out.println("      CARTAO DE TREINADOR     ");
        System.out.println("==============================");
        System.out.println("NOME: " + getNome());
        System.out.println("Pokemons: ");
        mostrarPokemons();
        System.out.println("Insígnias: ");
        try {
            mostrarInsignias();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
        System.out.println("==============================");
    }

    private void mostrarInsignias() throws Exception {
        if (insignias.isEmpty()) {
            throw new Exception("Sem insígnias");
        }

        for (Insignia insignia : insignias) {
            try {
                System.out.printf("     %s%n", insignia.getNome());
            } catch (NullPointerException nullPointerException) {
                break;
            }
        }
    }

    public void receberInsignia(Insignia insignia) throws Exception {
        if (isExisteInsignia(insignia)) {
            throw new Exception("Treinador " + getNome() + " já possui essa insígnia");
        } else {
            insignias.add(insignia);
        }
    }

    private boolean isExisteInsignia(Insignia insignia) {
        for (Insignia insigniaMochila : insignias) {
            if (insigniaMochila.equals(insignia)) {
                return true;
            }
        }

        return false;
    }
}
