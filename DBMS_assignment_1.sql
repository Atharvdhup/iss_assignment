CREATE DATABASE IF NOT EXISTS mydatabase;

USE mydatabase;

CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL
);

INSERT INTO users (username, email) VALUES
    ('user1', 'user1@example.com'),
    ('user2', 'user2@example.com'),
    ('user3', 'user3@example.com');


-- Creating a sample table
CREATE TABLE IF NOT EXISTS Employees (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Age INT,
    Salary DECIMAL(10, 2)
);

-- Inserting sample data
INSERT INTO Employees (EmployeeID, FirstName, LastName, Age, Salary)
VALUES
    (1, 'Rahul', 'Kumar', 30, 50000.00),
    (2, 'Priya', 'Verma', 25, 60000.00),
    (3, 'Amit', 'Patel', 35, 75000.00),
    (4, 'Sneha', 'Gupta', 28, 55000.00);

-- SELECT statement
SELECT * FROM Employees;

-- DISTINCT
SELECT DISTINCT Age FROM Employees;

-- WHERE
SELECT * FROM Employees WHERE Age > 30;

-- AND 
SELECT * FROM Employees WHERE Age > 25 AND Salary > 55000.00;
-- OR
SELECT * FROM Employees WHERE Age > 30 OR Salary > 60000.00;
-- ORDER BY
SELECT * FROM Employees ORDER BY Age DESC;

-- UPDATE
UPDATE Employees SET Salary = 65000.00 WHERE EmployeeID = 1;

-- DELETE
DELETE FROM Employees WHERE EmployeeID = 2;



-- SELECT TOP (equivalent to LIMIT in some databases)
-- SELECT TOP 2 * FROM Employees;
SELECT * FROM Employees LIMIT 2;

-- LIKE and wildcards
SELECT * FROM Employees WHERE FirstName LIKE 'J%';

-- IN
SELECT * FROM Employees WHERE Age IN (25, 28);

-- BETWEEN
SELECT * FROM Employees WHERE Salary BETWEEN 55000.00 AND 75000.00;

-- Aliases
SELECT FirstName AS First, LastName AS Last, Age AS Employee_Age FROM Employees;
