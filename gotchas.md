#package
The package keyword in Java is used to define the namespace or logical grouping for a class. In your case, com.paymentsys.model is the name of the package.

29/4.25
Optional<User> username= userRepository.findByusername(username);
here the it causes an error beacuse we shadow the parameter name with local variable name

The operator && is undefined for the argument type(s) boolean, String
was not really an issue .equals() is a method in java which compare values and outputs boolean values had just forgot to put it on the second condition

30/4/25
The method login(String, String) in the type Authservice is not applicable for the arguments (LoginRequest)Jav

public String setToken(String token){
        this.token=token;
        public void setToken(String token) {
        this.token = token;(why did we declare void as type and not string)

what would be feasible to declare the signup method in the user class or make a completely different class in model


The User class typically represents the user's data model — such as username, email, password, etc. If you put the signup method directly in the User class, you're mixing business logic with data representation. This could lead to:

Issues:
Violation of Single Responsibility Principle: The User class will handle both data storage and business logic (signup functionality). This can make the class harder to maintain and extend over time.

Reduced Code Reusability: If the signup logic is in the User class, it’s harder to reuse it in other places or test it independently.

1/5/25
public User signup(SignupRequest request)
 why didnt we set the type for the above method as Siginrequest as its type rather than its parameter instead of User



3/5/25
 SigninRequest sign = new SigninRequest();
        sign.setEmail(sig.getEmail());
        sign.setUsername(sig.getUsername());
        sign.setPassword(sig.getPassword()); 

        userRepository.save(sig);
        return "user registered";
    }
    //this isnt right beacuse we need an entity that maps to the database
    @Entity is the User class so user object maps to the database  
    because Siginrequest is a DTO while User is an entity