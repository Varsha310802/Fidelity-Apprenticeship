create table customers (
customer_id varchar(10) primary key,
customer_name varchar(20),
address varchar(20),
phone_no bigint,
email_id varchar(20)
);

create table delivery_partners(
partner_id varchar(10) primary key,
partner_name varchar(20),
phone_no bigint,
rating int
);

create table hotel_details(
hotel_id varchar(10) primary key,
hotel_name varchar(20),
hotel_type varchar(20),
rating int
);

create table orders(
order_id varchar(10) primary key,
customer_id varchar(10),
hotel_id varchar(10),
partner_id varchar(10),
order_date date,
order_amount int,
foreign key (customer_id) references customers(customer_id),
foreign key (hotel_id) references hotel_details(hotel_id),
foreign key (partner_id) references delivery_partners(partner_id)
);

insert into Customers(customer_id,customer_name,address,phone_no,email_id)
values
('cust1001','asha','Pune',9877655336,'asha@gmail.com'),
('cust1002','banu','Kochi',9866543215,'banus@gmail.com'),
('cust1003','chidu','Goa',8976543219,'chidu@gmail.com'),
('cust1004','dhanu','Ooty',6634526787,'dhanu@gmail.com'),
('cust1005','giri','Bangalore',9489453267,'giri@gmail.com'),
('cust1006','hamsa','Chennai',9865473652,'hamsa@gmail.com');

insert into delivery_partners(partner_id,partner_name,phone_no,rating)
values
('DP001','Alice',9876510234,4),
('DP002','Bonso',9862345678,5),
('DP003','Charls',9872365438,3);

insert into hotel_details(hotel_id,hotel_name,hotel_type,rating)
values
('h001','The Taj','Laxury',5),
('h002','The Max','Budget',3);

insert into orders(order_id,customer_id,hotel_id,partner_id,order_date,order_amount)
values
('O001','cust1001','h001','DP001','2024-10-10',5000),
('O002','cust1002','h002','DP002','2024-10-11',4000);

SELECT partner_id,partner_name,phone_no
from delivery_partners
where rating between 3 and 5
order by partner_id;

update Customers
set phone_no = 9876510234
where customer_id = 'cust1004'

select * from customers 
where customer_id = 'cust1004'

select customer_id, customer_name,address,phone_no
from Customers
where email_id like '%@gmail.com'
order by customer_id;


select customer_id
from Customers
where not customer_id ~ '^[0-9]+$';

select concat(hotel_name, ' is a ', hotel_type, ' hotel') as hotel_info
from hotel_details
order by hotel_name desc;

select h.hotel_id, h.hotel_name, count(o.order_id) as no_of_orders
from hotel_details h
inner join orders o on h.hotel_id = o.hotel_id
group by h.hotel_id, h.hotel_name
having count(o.order_id) > 5
order by h.hotel_id asc;

select h.hotel_id, h.hotel_name,h.hotel_type
from hotel_details h
left join orders o on h.hotel_id = o.hotel_id
and o.order_date between '2019-05-01' and '2024-10-10'
where o.order_id is null
order by h.hotel_id asc;

select o.order_id, c.customer_name,h.hotel_name,o.order_amount
from orders o
join customers c on o.customer_id = c.customer_id
join hotel_details h on o.hotel_id = h.hotel_id
order by o.order_id asc

create table pizza(
pizza_id varchar(10) primary key,
customer_id varchar(10),
partner_id varchar(10),
pizza_name varchar(15),
pizza_type varchar(15),
order_date date,
amount bigint
);

insert into pizza (pizza_id,customer_id,partner_id,pizza_name,pizza_type,order_date,amount)
values
('piz001','cust001','part001','margherita','Extra large','2023-09-12',15.00),
('piz002','cust002','part002','golden corn','Medium','2023-09-13',12.00),
('piz003','cust003','part003','bbq cheese','Large','2023-09-14',18.00);


update pizza
set amount = amount * 0.97
where pizza_type = 'Extra large';


