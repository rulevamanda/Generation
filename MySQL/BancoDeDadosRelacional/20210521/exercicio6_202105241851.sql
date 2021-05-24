DROP DATABASE db_CursoDaMinhaVida;
CREATE DATABASE db_CursoDaMinhaVida;
USE db_CursoDaMinhaVida;

CREATE TABLE tb_categoria (
id_categoria INT AUTO_INCREMENT NOT NULL,
nome VARCHAR (255),
vagas INT,
valor INT,
UNIQUE (id_categoria),
PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_curso (
id_curso INT AUTO_INCREMENT NOT NULL,
nome VARCHAR (255),
vagas INT,
fk_categoria INT,
valor INT,
duracao INT,
UNIQUE (id_curso),
PRIMARY KEY (id_curso),
FOREIGN KEY (fk_categoria) REFERENCES tb_categoria(id_categoria)
);

INSERT INTO tb_categoria (nome, vagas, valor)
VALUES
('bootcamp', 3456, 234565),
('curto', 4789, 8765456),
('palestra', 21098, 25843),
('noturno', 3654, 243463),
('integral', 398, 9843);

INSERT INTO tb_curso (nome, vagas, fk_categoria, valor, duracao)
VALUES
('açogueiro', 45, 3, 3.50, 1),
('pedreiro', 54, 3, 3.50, 1),
('cozinheiro', 23, 2, 21, 1),
('escalada', 17, 1, 8, 1),
('marcenaria', 13, 4, 43, 1),
('programação', 76, 3, 6.50, 1),
('leitura de mentes', 35, 1, 18, 1),
('criador de joaninhas', 138, 5, 17.50, 1);

SELECT nome, valor
FROM tb_curso
WHERE valor > 50; 

SELECT nome, valor
FROM tb_curso
WHERE valor BETWEEN 3 AND 60; 

SELECT * FROM tb_curso
WHERE nome LIKE '%j%';

SELECT tb_categoria.nome AS categoria
FROM tb_curso
INNER JOIN tb_categoria
ON tb_curso.fk_categoria = tb_categoria.id_categoria
GROUP BY tb_categoria.nome;

SELECT * FROM tb_curso
WHERE fk_categoria = 5;