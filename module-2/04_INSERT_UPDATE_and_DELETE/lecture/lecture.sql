-- INSERT
SELECT * from city;
-- Add Disneyland to the park table. (It was established on 7/17/1955, has an area of 2.1 square kilometers and does not offer camping.)
INSERT INTO park(park_name, date_established, area, has_camping)
VALUES ('Disneyland',
        '7/17/1955',
        2.1,
        false);

-- Add Hawkins, IN (with a population of 30,000 and an area of 38.1 square kilometers) and Cicely, AK (with a population of 839 and an area of 11.4 square kilometers) to the city table.
INSERT INTO city(city_name, state_abbreviation, population, area)
VALUES ('Hawkins', 'IN', 30000, 38.1),
       ('Cicely', 'AK', 839, 11.4);
-- Since Disneyland is in California (CA), add a record representing that to the park_state table.
INSERT INTO park_state(park_id, state_abbreviation) VALUES ((SELECT park_id FROM park WHERE park_name = 'Disneyland'), 'CA');


-- UPDATE

-- Change the state nickname of California to "The Happiest Place on Earth."
UPDATE state SET state_nickname = 'The Happiest Place on Earth'
WHERE state_name = 'California';

-- Increase the population of California by 1,000,000.
UPDATE state SET population = 1000000
WHERE state_name = 'California'
RETURNING population;

-- Change the capital of California to Anaheim.
UPDATE state SET capital = (SELECT city_id FROM city where city_name = 'Anaheim')
WHERE state_name = 'California'
RETURNING capital;


-- Change California's nickname back to "The Golden State", reduce the population by 1,000,000, and change the capital back to Sacramento.
UPDATE state SET state_nickname = 'The Golden State', population = population - 1000000, capital = (SELECT city_id FROM city where city_name = 'Sacramento')
WHERE state_name = 'California'
RETURNING state_name;


-- DELETE

-- Delete Hawkins, IN from the city table.
DELETE FROM city WHERE city_name = 'Hawkins' AND state_abbreviation = 'IN'

-- Delete all cities with a population of less than 1,000 people from the city table.
DELETE FROM city WHERE population < 1000;


-- REFERENTIAL INTEGRITY

-- Try adding a city to the city table with "XX" as the state abbreviation.
INSERT INTO city(city_name, state_abbreviation, area, population)
VALUES ('Knoxville-XX', 'XX', 300, 20000)

-- Try deleting California from the state table.


-- Try deleting Disneyland from the park table. Try again after deleting its record from the park_state table.



-- CONSTRAINTS

-- NOT NULL constraint
-- Try adding Smallville, KS to the city table without specifying its population or area.


-- DEFAULT constraint
-- Try adding Smallville, KS again, specifying an area but not a population.


-- Retrieve the new record to confirm it has been given a default, non-null value for population.


-- UNIQUE constraint
-- Try changing California's nickname to "Vacationland" (which is already the nickname of Maine).


-- CHECK constraint
-- Try changing the census region of Florida (FL) to "Southeast" (which is not a valid census region).



-- TRANSACTIONS

-- Delete the record for Smallville, KS within a transaction.


-- Delete all of the records from the park_state table, but then "undo" the deletion by rolling back the transaction.


-- Update all of the cities to be in the state of Texas (TX), but then roll back the transaction.


-- Demonstrate two different SQL connections trying to access the same table where one is inside of a transaction but hasn't committed yet.
