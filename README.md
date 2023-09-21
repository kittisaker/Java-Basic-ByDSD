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
class Calc {

    public static int add(int a, int b){
        return a + b;
    }

    public static int sum(int[] numbers){
        int result = 0;
        for(int num : numbers){
            result += num;
        }
        return result;
    }
    public static void main(String[] args) {
        int c = 0;
        int len = args.length;

        switch(args[0]){
            case "add":
                int a = (len >= 2) ? Integer.parseInt(args[1]) : 0;
                int b = (len >= 3) ? Integer.parseInt(args[2]) : 0;
                c = add(a, b);
                break;
            case "sum":
                int nums[] = new int[len];
                for(int i = 1; i<len; i++){
                    nums[i - 1] = Integer.parseInt(args[i]);
                }
                c = sum(nums);
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

## Prarmeters and Arguments
* Parameters act as variables inside the method.
* Parameters are specified after the method name, inside the parantheses

## Return value

```
Pass
```
---

## Overloading

```
int myMethod(int x);
float myMethod(float x);
double myMethod(double x, double y);
```

```java
public static void add(int num_01, int num_02){
    System.out.println("Value = " + (num_01 + num_02));
}

public static double add(double num_01, double num_02){
    return (num_01 + num_02);
}

public static double add(double num_01){
    return (num_01);
}
```

## Scope
```
Pass
```

## Recursion

<details>
<summary>.java</summary>

```java
public class Main {

    public static int sum(int k){
        if(k > 0){
            return k + sum(k - 1);
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
}
```
</details>

## Halting Condition
<details>
<summary>.java</summary>

```java
public class Main {

    public static int sum(int start, int end){
        if(end > start){
            return end + sum(start, end - 1);
        }else{
            return end;
        }
    }
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
    }
}
```
</details>