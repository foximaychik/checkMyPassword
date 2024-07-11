# Check My Password
This Java Program will check your password for reliability! 

## How To Use?
First, change ```PASSWORD``` constant to your password.

```Java
public static final String PASSWORD = "Example2024$#"; //Password
```
Then, change ```LEN_MIN```, ```STR_MIN```, ```NUM_MIN``` and ```S_SYM_MIN``` to your value.

```Java
public static final int LEN_MIN = 8; //Password min length
public static final int STR_MIN = 4; //Password min letters
public static final int NUM_MIN = 4; //Password min numbers
public static final int S_SYM_MIN = 2; //Password min spec. symbols
```
You can also get boolean value (```true``` or ```false```) if you will uncomment this:
```Java
/*
System.out.println(Conditions.digitsC(PASSWORD, 4));
System.out.println(Conditions.strC(PASSWORD, 4));
System.out.println(Conditions.passwordLen(PASSWORD, 8));
System.out.println(Conditions.specSym(PASSWORD, 2));
*/
```
