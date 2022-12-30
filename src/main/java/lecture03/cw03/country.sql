create table country
(
    id   int primary key not null unique,
    name varchar(30)     not null unique
);

select *
from country;

insert into country (id, name)
values (1, 'IRAN'),
       (2, 'USA'),
       (3, 'GERMANY');

update country
set name='UKRAINE',
    pop=1000,
    space=10
where id = 3;

delete
from country
where id = 3;

alter table country
    add column space int not null default 2;


-- city
create table city
(
    id         serial primary key,
    name       varchar(20) unique,
    country_id int,
    CONSTRAINT fk_country_id
        FOREIGN KEY (country_id)
            REFERENCES country (id)
);

insert into city (name, country_id)
values ('TABRIZ', 1);

update city
set name='Shiraz'
where id = 2;


alter table city
    add column pop int;
-- "IRAN"

select *
from city c
         inner join country co on co.id = c.country_id;

--countryName , cityCount

select co.name     countryName,
       count(c.id) cityCount
from country co
         inner join city c on c.country_id = co.id
group by co.name
having count(c.id) >= 2;

select co.name, sum(c.pop) sumOfCityPopulation
from country co
         inner join city c on co.id = c.country_id
group by co.name;


select co.name, avg(c.pop) sumOfCityPopulation
from country co
         inner join city c on co.id = c.country_id
group by co.name;


select co.name, max(c.pop) sumOfCityPopulation
from country co
         inner join city c on co.id = c.country_id
group by co.name;


select co.name, min(c.pop) sumOfCityPopulation
from country co
         inner join city c on co.id = c.country_id
group by co.name;


----------------------

select co.name                 countryname,
       coalesce(sum(c.pop), 0) sum
from country co
    left join city c on co.id = c.country_id
group by co.name;


select co.name                 countryname,
       coalesce(sum(c.pop), 0) sum
from country co
    right join city c on co.id = c.country_id
group by co.name;


select *
from country co
         right join city c on co.id = c.country_id;




select
    distinct co.space * c.pop
from country co
         left join city c on co.id = c.country_id
where c.name is not null
order by co.space * c.pop desc
offset 2 limit 1;