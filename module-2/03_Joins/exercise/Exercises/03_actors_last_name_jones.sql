-- 3. For all actors with the last name of "Jones", display the actor's name and movie titles they appeared in. Order the results by the actor names (A-Z). (48 rows)
SELECT title, person_name
FROM movie
JOIN movie_actor ma on movie.movie_id = ma.movie_id
join person p on ma.actor_id = p.person_id
where person_name LIKE '%Jones'
ORDER BY person_name DESC
LIMIT 48