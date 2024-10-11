create table Worker (
worker_id INT PRIMARY KEY,
first_name VARCHAR(100) NOT NULL,
last_name VARCHAR(50),
salary DECIMAL(10, 2),
joining_date DATE,
department VARCHAR
);

insert into Worker (worker_id,first_name,last_name,salary,joining_date,department)
VALUES (1, 'yogitha','c',200000.00,'2020-10-10','HR'),
(2, 'pranav','kumar',45000.00,'2021-08-25','Admin'),
(3, 'yana','c',100000.00,'2020-02-19','Account'),
(4, 'sara','c',50000.00,'2020-01-08','Admin'),
(5, 'reshma','rao',25000.00,'2021-07-30','HR');

insert into Worker (worker_id,first_name,last_name,salary,joining_date,department)
VALUES (6, 'heera','ram',200000.00,'2020-11-05','Admin');

select * from Worker

create table Title(
worker_ref_id int,
worker_title VARCHAR(20),
affected_from DATE,
CONSTRAINT fk_workerid FOREIGN KEY (worker_ref_id)
REFERENCES Worker(worker_id)
);

insert into Title(worker_ref_id,worker_title,affected_from)
values (1,'manager','2016-02-20'),
(2,'executive','2016-02-10'),
(5,'lead','2016-02-20'),
(4,'executive','2016-05-06'),
(3,'asst.manager','2016-02-20');

select * from Title;
create table bonus(
worker_ref_id int,
bonus_amount int,
bonus_date DATE,
CONSTRAINT fk_workerid FOREIGN KEY (worker_ref_id)
REFERENCES Worker(worker_id)
);

insert into bonus(worker_ref_id,bonus_amount,bonus_date)
VALUES (1,1500,'2022-06-01'),
(4,300,'2022-05-22'),
(5,750,'2022-04-19'),
(2,3000,'2022-02-08'),
(4,2500,'2022-09-22');

select * from bonus;

--question 1
select Worker.first_name,Worker.salary,Title.worker_title
from Worker inner join Title on Worker.worker_id=Title.worker_ref_id;

drop function if exists get_worker_count_by_nth_highest_salary;

--question 2
create function get_worker_count_by_nth_highest_salary(nth integer)
returns integer as $$
declare
nth_highest_salary numeric;
begin
select distinct salary into nth_highest_salary from Worker
order by salary desc offset nth -1 limit 5;
return( select count(*) from Worker where salary=nth_highest_salary);
end;
$$ language plpgsql;

select get_worker_count_by_nth_highest_salary(1);