create table t_product(
	id double primary key unique not null auto_increment,
    productName varchar(300),
    model varchar(150),
    unit varchar(60),
    price float,
    store double,
    remark varchar(3000)
)
insert into t_product values(null,'联想笔记本','Y450','台','4500','120','好');