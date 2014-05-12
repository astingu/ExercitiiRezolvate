DROP SCHEMA IF exists DB;
CREATE SCHEMA DB;
CREATE TABLE Departament(idDepartament int NOT NULL, denumireDepartament varchar(255), PRIMARY KEY (idDepartament));
CREATE TABLE Salariat (marcaSalariat int NOT NULL, numeSalariat varchar(255), dataNastere datetime, salariu float, idDepartament int, PRIMARY KEY (marcaSalariat), FOREIGN KEY(idDepartament) references Departament(idDepartament));

INSERT INTO Departament values (1, "IT");
INSERT INTO Departament values (2, "Contabilitate");
INSERT INTO Departament values (3, "Management");
INSERT INTO Departament values (4, "Marketing");
INSERT INTO Departament values (5, "Resurse Umane");
INSERT INTO Departament values (6, "Tralala");

SELECT * from Departament;


ALTER TABLE Salariat MODIFY COLUMN dataNastere date;

INSERT INTO Salariat values (1, "Ion", "2003-02-23", 1000, 2);
INSERT INTO Salariat values (2, "VAsile", "2000-01-24", 2000, 4);
INSERT INTO Salariat values (3, "Ana", "1999-04-14", 5000, 3);
INSERT INTO Salariat values (4, "Mara", "1999-06-12", 10000, 1);
INSERT INTO Salariat values (5, "Andrei", "1990-04-29", 40000, 1);
INSERT INTO Salariat values (6, "Oana", "1994-07-13", 1500, 5);
INSERT INTO Salariat values (7, "George", "1991-01-14", 2300, 3);
INSERT INTO Salariat values (8, "Radu", "1995-11-20", 3300, 3);
INSERT INTO Salariat values (9, "Raul", "1995-12-20", 3120, 6);

/* exercitiul 1 */
UPDATE Salariat SET salariu=salariu-0.1*salariu where idDepartament = (select idDepartament from Departament where denumireDepartament="Management");

select * from Salariat;


/* exercitiul 2 */
select denumireDepartament, max(salariu) from Departament, Salariat where Salariat.idDepartament = Departament.idDepartament group by Departament.idDepartament;


/* exercitiul 3 */
select denumireDepartament, max(salariu) from Departament, Salariat where Salariat.idDepartament = Departament.idDepartament and denumireDepartament like "T%" group by Departament.idDepartament having count(marcaSalariat);

/* exercitiul 4 */
update Salariat set salariu=1.1*salariu where 
	marcaSalariat in (select marcaSalariat  from Departament where idDepartament=Departament.idDepartament group by idDepartament having count(marcaSalariat)=1);









