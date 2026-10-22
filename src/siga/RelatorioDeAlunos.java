package siga;

public class RelatorioDeAlunos implements Relatorio {
    @Override
    public String gerar() {
        return "Maria Silva\nJoao Souza\nAna Pereira";
    }
}