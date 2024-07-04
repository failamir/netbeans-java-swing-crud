-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.21-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for project_data_karyawan
CREATE DATABASE IF NOT EXISTS `project_data_karyawan` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `project_data_karyawan`;


-- Dumping structure for table project_data_karyawan.biodata_karyawan
CREATE TABLE IF NOT EXISTS `biodata_karyawan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama_karyawan` varchar(50) DEFAULT NULL,
  `nik` varchar(50) DEFAULT NULL,
  `kodepos` varchar(50) DEFAULT NULL,
  `alamat` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- Dumping data for table project_data_karyawan.biodata_karyawan: ~0 rows (approximately)
/*!40000 ALTER TABLE `biodata_karyawan` DISABLE KEYS */;
INSERT INTO `biodata_karyawan` (`id`, `nama_karyawan`, `nik`, `kodepos`, `alamat`) VALUES
	(7, 'Yazied DA', '123456', '8400000', 'Karawang'),
	(8, 'Ucok', '654321', '9200000', 'Klari');
/*!40000 ALTER TABLE `biodata_karyawan` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
