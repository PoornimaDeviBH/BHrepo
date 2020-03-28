Overview
This RESTfulWebService project is developed to solve the problems explained & to meet the ACs in ProblemStmt file. This REST API is created using the Java Spring framework. There are two different rest end points exposed which are
1. /RESTfulWebService/rest/api/getproductdetails
2. /RESTfulWebService/rest/api/getconfigdetails

Used Tools and Softwares
1. Eclipse IDE for Enterprise Java Developers.
Version: 2020-03 (4.15.0)
2. JDK14
3. Spring 4.3
4. Tomcat v.5
5. SoapUI 5.5

Artifacts/Dependencies
jackson-databind-2.100.jar
jackson-annotations-2.10.0.jar
jackson-core-2.10.0.jar
spring-context-4.3.0.RELEASE.jar
spring-aop-4.3.0.RELEASE.jar
spring-beans-4.3.0.RELEASE.jar
spring-core-4.3.0.RELEASE.jar
commons.logging-1.2.jar
spring-expression-4.3.0.RELEASE.jar
spring-webmvc-4.3.0.RELEASE.jar
spring-web-4.3.0.RELEASE.jar
javax.inject-1.jar
servlet-api-2.5.jar

How to Run in Local
1. Import RESTfulWebService project as Maven project from GitHub.
2. Go to Maven -> Update Project to add dependencies included in pom.xml to your local repository.
3. Build and Run as server using application server such as Tomcat, websphere, etc

How to Validate/Test
1. Use any one of tesing tool such as soapUI, postman, or ReadyAPI.
2. Import the soapUI project (RESTfulWebService-soapui-project.xml) provided in GitHub.
3. Below are the Authentications provided for each end points
i. getProductDetails
UserName : PRODUCT
Password : PRODUCT
ii. getConfigDetails
UserName : CONFIG
Password : CONFIG
4. Below are the Http stauts code returned for both end points
i. 200 - Accepted
ii. 400 - Bad Request (If Authentication header is not included)
iii. 403 - Forbidden (For wrong credentials)
iv. 500 - Internal server error

