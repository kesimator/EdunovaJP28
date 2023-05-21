# d:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < D:\EDUNOVA_vjezbe\university.sql

drop database if exists university;
create database university;
use university;

create table student(
    id int not null primary key auto_increment,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    jmbag char(19) not null
);

create table course(
    id int not null primary key auto_increment,
    name varchar(200) not null,
    ects char(3) not null,
    description varchar(1000) not null
);

create table academic_year(
    id int not null primary key auto_increment,
    name varchar(200) not null,
    start_date date not null,
    end_date date not null
);

create table student_course(
    id int not null primary key auto_increment,
    date_of_ending date not null,
    student int not null,
    foreign key (student) references student(id),
    course int not null,
    foreign key (course) references course(id),
    academic_year int not null,
    foreign key (academic_year) references academic_year(id)
);

