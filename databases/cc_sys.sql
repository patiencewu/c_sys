/*
Navicat MySQL Data Transfer

Source Server         : MYDB
Source Server Version : 50623
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50623
File Encoding         : 65001

Date: 2015-02-09 17:30:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `值班表`
-- ----------------------------
DROP TABLE IF EXISTS `值班表`;
CREATE TABLE `值班表` (
  `值班人ID` char(7) NOT NULL DEFAULT '0',
  `安排人ID` char(5) NOT NULL DEFAULT '0',
  `值班地点` varchar(40) NOT NULL DEFAULT '',
  `值班时间` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `上传时间` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`值班人ID`,`值班时间`),
  KEY `值班人ID` (`值班人ID`) USING HASH,
  KEY `安排人ID` (`安排人ID`) USING HASH,
  CONSTRAINT `值班人ID` FOREIGN KEY (`值班人ID`) REFERENCES `注册会员` (`会员账号`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `安排人ID` FOREIGN KEY (`安排人ID`) REFERENCES `管理员` (`管理员账号`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 值班表
-- ----------------------------

-- ----------------------------
-- Table structure for `制度与指南`
-- ----------------------------
DROP TABLE IF EXISTS `制度与指南`;
CREATE TABLE `制度与指南` (
  `行动指南` longtext,
  `管理制度` longtext
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 制度与指南
-- ----------------------------

-- ----------------------------
-- Table structure for `友情链接`
-- ----------------------------
DROP TABLE IF EXISTS `友情链接`;
CREATE TABLE `友情链接` (
  `链接标题` varchar(255) NOT NULL DEFAULT '',
  `链接地址` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 友情链接
-- ----------------------------

-- ----------------------------
-- Table structure for `发布信息`
-- ----------------------------
DROP TABLE IF EXISTS `发布信息`;
CREATE TABLE `发布信息` (
  `发布者ID` varchar(7) NOT NULL,
  `审阅者ID` char(5) DEFAULT '',
  `发布时间` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `标题` varchar(40) NOT NULL DEFAULT '',
  `内容` text NOT NULL,
  `链接地址` text,
  `发布区` tinyint(3) NOT NULL DEFAULT '0',
  `审阅` enum('待审核','已发布','已驳回') NOT NULL DEFAULT '待审核',
  PRIMARY KEY (`发布者ID`,`发布时间`),
  KEY `发布者ID` (`发布者ID`) USING HASH,
  KEY `审阅者ID` (`审阅者ID`) USING HASH,
  CONSTRAINT `发布者ID-发` FOREIGN KEY (`发布者ID`) REFERENCES `注册会员` (`会员账号`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `审阅者ID-发` FOREIGN KEY (`审阅者ID`) REFERENCES `管理员` (`管理员账号`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 发布信息
-- ----------------------------

-- ----------------------------
-- Table structure for `团队`
-- ----------------------------
DROP TABLE IF EXISTS `团队`;
CREATE TABLE `团队` (
  `团队成员账号` char(7) NOT NULL DEFAULT '0',
  `密码` varchar(16) NOT NULL DEFAULT '',
  PRIMARY KEY (`团队成员账号`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 团队
-- ----------------------------

-- ----------------------------
-- Table structure for `团队信息`
-- ----------------------------
DROP TABLE IF EXISTS `团队信息`;
CREATE TABLE `团队信息` (
  `团队编号` char(4) NOT NULL,
  `团队名称` varchar(20) NOT NULL DEFAULT '',
  `团队项目` varchar(40) NOT NULL DEFAULT '',
  `成立时间` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `团队简介` text,
  `人数` int(2) NOT NULL DEFAULT '0',
  `办公室地址` varchar(30) DEFAULT NULL,
  `指导老师` char(10) DEFAULT NULL,
  `创业方向` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`团队编号`),
  KEY `团队编号` (`团队编号`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 团队信息
-- ----------------------------

-- ----------------------------
-- Table structure for `团队成员信息`
-- ----------------------------
DROP TABLE IF EXISTS `团队成员信息`;
CREATE TABLE `团队成员信息` (
  `团队成员ID` char(7) NOT NULL,
  `学号` char(17) NOT NULL DEFAULT '0',
  `姓名` varchar(8) NOT NULL DEFAULT '',
  `性别` char(2) NOT NULL DEFAULT '',
  `年级` char(4) NOT NULL DEFAULT '',
  `学院` varchar(20) NOT NULL DEFAULT '',
  `专业` varchar(20) NOT NULL DEFAULT '',
  `手机长号` char(13) DEFAULT NULL,
  `身份证号码` char(18) NOT NULL DEFAULT '',
  `邮箱地址` varchar(30) DEFAULT NULL,
  `地址` varchar(20) NOT NULL DEFAULT '',
  `个人简介` text,
  `职务` varchar(30) NOT NULL DEFAULT '',
  `短号` char(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 团队成员信息
-- ----------------------------

-- ----------------------------
-- Table structure for `团队积分`
-- ----------------------------
DROP TABLE IF EXISTS `团队积分`;
CREATE TABLE `团队积分` (
  `团队编号` char(4) NOT NULL DEFAULT '0',
  `管理积分` smallint(6) NOT NULL DEFAULT '0',
  `绩效积分` smallint(6) NOT NULL DEFAULT '0',
  `总积分` smallint(6) NOT NULL DEFAULT '0',
  `已用积分` smallint(6) NOT NULL DEFAULT '0',
  `剩余积分` smallint(6) NOT NULL DEFAULT '0',
  PRIMARY KEY (`团队编号`),
  KEY `团队编号` (`团队编号`) USING HASH,
  CONSTRAINT `团队编号-积分` FOREIGN KEY (`团队编号`) REFERENCES `团队信息` (`团队编号`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 团队积分
-- ----------------------------

-- ----------------------------
-- Table structure for `学习视频资源`
-- ----------------------------
DROP TABLE IF EXISTS `学习视频资源`;
CREATE TABLE `学习视频资源` (
  `视频号` char(6) NOT NULL,
  `上传者` char(7) NOT NULL DEFAULT '0',
  `视频标题` varchar(30) NOT NULL DEFAULT '',
  `链接地址` text,
  `上传时间` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `发布区` tinyint(2) DEFAULT NULL,
  `下载次数` int(11) NOT NULL DEFAULT '0',
  `浏览次数` int(11) NOT NULL DEFAULT '0',
  `视频简介` text,
  PRIMARY KEY (`视频号`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 学习视频资源
-- ----------------------------

-- ----------------------------
-- Table structure for `定期报告`
-- ----------------------------
DROP TABLE IF EXISTS `定期报告`;
CREATE TABLE `定期报告` (
  `上传者ID` char(7) NOT NULL,
  `团队编号` char(4) NOT NULL DEFAULT '0',
  `上传时间` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `内容` varchar(255) NOT NULL DEFAULT '',
  `审阅` enum('是','否') NOT NULL DEFAULT '否',
  `分数` tinyint(3) DEFAULT NULL,
  `审阅者ID` char(5) DEFAULT NULL,
  `申述次数` tinyint(3) NOT NULL DEFAULT '0',
  PRIMARY KEY (`上传者ID`,`团队编号`,`上传时间`),
  KEY `上传者ID-定` (`上传者ID`) USING HASH,
  KEY `团队编号-定` (`团队编号`) USING HASH,
  CONSTRAINT `上传者ID-定` FOREIGN KEY (`上传者ID`) REFERENCES `注册会员` (`会员账号`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `团队编号-定` FOREIGN KEY (`团队编号`) REFERENCES `团队信息` (`团队编号`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 定期报告
-- ----------------------------

-- ----------------------------
-- Table structure for `操作日志`
-- ----------------------------
DROP TABLE IF EXISTS `操作日志`;
CREATE TABLE `操作日志` (
  `操作人ID` varchar(7) NOT NULL DEFAULT '0',
  `操作时间` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `操作项目` varchar(255) NOT NULL DEFAULT '',
  `操作类型` varchar(255) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 操作日志
-- ----------------------------

-- ----------------------------
-- Table structure for `故障报修`
-- ----------------------------
DROP TABLE IF EXISTS `故障报修`;
CREATE TABLE `故障报修` (
  `报修者ID` char(7) NOT NULL DEFAULT '0',
  `报修项目` varchar(40) NOT NULL DEFAULT '',
  `报修地点` varchar(40) NOT NULL DEFAULT '',
  `报修时间` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `进度` enum('待处理','已通报','结束') NOT NULL DEFAULT '待处理',
  `处理人ID` varchar(7) NOT NULL DEFAULT '0',
  `预约时间` datetime DEFAULT NULL,
  PRIMARY KEY (`报修者ID`,`报修项目`,`报修时间`),
  KEY `报修者ID` (`报修者ID`) USING HASH,
  CONSTRAINT `报修者ID` FOREIGN KEY (`报修者ID`) REFERENCES `注册会员` (`会员账号`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 故障报修
-- ----------------------------

-- ----------------------------
-- Table structure for `文件`
-- ----------------------------
DROP TABLE IF EXISTS `文件`;
CREATE TABLE `文件` (
  `文件名` varchar(255) NOT NULL DEFAULT '',
  `上传者` char(7) NOT NULL DEFAULT '0',
  `文件标题` varchar(255) NOT NULL DEFAULT '',
  `链接地址` longtext NOT NULL,
  `文件内容` longtext,
  `上传时间` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `发布区` int(11) NOT NULL DEFAULT '0',
  `下载次数` int(11) NOT NULL DEFAULT '0',
  `浏览次数` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`文件名`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 文件
-- ----------------------------

-- ----------------------------
-- Table structure for `注册会员`
-- ----------------------------
DROP TABLE IF EXISTS `注册会员`;
CREATE TABLE `注册会员` (
  `会员账号` char(7) NOT NULL DEFAULT '0',
  `密码` varchar(16) NOT NULL DEFAULT '',
  PRIMARY KEY (`会员账号`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 注册会员
-- ----------------------------

-- ----------------------------
-- Table structure for `注册会员信息`
-- ----------------------------
DROP TABLE IF EXISTS `注册会员信息`;
CREATE TABLE `注册会员信息` (
  `会员ID` char(7) NOT NULL,
  `学号` char(17) NOT NULL DEFAULT '0',
  `姓名` varchar(4) NOT NULL DEFAULT '',
  `性别` char(2) NOT NULL DEFAULT '',
  `年级` char(4) NOT NULL DEFAULT '',
  `学院` varchar(20) NOT NULL DEFAULT '',
  `专业` varchar(20) NOT NULL DEFAULT '',
  `班级` varchar(20) NOT NULL DEFAULT '',
  `长号` char(13) DEFAULT NULL,
  `短号` char(7) DEFAULT NULL,
  `身份证号` char(18) NOT NULL DEFAULT '',
  `邮箱地址` varchar(30) DEFAULT NULL,
  `地址` varchar(30) NOT NULL DEFAULT '',
  `团队简介` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 注册会员信息
-- ----------------------------

-- ----------------------------
-- Table structure for `物资调配`
-- ----------------------------
DROP TABLE IF EXISTS `物资调配`;
CREATE TABLE `物资调配` (
  `物资名称` varchar(20) NOT NULL DEFAULT '',
  `所需积分` tinyint(3) NOT NULL DEFAULT '0',
  `借用团队编号` char(4) NOT NULL DEFAULT '0',
  `剩余余量` smallint(6) NOT NULL DEFAULT '0',
  `借用数量` smallint(6) NOT NULL DEFAULT '0',
  `借出时间` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `应还时间` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`物资名称`,`借用团队编号`,`借出时间`),
  KEY `借用团队编号` (`借用团队编号`) USING HASH,
  CONSTRAINT `借用团队编号` FOREIGN KEY (`借用团队编号`) REFERENCES `团队信息` (`团队编号`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 物资调配
-- ----------------------------

-- ----------------------------
-- Table structure for `积分使用`
-- ----------------------------
DROP TABLE IF EXISTS `积分使用`;
CREATE TABLE `积分使用` (
  `团队编号` char(4) NOT NULL DEFAULT '0',
  `分值` tinyint(3) NOT NULL DEFAULT '0',
  `使用时间` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `理由` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`团队编号`,`使用时间`),
  KEY `团队编号-积分使用` (`团队编号`) USING HASH,
  CONSTRAINT `团队编号-积分使用` FOREIGN KEY (`团队编号`) REFERENCES `团队信息` (`团队编号`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 积分使用
-- ----------------------------

-- ----------------------------
-- Table structure for `积分添加`
-- ----------------------------
DROP TABLE IF EXISTS `积分添加`;
CREATE TABLE `积分添加` (
  `会员ID` char(7) NOT NULL,
  `分值` tinyint(3) NOT NULL DEFAULT '0',
  `添加时间` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `理由` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`会员ID`,`添加时间`),
  KEY `会员ID` (`会员ID`) USING HASH,
  CONSTRAINT `会员ID` FOREIGN KEY (`会员ID`) REFERENCES `注册会员` (`会员账号`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 积分添加
-- ----------------------------

-- ----------------------------
-- Table structure for `策划书`
-- ----------------------------
DROP TABLE IF EXISTS `策划书`;
CREATE TABLE `策划书` (
  `上传者ID` char(7) NOT NULL,
  `受理人ID` char(5) DEFAULT '0',
  `上传时间` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `策划书主题` varchar(20) NOT NULL DEFAULT '',
  `审阅进度` enum('待处理','处理中','盛情成功','申请失败') DEFAULT NULL,
  `内容` varchar(255) NOT NULL DEFAULT '',
  `分数` tinyint(3) DEFAULT NULL,
  PRIMARY KEY (`上传者ID`,`上传时间`),
  KEY `上传者ID-策` (`上传者ID`) USING BTREE,
  KEY `受理人ID-策` (`受理人ID`) USING BTREE,
  CONSTRAINT `上传者ID-策` FOREIGN KEY (`上传者ID`) REFERENCES `注册会员` (`会员账号`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `受理人ID-策` FOREIGN KEY (`受理人ID`) REFERENCES `管理员` (`管理员账号`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 策划书
-- ----------------------------

-- ----------------------------
-- Table structure for `管理员`
-- ----------------------------
DROP TABLE IF EXISTS `管理员`;
CREATE TABLE `管理员` (
  `管理员账号` char(5) NOT NULL,
  `密码` varchar(16) NOT NULL DEFAULT '',
  PRIMARY KEY (`管理员账号`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 管理员
-- ----------------------------

-- ----------------------------
-- Table structure for `管理员信息`
-- ----------------------------
DROP TABLE IF EXISTS `管理员信息`;
CREATE TABLE `管理员信息` (
  `管理员账号` char(5) NOT NULL DEFAULT '0',
  `姓名` varchar(8) NOT NULL DEFAULT '',
  `手机长号` char(13) DEFAULT NULL,
  `主要职责` varchar(20) DEFAULT NULL,
  `邮箱地址` varchar(30) DEFAULT NULL,
  `手机短号` char(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 管理员信息
-- ----------------------------

-- ----------------------------
-- Table structure for `管理员积分明细`
-- ----------------------------
DROP TABLE IF EXISTS `管理员积分明细`;
CREATE TABLE `管理员积分明细` (
  `管理员ID` char(5) NOT NULL DEFAULT '0',
  `分值` tinyint(3) NOT NULL DEFAULT '0',
  `添加时间` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `理由` varchar(255) NOT NULL DEFAULT '',
  `团队编号` char(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`管理员ID`,`添加时间`),
  KEY `管理员ID` (`管理员ID`) USING HASH,
  CONSTRAINT `管理员ID` FOREIGN KEY (`管理员ID`) REFERENCES `管理员` (`管理员账号`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 管理员积分明细
-- ----------------------------

-- ----------------------------
-- Table structure for `约见老师`
-- ----------------------------
DROP TABLE IF EXISTS `约见老师`;
CREATE TABLE `约见老师` (
  `约见者ID` char(7) NOT NULL DEFAULT '0',
  `被约教师ID` char(5) NOT NULL DEFAULT '0',
  `约见时间` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `约见地点` varchar(40) NOT NULL DEFAULT '',
  `进度` enum('待处理','接受','拒绝') NOT NULL DEFAULT '待处理',
  `约见缘由` varchar(255) NOT NULL DEFAULT '',
  `上报时间` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `拒绝理由` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`约见者ID`,`被约教师ID`,`上报时间`),
  KEY `约见者ID` (`约见者ID`) USING HASH,
  KEY `被约教师ID` (`被约教师ID`) USING HASH,
  CONSTRAINT `约见者ID` FOREIGN KEY (`约见者ID`) REFERENCES `注册会员` (`会员账号`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `被约教师ID` FOREIGN KEY (`被约教师ID`) REFERENCES `管理员` (`管理员账号`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 约见老师
-- ----------------------------

-- ----------------------------
-- Table structure for `补贴申请`
-- ----------------------------
DROP TABLE IF EXISTS `补贴申请`;
CREATE TABLE `补贴申请` (
  `申请者ID` char(7) NOT NULL DEFAULT '0',
  `申请项目` varchar(40) NOT NULL DEFAULT '',
  `申请缘由` varchar(255) NOT NULL DEFAULT '',
  `处理者ID` char(5) DEFAULT NULL,
  `申请进度` enum('待处理','处理中','成功','拒绝') NOT NULL DEFAULT '待处理',
  `拒绝理由` varchar(255) DEFAULT NULL,
  `申请时间` datetime NOT NULL,
  PRIMARY KEY (`申请者ID`,`申请项目`,`申请时间`),
  KEY `申请者ID` (`申请者ID`) USING HASH,
  CONSTRAINT `申请者ID` FOREIGN KEY (`申请者ID`) REFERENCES `注册会员` (`会员账号`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 补贴申请
-- ----------------------------

-- ----------------------------
-- Table structure for `财务报表`
-- ----------------------------
DROP TABLE IF EXISTS `财务报表`;
CREATE TABLE `财务报表` (
  `上传者ID` char(7) NOT NULL,
  `团队编号` char(4) NOT NULL DEFAULT '0',
  `上传时间` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `内容` varchar(255) NOT NULL DEFAULT '',
  `审阅` enum('是','否') NOT NULL DEFAULT '否',
  `分数` tinyint(3) DEFAULT '0',
  `审阅者ID` char(5) DEFAULT NULL,
  `申述次数` tinyint(3) NOT NULL DEFAULT '0',
  KEY `团队编号` (`团队编号`) USING HASH,
  KEY `上传者ID` (`上传者ID`) USING BTREE,
  CONSTRAINT `团队编号` FOREIGN KEY (`团队编号`) REFERENCES `团队信息` (`团队编号`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 财务报表
-- ----------------------------

-- ----------------------------
-- Table structure for `通告栏`
-- ----------------------------
DROP TABLE IF EXISTS `通告栏`;
CREATE TABLE `通告栏` (
  `发布者ID` varchar(7) NOT NULL,
  `发布时间` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `发布标题` varchar(20) NOT NULL DEFAULT '',
  `发布内容` varchar(255) NOT NULL DEFAULT '',
  `发布区` tinyint(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`发布时间`,`发布者ID`),
  KEY `发布者ID` (`发布者ID`) USING HASH,
  CONSTRAINT `发布者ID` FOREIGN KEY (`发布者ID`) REFERENCES `注册会员` (`会员账号`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `发布者ID2` FOREIGN KEY (`发布者ID`) REFERENCES `管理员` (`管理员账号`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 通告栏
-- ----------------------------
