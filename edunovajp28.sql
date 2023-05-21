

drop database if exists edunovajp28;
create database edunovajp28;
use edunovajp28;
create table smjer(
	sifra int not null primary key auto_increment,
	naziv varchar(50) not null,
	cijena decimal(18,2),
	upisnina decimal(18,2),
	trajanje int not null,
	verificiran boolean
);


create table grupa(
	sifra int not null primary key auto_increment,
	naziv varchar(50) not null,
	smjer int not null,
    foreign key (smjer) references smjer(sifra),
	max_polaznika int,
	predavac int,
	datum_pocetka datetime
);

create table osoba(
	sifra int not null primary key auto_increment,
	ime varchar(50) not null,
	prezime varchar(50) not null,
	oib char(11),
	email varchar(100)
);

create table polaznik(
	sifra int not null primary key auto_increment,
	broj_ugovora varchar(20),
	osoba int not null,
    foreign key (osoba) references osoba(sifra)
);

create table predavac(
	sifra int not null primary key auto_increment,
	iban varchar(50),
	osoba int not null,
    foreign key (osoba) references osoba(sifra)
);

create table clan(
	grupa int not null,
    foreign key (grupa) references grupa(sifra),
	polaznik int not null,
    foreign key (polaznik) references polaznik(sifra)
);

