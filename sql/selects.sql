


/*
 * the * refers to all columns in the table
 * */
select * from employee;

select first_name, last_name from employee;


/*
 * What is an alias?
 * 		alias are nicknames you can give your entities
 * */
select fluffybunny.first_name, fluffybunny.last_name from employee as fluffybunny;

select first_name as kevin, last_name as childs from employee;



/*
 * What is a result set?
 * 		the temporary table given back from a DQL statement
 * */

select * from employee;



--where clause is essentially a filter of the records
select * from employee where title = 'Sales Support Agent';

select * from employee where title = 'Sales Support Agent' and first_name = 'Steve';

select * from employee where first_name = 'Steve' or first_name = 'Jane' or first_name = 'Robert';




-- there is also not equals for exclusion because we dont like margaret
select * from employee where first_name != 'Margaret';

select * from employee where not first_name = 'Margaret';

select * from employee where first_name <> 'Margaret';



-- you can use >, <, <=, >= in the where clause

select * from employee where employee_id > 4 and employee_id < 7;

select * from employee where first_name > 'N';




--null references
select * from employee where reports_to is null;

select * from employee where reports_to is not null;


/*
 * Like keyword finds patterns in columns
 * 
 * % wildcard that is a standin for 0 or more characters
 * _ wildcard for one specific character
 * 
 * */

select * from album;

select * from album where title like 'B%';

select * from album where title like 'B%O_%es%';

select * from album where title like '_ig__nes';





select * from employee;


-- order by is used for sorting. ascending implicitly
select * from employee order by last_name asc;

select * from employee order by last_name desc;

-- orders by the first argument and then if first argument is the same, order by first name in descending order
select * from employee order by title asc, first_name desc;


--ordering the records in ascending order by employee id
select * from employee order by employee_id asc;


-- between is used for a range of numbers

select * from employee where employee_id between 4 and 7; --inclusive with numbers

select * from employee where first_name between 'A' and 'K'; --lower bound inclusive with strings but upperbound is not inclusive

select * from employee where first_name between 'A' and 'K' or first_name between 'N' and 'Z';


select * from employee where first_name not between 'A' and 'K';



select * from employee where first_name = 'Steve' or first_name = 'Jane' or first_name = 'Robert';

--- an alternative to this is using the in keyword
select * from employee where first_name in ('Steve', 'Jane', 'Robert');




------ Aggregate Function
--- does a calculation on a grouping of records to retrieve 1 result

select * from album;

select count(*) from album;


select * from invoice;
select count(*) from invoice; -- count prints the amount of records there are

select sum(total) from invoice; -- sum sums all the records for a specific column

select max(total) from invoice; -- gets the largest value within a column 
select max(billing_country) from invoice;

select min(total) from invoice; -- gets the smallest value within a column

-- group by 
-- allows aggregate function to work on smaller pockets of records
-- difference between where and having?
-- 		- where filters on the result set itself
--      - having filters after the group by and aggregate function happens

select billing_country, count(total) from invoice group by billing_country having count(total) > 10;


/*
 * What is a view
 * 		a view essentially saves a result set into a variable
 * */
create view country_count as
select billing_country, count(total) from invoice group by billing_country having count(total) > 10;

select * from country_count where count < 10;




/*
 * Scalar Functions
 * 	- functions that work on the individual records
 * 
 * */

select 'Hello World';


--numbers
select abs(-99); -- absolute value
select floor(88.77); -- rounds down
select ceil(88.77); -- rounds up
select trunc(3.14159263589, 4); -- removes a certain number of decimals


--characters
select upper('HeLlO wOrLd!'); -- capitalizes
select lower('HeLlO wOrLd!'); -- converts all characters to lower
select length('HeLlO wOrLd!'); -- character count

select * from employee;

select first_name, last_name, length(first_name) + length(last_name) from employee;


--join examples

select * from employee;

select c.first_name, c.last_name, i.invoice_id, i.total  from customer c 
left join invoice i on c.customer_id = i.customer_id;

select a.title, t.name from album a 
left join track t on a.album_id = t.album_id;


create view employee_reports_to as
select e.first_name as employee_first, e.last_name as employee_last, e2.first_name as manager_first, e2.last_name as manager_last from employee e
left join employee e2 on e.reports_to  = e2.employee_id;


select * from employee_reports_to;


select * from employee;

select * from customer;

/*
 * what is a set?
 * 		the set operator combines rows instead of combining columns like joins do
 * */

select first_name, last_name from employee
union
select first_name, last_name from customer;


