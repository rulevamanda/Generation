CREATE DATABASE db_empresa;
USE db_empresa;
CREATE TABLE tb_funcionaries  (
    id_usuario INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255),
    nascimento DATE,
    genero VARCHAR(255),
    salario FLOAT NULL,
    UNIQUE (id_usuario),
    PRIMARY KEY (id_usuario)
);

INSERT INTO tb_funcionaries (nome, nascimento, genero, salario)
VALUES
('Camila', '1981-03-12', 'fem', 2300.6),
('Adalberto', '1981-06-03', 'masc', 2500.3),
('Wellington', '1981-10-01', 'masc', 1500.0),
('Alex', '1981-12-04', 'masc', 3200.3),
('Giovanna', '1981-11-21', 'fem', 2200.7);

SELECT nome, salario
FROM tb_funcionaries
WHERE salario > 2000; 

SELECT nome, salario
FROM tb_funcionaries
WHERE salario < 2000; 

SET SQL_SAFE_UPDATES = 0;
UPDATE tb_funcionaries
SET salario = salario + 500;