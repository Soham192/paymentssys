1.model is where we store the data or the objects/entities that we are going to use 
it is connected to the repository class which where all the db code is written

2.dependency injection using @Autowired annotation 

3.In Spring, a Service is a class that holds your business logic — it's where you write code that connects your controller (HTTP layer) to your repository (DB layer).

4.Optional Methods for Further Exploration:
isPresent(): Returns true if the value is present, otherwise false.

get(): Retrieves the value if present, otherwise throws NoSuchElementException.

ifPresent(Consumer<? super T> action): Executes the given action if the value is present.

orElse(T other): Returns the value if present, otherwise returns the provided fallback value.

orElseThrow(): Throws an exception if the value is not present.

28/4/25

1.ResponseEntity?
it is a spring boot class 
it wraps an http response and send it ,meaning it sends data,status codes and  response headers(optional)
<?> this is the flexible return type which means the response could be  anything

2.What really is an http request?
It is a meesage sent by the client(browser/app/form) to the server 
now the structure of http is quite an interesting part but not relevant to the current trajctory so we will 
delve into it later(it is in json format)

@RequestBody
what this annotation does it converts the incoming json body in the http request to java object 
this JSON body is just text at first.
But your Java method needs to work with real Java objects (like a Person class).

So frameworks (like Spring Boot) automatically convert (deserialize) the JSON into a Java object for you.

29/4/25
The LoginRequest class is not the same as your User class.
It's a DTO (Data Transfer Object) used only for login. You are not setting the user's password here permanently — you're just receiving the credentials temporarily for authentication.

String token = authService.login(loginRequest)//what does loginRequest here mean

@PostMapping("/login") is a Spring Boot annotation that maps an HTTP POST request to a method in your controller.

many things are based on how a http request is structured in json format


3/5/25
Where is the data stored in Jpa repo is a question that arises
what is hibernate
what is an in-memory database like H2, ?
:-so I just want to build the backend logic first then I can use H2 which automatically builds the db in ram and isnt saved and
can be used for devlopment and testing  
to need this I need to config applications.properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true

.properties files use a simple key-value format, not a programming language — they are configuration files, similar to .env files in other stacks.

We need to understand what bean is//this related to dependency injection
a bean is an object 
what is dependency injection,IOC,J2EE
