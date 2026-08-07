# JDBC

A small Java demo showing how to connect to a PostgreSQL database using JDBC and run basic SQL statements (select, insert, update, delete).

## Requirements

- JDK
- PostgreSQL running locally
- PostgreSQL JDBC driver (`org.postgresql.Driver`) on the classpath

## Setup

1. Update the connection details in [src/demoJDBC.java](src/demoJDBC.java):
   ```java
   String url = "jdbc:postgresql://localhost:5432/postgres";
   String uname = "postgres";
   String pass = "yourpassword";
   ```
2. Make sure a `student` table exists in the target database, since the sample queries operate on it.

## Steps covered

1. Import the JDBC packages
2. Load the driver
3. Register the driver
4. Create a connection
5. Create a statement
6. Execute the statement
7. Close the connection

## Run

Compile and run `demoJDBC.java` with the PostgreSQL JDBC driver on the classpath.
