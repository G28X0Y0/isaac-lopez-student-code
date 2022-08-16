-- 2. The names and birthdays of actors in "The Fifth Element" (15 rows)
SELECT person_name, birthday
FROM person
JOIN movie_actor ma on person.person_id = ma.actor_id
JOIN movie m on m.movie_id = ma.movie_id
where title = 'The Fifth Element'

