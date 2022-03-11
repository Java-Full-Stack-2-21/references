
CREATE TABLE users(
	user_id serial PRIMARY KEY,
	user_username varchar(100) UNIQUE NOT NULL,
	user_password varchar(100) NOT NULL,
	user_firstname varchar(100) NOT NULL,
	user_lastname varchar(100) NOT NULL,
	date_created timestamp DEFAULT now()
);


-- on delete cascade removes all lists from a user if the user was deleted
CREATE TABLE lists(
	list_id serial PRIMARY KEY,
	list_name varchar(100) NOT NULL,
	user_id_fk int REFERENCES users(user_id) ON DELETE CASCADE NOT NULL
);

CREATE TABLE items(
	item_id serial PRIMARY KEY,
	item_name varchar(100) NOT NULL,
	item_quantity int DEFAULT 1,
	item_in_cart boolean DEFAULT FALSE,
	list_id_fk int REFERENCES lists(list_id) ON DELETE CASCADE NOT NULL
);

-- validate credentials
INSERT INTO users (user_username, user_password, user_firstname, user_lastname) 
VALUES ('user1', 'pass123', 'User', 'One');

INSERT INTO users (user_username, user_password, user_firstname, user_lastname) VALUES ('user2', 'pass123', 'User', 'Two');

DELETE FROM users WHERE user_id = 1;

-- get user given username
SELECT * FROM users WHERE user_username = 'user1';

SELECT * FROM users;

--lists
SELECT * FROM lists;

--creating a list
INSERT INTO lists (list_name, user_id_fk) VALUES ('Albertsons', 2); 

-- delete a list
DELETE FROM lists WHERE list_id = 1;


--display all lists for user
SELECT * FROM lists WHERE user_id_fk = 4 ORDER BY list_id;



--items

--creating an item
INSERT INTO items (item_name, item_quantity, list_id_fk) VALUES ('apples', 5, 2);

INSERT INTO items (item_name, list_id_fk) VALUES ('apples', 2);


--display all items in a specific list
SELECT * FROM items WHERE list_id_fk = 6 ORDER BY item_id;

SELECT * FROM items;

--removing an item
DELETE FROM items WHERE item_id = 2;


--mark item in cart
UPDATE items SET item_in_cart = TRUE WHERE item_id = 1;


