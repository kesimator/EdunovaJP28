# d:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < D:\EDUNOVA_vjezbe\regionalna_samouprava.sql


drop database if exists regionalna_samouprava;
create database regionalna_samouprava;
use regionalna_samouprava;

create table zupan(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null
);

create table zupanija(
    sifra int not null primary key auto_increment,
    naziv varchar(100) not null,
    zupan int not null,
    foreign key (zupan) references zupan(sifra)
);

create table opcina(
    sifra int not null primary key auto_increment,
    naziv varchar(100) not null,
    zupanija int not null,
    foreign key (zupanija) references zupanija(sifra)
);

create table mjesto(
    sifra int not null primary key auto_increment,
    naziv varchar(100) not null,
    opcina int not null,
    foreign key (opcina) references opcina(sifra)
);



-- 1 (select * from zupan;), župani su šifra 1, 2, 3
insert into zupan (sifra, ime, prezime) values
(null, 'Boris', 'Miletić'),
(null, 'Božidar', 'Longin'),
(null, 'Marko', 'Jelić');



-- županije su pod šifrom 1, 2, 3
insert into zupanija (sifra, naziv, zupan) values
(null, 'Istarska', 1),
(null, 'Zadarska', 2),
(null, 'Šibensko-kninska', 3);



-- šifre su sada 1-18, odnosno 1-6 za Istarsku, 7-12 za Zadarsku i 13-18 za Šibensko-kninsku, a šifre označavaju imena općina
insert into opcina (sifra, naziv, zupanija) values
(null, 'Funtana', 1), (null, 'Sveta Nedelja', 1), (null, 'Svetvinčenat', 1),
(null, 'Tinjan', 1), (null, 'Žminj', 1), (null, 'Kanfanar', 1),

(null, 'Pašman', 2), (null, 'Polača', 2), (null, 'Sukošan', 2),
(null, 'Škabrnja', 2), (null, 'Vir', 2), (null, 'Kali', 2),

(null, 'Biskupija', 3), (null, 'Kijevo', 3), (null, 'Ervenik', 3),
(null, 'Primošten', 3), (null, 'Tisno', 3), (null, 'Ružić', 3);



-- nisam mogao unijeti 12 mjesta, odnosno gradova, jer Šibensko-kninska županija ima samo 5 gradova, pa sam sve unosio po 5
insert into mjesto (sifra, naziv, opcina) values
(null, 'Buje-Buie', 1), (null, 'Novigrad-Cittanova', 2), (null, 'Umag-Umago', 3),
(null, 'Buzet', 4), (null, 'Labin', 5), -- višak (null, 'Pazin', 6),
-- višak (null, 'Poreč-Parenzo', null), (null, 'Pula-Pola', null), (null, 'Rovinj-Rovigno', null), (null, 'Vodnjan-Dignano', null),

(null, 'Benkovac', 7), (null, 'Biograd na Moru', 8), (null, 'Nin', 9),
(null, 'Obrovac', 10), (null, 'Pag', 11), -- višak (null, 'Zadar', 12),

(null, 'Drniš', 13), (null, 'Knin', 14), (null, 'Skradin', 15),
(null, 'Šibenik', 16), (null, 'Vodice', 17);



-- mijenjanje 5 mjesta, sve stavljam u komentar, provjereno kroz DBeaver
--update mjesto set naziv='Pazin'
--where sifra=1;

--update mjesto set naziv='Zadar'
--where sifra=7;

--update mjesto set naziv='Poreč-Parenzo'
--where sifra=4;

--update mjesto set naziv='Rovinj-Rovigno'
--where sifra=5;

--update mjesto set naziv='Vodnjan-Dignano'
--where sifra=3;



-- brisanje dvije općine, opet naredbe čitamo odozdo prema gore kako smo krenuli, a izvršavaju se odozgo prema dolje
-- s ovime ipak imam problema, potrebna pomoć