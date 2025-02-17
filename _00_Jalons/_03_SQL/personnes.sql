CREATE DATABASE personnes;

USE personnes;

CREATE TABLE personne (
    id INT NOT NULL AUTO_INCREMENT,
    surname VARCHAR(30) NOT NULL,
    firstname VARCHAR(30) NOT NULL,
    gender ENUM ('male', 'female', 'other') NOT NULL,
    date_of_birth DATE NOT NULL,
    income DECIMAL(7, 2) NOT NULL,
    other_income DECIMAL(7, 2)NOT NULL,
    CONSTRAINT personnes PRIMARY KEY (id)
);

INSERT INTO personne (surname, firstname, gender, date_of_birth, income, other_income)
VALUES  ('ALEMANY', 'JUSTIN', 'male',  '2010-01-01', 2000, 1500),
        ('BIEHLER', 'CAROLINE', 'female', '2005-01-01', 2000, 1500),
        ('CETIN', 'HULYA', 'female', '2000-01-01', 2000, 1500),
        ('DE BRITO', 'JESSY', 'male', '1995-01-01', 2000, 1500),
        ('DEL', 'MICHAEL', 'male', '1990-01-01', 2000, 1500),
        ('GEHIN', 'FREDERIC', 'male', '1985-01-01', 2000, 1500),
        ('GODBILLOT', 'BRUNO', 'male', '2015-01-01', 2000, 1500),
        ('HUMERY', 'LUDOVIC', 'male', '1980-01-01', 2000, 1500),
        ('LAHMAR', 'MOHAMED', 'male', '1975-01-01', 2000, 1500),
        ('MORABITI', 'ABDELAZIZ', 'male', '2002-01-01', 2000, 1500),
        ('THIEUX', 'DYLAN', 'male', '1999-01-01', 2000, 1500)
;

SELECT  surname AS Nom,
        firstname AS Prenom,
        TIMESTAMPDIFF(YEAR, date_of_birth, CURRENT_DATE) AS Age,
        date_of_birth AS 'Date de naissance'
FROM    personne
WHERE 	TIMESTAMPDIFF(YEAR, date_of_birth, CURRENT_DATE) BETWEEN 20 AND 40
;

SELECT  surname AS Nom,
        firstname AS Prenom,
        gender AS Genre
FROM    personne
WHERE   gender = 'female'
AND     firstname LIKE '%a'
;