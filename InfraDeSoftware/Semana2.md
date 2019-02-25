# Processos

## Structure

- Stack
- Heap
- Data
- Text

## States

- New -> Admitted
- Ready -> Scheduler dispatch
- Running -> I/O or Event wait | interrupt
- Waiting
- Terminated

## Queue

- Ready Queue -> CPU
- I/O Request -> I/O Wait Queue -> I/O
- Time slice expired
- Create Child Process

## Job Schedule

- Agendamento longo
- Agendamento curto
- Agendamento de troca

### Process Control Block

- Process State
- Process Number
- Program counter
- Registers
- Memory limits
- list of open files
- ...

## Process Spawn

- fock() - exec()
- Execucao

  - Pais e filhos concorrentes
  - pais esperam filhos finalizarem

- Recursos

  - Compartilham todos os recursos
  - filhos compartilham parte dos recursos
  - nada compartilham

- Espacos de enderecos
  - Filhos duplicam dos pais
  - filhos tem um novo

## Process termination

- exit()

## Communication Inter Process

- Memory Share
- Message Queue

## Trocas de mensagens

- Como os links são estabelecidos?
- Um mesmo link para +1 processo?
- Quantos links entre cada par de processos?
- Qual a capacidade de um link?
