-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 26, 2017 at 06:58 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bazaplanishrane`
--

-- --------------------------------------------------------

--
-- Table structure for table `clan`
--

CREATE TABLE `clan` (
  `SifraClana` varchar(255) COLLATE utf32_unicode_ci NOT NULL,
  `ImePrezime` varchar(120) COLLATE utf32_unicode_ci NOT NULL,
  `GodinaRodjenja` int(11) DEFAULT NULL,
  `VisinaUMetrima` double DEFAULT NULL,
  `TezinaUKg` double DEFAULT NULL,
  `Napomena` varchar(600) COLLATE utf32_unicode_ci DEFAULT NULL,
  `SifraPlanaIshrane` varchar(255) COLLATE utf32_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_unicode_ci;

--
-- Dumping data for table `clan`
--

INSERT INTO `clan` (`SifraClana`, `ImePrezime`, `GodinaRodjenja`, `VisinaUMetrima`, `TezinaUKg`, `Napomena`, `SifraPlanaIshrane`) VALUES
('Aleksandar Mikic19741.7366.3', 'Aleksandar Miki?', 1974, 1.73, 66.3, 'Nema', 'filip1498422162560Srpski reÅ¾im'),
('Boda Tajson19672.0120.0', 'Boda Tajson', 1967, 2, 120, 'Nema', 'filip1498422384810Slimsuper'),
('DuÅ¡ko DugouÅ¡ko19401.730.0', 'DuÅ¡ko DugouÅ¡ko', 1940, 1.7, 30, 'Inace je niÅ¾i ali je zahtevao da uracunam i uÅ¡i u visinu', 'filip1498422384810Slimsuper'),
('Jadranka Savic19232.0120.0', 'Jadranka Savic', 1923, 2, 120, 'Gospodja puca od zdravlja', 'filip1498422162560Srpski reÅ¾im'),
('Jovana Jovic19801.545.0', 'Jovana Jovic', 1980, 1.5, 45, 'Nema', 'filip1498422315342Superslim'),
('Marko Petrovic19901.880.0', 'Marko Petrovic', 1990, 1.8, 80, 'Dijabetes', 'filip1498422315342Superslim'),
('Milica Maric19931.763.0', 'Milica Maric', 1993, 1.7, 63, 'Nema napomene', 'filip1498422162560Srpski reÅ¾im'),
('Petar Peric19941.8980.0', 'Petar Peric', 1994, 1.89, 80, 'Nema', 'filip1498422384810Slimsuper'),
('Petra MiloÅ¡evi?19781.8268.0', 'Petra MiloÅ¡evi?', 1978, 1.82, 68, 'Nema', 'filip1498422384810Slimsuper');

-- --------------------------------------------------------

--
-- Table structure for table `jelo`
--

CREATE TABLE `jelo` (
  `SifraJela` varchar(255) COLLATE utf32_unicode_ci NOT NULL,
  `NazivJela` varchar(60) COLLATE utf32_unicode_ci NOT NULL,
  `BrojKiloKalorijaNa100g` double DEFAULT '0',
  `KolicinaProteinaNa100g` double DEFAULT '0',
  `KolicinaUgljenihHidrataNa100g` double DEFAULT '0',
  `KolicinaMastiNa100g` double DEFAULT '0',
  `SifraTipaJela` varchar(32) COLLATE utf32_unicode_ci NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_unicode_ci;

--
-- Dumping data for table `jelo`
--

INSERT INTO `jelo` (`SifraJela`, `NazivJela`, `BrojKiloKalorijaNa100g`, `KolicinaProteinaNa100g`, `KolicinaUgljenihHidrataNa100g`, `KolicinaMastiNa100g`, `SifraTipaJela`) VALUES
('Banana1.0922.022.830.33', 'Banana', 1.09, 22, 22.83, 0.33, '5'),
('Cezar salata170.05.036.5214.17', 'Cezar salata', 170, 5.03, 6.52, 14.17, '5'),
('Hamburger360.014.04.032.0', 'Hamburger', 360, 14, 4, 32, '6'),
('Kokice55.00.996.293.09', 'Kokice', 55, 0.99, 6.29, 3.09, '8'),
('Krompir pire113.01.9516.94.19', 'Krompir pire', 113, 1.95, 16.9, 4.19, '5'),
('Kupus salata20.01.05.00.0', 'Kupus salata', 20, 1, 5, 0, '5'),
('Kuvana sarma126.013.010.84.2', 'Kuvana sarma', 126, 13, 10.8, 4.2, '2'),
('Nista0.00.00.00.0', 'Nista', 0, 0, 0, 0, '8'),
('Omlet sa povr?em129.08.812.98.95', 'Omlet sa povr?em', 129, 8.81, 2.9, 8.95, '2'),
('Ovsena kaÅ¡a70.02.2812.691.36', 'Ovsena kaÅ¡a', 70, 2.28, 12.69, 1.36, '1'),
('Pile?a supa75.04.059.352.46', 'Pileca supa', 75, 4.05, 9.35, 2.46, '4'),
('Pile?i batak214.026.80.011.06', 'PileÄ‡i batak', 214, 26.8, 0, 11.06, '2'),
('Pita zeljanica207.05.660.020.0', 'Pita zeljanica', 207, 5.6, 60, 20, '1'),
('Pivo43.00.463.550.0', 'Pivo', 43, 0.46, 3.55, 0, '1'),
('Pomfrit134.04.2327.815.49', 'Pomfrit', 134, 4.23, 27.8, 15.49, '1'),
('Sendvi? sa Å¡unkom i sirom241.014.1722.8410.6', 'Sendvic sa Å¡unkom i sirom', 241, 14.17, 22.84, 10.6, '6'),
('SutlijaÅ¡108.03.2318.392.15', 'SutlijaÅ¡', 108, 3.23, 18.39, 2.15, '1'),
('Tunjevina144.023.330.04.9', 'Tunjevina', 144, 23.33, 0, 4.9, '2'),
('Vo?na salata156.01.4322.947.61', 'Vocna salata', 156, 1.43, 22.94, 7.61, '5'),
('Vo?ni jogurt150.06.029.01.5', 'Vocni jogurt', 150, 6, 29, 1.5, '7');

-- --------------------------------------------------------

--
-- Table structure for table `korisnik`
--

CREATE TABLE `korisnik` (
  `SifraKorisnika` varchar(32) COLLATE utf32_unicode_ci NOT NULL,
  `Ime` varchar(60) COLLATE utf32_unicode_ci DEFAULT NULL,
  `Prezime` varchar(60) COLLATE utf32_unicode_ci DEFAULT NULL,
  `Username` varchar(20) COLLATE utf32_unicode_ci DEFAULT NULL,
  `Password` varchar(20) COLLATE utf32_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_unicode_ci;

--
-- Dumping data for table `korisnik`
--

INSERT INTO `korisnik` (`SifraKorisnika`, `Ime`, `Prezime`, `Username`, `Password`) VALUES
('1', 'Filip', 'KariÄ‡', 'filip', 'filip1'),
('2', 'Marko', 'MarkoviÄ‡', 'marko', 'marko1'),
('3', 'Milan', 'MiliÄ‡', 'milan', 'milan1');

-- --------------------------------------------------------

--
-- Table structure for table `planishrane`
--

CREATE TABLE `planishrane` (
  `SifraPlanaIshrane` varchar(255) COLLATE utf32_unicode_ci NOT NULL,
  `NazivPlanaIshrane` varchar(60) COLLATE utf32_unicode_ci NOT NULL,
  `DatumNastankaPlana` date DEFAULT NULL,
  `Napomena` varchar(600) COLLATE utf32_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_unicode_ci;

--
-- Dumping data for table `planishrane`
--

INSERT INTO `planishrane` (`SifraPlanaIshrane`, `NazivPlanaIshrane`, `DatumNastankaPlana`, `Napomena`) VALUES
('filip1498422162560Srpski reÅ¾im', 'Srpski reÅ¾im', '2017-06-25', 'Ovaj reÅ¾im ishrane se zasniva na srpski tradicionalnim jelima'),
('filip1498422315342Superslim', 'Superslim', '2017-06-25', 'Ovaj reÅ¾im ishrane se zasniva na srpski tradicionalnim jelima'),
('filip1498422384810Slimsuper', 'Slimsuper', '2017-06-25', 'U ovoj dijeti ne jede se niÅ¡ta'),
('filip1498422436799Super Å¾ena', 'Super Å¾ena', '2017-06-25', 'Dijeta za super Å¾ene'),
('filip1498422989503Proteinska bomba', 'Proteinska bomba', '2017-06-25', 'Plan sa povecanim unosom proteina'),
('filip1498423014621Shake, shake', 'Shake, shake', '2017-06-25', 'Plan sa svi vrstama Å¡ejkova'),
('filip1498423027336Kivi dijeta', 'Kivi dijeta', '2017-06-25', 'Sve osim kivija'),
('filip1498423042175Limun dijeta', 'Limun dijeta', '2017-06-25', 'Kada Vam Å¾ivot da limun'),
('filip1498423054085Brza dijeta', 'Brza dijeta', '2017-06-25', 'I gotova je'),
('filip1498423070284Moja dijeta', 'Moja dijeta', '2017-06-25', 'Sutra po?injem'),
('filip1498423097769Statisti?ka dijeta', 'Statisticka dijeta', '2017-06-25', 'U proseku jedemo sarmu'),
('filip1498423141261Demokratska dijeta', 'Demokratska dijeta', '2017-06-25', 'Oni jedu vruce pecenje, mi pijemo hladnu vodu'),
('filip1498423164792Ivan Ivanovi? Dijeta', 'Ivan Ivanovic Dijeta', '2017-06-25', 'Skoro svako vece');

-- --------------------------------------------------------

--
-- Table structure for table `stavkaplanaishrane`
--

CREATE TABLE `stavkaplanaishrane` (
  `RedniBroj` int(11) NOT NULL,
  `Dan` int(11) DEFAULT NULL,
  `Napomena` varchar(200) COLLATE utf32_unicode_ci DEFAULT NULL,
  `SifraPlanaIshrane` varchar(255) COLLATE utf32_unicode_ci NOT NULL,
  `SifraJela` varchar(255) COLLATE utf32_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_unicode_ci;

--
-- Dumping data for table `stavkaplanaishrane`
--

INSERT INTO `stavkaplanaishrane` (`RedniBroj`, `Dan`, `Napomena`, `SifraPlanaIshrane`, `SifraJela`) VALUES
(1, 1, 'Doru?ak, povr?e po Å¾elji', 'filip1498422162560Srpski reÅ¾im', 'Omlet sa povr?em129.08.812.98.95'),
(1, 1, 'Doru?ak', 'filip1498422315342Superslim', 'Banana1.0922.022.830.33'),
(1, 1, 'NiÅ¡ta', 'filip1498422384810Slimsuper', 'Nista0.00.00.00.0'),
(1, 1, 'Napomena', 'filip1498422436799Super Å¾ena', 'Hamburger360.014.04.032.0'),
(2, 1, 'UÅ¾ina, jedna do dve', 'filip1498422162560Srpski reÅ¾im', 'Banana1.0922.022.830.33'),
(2, 1, 'Ru?ak', 'filip1498422315342Superslim', 'Cezar salata170.05.036.5214.17'),
(3, 1, 'RuÄak, 3 manje sarmice', 'filip1498422162560Srpski reÅ¾im', 'Kuvana sarma126.013.010.84.2'),
(3, 1, 'Ve?era', 'filip1498422315342Superslim', 'Banana1.0922.022.830.33'),
(4, 1, 'UÅ¾ina, 250 mml', 'filip1498422162560Srpski reÅ¾im', 'Pivo43.00.463.550.0'),
(5, 1, 'VeÄera, 200g', 'filip1498422162560Srpski reÅ¾im', 'Pomfrit134.04.2327.815.49');

-- --------------------------------------------------------

--
-- Table structure for table `tipjela`
--

CREATE TABLE `tipjela` (
  `SifraTipaJela` varchar(32) COLLATE utf32_unicode_ci NOT NULL,
  `NazivTipaJela` varchar(30) COLLATE utf32_unicode_ci NOT NULL DEFAULT 'Ostalo'
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_unicode_ci;

--
-- Dumping data for table `tipjela`
--

INSERT INTO `tipjela` (`SifraTipaJela`, `NazivTipaJela`) VALUES
('1', 'Predjelo'),
('2', 'Glavno jelo'),
('3', 'ÄŒorba'),
('4', 'Supa'),
('5', 'Salata'),
('6', 'SendviÄ'),
('7', 'Dezert'),
('8', 'Ostalo'),
('9', 'PiÄ‡e');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clan`
--
ALTER TABLE `clan`
  ADD PRIMARY KEY (`SifraClana`),
  ADD KEY `fk_sifraplanaishraneClan` (`SifraPlanaIshrane`);

