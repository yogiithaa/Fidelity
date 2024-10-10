CREATE TABLE Customers (
    customer_id VARCHAR(10) PRIMARY KEY,
    customer_name VARCHAR(50),
    address VARCHAR(100),
    phone_number VARCHAR(15),
    email VARCHAR(50)
);

INSERT INTO Customers VALUES
('1', 'Yogitha C', 'Church street', '9897969594', 'yogitha@gmail.com'),
('2', 'Anagha', 'sampige road', '6453278901', 'anagha@yahoo.com'),
('3', 'Rekha', 'MG road', '745789012', 'rekha@gmail.com'),
('4', 'Ram N', 'hebbal', '7675367923', 'ram@hotmail.com');

select * from Customers

CREATE TABLE Hotel_details (
    hotel_id INT PRIMARY KEY,
    hotel_name VARCHAR(50),
    hotel_type VARCHAR(20),
    rating DECIMAL(3,1)
);

INSERT INTO Hotel_details VALUES
(1, 'A2B', 'VEG', 4.5),
(2, 'Pizza Hut', 'NON-VEG', 4.2),
(3, 'Dominos', 'NON-VEG', 4.0),
(4, 'KFC', 'NON-VEG', 3.8);

select * from Hotel_details;

CREATE TABLE Delivery_partners (
    partner_id INT PRIMARY KEY,
    partner_name VARCHAR(50),
    phone_number VARCHAR(15),
    rating DECIMAL(3,1)
);

INSERT INTO Delivery_partners VALUES
(101, 'Rahul', '998902434', 4.6),
(102, 'Wasim', '985347845', 4.1),
(103, 'Tripti','7329865346', 3.4),
(104, 'Eshwar', '9980089753', 4.5);

select * from Delivery_partners;

CREATE TABLE Orders (
    order_id INT PRIMARY KEY,
    customer_id VARCHAR(20),
    hotel_id INT,
    order_date DATE,
    order_amount DECIMAL(10,2),
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
    FOREIGN KEY (hotel_id) REFERENCES Hotel_details(hotel_id)
);

INSERT INTO Orders VALUES
(1, '1', 1, '2024-08-05', 500.00),
(2, '2', 2, '2024-08-26', 750.00),
(3, '3', 3, '2024-08-20', 600.00),
(4, '4', 4, '2024-08-15', 800.00),
(5, '1', 2, '2024-08-09', 700.00),
(6, '2', 3, '2024-09-16', 550.00),
(7, '3', 1, '2024-09-29', 450.00);

select * from Orders;

--question 1

SELECT partner_id, partner_name, phone_number
FROM Delivery_partners
WHERE rating BETWEEN 3 AND 5
ORDER BY partner_id;

--question 2

UPDATE Customers
SET phone_number = '9876543210'
WHERE customer_id = '4';

--question 3
SELECT customer_id, customer_name, address, phone_number
FROM Customers
WHERE email LIKE '%@gmail.com'
ORDER BY customer_id

--question 4
ALTER TABLE Customers
ALTER COLUMN customer_id TYPE INT USING customer_id::integer;

--question 5
ALTER TABLE Hotel_Details
RENAME COLUMN Rating TO Hotel_Rating;

--question 6
SELECT CONCAT(hotel_name, ' is a ', hotel_type, ' hotel') AS HOTEL_INFO
FROM Hotel_details
ORDER BY HOTEL_INFO DESC;

--question 7
SELECT h.hotel_id, h.hotel_name, COUNT(*) AS NO_OF_ORDERS
FROM Hotel_details h
JOIN Orders o ON h.hotel_id = o.hotel_id
GROUP BY h.hotel_id, h.hotel_name
HAVING COUNT(*) > 5
ORDER BY h.hotel_id ASC;

--question 8
SELECT DISTINCT h.hotel_id, h.hotel_name, h.hotel_type
FROM Hotel_details h
LEFT JOIN Orders o ON h.hotel_id = o.hotel_id AND TO_CHAR(o.order_date, 'YYYY-MM') = '2024-09'
WHERE o.order_id IS NULL
ORDER BY h.hotel_id ASC;

--question 9
SELECT o.order_id, c.customer_name, h.hotel_name, o.order_amount
FROM Orders o
JOIN Customers c ON o.customer_id = c.customer_id
JOIN Hotel_details h ON o.hotel_id = h.hotel_id
ORDER BY o.order_id 

--question 10
CREATE TABLE PIZZA (
    pizza_id VARCHAR(10) PRIMARY KEY,
	customer_id VARCHAR(10),
	partner_id VARCHAR(10),
	pizza_name VARCHAR(15),
    pizza_type VARCHAR(15),
	order_date DATE,
    amount BIGINT
);

--question 10
UPDATE PIZZA
SET amount = amount * 0.97
WHERE pizza_type = 'Extra Large';

select * from PIZZA;

--question 11

CREATE TABLE IF NOT EXISTS salesman (
    salesman_id INT PRIMARY KEY,
    name VARCHAR(30),
	city VARCHAR(15),
	commission DECIMAL(5,2)
);

CREATE TABLE IF NOT EXISTS new_orders (
    order_id INT PRIMARY KEY,
    order_date DATE,
    amount DECIMAL(10, 2),
	customer_id INT,
    salesman_id INT,
    FOREIGN KEY (salesman_id) REFERENCES salesman(salesman_id)
);

--question 12
CREATE TABLE IF NOT EXISTS Supplier (
    supplier_id INT PRIMARY KEY,
    supplier_name VARCHAR(50),
	address VARCHAR(100),
	Contact VARCHAR(10)
);

ALTER TABLE Supplier
ADD CONSTRAINT check_supplier_number CHECK (LENGTH(Contact) > 11);

SELECT * FROM Supplier;