# 💊 Controle de Medicamentos Idosos

## 📌 Problema

Muitas pessoas, especialmente idosos, possuem dificuldade em lembrar de tomar seus medicamentos corretamente, seja por esquecimento, falta de organização ou ausência de acompanhamento.

Isso pode comprometer tratamentos e afetar diretamente a saúde e qualidade de vida.

---

## 💡 Solução

Esta aplicação foi desenvolvida como uma ferramenta simples em linha de comando (CLI) para auxiliar no controle de medicamentos.

O sistema permite cadastrar medicamentos, acompanhar quais já foram tomados e manter uma organização básica da rotina.

---

## 👥 Público-alvo

* Idosos
* Cuidadores
* Pessoas com rotina de medicação contínua

---

## ⚙️ Funcionalidades

* ➕ Adicionar medicamento
* 📋 Listar medicamentos
* ✅ Marcar medicamento como tomado
* ❌ Remover medicamento
* 🔍 Visualizar status (tomado ou não)

---

## 🛠️ Tecnologias utilizadas

* Java
* Maven
* JUnit

---

## 📂 Estrutura do projeto

```
meu-projeto/
├── src/
├── tests/
├── README.md
├── pom.xml
├── .github/workflows/ci.yml
```

---

## ▶️ Como executar o projeto

### Pré-requisitos:

* Java 17 ou superior
* Maven instalado

### Passos:

```bash
mvn compile
mvn exec:java
```

---

## 🧪 Como executar os testes

```bash
mvn test
```

---

## 🔍 Lint (análise estática)

```bash
mvn checkstyle:check
```

---

## 🔄 Integração Contínua (CI)

O projeto utiliza GitHub Actions para executar automaticamente:

* Build do projeto
* Testes automatizados
* Verificação de qualidade (lint)

Sempre que há um **push** ou **pull request**.

---

## 📦 Versionamento

Este projeto segue o padrão de versionamento semântico:

```
1.0.0
```

* MAJOR: mudanças grandes
* MINOR: novas funcionalidades
* PATCH: correções

---

## 👤 Autor

Isabella Silva e Sena

---

## 🔗 Repositório
https://github.com/IsabellaSenaa/controle-medicamentos-idosos.git
---
