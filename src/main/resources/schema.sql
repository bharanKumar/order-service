drop table if exists orders;
create table orders(id bigint not null, customer_id bigint, description varchar(255), estimated_delivery_date date, primary key (id));