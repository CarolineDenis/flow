<h1 align="center"> FLOW </h1>
<p align="center">Data visualization of earth's water ressources<p>
<p align="center">FLOW allows users to create an account, using BCrypt for authentication, to keep track of their own personal water footprint. Each entry will be stored in a MySQL database, which can be referenced and deleted on the user's dashboard. Each entry will then be displayed on a graph, made with Graph.js, to allow each user to visually track see how much water they have consumed over the course of their account life.<p>
<h2 align="center">Technologies Used:</h2>
<p align="center"> Java  |  JavaScript  |  MySQL  |  CSS  |  HTML  |  BCrypt  |  External APIs  |  Graph.js </p>
<p align="center">
<img width="400" alt="flow1" src="https://user-images.githubusercontent.com/108160931/196275508-f2f99408-ec8c-45c6-9e77-3ae2d639f6fc.png">
<img width="400" alt="flow2" src="https://user-images.githubusercontent.com/108160931/196275515-2873ae49-8a2c-4b88-b23c-f56a49bc08a5.png">
<img width="400" alt="flow3" src="https://user-images.githubusercontent.com/108160931/196275535-599e4283-47db-44a1-b6a9-5111d7a502ab.png">
<img width="400" alt="flow4" src="https://user-images.githubusercontent.com/108160931/196275543-f4c43511-bc2d-484b-abc9-6d4860c59933.png">
<img width="400" alt="flow5" src="https://user-images.githubusercontent.com/108160931/196275550-538816e7-7782-49f1-bc2c-5308470f31c5.png">
<img width="400" alt="flow6" src="https://user-images.githubusercontent.com/108160931/196275555-acb17cac-7daf-4009-aa28-e39b93f97689.png">
<img width="400" alt="flow7" src="https://user-images.githubusercontent.com/108160931/196275561-f8ae5092-1775-45a0-bf4c-e6cd6919cef6.png">
<img width="400" alt="flow8" src="https://user-images.githubusercontent.com/108160931/196275568-02f90f14-3a21-427b-b7fb-dc1130fab247.png">
</p>
<div>
  <h2>Installation</h2>
  <ul>
    <li>After downloading, you will need to create a new database in MySQL.</li>
    <li>Verify that all dependencies are in your pom.xml (jbcrypt, spring-boot-starter-validation, jquery, bootstrap, webjars-locator, tomcat-embed-jasper)
    <li>In Spring Tool Suite, open the application.properties file (src-> main-> resources)</li>
        <ul>
          <li>Enter your newly created schema name after the following code: spring.datasource.url={your_schema}</li>
          <li>Enter your MySQL username after the following code: spring.datasource.username={your_username}</li>
          <li>Enter your MySQL password after the following code: spring.datasource.password={your_password}</li>
          <li>spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver</li>
          <li>spring.jpa.hibernate.ddl-auto=update</li>
          <li>spring.mvc.view.prefix=/WEB-INF/</li>
          <li>spring.mvc.hiddenmethod.filter.enabled=true</li>
          <li>api.key={your_api_key}</li>
              <ul>
                <li>Sign up for Live World Data API to get your own api.key (https://rapidapi.com/jonaskoscielny/api/live-world-data)</li>
              </ul>
    </ul>
    </div>
