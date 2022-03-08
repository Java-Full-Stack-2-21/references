/*
 * What is SQL?
 * 		- Structured Query Language
 * 		- language designed for manipulating relational databases
 * 
 * What DBMS are we using?
 * 		Postgres
 * 
 * 5 sublanguages of SQL:
 * 	- DDL (Data Definition Language)
 * 		- deals with manipulating the table structures and schema
 * 		- keywords: create, alter, drop, truncate
 * 	- DML (Data Manipulation Language)
 * 		- deals with manipulating the records in a table
 * 		- keywords: insert, update, delete, select
 * 	- DQL (Data Query Language)
 * 		- deals with querying data to view 
 * 		- keywords: select
 * 	- DCL (Data Control Language)
 * 		- deals with granting and revoking access to databases
 * 		- grant, revoke
 * 	- TCL (Transaction Control Language)
 * 		- deals with when official commits happen to a database
 * 		- keywords: savepoint, rollback
 * 
 * 	What is a transaction?
 * 		an official commit to a database
 * 
 * 2 (insert) 3 (updates) 4 (deletes) commit
 * 
 * Properties of a transaction (ACID):
 * 	- Atomicity: (All or nothing) - all operations will execute successfully or none at all
 * 	- Consistency: all of constraints are enforced
 * 	- Isolation: Transactions cannot interfere with one another
 * 	- Durability: once a commit happens, that is the new state of the database now. 
 * 
 * */



--DDL
/*
 * What are constraints?
 * 	- rules that a column must follow in a table
 * 
 * Commone rules are:
 * 	- primary key: unique identifier for a record
 * 	- unique: must be a unique value within the column
 * 	- not null: you must have a value for the specific column when you insert a record
 * 	- default: if the value for the column is empty, add the default value
 * 
 * 
 * Common Datatypes:
 * 	- int: whole numbers
 * 	- serial: whole number that autoincrements everytime we create a record
 * 	- varchar(numofcharacters): string
 * 	- double precision: for decimalss
 * 	- timestamp: date
 * 
 * 	[variable name] [data type] [constraints]
 * 
 * 
 * There are 3 different types of primary keys
 * 	- surrogate key: autogenerated from inside the database
 * 					- EXAMPLES: serial
 * 	- natural key: unique identifier generated from outside the database
 * 					- EXAMPLES: social security number, username, driver license numbers
 * 	- composite key: unique identifier is created based on two columns
 * 					- EXAMPLES: Teacher id and Student Id
 * */
create table artists(
	artist_id serial primary key,
	artist_name varchar(50) not null,
	num_of_albums int not null
);


alter table artists drop column num_of_albums;


select * from artists;

drop table artists;




-- DML (Data Manipulation Language)

insert into artists (artist_id, artist_name) values (default, 'Brothers of Metal');

insert into artists values (default, 'Sam Smith');

insert into artists (artist_name) values ('Kendrick Lamar');

insert into artists values (5, 'John Cena');


delete from artists where artist_name = 'Sam Smith';


/*
 * I cannot remove the artist kendrick lamar because there is an album that references it as a foreign key in the albums table.
 * We cannot remove it because of referential integrity.
 * 
 * If I could remove kendrick lamar with still having section 80 in the albums table, this would result in an orphan record in the albums table
 * */
delete from artists where artist_id = 3;

update artists set artist_name = 'Kendrick Lamar' where artist_id = 3;




create table albums(
	album_id serial primary key,
	album_name varchar(100) not null,
	artist_id_fk int references artists(artist_id) --this is how we create a foreign key
);

insert into albums values (default, 'Section 80', 3);

insert into albums values (default, 'End of the Lonely Hour', 5);

select * from albums;


truncate albums;







