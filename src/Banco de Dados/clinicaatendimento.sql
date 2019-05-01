-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 01-Maio-2019 às 03:56
-- Versão do servidor: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `clinicaatendimento`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `agendarconsulta`
--

CREATE TABLE IF NOT EXISTS `agendarconsulta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `medico` varchar(45) DEFAULT NULL,
  `horario` varchar(10) DEFAULT NULL,
  `data` varchar(10) DEFAULT NULL,
  `convenio` varchar(30) DEFAULT NULL,
  `valor` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=8 ;

--
-- Extraindo dados da tabela `agendarconsulta`
--

INSERT INTO `agendarconsulta` (`id`, `nome`, `medico`, `horario`, `data`, `convenio`, `valor`) VALUES
(1, 'José Eduardo', 'João Almeida', '15:30', '24/01/2019', 'Mais Vidas', 150),
(2, 'Luiz Gustavo Arthur Sales', 'João Almeida', '16:00', '20/02/2019', 'Unimed', 150),
(3, 'José Samuel Caleb Carvalho', 'João Almeida', '16:15', '20/02/2019', 'Mais Vidas', 170),
(4, 'Márcio Cauê Baptista', 'João Almeida', '16:30', '20/02/2019', 'Saúde Extra', 160),
(5, 'Emanuel Ruan Figueiredo', 'João Almeida', '16:45', '20/02/2019', 'Saúde Plena', 150),
(6, 'Samuel Guilherme das Neves', 'João Almeida', '17:00', '20/02/2019', 'Mais Saúde', 150),
(7, 'Augusto Hugo Galvão', 'João Almeida', '17:15', '20/02/2019', 'Vida Melhor', 160);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastro`
--

CREATE TABLE IF NOT EXISTS `cadastro` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(35) NOT NULL,
  `idade` int(11) NOT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `endereco` varchar(50) DEFAULT NULL,
  `estadocivil` varchar(15) DEFAULT NULL,
  `convenio` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela `cadastro`
--

INSERT INTO `cadastro` (`id`, `nome`, `idade`, `telefone`, `email`, `endereco`, `estadocivil`, `convenio`) VALUES
(1, 'Carlos Alberto Cardoso', 35, '(69) 99618-2885', 'carlos.18@hotmail.com', 'Rua Mário Andreazza nº18', 'Solteiro', 'Cuidar'),
(2, 'Kevin Drumond', 25, '(83) 98263-6108', 'kevinfabiodrumon@nipbr.com', 'Rua Joel Pereira Cavalcante', 'Casado', 'Cuidar bem'),
(3, 'Diogo da Cruz', 44, '(79) 98616-0713', 'diogodacruz_@hmhabitacoesmoder', 'Rua Cinquenta e Três', 'Solteiro', 'Unimed'),
(4, 'Diogo da Cruz', 44, '(83) 98263-6108', 'diogodacruz_@dernas.com.br', 'Rua Cinquenta e Três', 'Solteiro', 'Unimed'),
(5, 'Tomás Roberto Fogaça', 55, '(51) 98818-0307', 'tomas8@fpsgeodata.com.br', 'Travessa Pitágoras', 'Viúvo', 'Salvar');

-- --------------------------------------------------------

--
-- Estrutura da tabela `estoque`
--

CREATE TABLE IF NOT EXISTS `estoque` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(80) DEFAULT NULL,
  `modelo` varchar(20) DEFAULT NULL,
  `marca` varchar(50) DEFAULT NULL,
  `tipo` varchar(20) DEFAULT NULL,
  `fabricacao` varchar(11) DEFAULT NULL,
  `quantidade` int(11) NOT NULL,
  `vencimento` varchar(11) DEFAULT NULL,
  `disponibilizacao` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=11 ;

--
-- Extraindo dados da tabela `estoque`
--

INSERT INTO `estoque` (`id`, `nome`, `modelo`, `marca`, `tipo`, `fabricacao`, `quantidade`, `vencimento`, `disponibilizacao`) VALUES
(1, 'Nimesulida 500MG', 'Pilula', 'Medley', 'Original', '01/02/2019', 50, '01/02/2022', 'Liberado'),
(2, 'Ibuprofeno 600MG', 'Pilula', 'Medley', 'Original', '29/12/2018', 200, '29/12/2020', 'Liberado'),
(3, 'Acebrofilina 10mg/mL', 'Líquido', 'Germed Pharma', 'Original', '19/02/2019', 120, '19/02/2024', 'Receitado'),
(4, 'Accuvit', 'Cápsula', 'Aché', 'Original', '19/02/2019', 60, '19/02/2024', 'Liberado'),
(5, 'Rapifen 544mcg/mL', 'Ampola', 'Janssen-Cilag', 'Original', '19/02/2019', 10, '19/02/2025', 'Receitado'),
(6, 'Rivotril 0,5mg', 'Comprimido', 'Roche', 'Original', '10/01/2019', 20, '10/01/2025', 'Receitado'),
(7, 'Zap 2,5mg', 'Comprimido', 'Momenta Farma', 'Original', '19/02/2019', 20, '25/06/2023', 'Receitado'),
(8, 'Ocitocina 5UI/mL', 'Ampola', 'Blau', 'Original', '05/12/2018', 10, '05/12/2020', 'Receitado'),
(9, 'Gaballon', 'Comprimido', 'Zydus Nikkho', 'Original', '14/01/2019', 20, '25/06/2023', 'Receitado'),
(10, 'Kaprosol 30mg', 'Cápsula', 'Laboris', 'Original', '05/12/2018', 14, '19/02/2024', 'Receitado');

-- --------------------------------------------------------

--
-- Estrutura da tabela `exames`
--

CREATE TABLE IF NOT EXISTS `exames` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `sexo` varchar(20) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL,
  `endereco` varchar(60) DEFAULT NULL,
  `data` varchar(11) DEFAULT NULL,
  `entrega` varchar(11) DEFAULT NULL,
  `laboratorio` varchar(30) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `resultado` varchar(70) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `exames`
--

INSERT INTO `exames` (`id`, `nome`, `sexo`, `idade`, `endereco`, `data`, `entrega`, `laboratorio`, `telefone`, `resultado`) VALUES
(1, 'Carlos Santana', 'Masculino', 44, 'Rua da Floresta nº 55', '25/01/2019', '27/01/2019', 'Laboratório West Side', '51984909578', 'Infectado com virus Aidos');

-- --------------------------------------------------------

--
-- Estrutura da tabela `faturamento`
--

CREATE TABLE IF NOT EXISTS `faturamento` (
  `id` int(11) NOT NULL,
  `mes` varchar(10) DEFAULT NULL,
  `dia` varchar(11) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `totalmes` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `faturamento`
--

INSERT INTO `faturamento` (`id`, `mes`, `dia`, `total`, `totalmes`) VALUES
(1, 'Agosto', '01/08/2019', 550.75, NULL),
(2, 'Agosto', '02/08/2019', 975.84, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `nome` varchar(30) DEFAULT NULL,
  `senha` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
