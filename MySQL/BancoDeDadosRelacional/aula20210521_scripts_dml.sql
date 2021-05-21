-- JOINS
-- INNER JOIN: Retorna registros que possuem valores correspondentes em ambas as tabelas
-- LEFT JOIN: Retorna todos os registros da tabela da esquerda e os registros correspondentes da tabela da direita
-- RIGHT JOIN: Retorna todos os registros da tabela da direita e os registros correspondentes da tabela da esquerda
-- FULL JOIN: Retorna todos os registros quando há uma correspondência na tabela da esquerda ou da direita

-- Listar Atendimento de funcionarios em Mesas
SELECT nome AS Funcionario, descricao_mesa AS Atendeu
FROM tb_funcionarios
INNER JOIN tb_vendas
ON tb_funcionarios.id_usuario = tb_vendas.fk_funcionario
GROUP BY descricao_mesa;

-- Lista saida de pratos no restaurante (Comportamento mostra todo o lado esquerdo, mesmo os elementos que não foram vendidos)
SELECT nome_prato AS Prato, COUNT(*) AS saidas
FROM tb_produtos
LEFT JOIN tb_vendas
ON tb_produtos.id_prato = tb_vendas.fk_produto
GROUP BY nome_prato;

-- Lista saida de pratos por Mesa (Comportamento mostra todos os pratos)
SELECT descricao_mesa AS Mesa, COUNT(*) AS saidas
FROM tb_produtos
RIGHT JOIN tb_vendas
ON tb_produtos.id_prato = tb_vendas.fk_produto
GROUP BY descricao_mesa;

-- Valor pago por Mesa (Função SUM())
SELECT descricao_mesa AS MESA, SUM(tb_produtos.preco) AS total_a_pagar
FROM tb_produtos
RIGHT JOIN tb_vendas
ON tb_produtos.id_prato = tb_vendas.fk_produto
GROUP BY descricao_mesa;

-- Media dos valores gastados por mesa (Função AVG())
SELECT descricao_mesa AS MESA, AVG(tb_produtos.preco) AS total_medio_pago
FROM tb_produtos
RIGHT JOIN tb_vendas
ON tb_produtos.id_prato = tb_vendas.fk_produto
GROUP BY descricao_mesa;

-- Retornando quem atendeu por mesa selecionada
SELECT nome AS Funcionario, descricao_mesa AS Atendeu
FROM tb_funcionarios
INNER JOIN tb_vendas
ON tb_funcionarios.id_usuario = tb_vendas.fk_funcionario
WHERE descricao_mesa IN ('MESA 7', 'MESA 12', "MESA 11");

-- Retornando quem Atende a mesa e o valor pago
SELECT nome AS Funcionario, descricao_mesa AS Mesa, SUM(preco) AS Valor_Pago
FROM tb_funcionarios
INNER JOIN tb_vendas ON tb_funcionarios.id_usuario = tb_vendas.fk_funcionario
INNER JOIN tb_produtos ON tb_produtos.id_prato = tb_vendas.fk_produto
GROUP BY descricao_mesa;

-- Retornando Tudo de Funcionario e Vendas com UNION (no lugar de FULL JOIN )
SELECT * FROM tb_funcionarios
LEFT JOIN tb_vendas ON tb_funcionarios.id_usuario = tb_vendas.fk_funcionario
UNION
SELECT * FROM tb_funcionarios
RIGHT JOIN tb_vendas ON tb_funcionarios.id_usuario = tb_vendas.fk_funcionario;

-- Saber se o valor de um prato esta entre um determinado range
SELECT * FROM tb_produtos
WHERE preco BETWEEN 1 AND 30;

-- Selecionar uma descrição pelo seu conteudo
SELECT * FROM tb_produtos
WHERE descricao_prato LIKE 'l%s';