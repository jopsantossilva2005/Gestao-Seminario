# Gestão de Seminários

Projeto desenvolvido utilizando **Programação Orientada a Objetos (POO)** em Java.

## Descrição

Este projeto simula um sistema de gestão de seminários, onde é possível associar alunos, professores e seminários de acordo com as regras de negócio definidas.

## Regras de Negócio

1. **Aluno**:
   - Um aluno pode estar associado a **apenas um seminário**.

2. **Seminário**:
   - Um seminário pode ter **nenhum ou vários alunos**.
   - Todo seminário deve ter um **local** definido.

3. **Professor**:
   - Um professor pode ministrar **nenhum ou vários seminários**.

### Relacionamentos

- Um `Aluno` está associado a um `Seminario`.
- Um `Seminario` pode ter múltiplos `Aluno` e um `Local`.
- Um `Professor` pode estar associado a múltiplos `Seminario`.

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/jopsantossilva2005/Gestao-Seminario.git

2. Execute o Projeto dentro da pasta Seminarioteste01

