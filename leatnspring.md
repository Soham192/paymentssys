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
