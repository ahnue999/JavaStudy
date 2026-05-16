Here are the most important Java `String` methods every Java developer should know, grouped by what they’re commonly used for.

---

# 1. Creating and Inspecting Strings

## `length()`

Returns the number of characters.

```java
String name = "Ahmed";
System.out.println(name.length());
```

Output:

```java
5
```

---

## `charAt(index)`

Gets a character at a specific position.

```java
String text = "Java";
System.out.println(text.charAt(1));
```

Output:

```java
a
```

Indexes start at `0`.

---

## `isEmpty()`

Checks if the string has zero characters.

```java
String s = "";
System.out.println(s.isEmpty());
```

Output:

```java
true
```

---

## `isBlank()` (Java 11+)

Checks if the string is empty or only spaces/tabs.

```java
String s = "   ";
System.out.println(s.isBlank());
```

Output:

```java
true
```

---

# 2. Comparing Strings

## `equals()`

Compares actual content.

```java
String a = "Java";
String b = "Java";

System.out.println(a.equals(b));
```

Output:

```java
true
```

Use this instead of `==`.

---

## `equalsIgnoreCase()`

Ignores uppercase/lowercase differences.

```java
System.out.println("java".equalsIgnoreCase("JAVA"));
```

Output:

```java
true
```

---

## `compareTo()`

Compares alphabetically.

```java
System.out.println("apple".compareTo("banana"));
```

* Negative → comes before
* Positive → comes after
* Zero → equal

---

# 3. Searching Inside Strings

## `contains()`

Checks if text exists inside a string.

```java
String sentence = "I love Java";

System.out.println(sentence.contains("Java"));
```

Output:

```java
true
```

---

## `startsWith()`

```java
System.out.println("Java Programming".startsWith("Java"));
```

Output:

```java
true
```

---

## `endsWith()`

```java
System.out.println("photo.png".endsWith(".png"));
```

Output:

```java
true
```

---

## `indexOf()`

Finds the position of text.

```java
String s = "Hello";

System.out.println(s.indexOf("l"));
```

Output:

```java
2
```

Returns `-1` if not found.

---

## `lastIndexOf()`

Finds the last occurrence.

```java
String s = "banana";

System.out.println(s.lastIndexOf("a"));
```

Output:

```java
5
```

---

# 4. Extracting Parts of Strings

## `substring()`

Extracts part of a string.

```java
String word = "Programming";

System.out.println(word.substring(0, 4));
```

Output:

```java
Prog
```

### Syntax

```java
substring(start, end)
```

* start included
* end excluded

---

# 5. Modifying Strings

Remember: Strings are immutable in Java. Methods return a new string.

---

## `toUpperCase()` / `toLowerCase()`

```java
String name = "Java";

System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());
```

Output:

```java
JAVA
java
```

---

## `trim()`

Removes spaces at the beginning and end.

```java
String s = "  hello  ";

System.out.println(s.trim());
```

Output:

```java
hello
```

---

## `replace()`

Replaces characters or text.

```java
String s = "I like cats";

System.out.println(s.replace("cats", "dogs"));
```

Output:

```java
I like dogs
```

---

## `replaceAll()`

Uses regex (regular expressions).

```java
String s = "abc123";

System.out.println(s.replaceAll("\\d", "*"));
```

Output:

```java
abc***
```

---

# 6. Splitting and Joining

## `split()`

Splits a string into an array.

```java
String csv = "apple,banana,orange";

String[] fruits = csv.split(",");

for(String fruit : fruits) {
    System.out.println(fruit);
}
```

Output:

```java
apple
banana
orange
```

---

## `join()`

Joins multiple strings.

```java
String result = String.join("-", "2025", "05", "16");

System.out.println(result);
```

Output:

```java
2025-05-16
```

---

# 7. Converting Data Types

## `valueOf()`

Converts values into strings.

```java
int number = 100;

String s = String.valueOf(number);

System.out.println(s);
```

Output:

```java
100
```

---

# 8. Useful Advanced Methods

## `matches()`

Checks regex patterns.

```java
String email = "test@gmail.com";

System.out.println(email.matches(".*@gmail\\.com"));
```

Output:

```java
true
```

---

## `repeat()` (Java 11+)

```java
System.out.println("ha".repeat(3));
```

Output:

```java
hahaha
```

---

# 9. String Formatting

## `format()`

```java
String name = "Ali";
int age = 22;

String result = String.format("Name: %s Age: %d", name, age);

System.out.println(result);
```

Output:

```java
Name: Ali Age: 22
```

---

# 10. Most Important Methods for Beginners

If you're starting Java, focus first on these:

| Method                            | Why Important             |
| --------------------------------- | ------------------------- |
| `length()`                        | Basic string handling     |
| `charAt()`                        | Access characters         |
| `equals()`                        | Correct string comparison |
| `contains()`                      | Search text               |
| `substring()`                     | Extract text              |
| `indexOf()`                       | Find positions            |
| `split()`                         | Parse input/data          |
| `replace()`                       | Modify text               |
| `trim()`                          | Clean user input          |
| `toUpperCase()` / `toLowerCase()` | Formatting                |
| `isEmpty()`                       | Validation                |

---

# Mini Real-World Example

```java
String email = "  USER@gmail.com ";

email = email.trim().toLowerCase();

if(email.contains("@gmail.com")) {
    System.out.println("Valid Gmail address");
}
```

This uses:

* `trim()`
* `toLowerCase()`
* `contains()`

Together — very common in real applications.

---

# Important Concept: String Immutability

This is one of the most important Java concepts.

```java
String s = "Hello";

s.toUpperCase();

System.out.println(s);
```

Output:

```java
Hello
```

Why? Because the original string is unchanged.

Correct way:

```java
s = s.toUpperCase();
```

---

# Next Step After Learning String Methods

After mastering `String`, learn:

1. `StringBuilder`
2. Regular Expressions (Regex)
3. Arrays
4. Collections (`ArrayList`, `HashMap`)
5. File reading/string parsing

These are heavily connected to string processing in real Java projects.
