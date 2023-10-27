SELECT product_name FROM customer c
JOIN orders o on c.id = o.customer_id
WHERE name = :name