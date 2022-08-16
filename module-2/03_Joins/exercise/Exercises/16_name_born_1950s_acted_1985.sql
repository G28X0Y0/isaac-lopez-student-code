-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985 (20 rows)
SELECT distinct person_name, birthday
FROM person
JOIN movie_actor ON person.person_id = movie_actor.actor_id
JOIN movie ON movie_actor.movie_id = movie.movie_id
WHERE birthday BETWEEN '12/31/1949' AND '1/1/1960'
AND release_date BETWEEN '12/31/1984' AND '1/1/1986'
