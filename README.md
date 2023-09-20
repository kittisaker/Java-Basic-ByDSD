# DSD Java Basic Part 4

## Workshop : If...Else

<details>
<summary>Calc.java</summary>

```java
class Calc {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);

        String result = (i > 10) ? "Heigh" : "Low";

        System.out.println(result);
    }    
}
```

</details>

<details>
<summary>Complier and Run code</summary>

```
>javac Calc.java

>java Calc 11
Heigh
```

</details>

```
Case 1
>java Calc 1 2       # 1 + 2
output Value = 3

Case 2
>java Calc 1     # 1
output Value = 1
```

<details>
<summary>Calc.java</summary>

```java
class Calc{
    public static void main(String[] args) {

        int num_01 = 0, num_02 = 0, result = 0;
        int len = args.length;

        if(len >= 1){
            num_01 += Integer.parseInt(args[0]);
        }else if(len >= 2){
            num_02 += Integer.parseInt(args[1]);
        }

        result = num_01 + num_02;
        System.out.println("Value = " + result);
    }
}
```

</details>

## Workshop : Short Hand If...Else

```
Case 1
>java Calc 1 2       # 1 + 2
output Value = 3

Case 2
>java Calc 1     # 1
output Value = 1
```

<details>
<summary>Calc.java</summary>

```java
class Calc {
    public static void main(String[] args) {
        int c = 0;
        int len = args.length;

        int a = (len >= 1) ? Integer.parseInt(args[0]) : 0;
        int b = (len >= 2) ? Integer.parseInt(args[1]) : 0;
        c = a + b;

        System.out.println("Value = " +c);
    } 
}
```

</details>

## Switch Statement (Workshop)

```
Case 1
>java Calc add 1 2
output Value = 3

Case 2
>java Calc add 1
output Value = 1

Case 3
>java Calc add
output Value = 0
```

<details>
<summary></summary>

```java
class Calc {
    public static void main(String[] args) {
        int c = 0;
        int len = args.length;

        switch(args[0]){
            case "add":
                int a = (len >= 2) ? Integer.parseInt(args[1]) : 0;
                int b = (len >= 3) ? Integer.parseInt(args[2]) : 0;
                c = a + b;
                break;
            default:
                System.out.println("Not support");
                break;
        }
        System.out.println("Value = " +c);
    } 
}
```

</details>

## While Loop

* Syntax
```
While (condition){
    // code block to be executed
}
```

## Do/While Loop
* Syntax

```
do{
    // code block to be executed
}While (condition)
```

## For Loop
* Syntax
```java
for(statement 1; statement 2; statement 3){
    // code block to be executed
}

// Statement 1 is executed (one time) before the execution of the code block.
// Statement 2 defines the condition for executing the code block.
// Statement 3 is executed (every time) after the code block has been executed.
```

---