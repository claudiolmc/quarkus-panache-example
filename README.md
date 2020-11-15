# quarkus-panache-example project

This is a small [Quarkus](https://quarkus.io/) project to show how to use de Panache Library to access a SQL Database.

In this example we are using MySQL as the database. In the **database** folder you can find the script to populate the database.

In MySQL create a database called **example_db** and than run the following command to populate de database:

```shell
$ mysql -u <USER_NAME> -p example_db < database/example_db.sql
```

Edit the file src/main/resources/application.properties and change the database connection properties.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

Using a browser ou a REST client tool test the application using the following URLs:

[http://localhost:80809/country](http://localhost:80809/country)

or

[http://localhost:8080/country/27](http://localhost:8080/country/27)