--
-- Indexes for table `jelo`
--
ALTER TABLE `jelo`
  ADD PRIMARY KEY (`SifraJela`),
  ADD KEY `fk_topjelaJelo` (`SifraTipaJela`);

--
-- Indexes for table `korisnik`
--
ALTER TABLE `korisnik`
  ADD PRIMARY KEY (`SifraKorisnika`);

--
-- Indexes for table `planishrane`
--
ALTER TABLE `planishrane`
  ADD PRIMARY KEY (`SifraPlanaIshrane`);

--
-- Indexes for table `stavkaplanaishrane`
--
ALTER TABLE `stavkaplanaishrane`
  ADD PRIMARY KEY (`RedniBroj`,`SifraPlanaIshrane`),
  ADD KEY `fk_stavkaplanaishranePlanishrane` (`SifraPlanaIshrane`),
  ADD KEY `fk_stavkaplanaishraneJelo` (`SifraJela`);

--
-- Indexes for table `tipjela`
--
ALTER TABLE `tipjela`
  ADD PRIMARY KEY (`SifraTipaJela`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `clan`
--
ALTER TABLE `clan`
  ADD CONSTRAINT `fk_sifraplanaishraneClan` FOREIGN KEY (`SifraPlanaIshrane`) REFERENCES `planishrane` (`SifraPlanaIshrane`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `jelo`
--
ALTER TABLE `jelo`
  ADD CONSTRAINT `fk_topjelaJelo` FOREIGN KEY (`SifraTipaJela`) REFERENCES `tipjela` (`SifraTipaJela`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `stavkaplanaishrane`
--
ALTER TABLE `stavkaplanaishrane`
  ADD CONSTRAINT `fk_stavkaplanaishraneJelo` FOREIGN KEY (`SifraJela`) REFERENCES `jelo` (`SifraJela`),
  ADD CONSTRAINT `fk_stavkaplanaishranePlanishrane` FOREIGN KEY (`SifraPlanaIshrane`) REFERENCES `planishrane` (`SifraPlanaIshrane`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

