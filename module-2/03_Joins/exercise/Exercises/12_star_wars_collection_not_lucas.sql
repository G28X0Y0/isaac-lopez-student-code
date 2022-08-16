-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas (5 rows)
SELECT title
FROM movie
JOIN collection c ON movie.collection_id = c.collection_id
join person p on p.person_id = movie.director_id
WHERE collection_name = 'Star Wars Collection'
AND person_name != 'George Lucas'
