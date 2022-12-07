-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: hms
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bill` (
  `Bill_id` varchar(45) NOT NULL,
  `Bpayment_typ` varchar(45) DEFAULT NULL,
  `Bstatus` varchar(45) DEFAULT NULL,
  `Btotal` varchar(45) DEFAULT NULL,
  `Btax` varchar(45) DEFAULT NULL,
  `Bexpect_pay_date` varchar(45) DEFAULT NULL,
  `Breception_num` varchar(45) DEFAULT NULL,
  `Bg_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Bill_id`),
  KEY `Recrption_num_idx` (`Breception_num`),
  KEY `G_id_idx` (`Bg_id`),
  CONSTRAINT `FK_Bg_id` FOREIGN KEY (`Bg_id`) REFERENCES `guset` (`Gid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_Brecrption_num` FOREIGN KEY (`Breception_num`) REFERENCES `reception` (`Reception_num`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES ('1222','Credit','Not Paid','1000','100','2022-11-04','777','221125'),('13576','Credit','Paid','500','1350','2022-12-11','898','1114567876');
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking` (
  `Booking_num` varchar(45) NOT NULL,
  `Bnum_of_adult` varchar(45) DEFAULT NULL,
  `Bbill_id` varchar(45) DEFAULT NULL,
  `Breception_num` varchar(45) DEFAULT NULL,
  `Bg_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Booking_num`),
  KEY `Bill_id_idx` (`Bbill_id`),
  KEY `Recrption_num_idx` (`Breception_num`),
  KEY `Gid_idx` (`Bg_id`),
  CONSTRAINT `FK_Bbill_id` FOREIGN KEY (`Bbill_id`) REFERENCES `bill` (`Bill_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_BGid` FOREIGN KEY (`Bg_id`) REFERENCES `guset` (`Gid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_BrecrptionNum` FOREIGN KEY (`Breception_num`) REFERENCES `reception` (`Reception_num`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `Eid` varchar(45) NOT NULL,
  `Efname` varchar(45) DEFAULT NULL,
  `Elname` varchar(45) DEFAULT NULL,
  `Esalary` varchar(45) DEFAULT NULL,
  `Eaddress` varchar(45) DEFAULT NULL,
  `Ephone_num` varchar(45) DEFAULT NULL,
  `Erole` varchar(45) DEFAULT NULL,
  `Super_id` varchar(45) DEFAULT NULL,
  `Ereception_num` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Eid`),
  KEY `FK_SUPERID_idx` (`Super_id`),
  KEY `FK_Ereception_num_idx` (`Ereception_num`),
  CONSTRAINT `FK_Ereception_num` FOREIGN KEY (`Ereception_num`) REFERENCES `reception` (`Reception_num`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_SUPERID` FOREIGN KEY (`Super_id`) REFERENCES `employee` (`Eid`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES ('1118765435','LAMA','alzakr','7500','Riyadh','0542272679','Reception',NULL,'777'),('11923456','JUJU','alahmed','4','Riyadh','0553427394','Reception','1118765435','543');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `employee_view`
--

DROP TABLE IF EXISTS `employee_view`;
/*!50001 DROP VIEW IF EXISTS `employee_view`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `employee_view` AS SELECT 
 1 AS `Bill_id`,
 1 AS `Bpayment_typ`,
 1 AS `Bstatus`,
 1 AS `Btotal`,
 1 AS `Btax`,
 1 AS `Bexpect_pay_date`,
 1 AS `Booking_num`,
 1 AS `Bnum_of_adult`,
 1 AS `Gid`,
 1 AS `Gfname`,
 1 AS `Glname`,
 1 AS `Gphone_num`,
 1 AS `Gaddress`,
 1 AS `Gemail`,
 1 AS `gDate`,
 1 AS `Reception_num`,
 1 AS `Room_num`,
 1 AS `Rstatus`,
 1 AS `Rtype`,
 1 AS `BookingNum`,
 1 AS `Check_in`,
 1 AS `Check_out`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `guset`
--

DROP TABLE IF EXISTS `guset`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `guset` (
  `Gid` varchar(45) NOT NULL,
  `Gfname` varchar(45) NOT NULL,
  `Glname` varchar(45) NOT NULL,
  `Gphone_num` varchar(45) DEFAULT NULL,
  `Gaddress` varchar(45) DEFAULT NULL,
  `Gemail` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guset`
--

LOCK TABLES `guset` WRITE;
/*!40000 ALTER TABLE `guset` DISABLE KEYS */;
INSERT INTO `guset` VALUES ('1114567876','Rawan','Mohamed','055676767','Riyadh','Rawan@gmail.com'),('221125','Sara','Alahmad','0523456','Riyadh','Amall@gmail.com');
/*!40000 ALTER TABLE `guset` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guset_res`
--

DROP TABLE IF EXISTS `guset_res`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `guset_res` (
  `RecpNum` varchar(45) NOT NULL,
  `Gid` varchar(45) NOT NULL,
  `gDate` date NOT NULL,
  PRIMARY KEY (`RecpNum`,`Gid`,`gDate`),
  KEY `Gid_idx` (`Gid`) /*!80000 INVISIBLE */,
  CONSTRAINT `FK_GR_Gid` FOREIGN KEY (`Gid`) REFERENCES `guset` (`Gid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_GR_Rnum` FOREIGN KEY (`RecpNum`) REFERENCES `reception` (`Reception_num`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guset_res`
--

LOCK TABLES `guset_res` WRITE;
/*!40000 ALTER TABLE `guset_res` DISABLE KEYS */;
INSERT INTO `guset_res` VALUES ('898','1114567876','2002-01-03');
/*!40000 ALTER TABLE `guset_res` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `manager_view`
--

DROP TABLE IF EXISTS `manager_view`;
/*!50001 DROP VIEW IF EXISTS `manager_view`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `manager_view` AS SELECT 
 1 AS `Bill_id`,
 1 AS `Bpayment_typ`,
 1 AS `Bstatus`,
 1 AS `Btotal`,
 1 AS `Btax`,
 1 AS `Bexpect_pay_date`,
 1 AS `Booking_num`,
 1 AS `Bnum_of_adult`,
 1 AS `Eid`,
 1 AS `Efname`,
 1 AS `Elname`,
 1 AS `Esalary`,
 1 AS `Eaddress`,
 1 AS `Ephone_num`,
 1 AS `Erole`,
 1 AS `Super_id`,
 1 AS `Gid`,
 1 AS `Gfname`,
 1 AS `Glname`,
 1 AS `Gphone_num`,
 1 AS `Gaddress`,
 1 AS `Gemail`,
 1 AS `gDate`,
 1 AS `Reception_num`,
 1 AS `Room_num`,
 1 AS `Rstatus`,
 1 AS `Rtype`,
 1 AS `BookingNum`,
 1 AS `RoomNum`,
 1 AS `Check_in`,
 1 AS `Check_out`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `reception`
--

DROP TABLE IF EXISTS `reception`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reception` (
  `Reception_num` varchar(45) NOT NULL,
  PRIMARY KEY (`Reception_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reception`
--

LOCK TABLES `reception` WRITE;
/*!40000 ALTER TABLE `reception` DISABLE KEYS */;
INSERT INTO `reception` VALUES ('444'),('543'),('679'),('777'),('898');
/*!40000 ALTER TABLE `reception` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room` (
  `Room_num` varchar(45) NOT NULL,
  `Rstatus` varchar(45) DEFAULT 'Available',
  `Rtype` varchar(45) DEFAULT NULL,
  `Rg_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Room_num`),
  KEY `FK_g_id_idx` (`Rg_id`),
  CONSTRAINT `FK_g_id` FOREIGN KEY (`Rg_id`) REFERENCES `guset` (`Gid`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES ('1168','Available','Single',NULL),('1254','Not Available','Single','1114567876'),('3465','Available','Double',NULL),('4443','Available','Double',NULL),('5699','Not Available','Double','221125');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room_booking`
--

DROP TABLE IF EXISTS `room_booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room_booking` (
  `BookingNum` varchar(10) NOT NULL,
  `RoomNum` varchar(45) NOT NULL,
  `Check_in` date NOT NULL,
  `Check_out` date DEFAULT NULL,
  PRIMARY KEY (`BookingNum`,`RoomNum`),
  KEY `FK_room_num_idx` (`RoomNum`),
  CONSTRAINT `FK_bookingNum` FOREIGN KEY (`BookingNum`) REFERENCES `booking` (`Booking_num`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_room_num` FOREIGN KEY (`RoomNum`) REFERENCES `room` (`Room_num`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room_booking`
--

LOCK TABLES `room_booking` WRITE;
/*!40000 ALTER TABLE `room_booking` DISABLE KEYS */;
/*!40000 ALTER TABLE `room_booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `signup`
--

DROP TABLE IF EXISTS `signup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `signup` (
  `UserName` varchar(45) NOT NULL,
  `pass_` varchar(45) DEFAULT NULL,
  `Fullname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`UserName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signup`
--

LOCK TABLES `signup` WRITE;
/*!40000 ALTER TABLE `signup` DISABLE KEYS */;
INSERT INTO `signup` VALUES ('1111','abcd','rawan'),('2222','123456','JUJU');
/*!40000 ALTER TABLE `signup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `employee_view`
--

/*!50001 DROP VIEW IF EXISTS `employee_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `employee_view` AS select `bill`.`Bill_id` AS `Bill_id`,`bill`.`Bpayment_typ` AS `Bpayment_typ`,`bill`.`Bstatus` AS `Bstatus`,`bill`.`Btotal` AS `Btotal`,`bill`.`Btax` AS `Btax`,`bill`.`Bexpect_pay_date` AS `Bexpect_pay_date`,`booking`.`Booking_num` AS `Booking_num`,`booking`.`Bnum_of_adult` AS `Bnum_of_adult`,`guset`.`Gid` AS `Gid`,`guset`.`Gfname` AS `Gfname`,`guset`.`Glname` AS `Glname`,`guset`.`Gphone_num` AS `Gphone_num`,`guset`.`Gaddress` AS `Gaddress`,`guset`.`Gemail` AS `Gemail`,`guset_res`.`gDate` AS `gDate`,`reception`.`Reception_num` AS `Reception_num`,`room`.`Room_num` AS `Room_num`,`room`.`Rstatus` AS `Rstatus`,`room`.`Rtype` AS `Rtype`,`room_booking`.`BookingNum` AS `BookingNum`,`room_booking`.`Check_in` AS `Check_in`,`room_booking`.`Check_out` AS `Check_out` from ((((((`bill` left join `booking` on(((`bill`.`Breception_num` = `booking`.`Breception_num`) and (`bill`.`Bg_id` = `booking`.`Bg_id`)))) left join `guset` on((`guset`.`Gid` = `bill`.`Bg_id`))) left join `guset_res` on((`guset`.`Gid` = `guset_res`.`Gid`))) left join `reception` on((`reception`.`Reception_num` = `guset_res`.`RecpNum`))) left join `room` on((`room`.`Rg_id` = `guset`.`Gid`))) left join `room_booking` on((`room_booking`.`RoomNum` = `room`.`Room_num`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `manager_view`
--

/*!50001 DROP VIEW IF EXISTS `manager_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `manager_view` AS select distinct `bill`.`Bill_id` AS `Bill_id`,`bill`.`Bpayment_typ` AS `Bpayment_typ`,`bill`.`Bstatus` AS `Bstatus`,`bill`.`Btotal` AS `Btotal`,`bill`.`Btax` AS `Btax`,`bill`.`Bexpect_pay_date` AS `Bexpect_pay_date`,`booking`.`Booking_num` AS `Booking_num`,`booking`.`Bnum_of_adult` AS `Bnum_of_adult`,`employee`.`Eid` AS `Eid`,`employee`.`Efname` AS `Efname`,`employee`.`Elname` AS `Elname`,`employee`.`Esalary` AS `Esalary`,`employee`.`Eaddress` AS `Eaddress`,`employee`.`Ephone_num` AS `Ephone_num`,`employee`.`Erole` AS `Erole`,`employee`.`Super_id` AS `Super_id`,`guset`.`Gid` AS `Gid`,`guset`.`Gfname` AS `Gfname`,`guset`.`Glname` AS `Glname`,`guset`.`Gphone_num` AS `Gphone_num`,`guset`.`Gaddress` AS `Gaddress`,`guset`.`Gemail` AS `Gemail`,`guset_res`.`gDate` AS `gDate`,`reception`.`Reception_num` AS `Reception_num`,`room`.`Room_num` AS `Room_num`,`room`.`Rstatus` AS `Rstatus`,`room`.`Rtype` AS `Rtype`,`room_booking`.`BookingNum` AS `BookingNum`,`room_booking`.`RoomNum` AS `RoomNum`,`room_booking`.`Check_in` AS `Check_in`,`room_booking`.`Check_out` AS `Check_out` from (((((((`bill` left join `booking` on(((`bill`.`Breception_num` = `booking`.`Breception_num`) and (`bill`.`Bg_id` = `booking`.`Bg_id`)))) left join `employee` on((`bill`.`Breception_num` = `employee`.`Ereception_num`))) left join `guset` on((`guset`.`Gid` = `bill`.`Bg_id`))) left join `guset_res` on((`guset`.`Gid` = `guset_res`.`Gid`))) left join `reception` on((`reception`.`Reception_num` = `guset_res`.`RecpNum`))) left join `room` on((`room`.`Rg_id` = `guset`.`Gid`))) left join `room_booking` on((`room_booking`.`RoomNum` = `room`.`Room_num`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-07 15:41:50
