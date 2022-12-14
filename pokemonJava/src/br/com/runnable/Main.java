package br.com.runnable;

import br.com.system.batalha.*;
import br.com.system.mochila.*;
import br.com.system.pokemon.*;
import br.com.system.treinador.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicío do programa na linha 258

// ===================================================================
        Tipo agua = new Tipo("Água");
        Tipo fogo = new Tipo("Fogo");
        Tipo planta = new Tipo("Planta");
        Tipo eletrico = new Tipo("Elétrico");
        Tipo terra = new Tipo("Terra");                // Tipos
        Tipo normal = new Tipo("Normal");
        Tipo lutador = new Tipo("Lutador");
        Tipo voador = new Tipo("Voador");
        Tipo pedra = new Tipo("Pedra");
// ===================================================================

// ===================================================================
        // Atribuindo as fraquezas e pontos fortes dos tipos

        // Fraqueza | Forte tipo agua
        agua.getFracoContra().add(planta);
        agua.getFracoContra().add(eletrico);
        agua.getForteContra().add(fogo);

        // Fraqueza | Forte tipo fogo
        fogo.getFracoContra().add(agua);
        fogo.getForteContra().add(planta);

        // Fraqueza | Forte tipo planta
        planta.getFracoContra().add(fogo);
        planta.getFracoContra().add(voador);
        planta.getForteContra().add(agua);

        // Fraqueza | Forte tipo eletrico
        eletrico.getFracoContra().add(terra);
        eletrico.getForteContra().add(agua);

        // Fraqueza | Forte tipo terra
        terra.getFracoContra().add(agua);
        terra.getFracoContra().add(planta);
        terra.getForteContra().add(eletrico);

        // Fraqueza | Forte tipo normal;
        normal.getFracoContra().add(lutador);

        // Fraqueza | Forte tipo Lutador;
        lutador.getForteContra().add(normal);
        lutador.getFracoContra().add(voador);

        // Fraqueza | Forte tipo voador
        voador.getFracoContra().add(eletrico);
        voador.getForteContra().add(lutador);
        voador.getForteContra().add(planta);

        // Fraqueza | Forte tipo pedra
        pedra.getFracoContra().add(agua);
        pedra.getFracoContra().add(planta);
        pedra.getForteContra().add(fogo);
        pedra.getForteContra().add(voador);

// ===================================================================


