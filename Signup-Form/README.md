# Signup Form
> We will create a signup form in Android Studio. In the process you will learn a lot about Android development basics, design patterns, and best practices. 

## Instructions
Submit your Android Studio project after each lesson.
* Create a `pull request` on the `branch` in this `repository` named after you.
* `Commit` your project at the end of each lesson.

## Concepts covered

* Plain Old Java Objects (POJO)
    * Accessors modifiers: `public` & `private`
    * Member variables:
    For `Human class`
    ```
    public class Human{
      private int mAge;
      private String mName;
      ...
    }
    ```
    * Constructor methods:
    For `Human.java`
    ```
      public Human(String name, int age){
         mName = name;
         mAge = age;
      }
    ```
    * Accessor methods:
    ```
      public String getName(){
         return mName;
      }
    ```
    * Mutator methods:
    ```
      public void setName(String name){
         mName = name;
      }
    ```
    
* XML
    * Syntax
    * Using `ConstraintLayout`
    * Creating an `element` for the `layout`
    * Adding the `android:id` attribute
* TextView & EditText
    * Hooking up `<element>` defined in `XML`
    * Using element in `.java`

## Author

Matthew Lal – [@instagram](https://instagr.am/that.android.developer) – [@facebook](https://fb.me/that.android.developer)
> Learn Android Toronto
