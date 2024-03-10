-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-03-2024 a las 23:30:05
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `preguntas_v2_db`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuestionarios`
--

CREATE TABLE `cuestionarios` (
  `id` int(11) NOT NULL,
  `id_usuario` int(11) UNSIGNED NOT NULL,
  `cant_preguntas` int(11) NOT NULL,
  `cant_ok` int(11) NOT NULL,
  `cant_error` int(11) NOT NULL,
  `fecha_inicio` datetime NOT NULL DEFAULT current_timestamp(),
  `fecha_fin` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `cuestionarios`
--

INSERT INTO `cuestionarios` (`id`, `id_usuario`, `cant_preguntas`, `cant_ok`, `cant_error`, `fecha_inicio`, `fecha_fin`) VALUES
(1, 1, 2, 1, 1, '2024-01-25 20:32:56', NULL),
(2, 1, 0, 0, 0, '2024-01-25 23:41:44', '2024-01-25 23:47:44'),
(38, 1, 0, 0, 0, '2024-01-26 12:18:46', NULL),
(39, 1, 0, 0, 0, '2024-01-26 12:26:09', NULL),
(40, 1, 0, 0, 0, '2024-03-04 19:21:35', NULL),
(41, 1, 0, 0, 0, '2024-03-04 19:23:47', NULL),
(42, 1, 0, 0, 0, '2024-03-04 19:49:03', NULL),
(43, 1, 0, 0, 0, '2024-03-04 19:56:37', NULL),
(44, 1, 0, 0, 0, '2024-03-04 20:06:15', NULL),
(45, 1, 0, 0, 0, '2024-03-04 20:16:39', NULL),
(46, 1, 0, 0, 0, '2024-03-04 20:24:23', NULL),
(47, 1, 0, 0, 0, '2024-03-05 18:13:56', NULL),
(48, 1, 0, 0, 0, '2024-03-05 18:52:20', NULL),
(49, 1, 0, 0, 0, '2024-03-05 18:52:52', NULL),
(50, 1, 0, 0, 0, '2024-03-05 18:53:42', NULL),
(51, 1, 0, 0, 0, '2024-03-05 18:56:19', NULL),
(52, 1, 0, 0, 0, '2024-03-05 19:00:53', NULL),
(53, 1, 0, 0, 0, '2024-03-05 19:40:23', NULL),
(54, 1, 0, 0, 0, '2024-03-05 19:41:25', NULL),
(55, 1, 0, 0, 0, '2024-03-05 19:42:02', NULL),
(56, 1, 0, 0, 0, '2024-03-05 19:43:01', NULL),
(57, 1, 0, 0, 0, '2024-03-05 19:56:37', NULL),
(58, 1, 0, 0, 0, '2024-03-05 19:58:31', NULL),
(59, 1, 0, 0, 0, '2024-03-05 19:59:13', NULL),
(60, 1, 0, 0, 0, '2024-03-05 20:00:44', NULL),
(61, 1, 0, 0, 0, '2024-03-05 20:01:21', NULL),
(62, 1, 0, 0, 0, '2024-03-05 20:01:56', NULL),
(63, 1, 0, 0, 0, '2024-03-05 20:07:35', NULL),
(64, 1, 0, 0, 0, '2024-03-05 20:08:15', NULL),
(65, 1, 0, 0, 0, '2024-03-05 20:09:17', NULL),
(66, 1, 0, 0, 0, '2024-03-05 20:09:49', NULL),
(67, 1, 0, 0, 0, '2024-03-05 20:10:54', NULL),
(68, 1, 0, 0, 0, '2024-03-05 20:15:23', NULL),
(69, 1, 0, 0, 0, '2024-03-05 20:15:29', NULL),
(70, 1, 0, 0, 0, '2024-03-05 20:21:46', NULL),
(71, 1, 0, 0, 0, '2024-03-05 20:21:51', NULL),
(72, 1, 0, 0, 0, '2024-03-05 20:24:47', NULL),
(73, 1, 0, 0, 0, '2024-03-05 20:25:56', NULL),
(74, 1, 0, 0, 0, '2024-03-05 20:27:18', NULL),
(75, 1, 0, 0, 0, '2024-03-05 20:29:51', NULL),
(76, 1, 0, 0, 0, '2024-03-05 20:30:38', NULL),
(77, 1, 0, 0, 0, '2024-03-05 21:06:58', NULL),
(78, 1, 0, 0, 0, '2024-03-05 21:07:16', NULL),
(79, 1, 0, 0, 0, '2024-03-05 21:20:52', NULL),
(80, 1, 0, 0, 0, '2024-03-05 21:27:13', NULL),
(81, 1, 0, 0, 0, '2024-03-05 21:28:42', NULL),
(82, 1, 0, 0, 0, '2024-03-05 21:31:06', NULL),
(83, 1, 0, 0, 0, '2024-03-05 21:34:41', NULL),
(84, 1, 0, 0, 0, '2024-03-05 21:37:24', NULL),
(85, 1, 0, 0, 0, '2024-03-05 21:39:04', NULL),
(86, 1, 0, 0, 0, '2024-03-05 22:22:04', NULL),
(87, 1, 0, 0, 0, '2024-03-07 13:43:15', NULL),
(88, 1, 0, 0, 0, '2024-03-07 14:18:26', NULL),
(89, 1, 0, 0, 0, '2024-03-07 14:59:44', NULL),
(90, 1, 0, 0, 0, '2024-03-07 15:00:32', NULL),
(91, 1, 0, 0, 0, '2024-03-07 15:00:55', NULL),
(92, 1, 0, 0, 0, '2024-03-07 15:03:37', NULL),
(93, 1, 0, 0, 0, '2024-03-07 15:05:11', NULL),
(94, 1, 0, 0, 0, '2024-03-07 15:06:51', NULL),
(95, 1, 0, 0, 0, '2024-03-07 15:08:16', NULL),
(96, 1, 0, 0, 0, '2024-03-07 22:06:14', NULL),
(97, 1, 0, 0, 0, '2024-03-07 22:09:09', NULL),
(98, 1, 8, 5, 3, '2024-03-08 13:25:21', NULL),
(99, 1, 10, 6, 4, '2024-03-08 13:40:59', NULL),
(100, 1, 0, 0, 0, '2024-03-08 13:54:13', NULL),
(101, 1, 10, 3, 7, '2024-03-08 13:54:26', NULL),
(102, 1, 1, 0, 1, '2024-03-08 13:57:26', NULL),
(103, 1, 0, 0, 0, '2024-03-08 13:59:47', NULL),
(104, 1, 10, 4, 6, '2024-03-08 14:00:28', NULL),
(105, 1, 10, 6, 4, '2024-03-08 14:04:52', NULL),
(106, 1, 10, 2, 8, '2024-03-08 14:07:10', NULL),
(107, 1, 10, 4, 6, '2024-03-08 14:09:00', NULL),
(108, 1, 10, 3, 7, '2024-03-08 14:09:57', NULL),
(109, 1, 0, 0, 0, '2024-03-08 14:12:49', NULL),
(110, 1, 2, 1, 1, '2024-03-08 14:56:43', NULL),
(111, 1, 10, 6, 4, '2024-03-08 15:14:07', NULL),
(112, 1, 10, 9, 1, '2024-03-08 16:22:28', NULL),
(113, 1, 10, 9, 1, '2024-03-08 16:24:40', NULL),
(114, 1, 10, 10, 0, '2024-03-08 16:29:09', NULL),
(115, 1, 10, 6, 4, '2024-03-09 11:43:30', NULL),
(116, 1, 0, 0, 0, '2024-03-09 11:48:29', NULL),
(117, 1, 0, 0, 0, '2024-03-09 11:52:11', NULL),
(118, 1, 0, 0, 0, '2024-03-09 11:52:52', NULL),
(119, 1, 10, 6, 4, '2024-03-09 11:53:18', NULL),
(120, 1, 10, 9, 1, '2024-03-09 11:54:23', NULL),
(121, 1, 10, 9, 1, '2024-03-09 11:57:04', NULL),
(122, 1, 10, 9, 1, '2024-03-09 11:58:26', NULL),
(123, 1, 10, 9, 1, '2024-03-09 12:00:18', NULL),
(124, 1, 10, 10, 0, '2024-03-09 12:04:02', NULL),
(125, 1, 10, 8, 2, '2024-03-09 12:07:30', NULL),
(126, 1, 10, 6, 4, '2024-03-09 12:08:29', NULL),
(127, 1, 10, 7, 3, '2024-03-09 12:18:20', NULL),
(128, 1, 10, 7, 3, '2024-03-09 12:20:04', NULL),
(129, 1, 0, 0, 0, '2024-03-10 16:29:22', NULL),
(130, 1, 10, 10, 0, '2024-03-10 16:34:18', NULL),
(131, 1, 1, 1, 0, '2024-03-10 16:39:32', NULL),
(132, 1, 0, 0, 0, '2024-03-10 16:46:38', NULL),
(133, 1, 0, 0, 0, '2024-03-10 16:47:56', NULL),
(134, 1, 0, 0, 0, '2024-03-10 16:52:52', NULL),
(135, 1, 0, 0, 0, '2024-03-10 16:53:19', NULL),
(136, 1, 0, 0, 0, '2024-03-10 16:54:47', NULL),
(137, 1, 0, 0, 0, '2024-03-10 16:55:27', NULL),
(138, 1, 0, 0, 0, '2024-03-10 16:56:57', NULL),
(139, 1, 10, 10, 0, '2024-03-10 16:57:10', NULL),
(140, 1, 1, 1, 0, '2024-03-10 17:03:09', NULL),
(141, 1, 0, 0, 0, '2024-03-10 17:04:17', NULL),
(142, 1, 10, 9, 1, '2024-03-10 17:16:35', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `opciones`
--

CREATE TABLE `opciones` (
  `id` int(10) UNSIGNED NOT NULL,
  `id_pregunta` int(10) UNSIGNED DEFAULT NULL,
  `descripcion` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `opciones`
--

INSERT INTO `opciones` (`id`, `id_pregunta`, `descripcion`) VALUES
(1, 1, 'HyperText Markup Language'),
(2, 1, 'Hyperlink '),
(3, 1, 'High-Level'),
(4, 2, 'C'),
(5, 2, 'C++'),
(6, 2, 'Ruby'),
(7, 3, 'Cascaded S'),
(8, 3, 'Cascading Style Sheets'),
(9, 3, 'Cascaded S'),
(10, 4, '->'),
(11, 4, '='),
(12, 4, '==='),
(13, 5, 'Crear las '),
(14, 5, 'Almacenar '),
(15, 5, 'Lenguaje de consulta estructurada para gestionar bases de datos'),
(16, 6, 'Modelo-Visa'),
(17, 6, 'Modelo-Vista-Controlador'),
(18, 6, 'Microservi'),
(19, 7, 'Java'),
(20, 7, 'PHP'),
(21, 7, 'C'),
(22, 8, 'Instrucción'),
(23, 8, 'Estructura de control de iteración'),
(24, 8, 'Comando de'),
(25, 9, 'SVN'),
(26, 9, 'Mercurial'),
(27, 9, 'GitHub'),
(28, 10, 'Un conjunt'),
(29, 10, 'Un disposi'),
(30, 10, 'Un conjunto de instrucciones paso a paso para realizar una tarea'),
(31, 9, 'Git');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `preguntas`
--

CREATE TABLE `preguntas` (
  `id` int(10) UNSIGNED NOT NULL,
  `descripcion` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `id_correcta` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `url_imagen` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `preguntas`
--

INSERT INTO `preguntas` (`id`, `descripcion`, `id_correcta`, `url_imagen`) VALUES
(1, '¿Qué significa HTML?', '1', 'https://www.oxfordwebstudio.com/user/pages/06.da-li-znate/sta-je-html/sta-je-html.jpg'),
(2, '¿En qué lenguaje est? escrito Python?', '4', 'https://www.solvetic.com/uploads/monthly_01_2016/tutorials-1415-0-60642300-1452279191.jpg'),
(3, '¿Qué es CSS?', '8', 'https://1000marcas.net/wp-content/uploads/2021/02/CSS-Logo.png'),
(4, '¿Cuál es el símbolo de asignación en JavaScript?', '11', 'https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Unofficial_JavaScript_logo_2.svg/1200px-Unofficial_JavaScript_logo_2.svg.png'),
(5, '¿Cuál es el propósito de SQL?', '15', 'https://www.bigbaydata.com/wp-content/uploads/2022/11/sql_ejercicios.png'),
(6, '¿Qué significa MVC en el contexto del desarrollo web?', '17', 'https://estradawebgroup.com/ImagesUpload/File_Upload_202331310241646_U_7.webp'),
(7, '¿Cuál es el lenguaje de programación más utilizado para el desarrollo de aplicaciones Android?', '19', 'https://developer.android.com/static/training/basics/firstapp/images/first_app.svg?hl=es-419'),
(8, '¿Qué es un bucle \"for\" en la programación?', '23', 'https://sistemasumma.files.wordpress.com/2012/10/ciclos.png?w=1140'),
(9, '¿Cuál es el sistema de control de versiones más utilizado?', '31', 'https://victorroblesweb.es/wp-content/uploads/2018/04/git.png'),
(10, '¿Qué es un algoritmo?', '30', 'https://cdn.openwebinars.net/media/featured_images/blog-que-es-un-algoritmo-informatico.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuestas`
--

