# SmartBank

SmartBank é um sistema bancário simples, desenvolvido em Java, que simula operações bancárias como depósitos, saques, transferências e rendimentos. O projeto também inclui funcionalidades para exibir o histórico de transações e foi projetado com foco em organização, testes automatizados e boas práticas de programação.

---

## 📜 Índice

- [Descrição](#-descrição)
- [Funcionalidades](#-funcionalidades)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Como Executar](#-como-executar)
- [Testes](#-testes)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Contribuições](#-contribuições)

---

## 📝 Descrição

O SmartBank foi criado para simular um sistema bancário funcional com diferentes tipos de contas:
- **Conta Corrente**: Possui limite especial.
- **Conta Poupança**: Oferece rendimentos mensais.
- **Conta Investimento**: Gera rendimentos com taxas e maior retorno.

A aplicação é modular, escalável e segue boas práticas de design de software, sendo ideal para desenvolvedores que desejam aprender ou demonstrar habilidades com Java.

---

## 🚀 Funcionalidades

### 🏦 Operações Bancárias
- Depósitos
- Saques
- Transferências entre contas
- Aplicação de rendimentos (Poupança e Investimento)

### 📜 Histórico de Transações
- Registro detalhado de todas as operações realizadas em cada conta.

### 🔍 Testes Automatizados
- Testes unitários para validar funcionalidades principais como depósitos, saques e transferências.

---

## 📂 Estrutura do Projeto

A organização do projeto segue o padrão recomendado para projetos Java:

```
SmartBank/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── smartbank/
│   │   │   │   │   ├── app/
│   │   │   │   │   │   └── Main.java
│   │   │   │   │   ├── models/
│   │   │   │   │   │   ├── Cliente.java
│   │   │   │   │   │   ├── Conta.java
│   │   │   │   │   │   ├── ContaCorrente.java
│   │   │   │   │   │   ├── ContaInvestimento.java
│   │   │   │   │   │   └── ContaPoupanca.java
│   ├── test/
│       ├── java/
│           ├── com/
│               ├── smartbank/
│                   ├── models/
│                       └── ContaTest.java
├── build.gradle
├── gradlew
├── gradlew.bat
└── README.md
```

---

## 💻 Como Executar

### Pré-requisitos
- Java 17 ou superior
- Gradle 8.11.1 ou superior

### Passo a Passo

1. Clone o repositório:
   ```bash
   git clone https://github.com/O-Farias/SmartBank.git
   cd SmartBank
   ```

2. Compile o projeto:
   ```bash
   ./gradlew build
   ```

3. Execute a aplicação:
   ```bash
   ./gradlew run
   ```

4. Navegue pelo menu interativo para explorar as funcionalidades.

---

## ✅ Testes

O projeto inclui testes automatizados utilizando **JUnit**. Para executar os testes:

1. Execute o comando:
   ```bash
   ./gradlew test
   ```

2. Confira o relatório de testes gerado no terminal ou no diretório `build/reports/tests/test/index.html`.

---

## 🛠 Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **JUnit**: Biblioteca para testes unitários.
- **Gradle**: Ferramenta de build e gerenciamento de dependências.

---

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*.

### Passos para Contribuir
1. Faça um fork do repositório.


2. Crie uma nova branch:
   ```bash
   git checkout -b minha-feature
   ```
3. Faça as alterações e commit:
   ```bash
   git commit -m "feat: minha nova feature"
   ```
4. Envie as alterações:
   ```bash
   git push origin minha-feature
   ```
5. Abra um pull request.

---

Desenvolvido por **O-Farias**. 🚀
