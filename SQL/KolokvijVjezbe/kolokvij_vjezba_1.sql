# d:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < 

drop database if exists kolokvij_vjezba_1;
create database kolokvij_vjezba_1;
use kolokvij_vjezba_1;

create table punac(
    sifra int not null primary key auto_increment,
    ogrlica int,
    gustoca decimal(14,9),
    hlace varchar(41) not null
);

create table cura(
    sifra int not null primary key auto_increment,
    novcica decimal(16,5) not null,
    gustoca decimal(18, 6) not null,
    lipa decimal(13, 10),
    ogrlica int not null,
    bojakose varchar(38),
    suknja varchar(36),
    punac int
);

create table sestra(
    sifra int not null primary key auto_increment,
    introvertno bit,
    haljina varchar(31) not null,
    maraka decimal(16,6),
    hlace varchar(46) not null,
    narukvica int not null
);

create table zena(
    sifra int not null primary key auto_increment,
    treciputa datetime,
    hlace varchar(46),
    kratkamajica varchar(31) not null,
    jmbag char(11) not null,
    bojaociju varchar(39) not null,
    haljina varchar(44),
    sestra int not null
);

create table muskarac(
    sifra int not null primary key auto_increment,
    bojaociju varchar(50) not null,
    hlace varchar(30),
    modelnaocala varchar(43),
    maraka decimal(14,5) not null,
    zena int not null
);

create table mladic(
    sifra int not null primary key auto_increment,
    suknja varchar(50) not null,
    kuna decimal(16,8) not null,
    drugiputa datetime,
    asocijalno bit,
    ekstrovertno bit not null,
    dukserica varchar(48) not null,
    muskarac int
);

create table svekar(
    sifra int not null primary key auto_increment,
    bojaociju varchar(40) not null,
    prstena int,
    dukserica varchar(41),
    lipa decimal(13,8),
    eura decimal(12,7),
    majica varchar(35)
);

create table sestra_svekar(
    sifra int not null primary key auto_increment,
    sestra int not null,
    svekar int not null
);



alter table cura add foreign key (punac) references punac(sifra);
alter table zena add foreign key (sestra) references sestra(sifra);
alter table muskarac add foreign key (zena) references zena(sifra);
alter table mladic add foreign key (muskarac) references muskarac(sifra);
alter table sestra_svekar add foreign key (sestra) references sestra(sifra);
alter table sestra_svekar add foreign key (svekar) references svekar(sifra);



-- 2. zadatak
insert into cura(gustoca)
values (15.77);

-- 3. zadatak
delete from mladic
where kuna>15.78;

-- 4. zadatak, više izvedbi jedne naredbe
select kratkamajica from zena where hlace like '%ana%';
-- select * from zena where kratkamajica is not null and hlace like '%ana%';


-- 6. zadatak
select a.haljina, a.maraka 
from sestra a
left join sestra_svekar b 	on a.sifra =b.sestra 
where b.sestra is null;

-- 5. zadatak
select f.dukserica, a.asocijalno, b.hlace
from mladic a
inner join muskarac b 		on b.sifra =a.muskarac 
inner join zena c 			on c.sifra =b.zena 
inner join sestra d 		on d.sifra = c.sestra 
inner join sestra_svekar e 	on d.sifra = e.sestra 
inner join svekar f 		on f.sifra = e.svekar 
where c.hlace like 'a%' and d.haljina like '%ba%'
order by b.hlace desc;

-- Trebalo je 1h26m

-- 1. zadatak me zbunio. 1. U tablice muskarac, zena i sestra_svekar unesite po 3 retka
-- Kada sam izradio sve tablice i krenuo čitati zadatke, pomislio sam da nisam trebao sve atribute unositi,
-- već samo po 3 atributa pa sam ostavio sve kada je već bilo izrađeno, da bih tek u 2. vježbi shvatio
-- da se 1. zadatak zapravo odnosi na unos vrijednosti.