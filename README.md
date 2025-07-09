# estatistica-acidentes-java
Sistema em Java para cadastro e consulta de estatísticas de acidentes de trânsito em 10 cidades, com leitura/gravação de arquivos `.txt` e uso de classe abstrata, funções e procedimentos.

## 📌 Descrição

Projeto desenvolvido na disciplina de Linguagem de Programação com o objetivo de praticar conceitos de POO, arquivos, estruturas de repetição e controle de fluxo. O sistema cadastra dados sobre acidentes em cidades e permite consultas estatísticas com base nessas informações.

## 🎯 Objetivo

- Cadastrar 10 cidades com número de acidentes.
- Gravar os dados em um arquivo de texto (`Acidente.txt`).
- Permitir consultas como:
  - Cidades com quantidade de acidentes entre 100 e 500.
  - Cidade com menor e maior número de acidentes.
  - Cidades com acidentes acima da média das 10.

## 🛠️ Funcionalidades

- Cadastro de 10 cidades com código, nome e número de acidentes.
- Gravação e leitura de dados em arquivo `.txt`.
- Consultas estatísticas com menu interativo:
  - Acidentes entre 100 e 500.
  - Maior e menor número de acidentes.
  - Acima da média geral de acidentes.

## 🧱 Estrutura de Classes

### 🔸 Classe `Classe`

| Campo           | Tipo    | Descrição                        |
|-----------------|---------|----------------------------------|
| codigocidade    | `int`   | Código da cidade                 |
| nomecidade      | `String`| Nome da cidade                   |
| qntacidentes    | `int`   | Quantidade de acidentes registrados |

### 🔹 Classe `Regra`

Contém os principais métodos do sistema:
- `FCadastro()` – Cadastra os dados e grava no arquivo
- `Pquantidade()` – Consulta cidades com acidentes entre 100 e 500
- `Consulta()` – Exibe a cidade com menor e maior número de acidentes
- `Acidente()` – Mostra cidades com acidentes acima da média
- `Leitura()` – Lê os dados do arquivo para o vetor

### 🔹 Classe `Acidente`

Classe principal com o menu do sistema.

## 📁 Estrutura do Projeto
```
estatistica-acidentes-java/
│
├── README.md
├── Acidente.txt ← Arquivo gerado com os registros
└── src/
├── Acidente.java ← Classe com o menu principal
├── Classe.java ← Classe de dados (cidade)
└── Regra.java ← Métodos e consultas
```
## 💻 Tecnologias Utilizadas

- Java
- Orientação a objetos
- Leitura e gravação de arquivos `.txt`
- Estrutura de vetores e controle de fluxo
- IDE: NetBeans, Eclipse ou IntelliJ

## ▶️ Como Executar

1. Compile os arquivos da pasta `/src`.
2. Execute a classe `Acidente.java`.
3. Navegue pelo menu exibido com as opções:
```
1 - Cadastro Estatística
2 - Consulta por quantidade de acidentes
3 - Consulta por estatísticas de acidentes
4 - Acidentes acima da média das 10 cidades
9 - Finaliza
```

## 🗃️ Exemplo de Arquivo Gerado

O arquivo `Acidente.txt` é gerado após o cadastro e segue este padrão:
```
101
São Paulo
420
102
Campinas
95
...
```

Cada grupo de 3 linhas representa:
1. Código da cidade
2. Nome da cidade
3. Quantidade de acidentes

## 🏷️ Tags

`java` `acidentes` `estatística` `arquivo-txt` `poo` `ADS` `gravação` `leitura`
