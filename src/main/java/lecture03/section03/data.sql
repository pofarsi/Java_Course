create table car
(
    id    BIGSERIAL      NOT NULL PRIMARY KEY,
    make  VARCHAR(100)   NOT NULL,
    model VARCHAR(100)   NOT NULL,
    price NUMERIC(19, 2) NOT NULL
);

insert into car (id, make, model, price)
values (479, 'Suzuki', 'Grand Vita-ra', '36588.55');
insert into car (id, make, model, price)
values (480, 'Acura', 'SLX', '14628.25');
insert into car (id, make, model, price)
values (481, 'Jeep', 'Grand Cherokee', '29593.22');
insert into car (id, make, model, price)
values (482, 'Nissan', 'Ultima', '70648.84');
insert into car (id, make, model, price)
values (483, 'Porsche', 'Cayenne', '66821.90');
insert into car (id, make, model, price)
values (484, 'Honda', 'Accord Crosstool', '23973.86');
insert into car (id, make, model, price)
values (485, 'Nissan', 'Maxima', '48221.88');
insert into car (id, make, model, price)
values (486, 'Dodge', 'Ram 1500', '54749.65');
insert into car (id, make, model, price)
values (487, 'BMW', '7 Series', '69247.51');
insert into car (id, make, model, price)
values (488, 'GMC', 'Suburban 1500', '27194.10');
insert into car (id, make, model, price)
values (489, 'Ford', 'Ranger', '77133.07');
insert into car (id, make, model, price)
values (490, 'Volvo', 'C70', '66854.65');
insert into car (id, make, model, price)
values (491, 'Pontiac', 'Trans Sport', '15221.64');
insert into car (id, make, model, price)
values (492, 'GMC', 'Yukon', '67001.68');
insert into car (id, make, model, price)
values (493, 'Dodge', 'Neon', '89609.84');
insert into car (id, make, model, price)
values (494, 'Mercury', 'Milan', '68654.50');
insert into car (id, make, model, price)
values (495, 'Hyundai', 'Genesis Coupe', '88763.02');
insert into car (id, make, model, price)
values (496, 'Suzuki', 'SJ', '13709.55');
insert into car (id, make, model, price)
values (497, 'Chevrolet', 'Express 2500', '84827.37');
insert into car (id, make, model, price)
values (498, 'Audi', '5000S', '30666.07');
insert into car (id, make, model, price)
values (499, 'Acura', 'TL', '20839.70');
insert into car (id, make, model, price)
values (500, 'Ford', '62', '39273.53');
insert into car (id, make, model, price)
values (501, 'Mazda', 'Mazda6', '52344.07');
insert into car (id, make, model, price)
values (502, 'Ford', 'Crown Victoria', '16752.76');
insert into car (id, make, model, price)
values (503, 'Toyota', 'Matrix', '59658.72');
insert into car (id, make, model, price)
values (504, 'Nissan', 'Pathfinder', '98290.58');
insert into car (id, make, model, price)
values (505, 'Mercedes-Benz', 'E-Class', '37175.38');
insert into car (id, make, model, price)
values (506, 'Dodge', 'Grand Caravan', '99177.12');

-- max min avg
select avg(price)
from car;

-- sum
select make, sum(price)
from car
group by make;

-- round
select id,
       make,
       model,
       price                          as original_price,
       round(price * 10, 2)           as ten_percent,
       round(price - (price * 10), 2) as discount_10%
from car;
-- postgres extension

-- transaction
