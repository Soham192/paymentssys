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

#5 method definition
public User registerUser(User newuser) {
    // Code to save the new user to the database
    return newuser;
}
here User is the return type,User: This tells Java what kind of data the method will return. In this case, the method will return a User object after performing its logic (like saving the user to a database).



26/4/25

1.methods are first defined in class files with the syntax access_modifier type/return type method_name(parameters),although
the return types specifically doesnt have to be a pre declared class,if it is the return type must match the object's class
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
