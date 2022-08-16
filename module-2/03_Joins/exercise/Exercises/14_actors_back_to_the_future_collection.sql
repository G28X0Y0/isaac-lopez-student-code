-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection" (28 rows)
SELECT distinct person_name
FROM person
JOIN movie_actor ma on person.person_id = ma.actor_id
JOIN movie m on m.movie_id = ma.movie_id
JOIN collection c on c.collection_id = m.collection_id
where collection_name = 'Back to the Future Collection'
