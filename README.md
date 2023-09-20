# DSD Java Basic Part 6

## Method

</br>
* Problem
<details>
<summary>Calc.java</summary>

```java
public class Calc {
    void add(int a, int b){
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        add(1, 2);       // <-- Cannot use methon add
    }
}
```
</details>

</br>
* Solution
<details>
<summary>Calc.java</summary>

```java
public class Calc {
    static void add(int a, int b){  // <-- Add static
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        add(1, 2);     
    }
}
```
</details>

## Workshop : Method

```java
public static void add(int num_01, int num_02){
    // Logic
}

public static void sum(int arr[]){
    // logic
}

public static void main(String[] args) {
    // Call method
}
```

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

Case 4
>java Calc sum 1 2 3 4 5
output Value = 15
```

<details>
<summary>.java</summary>

```java

```
</details>

---

## 
<details>
<summary>.java</summary>

```java

```
</details>