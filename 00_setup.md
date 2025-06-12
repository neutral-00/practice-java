# Project Setup

1. **Install Gradle** (if you haven't already) – You can download and install it from [Gradle’s official site](https://gradle.org/install/) or use a package manager like SDKMAN:
   ```sh
   sdk install gradle
   ```

2. **Create a new Gradle project** using the built-in Java application template:
   ```sh
   gradle init --type practice-java
   ```
   This sets up a basic Gradle project structure with a `build.gradle` file.

3. **Navigate to the project folder**:
   ```sh
   cd practice-java
   ```

4. **Verify the structure**, which should look something like this:
   ```
   ├── build.gradle
   ├── settings.gradle
   ├── src
   │   ├── main
   │   │   └── java
   │   └── test
   │       └── java
   ├── gradle
   ├── gradlew
   ├── gradlew.bat
   ```

5. **Run the project** (if using the Java application template):
   ```sh
   ./gradlew run
   ```

6. **Build the project**:
   ```sh
   ./gradlew build
   ```


