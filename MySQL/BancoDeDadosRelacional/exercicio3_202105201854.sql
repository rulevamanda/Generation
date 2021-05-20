DROP DATABASE db_escola;

CREATE DATABASE db_escola;
USE db_escola;

CREATE TABLE tb_alunos (
id BIGINT AUTO_INCREMENT NOT NULL,
nome VARCHAR (255),
sobrenome VARCHAR (255),
nascimento DATE,
genero VARCHAR (255),
nota DECIMAL (4,2),
UNIQUE (id),
PRIMARY KEY (id)
);

INSERT INTO tb_alunos (nome, sobrenome, nascimento, genero, nota)
	VALUES
    ('Chelle', 'Bernardo', '1992-11-13', 'fem', 10),
	('Antonio', 'Tomires', '2001-12-07', 'masc', 3),
    ('Bueno', 'Hernandez', '1992-07-13', 'masc', 8),
    ('Ricardo', 'Fritz', '1982-03-03', 'masc', 4),
    ('Amanda', 'Rulevas', '1991-08-19', 'fem', 10),
    ('Adalberto', 'Nobre', '1992-11-13', 'masc', 3),
    ('Clovis', 'Silva', '1998-10-19', 'masc', 0),
    ('Andrea', 'Andrade', '1993-05-13', 'fem', 8);
    
SELECT nome, nota
FROM tb_alunos
WHERE nota > 7;

SELECT nome, nota
FROM tb_alunos
WHERE nota < 7;

SET SQL_SAFE_UPDATES = 0;

UPDATE tb_alunos
SET nota = 8
WHERE nome = 'Adalberto';
