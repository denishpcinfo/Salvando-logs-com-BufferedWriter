# Salvando logs com BufferedWriter

## Descrição
`PDVLoggerAvancado` é um sistema simples em **Java** que registra eventos de um Ponto de Venda (PDV) em um arquivo de log. Diferente da versão básica, este sistema utiliza **BufferedWriter** para gravação eficiente e incremental dos logs, garantindo melhor desempenho ao lidar com grandes volumes de dados.

## Tecnologias Utilizadas
- **Java 11+**
- **BufferedWriter & FileWriter** para escrita otimizada em arquivos
- **LocalDateTime** para registro de data e hora nos logs

## Estrutura do Projeto
```
├── logs/
│   ├── pdv_detalhado.log  # Arquivo onde os logs serão armazenados
├── PDVLoggerAvancado.java  # Classe principal do programa
```

## Como Usar

### 1️⃣ Compilar o Programa
Abra o terminal na pasta do projeto e execute:
```sh
javac PDVLoggerAvancado.java
```

### 2️⃣ Executar o Programa
```sh
java PDVLoggerAvancado
```

### 3️⃣ Funcionamento
O programa realiza as seguintes operações:
1. **Registra eventos** no arquivo `logs/pdv_detalhado.log`.
2. Cada evento é salvo com data e hora.

Exemplo de saída no arquivo de log:
```
2025-03-18T12:30:45 - Item adicionado: Produto A, Quantidade: 2, Valor: R$ 100,00
2025-03-18T12:31:00 - Pagamento realizado via Pix.
2025-03-18T12:31:15 - Cupom fiscal gerado.
```

## Possíveis Melhorias
- Implementar leitura dos logs diretamente pelo programa.
- Adicionar diferentes níveis de log (**INFO, WARN, ERROR**).
- Integrar com **SLF4J + Logback** para logging mais robusto.
- Permitir configuração do arquivo de log via argumentos.

