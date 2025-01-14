create database Lmsdb;
use Lmsdb;
create table member_details (
menber_id int primary key auto_increment,
member_firstname varchar(30) not null,
member_lastname varchar(30)not null,
member_type varchar(30) not null

);
select * from member_details;

insert into member_details(member_firstname,member_lastname,member_type) 
values ('Nitesh','Sajekar','Student');
insert into member_details(member_firstname,member_lastname,member_type) 
values ('Charan','Shetty','Faculty');
insert into member_details(member_firstname,member_lastname,member_type) 
values ('Ibrahim','Khan','Student');
insert into member_details(member_firstname,member_lastname,member_type) 
values ('kiran','Salunkhe','Student');
insert into member_details(member_firstname,member_lastname,member_type) 
values ('Karan','Shekhavat','Faculty');


create table book_details (
book_id int primary key auto_increment,
book_name varchar(30) not null,
book_authers varchar(30)not null,
book_status varchar(30) not null
);
insert into book_details(book_name,book_authers,book_status) 
values ('Harry potter','j.k.rowling','Available');
insert into book_details(book_name,book_authers,book_status) 
values ('Bahubali','Raja mauli','Available');
insert into book_details(book_name,book_authers,book_status) 
values ('Sacred games','Bunty','Available');
insert into book_details(book_name,book_authers,book_status) 
values ('Marvels','Stan lee','Assigned');
insert into book_details(book_name,book_authers,book_status) 
values ('DC','Warner bros','Assigned');

select * from book_details;


create table issue_details(
issue_id int primary key auto_increment,
issued_date date not null,
return_date date not null,
book_id int,
menber_id int,
constraint book_id_fk foreign key (book_id) references book_details(book_id),
constraint member_id_fk foreign key (menber_id) references member_details(menber_id)
);
insert into issue_details(issued_date,return_date,book_id,menber_id) 
values ('2022-05-02','2022-05-10',1,3);
insert into issue_details(issued_date,return_date,book_id,menber_id) 
values ('2022-05-02','2022-05-10',2,4);
insert into issue_details(issued_date,return_date,book_id,menber_id) 
values ('2022-05-02','2022-05-10',3,2);
commit;


select * from issue_details;
drop database lmsdb;

create database lmsdb;

use lmsdb;

create table book_details(
book_code int primary key auto_increment,
title varchar(255) not null,
auther varchar(255) not null,
price double  not null,
is_issuable boolean not null
);

insert into book_details(title,auther,price,is_issuable) values ('C Programming','Yashvant Kanetkar',150,true);

select * from book_details;

create table member_details(
member_code int primary key auto_increment,
first_name varchar(255) not null,
last_name varchar(255)not null,
member_type varchar(100) not null,
book_issue_count int not null
);
insert into member_details(first_name,last_name,member_type,book_issue_count) 
values ('Nitesh','Sajekar','Student',0);

select * from member_details;

create table book_issue_details(
issue_serial_number int primary key auto_increment,
issue_date date not null,
return_date date not null,
book_code int not null,
member_code int not null,
constraint book_code_fk foreign key (book_code) references book_details(book_code),
constraint member_code_fk foreign key (member_code) references member_details(member_code)
);

insert into book_issue_details(issue_date,return_date,book_code,member_code) values ('2022-01-10','2022-01-18',1,1);

select * from book_issue_details;

select * 
from book_issue_details bid
join book_details bd
join member_details md
on bid.book_code = bd.book_code
and
bid.member_code = md.member_code;








