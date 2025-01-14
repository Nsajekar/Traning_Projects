create database euronetdb;

use euronetdb;

create table catagory(
catagory_id int primary key auto_increment,
catagory_name varchar(50) not null
);

select * from catagory;

insert into catagory (catagory_name) values('Electronics');
insert into catagory (catagory_name) values('Cloths');
insert into catagory (catagory_name) values('Cosmetics');

commit;

create table Products(
Products_id int primary key auto_increment,
Products_Name varchar(50) not null,
Products_Price double,
catagory_id int,
constraint catagory_id_fk foreign key (catagory_id) references catagory(catagory_id) 
);

insert into Products (Products_Name,Products_Price,catagory_id) values('iphone 13',50000,1);
insert into Products (Products_Name,Products_Price,catagory_id) values('H&M tshirt',5500,2);
insert into Products (Products_Name,Products_Price,catagory_id) values('Fair & lovely',50,3);

select * from Products;














