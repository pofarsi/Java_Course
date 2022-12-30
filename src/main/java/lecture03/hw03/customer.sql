create database customer;

create table if not exists customer
(
    id         bigserial primary key,
    first_name text not null,
    last_name  text not null,
    email      text not null unique,
    address    text not null,
    create_at  timestamp with time zone
);

insert into customer (id, first_name, last_name, email, address, create_at)
values (1, 'Alex', 'Mendez', 'alex.mendez@gmail.com', 'NewYork US', now()),
       (2, 'Sasha', 'Golden', 'sasha.goldn@gmail.com', 'London UK', now()),
       (3, 'Nicole', 'Lopez', 'nicole.lopez@gmail.com', 'Florida US', now()),
       (4, 'Ahmad', 'Jamal', 'ahmad.jamal@gmail.com', 'Dubai UAE', now());

create table if not exists customer_order
(
    id           bigserial primary key,
    customer_id  bigint         not null
    references customer (id),
    total_amount numeric(10, 2) not null,
    create_at    timestamp with time zone
);

insert into customer_order(customer_id, total_amount, create_at)
values (1, 1.80, now()),
       (2, 1.10, now()),
       (3, 0.80, now()),
       (4, 1.90, now());

create table if not exists product
(
    id           bigserial primary key,
    product_name text           not null,
    price        numeric(10, 2) not null,
    discontinued boolean        not null
    );


insert into product (product_name, price, discontinued)
values (1, 'bread', 1.40, false),
       (2, 'apple', 0.40, false),
       (3, 'banana', 1.90, false),
       (4, 'milk', 2, false),
       (5, 'pepsi', 1.00, false),
       (6, 'chips', 3.00, false);

create table if not exists order_item
(
    id         bigserial primary key,
    order_id   bigint         not null references customer_order (id),
    product_id bigint         not null references product (id),
    quantity   int            not null check ( quantity > 0 ),
    price      numeric(10, 2) not null
    );


insert into order_item (order_id, product_id, quantity, price)
values (1, 1, 1, 1.40),
       (1, 2, 1, 0.40),
       (2, 3, 2, 0.30),
       (4, 4, 1, 1.00),
       (4, 5, 1, 1.90);

select * from customer;