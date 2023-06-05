-- Select kroz više tablica sakila

# U kojim je sve filmovima glumio BURT POSEY

select a.first_name, a.last_name, c.title 
from actor a 
inner join film_actor b 		on a.actor_id =b.actor_id 
inner join film c 				on c.film_id = b.film_id 
where a.first_name='Burt' and a.last_name='Posey';

# Ispišite imena i prezimena kupaca koji su posuđivali
# filmove u kojima je glumio BURT POSEY

select distinct f.first_name, f.last_name, c.title
from actor a 
inner join film_actor b 		on a.actor_id =b.actor_id 
inner join film c 				on c.film_id = b.film_id 
inner join inventory d 			on c.film_id = d.film_id 
inner join rental e 			on d.inventory_id = e.inventory_id 
inner join customer f 			on e.customer_id = f.customer_id 
where a.first_name='Burt' and a.last_name='Posey';

# Promijenite prezime Posey na Cosey

select * from actor
where last_name='Cosey';

update actor set last_name='Cosey' where actor_id=75;

# Koja kategorija ima u sebi najmanji broj filmova?

select a.name, count(b.film_id) 
from category a
inner join film_category b 		on a.category_id = b.category_id
group by a.name
order by 2
limit 1;

# Obrišite sve filmove iz kategorije Horror

select * from category;
delete from film_category where category_id=11;

# Kopirana naredba od gore, s time da smo stavili left join
select a.name, count(b.film_id) 
from category a
left join film_category b 		on a.category_id = b.category_id
group by a.name
order by 2
limit 1;

# Koji djelatnici rade u Barceloni?

select a.first_name, a.last_name 
from staff a
inner join address b 		on a.address_id =b.address_id 
inner join city c 			on b.city_id =c.city_id 
where c.city ='Barcelona';