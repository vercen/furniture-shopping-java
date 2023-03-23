/*
 Navicat Premium Data Transfer

 Source Server         : 本地MySQL
 Source Server Type    : MySQL
 Source Server Version : 80031 (8.0.31)
 Source Host           : localhost:3306
 Source Schema         : furns_ssm

 Target Server Type    : MySQL
 Target Server Version : 80031 (8.0.31)
 File Encoding         : 65001

 Date: 23/03/2023 10:51:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for furn
-- ----------------------------
DROP TABLE IF EXISTS `furn`;
CREATE TABLE `furn`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `maker` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `price` decimal(11, 2) NOT NULL,
  `sales` int NOT NULL,
  `stock` int NOT NULL,
  `img_path` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 42 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of furn
-- ----------------------------
INSERT INTO `furn` VALUES (1, '北欧风格小桌子', '熊猫家居', 180.00, 666, 7, 'assets/images/product-image/1.jpg');
INSERT INTO `furn` VALUES (2, ' 简约风格小椅子', ' 熊猫家居', 180.00, 666, 7, 'assets/images/product-image/2.jpg');
INSERT INTO `furn` VALUES (3, ' 典雅风格小台灯', ' 蚂蚁家居', 180.00, 666, 7, 'assets/images/product-image/3.jpg');
INSERT INTO `furn` VALUES (4, ' 温馨风格盆景架', ' 蚂蚁家居', 180.00, 666, 7, 'assets/images/product-image/4.jpg');
INSERT INTO `furn` VALUES (13, '北欧风格抱枕', '爱家居', 280.00, 888, 10, 'assets/images/product-image/3.jpg');
INSERT INTO `furn` VALUES (14, '现代简约落地灯', '灯光家居', 580.00, 777, 5, 'assets/images/product-image/4.jpg');
INSERT INTO `furn` VALUES (15, '欧式沙发组合', '欧洲之家', 2380.00, 333, 3, 'assets/images/product-image/5.jpg');
INSERT INTO `furn` VALUES (16, '日式茶几', '和风家居', 680.00, 555, 8, 'assets/images/product-image/6.jpg');
INSERT INTO `furn` VALUES (17, '简约风格书桌', '橙家居', 380.00, 999, 12, 'assets/images/product-image/7.jpg');
INSERT INTO `furn` VALUES (18, '北欧风格地毯', '北极熊家居', 480.00, 666, 6, 'assets/images/product-image/8.jpg');
INSERT INTO `furn` VALUES (19, '简约风格餐椅', '家居生活', 180.00, 1111, 9, 'assets/images/product-image/9.jpg');
INSERT INTO `furn` VALUES (20, '现代简约吊灯', '灯光家居', 780.00, 555, 5, 'assets/images/product-image/10.jpg');
INSERT INTO `furn` VALUES (21, '欧式床架', '欧洲之家', 1880.00, 222, 2, 'assets/images/product-image/11.jpg');
INSERT INTO `furn` VALUES (22, '现代简约电视柜', '灯光家居', 980.00, 444, 4, 'assets/images/product-image/12.jpg');
INSERT INTO `furn` VALUES (23, '欧式风格餐桌椅组合', '欧洲之家', 2980.00, 111, 1, 'assets/images/product-image/13.jpg');
INSERT INTO `furn` VALUES (24, '简约开放式书架', '橙家居', 580.00, 777, 5, 'assets/images/product-image/14.jpg');
INSERT INTO `furn` VALUES (25, '北欧风格懒人沙发', '北极熊家居', 2980.00, 333, 3, 'assets/images/product-image/15.jpg');
INSERT INTO `furn` VALUES (26, '现代简约餐桌椅组合', '灯光家居', 1380.00, 555, 8, 'assets/images/product-image/16.jpg');
INSERT INTO `furn` VALUES (27, '简约风格地板灯', '橙家居', 380.00, 999, 12, 'assets/images/product-image/17.jpg');
INSERT INTO `furn` VALUES (28, '欧式风格电视柜', '欧洲之家', 1980.00, 666, 6, 'assets/images/product-image/18.jpg');
INSERT INTO `furn` VALUES (29, '北欧风格餐椅', '爱家居', 280.00, 1111, 9, 'assets/images/product-image/19.jpg');
INSERT INTO `furn` VALUES (30, '现代简约卧室床', '灯光家居', 2580.00, 555, 5, 'assets/images/product-image/20.jpg');
INSERT INTO `furn` VALUES (31, '日式风格榻榻米床', '和风家居', 3680.00, 222, 2, 'assets/images/product-image/21.jpg');
INSERT INTO `furn` VALUES (32, '现代简约沙发', '灯光家居', 1980.00, 444, 4, 'assets/images/product-image/22.jpg');
INSERT INTO `furn` VALUES (33, '欧式风格鞋柜', '欧洲之家', 1280.00, 666, 6, 'assets/images/product-image/23.jpg');
INSERT INTO `furn` VALUES (34, '北欧风格椅子', '北极熊家居', 580.00, 1111, 9, 'assets/images/product-image/24.jpg');
INSERT INTO `furn` VALUES (35, '日式风格书桌', '和风家居', 880.00, 555, 8, 'assets/images/product-image/25.jpg');
INSERT INTO `furn` VALUES (36, '欧式风格床头柜', '欧洲之家', 680.00, 999, 12, 'assets/images/product-image/26.jpg');
INSERT INTO `furn` VALUES (37, '简约风格衣柜', '橙家居', 2680.00, 333, 3, 'assets/images/product-image/27.jpg');
INSERT INTO `furn` VALUES (38, '北欧风格餐桌', '北极熊家居', 1980.00, 777, 5, 'assets/images/product-image/28.jpg');
INSERT INTO `furn` VALUES (39, '现代简约茶几', '灯光家居', 980.00, 555, 5, 'assets/images/product-image/29.jpg');
INSERT INTO `furn` VALUES (40, '欧式风格沙发', '欧洲之家', 2980.00, 222, 2, 'assets/images/product-image/30.jpg');
INSERT INTO `furn` VALUES (41, '北欧风格书柜', '北极熊家居', 1680.00, 444, 4, 'assets/images/product-image/31.jpg');

SET FOREIGN_KEY_CHECKS = 1;
