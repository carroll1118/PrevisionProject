/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : 0103carrent

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2019-05-07 14:55:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bus_cars
-- ----------------------------
DROP TABLE IF EXISTS `bus_cars`;
CREATE TABLE `bus_cars` (
  `carnumber` varchar(255) NOT NULL,
  `cartype` varchar(255) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  `price` double(10,2) DEFAULT NULL,
  `rentprice` double(10,2) DEFAULT NULL,
  `deposit` double DEFAULT NULL,
  `isrenting` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `carimg` varchar(255) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`carnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bus_cars
-- ----------------------------
INSERT INTO `bus_cars` VALUES ('222', '2221', '221', '22221.00', '2221.00', '221', '0', '22221', '../upload/2019-03-20/20190320095428400_8503.png', '2019-05-07 14:52:15');
INSERT INTO `bus_cars` VALUES ('鄂A66666', 'SUV', '白色', '280000.00', '500.00', '5000', '0', '宝马X1', '../upload/001.png', '2019-05-07 14:52:15');
INSERT INTO `bus_cars` VALUES ('鄂A77777', 'SUV', '白色', '350000.00', '1500.00', '12000', '0', '宝马X3', '../upload/002.png', '2019-05-07 14:52:15');
INSERT INTO `bus_cars` VALUES ('鄂A88888', '轿车', '黑色', '880000.00', '1000.00', '10000', '0', '保时捷 卡宴', '../upload/003.png', '2019-05-07 14:52:15');

-- ----------------------------
-- Table structure for bus_checks
-- ----------------------------
DROP TABLE IF EXISTS `bus_checks`;
CREATE TABLE `bus_checks` (
  `checkid` varchar(255) NOT NULL,
  `checkdate` datetime DEFAULT NULL,
  `checkdesc` varchar(255) DEFAULT NULL,
  `problem` varchar(255) DEFAULT NULL,
  `paymoney` double(255,0) DEFAULT NULL,
  `opername` varchar(255) DEFAULT NULL,
  `rentid` varchar(255) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`checkid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bus_checks
-- ----------------------------
INSERT INTO `bus_checks` VALUES ('JC_20180612_170407_0385_63960', '2018-06-12 00:00:00', '在G50高速超速', '超速', '500', '习大大', 'CZ_20180611_171304_0732_57330', '2019-05-07 14:55:30');
INSERT INTO `bus_checks` VALUES ('JC_20180612_172559_0323_71959', '2018-06-13 00:00:00', '无', '无', '0', '习大大', 'CZ_20180612_164747_0573_26177', '2019-05-07 14:55:30');
INSERT INTO `bus_checks` VALUES ('JC_20180718_091454_0191_93480', '2018-07-18 00:00:00', '无', '无', '0', '习大大', 'CZ_20180718_091206_0365_62161', '2019-05-07 14:55:30');
INSERT INTO `bus_checks` VALUES ('JC_20181024_170206_355_7589', '2018-10-24 17:02:06', '无', '无', '0', '超级管理员', 'CZ_20181024_102327_735_9111', '2019-05-07 14:55:30');
INSERT INTO `bus_checks` VALUES ('JC_20181201_105333_218_89516', '2018-12-02 00:00:00', '1231321', '111122', '200', '超级管理员', 'CZ_20180612_164808_0385_37625', '2019-05-07 14:55:30');
INSERT INTO `bus_checks` VALUES ('JC_20181201_111951_947_77152', '2018-12-03 00:00:00', '无', '无', '0', '超级管理员', 'CZ_20181201_111936_383_31565', '2019-05-07 14:55:30');
INSERT INTO `bus_checks` VALUES ('JC_2018_0901_175053_57325085', '2018-09-01 00:00:00', '在G50  1127-1130段超速20%未达50%', '有违章未处理', '500', '超级管理员', 'CZ_2018_0901_175000_97637709', '2019-05-07 14:55:30');
INSERT INTO `bus_checks` VALUES ('JC_20190322_142814_147_8624', '2019-03-22 14:28:14', '222', '11', '100', '超级管理员', 'CZ_20190320_141553_303_8141', '2019-05-07 14:55:30');

-- ----------------------------
-- Table structure for bus_customers
-- ----------------------------
DROP TABLE IF EXISTS `bus_customers`;
CREATE TABLE `bus_customers` (
  `identity` varchar(255) NOT NULL COMMENT '身份证',
  `custname` varchar(255) DEFAULT NULL COMMENT '姓名',
  `sex` int(255) DEFAULT NULL COMMENT '性别',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `phone` varchar(255) DEFAULT NULL COMMENT '电话',
  `career` varchar(255) DEFAULT NULL COMMENT '职位',
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`identity`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bus_customers
-- ----------------------------
INSERT INTO `bus_customers` VALUES ('421087133414144412', '张小明', '1', '武昌', '13456788987', '程序员', '2019-05-07 14:52:24');
INSERT INTO `bus_customers` VALUES ('43131334113331131', '习大大', '1', '武昌', '13888888888', '国家最高领导人', '2019-05-07 14:52:24');
INSERT INTO `bus_customers` VALUES ('431321199291331131', '张三', '1', '武昌', '13431334113', '程序员', '2019-05-07 14:52:24');
INSERT INTO `bus_customers` VALUES ('431321199291331132', '孙中山', '1', '汉口', '134131314131', '总统', '2019-05-07 14:52:24');
INSERT INTO `bus_customers` VALUES ('431341134191311311', '李四', '0', '汉阳', '13451313113', 'CEO', '2019-05-07 14:52:24');
INSERT INTO `bus_customers` VALUES ('431341134191311314', '王小明', '1', '汉口', '13413131113', 'CEO', '2019-05-07 14:52:24');

-- ----------------------------
-- Table structure for bus_rents
-- ----------------------------
DROP TABLE IF EXISTS `bus_rents`;
CREATE TABLE `bus_rents` (
  `rentid` varchar(255) NOT NULL,
  `price` double(10,2) DEFAULT NULL,
  `begindate` datetime DEFAULT NULL,
  `returndate` datetime DEFAULT NULL,
  `rentflag` int(11) DEFAULT NULL,
  `identity` varchar(255) DEFAULT NULL,
  `carnumber` varchar(255) DEFAULT NULL,
  `opername` varchar(255) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`rentid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bus_rents
-- ----------------------------
INSERT INTO `bus_rents` VALUES ('CZ_20180611_171304_0732_57330', '1600.00', '2017-01-01 00:00:00', '2017-06-18 00:00:00', '1', '421087133414144412', '鄂A77777', '李四', '2017-01-01 00:00:00');
INSERT INTO `bus_rents` VALUES ('CZ_20180612_164747_0573_26177', '500.00', '2018-01-13 00:00:00', '2018-06-23 00:00:00', '1', '431321199291331131', '鄂A66666', '李四', '2018-01-13 00:00:00');
INSERT INTO `bus_rents` VALUES ('CZ_20180612_164808_0385_37625', '1000.00', '2018-03-13 00:00:00', '2018-06-15 00:00:00', '1', '421087133414144412', '鄂A88888', '王五', '2018-03-13 00:00:00');
INSERT INTO `bus_rents` VALUES ('CZ_20180718_091206_0365_62161', '500.00', '2018-05-18 00:00:00', '2018-07-21 00:00:00', '1', '421087133414144412', '鄂A66666', '张三', '2018-05-18 00:00:00');
INSERT INTO `bus_rents` VALUES ('CZ_20181024_102327_735_9111', '500.00', '2018-07-23 10:23:27', '2018-10-31 10:23:29', '1', '421087133414144412', '鄂A66666', '李四', '2018-07-23 10:23:27');
INSERT INTO `bus_rents` VALUES ('CZ_20181201_111936_383_31565', '1500.00', '2018-09-01 00:00:00', '2018-12-29 00:00:00', '1', '43131334113331131', '鄂A77777', '王五', '2018-09-01 00:00:00');
INSERT INTO `bus_rents` VALUES ('CZ_2018_0901_175000_97637709', '500.00', '2018-12-01 00:00:00', '2018-09-10 00:00:00', '1', '431321199291331131', '鄂A66666', '李四', '2018-12-01 00:00:00');
INSERT INTO `bus_rents` VALUES ('CZ_20190320_141553_303_8141', '1500.00', '2019-03-20 14:15:53', '2019-03-22 14:15:56', '1', '43131334113331131', '鄂A77777', '超级管理员', '2019-03-20 14:15:53');

-- ----------------------------
-- Table structure for sys_log_login
-- ----------------------------
DROP TABLE IF EXISTS `sys_log_login`;
CREATE TABLE `sys_log_login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `loginname` varchar(255) DEFAULT NULL,
  `loginip` varchar(255) DEFAULT NULL,
  `logintime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=341 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_log_login
-- ----------------------------
INSERT INTO `sys_log_login` VALUES ('1', 'admin-超级管理员', '127.0.0.1', '2018-10-27 09:01:21');
INSERT INTO `sys_log_login` VALUES ('2', 'admin-超级管理员', '127.0.0.1', '2018-10-27 09:25:31');
INSERT INTO `sys_log_login` VALUES ('3', 'admin-超级管理员', '127.0.0.1', '2018-10-27 09:25:43');
INSERT INTO `sys_log_login` VALUES ('4', 'admin-超级管理员', '127.0.0.1', '2018-10-27 09:36:02');
INSERT INTO `sys_log_login` VALUES ('5', 'admin-超级管理员', '127.0.0.1', '2018-10-27 10:14:36');
INSERT INTO `sys_log_login` VALUES ('6', 'admin-超级管理员', '127.0.0.1', '2018-10-27 10:25:40');
INSERT INTO `sys_log_login` VALUES ('7', 'admin-超级管理员', '127.0.0.1', '2018-10-27 10:26:40');
INSERT INTO `sys_log_login` VALUES ('8', 'admin-超级管理员', '127.0.0.1', '2018-10-27 10:28:05');
INSERT INTO `sys_log_login` VALUES ('9', 'admin-超级管理员', '127.0.0.1', '2018-10-27 10:29:20');
INSERT INTO `sys_log_login` VALUES ('10', 'admin-超级管理员', '127.0.0.1', '2018-10-27 10:30:21');
INSERT INTO `sys_log_login` VALUES ('11', 'admin-超级管理员', '127.0.0.1', '2018-10-27 10:40:02');
INSERT INTO `sys_log_login` VALUES ('12', 'admin-超级管理员', '127.0.0.1', '2018-10-27 10:47:19');
INSERT INTO `sys_log_login` VALUES ('13', 'zhangsan-张三', '127.0.0.1', '2018-10-27 10:47:42');
INSERT INTO `sys_log_login` VALUES ('14', 'zhangsan-张三', '127.0.0.1', '2018-10-27 10:48:19');
INSERT INTO `sys_log_login` VALUES ('15', 'zhangsan-张三', '127.0.0.1', '2018-10-27 10:48:33');
INSERT INTO `sys_log_login` VALUES ('16', 'ls-李四', '127.0.0.1', '2018-10-27 10:48:55');
INSERT INTO `sys_log_login` VALUES ('17', 'admin-超级管理员', '127.0.0.1', '2018-10-27 10:49:12');
INSERT INTO `sys_log_login` VALUES ('18', 'ls-李四', '127.0.0.1', '2018-10-27 10:49:36');
INSERT INTO `sys_log_login` VALUES ('19', 'ww-王五', '127.0.0.1', '2018-10-27 10:49:46');
INSERT INTO `sys_log_login` VALUES ('20', 'xm-小明', '127.0.0.1', '2018-10-27 10:49:58');
INSERT INTO `sys_log_login` VALUES ('21', 'admin-超级管理员', '127.0.0.1', '2018-10-27 10:50:37');
INSERT INTO `sys_log_login` VALUES ('22', 'admin-超级管理员', '127.0.0.1', '2018-10-27 10:52:23');
INSERT INTO `sys_log_login` VALUES ('23', 'ls-李四', '127.0.0.1', '2018-10-27 10:52:42');
INSERT INTO `sys_log_login` VALUES ('24', 'ww-王五', '127.0.0.1', '2018-10-27 10:52:48');
INSERT INTO `sys_log_login` VALUES ('25', 'xm-小明', '127.0.0.1', '2018-10-27 10:52:54');
INSERT INTO `sys_log_login` VALUES ('26', 'admin-超级管理员', '127.0.0.1', '2018-10-27 10:54:07');
INSERT INTO `sys_log_login` VALUES ('27', 'admin-超级管理员', '127.0.0.1', '2018-10-27 17:09:12');
INSERT INTO `sys_log_login` VALUES ('28', 'admin-超级管理员', '127.0.0.1', '2018-10-27 17:24:04');
INSERT INTO `sys_log_login` VALUES ('29', 'admin-超级管理员', '127.0.0.1', '2018-10-27 17:25:29');
INSERT INTO `sys_log_login` VALUES ('30', 'admin-超级管理员', '127.0.0.1', '2018-10-29 09:06:47');
INSERT INTO `sys_log_login` VALUES ('31', 'admin-超级管理员', '127.0.0.1', '2018-10-29 09:30:42');
INSERT INTO `sys_log_login` VALUES ('32', 'admin-超级管理员', '127.0.0.1', '2018-10-29 09:34:28');
INSERT INTO `sys_log_login` VALUES ('33', 'admin-超级管理员', '127.0.0.1', '2018-10-29 09:36:59');
INSERT INTO `sys_log_login` VALUES ('34', 'admin-超级管理员', '127.0.0.1', '2018-10-29 09:38:51');
INSERT INTO `sys_log_login` VALUES ('35', 'admin-超级管理员', '127.0.0.1', '2018-10-29 09:51:10');
INSERT INTO `sys_log_login` VALUES ('36', 'admin-超级管理员', '127.0.0.1', '2018-10-29 09:54:40');
INSERT INTO `sys_log_login` VALUES ('37', 'admin-超级管理员', '127.0.0.1', '2018-10-29 09:55:52');
INSERT INTO `sys_log_login` VALUES ('38', 'admin-超级管理员', '127.0.0.1', '2018-10-29 10:38:00');
INSERT INTO `sys_log_login` VALUES ('39', 'admin-超级管理员', '127.0.0.1', '2018-10-29 11:01:35');
INSERT INTO `sys_log_login` VALUES ('40', 'admin-超级管理员', '127.0.0.1', '2018-10-29 11:08:17');
INSERT INTO `sys_log_login` VALUES ('41', 'admin-超级管理员', '127.0.0.1', '2018-10-29 11:23:44');
INSERT INTO `sys_log_login` VALUES ('42', 'admin-超级管理员', '127.0.0.1', '2018-10-29 11:24:07');
INSERT INTO `sys_log_login` VALUES ('43', 'admin-超级管理员', '127.0.0.1', '2018-10-29 11:27:20');
INSERT INTO `sys_log_login` VALUES ('44', 'admin-超级管理员', '127.0.0.1', '2018-10-29 11:39:16');
INSERT INTO `sys_log_login` VALUES ('45', 'admin-超级管理员', '127.0.0.1', '2018-10-29 17:58:09');
INSERT INTO `sys_log_login` VALUES ('46', 'admin-超级管理员', '127.0.0.1', '2018-10-29 18:02:55');
INSERT INTO `sys_log_login` VALUES ('47', 'admin-超级管理员', '127.0.0.1', '2018-10-30 14:28:02');
INSERT INTO `sys_log_login` VALUES ('48', 'admin-超级管理员', '127.0.0.1', '2018-10-30 16:47:20');
INSERT INTO `sys_log_login` VALUES ('49', 'admin-超级管理员', '127.0.0.1', '2018-10-30 18:00:36');
INSERT INTO `sys_log_login` VALUES ('52', 'admin-超级管理员', '127.0.0.1', '2018-11-28 10:06:11');
INSERT INTO `sys_log_login` VALUES ('53', 'admin-超级管理员', '127.0.0.1', '2018-11-28 10:07:12');
INSERT INTO `sys_log_login` VALUES ('54', 'admin-超级管理员', '127.0.0.1', '2018-11-28 10:07:45');
INSERT INTO `sys_log_login` VALUES ('55', 'admin-超级管理员', '127.0.0.1', '2018-11-28 10:08:54');
INSERT INTO `sys_log_login` VALUES ('56', 'admin-超级管理员', '127.0.0.1', '2018-11-28 10:09:35');
INSERT INTO `sys_log_login` VALUES ('57', 'admin-超级管理员', '127.0.0.1', '2018-11-28 10:09:45');
INSERT INTO `sys_log_login` VALUES ('58', 'admin-超级管理员', '127.0.0.1', '2018-11-28 10:09:52');
INSERT INTO `sys_log_login` VALUES ('59', 'admin-超级管理员', '192.168.2.126', '2018-11-28 10:32:19');
INSERT INTO `sys_log_login` VALUES ('60', 'admin-超级管理员', '192.168.2.126', '2018-11-28 14:05:43');
INSERT INTO `sys_log_login` VALUES ('61', 'admin-超级管理员', '192.168.2.126', '2018-11-28 14:06:19');
INSERT INTO `sys_log_login` VALUES ('62', 'admin-超级管理员', '192.168.2.126', '2018-11-28 14:07:16');
INSERT INTO `sys_log_login` VALUES ('63', 'admin-超级管理员', '127.0.0.1', '2018-11-28 14:36:41');
INSERT INTO `sys_log_login` VALUES ('64', 'admin-超级管理员', '127.0.0.1', '2018-11-28 14:45:23');
INSERT INTO `sys_log_login` VALUES ('65', 'admin-超级管理员', '127.0.0.1', '2018-11-28 14:46:02');
INSERT INTO `sys_log_login` VALUES ('66', 'admin-超级管理员', '127.0.0.1', '2018-11-28 14:55:55');
INSERT INTO `sys_log_login` VALUES ('67', 'admin-超级管理员', '127.0.0.1', '2018-11-28 14:59:21');
INSERT INTO `sys_log_login` VALUES ('68', 'admin-超级管理员', '127.0.0.1', '2018-11-28 16:17:40');
INSERT INTO `sys_log_login` VALUES ('69', 'admin-超级管理员', '127.0.0.1', '2018-11-28 16:19:07');
INSERT INTO `sys_log_login` VALUES ('70', 'admin-超级管理员', '127.0.0.1', '2018-11-28 16:48:08');
INSERT INTO `sys_log_login` VALUES ('71', 'admin-超级管理员', '127.0.0.1', '2018-11-28 16:48:12');
INSERT INTO `sys_log_login` VALUES ('72', 'admin-超级管理员', '127.0.0.1', '2018-11-28 16:55:21');
INSERT INTO `sys_log_login` VALUES ('73', 'admin-超级管理员', '127.0.0.1', '2018-11-28 17:35:45');
INSERT INTO `sys_log_login` VALUES ('74', 'admin-超级管理员', '127.0.0.1', '2018-11-28 17:45:42');
INSERT INTO `sys_log_login` VALUES ('75', 'admin-超级管理员', '127.0.0.1', '2018-11-30 08:56:02');
INSERT INTO `sys_log_login` VALUES ('76', 'admin-超级管理员', '127.0.0.1', '2018-11-30 08:56:39');
INSERT INTO `sys_log_login` VALUES ('77', 'admin-超级管理员', '127.0.0.1', '2018-11-30 08:57:22');
INSERT INTO `sys_log_login` VALUES ('78', 'admin-超级管理员', '127.0.0.1', '2018-11-30 09:42:51');
INSERT INTO `sys_log_login` VALUES ('79', 'admin-超级管理员', '127.0.0.1', '2018-11-30 09:46:34');
INSERT INTO `sys_log_login` VALUES ('80', 'admin-超级管理员', '127.0.0.1', '2018-11-30 10:22:02');
INSERT INTO `sys_log_login` VALUES ('81', 'admin-超级管理员', '127.0.0.1', '2018-11-30 10:23:44');
INSERT INTO `sys_log_login` VALUES ('82', 'admin-超级管理员', '127.0.0.1', '2018-11-30 10:27:58');
INSERT INTO `sys_log_login` VALUES ('83', 'admin-超级管理员', '127.0.0.1', '2018-11-30 11:17:47');
INSERT INTO `sys_log_login` VALUES ('84', 'admin-超级管理员', '127.0.0.1', '2018-11-30 11:25:13');
INSERT INTO `sys_log_login` VALUES ('85', 'admin-超级管理员', '127.0.0.1', '2018-11-30 15:05:38');
INSERT INTO `sys_log_login` VALUES ('86', 'admin-超级管理员', '127.0.0.1', '2018-11-30 15:15:19');
INSERT INTO `sys_log_login` VALUES ('87', 'admin-超级管理员', '127.0.0.1', '2018-11-30 15:22:51');
INSERT INTO `sys_log_login` VALUES ('88', 'admin-超级管理员', '127.0.0.1', '2018-12-01 09:08:25');
INSERT INTO `sys_log_login` VALUES ('89', 'admin-超级管理员', '127.0.0.1', '2018-12-01 09:18:13');
INSERT INTO `sys_log_login` VALUES ('90', 'admin-超级管理员', '127.0.0.1', '2018-12-01 09:46:43');
INSERT INTO `sys_log_login` VALUES ('91', 'admin-超级管理员', '127.0.0.1', '2018-12-01 09:57:30');
INSERT INTO `sys_log_login` VALUES ('92', 'admin-超级管理员', '127.0.0.1', '2018-12-01 10:11:37');
INSERT INTO `sys_log_login` VALUES ('93', 'admin-超级管理员', '127.0.0.1', '2018-12-01 10:53:10');
INSERT INTO `sys_log_login` VALUES ('94', 'admin-超级管理员', '127.0.0.1', '2018-12-01 11:08:28');
INSERT INTO `sys_log_login` VALUES ('95', 'admin-超级管理员', '127.0.0.1', '2018-12-01 11:17:04');
INSERT INTO `sys_log_login` VALUES ('96', 'admin-超级管理员', '127.0.0.1', '2018-12-01 14:05:16');
INSERT INTO `sys_log_login` VALUES ('97', 'admin-超级管理员', '127.0.0.1', '2018-12-01 15:03:31');
INSERT INTO `sys_log_login` VALUES ('98', 'admin-超级管理员', '127.0.0.1', '2018-12-01 15:03:47');
INSERT INTO `sys_log_login` VALUES ('99', 'admin-超级管理员', '127.0.0.1', '2018-12-01 15:04:09');
INSERT INTO `sys_log_login` VALUES ('100', 'admin-超级管理员', '127.0.0.1', '2018-12-01 15:06:33');
INSERT INTO `sys_log_login` VALUES ('101', 'admin-超级管理员', '127.0.0.1', '2018-12-01 15:09:55');
INSERT INTO `sys_log_login` VALUES ('102', 'admin-超级管理员', '127.0.0.1', '2018-12-01 15:18:06');
INSERT INTO `sys_log_login` VALUES ('103', 'admin-超级管理员', '127.0.0.1', '2018-12-01 15:27:02');
INSERT INTO `sys_log_login` VALUES ('104', 'admin-超级管理员', '127.0.0.1', '2018-12-01 16:59:12');
INSERT INTO `sys_log_login` VALUES ('105', 'admin-超级管理员', '127.0.0.1', '2018-12-01 17:11:52');
INSERT INTO `sys_log_login` VALUES ('106', 'admin-超级管理员', '127.0.0.1', '2018-12-01 17:13:26');
INSERT INTO `sys_log_login` VALUES ('107', 'admin-超级管理员', '127.0.0.1', '2018-12-01 17:16:27');
INSERT INTO `sys_log_login` VALUES ('108', 'admin-超级管理员', '127.0.0.1', '2018-12-01 17:20:55');
INSERT INTO `sys_log_login` VALUES ('109', 'admin-超级管理员', '127.0.0.1', '2018-12-01 17:22:27');
INSERT INTO `sys_log_login` VALUES ('110', 'admin-超级管理员', '127.0.0.1', '2018-12-01 17:23:59');
INSERT INTO `sys_log_login` VALUES ('111', 'admin-超级管理员', '127.0.0.1', '2018-12-01 17:42:40');
INSERT INTO `sys_log_login` VALUES ('112', 'admin-超级管理员', '127.0.0.1', '2018-12-03 08:55:39');
INSERT INTO `sys_log_login` VALUES ('113', 'admin-超级管理员', '127.0.0.1', '2018-12-03 09:19:18');
INSERT INTO `sys_log_login` VALUES ('114', 'admin-超级管理员', '127.0.0.1', '2018-12-03 10:01:03');
INSERT INTO `sys_log_login` VALUES ('115', 'admin-超级管理员', '127.0.0.1', '2018-12-03 10:19:54');
INSERT INTO `sys_log_login` VALUES ('116', 'admin-超级管理员', '127.0.0.1', '2018-12-03 10:32:01');
INSERT INTO `sys_log_login` VALUES ('117', 'admin-超级管理员', '127.0.0.1', '2018-12-03 10:38:32');
INSERT INTO `sys_log_login` VALUES ('118', 'admin-超级管理员', '127.0.0.1', '2018-12-03 11:11:58');
INSERT INTO `sys_log_login` VALUES ('119', 'admin-超级管理员', '127.0.0.1', '2018-12-03 11:12:01');
INSERT INTO `sys_log_login` VALUES ('120', 'admin-超级管理员', '127.0.0.1', '2018-12-03 11:13:48');
INSERT INTO `sys_log_login` VALUES ('121', 'admin-超级管理员', '127.0.0.1', '2018-12-03 11:14:06');
INSERT INTO `sys_log_login` VALUES ('122', 'admin-超级管理员', '127.0.0.1', '2018-12-03 11:14:47');
INSERT INTO `sys_log_login` VALUES ('123', 'admin-超级管理员', '127.0.0.1', '2018-12-03 11:16:42');
INSERT INTO `sys_log_login` VALUES ('124', 'admin-超级管理员', '127.0.0.1', '2018-12-03 11:20:20');
INSERT INTO `sys_log_login` VALUES ('125', 'admin-超级管理员', '127.0.0.1', '2018-12-03 14:09:44');
INSERT INTO `sys_log_login` VALUES ('126', 'admin-超级管理员', '127.0.0.1', '2018-12-03 14:12:44');
INSERT INTO `sys_log_login` VALUES ('127', 'admin-超级管理员', '127.0.0.1', '2018-12-03 14:29:06');
INSERT INTO `sys_log_login` VALUES ('128', 'admin-超级管理员', '127.0.0.1', '2018-12-03 14:40:11');
INSERT INTO `sys_log_login` VALUES ('129', 'admin-超级管理员', '127.0.0.1', '2018-12-03 14:55:44');
INSERT INTO `sys_log_login` VALUES ('130', 'admin-超级管理员', '127.0.0.1', '2018-12-03 15:01:56');
INSERT INTO `sys_log_login` VALUES ('131', 'admin-超级管理员', '127.0.0.1', '2018-12-03 16:21:34');
INSERT INTO `sys_log_login` VALUES ('132', 'admin-超级管理员', '127.0.0.1', '2018-12-03 16:34:33');
INSERT INTO `sys_log_login` VALUES ('133', 'admin-超级管理员', '127.0.0.1', '2018-12-03 16:35:54');
INSERT INTO `sys_log_login` VALUES ('134', 'admin-超级管理员', '127.0.0.1', '2018-12-03 16:36:23');
INSERT INTO `sys_log_login` VALUES ('135', 'admin-超级管理员', '127.0.0.1', '2018-12-03 16:49:16');
INSERT INTO `sys_log_login` VALUES ('136', 'admin-超级管理员', '127.0.0.1', '2018-12-03 16:50:51');
INSERT INTO `sys_log_login` VALUES ('137', 'admin-超级管理员', '127.0.0.1', '2018-12-03 16:52:15');
INSERT INTO `sys_log_login` VALUES ('138', 'admin-超级管理员', '127.0.0.1', '2018-12-03 16:52:57');
INSERT INTO `sys_log_login` VALUES ('139', 'admin-超级管理员', '127.0.0.1', '2018-12-03 16:55:23');
INSERT INTO `sys_log_login` VALUES ('140', 'admin-超级管理员', '127.0.0.1', '2018-12-03 16:56:37');
INSERT INTO `sys_log_login` VALUES ('141', 'admin-超级管理员', '127.0.0.1', '2018-12-03 17:02:07');
INSERT INTO `sys_log_login` VALUES ('142', 'admin-超级管理员', '127.0.0.1', '2018-12-03 17:04:40');
INSERT INTO `sys_log_login` VALUES ('143', 'admin-超级管理员', '127.0.0.1', '2018-12-03 17:06:30');
INSERT INTO `sys_log_login` VALUES ('144', 'admin-超级管理员', '127.0.0.1', '2018-12-03 17:08:41');
INSERT INTO `sys_log_login` VALUES ('145', 'admin-超级管理员', '127.0.0.1', '2018-12-03 17:19:05');
INSERT INTO `sys_log_login` VALUES ('146', 'admin-超级管理员', '127.0.0.1', '2018-12-03 17:20:51');
INSERT INTO `sys_log_login` VALUES ('147', 'admin-超级管理员', '127.0.0.1', '2018-12-03 17:23:40');
INSERT INTO `sys_log_login` VALUES ('148', 'admin-超级管理员', '127.0.0.1', '2018-12-03 17:25:29');
INSERT INTO `sys_log_login` VALUES ('149', 'admin-超级管理员', '127.0.0.1', '2018-12-03 17:29:18');
INSERT INTO `sys_log_login` VALUES ('150', 'admin-超级管理员', '127.0.0.1', '2018-12-03 17:37:07');
INSERT INTO `sys_log_login` VALUES ('151', 'admin-超级管理员', '127.0.0.1', '2018-12-03 17:47:30');
INSERT INTO `sys_log_login` VALUES ('152', 'zhangsan-张三', '127.0.0.1', '2018-12-03 17:47:38');
INSERT INTO `sys_log_login` VALUES ('153', 'ls-李四', '127.0.0.1', '2018-12-03 17:47:58');
INSERT INTO `sys_log_login` VALUES ('154', 'ww-王五', '127.0.0.1', '2018-12-03 17:48:11');
INSERT INTO `sys_log_login` VALUES ('155', 'xm-小明', '127.0.0.1', '2018-12-03 17:48:20');
INSERT INTO `sys_log_login` VALUES ('156', 'admin-超级管理员', '127.0.0.1', '2018-12-03 17:48:28');
INSERT INTO `sys_log_login` VALUES ('157', 'admin-超级管理员', '127.0.0.1', '2018-12-04 09:05:35');
INSERT INTO `sys_log_login` VALUES ('158', 'admin-超级管理员', '127.0.0.1', '2018-12-04 09:06:47');
INSERT INTO `sys_log_login` VALUES ('159', 'admin-超级管理员', '127.0.0.1', '2018-12-04 09:22:11');
INSERT INTO `sys_log_login` VALUES ('160', 'admin-超级管理员', '127.0.0.1', '2018-12-04 09:22:35');
INSERT INTO `sys_log_login` VALUES ('161', 'admin-超级管理员', '127.0.0.1', '2018-12-04 09:23:33');
INSERT INTO `sys_log_login` VALUES ('162', 'admin-超级管理员', '127.0.0.1', '2018-12-04 09:28:21');
INSERT INTO `sys_log_login` VALUES ('163', 'admin-超级管理员', '127.0.0.1', '2018-12-04 09:31:50');
INSERT INTO `sys_log_login` VALUES ('164', 'admin-超级管理员', '127.0.0.1', '2018-12-04 09:42:20');
INSERT INTO `sys_log_login` VALUES ('165', 'admin-超级管理员', '127.0.0.1', '2018-12-04 09:44:08');
INSERT INTO `sys_log_login` VALUES ('166', 'admin-超级管理员', '127.0.0.1', '2018-12-04 09:51:16');
INSERT INTO `sys_log_login` VALUES ('167', 'admin-超级管理员', '127.0.0.1', '2018-12-04 09:52:23');
INSERT INTO `sys_log_login` VALUES ('168', 'admin-超级管理员', '127.0.0.1', '2018-12-04 09:52:47');
INSERT INTO `sys_log_login` VALUES ('169', 'admin-超级管理员', '127.0.0.1', '2018-12-04 09:54:36');
INSERT INTO `sys_log_login` VALUES ('170', 'admin-超级管理员', '127.0.0.1', '2018-12-04 09:55:39');
INSERT INTO `sys_log_login` VALUES ('171', 'admin-超级管理员', '127.0.0.1', '2018-12-04 09:59:56');
INSERT INTO `sys_log_login` VALUES ('172', 'admin-超级管理员', '127.0.0.1', '2018-12-04 10:02:54');
INSERT INTO `sys_log_login` VALUES ('173', 'admin-超级管理员', '127.0.0.1', '2018-12-04 10:09:15');
INSERT INTO `sys_log_login` VALUES ('174', 'admin-超级管理员', '127.0.0.1', '2018-12-04 10:09:32');
INSERT INTO `sys_log_login` VALUES ('175', 'admin-超级管理员', '127.0.0.1', '2018-12-04 10:10:27');
INSERT INTO `sys_log_login` VALUES ('176', 'admin-超级管理员', '127.0.0.1', '2018-12-04 10:17:16');
INSERT INTO `sys_log_login` VALUES ('177', 'admin-超级管理员', '127.0.0.1', '2018-12-04 10:18:05');
INSERT INTO `sys_log_login` VALUES ('178', 'admin-超级管理员', '127.0.0.1', '2018-12-04 10:19:25');
INSERT INTO `sys_log_login` VALUES ('179', 'admin-超级管理员', '127.0.0.1', '2018-12-04 16:48:28');
INSERT INTO `sys_log_login` VALUES ('180', 'admin-超级管理员', '127.0.0.1', '2018-12-04 16:55:42');
INSERT INTO `sys_log_login` VALUES ('181', 'admin-超级管理员', '127.0.0.1', '2018-12-04 17:19:57');
INSERT INTO `sys_log_login` VALUES ('182', 'admin-超级管理员', '127.0.0.1', '2018-12-04 17:23:41');
INSERT INTO `sys_log_login` VALUES ('183', 'admin-超级管理员', '127.0.0.1', '2018-12-04 17:33:53');
INSERT INTO `sys_log_login` VALUES ('184', 'admin-超级管理员', '127.0.0.1', '2018-12-04 17:35:39');
INSERT INTO `sys_log_login` VALUES ('185', 'admin-超级管理员', '127.0.0.1', '2018-12-04 17:38:41');
INSERT INTO `sys_log_login` VALUES ('186', 'admin-超级管理员', '127.0.0.1', '2018-12-04 23:04:38');
INSERT INTO `sys_log_login` VALUES ('187', 'admin-超级管理员', '127.0.0.1', '2018-12-05 09:54:07');
INSERT INTO `sys_log_login` VALUES ('188', 'admin-超级管理员', '127.0.0.1', '2018-12-05 10:04:31');
INSERT INTO `sys_log_login` VALUES ('189', 'admin-超级管理员', '127.0.0.1', '2018-12-05 10:28:33');
INSERT INTO `sys_log_login` VALUES ('190', 'admin-超级管理员', '127.0.0.1', '2018-12-05 10:29:39');
INSERT INTO `sys_log_login` VALUES ('191', 'admin-超级管理员', '127.0.0.1', '2018-12-05 10:29:56');
INSERT INTO `sys_log_login` VALUES ('192', 'admin-超级管理员', '127.0.0.1', '2018-12-05 10:43:30');
INSERT INTO `sys_log_login` VALUES ('193', 'admin-超级管理员', '127.0.0.1', '2018-12-05 10:43:47');
INSERT INTO `sys_log_login` VALUES ('194', 'admin-超级管理员', '127.0.0.1', '2018-12-05 10:57:16');
INSERT INTO `sys_log_login` VALUES ('195', 'admin-超级管理员', '127.0.0.1', '2018-12-05 10:57:36');
INSERT INTO `sys_log_login` VALUES ('196', 'admin-超级管理员', '127.0.0.1', '2018-12-05 10:58:02');
INSERT INTO `sys_log_login` VALUES ('197', 'admin-超级管理员', '127.0.0.1', '2018-12-05 11:04:51');
INSERT INTO `sys_log_login` VALUES ('198', 'admin-超级管理员', '127.0.0.1', '2018-12-05 14:10:58');
INSERT INTO `sys_log_login` VALUES ('199', 'admin-超级管理员', '127.0.0.1', '2018-12-05 14:12:01');
INSERT INTO `sys_log_login` VALUES ('200', 'admin-超级管理员', '127.0.0.1', '2018-12-05 14:40:27');
INSERT INTO `sys_log_login` VALUES ('201', 'admin-超级管理员', '127.0.0.1', '2018-12-05 14:50:21');
INSERT INTO `sys_log_login` VALUES ('202', 'admin-超级管理员', '127.0.0.1', '2018-12-05 14:50:52');
INSERT INTO `sys_log_login` VALUES ('203', 'admin-超级管理员', '127.0.0.1', '2018-12-05 14:51:21');
INSERT INTO `sys_log_login` VALUES ('204', 'admin-超级管理员', '127.0.0.1', '2018-12-05 15:11:37');
INSERT INTO `sys_log_login` VALUES ('205', 'admin-超级管理员', '127.0.0.1', '2018-12-05 15:21:30');
INSERT INTO `sys_log_login` VALUES ('206', 'admin-超级管理员', '127.0.0.1', '2018-12-05 15:22:23');
INSERT INTO `sys_log_login` VALUES ('207', 'admin-超级管理员', '127.0.0.1', '2018-12-05 16:03:01');
INSERT INTO `sys_log_login` VALUES ('208', 'admin-超级管理员', '127.0.0.1', '2018-12-05 16:03:25');
INSERT INTO `sys_log_login` VALUES ('209', 'admin-超级管理员', '127.0.0.1', '2018-12-05 16:17:15');
INSERT INTO `sys_log_login` VALUES ('210', 'admin-超级管理员', '127.0.0.1', '2018-12-05 16:20:11');
INSERT INTO `sys_log_login` VALUES ('211', 'admin-超级管理员', '127.0.0.1', '2018-12-05 16:28:50');
INSERT INTO `sys_log_login` VALUES ('212', 'admin-超级管理员', '127.0.0.1', '2018-12-05 16:38:42');
INSERT INTO `sys_log_login` VALUES ('213', 'admin-超级管理员', '127.0.0.1', '2018-12-05 16:40:30');
INSERT INTO `sys_log_login` VALUES ('214', 'admin-超级管理员', '127.0.0.1', '2018-12-07 08:48:11');
INSERT INTO `sys_log_login` VALUES ('218', 'admin-超级管理员', '127.0.0.1', '2019-03-19 10:59:00');
INSERT INTO `sys_log_login` VALUES ('219', 'admin-超级管理员', '127.0.0.1', '2019-03-19 11:28:40');
INSERT INTO `sys_log_login` VALUES ('220', 'admin-超级管理员', '127.0.0.1', '2019-03-19 14:08:38');
INSERT INTO `sys_log_login` VALUES ('221', 'admin-超级管理员', '127.0.0.1', '2019-03-19 14:09:54');
INSERT INTO `sys_log_login` VALUES ('222', 'admin-超级管理员', '127.0.0.1', '2019-03-19 14:32:33');
INSERT INTO `sys_log_login` VALUES ('223', 'admin-超级管理员', '127.0.0.1', '2019-03-19 14:37:29');
INSERT INTO `sys_log_login` VALUES ('224', 'admin-超级管理员', '127.0.0.1', '2019-03-19 14:51:13');
INSERT INTO `sys_log_login` VALUES ('225', 'admin-超级管理员', '127.0.0.1', '2019-03-20 09:12:25');
INSERT INTO `sys_log_login` VALUES ('226', 'admin-超级管理员', '127.0.0.1', '2019-03-20 09:50:47');
INSERT INTO `sys_log_login` VALUES ('227', 'admin-超级管理员', '192.168.3.129', '2019-03-20 10:13:26');
INSERT INTO `sys_log_login` VALUES ('228', 'admin-超级管理员', '127.0.0.1', '2019-03-20 11:05:19');
INSERT INTO `sys_log_login` VALUES ('229', 'admin-超级管理员', '127.0.0.1', '2019-03-20 11:17:00');
INSERT INTO `sys_log_login` VALUES ('230', 'admin-超级管理员', '127.0.0.1', '2019-03-20 11:42:35');
INSERT INTO `sys_log_login` VALUES ('231', 'zhangsan-张三', '192.168.3.105', '2019-03-20 13:04:59');
INSERT INTO `sys_log_login` VALUES ('232', 'admin-超级管理员', '127.0.0.1', '2019-03-20 14:01:07');
INSERT INTO `sys_log_login` VALUES ('233', 'admin-超级管理员', '127.0.0.1', '2019-03-20 14:14:12');
INSERT INTO `sys_log_login` VALUES ('234', 'admin-超级管理员', '127.0.0.1', '2019-03-20 14:15:40');
INSERT INTO `sys_log_login` VALUES ('235', 'admin-超级管理员', '127.0.0.1', '2019-03-20 14:19:43');
INSERT INTO `sys_log_login` VALUES ('236', 'admin-超级管理员', '192.168.3.129', '2019-03-20 14:52:20');
INSERT INTO `sys_log_login` VALUES ('237', 'admin-超级管理员', '192.168.3.129', '2019-03-20 14:54:56');
INSERT INTO `sys_log_login` VALUES ('238', 'admin-超级管理员', '192.168.3.129', '2019-03-20 14:55:15');
INSERT INTO `sys_log_login` VALUES ('239', 'admin-超级管理员', '192.168.3.119', '2019-03-20 15:08:23');
INSERT INTO `sys_log_login` VALUES ('240', 'admin-超级管理员', '192.168.3.119', '2019-03-20 15:10:04');
INSERT INTO `sys_log_login` VALUES ('241', 'admin-超级管理员', '192.168.3.107', '2019-03-20 15:28:05');
INSERT INTO `sys_log_login` VALUES ('242', 'admin-超级管理员', '192.168.3.119', '2019-03-20 15:28:47');
INSERT INTO `sys_log_login` VALUES ('243', 'admin-超级管理员', '127.0.0.1', '2019-03-20 15:58:07');
INSERT INTO `sys_log_login` VALUES ('244', 'admin-超级管理员', '127.0.0.1', '2019-03-20 15:58:49');
INSERT INTO `sys_log_login` VALUES ('245', 'admin-超级管理员', '127.0.0.1', '2019-03-20 16:08:28');
INSERT INTO `sys_log_login` VALUES ('246', 'admin-超级管理员', '127.0.0.1', '2019-03-20 16:17:58');
INSERT INTO `sys_log_login` VALUES ('247', 'admin-超级管理员', '192.168.3.119', '2019-03-20 16:22:50');
INSERT INTO `sys_log_login` VALUES ('248', 'admin-超级管理员', '127.0.0.1', '2019-03-22 09:11:25');
INSERT INTO `sys_log_login` VALUES ('249', 'admin-超级管理员', '127.0.0.1', '2019-03-22 09:17:30');
INSERT INTO `sys_log_login` VALUES ('250', 'admin-超级管理员', '127.0.0.1', '2019-03-22 09:17:58');
INSERT INTO `sys_log_login` VALUES ('251', 'admin-超级管理员', '127.0.0.1', '2019-03-22 09:44:09');
INSERT INTO `sys_log_login` VALUES ('252', 'admin-超级管理员', '127.0.0.1', '2019-03-22 10:17:07');
INSERT INTO `sys_log_login` VALUES ('253', 'admin-超级管理员', '127.0.0.1', '2019-03-22 10:17:11');
INSERT INTO `sys_log_login` VALUES ('254', 'admin-超级管理员', '127.0.0.1', '2019-03-22 10:26:36');
INSERT INTO `sys_log_login` VALUES ('255', 'admin-超级管理员', '192.168.3.106', '2019-03-22 11:26:45');
INSERT INTO `sys_log_login` VALUES ('256', 'admin-超级管理员', '127.0.0.1', '2019-03-22 11:44:05');
INSERT INTO `sys_log_login` VALUES ('257', 'admin-超级管理员', '192.168.3.106', '2019-03-22 14:07:13');
INSERT INTO `sys_log_login` VALUES ('258', 'admin-超级管理员', '127.0.0.1', '2019-03-22 14:18:31');
INSERT INTO `sys_log_login` VALUES ('259', 'admin-超级管理员', '127.0.0.1', '2019-03-22 14:23:29');
INSERT INTO `sys_log_login` VALUES ('260', 'admin-超级管理员', '127.0.0.1', '2019-03-22 14:27:50');
INSERT INTO `sys_log_login` VALUES ('261', 'admin-超级管理员', '127.0.0.1', '2019-03-22 14:44:43');
INSERT INTO `sys_log_login` VALUES ('262', 'admin-超级管理员', '127.0.0.1', '2019-03-22 14:46:21');
INSERT INTO `sys_log_login` VALUES ('263', 'admin-超级管理员', '127.0.0.1', '2019-03-22 14:52:27');
INSERT INTO `sys_log_login` VALUES ('264', 'admin-超级管理员', '127.0.0.1', '2019-03-22 15:56:43');
INSERT INTO `sys_log_login` VALUES ('265', 'admin-超级管理员', '127.0.0.1', '2019-03-22 16:05:45');
INSERT INTO `sys_log_login` VALUES ('266', 'admin-超级管理员', '127.0.0.1', '2019-03-22 16:37:45');
INSERT INTO `sys_log_login` VALUES ('267', 'admin-超级管理员', '127.0.0.1', '2019-03-22 16:53:27');
INSERT INTO `sys_log_login` VALUES ('268', 'admin-超级管理员', '127.0.0.1', '2019-03-22 16:57:48');
INSERT INTO `sys_log_login` VALUES ('269', 'zhangsan-张三', '192.168.3.103', '2019-03-22 17:01:46');
INSERT INTO `sys_log_login` VALUES ('270', 'admin-超级管理员', '127.0.0.1', '2019-03-22 17:02:48');
INSERT INTO `sys_log_login` VALUES ('271', 'admin-超级管理员', '127.0.0.1', '2019-03-22 17:05:40');
INSERT INTO `sys_log_login` VALUES ('272', 'admin-超级管理员', '127.0.0.1', '2019-03-22 17:59:41');
INSERT INTO `sys_log_login` VALUES ('273', 'admin-超级管理员', '127.0.0.1', '2019-03-22 18:01:22');
INSERT INTO `sys_log_login` VALUES ('274', 'admin-超级管理员', '127.0.0.1', '2019-03-22 18:04:57');
INSERT INTO `sys_log_login` VALUES ('275', 'admin-超级管理员', '127.0.0.1', '2019-03-22 18:10:33');
INSERT INTO `sys_log_login` VALUES ('276', 'admin-超级管理员', '127.0.0.1', '2019-03-23 09:05:56');
INSERT INTO `sys_log_login` VALUES ('277', 'admin-超级管理员', '127.0.0.1', '2019-03-23 09:27:27');
INSERT INTO `sys_log_login` VALUES ('278', 'admin-超级管理员', '127.0.0.1', '2019-03-23 09:29:52');
INSERT INTO `sys_log_login` VALUES ('279', 'admin-超级管理员', '127.0.0.1', '2019-03-23 09:49:02');
INSERT INTO `sys_log_login` VALUES ('280', 'admin-超级管理员', '127.0.0.1', '2019-03-23 10:45:47');
INSERT INTO `sys_log_login` VALUES ('281', 'admin-超级管理员', '127.0.0.1', '2019-03-23 10:53:42');
INSERT INTO `sys_log_login` VALUES ('282', 'admin-超级管理员', '127.0.0.1', '2019-03-23 11:11:01');
INSERT INTO `sys_log_login` VALUES ('283', 'admin-超级管理员', '127.0.0.1', '2019-03-23 11:15:27');
INSERT INTO `sys_log_login` VALUES ('284', 'admin-超级管理员', '127.0.0.1', '2019-03-23 11:22:56');
INSERT INTO `sys_log_login` VALUES ('285', 'admin-超级管理员', '127.0.0.1', '2019-03-23 11:23:51');
INSERT INTO `sys_log_login` VALUES ('286', 'admin-超级管理员', '127.0.0.1', '2019-03-23 11:26:41');
INSERT INTO `sys_log_login` VALUES ('287', 'admin-超级管理员', '192.168.3.106', '2019-03-23 11:41:05');
INSERT INTO `sys_log_login` VALUES ('288', 'admin-超级管理员', '192.168.3.106', '2019-03-23 14:22:28');
INSERT INTO `sys_log_login` VALUES ('289', 'admin-超级管理员', '127.0.0.1', '2019-03-23 14:26:54');
INSERT INTO `sys_log_login` VALUES ('290', 'admin-超级管理员', '127.0.0.1', '2019-03-23 14:52:03');
INSERT INTO `sys_log_login` VALUES ('291', 'admin-超级管理员', '127.0.0.1', '2019-03-23 14:53:21');
INSERT INTO `sys_log_login` VALUES ('292', 'admin-超级管理员', '127.0.0.1', '2019-03-23 14:58:54');
INSERT INTO `sys_log_login` VALUES ('293', 'admin-超级管理员', '127.0.0.1', '2019-03-23 15:42:01');
INSERT INTO `sys_log_login` VALUES ('294', 'admin-超级管理员', '127.0.0.1', '2019-03-23 15:54:16');
INSERT INTO `sys_log_login` VALUES ('295', 'admin-超级管理员', '127.0.0.1', '2019-03-23 15:55:29');
INSERT INTO `sys_log_login` VALUES ('296', 'admin-超级管理员', '127.0.0.1', '2019-03-23 15:57:03');
INSERT INTO `sys_log_login` VALUES ('297', 'admin-超级管理员', '127.0.0.1', '2019-03-23 16:13:55');
INSERT INTO `sys_log_login` VALUES ('298', 'admin-超级管理员', '127.0.0.1', '2019-03-23 16:14:34');
INSERT INTO `sys_log_login` VALUES ('299', 'admin-超级管理员', '127.0.0.1', '2019-03-23 16:24:22');
INSERT INTO `sys_log_login` VALUES ('300', 'zhangsan-张三', '127.0.0.1', '2019-03-23 16:24:37');
INSERT INTO `sys_log_login` VALUES ('301', 'ls-李四', '127.0.0.1', '2019-03-23 16:24:47');
INSERT INTO `sys_log_login` VALUES ('302', 'ww-王五', '127.0.0.1', '2019-03-23 16:24:56');
INSERT INTO `sys_log_login` VALUES ('303', 'xm-小明', '127.0.0.1', '2019-03-23 16:25:14');
INSERT INTO `sys_log_login` VALUES ('304', 'admin-超级管理员', '127.0.0.1', '2019-03-23 16:25:35');
INSERT INTO `sys_log_login` VALUES ('305', 'xm-小明', '127.0.0.1', '2019-03-23 16:25:57');
INSERT INTO `sys_log_login` VALUES ('306', 'xm-小明', '127.0.0.1', '2019-03-23 16:27:19');
INSERT INTO `sys_log_login` VALUES ('307', 'xm-小明', '127.0.0.1', '2019-03-23 16:27:29');
INSERT INTO `sys_log_login` VALUES ('308', 'admin-超级管理员', '127.0.0.1', '2019-03-23 16:27:40');
INSERT INTO `sys_log_login` VALUES ('309', 'zhangsan-张三', '192.168.3.124', '2019-03-23 16:29:30');
INSERT INTO `sys_log_login` VALUES ('310', 'admin-超级管理员', '127.0.0.1', '2019-03-25 09:26:39');
INSERT INTO `sys_log_login` VALUES ('311', 'admin-超级管理员', '127.0.0.1', '2019-03-25 10:10:14');
INSERT INTO `sys_log_login` VALUES ('312', 'admin-超级管理员', '127.0.0.1', '2019-03-25 10:10:37');
INSERT INTO `sys_log_login` VALUES ('313', 'admin-超级管理员', '127.0.0.1', '2019-03-25 10:22:09');
INSERT INTO `sys_log_login` VALUES ('314', 'admin-超级管理员', '127.0.0.1', '2019-03-25 10:51:05');
INSERT INTO `sys_log_login` VALUES ('315', 'admin-超级管理员', '127.0.0.1', '2019-03-25 11:09:35');
INSERT INTO `sys_log_login` VALUES ('316', 'admin-超级管理员', '127.0.0.1', '2019-03-25 11:37:22');
INSERT INTO `sys_log_login` VALUES ('317', 'admin-超级管理员', '127.0.0.1', '2019-03-25 11:37:40');
INSERT INTO `sys_log_login` VALUES ('318', 'admin-超级管理员', '127.0.0.1', '2019-03-25 11:45:10');
INSERT INTO `sys_log_login` VALUES ('319', 'admin-超级管理员', '127.0.0.1', '2019-03-25 14:11:35');
INSERT INTO `sys_log_login` VALUES ('320', 'admin-超级管理员', '127.0.0.1', '2019-03-25 14:16:14');
INSERT INTO `sys_log_login` VALUES ('321', 'admin-超级管理员', '127.0.0.1', '2019-03-25 14:51:51');
INSERT INTO `sys_log_login` VALUES ('322', 'admin-超级管理员', '127.0.0.1', '2019-03-25 14:52:04');
INSERT INTO `sys_log_login` VALUES ('323', 'admin-超级管理员', '127.0.0.1', '2019-03-25 14:55:50');
INSERT INTO `sys_log_login` VALUES ('324', 'admin-超级管理员', '192.168.3.103', '2019-03-25 15:21:19');
INSERT INTO `sys_log_login` VALUES ('325', 'admin-超级管理员', '192.168.3.103', '2019-03-25 15:38:28');
INSERT INTO `sys_log_login` VALUES ('326', 'admin-超级管理员', '127.0.0.1', '2019-03-26 14:39:48');
INSERT INTO `sys_log_login` VALUES ('327', 'admin-超级管理员', '127.0.0.1', '2019-03-26 14:59:26');
INSERT INTO `sys_log_login` VALUES ('328', 'admin-超级管理员', '127.0.0.1', '2019-03-26 15:57:45');
INSERT INTO `sys_log_login` VALUES ('329', 'admin-超级管理员', '127.0.0.1', '2019-03-26 15:59:47');
INSERT INTO `sys_log_login` VALUES ('330', 'admin-超级管理员', '127.0.0.1', '2019-03-26 16:12:22');
INSERT INTO `sys_log_login` VALUES ('331', 'admin-超级管理员', '127.0.0.1', '2019-03-26 16:13:19');
INSERT INTO `sys_log_login` VALUES ('332', 'admin-超级管理员', '127.0.0.1', '2019-03-26 16:14:11');
INSERT INTO `sys_log_login` VALUES ('333', 'admin-超级管理员', '127.0.0.1', '2019-03-26 16:16:16');
INSERT INTO `sys_log_login` VALUES ('334', 'admin-超级管理员', '192.168.3.103', '2019-03-26 16:36:15');
INSERT INTO `sys_log_login` VALUES ('335', 'admin-超级管理员', '127.0.0.1', '2019-03-27 09:23:09');
INSERT INTO `sys_log_login` VALUES ('336', 'admin-超级管理员', '127.0.0.1', '2019-03-27 16:57:10');
INSERT INTO `sys_log_login` VALUES ('337', 'admin-超级管理员', '127.0.0.1', '2019-03-27 16:58:52');
INSERT INTO `sys_log_login` VALUES ('338', 'admin-超级管理员', '127.0.0.1', '2019-03-29 09:38:02');
INSERT INTO `sys_log_login` VALUES ('339', 'admin-超级管理员', '127.0.0.1', '2019-03-29 09:43:25');
INSERT INTO `sys_log_login` VALUES ('340', 'admin-超级管理员', '127.0.0.1', '2019-03-29 11:20:43');

-- ----------------------------
-- Table structure for sys_menus
-- ----------------------------
DROP TABLE IF EXISTS `sys_menus`;
CREATE TABLE `sys_menus` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `href` varchar(255) DEFAULT NULL,
  `open` int(255) DEFAULT NULL COMMENT '0不打1打开',
  `parent` int(255) DEFAULT NULL COMMENT '0非父节点1父节点',
  `target` varchar(255) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `tabicon` varchar(255) DEFAULT NULL,
  `available` int(255) DEFAULT NULL COMMENT '0不可用1可用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_menus
-- ----------------------------
INSERT INTO `sys_menus` VALUES ('1', '0', '汽车出租系统', '', '1', '1', '', '../resources/css/icons/FUNC20082.gif', 'icon-save', '1');
INSERT INTO `sys_menus` VALUES ('2', '1', '客户管理', '../customer/toCustomerManager.action', '0', '0', '', '../resources/css/icons/FUNC20001.gif', 'icon-save', '1');
INSERT INTO `sys_menus` VALUES ('3', '1', '车辆管理', '../car/toCarManager.action', '0', '0', '', '../resources/css/icons/FUNC20065.gif', 'icon-add', '1');
INSERT INTO `sys_menus` VALUES ('4', '1', '业务管理', '', '1', '1', '', '../resources/css/icons/FUNC20024.gif', 'icon-add', '1');
INSERT INTO `sys_menus` VALUES ('5', '1', '系统管理', '', '1', '1', '', '../resources/css/icons/advancedsettings.png', 'icon-add', '1');
INSERT INTO `sys_menus` VALUES ('6', '4', '汽车出租', '../rent/toRentCarManager.action', '0', '0', '', '../resources/css/icons/FUNC20088.gif', 'icon-add', '1');
INSERT INTO `sys_menus` VALUES ('7', '4', '出租单管理', '../rent/toRentManager.action', '0', '0', '', '../resources/css/icons/drive_edit.png', 'icon-add', '1');
INSERT INTO `sys_menus` VALUES ('8', '4', '汽车入库', '../check/toCheckCarManager.action', '0', '0', '', '../resources/css/icons/FUNC55000.gif', 'icon-add', '1');
INSERT INTO `sys_menus` VALUES ('9', '4', '检查单管理', '../check/toCheckManager.action', '0', '0', '', '../resources/css/icons/feed_edit.png', 'icon-add', '1');
INSERT INTO `sys_menus` VALUES ('10', '5', '菜单管理', '../menu/toMenuManager.action', '0', '0', '', '../resources/css/icons/page_white_paste_table.png', 'icon-add', '1');
INSERT INTO `sys_menus` VALUES ('11', '5', '角色管理', '../role/toRoleManager.action', '0', '0', '', '../resources/css/icons/FUNC241000.gif', 'icon-add', '1');
INSERT INTO `sys_menus` VALUES ('12', '5', '用户管理', '../user/toUserManager.action', '0', '0', '', '../resources/css/icons/group_add.png', 'icon-add', '1');
INSERT INTO `sys_menus` VALUES ('13', '5', '修改密码', '../user/toUpdatePwd.action', '0', '0', '', '../resources/css/icons/group_add.png', 'icon-add', '1');
INSERT INTO `sys_menus` VALUES ('14', '1', '数据统计', '', '1', '1', '', '../resources/css/icons/application_edit.png', 'icon-add', '1');
INSERT INTO `sys_menus` VALUES ('15', '14', '客户地区统计', '../tjfx/toCustomerAreaTj.action', '0', '0', '', '../resources/css/icons/page_white_paste_table.png', 'icon-add', '1');
INSERT INTO `sys_menus` VALUES ('16', '14', '公司年度月份销售额曲线图', '../tjfx/toYearSaleMoneyTj.action', '0', '0', '', '../resources/css/icons/book_addresses_edit.png', 'icon-add', '1');
INSERT INTO `sys_menus` VALUES ('17', '14', '业务员年度销售额柱子图', '../tjfx/toOpernameSalMoneyYearTj.action', '0', '0', '', '../resources/css/icons/book_link.png', 'icon-add', '1');
INSERT INTO `sys_menus` VALUES ('18', '5', '日志管理', '../logInfo/toLogInfoManager.action', '0', '0', null, '../resources/css/icons/book_link.png', 'icon-add', '1');
INSERT INTO `sys_menus` VALUES ('21', '5', '系统公告', '../news/toNewsManager.action', '0', '0', '', '../resources/css/icons/application_edit.png', 'icon-save', '1');
INSERT INTO `sys_menus` VALUES ('22', '5', '数据源监控', '../druid/', '0', '0', '', '../resources/css/icons/cd_magnify.png', 'icon-save', '1');

-- ----------------------------
-- Table structure for sys_news
-- ----------------------------
DROP TABLE IF EXISTS `sys_news`;
CREATE TABLE `sys_news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(4000) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `opername` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_news
-- ----------------------------
INSERT INTO `sys_news` VALUES ('5', '关系系统升级公告', '<p>关系系统升级公告关系系统升级公告关系系统升级公告关系系统升级公告关系系统升级公告关系系统升级公告			</p>', '2018-06-14 18:05:22', '习大大');
INSERT INTO `sys_news` VALUES ('6', '4444', '<p><img src=\"http://127.0.0.1:8080/bjsxt/resources/umeditor/jsp/upload/20190319/99511552975805893.jpg\"/></p>', '2019-03-19 14:10:11', '超级管理员');

-- ----------------------------
-- Table structure for sys_roles
-- ----------------------------
DROP TABLE IF EXISTS `sys_roles`;
CREATE TABLE `sys_roles` (
  `roleid` int(11) NOT NULL AUTO_INCREMENT,
  `rolename` varchar(255) DEFAULT NULL,
  `roledesc` varchar(255) DEFAULT NULL,
  `available` int(11) DEFAULT NULL,
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_roles
-- ----------------------------
INSERT INTO `sys_roles` VALUES ('1', '超级管理员', '拥有所有菜单权限', '1');
INSERT INTO `sys_roles` VALUES ('2', '业务管理员', '拥有所以业务菜单', '1');
INSERT INTO `sys_roles` VALUES ('3', '系统管理员', '管理系统', '1');
INSERT INTO `sys_roles` VALUES ('4', '数据统计管理员', '数据统计管理员', '1');

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `rid` int(11) NOT NULL,
  `mid` int(11) NOT NULL,
  PRIMARY KEY (`rid`,`mid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES ('1', '1');
INSERT INTO `sys_role_menu` VALUES ('1', '2');
INSERT INTO `sys_role_menu` VALUES ('1', '3');
INSERT INTO `sys_role_menu` VALUES ('1', '4');
INSERT INTO `sys_role_menu` VALUES ('1', '5');
INSERT INTO `sys_role_menu` VALUES ('1', '6');
INSERT INTO `sys_role_menu` VALUES ('1', '7');
INSERT INTO `sys_role_menu` VALUES ('1', '8');
INSERT INTO `sys_role_menu` VALUES ('1', '9');
INSERT INTO `sys_role_menu` VALUES ('1', '10');
INSERT INTO `sys_role_menu` VALUES ('1', '11');
INSERT INTO `sys_role_menu` VALUES ('1', '12');
INSERT INTO `sys_role_menu` VALUES ('1', '13');
INSERT INTO `sys_role_menu` VALUES ('1', '14');
INSERT INTO `sys_role_menu` VALUES ('1', '15');
INSERT INTO `sys_role_menu` VALUES ('1', '16');
INSERT INTO `sys_role_menu` VALUES ('1', '17');
INSERT INTO `sys_role_menu` VALUES ('1', '18');
INSERT INTO `sys_role_menu` VALUES ('1', '21');
INSERT INTO `sys_role_menu` VALUES ('1', '22');
INSERT INTO `sys_role_menu` VALUES ('2', '1');
INSERT INTO `sys_role_menu` VALUES ('2', '2');
INSERT INTO `sys_role_menu` VALUES ('2', '3');
INSERT INTO `sys_role_menu` VALUES ('2', '4');
INSERT INTO `sys_role_menu` VALUES ('2', '6');
INSERT INTO `sys_role_menu` VALUES ('2', '7');
INSERT INTO `sys_role_menu` VALUES ('2', '8');
INSERT INTO `sys_role_menu` VALUES ('2', '9');
INSERT INTO `sys_role_menu` VALUES ('3', '1');
INSERT INTO `sys_role_menu` VALUES ('3', '5');
INSERT INTO `sys_role_menu` VALUES ('3', '10');
INSERT INTO `sys_role_menu` VALUES ('3', '11');
INSERT INTO `sys_role_menu` VALUES ('3', '12');
INSERT INTO `sys_role_menu` VALUES ('3', '13');
INSERT INTO `sys_role_menu` VALUES ('3', '18');
INSERT INTO `sys_role_menu` VALUES ('3', '21');
INSERT INTO `sys_role_menu` VALUES ('3', '22');
INSERT INTO `sys_role_menu` VALUES ('4', '1');
INSERT INTO `sys_role_menu` VALUES ('4', '14');
INSERT INTO `sys_role_menu` VALUES ('4', '15');
INSERT INTO `sys_role_menu` VALUES ('4', '16');
INSERT INTO `sys_role_menu` VALUES ('4', '17');

-- ----------------------------
-- Table structure for sys_role_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_user`;
CREATE TABLE `sys_role_user` (
  `uid` int(11) NOT NULL,
  `rid` int(11) NOT NULL,
  PRIMARY KEY (`uid`,`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_user
-- ----------------------------
INSERT INTO `sys_role_user` VALUES ('3', '1');
INSERT INTO `sys_role_user` VALUES ('4', '2');
INSERT INTO `sys_role_user` VALUES ('5', '3');
INSERT INTO `sys_role_user` VALUES ('6', '2');
INSERT INTO `sys_role_user` VALUES ('6', '4');

-- ----------------------------
-- Table structure for sys_users
-- ----------------------------
DROP TABLE IF EXISTS `sys_users`;
CREATE TABLE `sys_users` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `loginname` varchar(255) DEFAULT NULL,
  `identity` varchar(255) DEFAULT NULL,
  `realname` varchar(255) DEFAULT NULL,
  `sex` int(255) DEFAULT NULL COMMENT '0女1男',
  `address` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `type` int(255) DEFAULT '2' COMMENT '1，超级管理员,2，系统用户',
  `available` int(255) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_users
-- ----------------------------
INSERT INTO `sys_users` VALUES ('1', 'admin', '4313341334413', '超级管理员', '1', '武汉', '134441331311', 'e10adc3949ba59abbe56e057f20f883e', 'CEO', '1', '1');
INSERT INTO `sys_users` VALUES ('3', 'zhangsan', '3413334134131131', '张三', '1', '武汉', '134131313111', 'e10adc3949ba59abbe56e057f20f883e', 'BA', '2', '1');
INSERT INTO `sys_users` VALUES ('4', 'ls', '43311341311314341', '李四', '1', '武汉', '1341314113131', 'e10adc3949ba59abbe56e057f20f883e', '扫地的', '2', '1');
INSERT INTO `sys_users` VALUES ('5', 'ww', '4313133131331312', '王五', '1', '武汉', '13413131131', 'e10adc3949ba59abbe56e057f20f883e', '领导', '2', '1');
INSERT INTO `sys_users` VALUES ('6', 'xm', '45113141331131131', '小明', '1', '武昌', '13451333131', 'e10adc3949ba59abbe56e057f20f883e', '扫地地', '2', '1');
