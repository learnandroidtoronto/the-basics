# Signup Form
> We will create a signup form in Android Studio. In the process you will learn a lot about Android development basics, design patterns, and best practices. 

## Instructions
Commit and sync your Android Studio project to your branch after each lesson.
* Once added to your section's team `clone` `the-basics` `repo` to a `directory` on your computer.
* Create your Android project inside the `the-basics/Signup-form` directory you've just `cloned`.
* `Commit` your project to your `branch` with the <b>date as the summary</b> and an <b>overview of the tasks you did as the description</b>, at the end of each lesson.

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
