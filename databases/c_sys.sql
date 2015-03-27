/*
Navicat MySQL Data Transfer

Source Server         : c_sys
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : c_sys

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2015-03-27 10:51:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `d_name` varchar(10) NOT NULL,
  `d_amount` tinyint(3) NOT NULL,
  `d_description` varchar(255) DEFAULT NULL,
  `d_id` int(8) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`d_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------

-- ----------------------------
-- Table structure for `departmentemployee`
-- ----------------------------
DROP TABLE IF EXISTS `departmentemployee`;
CREATE TABLE `departmentemployee` (
  `de_name` varchar(10) NOT NULL,
  `de_sex` enum('男','女') NOT NULL,
  `dm_birthday` date DEFAULT NULL,
  `de_lphone` varchar(13) DEFAULT NULL,
  `de_sphone` varchar(8) DEFAULT NULL,
  `de_email` varchar(45) DEFAULT NULL,
  `de_address` varchar(45) DEFAULT NULL,
  `de_otherContactInformation` varchar(255) DEFAULT NULL,
  `de_photo` varchar(255) DEFAULT NULL,
  `de_id` int(8) NOT NULL AUTO_INCREMENT,
  `de_college` varchar(20) DEFAULT NULL,
  `de_major` varchar(20) DEFAULT NULL,
  `de_class` varchar(255) DEFAULT NULL,
  `de_postcode` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`de_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of departmentemployee
-- ----------------------------

-- ----------------------------
-- Table structure for `departmentmanager`
-- ----------------------------
DROP TABLE IF EXISTS `departmentmanager`;
CREATE TABLE `departmentmanager` (
  `dm_name` varchar(10) NOT NULL,
  `dm_sex` enum('男','女') NOT NULL,
  `dm_birthday` date DEFAULT NULL,
  `dm_lphone` varchar(13) DEFAULT NULL,
  `dm_sphone` varchar(8) DEFAULT NULL,
  `dm_email` varchar(40) DEFAULT NULL,
  `dm_address` varchar(40) DEFAULT NULL,
  `dm_otherContactInformation` varchar(255) DEFAULT NULL,
  `dm_photo` varchar(255) DEFAULT NULL,
  `dm_id` int(8) NOT NULL AUTO_INCREMENT,
  `dm_postcode` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`dm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of departmentmanager
-- ----------------------------

-- ----------------------------
-- Table structure for `members`
-- ----------------------------
DROP TABLE IF EXISTS `members`;
CREATE TABLE `members` (
  `m_name` varchar(10) NOT NULL,
  `m_idNumeber` bigint(18) NOT NULL,
  `m_studentNumber` bigint(12) DEFAULT NULL,
  `m_sex` enum('男','女') NOT NULL,
  `m_birthday` varchar(255) DEFAULT NULL,
  `m_nation` varchar(255) NOT NULL,
  `m_nativePlace` varchar(255) NOT NULL,
  `m_pliticsStatus` varchar(255) DEFAULT NULL,
  `m_school` varchar(20) DEFAULT NULL,
  `m_college` varchar(20) DEFAULT NULL,
  `m_department` varchar(20) DEFAULT NULL,
  `m_major` varchar(20) DEFAULT NULL,
  `m_class` varchar(255) DEFAULT NULL,
  `m_grade` varchar(10) DEFAULT NULL,
  `m_educationBackground` varchar(255) DEFAULT NULL,
  `m_students` bit(1) DEFAULT NULL,
  `m_sphone` varchar(255) DEFAULT NULL,
  `m_lphone` varchar(255) DEFAULT NULL,
  `m_address` varchar(40) DEFAULT NULL,
  `m_postcode` smallint(6) DEFAULT NULL,
  `m_id` int(8) NOT NULL AUTO_INCREMENT,
  `m_photo` varchar(255) DEFAULT NULL,
  `m_educationSystem` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`m_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of members
-- ----------------------------

-- ----------------------------
-- Table structure for `supermanager`
-- ----------------------------
DROP TABLE IF EXISTS `supermanager`;
CREATE TABLE `supermanager` (
  `sm_name` varchar(10) DEFAULT NULL,
  `sm_lphone` varchar(13) DEFAULT NULL,
  `sm_id` int(8) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`sm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of supermanager
-- ----------------------------

-- ----------------------------
-- Table structure for `team`
-- ----------------------------
DROP TABLE IF EXISTS `team`;
CREATE TABLE `team` (
  `t_id` int(8) NOT NULL AUTO_INCREMENT,
  `t_name` varchar(20) NOT NULL,
  `t_amount` tinyint(3) NOT NULL,
  `t_description` varchar(255) DEFAULT NULL,
  `t_teacher` varchar(20) DEFAULT NULL,
  `t_setUp` date NOT NULL,
  `t_status` enum('未入驻','已入驻','已退出') NOT NULL,
  `t_leaderID` int(8) NOT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of team
-- ----------------------------

-- ----------------------------
-- Table structure for `userpassword`
-- ----------------------------
DROP TABLE IF EXISTS `userpassword`;
CREATE TABLE `userpassword` (
  `up_user` varchar(16) NOT NULL,
  `up_password` varchar(16) NOT NULL,
  `up_id` int(8) NOT NULL,
  `up_power` tinyint(3) NOT NULL,
  PRIMARY KEY (`up_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userpassword
-- ----------------------------
