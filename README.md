# Data Structures and Abstractions Projects

This repository is created as an unordered collection of implementations of the projects and data structures described in:

[**Data Structures and Abstractions with Java**](https://www.pearson.com/us/higher-education/program/Carrano-Data-Structures-and-Abstractions-with-Java-5th-Edition/PGM1912010.html) *by Frank Carrano*

- ISBN 10: 0-13-483169-1
- ISBN 13: 978-0-13-483169-5

## Project Structure and Building

This project was built using [Maven 3.6.3](https://maven.apache.org/download.cgi)

```
    mvn -B archetype:generate \
      -DarchetypeGroupId=org.apache.maven.archetypes \
      -DgroupId=io.fallon \
      -DartifactId=DataStructuresDemo
```

This was also to help with practicing using proper project structure while learning these data structures. Take a look through their [quickstart guide](https://maven.apache.org/guides/getting-started/index.html) to understand what this means for the project structure contained within. All Datastructures will be written in packages beneath io.fallon.

The main class will always be within io.fallon.App I will write each project as a static method within `src/main/java/io/fallon/App.java`. Allowing you to test each project by simply entering the function for the assignment in to the main and then running the app again.

## Building and Execution

You will need:

- [Java SDK 1.14](https://jdk.java.net/14/) or greater
-  [Maven 3.6.3](https://maven.apache.org/download.cgi) or greater 
    -  Feel free to use these links or a package manager (For Windows I used [Chocolatey](https://chocolatey.org/install))
    
You will use `mvn package` in the base directory to build the program and create a jar file to run. Then, `-cp .\target\DataStructuresDemo-1.0-SNAPSHOT.jar io.fallon.App` will run the app after packaging.

## Documentation

I will be documenting everything in this class using standard Javadocs. To compile all of the documentation, run `mvn javadoc:javadoc`. Then open `./target/site/api-docs/index.html` to view the documentation for all classes.

