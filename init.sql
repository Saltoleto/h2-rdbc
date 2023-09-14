CREATE TABLE usuario (
	id serial PRIMARY KEY,
	name VARCHAR ( 50 )  NOT NULL,
	email VARCHAR ( 50 ) NOT NULL,
	isActive CHAR ( 1 )  NOT NULL
);




INSERT INTO usuario (name, email, isactive)
VALUES
    ('Exemplo 1', 'exemplo1@email.com', 'S'),
    ('Exemplo 2', 'exemplo2@email.com', 'S'),
    ('Exemplo 3', 'exemplo3@email.com', 'S');
