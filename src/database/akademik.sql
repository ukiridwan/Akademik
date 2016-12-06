-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 30, 2016 at 05:09 PM
-- Server version: 5.6.26
-- PHP Version: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `akademik`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `nip` int(10) NOT NULL PRIMARY KEY,
  `namaAdmin` varchar(20) NOT NULL,
  `alamatAdmin` varchar(50) NOT NULL,
  `telpAdmin` varchar(12) NOT NULL,
  `passAdmin` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Table structure for table `dosen`
--

CREATE TABLE IF NOT EXISTS `dosen` (
  `nik` int(10) NOT NULL PRIMARY KEY,
  `namaDosen` varchar(20) NOT NULL,
  `alamatDosen` varchar(50) NOT NULL,
  `telpDosen` varchar(12) NOT NULL,
  `passDosen` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE IF NOT EXISTS `mahasiswa` (
  `nim` int(10) NOT NULL PRIMARY KEY,
  `namaMhs` varchar(20) NOT NULL,
  `kelas` varchar(10) DEFAULT NULL,
  `alamatMhs` varchar(50) NOT NULL,
  `telpMhs` varchar(12) NOT NULL,
  `passMhs` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Table structure for table `registrasi`
--

CREATE TABLE IF NOT EXISTS `registrasi` (
  `idRegist` int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `nip` int(10) NOT NULL,
  `nim` int(10) NOT NULL,
  `token` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for table `registrasi`
--
ALTER TABLE `registrasi`
  ADD CONSTRAINT `registrasi_FK` FOREIGN KEY (`idRegist`) REFERENCES `admin` (`nip`) ON DELETE CASCADE,
  ADD CONSTRAINT `registrasi_FK2` FOREIGN KEY (`idRegist`) REFERENCES `mahasiswa` (`nim`) ON DELETE CASCADE;

--
-- Table structure for table `matakuliah`
--

CREATE TABLE IF NOT EXISTS `matakuliah` (
  `idMatkul` int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `namaMatkul` varchar(25) NOT NULL,
  `sks` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `indeks`
--

CREATE TABLE IF NOT EXISTS `indeks` (
  `idIndeks` int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `idMatkul` int(10) NOT NULL,
  `nim` int(10) NOT NULL,
  `indeksnilai` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for table `indeks`
--
ALTER TABLE `indeks`
  ADD CONSTRAINT `indeks_FK` FOREIGN KEY (`idIndeks`) REFERENCES `matakuliah` (`idMatkul`) ON DELETE CASCADE,
  ADD CONSTRAINT `indeks_FK2` FOREIGN KEY (`idIndeks`) REFERENCES `mahasiswa` (`nim`) ON DELETE CASCADE;

--
-- Table structure for table `jadwal`
--

CREATE TABLE IF NOT EXISTS `jadwal` (
  `idJadwal` int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `idMatkul` int(10) NOT NULL,
  `nik` int(10) NOT NULL,
  `ruang` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD CONSTRAINT `jadwal_FK` FOREIGN KEY (`idJadwal`) REFERENCES `matakuliah` (`idMatkul`) ON DELETE CASCADE,
  ADD CONSTRAINT `jadwal_FK2` FOREIGN KEY (`idJadwal`) REFERENCES `dosen` (`nik`) ON DELETE CASCADE;

  
--
-- Table structure for table `absensi`
--

CREATE TABLE IF NOT EXISTS `absensi` (
  `idAbsensi` int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `idJadwal` int(10) NOT NULL,
  `nim` int(10) NOT NULL,
  `absen` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for table `absensi`
--
ALTER TABLE `absensi`
  ADD CONSTRAINT `absensi_FK` FOREIGN KEY (`idAbsensi`) REFERENCES `jadwal` (`idJadwal`) ON DELETE CASCADE,
  ADD CONSTRAINT `absensi_FK2` FOREIGN KEY (`idAbsensi`) REFERENCES `mahasiswa` (`nim`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