CREATE TABLE `respuestas` (
  `id_respuesta` int(10) UNSIGNED NOT NULL,
  `id_cuestionario` int(11) NOT NULL,
  `id_pregunta` int(10) UNSIGNED DEFAULT NULL,
  `respuesta` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `estado` enum('OK','ERROR') CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `fecha` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `respuestas`
--

INSERT INTO `respuestas` (`id_respuesta`, `id_cuestionario`, `id_pregunta`, `respuesta`, `estado`, `fecha`) VALUES
(3, 1, 1, 'Hyperlink Text Markup Language', 'OK', '2024-01-25 20:38:55'),
(5, 1, 5, 'Crear las bases de datos', 'ERROR', '2024-01-25 20:40:15'),
(6, 2, 7, 'Java', 'OK', '2024-01-25 23:43:42'),
(7, 2, 9, 'Git', 'OK', '2024-01-25 23:43:42'),
(8, 2, 4, '=', 'OK', '2024-01-25 23:44:08'),
(9, 2, 10, 'Un conjunto de instrucciones paso a paso para realizar una tarea', 'OK', '2024-01-25 23:44:35'),
(44, 38, 6, 'Microservices-Virtual Container', 'ERROR', '2024-01-26 07:18:53'),
(45, 38, 10, 'Un dispositivo de almacenamiento de datos', 'ERROR', '2024-01-26 07:18:55'),
(46, 38, 8, 'InstrucciÃƒÂ³n de salida', 'ERROR', '2024-01-26 07:18:58'),
(47, 38, 5, 'Almacenar grandes cantidades de datos', 'ERROR', '2024-01-26 07:19:01'),
(48, 39, 6, 'MÃƒÂ¡quina Virtual de Control', 'ERROR', '2024-01-26 07:26:56'),
(49, 39, 10, 'Un dispositivo de almacenamiento de datos', 'ERROR', '2024-01-26 07:29:01'),
(50, 39, 4, '==', 'ERROR', '2024-01-26 07:31:30'),
(51, 39, 5, 'Almacenar grandes cantidades de datos', 'ERROR', '2024-01-26 07:32:29'),
(52, 39, 3, 'Cascading Styling Sheets', 'ERROR', '2024-01-26 07:32:31'),
(53, 39, 1, 'Hyperlink Text Markup Language', 'ERROR', '2024-01-26 07:32:33'),
(54, 39, 9, 'Mercurial', 'ERROR', '2024-01-26 07:32:48'),
(55, 39, 2, 'C++', 'ERROR', '2024-01-26 07:32:50'),
(56, 39, 8, 'Estructura de selecciÃƒÂ³n', 'OK', '2024-01-26 07:32:52'),
(57, 40, 5, 'sad', 'OK', '2024-03-05 20:33:52'),
(58, 40, 9, 'dwadawd', 'OK', '2024-03-07 13:51:46'),
(59, 93, 1, 'HyperText Markup Language', 'OK', '2024-03-07 15:05:14'),
(60, 94, 2, 'C', 'OK', '2024-03-07 15:06:54'),
(61, 95, 8, 'Instrucción', 'ERROR', '2024-03-07 15:08:22'),
(62, 95, 10, 'Un disposi', 'ERROR', '2024-03-07 15:09:01'),
(63, 95, 5, 'Crear las ', 'ERROR', '2024-03-07 15:09:03'),
(64, 95, 3, 'Cascading Style Sheets', 'OK', '2024-03-07 15:09:06'),
(65, 95, 9, 'Git', 'OK', '2024-03-07 15:09:08'),
(66, 95, 2, 'C', 'OK', '2024-03-07 15:09:10'),
(67, 95, 6, 'Modelo-Vista-Controlador', 'OK', '2024-03-07 15:09:12'),
(68, 95, 7, 'Java', 'OK', '2024-03-07 15:09:15'),
(69, 95, 1, 'HyperText Markup Language', 'OK', '2024-03-07 15:09:17'),
(70, 95, 4, '===', 'ERROR', '2024-03-07 15:09:20'),
(71, 97, 8, 'Estructura de control de iteración', 'OK', '2024-03-07 22:09:23'),
(72, 97, 1, 'High-Level', 'ERROR', '2024-03-07 22:09:45'),
(73, 98, 8, 'Instrucción', 'ERROR', '2024-03-08 13:27:03'),
(74, 98, 6, 'Microservi', 'ERROR', '2024-03-08 13:27:57'),
(75, 98, 10, 'Un disposi', 'ERROR', '2024-03-08 13:31:54'),
(76, 98, 3, 'Cascading Style Sheets', 'OK', '2024-03-08 13:32:36'),
(77, 98, 5, 'Almacenar ', 'ERROR', '2024-03-08 13:32:48'),
(78, 98, 1, 'HyperText Markup Language', 'OK', '2024-03-08 13:35:46'),
(79, 98, 7, 'Java', 'OK', '2024-03-08 13:38:14'),
(80, 98, 4, '->', 'ERROR', '2024-03-08 13:38:16'),
(81, 98, 2, 'C', 'OK', '2024-03-08 13:38:18'),
(82, 98, 9, 'Git', 'OK', '2024-03-08 13:38:19'),
(83, 99, 10, 'Un disposi', 'ERROR', '2024-03-08 13:42:20'),
(84, 99, 5, 'Crear las ', 'ERROR', '2024-03-08 13:42:22'),
(85, 99, 6, 'Modelo-Vista-Controlador', 'OK', '2024-03-08 13:42:23'),
(86, 99, 2, 'C', 'OK', '2024-03-08 13:42:25'),
(87, 99, 1, 'HyperText Markup Language', 'OK', '2024-03-08 13:42:27'),
(88, 99, 8, 'Estructura de control de iteración', 'OK', '2024-03-08 13:42:28'),
(89, 99, 4, '->', 'ERROR', '2024-03-08 13:42:30'),
(90, 99, 3, 'Cascaded S', 'ERROR', '2024-03-08 13:42:32'),
(91, 99, 9, 'Git', 'OK', '2024-03-08 13:42:34'),
(92, 99, 7, 'Java', 'OK', '2024-03-08 13:42:35'),
(93, 39, 7, 'dsada', 'OK', '2024-03-08 13:43:26'),
(94, 101, 5, 'Crear las ', 'ERROR', '2024-03-08 13:54:41'),
(95, 101, 9, 'Git', 'OK', '2024-03-08 13:54:45'),
(96, 101, 10, 'Un conjunt', 'ERROR', '2024-03-08 13:54:47'),
(97, 101, 2, 'C++', 'ERROR', '2024-03-08 13:54:48'),
(98, 101, 7, 'C', 'ERROR', '2024-03-08 13:54:49'),
(99, 101, 1, 'HyperText Markup Language', 'OK', '2024-03-08 13:54:51'),
(100, 101, 6, 'Modelo-Visa', 'ERROR', '2024-03-08 13:54:52'),
(101, 101, 8, 'Instrucción', 'ERROR', '2024-03-08 13:54:53'),
(102, 101, 4, '===', 'ERROR', '2024-03-08 13:54:55'),
(103, 101, 3, 'Cascading Style Sheets', 'OK', '2024-03-08 13:54:56'),
(104, 102, 5, 'Almacenar ', 'ERROR', '2024-03-08 13:57:29'),
(105, 104, 3, 'Cascaded S', 'ERROR', '2024-03-08 14:00:30'),
(106, 104, 9, 'Git', 'OK', '2024-03-08 14:00:32'),
(107, 104, 8, 'Estructura de control de iteración', 'OK', '2024-03-08 14:00:34'),
(108, 104, 5, 'Almacenar ', 'ERROR', '2024-03-08 14:00:35'),
(109, 104, 6, 'Modelo-Visa', 'ERROR', '2024-03-08 14:00:36'),
(110, 104, 1, 'Hyperlink ', 'ERROR', '2024-03-08 14:00:38'),
(111, 104, 7, 'C', 'ERROR', '2024-03-08 14:00:39'),
(112, 104, 2, 'C', 'OK', '2024-03-08 14:00:41'),
(113, 104, 4, '=', 'OK', '2024-03-08 14:00:43'),
(114, 104, 10, 'Un conjunt', 'ERROR', '2024-03-08 14:00:44'),
(115, 105, 6, 'Modelo-Vista-Controlador', 'OK', '2024-03-08 14:04:54'),
(116, 105, 1, 'HyperText Markup Language', 'OK', '2024-03-08 14:04:56'),
(117, 105, 5, 'Lenguaje de consulta estructurada para gestionar bases de datos', 'OK', '2024-03-08 14:04:57'),
(118, 105, 2, 'C', 'OK', '2024-03-08 14:04:58'),
(119, 105, 9, 'SVN', 'ERROR', '2024-03-08 14:05:00'),
(120, 105, 3, 'Cascaded S', 'ERROR', '2024-03-08 14:05:01'),
(121, 105, 7, 'Java', 'OK', '2024-03-08 14:05:03'),
(122, 105, 8, 'Estructura de control de iteración', 'OK', '2024-03-08 14:05:05'),
(123, 105, 4, '->', 'ERROR', '2024-03-08 14:05:06'),
(124, 105, 10, 'Un disposi', 'ERROR', '2024-03-08 14:05:08'),
(125, 106, 5, 'Crear las ', 'ERROR', '2024-03-08 14:07:12'),
(126, 106, 1, 'Hyperlink ', 'ERROR', '2024-03-08 14:07:13'),
(127, 106, 7, 'PHP', 'ERROR', '2024-03-08 14:07:15'),
(128, 106, 8, 'Instrucción', 'ERROR', '2024-03-08 14:07:17'),
(129, 106, 3, 'Cascaded S', 'ERROR', '2024-03-08 14:07:18'),
(130, 106, 9, 'SVN', 'ERROR', '2024-03-08 14:07:20'),
(131, 106, 2, 'C++', 'ERROR', '2024-03-08 14:07:22'),
(132, 106, 10, 'Un conjunt', 'ERROR', '2024-03-08 14:07:23'),
(133, 106, 4, '=', 'OK', '2024-03-08 14:07:25'),
(134, 106, 6, 'Modelo-Vista-Controlador', 'OK', '2024-03-08 14:07:26'),
(135, 107, 5, 'Crear las ', 'ERROR', '2024-03-08 14:09:02'),
(136, 107, 1, 'Hyperlink ', 'ERROR', '2024-03-08 14:09:03'),
(137, 107, 8, 'Estructura de control de iteración', 'OK', '2024-03-08 14:09:05'),
(138, 107, 4, '===', 'ERROR', '2024-03-08 14:09:07'),
(139, 107, 6, 'Modelo-Visa', 'ERROR', '2024-03-08 14:09:08'),
(140, 107, 10, 'Un disposi', 'ERROR', '2024-03-08 14:09:10'),
(141, 107, 3, 'Cascading Style Sheets', 'OK', '2024-03-08 14:09:11'),
(142, 107, 7, 'C', 'ERROR', '2024-03-08 14:09:13'),
(143, 107, 2, 'C', 'OK', '2024-03-08 14:09:14'),
(144, 107, 9, 'Git', 'OK', '2024-03-08 14:09:16'),
(145, 108, 6, 'Modelo-Visa', 'ERROR', '2024-03-08 14:09:59'),
(146, 108, 9, 'Git', 'OK', '2024-03-08 14:10:02'),
(147, 108, 7, 'C', 'ERROR', '2024-03-08 14:10:04'),
(148, 108, 8, 'Instrucción', 'ERROR', '2024-03-08 14:10:06'),
(149, 108, 5, 'Almacenar ', 'ERROR', '2024-03-08 14:10:08'),
(150, 108, 10, 'Un conjunt', 'ERROR', '2024-03-08 14:10:09'),
(151, 108, 4, '===', 'ERROR', '2024-03-08 14:10:11'),
(152, 108, 3, 'Cascading Style Sheets', 'OK', '2024-03-08 14:10:13'),
(153, 108, 2, 'C++', 'ERROR', '2024-03-08 14:10:14'),
(154, 108, 1, 'HyperText Markup Language', 'OK', '2024-03-08 14:10:16'),
(155, 110, 5, '15', 'OK', '2024-03-08 14:57:11'),
(156, 110, 10, '29', 'ERROR', '2024-03-08 14:59:33'),
(157, 111, 2, '4', 'OK', '2024-03-08 15:14:11'),
(158, 111, 10, '29', 'ERROR', '2024-03-08 15:14:14'),
(159, 111, 7, '20', 'ERROR', '2024-03-08 15:14:19'),
(160, 111, 9, '31', 'OK', '2024-03-08 15:14:21'),
(161, 111, 5, '15', 'OK', '2024-03-08 15:14:24'),
(162, 111, 4, '12', 'ERROR', '2024-03-08 15:14:27'),
(163, 111, 6, '17', 'OK', '2024-03-08 15:14:29'),
(164, 111, 8, '23', 'OK', '2024-03-08 15:14:31'),
(165, 111, 1, '3', 'ERROR', '2024-03-08 15:14:33'),
(166, 111, 3, '8', 'OK', '2024-03-08 15:14:35'),
(167, 112, 2, '4', 'OK', '2024-03-08 16:22:33'),
(168, 112, 4, '10', 'ERROR', '2024-03-08 16:22:35'),
(169, 112, 5, '15', 'OK', '2024-03-08 16:23:16'),
(170, 112, 1, '1', 'OK', '2024-03-08 16:23:19'),
(171, 112, 3, '8', 'OK', '2024-03-08 16:23:21'),
(172, 112, 8, '23', 'OK', '2024-03-08 16:23:25'),
(173, 112, 7, '19', 'OK', '2024-03-08 16:23:29'),
(174, 112, 6, '17', 'OK', '2024-03-08 16:23:31'),
(175, 112, 10, '30', 'OK', '2024-03-08 16:23:34'),
(176, 112, 9, '31', 'OK', '2024-03-08 16:23:35'),
(177, 113, 5, '15', 'OK', '2024-03-08 16:24:43'),
(178, 113, 4, '10', 'ERROR', '2024-03-08 16:24:46'),
(179, 113, 6, '17', 'OK', '2024-03-08 16:24:50'),
(180, 113, 8, '23', 'OK', '2024-03-08 16:24:55'),
(181, 113, 1, '1', 'OK', '2024-03-08 16:24:58'),
(182, 113, 7, '19', 'OK', '2024-03-08 16:25:01'),
(183, 113, 9, '31', 'OK', '2024-03-08 16:25:04'),
(184, 113, 3, '8', 'OK', '2024-03-08 16:25:08'),
(185, 113, 10, '30', 'OK', '2024-03-08 16:25:10'),
(186, 113, 2, '4', 'OK', '2024-03-08 16:25:12'),
(187, 114, 1, '1', 'OK', '2024-03-08 16:29:12'),
(188, 114, 10, '30', 'OK', '2024-03-08 16:29:16'),
(189, 114, 8, '23', 'OK', '2024-03-08 16:29:18'),
(190, 114, 9, '31', 'OK', '2024-03-08 16:29:19'),
(191, 114, 5, '15', 'OK', '2024-03-08 16:29:22'),
(192, 114, 6, '17', 'OK', '2024-03-08 16:29:24'),
(193, 114, 7, '19', 'OK', '2024-03-08 16:29:26'),
(194, 114, 3, '8', 'OK', '2024-03-08 16:29:28'),
(195, 114, 2, '4', 'OK', '2024-03-08 16:29:30'),
(196, 114, 4, '11', 'OK', '2024-03-08 16:29:32'),
(197, 115, 2, '4', 'OK', '2024-03-09 11:43:32'),
(198, 115, 6, '17', 'OK', '2024-03-09 11:43:34'),
(199, 115, 5, '15', 'OK', '2024-03-09 11:43:36'),
(200, 115, 8, '23', 'OK', '2024-03-09 11:43:38'),
(201, 115, 9, '31', 'OK', '2024-03-09 11:43:39'),
(202, 115, 1, '2', 'ERROR', '2024-03-09 11:43:41'),
(203, 115, 4, '12', 'ERROR', '2024-03-09 11:43:43'),
(204, 115, 3, '8', 'OK', '2024-03-09 11:43:44'),
(205, 115, 7, '20', 'ERROR', '2024-03-09 11:43:46'),
(206, 115, 10, '28', 'ERROR', '2024-03-09 11:43:48'),
(207, 119, 8, '23', 'OK', '2024-03-09 11:53:20'),
(208, 119, 6, '18', 'ERROR', '2024-03-09 11:53:22'),
(209, 119, 4, '11', 'OK', '2024-03-09 11:53:23'),
(210, 119, 3, '7', 'ERROR', '2024-03-09 11:53:25'),
(211, 119, 10, '29', 'ERROR', '2024-03-09 11:53:26'),
(212, 119, 5, '15', 'OK', '2024-03-09 11:53:27'),
(213, 119, 7, '20', 'ERROR', '2024-03-09 11:53:30'),
(214, 119, 1, '1', 'OK', '2024-03-09 11:53:32'),
(215, 119, 9, '31', 'OK', '2024-03-09 11:53:33'),
(216, 119, 2, '4', 'OK', '2024-03-09 11:53:35'),
(217, 120, 3, '8', 'OK', '2024-03-09 11:54:25'),
(218, 120, 6, '17', 'OK', '2024-03-09 11:54:27'),
(219, 120, 4, '11', 'OK', '2024-03-09 11:54:29'),
(220, 120, 5, '15', 'OK', '2024-03-09 11:54:30'),
(221, 120, 9, '31', 'OK', '2024-03-09 11:54:32'),
(222, 120, 7, '21', 'ERROR', '2024-03-09 11:54:34'),
(223, 120, 10, '30', 'OK', '2024-03-09 11:54:36'),
(224, 120, 1, '1', 'OK', '2024-03-09 11:54:37'),
(225, 120, 2, '4', 'OK', '2024-03-09 11:54:39'),
(226, 120, 8, '23', 'OK', '2024-03-09 11:54:41'),
(227, 121, 2, '4', 'OK', '2024-03-09 11:57:06'),
(228, 121, 7, '19', 'OK', '2024-03-09 11:57:08'),
(229, 121, 6, '17', 'OK', '2024-03-09 11:57:10'),
(230, 121, 3, '8', 'OK', '2024-03-09 11:57:11'),
(231, 121, 8, '23', 'OK', '2024-03-09 11:57:13'),
(232, 121, 1, '1', 'OK', '2024-03-09 11:57:14'),
(233, 121, 4, '11', 'OK', '2024-03-09 11:57:16'),
(234, 121, 5, '13', 'ERROR', '2024-03-09 11:57:19'),
(235, 121, 10, '30', 'OK', '2024-03-09 11:57:21'),
(236, 121, 9, '31', 'OK', '2024-03-09 11:57:22'),
(237, 122, 8, '23', 'OK', '2024-03-09 11:58:28'),
(238, 122, 4, '11', 'OK', '2024-03-09 11:58:30'),
(239, 122, 5, '15', 'OK', '2024-03-09 11:58:31'),
(240, 122, 6, '16', 'ERROR', '2024-03-09 11:58:33'),
(241, 122, 2, '4', 'OK', '2024-03-09 11:58:35'),
(242, 122, 3, '8', 'OK', '2024-03-09 11:58:37'),
(243, 122, 9, '31', 'OK', '2024-03-09 11:58:38'),
(244, 122, 1, '1', 'OK', '2024-03-09 11:58:40'),
(245, 122, 7, '19', 'OK', '2024-03-09 11:58:42'),
(246, 122, 10, '30', 'OK', '2024-03-09 11:58:43'),
(247, 123, 7, '21', 'ERROR', '2024-03-09 12:00:20'),
(248, 123, 10, '30', 'OK', '2024-03-09 12:00:22'),
(249, 123, 9, '31', 'OK', '2024-03-09 12:00:24'),
(250, 123, 3, '8', 'OK', '2024-03-09 12:00:25'),
(251, 123, 1, '1', 'OK', '2024-03-09 12:00:27'),
(252, 123, 2, '4', 'OK', '2024-03-09 12:00:28'),
(253, 123, 6, '17', 'OK', '2024-03-09 12:00:30'),
(254, 123, 4, '11', 'OK', '2024-03-09 12:00:32'),
(255, 123, 5, '15', 'OK', '2024-03-09 12:00:33'),
(256, 123, 8, '23', 'OK', '2024-03-09 12:00:35'),
(257, 124, 1, '1', 'OK', '2024-03-09 12:04:05'),
(258, 124, 7, '19', 'OK', '2024-03-09 12:04:06'),
(259, 124, 8, '23', 'OK', '2024-03-09 12:04:08'),
(260, 124, 10, '30', 'OK', '2024-03-09 12:04:09'),
(261, 124, 5, '15', 'OK', '2024-03-09 12:04:11'),
(262, 124, 9, '31', 'OK', '2024-03-09 12:04:12'),
(263, 124, 6, '17', 'OK', '2024-03-09 12:04:14'),
(264, 124, 3, '8', 'OK', '2024-03-09 12:04:15'),
(265, 124, 2, '4', 'OK', '2024-03-09 12:04:16'),
(266, 124, 4, '11', 'OK', '2024-03-09 12:04:18'),
(267, 125, 1, '1', 'OK', '2024-03-09 12:07:32'),
(268, 125, 3, '8', 'OK', '2024-03-09 12:07:34'),
(269, 125, 7, '21', 'ERROR', '2024-03-09 12:07:35'),
(270, 125, 5, '13', 'ERROR', '2024-03-09 12:07:37'),
(271, 125, 9, '31', 'OK', '2024-03-09 12:07:38'),
(272, 125, 6, '17', 'OK', '2024-03-09 12:07:39'),
(273, 125, 4, '11', 'OK', '2024-03-09 12:07:41'),
(274, 125, 8, '23', 'OK', '2024-03-09 12:07:42'),
(275, 125, 10, '30', 'OK', '2024-03-09 12:07:43'),
(276, 125, 2, '4', 'OK', '2024-03-09 12:07:45'),
(277, 126, 7, '21', 'ERROR', '2024-03-09 12:08:31'),
(278, 126, 4, '11', 'OK', '2024-03-09 12:08:33'),
(279, 126, 2, '5', 'ERROR', '2024-03-09 12:08:34'),
(280, 126, 10, '30', 'OK', '2024-03-09 12:08:35'),
(281, 126, 1, '2', 'ERROR', '2024-03-09 12:08:37'),
(282, 126, 3, '9', 'ERROR', '2024-03-09 12:08:38'),
(283, 126, 8, '23', 'OK', '2024-03-09 12:08:40'),
(284, 126, 9, '31', 'OK', '2024-03-09 12:08:41'),
(285, 126, 6, '17', 'OK', '2024-03-09 12:08:43'),
(286, 126, 5, '15', 'OK', '2024-03-09 12:08:44'),
(287, 127, 6, '17', 'OK', '2024-03-09 12:18:22'),
(288, 127, 10, '29', 'ERROR', '2024-03-09 12:18:23'),
(289, 127, 2, '5', 'ERROR', '2024-03-09 12:18:25'),
(290, 127, 9, '31', 'OK', '2024-03-09 12:18:27'),
(291, 127, 1, '1', 'OK', '2024-03-09 12:18:28'),
(292, 127, 7, '21', 'ERROR', '2024-03-09 12:18:30'),
(293, 127, 4, '11', 'OK', '2024-03-09 12:18:32'),
(294, 127, 5, '15', 'OK', '2024-03-09 12:18:33'),
(295, 127, 8, '23', 'OK', '2024-03-09 12:18:35'),
(296, 127, 3, '8', 'OK', '2024-03-09 12:18:36'),
(297, 128, 7, '20', 'ERROR', '2024-03-09 12:20:06'),
(298, 128, 4, '11', 'OK', '2024-03-09 12:20:07'),
(299, 128, 1, '1', 'OK', '2024-03-09 12:20:09'),
(300, 128, 6, '16', 'ERROR', '2024-03-09 12:20:10'),
(301, 128, 9, '31', 'OK', '2024-03-09 12:20:11'),
(302, 128, 8, '23', 'OK', '2024-03-09 12:20:13'),
(303, 128, 2, '4', 'OK', '2024-03-09 12:20:14'),
(304, 128, 10, '30', 'OK', '2024-03-09 12:20:15'),
(305, 128, 3, '8', 'OK', '2024-03-09 12:20:16'),
(306, 128, 5, '14', 'ERROR', '2024-03-09 12:20:17'),
(307, 130, 9, '31', 'OK', '2024-03-10 16:34:34'),
(308, 130, 3, '8', 'OK', '2024-03-10 16:35:15'),
(309, 130, 8, '23', 'OK', '2024-03-10 16:35:40'),
(310, 130, 6, '17', 'OK', '2024-03-10 16:35:42'),
(311, 130, 1, '1', 'OK', '2024-03-10 16:35:45'),
(312, 130, 4, '11', 'OK', '2024-03-10 16:35:47'),
(313, 130, 7, '19', 'OK', '2024-03-10 16:35:50'),
(314, 130, 5, '15', 'OK', '2024-03-10 16:35:52'),
(315, 130, 10, '30', 'OK', '2024-03-10 16:35:58'),
(316, 130, 2, '4', 'OK', '2024-03-10 16:36:00'),
(317, 131, 7, '19', 'OK', '2024-03-10 16:39:38'),
(318, 139, 5, '15', 'OK', '2024-03-10 16:57:15'),
(319, 139, 1, '1', 'OK', '2024-03-10 16:57:18'),
(320, 139, 10, '30', 'OK', '2024-03-10 16:57:21'),
(321, 139, 8, '23', 'OK', '2024-03-10 16:57:30'),
(322, 139, 2, '4', 'OK', '2024-03-10 16:57:32'),
(323, 139, 7, '19', 'OK', '2024-03-10 16:57:34'),
(324, 139, 4, '11', 'OK', '2024-03-10 16:57:36'),
(325, 139, 6, '17', 'OK', '2024-03-10 16:57:38'),
(326, 139, 9, '31', 'OK', '2024-03-10 16:57:40'),
(327, 139, 3, '8', 'OK', '2024-03-10 16:57:41'),
(328, 140, 8, '23', 'OK', '2024-03-10 17:03:17'),
(329, 142, 7, '19', 'OK', '2024-03-10 17:16:42'),
(330, 142, 3, '8', 'OK', '2024-03-10 17:16:45'),
(331, 142, 2, '6', 'ERROR', '2024-03-10 17:16:47'),
(332, 142, 1, '1', 'OK', '2024-03-10 17:16:49'),
(333, 142, 10, '30', 'OK', '2024-03-10 17:16:53'),
(334, 142, 5, '15', 'OK', '2024-03-10 17:16:55'),
(335, 142, 8, '23', 'OK', '2024-03-10 17:16:57'),
(336, 142, 4, '11', 'OK', '2024-03-10 17:16:59'),
(337, 142, 6, '17', 'OK', '2024-03-10 17:17:01'),
(338, 142, 9, '31', 'OK', '2024-03-10 17:17:02');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(10) UNSIGNED NOT NULL,
  `nombres` varchar(80) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `correo` varchar(120) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `nombres`, `correo`, `password`) VALUES
