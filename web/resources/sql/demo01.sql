create table `commodity`(
	`gid` int(11) not null,
	`gname` varchar(50) not null,
	`gpeice` float(16,2) not null,
	primary key(`gid`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `student` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `password` varchar(50) DEFAULT '',
  `sex` varchar(4) DEFAULT NULL,
  `department` varchar(20) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=907 DEFAULT CHARSET=utf8;
