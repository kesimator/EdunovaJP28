# d:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < 

drop database if exists kolokvij_vjezba_3;
create database kolokvij_vjezba_3;
use kolokvij_vjezba_3;



create table cura(
    sifra int not null primary key auto_increment,
    dukserica varchar(49),
    maraka decimal(13,7),
    drugiputa datetime,
    majica varchar(49),
    novcica decimal(15,8),
    ogrlica int not null
);

create table svekar(
    sifra int not null primary key auto_increment,
    novcica decimal(15,8) not null,
    suknja varchar(44) not null,
    bojakose varchar(36),
    prstena int,
    narukvica int not null,
    cura int not null
);

create table brat(
    sifra int not null primary key auto_increment,
    jmbag char(11),
    ogrlica int not null,
    ekstrovertno bit not null
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    kuna decimal(16,10),
    haljina varchar(37),
    lipa decimal(13,10),
    dukserica varchar(31),
    indiferentno bit not null
);

create table prijatelj_brat(
    sifra int not null primary key auto_increment,
    prijatelj int not null,
    brat int not null
);

create table ostavljena(
    sifra int not null primary key auto_increment,
    kuna decimal(17,5),
    lipa decimal(15,6),
    majica varchar(36),
    modelnaocala varchar(31) not null,
    prijatelj int
);

create table snasa(
    sifra int not null primary key auto_increment,
    introvertno bit,
    kuna decimal(15,6) not null,
    eura decimal(12,9) not null,
    treciputa datetime,
    ostavljena int not null
);

create table punica(
    sifra int not null primary key auto_increment,
    asocijalno bit,
    kratkamajica varchar(44),
    kuna decimal(13,8) not null,
    vesta varchar(32) not null,
    snasa int
);



alter table svekar add foreign key (cura) references cura(sifra);
alter table prijatelj_brat add foreign key (prijatelj) references prijatelj(sifra);
alter table prijatelj_brat add foreign key (brat) references brat(sifra);
alter table ostavljena add foreign key (prijatelj) references prijatelj(sifra);
alter table snasa add foreign key (ostavljena) references ostavljena(sifra);
alter table punica add foreign key (snasa) references snasa(sifra);



-- 1. zadatak 30m
insert into prijatelj(sifra, kuna, haljina, lipa, dukserica, indiferentno)
values(1, null, null, null, null, 1);
insert into prijatelj(sifra, kuna, haljina, lipa, dukserica, indiferentno)
values(2, 301.38, 'Haljina za predstavu', 40, 'Dvije Nike dukserice', 1);
insert into prijatelj(sifra, kuna, haljina, lipa, dukserica, indiferentno)
values(3, 15274.84, null, null, null, 0);



insert into brat(sifra, jmbag, ogrlica, ekstrovertno)
values(1, null, 2, 0);
insert into brat(sifra, jmbag, ogrlica, ekstrovertno)
values(2, null, 5, 1);
insert into brat(sifra, jmbag, ogrlica, ekstrovertno)
values(3, null, 0, 1);



insert into prijatelj_brat(sifra, prijatelj, brat)
values(1, 1, 1);
insert into prijatelj_brat(sifra, prijatelj, brat)
values(2, 2, 2);
insert into prijatelj_brat(sifra, prijatelj, brat)
values(3, 3, 3);



insert into ostavljena(sifra, kuna, lipa, majica, modelnaocala, prijatelj)
values(1, null, null, null, 'Dioptrijske naočale', null);
insert into ostavljena(sifra, kuna, lipa, majica, modelnaocala, prijatelj)
values(2, 2730.41, null, 'Dvije Puma majice', 'Sunčane naočale', 1);
insert into ostavljena(sifra, kuna, lipa, majica, modelnaocala, prijatelj)
values(3, null, 50, null, 'Sportske naočale', 2);



insert into snasa(sifra, introvertno, kuna, eura, treciputa, ostavljena)
values(1, 1, 1883.62, 250, null, 1);
insert into snasa(sifra, introvertno, kuna, eura, treciputa, ostavljena)
values(2, 0, 450, 59.725264, null, 2);
insert into snasa(sifra, introvertno, kuna, eura, treciputa, ostavljena)
values(3, 0, 553.93, 73.52, null, 3);



-- 2. zadatak* Je li to dobro?
-- update svekar set suknja='Osijek';



-- 3. zadatak
-- delete from punica where kratkamajica='AB';



-- 4. zadatak
-- select majica from ostavljena; where lipa not in (9,10,20,30,35);



-- 6. zadatak
-- select a.haljina, a.lipa
-- from prijatelj a
-- left join prijatelj_brat b 		on a.sifra =b.prijatelj 
-- where b.sifra is null;



-- 5. zadatak
-- select f.ekstrovertno, a.vesta, b.kuna
-- from punica a
-- inner join snasa b 				on b.sifra =a.snasa 
-- inner join ostavljena c 		on c.sifra =b.ostavljena 
-- inner join prijatelj d 			on d.sifra =c.prijatelj 
-- inner join prijatelj_brat e 	on d.sifra =e.prijatelj 
-- inner join brat f 				on f.sifra =e.brat 
-- where c.lipa <>91 and d.haljina like '%b%a%'
-- order by b.kuna desc;

-- Gotovo za 52m