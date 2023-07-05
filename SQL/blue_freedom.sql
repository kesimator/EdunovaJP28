# d:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < D:\EDUNOVA_vjezbe\blue_freedom.sql

drop database if exists blue_freedom;
create database blue_freedom;
use blue_freedom;

create table operater(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    email varchar(100) not null,
    lozinka varchar(50) not null,
    uloga varchar(200)
);

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    datum_rodenja date not null,
    email varchar(100) not null,
    lozinka varchar(50) not null,
    broj_tel int,
    administrator boolean,
    stanje boolean,
    aktivan boolean,
    uniqueid varchar(100)
);

create table objava(
    sifra int not null primary key auto_increment,
    naslov varchar(200) not null,
    upis varchar(1000),
    vrijeme_izrade datetime not null,
    ip_adresa varchar(12) not null,
    osoba int not null,
    foreign key (osoba) references osoba(sifra)
);

create table svida_mi_se(
    sifra int not null primary key auto_increment,
    vrijeme_svidanja datetime not null,
    objava int not null,
    foreign key (objava) references objava(sifra),
    osoba int not null,
    foreign key (osoba) references osoba(sifra)
);

create table komentar(
    sifra int not null primary key auto_increment,
    vrijeme_komentiranja datetime not null,
    opis varchar(1000),
    objava int not null,
    foreign key (objava) references objava(sifra),
    osoba int not null,
    foreign key (osoba) references osoba(sifra)
);

create table svida_mi_se_komentar(
    sifra int not null primary key auto_increment,
    osoba int not null,
    foreign key (osoba) references osoba(sifra),
    komentar int not null,
    foreign key (komentar) references komentar(sifra)
);

