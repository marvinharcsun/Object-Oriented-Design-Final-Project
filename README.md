### To start using please visit https://warm-tundra-14923.herokuapp.com/ . 

# Object-Oriented-Design-Final-Project (REPO CURRENTLY UNDER CONSTRUCTION)
The repository where front end and backend code lives for the Comp 586 (OOD)  at California State University, Northridge. 

### Backend unit tests under path /backend/src/test/java/com/example/demo

### What can an one do. (Functional Requirements)
1. Create an Account (For more benefits, if you have proper credentials) (Remember authentication occurs with the help of auth0 jwt tokens, token renewal)
2. Receive an Email Verification for a Created Account
3. Forget or Reset Password (only if you have a verified and created account)
4. Help Chat (if you have any questions)
5. An Analysis of Items Frequently Purchased and How Popular is Each Item
6. Profile information (Logged in Ofcourse) 
7. Calculator on your dashboard if you need help calculating 
8. When is the best time to order (Anaylsis among Orders made and time (K Means), histogram (which day of the weeks most orders occur), scatter plot (orders per hour), histogram (frequency of orders through out the day) (This feature is only available for authenticated users) 
9. Items LetssShop offers (Including the aisle it is located on and the department!)
10. If you are authenticated and logged into our system you are able to edit, and view departments.
11. If you are authenticated and logged into our system you are able to edit, and view aisles.
11. If you are authenticated and logged into our system you are able to create,view, edit, or delete products and the metadata of the products we offer.
11. If you are authenticated and logged into our system you are able to create,view, edit, or delete orders (All orders consist of who ordered it, what they ordered, is it active, and, and the unique order number).
### Technologies used
1. MySQL
2. Google Cloud Services
3. Angular Cli 
4. FontAwesome
5. Bootstrap 
6. SpringBoot 
7. JUNIT (Unit testing for Spring Boot)
8. Jasmine Unit Testing Framework  (Unit testing for Angular Cli)
9. Heroku for BackEnd /Frontend Api Deployment 

### Concepts being used
1. Model View Controller architecture 
2. Object Relational Mapping 
3. Dependency Injection 
4. Authentication (JWT token)
5. Identity Management 
6. Machine Learning 
7. Unit testing 
8. Single Page Application (SPA)
9. ORM implementation of classes with inheritance

# LetsShop-Recommendation-Algorithms
## Machine Learning and Statistical Related is Housed Via
https://github.com/vanessailana/LetsShop-Recommendation-Algorithms-
1. Using Diaglow Flow we were able to train and create a conversational interface. 
2. Statistical Anaylsis on inventory and times of purchases. (Histograms, KMeans, Scatter Plots)

### Heads up how to alter this to your local environment. 
-  If you want to run this within your local environment, you must do as follows:
- Angular client cd into the frontend directory, npm install,npm install -g @angular/cli, and ng serve 
- Remember you must replace all service links with localhost:9090  (but keep the path)
- Spring boot server cd into backend. Do an mvn install, spring-boot:run 
- You must configure all controllers and classes within the repo folder to have a Cross Origins of localhost:4200, or to ensure the client is able to access the data.
- You must run both these processes simultaneously.  
- Go to localhost:4200 , and then you should be ready to go. 
