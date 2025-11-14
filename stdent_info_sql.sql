CREATE DATABASE student_info_sql;
USE studentdb;

-- Paste the content ng file
CREATE TABLE Student_sql (
    student_id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    grade VARCHAR(5) NOT NULL
);
