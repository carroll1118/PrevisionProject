/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.6.17 : Database - libery
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`libery` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `libery`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `admin_id` varchar(255) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`admin_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Table structure for table `bill` */

DROP TABLE IF EXISTS `bill`;

CREATE TABLE `bill` (
  `bill_id` int(255) NOT NULL,
  `date` datetime(6) NOT NULL,
  `user_id` varchar(11) NOT NULL,
  `amount` double(255,0) NOT NULL,
  PRIMARY KEY (`bill_id`) USING BTREE,
  KEY `bill_user` (`user_id`) USING BTREE,
  CONSTRAINT `bill_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Table structure for table `book_image` */

DROP TABLE IF EXISTS `book_image`;

CREATE TABLE `book_image` (
  `image_id` int(10) NOT NULL,
  `image_url` varchar(255) NOT NULL,
  PRIMARY KEY (`image_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Table structure for table `books` */

DROP TABLE IF EXISTS `books`;

CREATE TABLE `books` (
  `book_id` int(255) NOT NULL AUTO_INCREMENT,
  `isbn` varchar(255) NOT NULL COMMENT '国际标准编号',
  `book_name` varchar(255) NOT NULL COMMENT '书名',
  `book_author` varchar(255) NOT NULL COMMENT '作者',
  `book_price` varchar(20) NOT NULL COMMENT '价格',
  `book_nackNo` varchar(255) NOT NULL COMMENT '存放位置',
  `book_status` int(1) NOT NULL COMMENT '状态',
  `book_edition` varchar(255) NOT NULL COMMENT '版本',
  `data_storage` varchar(50) NOT NULL COMMENT '入库日期',
  `book_gdesc` varchar(255) DEFAULT NULL COMMENT '备注',
  `is_host` int(1) DEFAULT NULL COMMENT '热门',
  `cid` int(50) NOT NULL COMMENT '类别',
  `book_image` varchar(50) DEFAULT NULL COMMENT '图片路径',
  PRIMARY KEY (`book_id`) USING BTREE,
  KEY `books_category` (`cid`) USING BTREE,
  KEY `is_host` (`is_host`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `cid` int(50) NOT NULL AUTO_INCREMENT,
  `cname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cid`) USING BTREE,
  KEY `cid` (`cid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Table structure for table `history_books` */

DROP TABLE IF EXISTS `history_books`;

CREATE TABLE `history_books` (
  `history_book_id` int(10) NOT NULL,
  `use_id` varchar(255) NOT NULL,
  `book_id` int(255) NOT NULL,
  `cid` int(50) NOT NULL,
  PRIMARY KEY (`history_book_id`) USING BTREE,
  KEY `history_user` (`use_id`) USING BTREE,
  KEY `history_books` (`book_id`) USING BTREE,
  KEY `history_category` (`cid`) USING BTREE,
  CONSTRAINT `history_books` FOREIGN KEY (`book_id`) REFERENCES `books` (`book_id`),
  CONSTRAINT `history_category` FOREIGN KEY (`cid`) REFERENCES `category` (`cid`),
  CONSTRAINT `history_user` FOREIGN KEY (`use_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Table structure for table `info` */

DROP TABLE IF EXISTS `info`;

CREATE TABLE `info` (
  `info_id` int(255) NOT NULL AUTO_INCREMENT,
  `info_img` int(50) DEFAULT NULL,
  `is_host` int(1) DEFAULT NULL,
  PRIMARY KEY (`info_id`) USING BTREE,
  KEY `info_books` (`is_host`) USING BTREE,
  KEY `info_book_image` (`info_img`) USING BTREE,
  CONSTRAINT `info_books` FOREIGN KEY (`is_host`) REFERENCES `books` (`is_host`),
  CONSTRAINT `info_book_image` FOREIGN KEY (`info_img`) REFERENCES `book_image` (`image_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Table structure for table `transaction` */

DROP TABLE IF EXISTS `transaction`;

CREATE TABLE `transaction` (
  `trans_id` int(255) NOT NULL,
  `date_of_issue` datetime(6) NOT NULL,
  `due_data` datetime(6) NOT NULL,
  `user_id` varchar(255) NOT NULL,
  `book_id` int(11) NOT NULL,
  PRIMARY KEY (`trans_id`) USING BTREE,
  KEY `tran_user` (`user_id`) USING BTREE,
  KEY `tran_books` (`book_id`) USING BTREE,
  CONSTRAINT `tran_books` FOREIGN KEY (`book_id`) REFERENCES `books` (`book_id`),
  CONSTRAINT `tran_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` varchar(255) NOT NULL,
  `user_name` varchar(20) NOT NULL,
  `user_password` varchar(30) NOT NULL,
  `user_phone` varchar(20) NOT NULL,
  `user_type` int(1) NOT NULL,
  `date_usership` datetime NOT NULL,
  `max_book_limit` int(2) NOT NULL,
  PRIMARY KEY (`user_id`) USING BTREE,
  KEY `user_uid` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
