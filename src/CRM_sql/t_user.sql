create table db_crm.t_user
(
		id int  not null,
        userName varchar(20),
        password varchar(20),
        trueName varchar(20),
        email varchar(30),
        phone varchar(20),
        roleName varchar(20),
        primary key(id)
        
);
insert  into `t_user`(`id`,`userName`,`password`,`trueName`,`email`,`phone`,`roleName`) values (1,'java1234','12','Jack','java1234@qq.com','123456789','系统管理员'),(2,'json1234','123','Json','json@qq.com','232132121','销售主管'),(3,'xiaoming','123','小明','khjl01@qq.com','2321321','客户经理'),(4,'xiaohong','123','小红','khjl02@qq.com','21321','客户经理'),(5,'xiaozhang','123','小张','khjl03@qq.com','3242323','客户经理'),(6,'daqian','123','曹大千','gaoguan@qq.com','5434232','高管'),(7,'21','321','321321','321@qq.com','321','系统管理员'),(9,'21','32132','321','321@qq.com','321','销售主管');
