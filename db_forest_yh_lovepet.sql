/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : db_forest_yh_lovepet

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2021-12-04 17:30:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for forest_customer
-- ----------------------------
DROP TABLE IF EXISTS `forest_customer`;
CREATE TABLE `forest_customer` (
  `FOREST_Customer_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '客户编号',
  `FOREST_Customer_Name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '客户姓名',
  `FOREST_Customer_Sex` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '客户性别',
  `FOREST_Customer_Card` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '客户身份证',
  `FOREST_Customer_Phone` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '客户手机号',
  `FOREST_Customer_Email` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '客户邮箱',
  `FOREST_Customer_Home` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '客户住址',
  `FOREST_Customer_Time` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '登记时间',
  PRIMARY KEY (`FOREST_Customer_ID`) USING BTREE,
  KEY `FOREST_Customer_ID` (`FOREST_Customer_ID`) USING BTREE,
  KEY `FOREST_Customer_ID_2` (`FOREST_Customer_ID`) USING BTREE,
  KEY `FOREST_Customer_ID_3` (`FOREST_Customer_ID`) USING BTREE,
  KEY `FOREST_Customer_ID_4` (`FOREST_Customer_ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of forest_customer
-- ----------------------------
INSERT INTO `forest_customer` VALUES ('1', '王欢', '男', '411526195608014517', '15737626784', '508377132@qq.com', '河南省信阳市潢川县', '2020-12-29 11:05:31');
INSERT INTO `forest_customer` VALUES ('2', '王欢', '男', '411529199901014517', '15736786628', '508377132@qq.com', '河南省新乡市', '2020-12-29 11:35:54');
INSERT INTO `forest_customer` VALUES ('3', '豚豚', '女', '411526499987564156', '15838626593', '888888@qq.com', '河南省信阳市', '2021-04-09 21:41:34');

-- ----------------------------
-- Table structure for forest_customer_pets
-- ----------------------------
DROP TABLE IF EXISTS `forest_customer_pets`;
CREATE TABLE `forest_customer_pets` (
  `FOREST_Customer_Pets_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '客宠编号',
  `FOREST_Customer_ID` int(11) DEFAULT NULL COMMENT '客户编号',
  `FOREST_Pets_ID` int(11) DEFAULT NULL COMMENT '宠物编号',
  `FOREST_Customer_Pets_Time` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '登记时间',
  PRIMARY KEY (`FOREST_Customer_Pets_ID`) USING BTREE,
  KEY `FOREST_Customer_Pets1` (`FOREST_Customer_ID`) USING BTREE,
  KEY `FOREST_Customer_Pets2` (`FOREST_Pets_ID`) USING BTREE,
  CONSTRAINT `FOREST_Customer_Pets1` FOREIGN KEY (`FOREST_Customer_ID`) REFERENCES `forest_customer` (`FOREST_Customer_ID`),
  CONSTRAINT `FOREST_Customer_Pets2` FOREIGN KEY (`FOREST_Pets_ID`) REFERENCES `forest_pets` (`forest_pets_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of forest_customer_pets
-- ----------------------------
INSERT INTO `forest_customer_pets` VALUES ('1', '1', '6', '2020-12-29 16:04:49');
INSERT INTO `forest_customer_pets` VALUES ('2', '1', '2', '2020-12-29 16:05:49');
INSERT INTO `forest_customer_pets` VALUES ('3', '1', '1', '2020-12-29 14:04:49');
INSERT INTO `forest_customer_pets` VALUES ('4', '3', '7', '2021-01-04 17:21:58');

-- ----------------------------
-- Table structure for forest_diagnosis
-- ----------------------------
DROP TABLE IF EXISTS `forest_diagnosis`;
CREATE TABLE `forest_diagnosis` (
  `FOREST_Diagnosis_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '诊断编号',
  `FOREST_Diagnosis_Style` int(11) DEFAULT NULL COMMENT '诊断类型\r\n1普通病例\r\n2重症病例\r\n3 无药可治',
  `FOREST_Diagnosis_Detail` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '诊断详情',
  `FOREST_Pets_ID` int(11) DEFAULT NULL COMMENT '宠物编号',
  `FOREST_VetDoctor_ID` int(11) DEFAULT NULL COMMENT '兽医编号',
  `FOREST_Diagnosis_Time` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '登记时间',
  PRIMARY KEY (`FOREST_Diagnosis_ID`) USING BTREE,
  KEY `FOREST_Diagnosis1` (`FOREST_Pets_ID`) USING BTREE,
  KEY `FOREST_Diagnosis2` (`FOREST_VetDoctor_ID`) USING BTREE,
  CONSTRAINT `FOREST_Diagnosis1` FOREIGN KEY (`FOREST_Pets_ID`) REFERENCES `forest_pets` (`forest_pets_id`),
  CONSTRAINT `FOREST_Diagnosis2` FOREIGN KEY (`FOREST_VetDoctor_ID`) REFERENCES `forest_vetdoctor` (`forest_vetdoctor_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of forest_diagnosis
-- ----------------------------
INSERT INTO `forest_diagnosis` VALUES ('1', '1', '无药可治', '1', '1', '2020-12-30 11:01:16');
INSERT INTO `forest_diagnosis` VALUES ('2', '1', '                无病', '6', '1', '2020-12-30 15:44:09');
INSERT INTO `forest_diagnosis` VALUES ('3', '2', '有病', '7', '1', '2021-01-04 17:24:14');

-- ----------------------------
-- Table structure for forest_historyrecord
-- ----------------------------
DROP TABLE IF EXISTS `forest_historyrecord`;
CREATE TABLE `forest_historyrecord` (
  `FOREST_HistoryRecord_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '历史记录编号',
  `FOREST_User_ID` int(11) DEFAULT NULL COMMENT '用户编号',
  `FOREST_Pets_ID` int(11) DEFAULT NULL COMMENT '宠物编号',
  `FOREST_User_Pets_Time` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '登记时间',
  PRIMARY KEY (`FOREST_HistoryRecord_ID`) USING BTREE,
  KEY `FOREST_HistoryRecord1` (`FOREST_User_ID`) USING BTREE,
  KEY `FOREST_HistoryRecord2` (`FOREST_Pets_ID`) USING BTREE,
  CONSTRAINT `FOREST_HistoryRecord1` FOREIGN KEY (`FOREST_User_ID`) REFERENCES `forest_user` (`forest_user_id`),
  CONSTRAINT `FOREST_HistoryRecord2` FOREIGN KEY (`FOREST_Pets_ID`) REFERENCES `forest_pets` (`forest_pets_id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of forest_historyrecord
-- ----------------------------
INSERT INTO `forest_historyrecord` VALUES ('1', '1', '1', '2020-12-30 09:16:59');
INSERT INTO `forest_historyrecord` VALUES ('2', '2', '2', '2020-12-30 10:02:33');
INSERT INTO `forest_historyrecord` VALUES ('3', '2', '2', '2020-12-30 10:03:33');
INSERT INTO `forest_historyrecord` VALUES ('4', '2', '2', '2020-12-30 10:12:13');
INSERT INTO `forest_historyrecord` VALUES ('5', '2', '2', '2020-12-30 10:41:14');
INSERT INTO `forest_historyrecord` VALUES ('6', '2', '2', '2020-12-30 16:54:01');
INSERT INTO `forest_historyrecord` VALUES ('7', '2', '1', '2020-12-30 16:54:05');
INSERT INTO `forest_historyrecord` VALUES ('8', '2', '6', '2020-12-30 16:54:07');
INSERT INTO `forest_historyrecord` VALUES ('9', '2', '1', '2020-12-30 16:54:15');
INSERT INTO `forest_historyrecord` VALUES ('10', '2', '1', '2020-12-30 17:33:52');
INSERT INTO `forest_historyrecord` VALUES ('11', '2', '6', '2020-12-30 17:33:54');
INSERT INTO `forest_historyrecord` VALUES ('12', '2', '2', '2020-12-30 17:33:57');
INSERT INTO `forest_historyrecord` VALUES ('13', '2', '6', '2020-12-30 17:33:59');
INSERT INTO `forest_historyrecord` VALUES ('14', '2', '2', '2020-12-30 17:34:01');
INSERT INTO `forest_historyrecord` VALUES ('15', '2', '1', '2020-12-30 17:34:03');
INSERT INTO `forest_historyrecord` VALUES ('16', '2', '2', '2020-12-30 17:34:08');
INSERT INTO `forest_historyrecord` VALUES ('17', '2', '6', '2020-12-30 17:34:10');
INSERT INTO `forest_historyrecord` VALUES ('18', '2', '1', '2020-12-30 17:34:12');
INSERT INTO `forest_historyrecord` VALUES ('19', '2', '6', '2020-12-30 17:34:14');
INSERT INTO `forest_historyrecord` VALUES ('75', '2', '1', '2021-01-04 17:04:04');
INSERT INTO `forest_historyrecord` VALUES ('76', '2', '1', '2021-01-04 17:07:08');
INSERT INTO `forest_historyrecord` VALUES ('77', '2', '1', '2021-01-04 17:07:16');
INSERT INTO `forest_historyrecord` VALUES ('78', '2', '1', '2021-01-04 17:10:27');
INSERT INTO `forest_historyrecord` VALUES ('79', '2', '2', '2021-01-04 17:12:17');
INSERT INTO `forest_historyrecord` VALUES ('80', '2', '2', '2021-01-04 17:12:32');
INSERT INTO `forest_historyrecord` VALUES ('81', '2', '1', '2021-01-04 17:14:15');
INSERT INTO `forest_historyrecord` VALUES ('82', '2', '6', '2021-01-04 17:14:48');
INSERT INTO `forest_historyrecord` VALUES ('83', '2', '6', '2021-01-04 17:15:24');
INSERT INTO `forest_historyrecord` VALUES ('84', '2', '6', '2021-01-04 17:17:32');
INSERT INTO `forest_historyrecord` VALUES ('85', '2', '2', '2021-01-04 17:17:39');
INSERT INTO `forest_historyrecord` VALUES ('86', '2', '1', '2021-01-04 17:17:42');
INSERT INTO `forest_historyrecord` VALUES ('87', '2', '1', '2021-01-04 17:18:16');
INSERT INTO `forest_historyrecord` VALUES ('88', '2', '2', '2021-01-04 17:18:38');
INSERT INTO `forest_historyrecord` VALUES ('89', '2', '6', '2021-01-04 17:18:42');
INSERT INTO `forest_historyrecord` VALUES ('90', '2', '2', '2021-01-04 17:18:46');
INSERT INTO `forest_historyrecord` VALUES ('91', '2', '7', '2021-01-04 17:22:24');
INSERT INTO `forest_historyrecord` VALUES ('92', '2', '7', '2021-01-04 17:23:03');
INSERT INTO `forest_historyrecord` VALUES ('93', '2', '7', '2021-03-25 22:31:02');
INSERT INTO `forest_historyrecord` VALUES ('94', '2', '7', '2021-03-25 22:31:41');
INSERT INTO `forest_historyrecord` VALUES ('95', '1', '7', '2021-03-26 20:08:46');
INSERT INTO `forest_historyrecord` VALUES ('96', '1', '7', '2021-04-09 21:07:43');
INSERT INTO `forest_historyrecord` VALUES ('97', '2', '7', '2021-04-09 21:41:41');
INSERT INTO `forest_historyrecord` VALUES ('98', '2', '2', '2021-04-09 21:41:48');
INSERT INTO `forest_historyrecord` VALUES ('99', '2', '2', '2021-04-09 21:41:50');
INSERT INTO `forest_historyrecord` VALUES ('100', '2', '2', '2021-04-09 21:41:58');
INSERT INTO `forest_historyrecord` VALUES ('101', '1', '7', '2021-04-09 22:00:28');
INSERT INTO `forest_historyrecord` VALUES ('102', '1', '1', '2021-04-09 22:00:30');
INSERT INTO `forest_historyrecord` VALUES ('103', '1', '2', '2021-04-09 22:00:33');
INSERT INTO `forest_historyrecord` VALUES ('104', '1', '6', '2021-04-09 22:00:36');
INSERT INTO `forest_historyrecord` VALUES ('105', '1', '2', '2021-04-09 22:00:42');
INSERT INTO `forest_historyrecord` VALUES ('106', '1', '2', '2021-04-09 22:00:56');

-- ----------------------------
-- Table structure for forest_orderdetail
-- ----------------------------
DROP TABLE IF EXISTS `forest_orderdetail`;
CREATE TABLE `forest_orderdetail` (
  `FOREST_OrderDetail_ID` int(11) NOT NULL COMMENT '订单编号',
  `FOREST_OrderDetail_Price` decimal(10,2) DEFAULT NULL COMMENT '订单价格',
  `FOREST_OrderDetail_Style` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '支付类型\r\n1支付宝\r\n2微信\r\n3现金',
  `FOREST_Diagnosis_ID` int(11) DEFAULT NULL COMMENT '诊断编号',
  `FOREST_OrderDetail_Pets_Time` datetime DEFAULT NULL COMMENT '登记时间',
  PRIMARY KEY (`FOREST_OrderDetail_ID`) USING BTREE,
  KEY `FOREST_OrderDetail1` (`FOREST_Diagnosis_ID`) USING BTREE,
  CONSTRAINT `FOREST_OrderDetail1` FOREIGN KEY (`FOREST_Diagnosis_ID`) REFERENCES `forest_diagnosis` (`FOREST_Diagnosis_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of forest_orderdetail
-- ----------------------------

-- ----------------------------
-- Table structure for forest_pets
-- ----------------------------
DROP TABLE IF EXISTS `forest_pets`;
CREATE TABLE `forest_pets` (
  `FOREST_Pets_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '宠物编号',
  `FOREST_Pets_Photo` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '宠物图片',
  `FOREST_Pets_Name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '宠物名称',
  `FOREST_Pets_Sex` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '宠物性别',
  `FOREST_Pets_Type` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '宠物品种',
  `FOREST_Pets_Age` decimal(10,1) DEFAULT NULL COMMENT '宠物年龄',
  `FOREST_Pets_Disease` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '宠物病症',
  `FOREST_Pets_Time` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '登记时间',
  PRIMARY KEY (`FOREST_Pets_ID`) USING BTREE,
  KEY `FOREST_Pets_ID` (`FOREST_Pets_ID`) USING BTREE,
  KEY `FOREST_Pets_ID_2` (`FOREST_Pets_ID`) USING BTREE,
  KEY `FOREST_Pets_ID_3` (`FOREST_Pets_ID`) USING BTREE,
  KEY `FOREST_Pets_ID_4` (`FOREST_Pets_ID`) USING BTREE,
  KEY `FOREST_Pets_ID_5` (`FOREST_Pets_ID`) USING BTREE,
  KEY `FOREST_Pets_ID_6` (`FOREST_Pets_ID`) USING BTREE,
  KEY `FOREST_Pets_ID_7` (`FOREST_Pets_ID`) USING BTREE,
  KEY `FOREST_Pets_ID_8` (`FOREST_Pets_ID`) USING BTREE,
  KEY `FOREST_Pets_ID_9` (`FOREST_Pets_ID`) USING BTREE,
  KEY `FOREST_Pets_ID_10` (`FOREST_Pets_ID`) USING BTREE,
  KEY `FOREST_Pets_ID_11` (`FOREST_Pets_ID`) USING BTREE,
  KEY `FOREST_Pets_ID_12` (`FOREST_Pets_ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of forest_pets
-- ----------------------------
INSERT INTO `forest_pets` VALUES ('1', '16386095026612.png', '喵喵', '公', '金毛', '2.5', '胃癌晚期', '2021-01-04 16:50:58');
INSERT INTO `forest_pets` VALUES ('2', '16386096199214.png', '蛋蛋', '公', '柯基', '2.5', '内科', '2020-12-30 16:55:50');
INSERT INTO `forest_pets` VALUES ('6', '16386096378685.png', '大毛', '母', '牧羊犬', '2.0', '内科', '2020-12-30 16:55:40');
INSERT INTO `forest_pets` VALUES ('7', '1638609055004微信图片_20210517181651.jpg', '苗苗', '母', '贵宾犬', '21.0', '美容', '2021-01-04 17:21:58');

-- ----------------------------
-- Table structure for forest_user
-- ----------------------------
DROP TABLE IF EXISTS `forest_user`;
CREATE TABLE `forest_user` (
  `FOREST_User_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '职员编号',
  `FOREST_User_LoginName` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '用户登陆名',
  `FOREST_User_Password` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '用户密码',
  `FOREST_User_Name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户姓名',
  `FOREST_User_Sex` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户性别',
  `FOREST_User_Card` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户身份证',
  `FOREST_User_Phone` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户手机号',
  `FOREST_User_Email` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户邮箱',
  `FOREST_User_Time` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '注册时间',
  `FOREST_User_Grade` int(11) DEFAULT NULL COMMENT '账号等级：\r\n（\r\n1.管理员账号\r\n2.职员账号\r\n）',
  `FOREST_User_State` int(11) DEFAULT NULL COMMENT '账号状态\r\n1为启用\r\n2为禁用\r\n',
  PRIMARY KEY (`FOREST_User_ID`) USING BTREE,
  KEY `FOREST_User_ID` (`FOREST_User_ID`) USING BTREE,
  KEY `FOREST_User_ID_2` (`FOREST_User_ID`) USING BTREE,
  KEY `FOREST_User_ID_3` (`FOREST_User_ID`) USING BTREE,
  KEY `FOREST_User_ID_4` (`FOREST_User_ID`) USING BTREE,
  KEY `FOREST_User_ID_5` (`FOREST_User_ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of forest_user
-- ----------------------------
INSERT INTO `forest_user` VALUES ('1', 'root1', '123123', '王欢', '男', '411526199910014517', '15737626624', '508377132@qq.com', '2020-12-28 14:31:53', '2', '1');
INSERT INTO `forest_user` VALUES ('2', 'wanghuan2', '123123', '王欢', '男', '411526197908034517', '15737645628', '508377132@qq.com', '2020-12-28 17:05:21', '1', '1');
INSERT INTO `forest_user` VALUES ('3', 'wanghuan3', '123123', '王欢', '男', '411526118908014527', '1573567628', '508377132@qq.com', '2020-12-28 17:05:23', '1', '1');

-- ----------------------------
-- Table structure for forest_vetdoctor
-- ----------------------------
DROP TABLE IF EXISTS `forest_vetdoctor`;
CREATE TABLE `forest_vetdoctor` (
  `FOREST_VetDoctor_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '兽医编号',
  `FOREST_VetDoctor_Image` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '兽医照片',
  `FOREST_VetDoctor_Name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '兽医姓名',
  `FOREST_VetDoctor_Sex` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '兽医性别',
  `FOREST_VetDoctor_Card` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '兽医身份证',
  `FOREST_VetDoctor_Phone` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '兽医手机号',
  `FOREST_VetDoctor_Email` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '兽医邮箱',
  `FOREST_VetDoctor_Skill` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '兽医特长',
  `FOREST_VetDoctor_Detail` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '兽医个人简介',
  `FOREST_VetDoctor_Time` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '登记时间',
  `FOREST_VetDoctor_State` int(11) DEFAULT NULL COMMENT '兽医状态\r\n1 为启用状态\r\n2 为 禁用状态',
  PRIMARY KEY (`FOREST_VetDoctor_ID`) USING BTREE,
  KEY `FOREST_VetDoctor_ID` (`FOREST_VetDoctor_ID`) USING BTREE,
  KEY `FOREST_VetDoctor_ID_2` (`FOREST_VetDoctor_ID`) USING BTREE,
  KEY `FOREST_VetDoctor_ID_3` (`FOREST_VetDoctor_ID`) USING BTREE,
  KEY `FOREST_VetDoctor_ID_4` (`FOREST_VetDoctor_ID`) USING BTREE,
  KEY `FOREST_VetDoctor_ID_5` (`FOREST_VetDoctor_ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of forest_vetdoctor
-- ----------------------------
INSERT INTO `forest_vetdoctor` VALUES ('1', '1.jpg', '唐波', '男', '41152617890814517', '15737626679', '508377132@qq.com', '肝脏', '生活上：活泼开朗、乐观上进、待人热情，可以和老师、同学友好相处。\r\n学习上：能吃苦耐劳，用于承受压力，勇于创新。\r\n工作上：担任项目助理一职，对待工作认真负责，善于沟通、喜欢积极地去帮助同学，有较强的抗压能力。', '2020-12-28 17:05:23', '1');
INSERT INTO `forest_vetdoctor` VALUES ('2', '1.jpg', '王欢', '男', '4115261999808024515', '15737626679', '508377132@qq.com', '内科', '生活上：活泼开朗、乐观上进、待人热情，可以和老师、同学友好相处。\r\n学习上：能吃苦耐劳，用于承受压力，勇于创新。\r\n工作上：担任项目助理一职，对待工作认真负责，善于沟通、喜欢积极地去帮助同学，有较强的抗压能力。', '2020-12-28 17:06:23', '1');
INSERT INTO `forest_vetdoctor` VALUES ('3', '1.jpg', '哈哈', '女', '411526199909094517', '15737626679', '508377132@qq.com', '精神科', '生活上：活泼开朗、乐观上进、待人热情，可以和老师、同学友好相处。\r\n学习上：能吃苦耐劳，用于承受压力，勇于创新。\r\n工作上：担任项目助理一职，对待工作认真负责，善于沟通、喜欢积极地去帮助同学，有较强的抗压能力。', '2020-12-28 17:08:23', '2');
INSERT INTO `forest_vetdoctor` VALUES ('4', '16167607418004.webp', '王海', '男', '4115261996609094517', '15737626679', '508377132@qq.com', '内科', '生活上：活泼开朗、乐观上进、待人热情，可以和老师、同学友好相处。\n学习上：能吃苦耐劳，用于承受压力，勇于创新。\n工作上：担任项目助理一职，对待工作认真负责，善于沟通、喜欢积极地去帮助同学，有较强的抗压能力', '2021-01-05 09:53:26', '1');
INSERT INTO `forest_vetdoctor` VALUES ('5', null, '张峰', '男', 'xxxxxxxxxx', '13034342343', 'zhangfeng@qq.com', '打篮球', '生活上：活泼开朗、乐观上进、待人热情，可以和老师、同学友好相处。\n学习上：能吃苦耐劳，用于承受压力，勇于创新。\n工作上：担任项目助理一职，对待工作认真负责，善于沟通、喜欢积极地去帮助同学，有较强的抗压能力', '2021-12-04 17:02:17', null);
