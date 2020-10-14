CREATE DATABASE testDB
CREATE LOGIN test WITH PASSWORD = 'TestPwd@345'
USE testDB
CREATE USER test FOR LOGIN test
EXEC sp_addrolemember 'db_owner',test
GO
