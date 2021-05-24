DROP DATABASE db_cidade_das_carnes;
CREATE DATABASE db_cidade_das_carnes;
USE db_cidade_das_carnes;

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
peso INT,
UNIQUE (id_produto),
PRIMARY KEY (id_produto),
FOREIGN KEY (fk_categoria) REFERENCES tb_categoria(id_categoria)
);

INSERT INTO tb_categoria (nome, estoque, valor)
VALUES
('bovino', 3456, 234565),
('suíno', 4789, 8765456),
('peixes', 21098, 25843),
('frango', 3654, 243463),
('caça', 398, 9843);

INSERT INTO tb_produto (nome, estoque, fk_categoria, valor, peso)
VALUES
('carpa', 45, 3, 3.50, 1),
('tilápia', 54, 3, 3.50, 1),
('costela', 23, 2, 21, 1),
('lagarto', 17, 1, 8, 1),
('peito', 13, 4, 43, 1),
('salmão', 76, 3, 6.50, 1),
('coxão mole', 35, 1, 18, 1),
('javali', 138, 5, 17.50, 1);

SELECT nome, valor
FROM tb_produto
WHERE valor > 50; 

SELECT nome, valor
FROM tb_produto
WHERE valor BETWEEN 3 AND 60; 

SELECT * FROM tb_produto
WHERE nome LIKE '%c%';

SELECT tb_categoria.nome AS categoria
FROM tb_produto
INNER JOIN tb_categoria
ON tb_produto.fk_categoria = tb_categoria.id_categoria
GROUP BY tb_categoria.nome;

SELECT * FROM tb_produto
WHERE fk_categoria = 3;