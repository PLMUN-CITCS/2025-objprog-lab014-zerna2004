# **2025-OBJPROG-LAB014**
Week 05 - Methods in Java

Laboratory # 14 - Guided Coding Exercise 3: Method Return Types

## **Instructions**

### **Step 1.1: Accept the Assignment**

   1. Click on the assignment link provided by your instructor.
   2. GitHub Classroom will create a **private repository** under your GitHub account.
   3. After the repository is created, click **"Go to Repository"** to view your assignment.

---

### **Step 1.2: Setup your Git Environment**
Only perform this if this is the first time you will setup your Git Environment

   1. Create a GitHub Account:
   ```bash
   https://github.com/signup?source=login
   ```
      
   2. Download and Install Git on your Laptop/Desktop:
   ```bash
   https://git-scm.com/downloads
   ```
   
   3. Create a Folder in your Laptop/Desktop
   4. Right-click anywhere in the created folder and select "Open Git Bash Here".
   5. In the Git Bash Terminal, set your git name, perform command:
   ```bash
   git config --global user.name "Your Name"
   ```
   
   6. In the Git Bash Terminal, set your git email, perform command:
   ```bash
   git config --global user.email "your.email@example.com"
   ```
   
   7. Create your SSH Key, just follow the instructions, no need to provide filename and passphrase. In the Git Bash Terminal, perform command:
   ```bash
   ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
   ```
   
   8. Copy your SSH Keys into clipboard. In the Git Bash Terminal, perform command:
   ```bash
   clip < ~/.ssh/id_rsa.pub
   ```
   
   9. Log in to your GitHub account.
   10. In the upper-right corner of GitHub, click your profile picture and select Settings.
   11. In the left sidebar, click on SSH and GPG keys.
   12. Click the New SSH key button.
   13. In the Title field, give the key a recognizable name (e.g., "My Windows Laptop").
   14. In the Key field, CTRL + V or paste the keys copied into your clipboard. Save the key.
   15. Go Back to terminal, use command:
   ```bash
   ssh -T git@github.com
   ```

### **Step 2: Clone the Repository to Your Local Machine**

   1. On your repository page, click the green **"Code"** button.
   2. Copy the repository URL (choose HTTPS for simplicity).
   3. Open your terminal (or Git Bash, Command Prompt, or PowerShell) and run:
   
   ```bash
   git clone <git_repo_url>
   ```
   
   4. Navigate into the cloned folder:
   
   ```bash
   cd <git_cloned_folder>
   ```

### **Step 3: Complete the Assignment**

**Laboratory # 14 - Guided Coding Exercise 3: Method Return Types**

   **Objective:**
   - Discuss the difference between void methods and value-returning methods.
   - Understand how a method can return data to its caller.

   **File Naming Convention:**
   - `MethodReturnTypes.java`

   **Desired Output:**
   ```txt
   Welcome to our program!
   The average is: 25.0
   ```

   **Notable Observations (to be discussed after completing the exercise):**
   - The displayWelcomeMessage method is a void method; it doesn't return any value.
   - The calculateAverage method has a return type of double and returns the calculated average to the caller (main in this case).

   **Java Programming Best Practices:**
   - Clearly specify the return type of your methods (void if no value is returned, or the appropriate data type otherwise).
   - Use the return statement to return a value from a non-void method.
   - Keep methods concise and focused.
      
   **Step-by-Step Instructions:**

   1. Setup Class and Main Method
      - Create a file named `MethodReturnTypes.java`.
      - Define the class `MethodReturnTypes` and the `main` method.
      ```Java      
      public class MethodDemo {
          public static void main(String[] args) {
      
          }
      }
      ```
            
   2. Create the displayWelcomeMessage Method
      - After the closing curly brace of main, type public static void displayWelcomeMessage() {}
      - Inside this method, add: System.out.println("Welcome to our program!");
      ```Java
      public class MethodReturnTypes {
         //... (main method)...
         public static void displayWelcomeMessage() {
           System.out.println("Welcome to our program!");
         }
      }
      ```

   3. Call displayWelcomeMessage
      - In main, add: displayWelcomeMessage();
      ```Java
      public class MethodReturnTypes {
          public static void main(String args) {
              displayWelcomeMessage();
          }
          //... (displayWelcomeMessage method)...
      }
      ```

   4. Create the calculateAverage Method (Part 1)
      - After the closing brace of displayWelcomeMessage, type public static double calculateAverage(int num1, int num2) {}
      ```Java
      public class MethodReturnTypes {
          //... (other methods)...
          public static double calculateAverage(int num1, int num2) {
      
          }
      }
      ```

   5. Create the calculateAverage Method (Part 2)
      - Inside calculateAverage, add:
         - double average = (num1 + num2) / 2.0;
         - return average;
      ```Java
      public class MethodReturnTypes {
          //... (other methods)...
          public static double calculateAverage(int num1, int num2) {
              double average = (num1 + num2) / 2.0;
              return average;
          }
      }
      ```

   6. Declare Variables and Call calculateAverage
      - In main, add:
         - int value1 = 20;
         - int value2 = 30;
         - double result = calculateAverage(value1, value2);
      ```Java
      public class MethodReturnTypes {
          public static void main(String args) {
              //... (other code in main)...
              int value1 = 20;
              int value2 = 30;
              double result = calculateAverage(value1, value2);
          }
          //... (other methods)...
      }
      ```

   7. Print the Result
      - In main, add: System.out.println("The average is: " + result);
      ```Java
      public class MethodReturnTypes {
          public static void main(String args) {
              //... (other code in main)...
              System.out.println("The average is: " + result);
          }
          //... (other methods)...
      }
      ```

   8. Compile and Run
       - Save the file as `MethodReturnTypes.java`.
       - Compile the code using `javac MethodReturnTypes.java` in your terminal or command prompt.
       - Run the compiled code using `java MethodReturnTypes`.

   **Conclusion**
   This exercise explored the difference between void methods and methods that return values.  void methods perform actions but don't return data, while value-returning methods calculate and return a result that can be used by the caller. Understanding how to use different method return types is essential for writing modular and reusable code in Java.

### **Step 4: Push Changes to GitHub**
Once you've completed your changes, follow these steps to upload your work to your GitHub repository.

1. Check the status of your changes:
   Open the terminal and run:
   
   ```bash
   git status
   ```
   This command shows any modified or new files.
   
2. Stage the changes:
   Add all modified files to staging:
   
   ```bash
   git add .
   ```
   
3. Commit your changes:
   Write a meaningful commit message:
   
   ```bash
   git commit -m "Submitting OBJPROG Week 05 - Laboratory # 14"
   ```
   
4. Push your changes to GitHub:
   Upload your changes to your remote repository:
   
   ```bash
   git push origin main
   ```
