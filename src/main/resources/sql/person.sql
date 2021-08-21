/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50734
 Source Host           : localhost:3306
 Source Schema         : backstage

 Target Server Type    : MySQL
 Target Server Version : 50734
 File Encoding         : 65001

 Date: 21/08/2021 14:42:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `id` bigint(100) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `age` tinyint(5) NULL DEFAULT NULL COMMENT '年龄',
  `profession` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '职业',
  `hobby` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '兴趣',
  `salary` decimal(10, 2) NOT NULL DEFAULT 0.00 COMMENT '薪资',
  `creat_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES (1, '张三', 18, '设计师', '炒股', 8000.00, '2021-08-21 14:29:26', '2021-08-21 14:29:26');
INSERT INTO `person` VALUES (2, '李四', 18, '工程师', '炒股', 5000.00, '2021-08-21 14:37:10', '2021-08-21 14:37:10');
INSERT INTO `person` VALUES (3, 'Tom', 18, '厨师', '羽毛球', 6000.00, '2021-08-21 14:37:10', '2021-08-21 14:37:10');
INSERT INTO `person` VALUES (4, '王五', 18, '收银员', '乒乓球', 4000.00, '2021-08-21 14:37:10', '2021-08-21 14:37:10');
INSERT INTO `person` VALUES (5, 'Jarry', 18, '程序员', '足球', 11000.00, '2021-08-21 14:37:10', '2021-08-21 14:37:10');
INSERT INTO `person` VALUES (6, '王强', 18, '建筑师', '冰球', 12000.00, '2021-08-21 14:37:10', '2021-08-21 14:37:10');
INSERT INTO `person` VALUES (7, '小李', 18, '前端', '沙狐球', 6000.00, '2021-08-21 14:37:10', '2021-08-21 14:37:10');
INSERT INTO `person` VALUES (8, '曹操', 18, '后端', '麻将', 8000.00, '2021-08-21 14:37:10', '2021-08-21 14:37:10');
INSERT INTO `person` VALUES (9, '卧龙', 18, '运维', 'LOL', 14000.00, '2021-08-21 14:37:10', '2021-08-21 14:37:10');
INSERT INTO `person` VALUES (10, '郭嘉', 18, '产品', 'CS GO', 9000.00, '2021-08-21 14:37:10', '2021-08-21 14:37:10');
INSERT INTO `person` VALUES (11, '张良', 18, '数据库工程师', 'DOTA', 16000.00, '2021-08-21 14:37:10', '2021-08-21 14:37:10');
INSERT INTO `person` VALUES (12, '贾诩', 18, '售前', '排球', 7000.00, '2021-08-21 14:37:10', '2021-08-21 14:37:10');
INSERT INTO `person` VALUES (13, 'Jack', 18, '售后', '传奇', 7500.00, '2021-08-21 14:37:10', '2021-08-21 14:37:10');
INSERT INTO `person` VALUES (14, 'Rose', 18, 'UI', '炒股', 18000.00, '2021-08-21 14:37:10', '2021-08-21 14:37:10');
INSERT INTO `person` VALUES (15, 'Jesse', 18, '鉴黄师', '篮球', 15000.00, '2021-08-21 14:37:10', '2021-08-21 14:37:10');

SET FOREIGN_KEY_CHECKS = 1;
