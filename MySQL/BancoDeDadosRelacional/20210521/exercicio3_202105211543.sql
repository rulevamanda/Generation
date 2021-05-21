DROP DATABASE db_farmacia_do_bem;
CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;

CREATE TABLE tb_categoria (
id_categoria INT AUTO_INCREMENT NOT NULL,
nome VARCHAR (255),
estoque INT,
valor INT,
UNIQUE (id_categoria),
PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto (
id_produto INT AUTO_INCREMENT NOT NULL,
nome VARCHAR (255),
estoque INT,
fk_categoria INT,
valor INT,
tamanho VARCHAR (255),
UNIQUE (id_produto),
PRIMARY KEY (id_produto),
FOREIGN KEY (fk_categoria) REFERENCES tb_categoria(id_categoria)
);

INSERT INTO tb_categoria (nome, estoque, valor)
VALUES
('perfumaria', 3456, 234565),
('curativos', 4789, 8765456),
('analgésicos', 21098, 25843),
('medicamentos_controlados', 3654, 243463),
('carne', 398, 9843)
;

INSERT INTO tb_produto (nome, estoque, fk_categoria, valor, tamanho)
VALUES
('dorflex', 45, 3, 3.50, 'pequeno'),
('tylenol', 54, 3, 3.50, 'pequeno'),
('fralda', 23, 2, 21, 'pequeno'),
('desodorante', 17, 1, 8, 'pequeno'),
('rivotril', 13, 4, 43, 'pequeno'),
('antiácido', 76, 3, 6.50, 'pequeno'),
('protetor_solar', 35, 1, 18, 'pequeno'),
('bife', 138, 5, 17.50, 'pequeno')
;

SELECT nome, valor
FROM tb_produto
WHERE valor > 50; 

SELECT nome, valor
FROM tb_produto
WHERE valor BETWEEN 3 AND 60; 

SELECT * FROM tb_produto
WHERE nome LIKE '%b%';

SELECT tb_categoria.nome AS categoria
FROM tb_produto
INNER JOIN tb_categoria
ON tb_produto.fk_categoria = tb_categoria.id_categoria
GROUP BY tb_categoria.nome;

SELECT * FROM tb_produto
WHERE fk_categoria = 2;