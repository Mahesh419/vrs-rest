-- MySQL dump 10.13  Distrib 5.7.28, for Linux (x86_64)
--
-- Host: localhost    Database: westminister_vehicle_management_db
-- ------------------------------------------------------
-- Server version	5.7.28-0ubuntu0.18.04.4

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
-- Table structure for table `schedule`
--

DROP TABLE IF EXISTS `schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `schedule` (
  `scheduleId` bigint(20) NOT NULL AUTO_INCREMENT,
  `pickUpDate` date NOT NULL,
  `dropOffDate` date NOT NULL,
  `vehicleId` bigint(20) NOT NULL,
  PRIMARY KEY (`scheduleId`),
  KEY `fk_schedule_idx` (`vehicleId`),
  CONSTRAINT `fk_schedule` FOREIGN KEY (`vehicleId`) REFERENCES `vehicle` (`vehicleId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schedule`
--

LOCK TABLES `schedule` WRITE;
/*!40000 ALTER TABLE `schedule` DISABLE KEYS */;
INSERT INTO `schedule` VALUES (3,'2019-12-23','2019-12-25',23534653);
/*!40000 ALTER TABLE `schedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehicle` (
  `vehicleId` bigint(20) NOT NULL AUTO_INCREMENT,
  `plateNo` varchar(45) NOT NULL,
  `make` varchar(50) NOT NULL,
  `driver` varchar(60) NOT NULL,
  `contactNo` varchar(10) NOT NULL,
  `rentPerDay` decimal(10,0) NOT NULL,
  `seatCount` int(11) DEFAULT NULL,
  `airConditioning` tinyint(4) DEFAULT NULL,
  `start` varchar(20) DEFAULT NULL,
  `diskbreak` tinyint(4) DEFAULT NULL,
  `type` varchar(45) NOT NULL,
  PRIMARY KEY (`vehicleId`)
) ENGINE=InnoDB AUTO_INCREMENT=23534654 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle`
--

LOCK TABLES `vehicle` WRITE;
/*!40000 ALTER TABLE `vehicle` DISABLE KEYS */;
INSERT INTO `vehicle` VALUES (2342342,'ASD-1233','Toyota','wrtrtre','43534534',400,NULL,NULL,'Electric',1,'MotorBike'),(23534646,'ASD-1234','Honda','sfsdf','1234567890',400,NULL,NULL,'Kick',0,'MotorBike'),(23534649,'ASD-1234','Honda','sfsdf','1234567890',400,4,1,NULL,NULL,'Car'),(23534652,'AWS-1234','Awert','ghgfhfg','46456546',200,NULL,NULL,NULL,NULL,'Vehicle'),(23534653,'AWS-1234','Awert','ghgfhfg','46456546',200,2,1,NULL,NULL,'Car');
/*!40000 ALTER TABLE `vehicle` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-01 22:54:21
