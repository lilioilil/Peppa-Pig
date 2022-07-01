insert into department values(1,'内科',null,'');
insert into department values(2,'外科',null,'');
insert into department values(3,'妇产科',null,'');
insert into department values(4,'儿科',null,'');
insert into department values(null,'神经内科',1,'');
insert into department values(null,'呼吸内科',1,'');
insert into department values(null,'消化内科',1,'');
insert into department values(null,'心血管内科',1,'');
insert into department values(null,'普通外科',2,'');
insert into department values(null,'骨科',2,'');
insert into department values(null,'神经外科',2,'');
insert into department values(null,'妇科',3,'');
insert into department values(null,'产科',3,'');
insert into department values(null,'儿科',4,'');
insert into department values(null,'新生儿科',4,'');

insert into clinic values(null,'普通门诊',10);
insert into clinic values(null,'副主任门诊',25);
insert into clinic values(null,'主任门诊',35);
insert into clinic values(null,'知名专家',80);
insert into clinic values(null,'特需门诊',300);
insert into clinic values(null,'国际门诊',600);
insert into clinic values(null,'急症门诊',10);


insert into doctor(name,department,level) values('扁鹊',5,'主任医师');
insert into doctor(name,department,level) values('华佗',10,'主任医师');
insert into doctor(name,department,level) values('张仲景',6,'副主任医师');
insert into doctor(name,department,level) values('孙思邈',7,'主治医师');
insert into doctor(name,department,level) values('李时珍',8,'主治医师');
insert into doctor(name,department,level) values('东方宇辉',5,'主任医师');
insert into doctor(name,department,level) values('东方土锤',10,'副主任医师');
insert into doctor(name,department,level) values('东方呦呦',11,'副主任医师');
insert into doctor(name,department,level) values('东方顿顿',12,'副主任医师');
insert into doctor(name,department,level) values('东方七七',9,'副主任医师');
insert into doctor(name,department,level) values('东方蓓蓓',14,'主治医师');
insert into doctor(name,department,level) values('东方东东',9,'主治医师');
insert into doctor(name,department,level) values('东方杰西',11,'主治医师');
insert into doctor(name,department,level) values('东方大琪',13,'主治医师');
insert into doctor(name,department,level) values('东方老鱼',7,'住院医师');

insert into patient(name,id_card,phone) values('赛文','430103200104020042','13100000000');
insert into patient(name,id_card,phone) values('赛罗','430103200104020043','15011111111');
insert into patient(name,id_card,phone) values('雷欧','430103200104020044','13122222222');
insert into patient(name,id_card,phone) values('迪伽','430103200104020045','18633333333');
insert into patient(name,id_card,phone,state) values('赛伽','430103200104020046','15044444444',2);
insert into patient(name,id_card,phone) values('捷徳','430103200104020047','13755555555');
insert into patient(name,id_card,phone) values('贝利亚','430103200104020048','13966666666');


insert into scheduling(doctor,time,clinic) values(1,'2022/7/4',1);
insert into scheduling(doctor,time,clinic) values(1,'2022/7/5',3);
insert into scheduling(doctor,time,clinic) values(1,'2022/7/6',3);
insert into scheduling(doctor,time,clinic) values(1,'2022/7/7',4);
insert into scheduling(doctor,time,clinic) values(1,'2022/7/8',4);
insert into scheduling(doctor,time,clinic) values(1,'2022/7/9',5);

insert into scheduling(doctor,time,clinic) values(2,'2022/7/4',4);
insert into scheduling(doctor,time,clinic) values(2,'2022/7/5',4);
insert into scheduling(doctor,time,clinic) values(2,'2022/7/6',4);
insert into scheduling(doctor,time,clinic) values(2,'2022/7/7',5);
insert into scheduling(doctor,time,clinic) values(2,'2022/7/8',3);
insert into scheduling(doctor,time,clinic) values(2,'2022/7/9',1);

insert into scheduling(doctor,time,clinic) values(3,'2022/7/4',2);
insert into scheduling(doctor,time,clinic) values(3,'2022/7/5',4);
insert into scheduling(doctor,time,clinic) values(3,'2022/7/6',2);
insert into scheduling(doctor,time,clinic) values(3,'2022/7/7',2);
insert into scheduling(doctor,time,clinic) values(3,'2022/7/8',2);
insert into scheduling(doctor,time,clinic) values(3,'2022/7/9',2);

insert into scheduling(doctor,time,clinic) values(4,'2022/7/4',1);
insert into scheduling(doctor,time,clinic) values(4,'2022/7/5',1);
insert into scheduling(doctor,time,clinic) values(4,'2022/7/6',1);
insert into scheduling(doctor,time,clinic) values(4,'2022/7/7',1);
insert into scheduling(doctor,time,clinic) values(4,'2022/7/8',1);
insert into scheduling(doctor,time,clinic) values(4,'2022/7/9',1);

