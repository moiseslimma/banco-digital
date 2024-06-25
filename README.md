# Criando um Banco Digital com Java e Orientação a Objetos

Aplicação simples de simulação de operações bancárias em Java. Este projeto inclui funcionalidades básicas de conta corrente e poupança, como depósito, saque e transferência, além de permitir o acompanhamento do histórico de transações.

## Estrutura do Projeto
### O projeto é dividido em várias classes e interfaces que representam diferentes entidades e funcionalidades do sistema bancário:

  Banco: Representa o banco, contendo uma lista de contas.
  Cliente: Representa um cliente do banco.
  Conta: Classe abstrata representando uma conta bancária genérica.
  ContaCorrente: Subclasse de Conta representando uma conta corrente.
  ContaPoupanca: Subclasse de Conta representando uma conta poupança.
  IConta: Interface que define operações básicas de uma conta bancária.
  TipoTransacao: Enumeração que define os tipos de transações (SAQUE, DEPOSITO, TRANSFERENCIA).
  Transacao: Representa uma transação bancária.
  Main: Classe principal que contém o método main para execução do programa.
  
### Funcionalidades
  Criar contas: Conta Corrente e Conta Poupança.
  Realizar operações: Saque, Depósito, Transferência.
  Imprimir extratos: Exibir informações da conta e histórico de transações.
  Gerenciamento de contas: Adicionar e remover contas do banco.
