drop table if exists `commodity`;
create table `commodity`(
	`commodity_no` int not null auto_increment primary key,
	`commodity_name` varchar(50) not null,
	`commodity_price` double(16,2) not null

)ENGINE=InnoDB DEFAULT CHARSET=utf8;

drop table if exists `student`
CREATE TABLE `student` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `password` varchar(50) DEFAULT '',
  `sex` varchar(4) DEFAULT NULL,
  `department` varchar(20) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=907 DEFAULT CHARSET=utf8;
