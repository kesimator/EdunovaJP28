# d:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < D:\GitHubJP28\java\EdunovaJP28\KolokvijVjezbe\kolokvij_vjezba_2.sql

drop database if exists kolokvij_vjezba_2;
create database kolokvij_vjezba_2;
use kolokvij_vjezba_2;



create table svekar(
    sifra int not null primary key auto_increment,
    stilfrizura varchar(48),
    ogrlica int not null,
    asocijalno int not null
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    modelnaocala varchar(37),
    treciputa datetime not null,
    ekstrovertno bit not null,
    prviputa datetime,
    svekar int not null
);

create table decko(
    sifra int not null primary key auto_increment,
    indiferentno bit,
    vesta varchar(34),
    asocijalno bit not null
);

create table decko_zarucnica(
    sifra int not null primary key auto_increment,
    decko int not null,
    zarucnica int not null
);

create table zarucnica(
    sifra int not null primary key auto_increment,
    narukvica int,
    bojakose varchar(37) not null,
    novcica decimal(15,9),
    lipa decimal(18,5) not null,
    indiferentno bit not null
);

create table cura(
    sifra int not null primary key auto_increment,
    haljina varchar(33) not null,
    drugiputa datetime not null,
    suknja varchar(38),
    narukvica int,
    introvertno bit,
    majica varchar(40) not null,
    decko int
);

create table neprijatelj(
    sifra int not null primary key auto_increment,
    majica varchar(32),
    haljina varchar(43) not null,
    lipa decimal(16,8),
    modelnaocala varchar(49) not null,
    kuna decimal(12,6) not null,
    jmbag char(11),
    cura int
);

create table brat(
    sifra int not null primary key auto_increment,
    suknja varchar(47),
    ogrlica int not null,
    asocijalno bit not null,
    neprijatelj int not null
);




alter table prijatelj add foreign key (svekar) references svekar(sifra);
alter table decko_zarucnica add foreign key (decko) references decko(sifra);
alter table decko_zarucnica add foreign key (zarucnica) references zarucnica(sifra);
alter table cura add foreign key (decko) references decko(sifra);
alter table neprijatelj add foreign key (cura) references cura(sifra);
alter table brat add foreign key (neprijatelj) references neprijatelj(sifra);



-- 1. zadatak, s izradom tablice i ovoga prošlo 50-ak minuta
insert into neprijatelj(sifra,majica,haljina,lipa,modelnaocala,kuna,jmbag,cura)
values (1, 'Puma', 'Nema', 220.80, 'Sunčane naočale', 350.75, null, null);

insert into neprijatelj(sifra,majica,haljina,lipa,modelnaocala,kuna,jmbag,cura)
values (2, null, 'Nema', null, 'Sportske naočale', 172.39, null, null);

insert into neprijatelj(sifra,majica,haljina,lipa,modelnaocala,kuna,jmbag,cura)
values (3, null, 'Haljina za izlazak', null, 'Naočale za vožnju', 792.78, null, null);

insert into decko(sifra,indiferentno,vesta,asocijalno)
values (1, null, null, 1);

insert into decko(sifra,indiferentno,vesta,asocijalno)
values (2, 0, 'Nema', 0);

insert into decko(sifra,indiferentno,vesta,asocijalno)
values (3, 1, 'Tri veste', 1);

insert into cura(sifra,haljina,drugiputa,suknja,narukvica,introvertno,majica,decko)
values (1, 'Ljetna haljina', 2023-07-10, null, null, null, 'Široka majica', null);

insert into cura(sifra,haljina,drugiputa,suknja,narukvica,introvertno,majica,decko)
values (2, 'Večernja haljina', 2023-06-08, null, 2, null, 'Majica za plažu', 2);

insert into cura(sifra,haljina,drugiputa,suknja,narukvica,introvertno,majica,decko)
values (3, 'Nema', 2024-02-30, 'Dvije mini suknje', 5, null, 'Kratki top', null);

insert into zarucnica(sifra,narukvica,bojakose,novcica,lipa,indiferentno)
values (1, null, 'Crvena', null, 75.75, 1);

insert into zarucnica(sifra,narukvica,bojakose,novcica,lipa,indiferentno)
values (2, 2, 'Tamno smeđa', 350, 20, 0);

insert into zarucnica(sifra,narukvica,bojakose,novcica,lipa,indiferentno)
values (3, null, 'Plavuša', 207.89, 42.68, 0);

insert into decko_zarucnica(sifra,decko,zarucnica)
values (1, 1, 1);

insert into decko_zarucnica(sifra,decko,zarucnica)
values (2, 2, 2);

insert into decko_zarucnica(sifra,decko,zarucnica)
values (3, 3, 3);



-- 2. zadatak, nisam se držao KISS principa i sada sam na cca 1h10m
--insert into svekar(sifra,stilfrizura,ogrlica,asocijalno) values(1,null,0,1);
--insert into svekar(sifra,stilfrizura,ogrlica,asocijalno) values(2,null,1,0);
--insert into svekar(sifra,stilfrizura,ogrlica,asocijalno) values(3,null,3,0);
--insert into svekar(sifra,stilfrizura,ogrlica,asocijalno) values(4,null,2,1);
--insert into svekar(sifra,stilfrizura,ogrlica,asocijalno) values(5,null,1,0);


--insert into prijatelj(treciputa,svekar) values(2020-04-30, );

update prijatelj set treciputa='2020-04-30';



-- 3. zadatak
delete from brat where ogrlica <>14;



-- 4. zadatak, stavio sam naredbu u komentar da mi ne pokazuje u CMD
# select suknja from cura where drugiputa is null;



-- 6. zadatak
select a.vesta, a.asocijalno 
from decko a
left join decko_zarucnica b 		on a.sifra =b.decko 
where b.sifra is null;

-- 5. zadatak
select f.novcica, a.neprijatelj, b.haljina
from brat a
inner join neprijatelj b 		on b.sifra =a.neprijatelj 
inner join cura c 				on c.sifra =b.cura 
inner join decko d 				on d.sifra =c.decko 
inner join decko_zarucnica e	on d.sifra =e.decko 
inner join zarucnica f 			on f.sifra =e.zarucnica 
where c.drugiputa is not null and d.vesta like '%ba%'
order by b.haljina desc;

-- Sve zajedno cca 1h40m