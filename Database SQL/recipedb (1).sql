-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 13, 2022 at 05:46 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `recipedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `recipes`
--

CREATE TABLE `recipes` (
  `id` int(11) NOT NULL,
  `title` varchar(20) NOT NULL,
  `description` varchar(100) NOT NULL,
  `preparedby` varchar(20) NOT NULL,
  `ingredients` varchar(100) NOT NULL,
  `recipecategory` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `recipes`
--

INSERT INTO `recipes` (`id`, `title`, `description`, `preparedby`, `ingredients`, `recipecategory`) VALUES
(1, 'Chappathi', 'roundflatunleavenedbread', 'raju', 'wheat', 'veg'),
(2, 'Dosa', 'rice pancake', 'raju', 'rice,blackgram', 'veg'),
(3, 'Rasam', 'soup of spices', 'Soja', 'Water, Spices', 'veg'),
(4, 'Chicken Biriyani', 'Rice dish with Chicken', 'Tim', 'Rice,Chicken,Spices', 'nonveg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `recipes`
--
ALTER TABLE `recipes`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `recipes`
--
ALTER TABLE `recipes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
