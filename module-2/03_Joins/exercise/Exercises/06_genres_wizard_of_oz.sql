-- 6. The genres of "The Wizard of Oz" (3 rows)
SELECT genre_name
FROM movie
JOIN movie_genre mg on movie.movie_id = mg.movie_id
JOIN genre g on g.genre_id = mg.genre_id
WHERE title = 'The Wizard of Oz'

