DROP DATABASE db_generation_game_online;
CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE tb_classe (
id_classe INT AUTO_INCREMENT NOT NULL,
nome VARCHAR (255),
escola VARCHAR (255),
habilidade VARCHAR (255),
UNIQUE (id_classe),
PRIMARY KEY (id_classe)
);

CREATE TABLE tb_personagem (
id_personagem INT AUTO_INCREMENT NOT NULL,
nome VARCHAR (255),
raça VARCHAR (255),
fk_classe INT,
ataque VARCHAR (255),
defesa VARCHAR (255),
UNIQUE (id_personagem),
PRIMARY KEY (id_personagem),
FOREIGN KEY (fk_classe) REFERENCES tb_classe(id_classe)
);

INSERT INTO tb_classe (nome, escola, habilidade)
VALUES
('Necromante', 'magia', 'arcana'),
('Bárbaro', 'destrução', 'força'),
('Ladino', 'furtividade', 'destreza'),
('Druida', 'magia', 'arcana'),
('Clérigo', 'magia', 'religião');

INSERT INTO tb_personagem (nome, raça, fk_classe, ataque, defesa)
VALUES
('Jzargo', 'Khajiit', 3, '1567', '1678'),
('Lydia', 'Humano', 2, '1982', '876'),
('Alucard', 'Vampiro', 5, '3472', '5787'),
('Cain', 'Khajiit', 4, '4893', '1356'),
('Sana', 'Falmer', 5, '857', '880'),
('Helena', 'Bretão', 5, '333', '3676'),
('Ulfric', 'Nórdico', 2, '2789', '2567'),
('Mario', 'Humano', 2, '2345', '2987');

SELECT nome, ataque
FROM tb_personagem
WHERE ataque > 2000; 

SELECT nome, defesa
FROM tb_personagem
WHERE defesa BETWEEN 1000 AND 2000; 

SELECT * FROM tb_personagem
WHERE nome LIKE '%c%';

SELECT tb_classe.nome AS nome_da_classe
FROM tb_personagem
INNER JOIN tb_classe
ON tb_personagem.fk_classe = tb_classe.id_classe
-- ORDER BY tb_classe.nome ASC;
GROUP BY tb_classe.nome;

SELECT * FROM tb_personagem
WHERE fk_classe = 2;