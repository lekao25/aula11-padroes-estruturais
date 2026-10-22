package siga;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIGA - Aula 11: Decorator e Composite ===");

        System.out.println("\n1) Relatorios: Decoradores Empilhados");
        Relatorio base = new RelatorioDeAlunos();
        
        // Etapa 3: Montando duas pilhas diferentes
        Relatorio pilha1 = new ComMarcaDagua(new ComCabecalho(base));
        Relatorio pilha2 = new ComCabecalho(new ComNumeracao(base));

        System.out.println("   --- Pilha 1: Cabecalho + Marca D'agua ---");
        System.out.println(pilha1.gerar());
        
        System.out.println("\n   --- Pilha 2: Numeracao + Cabecalho ---");
        System.out.println(pilha2.gerar());

        System.out.println("\n2) Estrutura curricular: Padrão Composite");
        Modulo curso = new Modulo("DSM - Desenvolvimento de Software Multiplataforma");

        Modulo primeiro = new Modulo("1o semestre");
        primeiro.adicionar(new Disciplina("Algoritmos", 80));
        primeiro.adicionar(new Disciplina("Banco de Dados I", 60));

        Modulo segundo = new Modulo("2o semestre");
        segundo.adicionar(new Disciplina("Tecnicas de Programacao II", 80));
        segundo.adicionar(new Disciplina("Desenvolvimento Web II", 80));

        // Etapa 5: Acrescentando submódulo de terceiro nível
        Modulo trilhaEspecializacao = new Modulo("Trilha de Especializacao Cloud");
        trilhaEspecializacao.adicionar(new Disciplina("AWS Fundamentals", 40));
        segundo.adicionar(trilhaEspecializacao);

        curso.adicionar(primeiro);
        curso.adicionar(segundo);
        curso.adicionar(new Disciplina("Projeto Integrador", 40));

        curso.imprimir(1);
        System.out.println("   Carga total: " + curso.getCargaHoraria() + "h");
    }
}