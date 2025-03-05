# Secret Santa Game

## 📌 Project Description
This project automates the Secret Santa assignment process for employees at Acme Corporation. Given a list of employees and last year's Secret Santa assignments, the system ensures that:
- No employee is assigned themselves.
- No one gets the same Secret Child as last year.
- Every employee has exactly one Secret Child.

## 📂 Project Structure
```
SecretSantaGame/
│── src/
│   ├── main/java/com/secretsanta/
│   │   ├── model/Employee.java
│   │   ├── util/ExcelReader.java
│   │   ├── service/SecretSantaAssigner.java
│   │   ├── Main.java
│   ├── test/java/com/secretsanta/
│   │   ├── ExcelReaderTest.java
│   │   ├── SecretSantaAssignerTest.java
│── input/Employee-List.xlsx
│── input/Secret-Santa-Game-Result-2023.xlsx
│── output/Secret-Santa-Assignments.csv
│── README.md
```

## ⚙️ Installation
### Prerequisites
- Java 17+
- Apache POI (for reading Excel files)
- JUnit 5 (for testing)
- Git (for version control)

### Steps
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/SecretSantaGame.git
   cd SecretSantaGame
   ```
2. Build the project:
   ```sh
   mvn clean install
   ```
3. Run the program:
   ```sh
   java -jar target/SecretSantaGame.jar
   ```

## 📝 Usage
1. Place employee data in `input/Employee-List.xlsx`.
2. Place last year's assignments in `input/Secret-Santa-Game-Result-2023.xlsx`.
3. Run the program; results are saved in `output/Secret-Santa-Assignments.csv`.

## 📊 Input Format
### **Employee List (Excel File)**
| Employee_Name | Employee_EmailID |
|--------------|-----------------|
| Alice Smith  | alice@example.com |
| Bob Johnson  | bob@example.com |

### **Previous Assignments (Excel File)**
| Employee_Name | Employee_EmailID | Secret_Child_Name | Secret_Child_EmailID |
|--------------|-----------------|------------------|---------------------|
| Alice Smith  | alice@example.com | Bob Johnson | bob@example.com |

## 📌 Output Format (CSV)
| Employee_Name | Employee_EmailID | Secret_Child_Name | Secret_Child_EmailID |
|--------------|-----------------|------------------|---------------------|
| Alice Smith  | alice@example.com | Charlie Brown | charlie@example.com |

## 🚀 Features
- **Avoids self-assignment**
- **Prevents repetition from last year**
- **Ensures fairness**
- **Handles missing or incorrect data gracefully**

## 🔥 Error Handling
- **Missing files:** Shows an error if required files are not found.
- **Invalid data:** Skips invalid entries but logs them.
- **Impossible assignments:** If the program cannot assign a valid match, it retries.

## 📌 Running Tests
Run unit tests using:
```sh
mvn test
```

## 📌 Version Control
- Upload your code to GitHub/GitLab before submission.
- Example repository:
  ```
  git init
  git add .
  git commit -m "Initial commit"
  git branch -M main
  git remote add origin https://github.com/your-username/SecretSantaGame.git
  git push -u origin main
  ```


