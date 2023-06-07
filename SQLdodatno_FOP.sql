select * from smjer;

select ime from osoba order by ime; # ne mora se pisati asc

select ime from osoba order by ime desc;

select ime, prezime from osoba order by 2;

select distinct ime from osoba order by ime desc;

select ime from osoba order by ime desc limit 10; # prvih 10

select ime from osoba order by ime desc limit 0,10; # prvih 10

select ime from osoba order by ime desc limit 10,10; # drugih 10

# dodavanje kolone tablici
alter table smjer add iznos decimal(18,2);

select * from smjer;

select rand(); 

update smjer set iznos=rand()*1000;

#zabraniti nepoznavanje dodatka
alter table smjer MODIFY column iznos decimal(18,2) not null;

# povećati iznos za 10%
update smjer set iznos=iznos*1.1;

# smanjiti za 10 %
update smjer set iznos=iznos*0.9;

# Kreiranje tablice na osnovu select naredbe
create table nova
select * from smjer;

insert into smjer(naziv,cijena,trajanje,iznos)
select naziv, 0,0,0 from grupa;

select * from nova;
delete from nova where sifra=2;

drop table nova;

# Obriši sve članove na smjeru JAVA programiranje
delete c
from smjer a
inner join grupa b on a.sifra =b.smjer 
inner join clan c on b.sifra =c.grupa 
where a.naziv='JAVA programiranje';

# Svim polaznicima na Java programiranju
# imenu dodaj slovo J
update osoba a
inner join polaznik b on a.sifra =b.osoba 
inner join clan c on b.sifra =c.polaznik 
inner join grupa d on c.grupa =d.sifra 
inner join smjer e on d.smjer =e.sifra 
set
a.ime = concat(a.ime,'J')
where e.naziv = 'Java programiranje';

select * from osoba;



# priprema za podupit
delete from clan where 
grupa=1 and polaznik =1;

# naći polaznike koji nisu član niti jedne grupe
select * from 
polaznik where sifra not in 
(select polaznik from clan);
# ovo u zagradi je podupit

select a.ime, a.prezime
from osoba a inner join polaznik b
on a.sifra =b.osoba
where b.sifra not in 
(select polaznik from clan);

select c.ime, c.prezime
from polaznik a
left join clan b on a.sifra =b.polaznik
inner join osoba c on a.osoba=c.sifra
where b.grupa is null;
# ovo je zamjena za podupit


# funkcije

#funkcije
#now() ne prima niti jedan parametar
#rtrim(X) - prima jedan parametar
#funkcije primaju više parametara odvojenih zarezom
#concat nadoljepljuje stringove (y,y,y,y,y)
# Čitati https://mariadb.com/kb/en/built-in-functions/
select now(), left(ime,2),
left('Osijek',3) from osoba;

select now();

select 1;

select 
concat(
	left(lower(ime),1),
lower(prezime)
)
from osoba;

select upper(ime) from osoba;

# ispisati imena prvo slovo malo, sva ostala velika

select concat(lower(left(ime,1)),upper(right(ime,length(ime)-1))) from osoba;





drop function if exists email;
DELIMITER $$
CREATE FUNCTION email(ime varchar(50), prezime varchar(50)) 
RETURNS varchar(255)
begin

return concat(left(lower(ime),1),'.', lower(
replace(
replace(
replace(
replace(
replace(replace(upper(prezime),' ',''),'Č','C')
,'Š','S')
,'Đ','D')
,'Ć','C')
,'Ž','Z')
), '@edunova.hr');
end;
$$
DELIMITER ;


select email(ime,prezime) as email from osoba;

# datumske funkcije
# koji je datum za 90 dana
select adddate(now(),interval 90 day);

# koji je datum bio prije 90 dana
select adddate(now(),interval -90 day);

# Broj otkucaja srca
select datediff(now(),'1995-02-02') * 24 * 60 * 70;









# okidači (trigger)


create table logiranje(
tko varchar(255),
sto varchar(255),
kada datetime default now()
);

select * from logiranje;

drop trigger if exists osoba_unos;
delimiter $$
create trigger osoba_unos before insert on osoba for each row
begin
 insert into logiranje (tko,sto) values ('unos nove osobe', concat(new.ime,' ', new.prezime));
	
end
$$
delimiter ;

insert into osoba (ime,prezime,email) values ('Pero','Perić','email');



delimiter $$
CREATE TRIGGER update_osoba
before update
   ON osoba FOR EACH ROW
BEGIN

insert into logiranje values('osoba promjena',concat(old.ime, ' - ', new.ime),now());

end
$$

delimiter ;

select * from osoba order by 1 desc limit 1;
update osoba set ime='Perica' where sifra=27;

select * from logiranje;


delimiter $$
CREATE TRIGGER delete_osoba
after delete
   ON osoba FOR EACH ROW
BEGIN

insert into logiranje values('obrisao osobu',concat(old.ime, ' ', old.prezime),now());

END$$

delimiter ;

delete from osoba where sifra=27;

select * from logiranje;


# procedure

delimiter $$
create procedure brisismjer(in sifrasmjera int)
begin
	delete from clan where grupa in (select sifra from grupa where smjer=sifrasmjera);

	delete from grupa where smjer = sifrasmjera;

	delete from smjer where sifra=sifrasmjera;

	
end
$$
delimiter ;


select * from smjer;
delete from smjer where sifra=1;
call brisismjer(1);



#baza knjiznica
#proširim tablicu autor
alter table autor add column dodatak varchar(10);

select * from autor;

#primjer procesure koja će u kolonu dodatak pohraniti A1 - An
drop procedure if exists inicijalni_dodatak;

delimiter $$
CREATE PROCEDURE inicijalni_dodatak ()
BEGIN

DECLARE kraj INTEGER DEFAULT 0;
DECLARE _sifra int;
 DECLARE broj int;
 DEClARE autor_kursor CURSOR FOR 
SELECT sifra FROM autor order by sifra;

DECLARE CONTINUE HANDLER 
        FOR NOT FOUND SET kraj = 1;


OPEN autor_kursor;
set broj=1;
petlja: LOOP

FETCH autor_kursor INTO _sifra;

IF kraj = 1 THEN 
 LEAVE petlja;
 END IF;
 
 update autor set dodatak=concat('A',broj) where sifra=_sifra;
set broj=broj+1;

END LOOP petlja;

CLOSE autor_kursor;

END$$

delimiter ;


call inicijalni_dodatak();


#napraviti trigger kada se odradi insert da se odmah dodjeli dodatak
drop TRIGGER if exists insert_autor;
delimiter $$

CREATE TRIGGER insert_autor
before INSERT
   ON autor FOR EACH ROW

BEGIN

   DECLARE broj int;
   set broj=(select max(cast(substring(dodatak,2) as SIGNED)) from autor where dodatak is not null);
    set broj=broj+1;
    set NEW.dodatak=concat('A',broj);
    
   
END$$

delimiter ;

#index
create index ai_1 on autor(ime);



# ručni backup
# mysqldump -uroot edunovajp28 > c:\edunovajp28_backup.sql

#batch skripta koja se postavi u sceduller svaki dan
#@ECHO OFF
#for /f %%a in ('powershell -Command "Get-Date -format yyyy_MM_dd__HH_mm_ss"') do set datetime=%%a
#mysqldump -uedunova -pedunova knjiznica > e:\knjiznica_backup%datetime%.sql


#LOG MYSQL servera se omogućuje u my.ini datoteci bez znakova #
# The MySQL server
#[mysqld]
#....
#general_log=1
#general_log_file=c:\mysqllog.log





