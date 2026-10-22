# Atividade Aula 11 - Padrões Estruturais II: Decorator e Composite

## Resolução das Etapas Teóricas

### 1. Cálculo da Explosão Combinatória
Atualmente existem 4 subclasses para atender 3 características opcionais. A fórmula de combinações possíveis é $2^n$ (onde *n* é o número de características independentes). Se a secretaria pedisse uma quarta característica (rodapé com data), o número de combinações possíveis saltaria para $2^4$, ou seja, seriam necessárias **16 subclasses** para cobrir todos os cenários possíveis sem o padrão Decorator.

### 2. Decisão de Projeto: Métodos adicionar() e remover()
Optei por manter o método `adicionar` apenas na classe composta (`Modulo`), seguindo a abordagem adotada na apostila. Essa decisão **preserva a segurança de tipos** em tempo de compilação. Se esse método fosse colocado na interface comum `ItemCurricular`, a classe folha (`Disciplina`) seria forçada a implementá-lo. Como uma disciplina não pode conter subitens, ela teria que lançar uma exceção ou ignorar a chamada, o que violaria o Princípio da Substituição de Liskov (LSP).