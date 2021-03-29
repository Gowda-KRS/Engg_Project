/*
SQLyog - Free MySQL GUI v5.19
Host - 5.0.15-nt : Database - data_hiding
*********************************************************************
Server version : 5.0.15-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `data_hiding`;

USE `data_hiding`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `m_admin` */

DROP TABLE IF EXISTS `m_admin`;

CREATE TABLE `m_admin` (
  `id` int(5) NOT NULL auto_increment,
  `name` varchar(50) default NULL,
  `password` varchar(50) default NULL,
  `adminid` varchar(20) NOT NULL,
  `address` varchar(50) default NULL,
  `phone` varchar(15) default NULL,
  `email` varchar(50) default NULL,
  PRIMARY KEY  (`id`,`adminid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_admin` */

insert into `m_admin` (`id`,`name`,`password`,`adminid`,`address`,`phone`,`email`) values (1,'Munna Kumar Singh','admin','admin','Bangalore','9916876540','kumar.cvs@gmail.com');

/*Table structure for table `m_group` */

DROP TABLE IF EXISTS `m_group`;

CREATE TABLE `m_group` (
  `id` int(5) NOT NULL auto_increment,
  `grp_uid` varchar(50) default NULL,
  `grp_in` varchar(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_group` */

insert into `m_group` (`id`,`grp_uid`,`grp_in`) values (7,'nitin','sachin');
insert into `m_group` (`id`,`grp_uid`,`grp_in`) values (8,'sachin','nitin');
insert into `m_group` (`id`,`grp_uid`,`grp_in`) values (13,'sachin','kumar');
insert into `m_group` (`id`,`grp_uid`,`grp_in`) values (14,'kumar','sachin');
insert into `m_group` (`id`,`grp_uid`,`grp_in`) values (17,'kumar','srinivas');
insert into `m_group` (`id`,`grp_uid`,`grp_in`) values (18,'srinivas','kumar');
insert into `m_group` (`id`,`grp_uid`,`grp_in`) values (19,'kumar','yash');
insert into `m_group` (`id`,`grp_uid`,`grp_in`) values (20,'yash','kumar');
insert into `m_group` (`id`,`grp_uid`,`grp_in`) values (21,'sachin','yash');
insert into `m_group` (`id`,`grp_uid`,`grp_in`) values (22,'yash','sachin');
insert into `m_group` (`id`,`grp_uid`,`grp_in`) values (23,'nag','kumar');
insert into `m_group` (`id`,`grp_uid`,`grp_in`) values (24,'kumar','nag');
insert into `m_group` (`id`,`grp_uid`,`grp_in`) values (25,'kumar','nitin');
insert into `m_group` (`id`,`grp_uid`,`grp_in`) values (26,'nitin','kumar');
insert into `m_group` (`id`,`grp_uid`,`grp_in`) values (27,'sachin','menaka');
insert into `m_group` (`id`,`grp_uid`,`grp_in`) values (28,'menaka','sachin');

/*Table structure for table `m_request` */

DROP TABLE IF EXISTS `m_request`;

CREATE TABLE `m_request` (
  `id` int(5) NOT NULL auto_increment,
  `req_from` varchar(50) default NULL,
  `req_to` varchar(50) default NULL,
  `req_status` varchar(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_request` */

insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (1,'nitin','sachin','accepted');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (2,'nitin','user','accepted');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (3,'user','sachin','accepted');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (4,'sachin','nitin','accepted');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (5,'sachin','nitin','accepted');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (6,'user','nitin','accepted');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (7,'user','nitin','accepted');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (8,'kumar','nitin','accepted');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (9,'kumar','sachin','accepted');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (10,'sachin','kumar','accepted');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (11,'kumar','user','rejected');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (12,'kumar','sachin','accepted');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (13,'kumar','nitin','accepted');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (14,'srinivas','kumar','accepted');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (15,'devomita','kumar','accepted');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (16,'nag','srinivas','accepted');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (17,'yash','kumar','accepted');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (18,'yash','sachin','accepted');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (19,'kumar','nag','accepted');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (20,'nitin','kumar','accepted');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (21,'menaka','nitin','pending');
insert into `m_request` (`id`,`req_from`,`req_to`,`req_status`) values (22,'menaka','sachin','accepted');

/*Table structure for table `m_update` */

DROP TABLE IF EXISTS `m_update`;

CREATE TABLE `m_update` (
  `id` int(5) NOT NULL auto_increment,
  `up_from` varchar(50) default NULL,
  `up_to` varchar(50) default NULL,
  `up_msg` varchar(300) default NULL,
  `flag` varchar(10) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_update` */

insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (1,'user','nitin','user Has Accepted Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (2,'sachin','nitin','sachin Has Accepted Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (3,'sachin','user','sachin Has Accepted Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (4,'nitin','sachin','nitin Has Deleted You From Group','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (5,'nitin','sachin','nitin Has Denied Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (6,'nitin','sachin','nitin Has Accepted Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (7,'nitin','user','nitin Has Deleted You From Group','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (8,'nitin','user','nitin Has Denied Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (9,'nitin','user','nitin Has Accepted Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (10,'nitin','kumar','nitin Has Accepted Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (11,'sachin','kumar','sachin Has Denied Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (12,'kumar','sachin','kumar Has Accepted Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (13,'sachin','kumar','sachin Has Deleted You From Group','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (14,'sachin','kumar','sachin Has Accepted Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (15,'nitin','kumar','nitin Has Deleted You From Group','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (16,'nitin','kumar','nitin Has Accepted Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (17,'kumar','srinivas','kumar Has Accepted Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (18,'kumar','devomita','kumar Has Accepted Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (19,'devomita','kumar','devomita Has Deleted You From Group','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (20,'srinivas','nag','srinivas Has Accepted Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (21,'nag','srinivas','nag Has Deleted You From Group','true');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (22,'kumar','yash','kumar Has Accepted Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (23,'sachin','yash','sachin Has Accepted Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (24,'kumar','nitin','kumar Has Deleted You From Group','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (25,'nag','kumar','nag Has Accepted Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (26,'user','nitin','user Has Deleted You From Group','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (27,'user','sachin','user Has Deleted You From Group','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (28,'user','kumar','user Has Denied Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (29,'kumar','nitin','kumar Has Accepted Your Request','false');
insert into `m_update` (`id`,`up_from`,`up_to`,`up_msg`,`flag`) values (30,'sachin','menaka','sachin Has Accepted Your Request','false');

/*Table structure for table `m_user` */

DROP TABLE IF EXISTS `m_user`;

CREATE TABLE `m_user` (
  `id` int(5) NOT NULL auto_increment,
  `userid` varchar(50) NOT NULL,
  `password` varchar(50) default NULL,
  `username` varchar(20) default NULL,
  `gender` varchar(50) default NULL,
  `address` varchar(50) default NULL,
  `city` varchar(50) default NULL,
  `email` varchar(50) default NULL,
  `phone` varchar(12) default NULL,
  PRIMARY KEY  (`id`,`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_user` */

insert into `m_user` (`id`,`userid`,`password`,`username`,`gender`,`address`,`city`,`email`,`phone`) values (13,'nitin','nitin','Nitin Gudle','Male','Silk Board','Bangalore','testmycvsprojects@gmail.com','9916876583');
insert into `m_user` (`id`,`userid`,`password`,`username`,`gender`,`address`,`city`,`email`,`phone`) values (14,'sachin','sachin','Sachin','Male','Rajaji nager','Latur','menakareddyso@gmail.com','2147483647');
insert into `m_user` (`id`,`userid`,`password`,`username`,`gender`,`address`,`city`,`email`,`phone`) values (15,'user','user','Rahul','Male','sadfas','Bangalore','testmycvsprojects@gmail.com','1234567890');
insert into `m_user` (`id`,`userid`,`password`,`username`,`gender`,`address`,`city`,`email`,`phone`) values (18,'devomita','devomita','Devomita Sen','Female','Jayanagar','Bangalore','testmycvsprojects@gmail.com','9916876581');
insert into `m_user` (`id`,`userid`,`password`,`username`,`gender`,`address`,`city`,`email`,`phone`) values (19,'nag','nag','Nagesh','Male','Jayanagar','Bangalore','testmycvsprojects@gmail.com','9916876540');
insert into `m_user` (`id`,`userid`,`password`,`username`,`gender`,`address`,`city`,`email`,`phone`) values (20,'yash','yash','Yashaswini R','Female','Jayanagar','Bangalore','testmycvsprojects@gmail.com','9916876585');
insert into `m_user` (`id`,`userid`,`password`,`username`,`gender`,`address`,`city`,`email`,`phone`) values (21,'menaka','menaka','menaka','Female','bangalore','jaynagar','menakareddyso@gmail.com','7411105260');

/*Table structure for table `userimage_details` */

DROP TABLE IF EXISTS `userimage_details`;

CREATE TABLE `userimage_details` (
  `id` int(10) NOT NULL auto_increment,
  `user_id` varchar(100) default NULL,
  `user_msg_key` varchar(1000) default NULL,
  `image_key` varchar(100) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `userimage_details` */

insert into `userimage_details` (`id`,`user_id`,`user_msg_key`,`image_key`) values (2,'nitin','Q3zRX+ea3iCc0BrsKiU3R/GKtatH9Gpq7QGKLqjcsLklgni9y3qWvOtowb4vph4pmJVU0fitOAXn\r\nuyCQ/KEo7Q==','hi');
insert into `userimage_details` (`id`,`user_id`,`user_msg_key`,`image_key`) values (7,'menaka','ph7c6bA+5Ldi6tV9udpSoZaVTR4exfEN2WGemqi/7FfJLDDY+2PP+ykR5gFabBFak9pFJ/KsmMwX\r\n/etdzJZIfQ==','car');
insert into `userimage_details` (`id`,`user_id`,`user_msg_key`,`image_key`) values (12,'user','e896BMAXBMcxcbAE+l7YozBrVLEiwnnl1CgBHmpmEPyjfvDL9a2Xe8Eila1IRX/Ua3x2WR8A7JUT\r\nZbQG/L5ctTWWTpw9CBGkYoBlxa4aoTQ=','kola');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
