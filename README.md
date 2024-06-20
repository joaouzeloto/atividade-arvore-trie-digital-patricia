# Atividade Prática: Árvore Trie, Digital e Patricia

## Introdução

As árvores PATRICIA (Practical Algorithm To Retrieve Information Coded In Alphanumeric) foram definidas em 1968 por Donald Morrison. Elas são uma forma compactada de Tries, onde caminhos que possuem nós com apenas um filho são agrupados, otimizando o uso de espaço e aumentando a eficiência em algumas operações de busca e inserção.

## Objetivos da Atividade

### Implementação de Métodos

Nesta atividade, você deverá implementar diversos métodos para manipulação de uma árvore PATRICIA. Os principais métodos a serem implementados são:

1. **Inserir na Árvore PATRICIA**
2. **Exibir todas as palavras da árvore**
3. **Buscar uma palavra na árvore**
4. **Exibir todos os nós da árvore nível a nível**
5. **Desenhar o diagrama UML das classes**

## Detalhamento das Tarefas

### a) Inserir na Árvore PATRICIA

Cada nó da árvore PATRICIA possui:
- Um vetor de caracteres (índices de 0 a 25) representando as letras.
- Um número correspondente à posição da letra na string.
- Um vetor de ponteiros (índices de 0 a 25) para os próximos nós.
- Uma string representando a palavra armazenada.

Quando o último caractere de uma palavra é inserido na árvore, um novo nó é colocado logo abaixo deste, contendo a palavra.

#### Exemplo de Inserção

1. **Palavras: "galo" e "sola"**
   - A árvore começa com a inserção de "galo", seguida de "sola".

2. **Palavras: "galo", "gel", "sola"**
   - Ao inserir "gel", é necessário criar um nó entre o nó contendo a letra "g" e o nó contendo "galo", pois "galo" e "gel" diferem na segunda letra.

3. **Palavras: "galo", "gel", "sol", "sola"**
   - Ao inserir "sol", é necessário criar um nó com a letra "l", pois "sol" é parte de "sola" e "solo".

### b) Exibir Todas as Palavras da Árvore

Implementar um método iterativo para exibir todas as palavras armazenadas na árvore. Não pode ser usada nenhuma estrutura pronta do Java.

### c) Buscar uma Palavra na Árvore

Implementar um método para buscar uma determinada palavra na árvore. Este método deve ser eficiente e utilizar as características da árvore PATRICIA para realizar a busca.

### d) Exibir Todos os Nós da Árvore Nível a Nível

Implementar um método para exibir todos os nós da árvore, mostrando todas as informações de cada nó, nível a nível.

### e) Desenhar o Diagrama UML das Classes

Desenhar o diagrama UML de todas as classes utilizadas na implementação. Este diagrama deve incluir todas as classes e seus relacionamentos.

## Requisitos Adicionais

- Não use comandos de leitura! As chamadas dos métodos devem passar valores fixos. O programa deve rodar e apresentar os resultados sem a necessidade de entrada do usuário.
- Não use classes prontas do Java! Todas as classes devem ser criadas e estar no diagrama de classes.
- Faça a inserção de dezenas de palavras, não se limitando apenas aos exemplos dados.
