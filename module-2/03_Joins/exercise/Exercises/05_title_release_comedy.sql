-- 5. The titles and release dates of all the movies that are in the Comedy genre. Order the results by release date, earliest to latest. (220 rows)
SELECT title, release_date
FROM genre
JOIN movie_genre mg on genre.genre_id = mg.genre_id
JOIN movie m on mg.movie_id = m.movie_id
where genre_name = 'Comedy'
ORDER BY release_date