// ===================================================================
        // Movimentos


        // Movimentos agua
        Movimento bolha = new Movimento("Bolhas", 40, "Um spray de bolhas incontáveis é lançado no Pokémon adversário.", agua);
        Movimento surfar = new Movimento("Surfar", 90, "O usuário ataca tudo ao seu redor inundando seus arredores com uma onda gigante.", agua);
        Movimento hidroBomba = new Movimento("Hidro Bomba", 110, "O alvo é atingido por um grande volume de água lançado sob grande pressão.", agua);
        Movimento pistolaDagua = new Movimento("Pistola D'agua", 40, "O alvo é atingido com um forte tiro de água.", agua);

        // Movimentos fogo
        Movimento socoDeFogo = new Movimento("Soco de Fogo", 75, "O alvo é perfurado com um punho de fogo. Isso também pode deixar o alvo queimado.", fogo);
        Movimento lancaChamas = new Movimento("Lança-Chamas", 90, "O alvo é queimado com uma intensa explosão de fogo.", fogo);
        Movimento explosaoIncendiaria = new Movimento("Explosão Incendiária", 110, "O alvo é atacado com uma explosão intensa de fogo que tudo consome.", fogo);
        Movimento brasa = new Movimento("Brasa", 40, "O alvo é atacado com pequenas chamas.", fogo);

        // Movimentos planta
        Movimento absorver = new Movimento("Absorver", 20, "Um ataque de drenagem de nutrientes.", planta);
        Movimento raioSolar = new Movimento("Raio Solar", 120, "Lança um feixe solar.", planta);
        Movimento folhaNavalha = new Movimento("Folha Navalha", 55, "Folhas de gume afiado são lançadas para cortar o Pokémon adversário.", planta);
        Movimento gigaDreno = new Movimento("Giga Dreno", 75, "Um ataque de drenagem de nutrientes.", planta);

        // Movimentos eletrico
        Movimento trovao = new Movimento("Trovão", 110, "Um impiedoso raio é lançado no alvo para infligir danos.", eletrico);
        Movimento socoDeTrovao = new Movimento("Soco de Trovão", 75, "O alvo é socado com um punho eletrificado.", eletrico);
        Movimento raio = new Movimento("Raio", 90, "Uma forte explosão elétrica atinge o alvo.", eletrico);
        Movimento faisca = new Movimento("Faísca", 65, "O usuário lança uma investida eletricamente carregada no alvo.", eletrico);

        // Movimentos terra
        Movimento terremoto = new Movimento("Terremoto", 100, "O usuário desencadeia um terremoto que atinge todos os Pokémon ao seu redor.", terra);
        Movimento bombaDeLama = new Movimento("bombaDeLama", 65, "O usuário lança uma bola de lama compacta para atacar.", terra);
        Movimento tiroDeLama = new Movimento("TiroDeLama", 55, "O usuário ataca lançando um pouco de lama no alvo.", terra);
        Movimento poderDaTerra = new Movimento("Poder Da Terra", 90, "O usuário faz o solo sob o alvo explodir com força.", terra);

        // Movimentos normal
        Movimento pancadaCorporal = new Movimento("Pancada Corporal", 85, "O usuário cai sobre o alvo com todo o peso de seu corpo.", normal);
        Movimento hiperRaio = new Movimento("Hiper Raio", 100, "O alvo é atacado com um poderoso feixe.", normal);
        Movimento megaSoco = new Movimento("Mega Soco", 80, "O alvo é golpeado por um soco desferido com força muscular.", normal);
        Movimento investida = new Movimento("Investida", 40, "Um ataque físico no qual o usuário investe e bate no alvo com todo o corpo.", normal);

        // Movimentos lutador
        Movimento chuteDuplo = new Movimento("Chute Duplo", 60, "O alvo é chutado rapidamente duas vezes seguidas usando os dois pés.", lutador);
        Movimento chuteDePuloAlto = new Movimento("Chute De Pulo Alto", 80, "O alvo é atacado com uma joelhada em um salto.", lutador);
        Movimento quebraTijolos = new Movimento("Quebra-Tijolos", 75, "O usuário ataca com um corte rápido.", lutador);
        Movimento explosaoFocalizada = new Movimento("Explosao Focalizada", 120,"O usuário aumenta seu foco mental e libera seu poder.", lutador);

        // Movimentos voador
        Movimento lufadaDeVento = new Movimento("Lufada De Vento", 40,"Uma rajada de vento é chicoteada pelas asas e lançada no alvo para causar danos.", voador);
        Movimento ataqueDeAsa = new Movimento("Ataque de Asa", 60, "O alvo é atingido com asas grandes e imponentes, bem abertas para infligir danos.", voador);
        Movimento explosaoAerea = new Movimento("Explosão Aérea", 100, "Um vórticd de ar é disparado contra o alvo para infligir danos.", voador);
        Movimento asDosAres = new Movimento("Ás dos Ares", 60, "O usuário confunde o alvo com a velocidade e então corta.", voador);

        // Movimentos pedra
        Movimento lancamentoDeRocha = new Movimento("Lançamento De Rocha", 50, "O usuário pega e joga uma pequena pedra no alvo para atacar.", pedra);
        Movimento deslizeDePedras = new Movimento("Deslize de Pedras", 75, "Pedras grandes são arremessadas contra o Pokémon adversário para infligir danos.", pedra);
        Movimento explosaoDeRocha = new Movimento("Explosão de Rocha", 125, "O usuário arremessa pedras duras no alvo.", pedra);
        Movimento tumbaDeRochas = new Movimento("Tumba de Rochas", 60, "Pedras são arremessadas contra o alvo.", pedra);

// ===================================================================

// ===================================================================
        // Pokemons

        // Pokemon Charizard
        Pokemon charizard = new Pokemon("Charizard", 225, Genero.MASCULINO, Arrays.asList(fogo, voador));
        charizard.aprenderMovimento(investida);
        charizard.aprenderMovimento(lancaChamas);
        charizard.aprenderMovimento(explosaoIncendiaria);
        charizard.aprenderMovimento(explosaoAerea);

        // Pokemon Venosauro
        Pokemon venosauro = new Pokemon("Venosauro", 245, Genero.FEMININO, Collections.singletonList(planta));
        venosauro.aprenderMovimento(investida);
        venosauro.aprenderMovimento(raioSolar);
        venosauro.aprenderMovimento(folhaNavalha);
        venosauro.aprenderMovimento(gigaDreno);

        // Pokemon Blastoise
        Pokemon blastoise = new Pokemon("Blastoise", 300, Genero.MASCULINO, Collections.singletonList(agua));
        blastoise.aprenderMovimento(investida);
        blastoise.aprenderMovimento(hidroBomba);
        blastoise.aprenderMovimento(surfar);
        blastoise.aprenderMovimento(pistolaDagua);

        // Pokemon pikachu
        Pokemon pikachu = new Pokemon("Pikachu", 215, Genero.MASCULINO, Collections.singletonList(eletrico));
        pikachu.aprenderMovimento(investida);
        pikachu.aprenderMovimento(raio);
        pikachu.aprenderMovimento(trovao);
        pikachu.aprenderMovimento(faisca);

        // Pokemon onix
        Pokemon onix = new Pokemon("Onix", 200, Genero.MASCULINO, Collections.singletonList(pedra));
        onix.aprenderMovimento(investida);
        onix.aprenderMovimento(explosaoDeRocha);
        onix.aprenderMovimento(lancamentoDeRocha);
        onix.aprenderMovimento(deslizeDePedras);

        // Pokemon dugtrio
        Pokemon dugtrio = new Pokemon("Dugtrio", 200, Genero.FEMININO, Collections.singletonList(terra));
        dugtrio.aprenderMovimento(investida);
        dugtrio.aprenderMovimento(terremoto);
        dugtrio.aprenderMovimento(tiroDeLama);
        dugtrio.aprenderMovimento(poderDaTerra);

        // Pokemon pidgeot
        Pokemon pidgeot = new Pokemon("Pidgeot", 200, Genero.MASCULINO, Arrays.asList(normal, voador));
        pidgeot.aprenderMovimento(investida);
        pidgeot.aprenderMovimento(asDosAres);
        pidgeot.aprenderMovimento(ataqueDeAsa);
        pidgeot.aprenderMovimento(lufadaDeVento);

        // Pokemon hitmonchan
        Pokemon hitmonchan = new Pokemon("Hitmonchan", 250, Genero.FEMININO, Collections.singletonList(lutador));
        hitmonchan.aprenderMovimento(socoDeFogo);
        hitmonchan.aprenderMovimento(socoDeTrovao);
        hitmonchan.aprenderMovimento(explosaoFocalizada);
        hitmonchan.aprenderMovimento(quebraTijolos);

        // Pokemon Snorlax
        Pokemon snorlax = new Pokemon("Snorlax", 350, Genero.MASCULINO, Collections.singletonList(normal));
        snorlax.aprenderMovimento(terremoto);
        snorlax.aprenderMovimento(hiperRaio);
        snorlax.aprenderMovimento(pancadaCorporal);
        snorlax.aprenderMovimento(deslizeDePedras);

