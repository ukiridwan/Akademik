-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 08, 2016 at 06:55 AM
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
-- Table structure for table `absensi`
--

CREATE TABLE IF NOT EXISTS `absensi` (
  `idAbsensi` int(10) NOT NULL,
  `idJadwal` int(10) NOT NULL,
  `nim` int(10) NOT NULL,
  `absen` varchar(10) NOT NULL,
  `tidakAbsen` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `nip` int(10) NOT NULL,
  `namaAdmin` varchar(20) NOT NULL,
  `alamatAdmin` varchar(50) NOT NULL,
  `telpAdmin` varchar(12) NOT NULL,
  `passAdmin` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE IF NOT EXISTS `dosen` (
  `nik` int(10) NOT NULL,
  `namaDosen` varchar(20) NOT NULL,
  `alamatDosen` varchar(50) NOT NULL,
  `telpDosen` varchar(12) NOT NULL,
  `passDosen` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `indeks`
--

CREATE TABLE IF NOT EXISTS `indeks` (
  `idIndeks` int(10) NOT NULL,
  `idMatkul` int(10) NOT NULL,
  `nim` int(10) NOT NULL,
  `indeksnilai` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `jadwal`
--

CREATE TABLE IF NOT EXISTS `jadwal` (
  `idJadwal` int(10) NOT NULL,
  `idMatkul` int(10) NOT NULL,
  `nik` int(10) NOT NULL,
  `ruang` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE IF NOT EXISTS `mahasiswa` (
  `nim` int(10) NOT NULL,
  `namaMhs` varchar(20) NOT NULL,
  `kelas` varchar(10) DEFAULT NULL,
  `alamatMhs` varchar(50) NOT NULL,
  `telpMhs` varchar(12) NOT NULL,
  `passMhs` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `matakuliah`
--

CREATE TABLE IF NOT EXISTS `matakuliah` (
  `idMatkul` int(10) NOT NULL,
  `namaMatkul` varchar(25) NOT NULL,
  `sks` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `registrasi`
--

CREATE TABLE IF NOT EXISTS `registrasi` (
  `idRegist` int(10) NOT NULL,
  `nim` int(10) NOT NULL,
  `token` varchar(10) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `absensi`
--
ALTER TABLE `absensi`
  ADD PRIMARY KEY (`idAbsensi`),
  ADD KEY `idJadwal` (`idJadwal`),
  ADD KEY `nim` (`nim`);

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`nik`);

--
-- Indexes for table `indeks`
--
ALTER TABLE `indeks`
  ADD PRIMARY KEY (`idIndeks`),
  ADD KEY `idMatkul` (`idMatkul`),
  ADD KEY `nim` (`nim`);

--
-- Indexes for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD PRIMARY KEY (`idJadwal`),
  ADD KEY `idMatkul` (`idMatkul`),
  ADD KEY `nik` (`nik`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `matakuliah`
--
ALTER TABLE `matakuliah`
  ADD PRIMARY KEY (`idMatkul`);

--
-- Indexes for table `registrasi`
--
ALTER TABLE `registrasi`
  ADD PRIMARY KEY (`idRegist`),
  ADD KEY `nim` (`nim`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `absensi`
--
ALTER TABLE `absensi`
  MODIFY `idAbsensi` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `indeks`
--
ALTER TABLE `indeks`
  MODIFY `idIndeks` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `jadwal`
--
ALTER TABLE `jadwal`
  MODIFY `idJadwal` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `matakuliah`
--
ALTER TABLE `matakuliah`
  MODIFY `idMatkul` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `registrasi`
--
ALTER TABLE `registrasi`
  MODIFY `idRegist` int(10) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `absensi`
--
ALTER TABLE `absensi`
  ADD CONSTRAINT `absensi_FK` FOREIGN KEY (`idJadwal`) REFERENCES `jadwal` (`idJadwal`) ON DELETE CASCADE,
  ADD CONSTRAINT `absensi_FK2` FOREIGN KEY (`nim`) REFERENCES `mahasiswa` (`nim`) ON DELETE CASCADE;

--
-- Constraints for table `indeks`
--
ALTER TABLE `indeks`
  ADD CONSTRAINT `indeks_FK` FOREIGN KEY (`idMatkul`) REFERENCES `matakuliah` (`idMatkul`) ON DELETE CASCADE,
  ADD CONSTRAINT `indeks_FK2` FOREIGN KEY (`nim`) REFERENCES `mahasiswa` (`nim`) ON DELETE CASCADE;

--
-- Constraints for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD CONSTRAINT `jadwal_FK` FOREIGN KEY (`idMatkul`) REFERENCES `matakuliah` (`idMatkul`) ON DELETE CASCADE,
  ADD CONSTRAINT `jadwal_FK2` FOREIGN KEY (`nik`) REFERENCES `dosen` (`nik`) ON DELETE CASCADE;

--
-- Constraints for table `registrasi`
--
ALTER TABLE `registrasi`
  ADD CONSTRAINT `registrasi_FK` FOREIGN KEY (`nim`) REFERENCES `mahasiswa` (`nim`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
