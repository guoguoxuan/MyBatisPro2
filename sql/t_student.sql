/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : ly

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2017-08-24 14:56:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_student`
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` varchar(20) DEFAULT NULL,
  `addressId` int(11) DEFAULT NULL,
  `gradeId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `gradeId` (`gradeId`),
  KEY `addressId` (`addressId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES ('1', '王五22', '14', '1', '1');
INSERT INTO `t_student` VALUES ('4', '王五', '11', '1', '2');
INSERT INTO `t_student` VALUES ('5', '王五', '11', '2', '2');
INSERT INTO `t_student` VALUES ('6', '李四2', '14', '2', '2');
INSERT INTO `t_student` VALUES ('7', '王五', '11', '2', '2');
INSERT INTO `t_student` VALUES ('8', '王五', '11', '1', '1');
INSERT INTO `t_student` VALUES ('9', 'aaa', '11', '1', '2');
