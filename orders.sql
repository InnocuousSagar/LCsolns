SELECT o.order_id, order_dt, description, amount FROM ORDERS o
JOIN (
	SELECT cust_id, MAX(order_dt) FROM ORDERS
	GROUP BY cust_id) as A
ON A.cust_id = o.cust_id AND A.order_dt = o.order_dt 