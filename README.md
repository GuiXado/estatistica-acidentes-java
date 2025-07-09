# estatistica-acidentes-java
Sistema em Java para cadastrar e consultar estatísticas de acidentes de trânsito, utilizando leitura e gravação em arquivos .txt, laços, procedimentos, funções e conceitos de classe abstrata.

# Estatística de Acidentes em Java

Este projeto foi desenvolvido como exercício da disciplina de Linguagem de Programação. O sistema simula um menu para cadastro e consulta de estatísticas de acidentes em cidades, utilizando leitura e gravação de arquivos `.txt` em Java.

## 🎯 Objetivo

Permitir o cadastro de 10 cidades com informações sobre acidentes em 2020, armazenando os dados em um arquivo e oferecendo consultas com base nos critérios definidos.

## 🛠️ Funcionalidades

- Cadastro de estatísticas de acidentes (10 registros)
- Consulta por quantidade de acidentes entre 100 e 500
- Consulta por cidade com:
  - Maior número de acidentes
  - Menor número de acidentes
- Exibição das cidades com acidentes **acima da média**
- Gravação e leitura dos dados no arquivo `ArquivoEstatistica.txt`

## 🧱 Estrutura de Classes

### 🔹 Classe Abstrata: `Estatistica`
| Campo         | Tipo    | Descrição                        |
|---------------|---------|----------------------------------|
| codigoCidade  | `int`   | Código da cidade                 |
| nomeCidade    | `String`| Nome da cidade                   |
| qtdAcidentes  | `int`   | Quantidade de acidentes em 2020 |

### 🔹 Classe Principal
Responsável pelo menu e controle da aplicação.

### 🔹 ClasseMetodos
Contém os métodos:
- `fCadastraEstatistica()` – Função para cadastrar os 10 registros
- `pQtdAcidentes()` – Procedimento que exibe cidades com acidentes entre 100 e 500
- `pMaiorMenor()` – Procedimento que exibe cidade com maior e menor número de acidentes
- `pAcima()` – Procedimento que exibe cidades com número de acidentes **acima da média**

## 💾 Tecnologias Utilizadas

- Java
- Orientação a Objetos
- Manipulação de arquivos `.txt`
- IDE: Eclipse ou IntelliJ

## ▶️ Execução

1. Compile as classes
2. Execute a `ClassePrincipal`
3. Navegue pelo menu:

