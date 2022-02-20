create table customer
(
    id    serial primary key,
    name  varchar(255) not null,
    email varchar(255) not null
);


create table product
(
    id   serial primary key,
    name varchar(255) not null,
    cost integer      not null
);