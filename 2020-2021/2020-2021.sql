-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 23, 2025 lúc 04:45 PM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `2020-2021`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhatkychi`
--

CREATE TABLE `nhatkychi` (
  `id` int(11) NOT NULL,
  `ngay` date NOT NULL,
  `muchi` varchar(255) NOT NULL,
  `sotien` int(255) NOT NULL,
  `ghichu` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nhatkychi`
--

INSERT INTO `nhatkychi` (`id`, `ngay`, `muchi`, `sotien`, `ghichu`) VALUES
(1, '2025-05-23', 'an uong', 1000, 'a'),
(2, '2025-05-23', 'uong', 1000, ''),
(3, '2025-05-23', 'tai xiu', 2000, 'thua'),
(4, '2002-12-12', 'an uong', 2000, '1');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `nhatkychi`
--
ALTER TABLE `nhatkychi`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
