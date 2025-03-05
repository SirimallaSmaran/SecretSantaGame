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
   git clone https://github.com/SirimallaSmaran/SecretSantaGame.git
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
  git remote add origin https://github.com/SirimallaSmaran/SecretSantaGame.git
  git push -u origin main
  ```
-----------This are the commands i have used to my code to Github-----------------

HP@DESKTOP-BE8AT7U MINGW64 ~/eclipse-workspace/SecretSantaGame (master)
$ git init
Reinitialized existing Git repository in C:/Users/HP/eclipse-workspace/SecretSantaGame/.git/

HP@DESKTOP-BE8AT7U MINGW64 ~/eclipse-workspace/SecretSantaGame (master)
$ git add .
warning: in the working copy of 'output/Secret-Santa-Assignments.csv', LF will be replaced by CRLF the next time Git touches it

HP@DESKTOP-BE8AT7U MINGW64 ~/eclipse-workspace/SecretSantaGame (master)
$ git commit -m "Initial commit"
[master (root-commit) ad2ad6c] Initial commit
 21 files changed, 439 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 .settings/org.eclipse.jdt.apt.core.prefs
 create mode 100644 .settings/org.eclipse.jdt.core.prefs
 create mode 100644 .settings/org.eclipse.m2e.core.prefs
 create mode 100644 README.md
 create mode 100644 data/Employee-List.xlsx
 create mode 100644 data/Secret-Santa-Game-Result-2023.xlsx
 create mode 100644 output/Secret-Santa-Assignments.csv
 create mode 100644 pom.xml
 create mode 100644 src/main/java/com/secretsanta/Main.java
 create mode 100644 src/main/java/com/secretsanta/model/Employee.java
 create mode 100644 src/main/java/com/secretsanta/service/SecretSantaAssigner.java
 create mode 100644 src/main/java/com/secretsanta/utils/ExcelReader.java
 create mode 100644 target/classes/META-INF/MANIFEST.MF
 create mode 100644 target/classes/META-INF/maven/com.secretsanta/SecretSantaGame/pom.properties
 create mode 100644 target/classes/META-INF/maven/com.secretsanta/SecretSantaGame/pom.xml
 create mode 100644 target/classes/com/secretsanta/Main.class
 create mode 100644 target/classes/com/secretsanta/model/Employee.class
 create mode 100644 target/classes/com/secretsanta/service/SecretSantaAssigner.class
 create mode 100644 target/classes/com/secretsanta/utils/ExcelReader.class

HP@DESKTOP-BE8AT7U MINGW64 ~/eclipse-workspace/SecretSantaGame (master)
$ git branch -M main

HP@DESKTOP-BE8AT7U MINGW64 ~/eclipse-workspace/SecretSantaGame (main)
$ git remote add origin https://github.com/SirimallaSmaran/SecretSantaGame.git

HP@DESKTOP-BE8AT7U MINGW64 ~/eclipse-workspace/SecretSantaGame (main)
$ git push -u origin main
remote: Repository not found.
fatal: repository 'https://github.com/SirimallaSmaran/SecretSantaGame.git/' not found

HP@DESKTOP-BE8AT7U MINGW64 ~/eclipse-workspace/SecretSantaGame (main)
$ ^C

HP@DESKTOP-BE8AT7U MINGW64 ~/eclipse-workspace/SecretSantaGame (main)
$ git push -u origin main
Enumerating objects: 44, done.
Counting objects: 100% (44/44), done.
Delta compression using up to 8 threads
Compressing objects: 100% (32/32), done.
Writing objects: 100% (44/44), 29.36 KiB | 2.94 MiB/s, done.
Total 44 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), done.
To https://github.com/SirimallaSmaran/SecretSantaGame.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.

