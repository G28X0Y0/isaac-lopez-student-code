-- 17. The titles and taglines of movies that are in the "Family" genre and Samuel L. Jackson has acted in (4 rows)
SELECT title, tagline
FROM movie
JOIN movie_genre mg on movie.movie_id = mg.movie_id
JOIN movie_actor ma on movie.movie_id = ma.movie_id
JOIN person p on ma.actor_id = p.person_id
JOIN genre g on mg.genre_id = g.genre_id
WHERE genre_name = 'Family' AND person_name = 'Samuel L. Jackson'

