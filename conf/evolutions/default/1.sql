# --- !Ups
create table reserve (
  id int auto_increment primary key,
  room varchar(30) not null,
  date varchar(30) not null,
  time varchar(30) not null,
  name varchar(100) not null,
  sec varchar(50) not null,
  pri varchar(30) not null,
);
insert into reserve values (default, '地下会議室101', 20191011,'10:00-11:00','Donna Moss','総務部','変更不可');
insert into reserve values (default, '4階会議室401', 20191023,'13:00-14:00','大前春子','営業本部','変更可');
insert into reserve values (default, '6階会議室602', 20191105,'14:00-15:00','海野玲香','広報部','変更可');

# --- !Downs
drop table reserve