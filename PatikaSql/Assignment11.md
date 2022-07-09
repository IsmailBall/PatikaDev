# Queries

(Select first_name FROM customer)
UNION
(Select first_name FROM actor);

(Select first_name FROM customer)
INTERSECT
(Select first_name FROM actor);

(Select first_name FROM customer)
EXCEPT
(Select first_name FROM actor);