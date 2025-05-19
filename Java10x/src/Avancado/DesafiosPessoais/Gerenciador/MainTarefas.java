package Avancado.DesafiosPessoais.Gerenciador;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainTarefas {
    public static void main(String[] args) {
        Scanner caixadeentrada = new Scanner(System.in);
        List<TarefasCaracteristicas> listatarefas = new ArrayList<>();

        while (true) {
            System.out.println("======= Gerenciador de Tarefas =======");
            System.out.println("1 - Adicionar Tarefas");
            System.out.println("2 - Remover Tarefas");
            System.out.println("3 - Visualizar Tarefas");
            System.out.println("4 - Editar Tarefas");
            System.out.println("5 - Sair do Programa ");
            System.out.print("Digite a sua escolha: ");
            int escolha = caixadeentrada.nextInt();

            switch (escolha) {
                case 1:
                    List<String> camposdepreenchimento = Arrays.asList("Titulo", "Descrição", "Validade", "Prioridade", "Conclusao");
                    List<String> valorestemporarios = new ArrayList<>(camposdepreenchimento.size());
                    System.out.println("Adicione o Campo Corretamente. \nOu clique enter para deixar vazio");
                    System.out.println("=============================");
                    for (String campo : camposdepreenchimento) {
                        label:
                        switch (campo) {
                            case "Titulo":
                                caixadeentrada.nextLine();
                                System.out.println("Adicione o Titulo");
                                System.out.print("Titulo: ");
                                String titulo = caixadeentrada.nextLine().trim();

                                if (titulo.isEmpty()) {
                                    System.out.println("O titulo é Obrigatorio");
                                    while (titulo.isEmpty()) {
                                        System.out.print("Titulo: ");
                                        titulo = caixadeentrada.nextLine().trim();

                                        if (!titulo.isEmpty()) {
                                            valorestemporarios.add(titulo.replaceAll("\\s+", "").trim().toUpperCase());
                                        }
                                    }
                                } else {
                                    valorestemporarios
                                            .add(titulo.replaceAll("\\s+", "").trim().toUpperCase());
                                }
                                break;
                            case "Descrição":
                                System.out.println("Descreva o Objetivo da Tarefa");
                                System.out.print("Descrição: ");
                                String descricao = caixadeentrada.nextLine().trim();

                                if (descricao.isEmpty()) {
                                    System.out.println("A descrição é Obrigatoria");

                                    while (descricao.isEmpty()) {
                                        System.out.print("Descrição: ");
                                        descricao = caixadeentrada.nextLine().trim();

                                        if (!descricao.isEmpty()) {
                                            valorestemporarios.add(descricao.trim());
                                        }
                                    }
                                } else {
                                    valorestemporarios.add(descricao.trim());
                                }
                                break;
                            case "Validade":
                                System.out.println("Adicione a data da Tarefa \nApenas Numeros, não digite /");
                                System.out.print("Data: ");
                                String data = caixadeentrada.nextLine().trim().replaceAll("\\s+", "");

                                if (data.isEmpty()) {
                                    valorestemporarios.add(null);
                                } else {
                                    valorestemporarios.add(data);
                                }

                                break;
                            case "Prioridade":
                                System.out.println("Selecione a Prioridade da Tarefa");
                                System.out.println("Prioridade \n1 - Alta \n2 - Media \n3 - Baixa");
                                System.out.print("Escolha: ");
                                String campoprioridade = caixadeentrada.nextLine().trim().replaceAll("\\s+", "");

                                if (campoprioridade.isEmpty()) {
                                    System.out.println("Digite um valor valido");
                                    label1:
                                    while (true) {
                                        System.out.print("Escolha: ");
                                        campoprioridade = caixadeentrada.nextLine().trim().replaceAll("\\s+", "");
                                        switch (campoprioridade) {
                                            case "1":
                                                valorestemporarios.add("ALTA");
                                                break label1;
                                            case "2":
                                                valorestemporarios.add("MEDIA");
                                                break label1;
                                            case "3":
                                                valorestemporarios.add("BAIXA");
                                                break label1;
                                            default:
                                                System.out.println("Digite um valor valido");
                                        }
                                    }
                                } else {
                                    switch (campoprioridade) {
                                        case "1":
                                            valorestemporarios.add("ALTA");
                                            break;
                                        case "2":
                                            valorestemporarios.add("MEDIA");
                                            break;
                                        case "3":
                                            valorestemporarios.add("BAIXA");
                                            break;
                                        default:
                                            System.out.println("Escolha entre os valores 1, 2 e 3");
                                            while (true) {
                                                System.out.println("Escolha: ");
                                                campoprioridade = caixadeentrada.nextLine();
                                                int temp = Integer.parseInt(campoprioridade);
                                                if (temp < 4 && temp > 0) {
                                                    switch (temp) {
                                                        case 1:
                                                            valorestemporarios.add("ALTA");
                                                            break;
                                                        case 2:
                                                            valorestemporarios.add("MEDIA");
                                                            break;
                                                        case 3:
                                                            valorestemporarios.add("BAIXA");
                                                            break;
                                                    }
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case "Conclusao":
                                System.out.println("Selecione a situação da tarefa");
                                System.out.println("Conclusão \n1 - Conluida \n2 - Em Andamento \n3 - Pendente");
                                System.out.print("Escolha: ");
                                String statusconclusao = caixadeentrada.nextLine().trim().replaceAll("\\s+", "");

                                if (statusconclusao.isEmpty()) {
                                    valorestemporarios.add("DEFINIR");
                                } else {
                                    int valorconclusao = Integer.parseInt(statusconclusao);
                                    switch (valorconclusao) {
                                        case 1:
                                            valorestemporarios.add("CONCLUIDO");
                                            break;
                                        case 2:
                                            valorestemporarios.add("ANDAMENTO");
                                            break;
                                        case 3:
                                            valorestemporarios.add("PENDENTE");
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                    listatarefas.add(new TarefasCaracteristicas(valorestemporarios.getFirst(),
                                    valorestemporarios.get(1), valorestemporarios.get(2),
                                    valorestemporarios.get(3), valorestemporarios.get(4)) {});
                    break;
                case 2:
                    if (listatarefas.isEmpty()) {
                        System.out.println("========================");
                        System.out.println("Não tem tarefas armazenadas");
                    } else {
                        System.out.println("==== Qual tarefa deseja Excluir? ====");
                        List<String> posicaotarefas = IntStream.range(0, listatarefas.size())
                                .mapToObj(i -> (i + 1) + " - " + listatarefas.get(i).getTitulo())
                                .toList();
                        posicaotarefas.forEach(System.out::println);
                        System.out.print("Escolha: ");
                        int escolhaeclusao = caixadeentrada.nextInt();

                        if (escolhaeclusao > listatarefas.size() || escolhaeclusao < 1) {
                            System.out.println("Digite um valor valido");
                        } else {
                            listatarefas.remove(escolhaeclusao - 1);
                        }
                    }
                    break;
                case 3:
                    if (listatarefas.isEmpty()) {
                        System.out.println("========================");
                        System.out.println("Não tem tarefas armazenadas");
                    } else {
                        System.out.println("==== Tarefas Cadastradas ====");
                        List<String> posicaotarefas = IntStream.range(0, listatarefas.size())
                                .mapToObj(i -> (i + 1) + " - " + listatarefas.get(i).getTitulo())
                                .toList();
                        posicaotarefas.forEach(System.out::println);
                    }
                    break;
                case 4:
                    System.out.println("Qual tarefa deseja deseja?");
                    List<String> posicaotarefas = IntStream.range(0, listatarefas.size())
                            .mapToObj(i -> (i + 1) + " - " + listatarefas.get(i).getTitulo())
                            .toList();
                    posicaotarefas.forEach(System.out::println);

                    System.out.print("Escolha: ");
                    int escolhatarefaedicao = caixadeentrada.nextInt();

                    if (listatarefas.isEmpty()) {
                        System.out.println("A lista não tem tarefas cadastradas");
                    } else {
                        if (escolhatarefaedicao > listatarefas.size() || escolhatarefaedicao < 1) {
                            System.out.println("Você digitou um valor invalido");
                        } else {
                            System.out.println("Qual informação deseja mudar?");
                            System.out.println("1 - Titulo \n2 - Descriçao \n3 - Validade \n4 - Prioridade \n5 - Status \n");
                            System.out.print("Escolha: ");
                            int escolhaedicaoinformacaodatarefa = caixadeentrada.nextInt();

                            switch (escolhaedicaoinformacaodatarefa) {
                                case 1:
                                    System.out.print("Titulo Novo:  ");
                                    String novotitulo = caixadeentrada.nextLine().trim().replaceAll("\\s+", "").toUpperCase();

                                    if (novotitulo.isEmpty()){
                                        System.out.println("Você tentou por um dado obrigatorio como vazio");
                                    }  else {
                                        listatarefas.get(escolhatarefaedicao).setTitulo(novotitulo);
                                    }

                                break;
                                case 2:
                                    System.out.println("Nova  Descrição");
                                    String novadescricao = caixadeentrada.nextLine().trim();

                                    if (novadescricao.isEmpty()){
                                        System.out.println("Você tentou por um dado obrigatorio como vazio");
                                    } else {
                                        listatarefas.get(escolhatarefaedicao).setDescricao(novadescricao);
                                    }
                                    break;
                                case 3:
                                    System.out.println("Digite a nova data, não digite /");
                                    System.out.print("Nova data: ");
                                    String novadata = caixadeentrada.nextLine();
                                    listatarefas.get(escolhatarefaedicao).setDataVencimento(LocalDate.parse(novadata, DateTimeFormatter.ofPattern("ddMMyyyy")));
                                break;
                                case 4:

                                break;
                            }
                        }
                    }
                default:
                    if (escolha > 5) {
                        System.out.println("Digite um número valido");
                    }
                break;
            }
            if (escolha == 5) {
                System.out.println("Encerrando o Programa");
                caixadeentrada.close();
                break;
            }
        }

        }
    }

