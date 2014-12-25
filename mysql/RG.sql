-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               5.6.21 - MySQL Community Server (GPL)
-- ОС Сервера:                   Win32
-- HeidiSQL Версия:              8.3.0.4694
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Дамп структуры базы данных reportglonass
DROP DATABASE IF EXISTS `reportglonass`;
CREATE DATABASE IF NOT EXISTS `reportglonass` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;
USE `reportglonass`;


-- Дамп структуры для таблица reportglonass.log_users
DROP TABLE IF EXISTS `log_users`;
CREATE TABLE IF NOT EXISTS `log_users` (
  `id_log_user` int(11) NOT NULL AUTO_INCREMENT,
  `user_login` varchar(10) COLLATE utf8_bin NOT NULL,
  `date_login` timestamp NOT NULL,
  PRIMARY KEY (`id_log_user`),
  KEY `fk_log_user_user_login` (`user_login`),
  CONSTRAINT `FK_log_user_login` FOREIGN KEY (`user_login`) REFERENCES `users` (`login`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- Дамп данных таблицы reportglonass.log_users: ~0 rows (приблизительно)
DELETE FROM `log_users`;
/*!40000 ALTER TABLE `log_users` DISABLE KEYS */;
/*!40000 ALTER TABLE `log_users` ENABLE KEYS */;


-- Дамп структуры для таблица reportglonass.report
DROP TABLE IF EXISTS `report`;
CREATE TABLE IF NOT EXISTS `report` (
  `id_report` int(11) NOT NULL AUTO_INCREMENT,
  `user_report` varchar(10) COLLATE utf8_bin NOT NULL,
  `date_report` timestamp NULL DEFAULT NULL,
  `catM1StateAll` int(11) DEFAULT '0',
  `catM1MunicAll` int(11) DEFAULT '0',
  `catM1CommercAll` int(11) DEFAULT '0',
  `catM1ItogAll` int(11) DEFAULT '0',
  `catM2M3StateAll` int(11) DEFAULT '0',
  `catM2M3MunicAll` int(11) DEFAULT '0',
  `catM2M3CommercAll` int(11) DEFAULT '0',
  `catM2M3ItogAll` int(11) DEFAULT '0',
  `catLargeStateAll` int(11) DEFAULT '0',
  `catLargeMunicAll` int(11) DEFAULT '0',
  `catLargeCommercAll` int(11) DEFAULT '0',
  `catLargeItogAll` int(11) DEFAULT '0',
  `catDangerStateAll` int(11) DEFAULT '0',
  `catDangerMunicAll` int(11) DEFAULT '0',
  `catDangerCommercAll` int(11) DEFAULT '0',
  `catDangerItogAll` int(11) DEFAULT '0',
  `catSchoolStateAll` int(11) DEFAULT '0',
  `catSchoolMunicAll` int(11) DEFAULT '0',
  `catSchoolCommercAll` int(11) DEFAULT '0',
  `catSchoolItogAll` int(11) DEFAULT '0',
  `catGKHStateAll` int(11) DEFAULT '0',
  `catGKHMunicAll` int(11) DEFAULT '0',
  `catGKHCommercAll` int(11) DEFAULT '0',
  `catGKHItogAll` int(11) DEFAULT '0',
  `catDepartStateAll` int(11) DEFAULT '0',
  `catDepartMunicAll` int(11) DEFAULT '0',
  `catDepartCommercAll` int(11) DEFAULT '0',
  `catDepartItogAll` int(11) DEFAULT '0',
  `catM1StateEquip` int(11) DEFAULT '0',
  `catM1MunicEquip` int(11) DEFAULT '0',
  `catM1CommercEquip` int(11) DEFAULT '0',
  `catM1ItogEquip` int(11) DEFAULT '0',
  `catM2M3StateEquip` int(11) DEFAULT '0',
  `catM2M3MunicEquip` int(11) DEFAULT '0',
  `catM2M3CommercEquip` int(11) DEFAULT '0',
  `catM2M3ItogEquip` int(11) DEFAULT '0',
  `catLargeStateEquip` int(11) DEFAULT '0',
  `catLargeMunicEquip` int(11) DEFAULT '0',
  `catLargeCommercEquip` int(11) DEFAULT '0',
  `catLargeItogEquip` int(11) DEFAULT '0',
  `catDangerStateEquip` int(11) DEFAULT '0',
  `catDangerMunicEquip` int(11) DEFAULT '0',
  `catDangerCommercEquip` int(11) DEFAULT '0',
  `catDangerItogEquip` int(11) DEFAULT '0',
  `catSchoolStateEquip` int(11) DEFAULT '0',
  `catSchoolMunicEquip` int(11) DEFAULT '0',
  `catSchoolCommercEquip` int(11) DEFAULT '0',
  `catSchoolItogEquip` int(11) DEFAULT '0',
  `catGKHStateEquip` int(11) DEFAULT '0',
  `catGKHMunicEquip` int(11) DEFAULT '0',
  `catGKHCommercEquip` int(11) DEFAULT '0',
  `catGKHItogEquip` int(11) DEFAULT '0',
  `catDepartStateEquip` int(11) DEFAULT '0',
  `catDepartMunicEquip` int(11) DEFAULT '0',
  `catDepartCommercEquip` int(11) DEFAULT '0',
  `catDepartItogEquip` int(11) DEFAULT '0',
  `catM1StateRNIS` int(11) DEFAULT '0',
  `catM1MunicRNIS` int(11) DEFAULT '0',
  `catM1CommercRNIS` int(11) DEFAULT '0',
  `catM1ItogRNIS` int(11) DEFAULT '0',
  `catM2M3StateRNIS` int(11) DEFAULT '0',
  `catM2M3MunicRNIS` int(11) DEFAULT '0',
  `catM2M3CommercRNIS` int(11) DEFAULT '0',
  `catM2M3ItogRNIS` int(11) DEFAULT '0',
  `catLargeStateRNIS` int(11) DEFAULT '0',
  `catLargeMunicRNIS` int(11) DEFAULT '0',
  `catLargeCommercRNIS` int(11) DEFAULT '0',
  `catLargeItogRNIS` int(11) DEFAULT '0',
  `catDangerStateRNIS` int(11) DEFAULT '0',
  `catDangerMunicRNIS` int(11) DEFAULT '0',
  `catDangerCommercRNIS` int(11) DEFAULT '0',
  `catDangerItogRNIS` int(11) DEFAULT '0',
  `catSchoolStateRNIS` int(11) DEFAULT '0',
  `catSchoolMunicRNIS` int(11) DEFAULT '0',
  `catSchoolCommercRNIS` int(11) DEFAULT '0',
  `catSchoolItogRNIS` int(11) DEFAULT '0',
  `catGKHStateRNIS` int(11) DEFAULT '0',
  `catGKHMunicRNIS` int(11) DEFAULT '0',
  `catGKHCommercRNIS` int(11) DEFAULT '0',
  `catGKHItogRNIS` int(11) DEFAULT '0',
  `catDepartStateRNIS` int(11) DEFAULT '0',
  `catDepartMunicRNIS` int(11) DEFAULT '0',
  `catDepartCommercRNIS` int(11) DEFAULT '0',
  `catDepartItogRNIS` int(11) DEFAULT '0',
  `catM1StateOther` int(11) DEFAULT '0',
  `catM1MunicOther` int(11) DEFAULT '0',
  `catM1CommercOther` int(11) DEFAULT '0',
  `catM1ItogOther` int(11) DEFAULT '0',
  `catM2M3StateOther` int(11) DEFAULT '0',
  `catM2M3MunicOther` int(11) DEFAULT '0',
  `catM2M3CommercOther` int(11) DEFAULT '0',
  `catM2M3ItogOther` int(11) DEFAULT '0',
  `catLargeStateOther` int(11) DEFAULT '0',
  `catLargeMunicOther` int(11) DEFAULT '0',
  `catLargeCommercOther` int(11) DEFAULT '0',
  `catLargeItogOther` int(11) DEFAULT '0',
  `catDangerStateOther` int(11) DEFAULT '0',
  `catDangerMunicOther` int(11) DEFAULT '0',
  `catDangerCommercOther` int(11) DEFAULT '0',
  `catDangerItogOther` int(11) DEFAULT '0',
  `catSchoolStateOther` int(11) DEFAULT '0',
  `catSchoolMunicOther` int(11) DEFAULT '0',
  `catSchoolCommercOther` int(11) DEFAULT '0',
  `catSchoolItogOther` int(11) DEFAULT '0',
  `catGKHStateOther` int(11) DEFAULT '0',
  `catGKHMunicOther` int(11) DEFAULT '0',
  `catGKHCommercOther` int(11) DEFAULT '0',
  `catGKHItogOther` int(11) DEFAULT '0',
  `catDepartStateOther` int(11) DEFAULT '0',
  `catDepartMunicOther` int(11) DEFAULT '0',
  `catDepartCommercOther` int(11) DEFAULT '0',
  `catDepartItogOther` int(11) DEFAULT '0',
  PRIMARY KEY (`id_report`),
  KEY `FK_report_user_login` (`user_report`),
  CONSTRAINT `FK_report_user_login` FOREIGN KEY (`user_report`) REFERENCES `users` (`login`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- Дамп данных таблицы reportglonass.report: ~0 rows (приблизительно)
DELETE FROM `report`;
/*!40000 ALTER TABLE `report` DISABLE KEYS */;
/*!40000 ALTER TABLE `report` ENABLE KEYS */;


-- Дамп структуры для таблица reportglonass.users
DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `login` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `name_user` varchar(60) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `date_last_report` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `group_user` enum('admin','iogv','municipal') CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы reportglonass.users: ~6 rows (приблизительно)
DELETE FROM `users`;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`login`, `password`, `name_user`, `date_last_report`, `group_user`) VALUES
	('15', '1', 'ыавыавыа', '2014-11-23 16:46:10', 'iogv'),
	('sobes', '1', 'Министерство социальной защиты населения', '2014-11-23 17:58:00', 'iogv'),
	('zdrav', '1', 'Министерство здравоохранения', '2014-11-23 17:58:35', 'iogv');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
