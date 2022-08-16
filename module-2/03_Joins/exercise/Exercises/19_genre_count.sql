-- 19. The genre name and the number of movies in each genre. Name the count column 'num_of_movies'. 
-- (19 rows, expected result for Action is around 180).
SELECT COUNT(title) AS num_of_movies, genre_name
FROM genre
JOIN movie_genre mg on genre.genre_id = mg.genre_id
JOIN movie m on mg.movie_id = m.movie_id
GROUP BY genre_name
