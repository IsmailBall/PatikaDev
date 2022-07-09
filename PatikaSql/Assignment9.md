# Queries

SELECT * FROM CITY
INNER JOIN COUNTRY ON
CITY.country_id = COUNTRY.country_id

SELECT payment_id , first_name, last_name FROM CUSTOMER
INNER JOIN PAYMENT ON
CUSTOMER.customer_id = PAYMENT.customer_id

SELECT rental_id , first_name, last_name FROM CUSTOMER
INNER JOIN RENTAL ON
CUSTOMER.customer_id = RENTAL.customer_id