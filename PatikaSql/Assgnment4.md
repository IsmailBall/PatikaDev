# Queries

SELECT DISTINCT replacement_cost FROM film;

SELECT COUNT(DISTINCT replacement_cost) FROM film;

SELECT COUNT(*) FROM film WHERE title LIKE 'T%' AND rating = 'G';

SELECT COUNT(*) FROM city WHERE city LIKE '%r';