insert into scheduling(doctor,time,clinic) values(5,'2022/7/4',1);
insert into scheduling(doctor,time,clinic) values(5,'2022/7/5',1);
insert into scheduling(doctor,time,clinic) values(5,'2022/7/6',1);
insert into scheduling(doctor,time,clinic) values(5,'2022/7/7',1);
insert into scheduling(doctor,time,clinic) values(5,'2022/7/8',1);
insert into scheduling(doctor,time,clinic) values(5,'2022/7/9',1);

insert into scheduling(doctor,time,clinic) values(6,'2022/7/4',1);
insert into scheduling(doctor,time,clinic) values(6,'2022/7/5',3);
insert into scheduling(doctor,time,clinic) values(6,'2022/7/6',4);
insert into scheduling(doctor,time,clinic) values(6,'2022/7/7',3);
insert into scheduling(doctor,time,clinic) values(6,'2022/7/8',5);
insert into scheduling(doctor,time,clinic) values(6,'2022/7/9',6);

insert into scheduling(doctor,time,clinic) values(7,'2022/7/4',2);
insert into scheduling(doctor,time,clinic) values(7,'2022/7/5',7);
insert into scheduling(doctor,time,clinic) values(7,'2022/7/6',2);
insert into scheduling(doctor,time,clinic) values(7,'2022/7/7',2);
insert into scheduling(doctor,time,clinic) values(7,'2022/7/8',4);
insert into scheduling(doctor,time,clinic) values(7,'2022/7/9',2);

insert into scheduling(doctor,time,clinic) values(8,'2022/7/4',2);
insert into scheduling(doctor,time,clinic) values(8,'2022/7/5',4);
insert into scheduling(doctor,time,clinic) values(8,'2022/7/6',7);
insert into scheduling(doctor,time,clinic) values(8,'2022/7/7',2);
insert into scheduling(doctor,time,clinic) values(8,'2022/7/8',2);
insert into scheduling(doctor,time,clinic) values(8,'2022/7/9',2);

insert into scheduling(doctor,time,clinic) values(9,'2022/7/4',2);
insert into scheduling(doctor,time,clinic) values(9,'2022/7/5',2);
insert into scheduling(doctor,time,clinic) values(9,'2022/7/6',4);
insert into scheduling(doctor,time,clinic) values(9,'2022/7/7',7);
insert into scheduling(doctor,time,clinic) values(9,'2022/7/8',2);
insert into scheduling(doctor,time,clinic) values(9,'2022/7/9',2);

insert into scheduling(doctor,time,clinic) values(10,'2022/7/4',2);
insert into scheduling(doctor,time,clinic) values(10,'2022/7/5',2);
insert into scheduling(doctor,time,clinic) values(10,'2022/7/6',2);
insert into scheduling(doctor,time,clinic) values(10,'2022/7/7',4);
insert into scheduling(doctor,time,clinic) values(10,'2022/7/8',7);
insert into scheduling(doctor,time,clinic) values(10,'2022/7/9',2);

insert into scheduling(doctor,time,clinic) values(11,'2022/7/4',7);
insert into scheduling(doctor,time,clinic) values(11,'2022/7/5',1);
insert into scheduling(doctor,time,clinic) values(11,'2022/7/6',1);
insert into scheduling(doctor,time,clinic) values(11,'2022/7/7',1);
insert into scheduling(doctor,time,clinic) values(11,'2022/7/8',1);
insert into scheduling(doctor,time,clinic) values(11,'2022/7/9',1);

insert into scheduling(doctor,time,clinic) values(12,'2022/7/4',1);
insert into scheduling(doctor,time,clinic) values(12,'2022/7/5',7);
insert into scheduling(doctor,time,clinic) values(12,'2022/7/6',1);
insert into scheduling(doctor,time,clinic) values(12,'2022/7/7',1);
insert into scheduling(doctor,time,clinic) values(12,'2022/7/8',1);
insert into scheduling(doctor,time,clinic) values(12,'2022/7/9',1);

insert into scheduling(doctor,time,clinic) values(13,'2022/7/4',1);
insert into scheduling(doctor,time,clinic) values(13,'2022/7/5',1);
insert into scheduling(doctor,time,clinic) values(13,'2022/7/6',7);
insert into scheduling(doctor,time,clinic) values(13,'2022/7/7',1);
insert into scheduling(doctor,time,clinic) values(13,'2022/7/8',1);
insert into scheduling(doctor,time,clinic) values(13,'2022/7/9',1);

insert into scheduling(doctor,time,clinic) values(14,'2022/7/4',1);
insert into scheduling(doctor,time,clinic) values(14,'2022/7/5',1);
insert into scheduling(doctor,time,clinic) values(14,'2022/7/6',1);
insert into scheduling(doctor,time,clinic) values(14,'2022/7/7',7);
insert into scheduling(doctor,time,clinic) values(14,'2022/7/8',1);
insert into scheduling(doctor,time,clinic) values(14,'2022/7/9',1);

