CREATE TABLE students (
  id INT AUTO_INCREMENT NOT NULL,
  epasts VARCHAR(45) NOT NULL,
  parole VARCHAR(15) NOT NULL,
  vards VARCHAR(15) NOT NULL,
  uzvards VARCHAR(45) NOT NULL,
  CONSTRAINT pk_students PRIMARY KEY (id)
);

ALTER TABLE students ADD CONSTRAINT uc_students_epasts UNIQUE (epasts);