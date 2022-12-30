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


BEGIN;

-- Insert a new customer with a starting balance of $100
INSERT INTO customers (id, name, balance)
VALUES (1, 'John Smith', 100);

-- Insert an order for the new customer
INSERT INTO orders (id, customer_id, total_amount)
VALUES (1, 1, 50);

-- Update the customer's balance to reflect the order
UPDATE customers
SET balance = balance - (SELECT total_amount FROM orders WHERE id = 1)
WHERE id = (SELECT customer_id FROM orders WHERE id = 1);

-- Check that the balance was updated correctly
SELECT balance FROM customers WHERE id = 1;

COMMIT;
