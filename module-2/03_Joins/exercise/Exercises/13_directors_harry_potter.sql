-- 13. The directors of the movies in the "Harry Potter Collection" (4 rows)
SELECT DISTINCT person_name
FROM person
JOIN movie m on person.person_id = m.director_id
JOIN collection c on c.collection_id = m.collection_id
where collection_name = 'Harry Potter Collection'
