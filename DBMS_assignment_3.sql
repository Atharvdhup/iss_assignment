-- Create Database
CREATE DATABASE IF NOT EXISTS MyCompanyDB;
USE MyCompanyDB;


-- Create Table with Constraints


-- Create Table with DEFAULT
CREATE TABLE IF NOT EXISTS Departments (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(50) NOT NULL,
    Location VARCHAR(100) DEFAULT 'Bangalore'
);

CREATE TABLE IF NOT EXISTS Employees (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Gender CHAR(1) CHECK (Gender IN ('M', 'F')),
    DateOfBirth DATE,
    DepartmentID INT,
    CONSTRAINT UC_EmployeeName UNIQUE (FirstName, LastName),
    CONSTRAINT FK_Department FOREIGN KEY (DepartmentID) REFERENCES Departments(DepartmentID)
);

-- Insert data using INSERT INTO SELECT
INSERT INTO Departments (DepartmentID, DepartmentName)
SELECT 1, 'IT' UNION
SELECT 2, 'HR' UNION
SELECT 3, 'Finance';

-- Insert data using INSERT INTO SELECT
INSERT INTO Employees (EmployeeID, FirstName, LastName, Gender, DateOfBirth, DepartmentID)
SELECT 101, 'Raj', 'Kumar', 'M', '1990-05-15', 1 UNION
SELECT 102, 'Priya', 'Sharma', 'F', '1988-12-20', 2 UNION
SELECT 103, 'Amit', 'Singh', 'M', '1995-08-08', 1;

-- Create Index
CREATE INDEX idx_DepartmentID ON Employees(DepartmentID);

-- Select Into
-- Declare variables


-- Create a temporary table to store the backup data
CREATE TEMPORARY TABLE IF NOT EXISTS TempEmployeesBackup (
    EmployeeID INT,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Gender CHAR(1),
    DateOfBirth DATE,
    DepartmentID INT
);

-- Insert data into the temporary table
INSERT INTO TempEmployeesBackup
SELECT
    EmployeeID,
    FirstName,
    LastName,
    Gender,
    DateOfBirth,
    DepartmentID
FROM Employees;

-- Display the data in the temporary table
SELECT * FROM TempEmployeesBackup;

-- Display Data
SELECT * FROM Employees;
SELECT * FROM Departments;
