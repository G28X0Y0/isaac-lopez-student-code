-- 9. The titles of movies directed by James Cameron (6 rows)
SELECT title
FROM movie
JOIN person p on movie.director_id = p.person_id
where person_name = 'James Cameron'
