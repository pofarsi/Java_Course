CREATE
DATABASE db;

CREATE TABLE person
(
    id           serial PRIMARY KEY,
    first_name   varchar(255) NOT NULL,
    last_name    varchar(255) NOT NULL,
    gender       varchar(255) NOT NULL,
    age          integer      NOT NULL,
    score        integer      NOT NULL,
    phone_number varchar(255) NOT NULL
);

INSERT INTO person (id, first_name, last_name, gender, age, score, phone_number)
VALUES (1, 'John', 'Doe', 'Male', 35, 80, '123-456-7890'),
       (2, 'Jane', 'Doe', 'Female', 30, 75, '098-765-4321'),
       (3, 'Bob', 'Smith', 'Male', 40, 90, '111-222-3333');

-- This query will return all rows from the "person" table where the first_name column starts with the letter "a".

SELECT *
FROM person
WHERE first_name LIKE 'A%';
--  If you want to find names that start with the letter "a" regardless of case, you can use the ILIKE operator.
SELECT *
FROM person
WHERE first_name ILIKE 'A%';

-- find names that end with the letter "b" in the "person" table

SELECT *
FROM person
WHERE last_name ILIKE '%B';

-- You can also use the % wildcard to match any characters in the beginning or middle of a string.
-- For example, to find names that contain the letter "b" anywhere in them, you can use the following query

SELECT *
FROM person
WHERE last_name LIKE '%B%';

-- find names that contain the letter "m" in both the first_name and last_name columns in the "person" table,
-- you can use the following SQL query

SELECT *
FROM person
WHERE first_name ILIKE '%M%' AND last_name ILIKE '%M%';

--  or  each one has letter m

SELECT *
FROM person
WHERE first_name LIKE '%M%'
   OR last_name LIKE '%M%';

-- find persons in the "person" table who have a first_name or last_name that contains the letter "b" and an age greater than 18

SELECT *
FROM person
WHERE (first_name ILIKE '%B%' OR last_name ILIKE '%B%')
  AND age > 18;

-- find min and max of the age and average

SELECT *
FROM person
ORDER BY age ASC LIMIT 1;
SELECT *
FROM person
ORDER BY age DESC LIMIT 1;
SELECT AVG(age)
FROM person;

--  count male and female also count people who are older than 18

SELECT COUNT(*)
FROM person
WHERE age > 18;
SELECT COUNT(gender)
FROM person;

-- calculate the average age of males and females

SELECT AVG(CASE WHEN gender = 'Male' THEN age END)   as male_avg_age,
       AVG(CASE WHEN gender = 'Female' THEN age END) as female_avg_age
FROM person;

SELECT age, gender, AVG(score) as avg_score
FROM person
GROUP BY age, gender;
