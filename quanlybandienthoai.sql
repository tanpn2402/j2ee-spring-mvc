-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: quanlybandienthoai
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.30-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cung_cap`
--

DROP TABLE IF EXISTS `cung_cap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cung_cap` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dt_id` int(11) DEFAULT NULL,
  `nha_cc_id` int(11) DEFAULT NULL,
  `so_luong` int(11) DEFAULT NULL,
  `hd_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cung_cap`
--

LOCK TABLES `cung_cap` WRITE;
/*!40000 ALTER TABLE `cung_cap` DISABLE KEYS */;
INSERT INTO `cung_cap` VALUES (1,1,1,20,1);
/*!40000 ALTER TABLE `cung_cap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dien_thoai`
--

DROP TABLE IF EXISTS `dien_thoai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dien_thoai` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ten` varchar(45) DEFAULT NULL,
  `so_luong` int(11) DEFAULT NULL,
  `gia_nhap` varchar(45) DEFAULT NULL,
  `gia_ban` varchar(45) DEFAULT NULL,
  `bh` int(11) DEFAULT NULL,
  `hdh_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_dien_thoai_1_idx` (`hdh_id`),
  CONSTRAINT `fk_dien_thoai_1` FOREIGN KEY (`hdh_id`) REFERENCES `he_dieu_hanh` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dien_thoai`
--

LOCK TABLES `dien_thoai` WRITE;
/*!40000 ALTER TABLE `dien_thoai` DISABLE KEYS */;
INSERT INTO `dien_thoai` VALUES (1,'iPhone X',100,'22000000','25000000',5,1);
/*!40000 ALTER TABLE `dien_thoai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `he_dieu_hanh`
--

DROP TABLE IF EXISTS `he_dieu_hanh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `he_dieu_hanh` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ten` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `he_dieu_hanh`
--

LOCK TABLES `he_dieu_hanh` WRITE;
/*!40000 ALTER TABLE `he_dieu_hanh` DISABLE KEYS */;
INSERT INTO `he_dieu_hanh` VALUES (1,'iOS'),(2,'Android'),(3,'BlackBerry'),(4,'WindowsPhone');
/*!40000 ALTER TABLE `he_dieu_hanh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoa_don`
--

DROP TABLE IF EXISTS `hoa_don`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hoa_don` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ngay_lap` varchar(45) DEFAULT NULL,
  `nv_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoa_don`
--

LOCK TABLES `hoa_don` WRITE;
/*!40000 ALTER TABLE `hoa_don` DISABLE KEYS */;
INSERT INTO `hoa_don` VALUES (1,'20/12/2017',1);
/*!40000 ALTER TABLE `hoa_don` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khach`
--

DROP TABLE IF EXISTS `khach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `khach` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kh_nguoi_id` int(11) DEFAULT NULL,
  `nghe_nghiep` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_kh_1_idx` (`kh_nguoi_id`),
  CONSTRAINT `fk_kh_1` FOREIGN KEY (`kh_nguoi_id`) REFERENCES `nguoi` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khach`
--

LOCK TABLES `khach` WRITE;
/*!40000 ALTER TABLE `khach` DISABLE KEYS */;
INSERT INTO `khach` VALUES (1,1,'example');
/*!40000 ALTER TABLE `khach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mua`
--

DROP TABLE IF EXISTS `mua`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mua` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dt_id` int(11) DEFAULT NULL,
  `kh_id` int(11) DEFAULT NULL,
  `so_luong` int(11) DEFAULT NULL,
  `hd_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mua`
--

LOCK TABLES `mua` WRITE;
/*!40000 ALTER TABLE `mua` DISABLE KEYS */;
/*!40000 ALTER TABLE `mua` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nguoi`
--

DROP TABLE IF EXISTS `nguoi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nguoi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ten` varchar(45) DEFAULT NULL,
  `gioi_tinh` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `nam_sinh` varchar(45) DEFAULT NULL,
  `nguoi_type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nguoi`
--

LOCK TABLES `nguoi` WRITE;
/*!40000 ALTER TABLE `nguoi` DISABLE KEYS */;
INSERT INTO `nguoi` VALUES (1,'khach hang 1','Nam','example@example.com','1990','KH'),(2,'nhan vien 1','Nam','example@example.com','1990','NV');
/*!40000 ALTER TABLE `nguoi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nguoi_sdt`
--

DROP TABLE IF EXISTS `nguoi_sdt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nguoi_sdt` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nguoi_id` int(11) DEFAULT NULL,
  `sdt` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_sdt_1_idx` (`nguoi_id`),
  CONSTRAINT `fk_sdt_1` FOREIGN KEY (`nguoi_id`) REFERENCES `nguoi` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nguoi_sdt`
--

LOCK TABLES `nguoi_sdt` WRITE;
/*!40000 ALTER TABLE `nguoi_sdt` DISABLE KEYS */;
INSERT INTO `nguoi_sdt` VALUES (1,1,'09123456789'),(2,2,'09123456789');
/*!40000 ALTER TABLE `nguoi_sdt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nha_cc`
--

DROP TABLE IF EXISTS `nha_cc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nha_cc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ten` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nha_cc`
--

LOCK TABLES `nha_cc` WRITE;
/*!40000 ALTER TABLE `nha_cc` DISABLE KEYS */;
INSERT INTO `nha_cc` VALUES (1,'TGDD');
/*!40000 ALTER TABLE `nha_cc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nha_cc_dia_chi`
--

DROP TABLE IF EXISTS `nha_cc_dia_chi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nha_cc_dia_chi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nha_cc_id` int(11) DEFAULT NULL,
  `dia_chi` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_cc_dc_1_idx` (`nha_cc_id`),
  CONSTRAINT `fk_cc_dc_1` FOREIGN KEY (`nha_cc_id`) REFERENCES `nha_cc` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nha_cc_dia_chi`
--

LOCK TABLES `nha_cc_dia_chi` WRITE;
/*!40000 ALTER TABLE `nha_cc_dia_chi` DISABLE KEYS */;
INSERT INTO `nha_cc_dia_chi` VALUES (1,1,'HÃ  Ná»?i');
/*!40000 ALTER TABLE `nha_cc_dia_chi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nha_cc_sdt`
--

DROP TABLE IF EXISTS `nha_cc_sdt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nha_cc_sdt` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nha_cc_id` int(11) DEFAULT NULL,
  `sdt` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_cc_sdt_1_idx` (`nha_cc_id`),
  CONSTRAINT `fk_cc_sdt_1` FOREIGN KEY (`nha_cc_id`) REFERENCES `nha_cc` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nha_cc_sdt`
--

LOCK TABLES `nha_cc_sdt` WRITE;
/*!40000 ALTER TABLE `nha_cc_sdt` DISABLE KEYS */;
INSERT INTO `nha_cc_sdt` VALUES (1,1,'01234567890');
/*!40000 ALTER TABLE `nha_cc_sdt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhan_vien`
--

DROP TABLE IF EXISTS `nhan_vien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nhan_vien` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nv_nguoi_id` int(11) DEFAULT NULL,
  `luong` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_nv_1_idx` (`nv_nguoi_id`),
  CONSTRAINT `fk_nv_1` FOREIGN KEY (`nv_nguoi_id`) REFERENCES `nguoi` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhan_vien`
--

LOCK TABLES `nhan_vien` WRITE;
/*!40000 ALTER TABLE `nhan_vien` DISABLE KEYS */;
INSERT INTO `nhan_vien` VALUES (1,2,7000000);
/*!40000 ALTER TABLE `nhan_vien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `san_pham_bao_hanh`
--

DROP TABLE IF EXISTS `san_pham_bao_hanh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `san_pham_bao_hanh` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ten_sp` varchar(45) DEFAULT NULL,
  `ngay_nhan` varchar(45) DEFAULT NULL,
  `ngay_tra` varchar(45) DEFAULT NULL,
  `noi_dung` varchar(45) DEFAULT NULL,
  `phi` int(11) DEFAULT NULL,
  `kh_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `san_pham_bao_hanh`
--

LOCK TABLES `san_pham_bao_hanh` WRITE;
/*!40000 ALTER TABLE `san_pham_bao_hanh` DISABLE KEYS */;
/*!40000 ALTER TABLE `san_pham_bao_hanh` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-27 12:42:13
