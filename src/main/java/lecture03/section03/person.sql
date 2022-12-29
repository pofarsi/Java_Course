create table person
(
    id               BIGSERIAL   NOT NULL PRIMARY KEY,
    first_name       VARCHAR(50) NOT NULL,
    last_name        VARCHAR(50) NOT NULL,
    gender           VARCHAR(10) NOT NULL,
    email            VARCHAR(100),
    date_of_birth    DATE        NOT NULL,
    country_of_birth VARCHAR(50) NOT NULL
);

insert into person (first_name, last_name, gender, email, date_of_birth, country_of_birth)
values ('Fernanda', 'mendez', 'Female', 'fernandab@is.gd', '1953-10-28', 'Comoros');
insert into person (first_name, last_name, gender, email, date_of_birth, country_of_birth)
values ('Omar', 'sara', 'Male', null, '1921-04-03', 'Finland');
insert into person (first_name, last_name, gender, email, date_of_birth, country_of_birth)
values ('John', 'smith', 'Male', 'john@feedburner.com', '1965-02-28', 'England');

-- mockaroo.com is used for data.

-- we can use order by like below
select *
from person
order by id desc;
select *
from person
order by country_of_birth, id desc;

select country_of_birth
from person;
-- remove duplicate
select distinct country_of_birth
from person
order by country_of_birth desc;

-- where clause
select *
from person
where gender = 'Male';
-- there is key word for ignoring uppercase lowercase.
select *
from person
where gender = 'Male'
  and country_of_birth = 'England';

-- limit and offset
select *
from person limit 2;
select *
from person offset 2 limit 2;
select *
from person offset 2 fetch first 1 row only;

-- in
select *
from person
where country_of_birth in ('england', 'usa')
order by country_of_birth;

-- between
select *
from person
where date_of_birth between '2000-00-00' and '2010-00-00';

-- like and Ilike is used for ignoring upper lowe case.
select *
from person
where email like '%.com';

--count
select country_of_birth, count(*)
from person
group by country_of_birth;

-- having
select country_of_birth, count(*)
from person
group by country_of_birth
having count(*) > 1
order by country_of_birth;

-- coalesce
select coalesce(email, 'null')
from person;

-- nullif for example we can use for 10 / 0 so we dont get excepting

-- select now() :: date;
--
-- select NOW() - interval '1 year';
-- select extract(year from now());

select date_of_birth age(now(), date_of_birth)as age frome person;

--constraint
alter table person
    add constraint unique_email unique (email);

-- check
alter table person
    add constraint genders check ( gender = 'Female' or gender = 'Male');

-- update person set email = '****' where id = 1;



