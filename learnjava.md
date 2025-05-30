#1. @ This is the annotation which tells the compiler about your code
So What is Spring Actually Doing?
Let’s simplify it:

✅ 1. You compile code with javac
Annotations like @Service or @Component get stored in the .class file as metadata.

✅ 2. You run your Spring Boot app
Spring:

Scans .class files

Looks for annotations like @Component, @Service, etc.

For each one it finds, it:

Creates an object (like new UserService())

Registers it in the ApplicationContext (think: Spring’s big map of all objects)

This registered object = a Bean



#2.jpa is way to automate db management methods

#3 extends is used for inheritance(elaboration later)

#4 private and public are access identifiers (elaboration later)
private fields/objects can only be accesed through getter methods

#5 method definition
public User registerUser(User newuser) {
    // Code to save the new user to the database
    return newuser;
}
here User is the return type,User: This tells Java what kind of data the method will return. In this case, the method will return a User object after performing its logic (like saving the user to a database).

difference between static and not static method and why cant they make a reference to each other

What is method chaining?[1].
is is used to make the code more readable and smooth
/ Jwts.builder() returns a Builder object
Jwts.builder()
    .setSubject("user123")           // Returns Builder to allow chaining
    .setIssuer("myApp")              // Still returns Builder
    .setExpiration(new Date(...))    // Keeps returning Builder
    .signWith(SignatureAlgorithm.HS256, secretKey)
    .compact();  // Final step: compacts and returns the JWT as a String

Builder builder = Jwts.builder();
builder.setSubject("user123");
builder.setIssuer("myApp");
builder.setExpiration(new Date(...));
builder.signWith(SignatureAlgorithm.HS256, secretKey);
String jwt = builder.compact();
 //with and without



26/4/25

1.methods are first defined in class files with the syntax access_modifier type/return type method_name(parameters),although
the return types specifically doesnt have to be a pre declared class,if it is the return type then it must match the object's class
It could also be primitive data types like int,float,double,char,boolean
and if we dont return anything we use void
there is an exception for getter methods where we dont write parameters,why?
2.getter methods are used to acces private fields and maintain data integrity

3.Fields are variables declared at the class level and represent the state of an object or class.
Variables are a broader concept and can be local variables (inside methods) or fields (inside a class).


27/4/25
how is a constructor different from a function?
From what I have understood is constructor has the same name as the class name and it has no return type
es, constructors have no return type —
but they still return a fresh new object internally.

You just don't write the return type yourself.
for example we have the constructor 
public User(String email,int age)
{
    this.email = email;
    this.age = age;//instiaizing the values
}

User user1 = new User(savesoham5@gnail.com,44)
//what happens here is new keyword calls the User constructor and constructor intialises it with the object's fields
Java automatically returns the new object from memory.
	The returned object is stored in variable user.

when a method has a pre declared class as a type what is this oop property called?
When a method has a pre-declared class (or any class) as its return type or parameter type,
it mainly shows the OOP concept of "abstraction" and "encapsulation".

Abstraction:
➔ You are hiding complex details (how the class is built) and just exposing the type (Person, Order, etc.).
➔ The user of the method doesn’t need to know how the Person is created internally — just that they will get a Person.

Encapsulation:
➔ The class bundles data (fields) and methods (behavior) together.
➔ When your method returns a Person object, it is returning a self-contained unit of related data and behavior.

Using . means calling a method or accessing a property of an object.
It mainly shows encapsulation, abstraction, and message passing (OOP principles).


29/4/25
1.'this' is a reference to the current object;
if we take the example
public class LoginRequest{
    private String username;
    public void setUsername(String username){
        this.username = username;
    }
}
here the username on the lhs is used to refer to the field or instacne variable of the current object being worked on ,while the username on the right side is the parameter being passed on which holds value when the method setUsername is called;

30/4/25
what is jwts builder()
It is a method in simple terms from the jjwt library in java used to make jwt(i.e json web tokens)
now also a concept often used in this is method chaining(refer above)[1]

what is compact serialisation?
    is a

1/5/25
What is a no argument constructor and how does it differ from an empty constructor?
it isoften needed for frameworks and if any constructor is not defined at all java automatically assigns but the catch is there needs to be no constructor defined at all or it will throw an error

3/5/25
what exactly are .config files?
We are aware of the genreal definition that they are used to define settings but what do they exactly do 
and work
Config files like .json, .yaml, .env are usually not compiled. They're read at runtime or during build steps.
wrt java .properties and .xml files are loaded into memory by classes
 the .properties use key value format syntax


how is package different from a library?
think of lib as a toolbox and package as a tool
java.util //lib
java.util.concurrent //pac

private final String SECRET_KEY ;//this didnt worked
private  String SECRET_KEY ;//this worked why?
to understand we need to the understand final as it a keyword used the value cannot be changed after intial assignment

private final  String SECRET_KEY ;
    Authservice (String SECRET_KEY){
        this.SECRET_KEY=SECRET_KEY;
    }//can this also be done

What is a wildcard?

what is the purpose of authservice

what is <> in java ?
they are called generics are are used to deifne the class,method,interface type


29/5/25

private UserRepository userRepository;//even if we have imported UserRepository in Authservice why do we write this line
what this essentially does it tell the compiler where the class files exist 
We declare a member variable 
we do it because of dependency injection and IOC
 To enable this, frameworks use abstractions with additional behavior built in. If we want to add our own behavior, we need to extend the classes of the framework or plugin our own classes.//IOC


 2.Quite complex why we use interface here 
 public interface UserRepository extends JpaRepository<SigninRequest,Long> {//inheritance
    Optional<SigninRequest> findByemail(String email);//optional is part of javautil library and?
    Optional<SigninRequest> findByusername(String username);
what it does is,it allows us to use methods without their body?what do we mean by this
We use an interface for UserRepository so that Spring can automatically generate the actual implementation for you, saving you from writing boilerplate code.

30/5/25
what are container object?
These are classes that contain groups of objects:
    List, Set, Map, Queue, etc.

with what layers are conatiners made abstarct?

NUll pointer
a NullPointerException (NPE) is Java’s way of signaling an error to avoid unpredictable behavior or crashes.
what Optional does is avoid null pointer exception and throws NoSuchElementException 

what is a non static method and why cant it be referenced from a static context?

getEmail() is a non-static method → it belongs to an object, not the class.
You need an instance because non-static methods work on object-specific data (like a user's email). The class itself is just a template — it holds no actual data.

