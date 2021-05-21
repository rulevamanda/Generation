CREATE DATABASE db_e_commerce;
USE db_e_commerce;
CREATE TABLE tb_produtos  (
    id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255),
    tamanho VARCHAR(255),
    cor VARCHAR(255),
    embalagem VARCHAR(255),
    valor FLOAT NULL,
    UNIQUE (id),
    PRIMARY KEY (id)
);

INSERT INTO tb_produtos (nome, tamanho, cor, embalagem, valor)
VALUES
('miniatura', 'pequeno', 'azul', 'caixa', 300.0),
('caneca', 'médio', 'preto', 'caixa', 508.0),
('camiseta', 'grande', 'roxo', 'envelope plástico', 880.0),
('meias', 'pequeno', 'rosa', 'nenhuma', 380.0),
('camiseta', 'pequeno', 'azul', 'envelope plástico', 808.0),
('cinto', 'médio', 'rosa', 'caixa', 370.0),
('caderno', 'médio', 'branco', 'nenhuma', 350.0);


SELECT nome, valor
FROM tb_produtos
WHERE valor > 500; 

SELECT nome, valor
FROM tb_produtos
WHERE valor < 500; 

SET SQL_SAFE_UPDATES = 0;

UPDATE tb_produtos
SET valor = valor - valor*0.15
WHERE nome = 'caneca';
