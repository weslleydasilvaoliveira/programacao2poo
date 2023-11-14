import java.time.LocalDate;
/*Autores:
 * André Souza dos Santos
 * Daniel Rodrigues Mendes
 * Gabriel Silva Rodrigues
 * Weslley Da Silva Oliveira
 */

import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Campeonato c1 = new Campeonato(2023, "Copa do Brasil");
		
		Time t1 = new Time("Vasco");
		Endereco ed1 = new Endereco("Rua vasco", 13, "Vascao", "Ipanema");
		Estadio e1 = new Estadio(ed1, "Sao Januario");
		t1.setEstadioSede(e1);
		
		Time t2 = new Time("Cruzeiro");
		Endereco ed2 = new Endereco("Rua Atletico", 14, "MG", "Belo");
		Estadio e2 = new Estadio(ed2, "Mineirao");
		t2.setEstadioSede(e2);
		
		Time t3 = new Time("Fluminense");
		Endereco ed3 = new Endereco("Rua fluzao", 20, "FLU", "Tricolor");
		Estadio e3 = new Estadio(ed3, "Maracana");
		t3.setEstadioSede(e3);
		
		Partida p1 = new Partida(LocalDate.parse("2023-09-15"), 20, 13, t1, t2);
		Partida p2 = new Partida(LocalDate.parse("2023-10-11"), 8, 10, t2, t1);
		Partida p3 = new Partida(LocalDate.parse("2023-09-22"), 19, 15, t3, t1);
		Partida p4 = new Partida(LocalDate.parse("2023-11-18"), t1, t3);
		Partida p5 = new Partida(LocalDate.parse("2023-11-30"), t2, t3);
		Partida p6 = new Partida(LocalDate.parse("2023-11-25"), t3, t2);
		
		
		Jogador j1 = new Jogador("Ramon", LocalDate.parse("1978-08-09"), "Masculino", 1.72);
		Jogador j2 = new Jogador("Juninho", LocalDate.parse("1977-09-19"), "Masculino", 1.71);
		t1.addJogador(j1);
		t1.addJogador(j2);
		t1.setCapitao(j1);
		
		
		Jogador j3 = new Jogador("Alves", LocalDate.parse("1998-03-09"), "Masculino", 1.73);
		Jogador j4 = new Jogador("Everto", LocalDate.parse("1988-08-09"), "Masculino", 1.74);
		t2.addJogador(j3);
		t2.addJogador(j4);
		t2.setCapitao(j4);
		
		Jogador j5 = new Jogador("Ana", LocalDate.parse("1995-05-15"), "Feminino", 1.65);
		Jogador j6 = new Jogador("Bruno", LocalDate.parse("1993-02-22"), "Masculino", 1.80);
		t3.addJogador(j5);
		t3.addJogador(j6);
		t3.setCapitao(j6);
		
		
		c1.addTimes(t1); 
		c1.addTimes(t2); 
		c1.addTimes(t3); 
		
		c1.addPartida(p1);
		c1.addPartida(p2);
		c1.addPartida(p3);
		c1.addPartida(p4);
		c1.addPartida(p5);
		c1.addPartida(p6);
		
		
		
		Scanner scanner = new Scanner(System.in);
		int opcao;
		while (true) {
		    System.out.println("Menu de Opcoes:");
		    System.out.println("1 - Ver as partidas ocorridas e que irao ocorrer");
		    System.out.println("2 - Listar a tabela do campeonato apresentando os times");
		    System.out.println("3 - Listar a tabela do campeonato apresentando os times em ordem");
		    System.out.println("4 - Criar novo time");
		    System.out.println("5 - Criar nova partida");
		    System.out.println("6 - Sair");

		    System.out.print("Escolha uma opcao: ");
		    opcao = scanner.nextInt();
		    scanner.nextLine();

		    switch (opcao) {
		        case 1:
		            List<Partida> partidasOcorridas = c1.listarPartidasOcorridas();
		            System.out.println("Partidas ja ocorridas:");
		            for (Partida partida : partidasOcorridas) {
		                System.out.println(partida);
		            }
		            List<Partida> partidasNaoOcorridas = c1.listarPartidasNaoOcorridas();
		            System.out.println("Partidas que irao ocorrer:");
		            for (Partida partida : partidasNaoOcorridas) {
		                System.out.println(partida);
		            }
		            break;

		        case 2:
		            List<Time> tabelaCampeonato = c1.listarTabelaDoCampeonatoSemOrdem();
		            System.out.println("Tabela do campeonato (times):");
		            for (Time time : tabelaCampeonato) {
		                System.out.println(time);
		            }
		            break;
		        case 3:
		            List<Time> tabelaCampeonatoEmOrdem = c1.listarTabelaDoCampeonato();
		            System.out.println("Tabela do campeonato (times em ordem):");
		            for (Time time : tabelaCampeonatoEmOrdem) {
		                System.out.println(time);
		            }
		            break;

		        case 4:
		            System.out.println("Criando novo time...");
		            System.out.print("Digite o nome do time: ");
		            String nomeTime = scanner.nextLine();
		            Time time = new Time(nomeTime);

		            // Criando o endereço
		            System.out.print("Digite o endereco (String rua, Integer numero, String nome do bairro, String nome da cidade): ");
		            String enderecoInput = scanner.nextLine();
		            String[] enderecoSeparado = enderecoInput.split(",");
		            String rua = enderecoSeparado[0].trim();
		            int numero = Integer.parseInt(enderecoSeparado[1].trim());
		            String nomeBairro = enderecoSeparado[2].trim();
		            String cidade = enderecoSeparado[3].trim();
		            Endereco endereco = new Endereco(rua, numero, nomeBairro, cidade);

		            // Criando o estádio
		            System.out.print("Digite o nome do estadio: ");
		            String nomeEstadio = scanner.nextLine();
		            Estadio estadio = new Estadio(endereco, nomeEstadio);
		            time.setEstadioSede(estadio);

		            // Criando jogadores
		            int opcaoJogadores;
		            do {
		                System.out.println("1 - Adicionar jogador ao time");
		                System.out.println("2 - Sair");

		                System.out.print("Escolha uma opção: ");
		                opcaoJogadores = scanner.nextInt();
		                scanner.nextLine();

		                switch (opcaoJogadores) {
		                    case 1:
		                        System.out.print("Digite os dados do jogador (nome, data de nascimento no formato aaaa-mm-dd, genero, altura): ");
		                        String jogadorInput = scanner.nextLine();
		                        String[] jogadorSeparado = jogadorInput.split(",");
		                        String nomeJogador = jogadorSeparado[0].trim();
		                        LocalDate dataNascimento = LocalDate.parse(jogadorSeparado[1].trim());
		                        String genero = jogadorSeparado[2].trim();
		                        double altura = Double.parseDouble(jogadorSeparado[3].trim());

		                        Jogador jogador = new Jogador(nomeJogador, dataNascimento, genero, altura);
		                        time.addJogador(jogador);

		                        break;

		                    case 2:
		                        System.out.println("Saindo do menu de criacao de jogadores.");
		                        break;

		                    default:
		                        System.out.println("Opcao inválida. Por favor, escolha uma opção valida.");
		                }
		            } while (opcaoJogadores != 2);

		            // Setando o capitão do time
		            System.out.print("Digite o nome do jogador capitao: ");
		            String nomeCapitao = scanner.nextLine();

		            Jogador capitao = null;
		            for (Jogador jogador : time.getJogadores()) {
		                if (jogador.getNome().equalsIgnoreCase(nomeCapitao)) {
		                    capitao = jogador;
		                    break;
		                }
		            }

		            if (capitao != null) {
		                time.setCapitao(capitao);
		            } else {
		                System.out.println("Jogador nao encontrado na lista de jogadores do time.");
		            }

		            c1.addTimes(time);
		            break;
		            
		        case 5:
		            System.out.print("Digite a data da partida (no formato aaaa-mm-dd): ");
		            LocalDate dataPartida = LocalDate.parse(scanner.nextLine());
		            System.out.println("Escolha o mandante da partida:");
		            List<Time> times = c1.getTimes();
		            for (int i = 0; i < times.size(); i++) {
		                System.out.println(i + ". " + times.get(i).getNome());
		            }
		            int escolhaTime = scanner.nextInt();
		            Time team = times.get(escolhaTime);
		            System.out.println("Escolher o visitante da partida:");
		            for (int i = 0; i < times.size(); i++) {
		                if (i != escolhaTime) {
		                    System.out.println(i + ". " + times.get(i).getNome());
		                }
		            }
		            int escolhaOutroTime = scanner.nextInt();
		            Time outroTime = times.get(escolhaOutroTime);
		            Partida novaPartida = new Partida(dataPartida, team, outroTime);
		            c1.addPartida(novaPartida);
		            System.out.println("Partida criada: " + novaPartida);
		            break;
		        case 6:
		            System.out.println("Saindo do programa.");
		            System.exit(0);
		            scanner.close();
		        
		        default:
		            System.out.println("Opcao invalida. Por favor, escolha uma opcao valida.");
		    }
		}
		
	}
        	
}
