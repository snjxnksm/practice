create table if not exists customer (
    id int primary key auto_increment,
    name varchar(50) not null,
    email varchar(50) not null
);