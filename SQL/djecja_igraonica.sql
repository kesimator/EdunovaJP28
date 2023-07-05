# d:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < D:\EDUNOVA_vjezbe\djecja_igraonica.sql

drop database if exists djecja_igraonica;
create database djecja_igraonica;
use djecja_igraonica;

create table operater(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11) not null,
    email varchar(100) not null,
    lozinka varchar(50) not null
);

create table djelatnik(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11) not null,
    iban varchar(100) not null,
    radno_mjesto varchar(200) not null
);

create table posjeta(
    sifra int not null primary key auto_increment,
    datumVrijemeDolaska datetime not null,
    datumVrijemeOdlaska datetime not null,
    napomena varchar(200),
    djelatnik int,
    foreign key (djelatnik) references djelatnik(sifra)
);

create table usluga(
    sifra int not null primary key auto_increment,
    cijena decimal(5,2) not null,
    jedinica_mjere varchar(50) not null,
    kolicina int not null,
    naziv varchar(100) not null
);

create table usluga_posjeta(
    usluga int not null,
    foreign key (usluga) references usluga(sifra),
    posjeta int not null,
    foreign key (posjeta) references posjeta(sifra)
);

create table dijete(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    ime_roditelja varchar(50) not null,
    telefon_roditelja varchar(13)
);

create table dijete_posjeta(
    dijete int not null,
    foreign key (dijete) references dijete(sifra),
    posjeta int not null,
    foreign key (posjeta) references posjeta(sifra)
);

