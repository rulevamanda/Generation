CREATE DATABASE db_empresa;
USE db_empresa;
CREATE TABLE tb_funcionaries  (
    id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255),
    sobrenome VARCHAR(255),
    nascimento DATE,
    genero VARCHAR(255),
    salario FLOAT NULL,
    UNIQUE (id),
    PRIMARY KEY (id)
);

INSERT INTO tb_funcionaries (nome, sobrenome, nascimento, genero, salario)
VALUES
('Camila', 'Albuquerque', '1981-03-12', 'fem', 2300.6),
('Adalberto', 'Geniba', '1981-06-03', 'masc', 2500.3),
('Wellington', 'Souza', '1981-10-01', 'masc', 1500.0),
('Alex', 'Ramirez', '1981-12-04', 'masc', 3200.3),
('Giovanna', 'Santos', '1981-11-21', 'fem', 2200.7);

SELECT nome, salario
FROM tb_funcionaries
WHERE salario > 2000; 

SELECT nome, salario
FROM tb_funcionaries
WHERE salario < 2000; 

SET SQL_SAFE_UPDATES = 0;

UPDATE tb_funcionaries
SET salario = salario + 500;