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




