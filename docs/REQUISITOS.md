# Sistema de Gerenciamento de Estoque

## Objetivo:

Resolver o problema de controle de estoque de peças de uma oficina de veículos automotivos. 
O dono não sabe o que tem no estoque ou a quantidade do que tem, não sabe o que entra ou sai e atualmente não faz nenhum tipo de gerenciamento do seu estoque.

---
## Usuários do Sistema

- Dono da oficina

## Problemas Identificados

- O que entra e sai do estoque não é registrado.
- Para saber o que está em falta, é precisa ir pessoalmente no estoque para verificar.
- Algumas peças não indicam o nome do veículo para qual ela foi feita, necessita de consultas com o fornecedor para saber
e isso não fica registrado em nenhum lugar, para futuras pesquisas da mesma peça.
- Não tem acesso ao valor que pagou em peças mais antigas no estoque.
- Precisa calcular na mão um valor de 30% de lucro em cima de cada peça comprada para ver o valor de venda.

## Requisitos Funcionais

- RF01 - Cadastrar peça nova, informando nome, código e quantidade mínima que deve possuir em estoque.
- RF02 - Registrar entrada de peça (compra), informando valor unitário e quantidade.
- RF03 - Registrar saída de peça (venda), indicando quantidade.
- RF04 - Buscar peça pelo nome ou código, exibindo o histórico de compras (data, quantidade e valor unitário).
- RF05 - Cadastrar modelo e ano de veículos compatíveis com determinada peça.
- RF06 - Calcular automaticamente o valor de venda da peça, somando 30% ao valor da última compra registrada.
- RF07 - Listar estoque e alertar peças com pouca quantidade.
- RF08 - Listar peças compatíveis com um veículo informado (modelo e ano).

## Requisitos Não Funcionais

- Aplicação deverá ser feita apenas no console, utilizando Java puro.
- Os dados ficam apenas em memória e não são salvos entre execuções.

## Regras de negócio

- O valor de venda usa a última compra registrada, e o percentual de 30% é uma constante.
- Não é possível dar saída em quantidade maior que a quantidade disponível.
- O código de cada peça é único.

## Validações básicas

- O valor unitário da compra não pode ser igual ou menor que zero.
- A quantidade de entrada e de saída deve ser maior que zero.
- A quantidade mínima não pode ser negativa.
- O nome e o código da peça não podem ser vazios.
