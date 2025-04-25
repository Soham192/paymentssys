High-Level Flow (Signup & Login)
1. 📥 Request from Client
Frontend sends a POST request to:

/auth/signup → for registration

/auth/login → for login

2. 📦 Controller Layer
Receives request.

Validates data (optional: use @Valid).

Forwards to the service layer.

3. 🔍 Service Layer
Signup: Check if user exists → hash password → create user → save.

Login: Load user by email → compare passwords → generate JWT token.

4. 💾 Repository Layer
Interfaces with database using Spring Data JPA.

5. 🔐 Security Layer
Configures JWT filters, user authentication logic, etc.