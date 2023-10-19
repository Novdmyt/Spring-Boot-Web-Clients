
CREATE DATABASE demo_db;

CREATE TABLE IF NOT EXISTS clients
( id INTEGER NOT NULL AUTO_INCREMENT,
  image VARCHAR(255) NOT NULL,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  phone VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);


INSERT INTO
	clients (first_name, last_name, phone)
VALUES
	( 'Michael', 'Doe', '+470858524578'),
	('Henry', 'Paul', '+380968526978'),
	( 'Laura', 'James', '+470963854578');

	SELECT * FROM clients


