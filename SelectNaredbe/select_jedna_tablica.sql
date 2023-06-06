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



