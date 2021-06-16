
create user payroll with encrypted password 'payroll123' createdb;

create database payroll_db with owner = payroll;

grant all privileges on database payroll_db to payroll;