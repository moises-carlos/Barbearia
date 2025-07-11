# 💈 Sistema de Barbearia em Java

Projeto desenvolvido durante a disciplina de **Programação Orientada a Objetos (POO)** no Grau Técnico. O sistema simula o funcionamento de uma barbearia, utilizando os principais conceitos da orientação a objetos em Java: enums, classes abstratas, interfaces, herança, polimorfismo e manipulação de filas com prioridade.

---

## ⚙️ Funcionalidades

- Cadastro de clientes com estilo de corte desejado.
- Cadastro de barbeiros com especialidades e disponibilidade.
- Fila de atendimento dinâmica, com prioridade para clientes com agendamento.
- Interface para simular ações de corte, descoloração e pintura de cabelo.
- Sistema de agendamento por dia da semana, associando cliente e barbeiro.
- Lógica de atendimento com priorização de agendamentos no início do dia.

---

## 🧱 Estrutura do Projeto

- **Enums:**
  - `DiaSemana`: de segunda a sábado.
  - `Especialidade`: tesoura, máquina, descolorir, pintar.
  - `EstiloCorte`: clássico, moderno, alternativo.

- **Classe Abstrata:**
  - `Pessoa`: com atributos `nome`, `cpf` e `telefone`. Possui o método abstrato `aguardar()`.

- **Interface:**
  - `CortarDescolorirPintar`: métodos `cortarCabelo()`, `descolorirCabelo()` e `pintarCabelo()`.

- **Classes:**
  - `Barbeiro`: herda de `Pessoa`, implementa a interface. Possui `especialidade` e `disponibilidade`. Executa cortes e gerencia a fila.
  - `Cliente`: herda de `Pessoa`. Possui `estilo de corte` e método `entrarNaFila()`.
  - `Agendamento`: vincula cliente e barbeiro a um `dia da semana`, adicionando o cliente na primeira posição da fila no dia agendado.

---

## 🧪 Conceitos Trabalhados

- Orientação a Objetos (POO)
- Herança, Polimorfismo, Abstração, Encapsulamento
- Enumerações e Interfaces
- Estrutura de dados: Fila (`Queue`)
- Simulação de atendimento com prioridade
- Manipulação de listas e lógica de agendamento

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java
- **Paradigma:** Orientação a Objetos

---

## 👨‍🏫 Atividade Proposta por:

**Professor Germain Cavalcanti**  
Atividade extra para reforço dos conceitos de POO com base em um cenário realista.

---
## ✍️ Autor

**Moisés Carlos**  
Sistema para Internet – UNICAP  
Recife/PE  
🔗 [https://www.linkedin.com/in/moises-carlos29/]
