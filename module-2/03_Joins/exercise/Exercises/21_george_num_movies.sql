-- 21. For every person in the person table with the first name of "George", list the number of movies they've been in--include all Georges, even those that have not appeared in any movies. Display the names in alphabetical order. (59 rows)
-- Name the count column 'num_of_movies'
SELECT person.person_name, COUNT(title) AS num_of_movies
FROM person
LEFT OUTER JOIN movie_actor ma on person.person_id = ma.actor_id
LEFT OUTER JOIN movie m on m.movie_id = ma.movie_id
WHERE person_name LIKE 'George %'
GROUP BY actor_id, person_name
ORDER BY person_name