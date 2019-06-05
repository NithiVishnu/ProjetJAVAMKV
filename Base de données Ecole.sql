CREATE TABLE AnneeScolaire(
Id int(11) PRIMARY KEY NOT NULL
);

CREATE TABLE Trimestre(
Id int(11) PRIMARY KEY NOT NULL,
numero int(11) NOT NULL,
debut varchar(10) NOT NULL,
fin varchar(10) NOT NULL
);

CREATE TABLE Ecole(
Id int(11) PRIMARY KEY NOT NULL,
nom varchar(255) NOT NULL
);

CREATE TABLE Classe(
Id int(11) PRIMARY KEY NOT NULL,
nom varchar(255) NOT NULL
);

CREATE TABLE Enseignement(
Id int(11) PRIMARY KEY NOT NULL
);

CREATE TABLE Discipline(
Id int(11) PRIMARY KEY NOT NULL,
nom varchar(255) NOT NULL
);

CREATE TABLE Niveau(
id int(11) PRIMARY KEY NOT NULL,
nom varchar(255) NOT NULL
);

CREATE TABLE Inscription(
Id int(11) PRIMARY KEY NOT NULL
);

CREATE TABLE Bulletin(
Id int(11) NOT NULL,
appreciation varchar(255) NOT NULL
);

CREATE TABLE DetailBulletin(
Id int(11) NOT NULL,
appreciation varchar(255) NOT NULL
);

CREATE TABLE Personne(
Id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
nom varchar(255) NOT NULL,
prenom varchar(255) NOT NULL,
type varchar(255) NOT NULL,
pseudo varchar(255) NOT NULL,
mdp varchar(255) NOT NULL
);

INSERT INTO Personne(nom, prenom, type, pseudo, mdp) VALUES ("Jogarajah", "Kishor", "enseignant", "JOG", "kis");
INSERT INTO Personne(nom, prenom, type, pseudo, mdp) VALUES ("Nithi", "Vishnu", "enseignant", "NIT", "vis");
INSERT INTO Personne(nom, prenom, type, pseudo, mdp) VALUES ("Refosco", "Merwane", "enseignant", "BOU", "mer");

CREATE TABLE Evaluation(
Id int(11) NOT NULL,
note float(11) NOT NULL,
appreciation text(255) NOT NULL,
matière varchar(255)
);

CREATE TABLE Connexion(
pseudo varchar(255) NOT NULL,
mdp varchar(255) NOT NULL
);

INSERT INTO Connexion VALUES ("vini", "mdp");
INSERT INTO Connexion VALUES ("kishor", "mdp");
INSERT INTO Connexion VALUES ("merwane", "mdp");

