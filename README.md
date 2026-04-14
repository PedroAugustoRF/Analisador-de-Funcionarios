# 📊 AnalisadorDeFuncionarios

Aplicação em Java para leitura e processamento de dados de funcionários a partir de um arquivo `.csv`, utilizando **Stream API** e conceitos de **programação funcional**.

---

## 🚀 Funcionalidades

* 📥 Leitura de arquivo CSV contendo:

  * Nome
  * Email
  * Salário

* 🔎 Filtra funcionários com salário maior que um valor informado

* 📧 Exibe os emails em ordem alfabética

* 💰 Calcula a soma dos salários de funcionários cujo nome começa com uma letra específica

---

## 🛠️ Tecnologias utilizadas

* Java
* Stream API
* Expressões Lambda
* Programação funcional
* Manipulação de arquivos com `BufferedReader`

---

## 📂 Formato do arquivo CSV

O arquivo deve seguir o seguinte padrão:

```
Nome,Email,Salario
Maria,maria@email.com,3200.00
Joao,joao@email.com,2500.00
Marcos,marcos@email.com,4100.00
```

---

## ▶️ Como executar

1. Clone o repositório:

```
git clone https://github.com/seu-usuario/AnalisadorDeFuncionarios.git
```

2. Abra o projeto em uma IDE Java (Eclipse, IntelliJ, VS Code, etc.)

3. Execute a aplicação

4. Informe:

   * Caminho do arquivo CSV
   * Salário mínimo para filtro
   * Letra inicial para cálculo da soma

---

## 🧠 Conceitos aplicados

* Uso de `Stream` para processamento de listas
* Operações:

  * `filter()`
  * `map()`
  * `sorted()`
  * `mapToDouble()`
  * `sum()`
* Programação funcional em Java
* Expressões lambda

---

## 📈 Exemplo de uso

Entrada:

```
Salário mínimo: 3000
Letra: M
```

Saída:

```
Emails dos funcionários com salário maior que 3000:
maria@email.com
marcos@email.com

Soma dos salários dos funcionários cujo nome começa com M: 7300.00
```

---

## 🔧 Possíveis melhorias

* Tratamento de exceções mais robusto
* Interface gráfica (GUI)
* Leitura de arquivos grandes (otimização)
* Testes automatizados (JUnit)

---

## 👨‍💻 Autor

Pedro Augusto Ribeiro Ferreira
