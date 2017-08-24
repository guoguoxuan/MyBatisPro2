/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : ly

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2017-08-24 14:55:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_address`
-- ----------------------------
DROP TABLE IF EXISTS `t_address`;
CREATE TABLE `t_address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sheng` varchar(20) DEFAULT NULL,
  `shi` varchar(20) DEFAULT NULL,
  `qu` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `tt2` FOREIGN KEY (`id`) REFERENCES `t_student` (`addressId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_address
-- ----------------------------
INSERT INTO `t_address` VALUES ('1', '江苏省', '苏州市', '姑苏区');
INSERT INTO `t_address` VALUES ('2', '江苏省', '南京市', '鼓楼区');
