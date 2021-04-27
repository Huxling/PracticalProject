/*
Navicat MySQL Data Transfer

Source Server         : study
Source Server Version : 50730
Source Host           : localhost:3306
Source Database       : book_data

Target Server Type    : MYSQL
Target Server Version : 50730
File Encoding         : 65001

Date: 2021-04-27 20:42:10
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `book_info`
-- ----------------------------
DROP TABLE IF EXISTS `book_info`;
CREATE TABLE `book_info` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(50) NOT NULL,
  `store` char(50) NOT NULL,
  `price` char(50) DEFAULT NULL,
  `sales` char(50) DEFAULT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_info
-- ----------------------------
INSERT INTO book_info VALUES ('1', ' 零基础学Python从入门到精通', '广东人民出版社旗舰店', '3197人收货', '34.9');
INSERT INTO book_info VALUES ('2', '数据分析网络爬虫深度学习语言程序设计蟒蛇书', '当当网官方旗舰店', '2039人收货', '66.8');
INSERT INTO book_info VALUES ('3', 'JAVA编程入门零基础自学书籍javascript', '墨涵图书专营店', '1636人收货', '24');
INSERT INTO book_info VALUES ('4', '计算机软件程序员开发教程教材书籍', '华版联图书专营店', '1622人收货', '22.8');
INSERT INTO book_info VALUES ('5', '计算机电脑编程入门自学零基础教程全套书籍', '墨涵图书专营店', '1595人收货', '24');
INSERT INTO book_info VALUES ('6', 'py3.7程序设计项目案例教材', '瑞雅图书专营', '1315人收货', '34.8');
INSERT INTO book_info VALUES ('7', 'plus计算机软件程序员开发教程教材书籍', '墨涵图书专营店', '1049人收货', '24');
INSERT INTO book_info VALUES ('9', 'python编程语言从入门到精通程序设计书籍网络爬虫基础', '博库图书专营店', '578人收货', '159.8');
INSERT INTO book_info VALUES ('10', '零基础自学c语言编程入门教程书籍计算机程序设计', '华心图书专营店', '497人收货', '85.6');
