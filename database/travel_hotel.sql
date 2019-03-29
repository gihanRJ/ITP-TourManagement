CREATE DATABASE  IF NOT EXISTS `travel` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `travel`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: travel
-- ------------------------------------------------------
-- Server version	5.5.41-log

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
-- Table structure for table `hotel`
--

DROP TABLE IF EXISTS `hotel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hotel` (
  `hid` int(11) NOT NULL AUTO_INCREMENT,
  `hotel_name` varchar(45) NOT NULL,
  `hotel_city` varchar(45) NOT NULL,
  `hotel_address` text NOT NULL,
  `car` varchar(45) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `description` text,
  `contact_no` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`hid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hotel`
--

LOCK TABLES `hotel` WRITE;
/*!40000 ALTER TABLE `hotel` DISABLE KEYS */;
INSERT INTO `hotel` VALUES (1,'Howard Plaza','Agra','agra mid','scarpio',0,'A modern 3 star hotel, located in the tourist belt of Agra, just a short distance from the Taj Mahal, the Howard Plaza has modern air-conditioned rooms with ensuite facilities. All rooms are equipped with Televisions and mini bars. Leisure facilities here include an outdoor swimming pool, and a small spa. ','+918878982889'),(2,'Radisson','Agra','Radisson','pajero',0,'Located just 1 kilometer from the Taj Mahal, the Radisson, is a new 4 star + hotel, having 140 guest rooms featuring separate shower cubicles, direct control air conditioning, in room safe and in room movies and DVD players on request. On site leisure facilities include an outdoor pool, a children\'s pool, and a spa tub, health club, sauna, steam room, and a fitness facility. ','+918878982889'),(3,'Tiger Den','Bandhavgarh','Bandhavgarh','pajero',0,'Located just a short distance away from the Tala gate (said to be the best area for Tiger sightings) of the Bandhavgarh National Park, the Tiger Den is a comfortable jungle lodge. Accommodation is in well furnished cottages style accommodation set amidst well manicured gardens. Tiger Den, Bandhavgarh boasts of having some of the best naturalists in the area, and hence, provides excellent National Park experiences. A recently added swimming pool is a great place to relax in between the morning and afternoon Game rides. ','+918878982889'),(4,'Bandhavgarh Jungle Lodge','Bandhavgarh','Bandhavgarh','pajero',0,'Located just a short walk away from the Tala gate of the Bandhavgarh National Park, the Bandhavgarh Jungle lodge is amongst the oldest established lodges in this area. The lodge is developed along the theme of an Indian village, with comfortable cottages set around an inner courtyard. ','+918878982889'),(5,'Bandhav Vilas','Bandhavgarh','Bandhavgarh','pajero',0,'Part of the Starwood Luxury Collection, the ITC Mughal is one of the finest hotels in Agra. Set in 35 acres of beautifully landscaped gardens, not too far away from the Taj Mahal, the ITC Mughal has won several awards for it’s unique architecture. Rooms at the ITC Mughal have state-of-the-art amenities and facilities.  Leisure facilities include a full equipped gym, a very large and modern Spa spread over almost 100,000 sq feet, as well as an outdoor pool etc. The ITC Mughal is also home to Agra’s finest Indian restaurants, the Peshawari.','+918878982889'),(6,'Mahua Kothi','Bandhavgarh','Bandhavgarh','pajero',0,'A joint venture of Africa’s famous &Beyond Lodges and India’s Taj Group of hotels, the Mahua Kothi offers luxury accommodation just outside the Bandhavgarh National Park. Accommodation at the Mahua Kothi is in Kutiyas (jungle village huts), built in a 40 acre estate. Those familiar with &Beyond Africa’s standards when it comes to luxury game lodges , would no doubt know, that this is where they would get the best accommodation, top class services, gourmet cuisine and the best naturalists. The Mahua Kothi provides safaris in custom built vehicles with 3 rows of comfortable step up seating, ensuring it’s guests that the best views of the Bandhavgarh National Park.','+918878982889'),(7,'sayanji','indore','indore','yes',0,'kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk','+918878982889'),(8,'fartune','indore','indore','yes',0,'ggjjlkhhlhlhdlfbhldfghdoh',NULL),(9,'landmark','kanpur','kanpur','yes',0,'fkhghdlglkhhgg','8888888888888'),(10,'rajbhog','indore','indore','yes',0,'sakklfghjklsnblsdfnbljknbbbbbbbbbbbbbbbbbbl','8888888899999');
/*!40000 ALTER TABLE `hotel` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-03-28 15:07:52
