# Queries

SELECT * FROM CITY LEFT JOIN COUNTRY
ON CITY.country_id = COUNTRy.country_id;

SELECT payment_id , first_name, last_name FROM CUSTOMER 
RIGHT JOIN PAYMENT ON CUSTOMER.customer_id = PAYMENT.customer_id;

SELECT rental_id , first_name, last_name FROM CUSTOMER
LEFT JOIN RENTAL ON CUSTOMER.customer_id = RENTAL.customer_id;