package siga;

public abstract class DecoradorRelatorio implements Relatorio {
    protected Relatorio relatorioEmbutido;

    public DecoradorRelatorio(Relatorio relatorio) {
        this.relatorioEmbutido = relatorio;
    }

    @Override
    public String gerar() {
        return relatorioEmbutido.gerar();
    }
}