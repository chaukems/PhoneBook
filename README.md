Steps to run the app

Database Mysql

CREATE DATABASE PHONE_BOOK;
CREATE USER 'phonebook'@'localhost' IDENTIFIED BY 'phonebook';
GRANT ALL PRIVILEGES ON * . * TO 'phonebook'@'localhost';

Run PhoneBook (springboot) using maven, it will load all the tables using flyway 

Run PhoneBookWebApp, this is an angular frontend, npm install to load all the required node_module
npm start
navigate to localhost:4200
