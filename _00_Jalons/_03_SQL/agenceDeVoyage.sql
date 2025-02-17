CREATE DATABASE agenceDeVoyage;

USE agenceDeVoyage;

CREATE TABLE vol (
    id INT NOT NULL AUTO_INCREMENT,
    destination VARCHAR(30) NOT NULL,
    tarif DECIMAL(7, 2) NOT NULL,
    nbPlacesTotales INT NOT NULL,
    nbPlacesOccupees INT NOT NULL,
    CONSTRAINT vol_pk PRIMARY KEY (id)  
);

CREATE TABLE reservation (
    id INT NOT NULL AUTO_INCREMENT,
    nom VARCHAR(30) NOT NULL,
    prenom VARCHAR(30) NOT NULL,
    age INT(3) NOT NULL,
    business BOOLEAN NOT NULL,
    id_vol INT NOT NULL,
    CONSTRAINT reservation_pk PRIMARY KEY (id)
);

ALTER TABLE reservation
    ADD CONSTRAINT reservation_vol
    FOREIGN KEY (id_vol)
    REFERENCES vol (id)
;

INSERT INTO vol (destination, tarif, nbPlacesTotales, nbPlacesOccupees)
VALUES  ('New York', 1000.00, 210, 89),
        ('Johannesburg', 1200.25, 180, 50),
        ('Tokyo', 1500.50, 200, 190),
        ('Rio de Janeiro', 1300.75, 210, 210),
        ('Istanbul', 900.00, 210, 3),
        ('Enfer', 999.00, 300, 299)
;

INSERT INTO reservation (nom, prenom, age, business, id_vol)
VALUES  ('ALEMANY', 'JUSTIN', 38, TRUE, 1),
        ('BIEHLER', 'CAROLINE', 25, TRUE, 2),
        ('CETIN', 'HULYA', 39, TRUE, 3),
        ('DE BRITO', 'JESSY', 35, FALSE, 6),
        ('DEL', 'MICHAEL', 29, FALSE, 5),
        ('GEHIN', 'FREDERIC', 46, TRUE, 4)
;

SELECT  *
FROM    vol
WHERE   destination LIKE 'New York'
;

SELECT  *
FROM    reservation
JOIN    vol v on v.id = reservation.id_vol
WHERE   v.tarif > 1000
;