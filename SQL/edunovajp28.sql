# d:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < 

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

-- alter table clan add foreign key (polaznik) references polaznik(sfira);
-- ovo je još jedan način unosa FK, u ovom slučaju ne treba paziti na raspored tablica



-- najlošija verzija insert naredbe
-- 1
insert into smjer values
(null, 'Java programiranje ŠČ', 995.42, 73, 130, true);

-- malo bolji način unosa
-- 2
insert into smjer (naziv, trajanje) values
('Web programiranje', 250);

-- primjer dobre prakse (best practice)
-- 3
insert into smjer (sifra, naziv, cijena, upisnina, trajanje, verificiran) values
(null, 'PHP programiranje', 850, 73, 130, false);



insert into osoba (sifra, ime, prezime, oib, email)
values 
-- 1 označava šifru pod kojom će biti predavač
(null, 'Tomislav','Jakopec', null, 'tjakopec@gmail.com'),
-- 2 do 26 označavaju šifre pod kojima će biti polaznici, iako će početi normalno rednim brojem od 1
(null, 'Denis','Simov', null, 'dsimov19@gmail.com'),
(null, 'Ivan','Islentiev', null, 'ivanislentiev@hotmail.com'),
(null, 'Antonio','Majić', null, 'antonio.majich@gmail.com'),
(null, 'Kristi','Belić', null, 'kristinovoselic@gmail.com'),
(null, 'Josip','Belić', null, 'josip.belic989@gmail.com'),
(null, 'Ivan','Marošević', null, 'ivanmarosevic4@gmail.com'),
(null, 'Damir','Sučić', null, 'dsucic7@gmail.com'),
(null, 'Dino','Dješka', null, 'dino.djeska@gmail.com'),
(null, 'Goran','Kovačić', null, 'kovacic.go@gmail.com'),
(null, 'Luka','Lijić', null, 'lukalijic8@gmail.com'),
(null, 'Antonio','Miloloža', null, 'milolozaantonio@yahoo.com'),
(null, 'Marijan','Kešinović', null, 'kesinovic957@gmail.com'),
(null, 'Ivan','Kuna', null, 'ivan.kuna@yahoo.com'),
(null, 'Maksimilian','Bagarić', null, 'maxbagaric@gmail.com'),
(null, 'Martin','Tetković', null, 'marcatet001@gmail.com'),
(null, 'Vjeran','Šergo', null, 'vjeran.sergo@gmail.com'),
(null, 'Filip','Čatić', null, 'fcatic031@gmail.com'),
(null, 'Petar','Matić', null, 'petarmatic00@gmail.com'),
(null, 'Branimir','Fekete', null, 'branimir.fekete@gmail.com'),
(null, 'Lazar','Volarev', null, 'lazarv79@gmail.com'),
(null, 'Adriana','Plečaš', null, 'adriana.plecas@gmail.com'),
(null, 'Goran','Franjić', null, 'goran@proces.hr'),
(null, 'Marko','Ivanović', null, 'markoivanovic19@gmail.com'),
(null, 'Emina','Vejsilović', null, 'emiomiemi@gmail.com'),
(null, 'Ana','Jurić', null, 'ana.juric19@gmail.com'),
(null, 'Michael','Schumacher', null, null),
(null, 'Mika','Hakkinen', null, null),
(null, 'Sebastian','Vettel', null, null);



-- 1
insert into predavac (osoba) values (1);

-- 1 do 25 su redni brojevi, a vrijednosti (values) počinju od 2 jer je to šifra s kojom počinje
insert into polaznik (osoba) values
(2),(3),(4),(5),(6),(7),(8),(9),(10),
(11),(12),(13),(14),(15),(16),(17),(18),(19),(20),
(21),(22),(23),(24),(25),(26),(27),(28),(29);



