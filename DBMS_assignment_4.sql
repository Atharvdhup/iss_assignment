CREATE DATABASE IF NOT EXISTS NewCompanyDB;
use NewCompanyDB;
-- Create a sample table
CREATE TABLE IF NOT EXISTS Employees (
    EmployeeID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Salary INT
);

-- Insert some sample data
INSERT INTO Employees (FirstName, LastName, Salary)
VALUES ('John', 'Doe', 50000),
       ('Jane', 'Smith', 60000),
       ('Amit', 'Patel', 75000),
       ('Priya', 'Sharma', 90000),
       ('Raj', 'Kumar', 80000);

-- Create a stored procedure
DELIMITER //
CREATE PROCEDURE GetEmployeeBySalary(IN minSalary INT)
BEGIN
    SELECT * FROM Employees WHERE Salary >= minSalary;
END //
DELIMITER ;

-- Use CallableStatement to call the stored procedure
-- This can be done in a Java application, for example
-- In MySQL Workbench, you can use CALL GetEmployeeBySalary(70000);

DELIMITER //
CREATE PROCEDURE GetEmployeeBySalaryJava(IN minSalary INT)
BEGIN
    SET @sql = 'CALL GetEmployeeBySalary(?)';
    PREPARE stmt FROM @sql;
    SET @minSalary = minSalary;
    EXECUTE stmt USING @minSalary;
    DEALLOCATE PREPARE stmt;
END //
DELIMITER ;

-- Prepare a statement to update employee salary
PREPARE UpdateSalaryStmt FROM 'UPDATE Employees SET Salary = ? WHERE EmployeeID = ?';

-- Update salary using PreparedStatement
SET @employeeIDToUpdate = 1;
SET @newSalary = 55000;
EXECUTE UpdateSalaryStmt USING @newSalary, @employeeIDToUpdate;

-- Display the updated data
SELECT * FROM Employees;

-- Clean up prepared statements
DEALLOCATE PREPARE UpdateSalaryStmt;

