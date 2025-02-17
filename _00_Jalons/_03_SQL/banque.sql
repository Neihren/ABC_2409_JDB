CREATE DATABASE banque;

USE banque;

CREATE TABLE compteBancaire (
    id INT NOT NULL AUTO_INCREMENT,
    owner VARCHAR(30) NOT NULL,
    balance DECIMAL(7, 2) NOT NULL,
    overdraft DECIMAL(7, 2) NOT NULL,
    CONSTRAINT compteBancaire_pk PRIMARY KEY (id)
);

INSERT INTO compteBancaire (owner, balance, overdraft)
VALUES  ('ALEMANY JUSTIN', 12000, 1000.00),
        ('BIEHLER CAROLINE', 7514.45, 999.99),
        ('CETIN HULYA', 99999.99, 99999.99),
        ('DE BRITO JESSY', 25878.45, 1000.01),
        ('DEL MICHAEL', 48712.92, 4524.12),
        ('GEHIN FREDERIC', 9154.45, 154.0)
;

SELECT  *
FROM    compteBancaire
WHERE   owner LIKE 'Alemany%'
;

SELECT  *
FROM    compteBancaire
WHERE   overdraft > 1000
;