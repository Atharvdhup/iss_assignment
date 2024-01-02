-- Creating the database
CREATE DATABASE IF NOT EXISTS CompanyDatabase;

-- Using the created database
USE CompanyDatabase;

-- Creating sample tables
CREATE TABLE IF NOT EXISTS Departments (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS Employees (
    EmployeeID INT PRIMARY KEY,
    EmployeeName VARCHAR(50),
    DepartmentID INT,
    FOREIGN KEY (DepartmentID) REFERENCES Departments(DepartmentID)
);

-- Inserting sample data 
INSERT INTO Departments (DepartmentID, DepartmentName)
VALUES
    (1, 'Human Resources'),
    (2, 'Information Technology'),
    (3, 'Finance');

INSERT INTO Employees (EmployeeID, EmployeeName, DepartmentID)
VALUES
    (101, 'Rahul Sharma', 1),
    (102, 'Priya Verma', 2),
    (103, 'Amit Patel', 1),
    (104, 'Sneha Gupta', 3);
    
    
 -- INNER JOIN
SELECT Employees.EmployeeID, Employees.EmployeeName, Departments.DepartmentName
FROM Employees
INNER JOIN Departments ON Employees.DepartmentID = Departments.DepartmentID;

-- LEFT JOIN (or LEFT OUTER JOIN)
SELECT Employees.EmployeeID, Employees.EmployeeName, Departments.DepartmentName
FROM Employees
LEFT JOIN Departments ON Employees.DepartmentID = Departments.DepartmentID;

-- RIGHT JOIN (or RIGHT OUTER JOIN)
SELECT Employees.EmployeeID, Employees.EmployeeName, Departments.DepartmentName
FROM Employees
RIGHT JOIN Departments ON Employees.DepartmentID = Departments.DepartmentID;

-- FULL JOIN (or FULL OUTER JOIN)

SELECT Employees.EmployeeID, Employees.FirstName, Employees.LastName, Departments.DepartmentName
FROM Employees
FULL JOIN Departments ON Employees.DepartmentID = Departments.DepartmentID;


-- Create a sample table
CREATE TABLE IF NOT EXISTS Students (
    StudentID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Age INT,
    Grade INT
);

-- Insert some sample data
INSERT INTO Students (FirstName, LastName, Age, Grade)
VALUES ('John', 'Doe', 20, 85),
       ('Jane', 'Smith', 22, 92),
       ('Amit', 'Patel', 21, 78),
       ('Priya', 'Sharma', 23, NULL),
       ('Raj', 'Kumar', NULL, NULL);

-- Display the initial data
SELECT * FROM Students;

-- Drop a column (e.g., removing the Grade column)
ALTER TABLE Students
DROP COLUMN Grade;

-- Add a new column (e.g., adding a new column for Department)
ALTER TABLE Students
ADD COLUMN Department VARCHAR(50);

-- Update values in the new column
UPDATE Students
SET Department = 'Computer Science'
WHERE StudentID = 1;

-- Display the updated data
SELECT * FROM Students;

-- Create a view based on a SELECT query
CREATE VIEW StudentSummary AS
SELECT FirstName, LastName, Age
FROM Students
WHERE Age IS NOT NULL;

-- Display data from the view
SELECT * FROM StudentSummary;

-- Group data by the Age column and calculate the average age for each group
SELECT Age, AVG(Age) AS AvgAge
FROM Students
GROUP BY Age
HAVING Age IS NOT NULL;

-- Show the count of records for each age group
SELECT Age, COUNT(*) AS NumStudents
FROM Students
GROUP BY Age
HAVING Age IS NOT NULL;

-- Use NULL functions to handle NULL values
-- For example, display the age and the average age (ignoring NULL values)
SELECT Age, AVG(IFNULL(Age, 0)) AS AvgAge
FROM Students
GROUP BY Age;
 