-- 1 označava smjer, znači imamo 3 smjera, 1. je Java programiranje, 2. je Web programiranje, 3. je PHP programiranje, pa unosimo redom
-- i ponavljamo insert naredbu da bi unijeli potrebne podatke, smjerovi su šifre, odnosno vanjski ključ u entitetu grupa
insert into grupa (naziv, smjer, max_polaznika, predavac)
values ('JP28', 1, 25, 1);

-- 2 označava šifru smjera Web programiranje, koji je u entitetu smjer pod šifrom broj 2
insert into grupa (naziv, smjer, max_polaznika, predavac)
values ('WP1', 2, 25, 1);



-- u grupi imamo dvije šifre, prva je JP28 i druga je WP1, a polaznik ne zaboravimo normalno kreće od šifre 1 do 25,
-- a u osobi se nalazi pod šifrom 2 do 26
insert into clan (grupa, polaznik) values
(1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(1,7),
(1,8),(1,9),(1,10),(1,11),(1,12),(1,13),
(1,14),(1,15),(1,16),(1,17),(1,18),(1,19),
(1,20),(1,21),(1,22),(1,23),(1,24),(1,25);



-- vježbanje:
-- 1. Unijeti smjer Serviser
-- 2. Na Serviseru definirati dvije grupe (S1 i S2)
-- 3. Na S2 postaviti 3 nova polaznika (koje ste prethodno unijeli)

-- Domaća zadaća:
-- U sve baze koje ste kreirali na osnovu zadatka ERA osnovno unijeti u svaku tablicu po 3 - 5 redova



-- vježbanje 1. zadatak: 4 jer će biti šifra 4 u smjeru
insert into smjer (naziv) values ('Serviser');

-- vježbanje 2. zadatak: dodali smo dvije grupe, S1 je pod šifrom 3, a S2 pod šifrom 4 u ovom slučaju,
-- unijeli smo za prvu grupu (Java programiranje) smjer JP28 koji je pod šifrom 1,
-- unijeli smo za drugu grupu (Web programiranje) smjer WP1 koji je pod šifrom 2,
-- za treću grupu (PHP programiranje) nismo unosili išta, tako da je nastavak šifra 3 pod koju spada S1 i šifra 4 pod koju spada S2
insert into grupa (naziv, smjer) values ('S1', 4), ('S2', 4);

-- vježbanje 3. zadatak: morali smo prvo dodati 3 nove osobe, zatim dodati u polaznike (osoba) values (27,28,29),
--tek onda ovu naredbu unijeti i izvršiti, a u values smo stavili 4 jer je grupa pod šifrom broj 4,
-- a polaznike pod broj 26,27,28 jer polaznik počinje sa šifrom 1, a u osobi se nalazi pod šifrom 2, te zato ide broj manje
insert into clan (grupa, polaznik) values
(4,26),(4,27),(4,28);



-- PROMJENA PODATAKA

--select * from smjer;

-- ne izvoditi update bez where dijela update naredbe

-- naredba za DBeaver je: select * from smjer; 

update smjer set naziv='Java programiranje'
where sifra=1;

-- web programiranje cijena je 1000 eur i upisnina 50 eur
update smjer set 
cijena=1000,
upisnina=50
where sifra=2;

-- svim smjerovima smanji cijenu za 10%
update smjer set cijena=cijena*0.9;

-- uvećaj cijenu svim smjerovima za 10 eur
update smjer set cijena=cijena+10;

-- VJEŽBA
-- select * from osoba;
-- Kristi se odluči rastati želi 
-- vratiti svoje prezime Novoselić
-- PROVEDITE TO

-- VJEŽBA RJEŠENJE:
-- select * from osoba;

--update osoba set prezime='Novoselić'
--where sifra=5;

-- šifra je 5 jer se nalazi u osoba, da se nalazi u polaznik bila bi šifra 4



-- vanjski ključ 55 ne postoji kao primarni ključ 55 u tablici smjer
-- update grupa set smjer=55 where sifra=1;


-- BRISANJE PODATAKA

-- DELETE naredbe su u komentarima da nam ne pobrišu podatke, koristimo ovaj tip umjesto kaskade (cascade |) jer je sigurnije
-- delete from clan where grupa=1;
-- delete from grupa where smjer=1;
-- delete from smjer where sifra=1;

-- DELETE naredbe smo pisali od dna prema gore, prva naredba je bila zadnja (delete from smjer where sifra=1;),
-- izbacilo je sintaksu da ne možemo dok ne obrišemo prvo grupu zbog FK, pa smo išli to, opet ista stvar dok ne obrišemo clan zbog FK,
-- tek onda je prihvatilo pa smo išli redom, prvo proveli naredbu od gore prema dolje i obrisali

-- sve ovo u komentarima je uspješno testirano i provedeno kroz DBeaver




# 24.05.2023.
# do sada smo radili
select * from smjer;

# minimalna forma select naredbe
select 1;

# filtriranje kolona
select naziv, cijena from smjer;

select naziv, sifra, naziv from smjer;

select *, naziv from smjer;

# select lista
# 1. * sve kolone
# 2. naziv kolone
# 3. konstanta

select naziv, 'Osijek' from smjer;

# svakoj koloni se može dati zamjensko ime

select naziv as smjer, 'Osijek' as grad from smjer;

# 4. izraz

select naziv, now() as datum from smjer;
# select naziv, now() as datum, 2 as velicina, 66.22 as cijena from smjer;

# ispišite imena i prezimena osoba
select ime, prezime from osoba;

# filtriranje redova
select * from osoba;

# koristimo operatore
# 1. operatori uspoređivanja
# = < > <= >= !=
select * from osoba where sifra=1;

select * from osoba where sifra>=10;

# 2. logički operatori - bool-ovi operatori
# and or not     -> https://i.ytimg.com/vi/7dvqfpXEjdg/maxresdefault.jpg

select * from osoba where sifra>1 and sifra <3;

select * from osoba where sifra=2 or sifra=3;

select * from osoba where not (sifra>3 and sifra<9);
# kao u matematici, prvo se izvodi ono što je u zagradi, onda ide ono prije
# umjesto da izbaci od 4 do 8, izbacit će sve osim toga zbog not

# Izlistajte mi imena i prezimena svih osoba koje se ne zovu Antonio
select * from osoba where not (ime='Antonio');

select ime, prezime from osoba where ime!='Antonio';

select ime, prezime from osoba where not ime='Antonio';

# 3. ostali operatori
# like (ne FB like, nego like kao slično)
# % je bilo što prije ili poslije

select * from osoba where ime like 'A%';

select * from osoba where ime not like 'A%';

select * from osoba where ime like '%a';

-- google način pretraživanja
select * from osoba where ime not like '%a%';

# operator between - upogoni logički and s uključenim vrijednostima
select * from osoba where sifra>=3 and sifra<=5;

select * from osoba where sifra between 3 and 5;

# operator in - upogoni logički or
select * from osoba where sifra=2 or sifra=6 or sifra=9;

select * from osoba where sifra in (2,6,9);

# postavite sebi svoj OIB

update osoba set oib='82033178312'
where sifra=13;

# izlistajte sve osobe koje imaju oib

# operatori is null i is not null

select * from osoba where oib is not null;

# unesite osobu Shaquille O'Neal

# sve verzije baza (jednostruki navodnici)
insert into osoba(ime, prezime) values ('Shaquille', 'O\'Neal');

# ili

insert into osoba(ime, prezime) values ("Shaquille", "O'Neal");

select * from osoba where ime like 'S%';

# novije verzije baza dozvoljavaju "
# insert into osoba (ime,prezime)
# values ("Shaquille","O'Neal");

# select * from osoba where ime like 'S%';

# sve verzije baza
# insert into osoba (ime,prezime)
# values ('Shaquille','O\'Neal');



