
ТЕХСТЕК
----------
Spring Boot
https://spring.io/projects/spring-boot
Thymeleaf
https://www.thymeleaf.org/
Lombok
https://projectlombok.org/
Bootstrap 5
https://getbootstrap.com/
https://getbootstrap.com/docs/5.3/getting-started/introduction/
https://getbootstrap.com/docs/5.3/extend/icons/
MySQL 8
https://www.mysql.com/
Gson
https://github.com/google/gson

Додаткові ресурси
--------------------
https://tinypng.com/
https://favicon.io/favicon-converter/
https://pixabay.com/
https://unsplash.com/
https://www.flaticon.com/
https://pinetools.com/
https://www.iloveimg.com/
https://uigradients.com/

--------------------------------

1) Формуємо INFO/SQLs.sql

2) Переходимо до Spring Initializr
https://start.spring.io/

3) Конфігурація проекту
(цифрові позначення версій можуть
змінюватись з розвитком фреймворку):
a) Project: Maven
b) Spring Boot: обираємо стабільну версію,
без позначок в дужках
c) Project Metadata:
- Group: com.example.app
- Artifact: Spring-Boot-Web-Tours
- Name: WebTours
- Description: залишаємо так
- Packaging name: залишаємо так
- Packaging: Jar
- Java: 17
d) Dependencies:
- Spring Boot DevTools
- Lombok
- Spring Web
- Thymeleaf	
- Spring Data JPA
- MySQL Driver


Перевіряємо. Клікаємо GENERATE.
Має загрузитися zip-файл.

4) Зформований zip-файл розпакуємо,
переміщуємо в папку проектів.

5) Відкриваємо проект в IDE.
Досліджуємо
src/main/
pom.xml

6) Модифікуємо
com.example.app.SpringBootWebClients.WebClientsApplication

7) Формуємо контент в
- main.resources (папки static та templates,
файл application.properties - повинні додатись
дефолтно)
- com.example.app.SpringBootWebClients

8) Стартуємо програму. Дивимося логи.

9) В браузері, в адресному рядку запускаємо
localhost:8080
Повинен завантажитися Web-додаток.

10) Досліджуємо Web-додаток.
