-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jul 07, 2024 at 09:13 AM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project_data_karyawan`
--

-- --------------------------------------------------------

--
-- Table structure for table `biodata_karyawan`
--

CREATE TABLE `biodata_karyawan` (
  `id` int NOT NULL,
  `nik` varchar(100) NOT NULL,
  `nama_karyawan` varchar(100) NOT NULL,
  `jenis_kelamin` varchar(6) DEFAULT NULL,
  `tempat_lahir` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `pendidikan` varchar(10) DEFAULT NULL,
  `departemen` varchar(100) DEFAULT NULL,
  `jabatan` varchar(100) DEFAULT NULL,
  `no_telepon` varchar(15) DEFAULT NULL,
  `status` varchar(15) DEFAULT NULL,
  `alamat` varchar(300) DEFAULT NULL,
  `kodepos` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `biodata_karyawan`
--

INSERT INTO `biodata_karyawan` (`id`, `nik`, `nama_karyawan`, `jenis_kelamin`, `tempat_lahir`, `tanggal_lahir`, `pendidikan`, `departemen`, `jabatan`, `no_telepon`, `status`, `alamat`, `kodepos`) VALUES
(1, '9123891237183', 'fail', 'pria', 'jakarta', '2024-07-12', 'S4', 'TECH', 'CEO', '073123122', 'Aktif', 'jogja', '27131'),
(2, '9218321931', 'anis', 'wanita', 'wonosari', '1999-02-15', 'S2', 'bahasa UNY', 'Sekretaris', '03213123123', 'Tidak Aktif', 'wonosari', '36723');

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `id` int NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `nik` varchar(50) DEFAULT NULL,
  `gaji` varchar(50) DEFAULT NULL,
  `alamat` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`id`, `nama`, `nik`, `gaji`, `alamat`) VALUES
(7, 'Ragam', '123456', '8400000', 'Karawang'),
(8, 'CANDRA', '654321', '9200000', 'Klari'),
(9, 'Fail', '0831273121', '9900000', 'JOGJA');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `biodata_karyawan`
--
ALTER TABLE `biodata_karyawan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `biodata_karyawan`
--
ALTER TABLE `biodata_karyawan`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `karyawan`
--
ALTER TABLE `karyawan`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
