# d:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < D:\GitHubJP28\java\EdunovaJP28\KolokvijVjezbe\kolokvij_vjezba_4.sql

drop database if exists kolokvij_vjezba_4;
create database kolokvij_vjezba_4;
use kolokvij_vjezba_4;



create table punac(
    sifra int not null primary key auto_increment,
    treciputa datetime,
    majica varchar(46),
    jmbag char(11) not null,
    novcica decimal(18,7) not null,
    maraka decimal(12,6) not null,
    ostavljen int not null
);

create table ostavljen(
    sifra int not null primary key auto_increment,
    modelnaocala varchar(43),
    introvertno bit,
    kuna decimal(14,10)
);

create table zena(
    sifra int not null primary key auto_increment,
    suknja varchar(39) not null,
    lipa decimal(18,7),
    prstena int not null
);

create table zena_mladic(
    sifra int not null primary key auto_increment,
    zena int not null,
    mladic int not null
);

create table mladic(
    sifra int not null primary key auto_increment,
    kuna decimal(15,9),
    lipa decimal(18,5),
    nausnica int,
    stilfrizura varchar(49),
    vesta varchar(34) not null
);

create table snasa(
    sifra int not null primary key auto_increment,
    introvertno bit,
    treciputa datetime,
    haljina varchar(44) not null,
    zena int not null
);

create table becar(
    sifra int not null primary key auto_increment,
    novcica decimal(14,8),
    kratkamajica varchar(48) not null,
    bojaociju varchar(36) not null,
    snasa int not null
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    eura decimal(16,9),
    prstena int not null,
    gustoca decimal(16,5),
    jmbag char(11) not null,
    suknja varchar(47) not null,
    becar int not null
);



alter table punac add foreign key (ostavljen) references ostavljen(sifra);
alter table zena_mladic add foreign key (zena) references zena(sifra);
alter table zena_mladic add foreign key (mladic) references mladic(sifra);
alter table snasa add foreign key (zena) references zena(sifra);
alter table becar add foreign key (snasa) references snasa(sifra);
alter table prijatelj add foreign key (becar) references becar(sifra);

-- 0. zadatak 13 minuta


-- 1. zadatak 20 minuta
insert into zena(suknja) values('Kratka');
insert into zena(suknja) values('Duga');
insert into zena(suknja) values('Mini');



insert into mladic(vesta) values('Timberland');
insert into mladic(vesta) values('Galileo');
insert into mladic(vesta) values('Williams');



insert into zena_mladic(zena,mladic) values(1,1);
insert into zena_mladic(zena,mladic) values(2,2);
insert into zena_mladic(zena,mladic) values(3,3);


insert into snasa(haljina, zena)
values('Ljetna', 1);
insert into snasa(haljina, zena)
values('Večernja', 2);
insert into snasa(haljina, zena)
values('Svečana', 3);



insert into becar(kratkamajica,bojaociju,snasa)
values('Nike', 'Plava', 1);
insert into becar(kratkamajica,bojaociju,snasa)
values('Puma', 'Smeđa', 2);
insert into becar(kratkamajica,bojaociju,snasa)
values('Adidas', 'Zelena', 3);





//* 2. zadatak 
update punac set majica='Osijek';


 3. zadatak
delete from prijatelj where prstena>17;



4. zadatak 25 minuta
select haljina from snasa where treciputa is null;

6. zadatak 29 minuta
select a.lipa, a.prstena
from zena a
left join zena_mladic b 	on a.sifra =b.zena 
where b.sifra is null;

5. zadatak 34 minute
select f.nausnica, a.jmbag, b.kratkamajica 
from prijatelj a
inner join becar b 				on b.sifra =a.becar 
inner join snasa c 				on c.sifra =b.snasa 
inner join zena d 				on d.sifra =c.zena 
inner join zena_mladic e 		on d.sifra =e.zena 
inner join mladic f 			on f.sifra =e.mladic 
where c.treciputa is not null and d.lipa <>29
order by b.kratkamajica desc;

Zadatak gotov za 34 minute.
*//

