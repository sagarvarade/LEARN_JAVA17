#1 Write your MySQL query statement below
select name,population,aread from world where area>=3000000 or population>=25000000;

#2
select product_id from products where low_fats='Y' and recyclable='Y';

#3
select name from customer where referee_id not in (2) or referee_id is null;

#4
select name as Customers from Customers where id not in (select distinct customerId from orders);

