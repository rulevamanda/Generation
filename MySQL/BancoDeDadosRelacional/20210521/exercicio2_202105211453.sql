DROP DATABASE db_pizzaria_legal;
CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

CREATE TABLE tb_categoria (
id_categoria INT AUTO_INCREMENT NOT NULL,
nome VARCHAR (255),
transporte VARCHAR (255),
valor INT,
UNIQUE (id_categoria),
PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_pizza (
id_pizza INT AUTO_INCREMENT NOT NULL,
nome VARCHAR (255),
ingrediente1 VARCHAR (255),
ingrediente2 VARCHAR (255),
fk_categoria INT,
valor INT,
UNIQUE (id_pizza),
PRIMARY KEY (id_pizza),
FOREIGN KEY (fk_categoria) REFERENCES tb_categoria(id_categoria)
);

INSERT INTO tb_categoria (nome, transporte, valor)
VALUES
('buscar', 'nenhum', 0),
('delivery_express', 'teletransporte', 1000),
('delivery_comum', 'motoboy', 10),
('delivery_festa', 'van', 50),
('embalagem_presente', 'motoboy', 15);

INSERT INTO tb_pizza (nome, ingrediente1, ingrediente2, fk_categoria, valor)
VALUES
('margherita', 'queijo', 'tomate', 3, 30),
('sapo', 'queijo', 'brocoli', 2, 40),
('doce', 'chocolate', 'granulado_colorido', 4, 45),
('avestruz', 'frango', 'ovo', 3, 80),
('magma', 'pimenta', 'gengibre', 5, 15),
('eclodir', 'ovo', 'manjericão', 3, 30),
('rivotril', 'queijo', 'bacon', 4, 30),
('espada', 'blueberry', 'marshmallow', 5, 30);

SELECT nome, valor
FROM tb_pizza
WHERE valor > 45; 

SELECT nome, valor
FROM tb_pizza
WHERE valor BETWEEN 29 AND 60; 

SELECT * FROM tb_pizza
WHERE nome LIKE '%c%';

SELECT tb_categoria.transporte AS transporte
FROM tb_pizza
INNER JOIN tb_categoria
ON tb_pizza.fk_categoria = tb_categoria.id_categoria
GROUP BY tb_categoria.transporte;

SELECT * FROM tb_pizza
WHERE fk_categoria = 3;