(1, 'Oscar Andres Loaiza Pabon', 'andres@gmail.com', '827ccb0eea8a706c4c34a16891f84e7b');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cuestionarios`
--
ALTER TABLE `cuestionarios`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `opciones`
--
ALTER TABLE `opciones`
  ADD PRIMARY KEY (`id`),
  ADD KEY `pregunta` (`id_pregunta`);

--
-- Indices de la tabla `preguntas`
--
ALTER TABLE `preguntas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `respuestas`
--
ALTER TABLE `respuestas`
  ADD PRIMARY KEY (`id_respuesta`),
  ADD KEY `pregunta` (`id_pregunta`),
  ADD KEY `id_cuestionarios` (`id_cuestionario`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`),
  ADD UNIQUE KEY `correo` (`correo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cuestionarios`
--
ALTER TABLE `cuestionarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=143;

--
-- AUTO_INCREMENT de la tabla `opciones`
--
ALTER TABLE `opciones`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `preguntas`
--
ALTER TABLE `preguntas`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `respuestas`
--
ALTER TABLE `respuestas`
  MODIFY `id_respuesta` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=339;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cuestionarios`
--
ALTER TABLE `cuestionarios`
  ADD CONSTRAINT `cuestionarios_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `opciones`
--
ALTER TABLE `opciones`
  ADD CONSTRAINT `opciones_ibfk_1` FOREIGN KEY (`id_pregunta`) REFERENCES `preguntas` (`id`);

--
-- Filtros para la tabla `respuestas`
--
ALTER TABLE `respuestas`
  ADD CONSTRAINT `respuestas_ibfk_3` FOREIGN KEY (`id_cuestionario`) REFERENCES `cuestionarios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `respuestas_ibfk_4` FOREIGN KEY (`id_pregunta`) REFERENCES `preguntas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
