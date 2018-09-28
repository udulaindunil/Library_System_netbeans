-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 28, 2018 at 09:03 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mylibrary`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `Username` varchar(30) NOT NULL,
  `Name` varchar(40) NOT NULL,
  `Password` int(20) NOT NULL,
  `Sec_Q` varchar(50) NOT NULL,
  `Answer` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`Username`, `Name`, `Password`, `Sec_Q`, `Answer`) VALUES
('udula', 'udula indunil', 1997, 'What is your pet''s name?', 'RICO');

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `Book_ID` int(10) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Edition` int(3) NOT NULL,
  `Publisher` varchar(50) NOT NULL,
  `Price` int(10) NOT NULL,
  `Pages` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`Book_ID`, `Name`, `Edition`, `Publisher`, `Price`, `Pages`) VALUES
(231, 'Physics', 1, 'Sarasavi', 500, 480),
(717, 'Statistic', 3, 'Yapa', 1200, 870);

-- --------------------------------------------------------

--
-- Table structure for table `issue`
--

CREATE TABLE `issue` (
  `Book_ID` int(10) NOT NULL,
  `B_Name` varchar(50) NOT NULL,
  `Edition` int(30) NOT NULL,
  `Publisher` varchar(30) NOT NULL,
  `Price` int(7) NOT NULL,
  `Pages` int(4) NOT NULL,
  `Student_Id` int(10) NOT NULL,
  `S_name` varchar(50) NOT NULL,
  `F_name` varchar(50) NOT NULL,
  `Course` varchar(30) NOT NULL,
  `Branch` varchar(20) NOT NULL,
  `Year` int(2) NOT NULL,
  `Semester` int(2) NOT NULL,
  `DateOfIssue` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `issue`
--

INSERT INTO `issue` (`Book_ID`, `B_Name`, `Edition`, `Publisher`, `Price`, `Pages`, `Student_Id`, `S_name`, `F_name`, `Course`, `Branch`, `Year`, `Semester`, `DateOfIssue`) VALUES
(717, 'Statistic', 3, 'Yapa', 1200, 870, 9875, 'Sasindu Subodhaka', 'Lakshman Sensly', 'Compuer science', 'ucsc', 1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `Student_ID` int(10) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Father_Name` varchar(50) NOT NULL,
  `Course` varchar(30) NOT NULL,
  `Branch` varchar(30) NOT NULL,
  `Year` int(2) NOT NULL,
  `Semester` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`Student_ID`, `Name`, `Father_Name`, `Course`, `Branch`, `Year`, `Semester`) VALUES
(9875, 'Sasindu Subodhaka', 'Lakshman Sensly', 'Compuer science', 'ucsc', 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`Book_ID`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`Student_ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
