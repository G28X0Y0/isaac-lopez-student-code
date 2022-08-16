-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie (73 rows)
SELECT distinct m.title, p.person_name
FROM person
JOIN movie_actor ma on person.person_id = ma.actor_id
JOIN movie m on m.movie_id = ma.movie_id
JOIN person p on p.person_id = ma.actor_id
JOIN movie m2 on p.person_id = m2.director_id
WHERE actor_id = m.director_id