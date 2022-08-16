-- 4. The titles and taglines of all the movies that are in the Fantasy genre. Order the results by title (A-Z) (81 rows)
SELECT title, tagline
FROM genre
JOIN movie_genre mg on genre.genre_id = mg.genre_id
join movie m on m.movie_id = mg.movie_id
where genre_name = 'Fantasy'
order by title

