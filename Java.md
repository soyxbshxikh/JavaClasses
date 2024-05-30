<h1 align="center"> JAVA Notes </h1>

### 1. What is Java ?

- Java is a popular programming language.
- Java file name always save **. Java** extension.
- Java file name & class name are always same.
- Java is an object-oriented programming language.
- It is owned by Oracle, and more than 3 billion devices run Java.
- Java is developed by James Gosling and his team Sun Microsystem ( in 1995 ).
- Java is a platform independent language ( Windows, Mac, Linux, Raspberry Pi, etc ).

---

### 2. Which software is used for JAVA ?

- Eclipse.
- NetBeans.
- Visual Studio Code.

---

### 3. How to see output in JAVA ?

- Right-Click on Your JAVA file, and click **RUN**.

---

### 4. Basic structure of JAVA

```JAVA
public class MyClass {
    public static void main(String[] args) {
        // Code write here....
    }
}
```

- **public** :- The code is accessible for all classes.
- **class** :- The class is collection of objects.
- **MyClass** :- is a class name.
- **static** :-  Method belongs to the Main class.
- **void** :- Method does not have a return value.
- **main(String[] args)** :- Any code inside the main method will be executed.

---

### 5. Print output in JAVA

```JAVA
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World"); //Text
    System.out.println(500 + 500); //Numbers
  }
}
```

Output :-
---
 <dl>
  <dd> 
    Hello World <br>
    1000
  </dd>
</dl>

---

### 6. Variables Declaration

---

> In Java, there are different types of data types. <br>
 for example:-

- **String** - Stores text "Hello" ( in double quotes ).
- **int** - Stores integers numbers ( 123 or -123 ).
- **float** - Stores floating point numbers ( 19.99 or -19.99 ).
- **char** - Stores single characters 'a' or 'B' ( in single quotes ).
- **boolean** - stores values with two states: ( true or false )

---

#### Syntax :-

```JAVA
data_type variableName = value;
```

---

#### Type 1 :-

```JAVA
int myNum = 15;
System.out.println(myNum);
```

---

#### Type 2 :-

```JAVA
int myNum;
myNum = 15;
System.out.println(myNum);
```

---

#### Type 3 :-

```JAVA
int myNum = 15;
myNum = 20;
System.out.println(myNum);
```

---

#### Type 4 :-

```JAVA
int x = 5;
int y = 6;
System.out.println("Output is :- " + (x + y));
```

---

#### Type 5 :-

```JAVA
int x = 5;
int y = 6;
int z = 50;
System.out.println(x + y + z);
```

---

#### Type 6 :-

```JAVA
int x = 5, y = 6, z = 50;
System.out.println(x + y + z);
```

---

#### Type 7 :-

```JAVA
int w, x, y, z;
w = x = 50;
y = z = 100;
System.out.println(w + x + y + z);
```

---

#### Type 8 :-

```JAVA
String name = "Soyab";
System.out.println("Hello " + name);
```

---

#### Type 9 :-

```JAVA
String firstName = "Soyab ";
String lastName = "Shaikh";
String fullName = firstName + lastName;
System.out.println(fullName);
```

---

#### All type of data :-

```JAVA
int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";
```

---

#### User input in java :-

```JAVA
import java.util.Scanner;

class MyClass {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner myObj = new Scanner(System.in);

        System.out.println("First number:");
        x = myObj.nextInt();

        System.out.println("Second number:");
        y = myObj.nextInt();

        sum = x + y;
        System.out.println("Addition is : " + sum);
    }
}
```