# d:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < D:\EDUNOVA_vjezbe\hijerarhija.sql

drop database if exists hijerarhija;
create database hijerarhija;
use hijerarhija;

create table zaposlenik(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    placa decimal(10,2),
    nadredeni int,
    foreign key (nadredeni) references zaposlenik(sifra)
    # uklanja potrebu za alter table add
    # zamjena za alter table zaposlenik add foreign key (nadredeni) references zaposlenik(sifra)
    # treba paziti na redoslijed u tom slučaju, treba paziti na raspored tablica
);
