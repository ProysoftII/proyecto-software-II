-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-05-2017 a las 22:44:10
-- Versión del servidor: 10.1.16-MariaDB
-- Versión de PHP: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `monitores`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materias`
--

CREATE TABLE `materias` (
  `mat_id` int(11) NOT NULL,
  `mat_nombre` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `materias`
--

INSERT INTO `materias` (`mat_id`, `mat_nombre`) VALUES
(1, 'Sistemas operativos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `oferta_monitor`
--

CREATE TABLE `oferta_monitor` (
  `pos_id` int(11) NOT NULL,
  `pos_fecha` varchar(10) DEFAULT NULL,
  `usu_id` int(11) NOT NULL,
  `mat_id` int(11) DEFAULT NULL,
  `mat_nombre` varchar(50) NOT NULL,
  `usu_cedula` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `oferta_monitor`
--

INSERT INTO `oferta_monitor` (`pos_id`, `pos_fecha`, `usu_id`, `mat_id`, `mat_nombre`, `usu_cedula`) VALUES
(1, '04/04/2017', 2, NULL, 'Sistemas operativos', '30000'),
(2, NULL, 1, 1, 'Calculo Integral', '1114'),
(3, NULL, 1, 1, 'Calculo Integral', '1114'),
(4, NULL, 1, 1, 'Sistemas Operativos', '789'),
(5, NULL, 1, 1, 'Sistemas Operativos', '103164'),
(6, NULL, 1, 1, 'Sistemas Operativos', '103164'),
(7, NULL, 1, 1, 'Calculo Integral', '103164'),
(8, NULL, 1, 1, 'Calculo Integral', '1111'),
(9, NULL, 1, 1, 'Calculo Diferencial', '1111'),
(10, NULL, 1, 1, 'Calculo Integral', '1111'),
(11, NULL, 1, 1, 'Calculo Integral', '1111');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_usuario`
--

CREATE TABLE `tipo_usuario` (
  `tip_id` int(11) NOT NULL,
  `tip_rol` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `usu_id` int(11) NOT NULL,
  `usu_usuario` varchar(30) NOT NULL,
  `usu_clave` varchar(30) NOT NULL,
  `usu_cedula` varchar(15) NOT NULL,
  `usu_nombre` varchar(30) NOT NULL,
  `usu_apellido` varchar(20) NOT NULL,
  `usu_materias` varchar(50) DEFAULT NULL,
  `usu_programa` varchar(50) NOT NULL,
  `usu_tipo` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`usu_id`, `usu_usuario`, `usu_clave`, `usu_cedula`, `usu_nombre`, `usu_apellido`, `usu_materias`, `usu_programa`, `usu_tipo`) VALUES
(1, 'pepe', '1111', '789', 'PEpe', 'RE', 'null', 'null', 'estudiante'),
(2, 'jairo01', '1234', '30000', 'Jairo', 'Velez', 'Estructuras de datos I, Estructuras de datos II', 'null', 'profesor'),
(3, 'alex01', '1000', '103164', 'Alex', 'PeÃ±a', 'null', 'Ingenieria de sistemas', 'coordinador'),
(4, 'paco01', '1789', '1114', 'paco', 'perez', 'null', 'null', 'estudiante'),
(5, 'hugo01', '4568', '7854', 'Hugo', 'Lopez', 'null', 'null', 'unidad'),
(6, 'paco02', '1222', '2222', 'pacuito', 'rocha', 'null', 'null', 'estudiante'),
(7, 'jairo02', '3333', '0001', 'Jairo2', 'Velez', 'Proyecto de desarrollo', 'null', 'profesor');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `materias`
--
ALTER TABLE `materias`
  ADD PRIMARY KEY (`mat_id`);

--
-- Indices de la tabla `oferta_monitor`
--
ALTER TABLE `oferta_monitor`
  ADD PRIMARY KEY (`pos_id`),
  ADD KEY `fk_postulacion_monitor_usuarios1_idx` (`usu_id`),
  ADD KEY `fk_postulacion_monitor_materias1_idx` (`mat_id`);

--
-- Indices de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  ADD PRIMARY KEY (`tip_id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`usu_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `materias`
--
ALTER TABLE `materias`
  MODIFY `mat_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `oferta_monitor`
--
ALTER TABLE `oferta_monitor`
  MODIFY `pos_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  MODIFY `tip_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `usu_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `oferta_monitor`
--
ALTER TABLE `oferta_monitor`
  ADD CONSTRAINT `fk_postulacion_monitor_materias1` FOREIGN KEY (`mat_id`) REFERENCES `materias` (`mat_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_postulacion_monitor_usuarios1` FOREIGN KEY (`usu_id`) REFERENCES `usuarios` (`usu_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
