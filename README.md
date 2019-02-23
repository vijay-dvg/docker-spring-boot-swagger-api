
#Command to run the mysql container 
#docker run --name mysql-dev-container -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=dev -e MYSQL_USER=root -e #MYSQL_PASSWORD=root -d mysql:5.6

#Command to run the Spring Boot container
#docker run -p 8081:8081 --name employee-docker --link mysql-dev-container:mysql -d employee-docker


# Now when our REST APIs are properly annotated, let’s see the final output. Open
#
# http://localhost:8080/swagger2-demo/swagger-ui.html 
#
# To see the Swagger UI documentation in the browser.
    