{\rtf1\ansi\deff0\nouicompat{\fonttbl{\f0\fnil\fcharset0 Calibri;}}
{\*\generator Riched20 10.0.19041}\viewkind4\uc1 
\pard\sa200\sl276\slmult1\f0\fs22\lang31 # Queries\par
\par
SELECT * FROM film WHERE LENGTH > (select AVG(length) from film);\par
\par
SELECT COUNT(*) FROM film WHERE rental_rate = (SELECT MAX(rental_rate) FROM film);\par
\par
SELECT * FROM film WHERE rental_rate = (SELECT MAX(rental_rate) FROM film) AND \par
replacement_cost = (SELECT MAX(replacement_cost) FROM film);\par
\par
SELECT customer_id, COUNT(*) FROM payment GROUP BY customer_id ORDER BY COUNT(*) DESC\par
}
 