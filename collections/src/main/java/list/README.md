# Exercícios de List em Java

## Operações Básicas com List

### 1. Lista de Tarefas

Crie uma classe chamada "ListaTarefas" que possua uma lista de tarefas como atributo. Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição. Implemente os seguintes métodos:

- `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa à lista com a descrição fornecida.
- `removerTarefa(String descricao)`: Remove uma tarefa da lista com base em sua descrição.
- `obterNumeroTotalTarefas()`: Retorna o número total de tarefas na lista.
- `obterDescricoesTarefas()`: Retorna uma lista contendo a descrição de todas as tarefas da lista.

### 2. Carrinho de Compras

Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online. O carrinho deve ser implementado como uma lista de itens. Cada item é representado por uma classe chamada "Item" que possui atributos como nome, preço e quantidade. Implemente os seguintes métodos:

- `adicionarItem(String nome, double preco, int quantidade)`: Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
- `removerItem(String nome)`: Remove um item do carrinho com base no seu nome.
- `calcularValorTotal()`: Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
- `exibirItens()`: Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.

## Pesquisa em List

### 1. Catálogo de Livros

Crie uma classe chamada "CatalogoLivros" que possui uma lista de objetos do tipo "Livro" como atributo. Cada livro possui atributos como título, autor e ano de publicação. Implemente os seguintes métodos:

- adicionarLivro(Livro livro): Adiciona um livro ao catálogo.
- pesquisarPorAutor(String autor): Pesquisa livros por autor e retorna uma lista com os livros encontrados.
- pesquisarPorIntervaloAnos(int anoInicial, int anoFinal): Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
- pesquisarPorTitulo(String titulo): Pesquisa livros por título e retorna o primeiro livro encontrado.

---

## Ordenação em List

### 1. Ordenação de Pessoas

Crie uma classe chamada `OrdenacaoPessoas` que possua uma lista de objetos do tipo `Pessoa` como atributo. Cada pessoa possui atributos como nome, idade e altura. Implemente os seguintes métodos:

- `adicionarPessoa(String nome, int idade, double altura)`: Adiciona uma pessoa à lista.
- `ordenarPorIdade()`: Ordena as pessoas da lista por idade usando a interface Comparable.
- `ordenarPorAltura()`: Ordena as pessoas da lista por altura usando um Comparator personalizado.

### 2. Ordenação de Números

Crie uma classe chamada `OrdenacaoNumeros` que possua uma lista de números inteiros como atributo. Implemente os seguintes métodos:

- `adicionarNumero(int numero)`: Adiciona um número à lista.
- `ordenarAscendente()`: Ordena os números da lista em ordem ascendente usando a interface Comparable e as Collections.
- `ordenarDescendente()`: Ordena os números da lista em ordem descendente usando um Comparable e as Collections.
Claro! Abaixo está a informação organizada de forma clara e apropriada para um ficheiro **Markdown**, com títulos e descrições bem estruturadas:


## Classe `AgendaContatos`

A classe `AgendaContatos` simula uma aplicação básica de agenda de contatos. Ela permite adicionar, remover, exibir e pesquisar contatos por nome. Cada contato é armazenado com o **nome como chave** e o **telefone como valor**.

---

## Métodos

### 1. `adicionarContato(String nome, Integer telefone)`

Adiciona um novo contato à agenda, associando o nome ao número de telefone.

**Parâmetros:**

- `nome` (String): O nome do contato.
- `telefone` (Integer): O número de telefone do contato.

---

### 2. `removerContato(String nome)`

Remove um contato da agenda com base no nome.

**Parâmetros:**

- `nome` (String): O nome do contato que deve ser removido.

---

### 3. `exibirContatos()`

Exibe todos os contatos da agenda. Para cada contato, é mostrado o nome e o número de telefone correspondente.

**Saída:**

- Lista de todos os contatos no formato `Nome: Telefone`.

---

- `pesquisarPorNome(String nome)`
Pesquisa um contato na agenda pelo nome e retorna o número de telefone correspondente.

**Parâmetros:**

- `nome` (String): O nome do contato a ser pesquisado.

**Retorno:**

- O número de telefone (Integer) associado ao nome informado, se encontrado.