// ===================================================================

// ===================================================================

        // Itens Da Mochila

        // Poções
        Pocao superPotion = new Pocao("Super Potion", 150);
        Pocao megaPotion = new Pocao("Mega Potion", 400);

        // Pokebolas
        Pokebola superBall = new Pokebola("SuperBall");
        Pokebola megaBall = new Pokebola("Mega Ball");

// ===================================================================


// ===================================================================
        // Mochila

        Mochila mochilaDoAsh = new Mochila(15);
        Mochila mochilaDoLeon = new Mochila(10);
        Mochila mochilaDoBrock = new Mochila(20);

        mochilaDoAsh.adicionarItem(superPotion, 1);
        mochilaDoAsh.adicionarItem(megaPotion, 10);
        mochilaDoAsh.adicionarItem(superBall, 2);
        mochilaDoAsh.adicionarItem(megaBall, 1);

// ===================================================================

// ===================================================================
        // Treinadores e Ginásios

        TreinadorComum ash = new TreinadorComum("Ash", 10, Genero.MASCULINO, mochilaDoAsh);
        ash.capturarPokemon(venosauro);
        ash.capturarPokemon(pikachu);
        ash.capturarPokemon(pidgeot);
        ash.capturarPokemon(blastoise);

        TreinadorComum leon = new TreinadorComum("Leon", 12, Genero.MASCULINO, mochilaDoLeon);
        leon.capturarPokemon(dugtrio);
        leon.capturarPokemon(hitmonchan);
        leon.capturarPokemon(snorlax);

        // Ginasio
        Insignia insigniaDePedra = new Insignia("Insígnia De Pedra", "é uma pedra");
        Insignia insigniaAgua = new Insignia("Insígnia Água", "formato de gota");
        Ginasio ginasioDePedra = new Ginasio("Ginásio de Pedra");
        ginasioDePedra.setInsignia(insigniaDePedra);

        LiderDeGinasio brock = new LiderDeGinasio("Brock", 15, Genero.MASCULINO, mochilaDoBrock);
        brock.capturarPokemon(onix);

        ginasioDePedra.setDoador(brock);
        brock.setGinasio(ginasioDePedra);

// ===================================================================

// ===================================================================
        // Início do programa

        Scanner sc = new Scanner(System.in);
        int opcaoBatalha;

        System.out.println("Qual tipo de batalha deseja escolher?\n\n" +
                "[1] - Batalha com Pokemon Selvagem\n" +
                "[2] - Batalha com outro Treinador Pokemon\n" +
                "[3] - Batalha com Líder De Ginásio\n\n" +
                "[4] - Sair do programa");

        do {
            System.out.print("\n>> ");
            opcaoBatalha = sc.nextInt();
        } while (opcaoBatalha < 1 || opcaoBatalha > 4);

        if (opcaoBatalha == 4) {
            System.out.println("Programa encerrado!");
        } else {
            switch (opcaoBatalha) {
                case 1:
                    BatalhaVsPokemonSelvagem batalhaVSPokemonSelvagem = new BatalhaVsPokemonSelvagem(ash, charizard);
                    batalhaVSPokemonSelvagem.iniciarBatalha();
                    break;
                case 2:
                    BatalhaVsTreinadorComum batalhaVsTreinadorComum = new BatalhaVsTreinadorComum(ash, leon);
                    batalhaVsTreinadorComum.iniciarBatalha();
                    break;
                case 3:
                    BatalhaVsLider batalhaVsLider = new BatalhaVsLider(ash, brock);
                    batalhaVsLider.iniciarBatalha();
            }
        }
    }
}
