select * from smjer;

-- Select kroz više tablica edunovajp28

-- Koje su sve grupe na smjeru Java programiranje

select b.*
from smjer a inner join grupa b
on a.sifra=b.smjer
where a.naziv='Java programiranje';

-- Izlistajte sve nazive smjerova i njihovih grupa

select a.naziv as smjer, b.naziv as grupa
from smjer a inner join grupa b
on a.sifra=b.smjer;
-- ovdje pokazuje dvije grupe

select a.naziv as smjer, b.naziv as grupa
from smjer a left join grupa b
on a.sifra=b.smjer;
-- ovdje pokazuje sve tri grupe

-- inner join se pokazuje sve što je povezano primarnim i vanjskim ključevima
-- left join ili right join pokazuje sve što je u tome

select a.naziv as smjer, b.naziv as grupa,
concat(d.ime, ' ', d.prezime) as predavac,
concat(g.ime, ' ', g.prezime) as polaznik
from smjer a 
inner join grupa b 			on a.sifra=b.smjer
inner join predavac c 		on b.predavac=c.sifra
inner join osoba d 			on c.osoba=d.sifra
inner join clan e 			on b.sifra=e.grupa
inner join polaznik f 		on e.polaznik=f.sifra
inner join osoba g 			on f.osoba=g.sifra;

# izvorno
select a.naziv as smjer, b.naziv as grupa
from smjer a left join grupa b
on a.sifra=b.smjer;
