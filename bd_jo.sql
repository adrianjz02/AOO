-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : sam. 16 mars 2024 à 15:11
-- Version du serveur : 8.2.0
-- Version de PHP : 8.2.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `bd_jo`
--

-- --------------------------------------------------------

--
-- Structure de la table `athleteprofile`
--

DROP TABLE IF EXISTS `athleteprofile`;
CREATE TABLE IF NOT EXISTS `athleteprofile` (
  `athleteId` int NOT NULL,
  `firstNameAthlete` varchar(255) DEFAULT NULL,
  `lastNameAthlete` varchar(255) DEFAULT NULL,
  `nationality` varchar(255) DEFAULT NULL,
  `dateOfBirthAthlete` date DEFAULT NULL,
  `genderAthlete` char(1) DEFAULT NULL,
  `sport` varchar(255) DEFAULT NULL,
  `biography` text,
  `achievements` text,
  `specialSkills` text,
  `socialMediaLinks` text,
  PRIMARY KEY (`athleteId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `athleteprofile`
--

INSERT INTO `athleteprofile` (`athleteId`, `firstNameAthlete`, `lastNameAthlete`, `nationality`, `dateOfBirthAthlete`, `genderAthlete`, `sport`, `biography`, `achievements`, `specialSkills`, `socialMediaLinks`) VALUES
(1, 'Liu', 'Xiang', 'Chinois', '1983-07-13', 'M', 'Athlétisme', 'Liu Xiang est un coureur de haies chinois. Il est célèbre pour avoir remporté la médaille d\'or aux Jeux Olympiques d\'Athènes en 2004.', 'Médaille d\'or aux Jeux Olympiques d\'Athènes 2004, Record du monde du 110 mètres haies', 'Vitesse et agilité exceptionnelles', 'twitter.com/liuxiang'),
(2, 'Renaud', 'Lavillenie', 'Français', '1986-09-18', 'M', 'Athlétisme', 'Renaud Lavillenie est un sauteur à la perche français. Il est le détenteur du record du monde en plein air avec un saut de 6,16 mètres.', 'Médaille d\'or aux Jeux Olympiques de Londres 2012, Record du monde en plein air du saut à la perche', 'Technique impeccable de saut à la perche', 'twitter.com/airlavillenie'),
(3, 'Simone', 'Biles', 'Américaine', '1997-03-14', 'F', 'Gymnastique', 'Simone Biles est une gymnaste américaine. Elle est considérée comme l\'une des plus grandes gymnastes de tous les temps, ayant remporté de nombreuses médailles d\'or aux championnats du monde et aux Jeux Olympiques.', 'Médaillée d\'or aux Jeux Olympiques de Rio 2016, Multiple championne du monde en gymnastique artistique', 'Flexibilité exceptionnelle et maîtrise des compétences techniques', 'twitter.com/simonebiles'),
(4, 'Neymar', 'da Silva Santos Júnior', 'Brésilien', '1992-02-05', 'M', 'Football', 'Neymar est un footballeur brésilien évoluant au poste d\'attaquant. Il est considéré comme l\'un des meilleurs joueurs de football au monde.', 'Médaillé d\'or aux Jeux Olympiques de Rio 2016, Vainqueur de la Ligue des champions de l\'UEFA avec le FC Barcelone', 'Dribbleur talentueux et finisseur efficace', 'twitter.com/neymarjr'),
(5, 'Kohei', 'Uchimura', 'Japonais', '1989-01-03', 'M', 'Gymnastique', 'Kohei Uchimura est un gymnaste japonais. Il est surnommé \"King Kohei\" en raison de sa domination dans le monde de la gymnastique artistique.', 'Médaillé d\'or aux Jeux Olympiques de Rio 2016, Multiple champion du monde en gymnastique artistique', 'Excellente technique et précision dans les mouvements', 'twitter.com/kohei1989');

-- --------------------------------------------------------

--
-- Structure de la table `competitioncalendar`
--

DROP TABLE IF EXISTS `competitioncalendar`;
CREATE TABLE IF NOT EXISTS `competitioncalendar` (
  `calendarId` int NOT NULL,
  `nameCompetition` varchar(255) DEFAULT NULL,
  `dateCompetition` date DEFAULT NULL,
  `time` time DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `sport` varchar(255) DEFAULT NULL,
  `countryId` int DEFAULT NULL,
  PRIMARY KEY (`calendarId`),
  KEY `countryId` (`countryId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `competitioncalendar`
--

INSERT INTO `competitioncalendar` (`calendarId`, `nameCompetition`, `dateCompetition`, `time`, `location`, `sport`, `countryId`) VALUES
(1, 'Saut en longueur', '2024-06-24', '14:00:00', 'Stade de France', 'Athlétisme', 2),
(2, 'Natation - 100m nage libre', '2024-06-26', '09:30:00', 'Piscine Olympique', 'Natation', 2),
(3, 'Gymnastique artistique - Finale hommes', '2024-07-02', '15:00:00', 'Palais des sports', 'Gymnastique', 2),
(4, 'Basketball', '2024-07-04', '18:00:00', 'Parc des expositions', 'Basketball', 2),
(5, 'Tennis de table - Doubles mixtes', '2024-07-08', '10:00:00', 'Centre de tennis de table', 'Tennis de table', 2);

-- --------------------------------------------------------

--
-- Structure de la table `country`
--

DROP TABLE IF EXISTS `country`;
CREATE TABLE IF NOT EXISTS `country` (
  `countryId` int NOT NULL,
  `nameCountry` varchar(255) DEFAULT NULL,
  `capital` varchar(255) DEFAULT NULL,
  `population` int DEFAULT NULL,
  `relevantPoint` text,
  PRIMARY KEY (`countryId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `country`
--

INSERT INTO `country` (`countryId`, `nameCountry`, `capital`, `population`, `relevantPoint`) VALUES
(1, 'Chine', 'Pékin', 1403500365, 'Grande puissance économique mondiale'),
(2, 'France', 'Paris', 67022000, 'Hôte des Jeux Olympiques 2024'),
(3, 'États-Unis', 'Washington D.C.', 331449281, 'Grande diversité culturelle et géographique'),
(4, 'Brésil', 'Brasília', 213993437, 'Pays du football et de la samba'),
(5, 'Japon', 'Tokyo', 125584838, 'Technologie avancée et tradition riche');

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `userId` int NOT NULL,
  `firstNameUser` varchar(255) DEFAULT NULL,
  `lastNameUser` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `dateOfBirth` date DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `phoneNumber` varchar(20) DEFAULT NULL,
  `address` text,
  `country` varchar(255) DEFAULT NULL,
  `favoriteSports` text,
  `externalProvider` varchar(255) DEFAULT NULL,
  `externalUserId` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
