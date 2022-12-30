-- A primary key is a column (or set of columns) in a database table that is used to uniquely identify each row in the table.
-- A primary key must be unique and cannot contain NULL values. It is often used as a reference point for other tables in the database,
-- as we'll see in a moment.
--
-- A foreign key is a column (or set of columns) in a table that references the primary key of another table.
-- The purpose of a foreign key is to establish a relationship between the two tables and enforce certain rules about the data in the database.
-- For example, if we have a customers table and an orders table, with a one-to-many relationship between them
-- (i.e., each customer can have many orders), we might use a foreign key in the orders table to reference the id column
-- (which is the primary key) in the customers table. This ensures that each order is associated with a valid customer.
--
-- A database constraint is a rule or restriction that is applied to the data in a database to ensure that it remains accurate and consistent.
-- There are several types of constraints that can be used in a database,
-- including primary key constraints, foreign key constraints, unique constraints, and check constraints.
-- For example, a primary key constraint ensures that each row in a table has a unique identifier,
-- while a foreign key constraint ensures that a column (or set of columns) in a table references a valid row in another table.
--
-- A transaction is a unit of work that is performed against a database.
-- It consists of a set of database operations that are executed as a single unit, either all at once or not at all.
-- Transactions are used to ensure that the database remains in a consistent state, even in the event of a system failure or error.
--
-- A join is a SQL operator that combines rows from two or more tables based on a common field.
-- There are several types of joins, including INNER JOIN, LEFT JOIN, RIGHT JOIN, and FULL OUTER JOIN.
-- Joins are often used to retrieve data from multiple tables in a single query, based on relationships between the tables.
--
-- An index is a data structure that allows the database to efficiently locate and retrieve data from a table.
-- Indexes can be created on one or more columns of a table, and are used to speed up queries that filter or sort data based on those columns.
--
-- Here is an example that illustrates these concepts in a database:
--
-- Suppose we have a database with two tables: customers and orders. The customers table has the following columns:
--
-- id (primary key)
-- name
-- balance
-- The orders table has the following columns:
--
-- id (primary key)
-- customer_id (foreign key referencing customers.id)
-- total_amount
-- We can represent these tables and their relationships visually as follows:

customers
+----+--------+--------+
| id | name   | balance|
+----+--------+--------+
|  1 | John   |   100  |
|  2 | Mary   |   200  |
|  3 | Bob    |   300  |
+----+--------+--------+

          orders
+----+------------+------------+
| id | customer_id| total_amount|
+----+------------+

    -- Create the customers table
CREATE TABLE customers (
                           id SERIAL PRIMARY KEY,
                           name VARCHAR(255) NOT NULL,
                           balance DECIMAL(10, 2) NOT NULL
);

-- Create the orders table
CREATE TABLE orders (
                        id SERIAL PRIMARY KEY,
                        customer_id INTEGER REFERENCES customers(id) NOT NULL,
                        total_amount DECIMAL(10, 2) NOT NULL
);

-- Insert some data into the customers table
INSERT INTO customers (name, balance) VALUES
                                          ('John', 100),
                                          ('Mary', 200),
                                          ('Bob', 300);

-- Insert some data into the orders table
INSERT INTO orders (customer_id, total_amount) VALUES
                                                   (1, 50),
                                                   (2, 75),
                                                   (3, 25),
                                                   (1, 25);

-- Select all orders and join them to the corresponding customer
SELECT o.id, c.name, o.total_amount
FROM orders o
         INNER JOIN customers c ON o.customer_id = c.id;

-- Output:
--  id | name  | total_amount
-- ----+-------+--------------
--   1 | John  |           50
--   2 | Mary  |           75
--   3 | Bob   |           25
--   4 | John  |           25

-- Update the balance of a customer
UPDATE customers
SET balance = balance - 50
WHERE id = 1;

-- Select the updated balance of the customer
SELECT balance FROM customers WHERE id = 1;

-- Output:
--  balance
-- ----------
--       50

-- Create an index on the orders table to speed up queries
CREATE INDEX idx_orders_customer_id ON orders (customer_id);

-- Select all orders for a specific customer using the index
SELECT * FROM orders WHERE customer_id = 1;

-- Output:
--  id | customer_id | total_amount
-- ----+-------------+--------------
--   1 |           1 |           50
--   4 |           1 |           25


-- In this example, we create two tables: customers and orders.
-- The customers table has a primary key column called id,
-- and the orders table has a foreign key column called customer_id that references the id column in the customers table.
-- This establishes a one-to-many relationship between the two tables (i.e., each customer can have many orders).
--
-- We insert some data into the customers and orders tables using the INSERT statement.
-- Then, we use an INNER JOIN to select all orders and join them to the corresponding customer data.
-- This allows us to retrieve data from both tables in a single