# DSD Java Basic Part 1

## The main method
* For name of class and name of file must be same.

<details>
<summary>AppRunner.java</summary>

```java
class HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello " +args[0]);
    }
}
```

</details>

<details>

<summary>Complier & Run</summary>

```terminal
>javac HelloWorld.java

>java HelloWorld kittisak
Hello kittisak
```

</details>

* Try (Mor)

```
System.out.println("Hello " + args[0] + args[1]);

public static void main2(String[] args) {   # run --> fail

public static void main(int[] args) {       # run --> fail

public static void main(int[] arr) {        # run --> ok
```

## Declaring (Creating) Variables

* Syntax
```java
type variableName = value;
```

* Example
```java
float height = 15.45f       # add f

final variable
constant variable
```

---