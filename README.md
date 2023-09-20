# DSD Java Basic Part 5

## Workshop : For loop
```
Case 4
>java Calc sum 1 2 3 4 5 6 7
output Value = 28
```

<details>
<summary>Calc.java</summary>

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
            case "sum":
                for(int i = 1; i < len; i++){
                    c += Integer.parseInt(args[i]);
                }
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

## Workshop : While loop

```
Case 4
>java Calc sum 1 2 3 4 5 6 7
output Value = 28
```

<details>
<summary>Calc.java</summary>

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
            case "sum":
                // for(int i = 1; i < len; i++){
                //     c += Integer.parseInt(args[i]);
                // }
                int i = 1;
                while(i < len){
                    c += Integer.parseInt(args[i]);
                    i++;
                }
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


## Nested Loop
```
Pass
```

## For-Each Loop
* Syntax
```java
for(type variableName : arrayName){
    // code block to be executed
}
```

* Example
```java
public class Calc {
    public static void main(String[] args) {
        for(String a: args){
            System.out.println("Value = " + a);
        }
    }
}
```

## Workshop : For-Each loop
```
Case 4
java Calc sum 1 2 3 4 5 6 7
output Value = 28
```

<details>
<summary>Calc.java</summary>

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
            case "sum":
                // -- for loop --
                // for(int i = 1; i < len; i++){
                //     c += Integer.parseInt(args[i]);
                // }
                // -- while loop --
                // int i = 1;
                // while(i < len){
                //     c += Integer.parseInt(args[i]);
                //     i++;
                // }
                // -- for-each --
                for(String str : args){
                    if(str == args[0]){
                        continue;
                    }
                    c += Integer.parseInt(str);
                }
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

## Break
```
pass
```

## Arrays

```java
int mynum [] [] = {{1, 2, 3}, {4, 5, 6}};

for(int i = 0; i < mynum.length; i++){
    for(int j = 0; j < mynum[i].length; j++){
        System.out.println("Value = " + mynum[i][j]);
    }
}
```

## Workshop Array : For-Each loop
```
mynum [] [] = {{1, 2, 3}, {4, 5, 6}}
```
```
>java Calc
1
2
3
4
5
6
```

<details>
<summary>.java</summary>

```java
class Calc {
    public static void main(String[] args) {
        int mynum [] [] = {{1, 2, 3}, {4, 5, 6}};

        // for(int i = 0; i < mynum.length; i++){
        //     for(int j = 0; j < mynum[i].length; j++){
        //         System.out.println("Value = " + mynum[i][j]);
        //     }
        // }
        for(int[] row : mynum){
            for(int element : row){
                System.out.println("Value = " + element);
            }
        }
    }
}
```

</details>

---

