-- --------------------------------------------------------
-- Хост:                         10.14.2.4
-- Версия сервера:               5.5.30 - Source distribution
-- ОС Сервера:                   FreeBSD9.1
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
  `date_login` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `action_log` varchar(50) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id_log_user`),
  KEY `fk_log_user_user_login` (`user_login`),
  CONSTRAINT `FK_log_user_login` FOREIGN KEY (`user_login`) REFERENCES `users` (`login`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- Дамп данных таблицы reportglonass.log_users: ~6 rows (приблизительно)
DELETE FROM `log_users`;
/*!40000 ALTER TABLE `log_users` DISABLE KEYS */;
INSERT INTO `log_users` (`id_log_user`, `user_login`, `date_login`, `action_log`) VALUES
	(6, 'minzdrav', '2014-12-25 17:51:07', 'Создан отчет'),
	(7, 'uprzhiv', '2014-12-25 17:52:24', 'Создан отчет'),
	(8, 'sobes', '2014-12-26 11:02:50', 'Создан отчет'),
	(9, 'sobes', '2014-12-26 11:15:27', 'Создан отчет'),
	(10, 'sobes', '2014-12-26 11:15:46', 'Создан отчет'),
	(11, 'sobes', '2014-12-26 10:34:00', 'Создан отчет');
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
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- Дамп данных таблицы reportglonass.report: ~6 rows (приблизительно)
DELETE FROM `report`;
/*!40000 ALTER TABLE `report` DISABLE KEYS */;
INSERT INTO `report` (`id_report`, `user_report`, `date_report`, `catM1StateAll`, `catM1MunicAll`, `catM1CommercAll`, `catM1ItogAll`, `catM2M3StateAll`, `catM2M3MunicAll`, `catM2M3CommercAll`, `catM2M3ItogAll`, `catLargeStateAll`, `catLargeMunicAll`, `catLargeCommercAll`, `catLargeItogAll`, `catDangerStateAll`, `catDangerMunicAll`, `catDangerCommercAll`, `catDangerItogAll`, `catSchoolStateAll`, `catSchoolMunicAll`, `catSchoolCommercAll`, `catSchoolItogAll`, `catGKHStateAll`, `catGKHMunicAll`, `catGKHCommercAll`, `catGKHItogAll`, `catDepartStateAll`, `catDepartMunicAll`, `catDepartCommercAll`, `catDepartItogAll`, `catM1StateEquip`, `catM1MunicEquip`, `catM1CommercEquip`, `catM1ItogEquip`, `catM2M3StateEquip`, `catM2M3MunicEquip`, `catM2M3CommercEquip`, `catM2M3ItogEquip`, `catLargeStateEquip`, `catLargeMunicEquip`, `catLargeCommercEquip`, `catLargeItogEquip`, `catDangerStateEquip`, `catDangerMunicEquip`, `catDangerCommercEquip`, `catDangerItogEquip`, `catSchoolStateEquip`, `catSchoolMunicEquip`, `catSchoolCommercEquip`, `catSchoolItogEquip`, `catGKHStateEquip`, `catGKHMunicEquip`, `catGKHCommercEquip`, `catGKHItogEquip`, `catDepartStateEquip`, `catDepartMunicEquip`, `catDepartCommercEquip`, `catDepartItogEquip`, `catM1StateRNIS`, `catM1MunicRNIS`, `catM1CommercRNIS`, `catM1ItogRNIS`, `catM2M3StateRNIS`, `catM2M3MunicRNIS`, `catM2M3CommercRNIS`, `catM2M3ItogRNIS`, `catLargeStateRNIS`, `catLargeMunicRNIS`, `catLargeCommercRNIS`, `catLargeItogRNIS`, `catDangerStateRNIS`, `catDangerMunicRNIS`, `catDangerCommercRNIS`, `catDangerItogRNIS`, `catSchoolStateRNIS`, `catSchoolMunicRNIS`, `catSchoolCommercRNIS`, `catSchoolItogRNIS`, `catGKHStateRNIS`, `catGKHMunicRNIS`, `catGKHCommercRNIS`, `catGKHItogRNIS`, `catDepartStateRNIS`, `catDepartMunicRNIS`, `catDepartCommercRNIS`, `catDepartItogRNIS`, `catM1StateOther`, `catM1MunicOther`, `catM1CommercOther`, `catM1ItogOther`, `catM2M3StateOther`, `catM2M3MunicOther`, `catM2M3CommercOther`, `catM2M3ItogOther`, `catLargeStateOther`, `catLargeMunicOther`, `catLargeCommercOther`, `catLargeItogOther`, `catDangerStateOther`, `catDangerMunicOther`, `catDangerCommercOther`, `catDangerItogOther`, `catSchoolStateOther`, `catSchoolMunicOther`, `catSchoolCommercOther`, `catSchoolItogOther`, `catGKHStateOther`, `catGKHMunicOther`, `catGKHCommercOther`, `catGKHItogOther`, `catDepartStateOther`, `catDepartMunicOther`, `catDepartCommercOther`, `catDepartItogOther`) VALUES
	(14, 'minzdrav', '2014-12-25 17:51:07', 1, 1, 1, 3, 2, 2, 2, 6, 3, 3, 3, 9, 1, 1, 1, 3, 2, 2, 2, 6, 3, 3, 3, 9, 1, 1, 1, 3, 1, 1, 1, 3, 2, 2, 2, 6, 3, 3, 3, 9, 1, 1, 1, 3, 2, 2, 2, 6, 3, 3, 3, 9, 1, 1, 1, 3, 1, 1, 1, 3, 2, 2, 2, 6, 3, 3, 3, 9, 1, 1, 1, 3, 2, 2, 2, 6, 3, 3, 3, 9, 1, 1, 1, 3, 1, 1, 1, 3, 2, 2, 2, 6, 3, 3, 3, 9, 1, 1, 1, 3, 2, 2, 2, 6, 3, 3, 3, 9, 1, 1, 1, 3),
	(15, 'uprzhiv', '2014-12-25 17:52:24', 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
	(16, 'sobes', '2014-12-26 11:02:50', 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
	(17, 'sobes', '2014-12-26 11:15:27', 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
	(18, 'sobes', '2014-12-26 11:15:46', 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
	(19, 'sobes', '2014-12-26 10:34:00', 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
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

-- Дамп данных таблицы reportglonass.users: ~43 rows (приблизительно)
DELETE FROM `users`;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`login`, `password`, `name_user`, `date_last_report`, `group_user`) VALUES
	('admbel', '1', 'г. Белогорск', '2014-12-25 17:32:22', 'municipal'),
	('admblag', '1', 'г. Благовещенск', '2014-12-25 17:32:53', 'municipal'),
	('admin', '1', 'Администратор системы', '2014-12-22 10:10:57', 'admin'),
	('admraych', '1', 'г. Райчихинск', '2014-12-25 17:33:54', 'municipal'),
	('admshim', '1', 'г. Шимановск', '2014-12-25 17:35:27', 'municipal'),
	('admsvob', '1', 'г. Свободный', '2014-12-25 17:34:28', 'municipal'),
	('admtynda', '1', 'г. Тында', '2014-12-25 17:34:56', 'municipal'),
	('admzeya', '1', 'г. Зея', '2014-12-25 17:33:26', 'municipal'),
	('apparat', '1', 'Аппарат губернатора области и Правительства области', '2014-12-25 17:18:03', 'iogv'),
	('arhara', '1', 'Архаринский район', '2014-12-25 17:30:18', 'municipal'),
	('belogorsk', '1', 'Белогорский район', '2014-12-25 17:30:53', 'municipal'),
	('blag', '1', 'Благовещенский район', '2014-12-25 17:31:25', 'municipal'),
	('bureya', '1', 'Бурейский район', '2014-12-25 17:31:54', 'municipal'),
	('gosteh', '1', 'Гостехнадзор', '2014-12-25 17:17:34', 'iogv'),
	('ivanovka', '1', 'Ивановский район', '2014-12-25 17:37:00', 'municipal'),
	('konst', '1', 'Константиновский район', '2014-12-25 17:37:28', 'municipal'),
	('magd', '1', 'Магдагачинский район', '2014-12-25 17:37:55', 'municipal'),
	('mazan', '1', 'Мазановский район', '2014-12-25 17:38:41', 'municipal'),
	('mih', '1', 'Михайловский район', '2014-12-25 17:39:08', 'municipal'),
	('minagro', '1', 'Министерство сельского хозяйства', '2014-12-25 16:59:06', 'iogv'),
	('mincult', '1', 'Министерство культуры и архивного дела', '2014-12-25 16:59:37', 'iogv'),
	('minles', '1', 'Министерство лесного хозяйства и пожарной безопасности', '2014-12-25 17:00:02', 'iogv'),
	('minobr', '1', 'Министерство образования и науки', '2014-12-25 17:00:35', 'iogv'),
	('minstroy', '1', 'Министерство строительства и архитектуры', '2014-12-25 16:50:46', 'iogv'),
	('mintrans', '1', 'Министерство транспорта и дорожного хозяйства', '2014-12-25 16:58:06', 'iogv'),
	('minzdrav', '1', 'Министерство здравоохранения', '2014-12-25 17:51:07', 'iogv'),
	('oktyabr', '1', 'Октябрьский район', '2014-12-25 17:39:47', 'municipal'),
	('progress', '1', 'Пгт Прогресс', '2014-12-25 17:45:34', 'municipal'),
	('romn', '1', 'Ромненский район', '2014-12-25 17:41:35', 'municipal'),
	('selemja', '1', 'Селемджинский район', '2014-12-25 17:42:36', 'municipal'),
	('sersh', '1', 'Серышевский район', '2014-12-25 17:43:04', 'municipal'),
	('shim', '1', 'Шимановский район', '2014-12-25 17:45:08', 'municipal'),
	('skov', '1', 'Сковородинский район', '2014-12-25 17:43:33', 'municipal'),
	('sobes', '1', 'Министерство социальной защиты населения', '2014-12-26 10:34:00', 'iogv'),
	('svobod', '1', 'Свободненский район', '2014-12-25 17:42:07', 'municipal'),
	('tambovka', '1', 'Тамбовский район', '2014-12-25 17:44:13', 'municipal'),
	('tynda', '1', 'Тындинский район', '2014-12-25 17:44:41', 'municipal'),
	('uprvet', '1', 'Управление ветеринарии', '2014-12-25 17:01:10', 'iogv'),
	('uprzhiv', '1', 'Управление по охране, контролю и регулированию использования', '2014-12-25 17:52:24', 'iogv'),
	('zags', '1', 'Управление записи актов гражданского состояния', '2014-12-25 17:01:46', 'iogv'),
	('zato', '1', 'ЗАТО Углегорск', '2014-12-25 17:40:19', 'municipal'),
	('zavitaya', '1', 'Завитинский район', '2014-12-25 17:35:56', 'municipal'),
	('zeya', '1', 'Зейский район', '2014-12-25 17:36:22', 'municipal');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
