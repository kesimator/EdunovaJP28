-- Select kroz više tablica knjiznica

# Izlistati sve naslove autora Augusta Šenoe

select a.ime, a.prezime, b.naslov
from autor a inner join katalog b
on a.sifra=b.autor
where a.ime='Ivana' and a.prezime like 'Brli%';
-- where a.ime='August' and a.prezime='Šenoa'

# Koji autori nisu izdali nijednu knjigu?

select a.ime, a.prezime, b.naslov
from autor a left join katalog b
on a.sifra=b.autor
where b.naslov is null;

# Gdje je August Šenoa izdao svoje naslove?
# (U kojim mjestima?)

select distinct c.naziv
from autor a 
inner join katalog b 		on a.sifra=b.autor
inner join mjesto c 		on b.mjesto=c.sifra
where a.ime='August' and a.prezime='Šenoa';

# Izlistajte sve naslove knjiga koje su objavili
# izdavači koji nisu društva s ograničenom odgovornošću.

select b.naziv, a.naslov 
from katalog a
inner join izdavac b 		on a.izdavac =b.sifra  
where b.naziv 				not like '%d.o.o%';