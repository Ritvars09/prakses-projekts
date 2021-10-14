DROP TABLE IF EXISTS Klienti;

CREATE TABLE billionaires (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  vards VARCHAR(250) NOT NULL,
  uzvards VARCHAR(250) NOT NULL,
  vecums VARCHAR(250) DEFAULT NULL
);

INSERT INTO billionaires (vards, uzvards, vecums) VALUES
  ('Janis','Berzs', 11),
  ('Gatis', 'Kandis',  33),
  ('Dana', 'Kalnina', 42);