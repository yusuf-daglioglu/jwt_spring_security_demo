# ABOUT THIS REPOSITORY

Simple demo using:

- JSON Web Token (JWT)
- Spring Security
- Spring Boot

## Requirements

- Maven 3
- Java 1.8

## Usage

run Spring Boot maven plugin:

> mvn spring-boot:run

Go to:

<http://localhost:8080>

## Users

- Admin - admin:admin
- User - user:password
- Disabled - disabled:password

## User Passwords

<https://en.wikipedia.org/wiki/Bcrypt> is using to encode passwords.

## Database

- <http://localhost:8080/h2-console/>
- This demo project use H2 db. If you want to change it, change the values of *application.yml*.
- For other databases like MySQL sequences don't work for ID generation. So you have to change the GenerationType in the
  entity beans to 'AUTO' or 'IDENTITY'.

## JWT-Decode

I use this library:

<https://github.com/auth0/jwt-decode>

jwt-decode is a small browser library that helps to decode JWTs token which are Base64Url encoded.

## Attribution

This project is derived from https://github.com/szerhusenBC/jwt-spring-security-demo and includes modifications and adaptations.

Both the original work and the modifications are licensed under the MIT License.
