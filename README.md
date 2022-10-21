<h1 align="center"> FLOW </h1>
<p align="center">Data visualization of earth's water ressources<p>
<p align="center">FLOW allows users to create an account, using BCrypt for authentication, to keep track of their own personal water footprint. Each entry will be stored in a MySQL database, which can be referenced and deleted on the user's dashboard. Each entry will then be displayed on a graph, made with Graph.js, to allow each user to visually track see how much water they have consumed over the course of their account life.<p>
<h2 align="center">Technologies Used:</h2>
<p align="center"> Java  |  JavaScript  |  MySQL  |  CSS  |  HTML  |  BCrypt  |  External APIs  |  Graph.js </p>
<p align="center">
<img width="400" alt="flow1" src="https://user-images.githubusercontent.com/108160931/197217800-54cda562-d456-411f-8c5d-6ca307a61515.gif">
<img width="400" alt="flow1" src="https://user-images.githubusercontent.com/108160931/197217890-9f13beb0-23f7-405a-ac2c-6f411564265f.gif">
<img width="400" alt="flow1" src="https://user-images.githubusercontent.com/108160931/197217941-40e677aa-5f9a-49e5-83b0-64edb3481e98.gif">
<img width="400" alt="flow1" src="https://user-images.githubusercontent.com/108160931/197217964-72330acb-8dca-42c8-ace9-9aea950d61b4.gif">
<img width="400" alt="flow1" src="https://user-images.githubusercontent.com/108160931/197217991-5593cf4f-452e-489c-87c8-e41cf25fa684.gif">
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
<div>
   <h2>Citations</h2>
      <ul>
        <li>https://www.cdc.gov/healthywater/global/wash_statistics.html</li>
        <li>https://ourworldindata.org/water-access</li>
        <li>https://www.theworldcounts.com/challenges/state-of-the-planet/when-will-the-world-run-out-of-water</li>
        <li>https://www.worldometers.info/water/</li>
        <li>https://www.wri.org/insights/domestic-water-use-grew-600-over-past-50-years</li>   
   </ul>
 </div>
