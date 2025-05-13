# Comparator Exercise in Java

This project contains several custom implementations of the Java `Comparator` interface to enable different sorting logics for strings. The goal of the exercise was to deepen the understanding of how to use the `Comparator` interface and to implement multiple comparison strategies independently.

## Contents

### 1. StringIgnoreCaseComparator

This class implements the `Comparator<String>` interface and compares strings while ignoring case differences. For example, `"apple"` and `"Apple"` are treated as equal in terms of sorting.

**Example:**

```java
String[] strings = { "apple", "Banana", "cherry", "Apple", "banana", "Cherry" };
```

**Sorted using StringIgnoreCaseComparator:**

```
[apple, Apple, Banana, banana, cherry, Cherry]
```

### 2. CharacterUpperAfterLowerComparator

This class sorts characters so that uppercase letters are placed after lowercase letters, even though the ASCII value of uppercase letters is actually smaller. The comparator ensures that, for example, `'a' < 'B'`, which deviates from the default behavior.

**Example sorting:**

Before: `['b', 'B', 'a', 'A', '4', '9', '7']`  
After: `[a, b, A, B, 4, 7, 9]`

### 3. ByLastWordComparator

This class sorts strings based on the last word in each string. It extracts the last word and uses it as the sorting key.

**Example:**

```java
String[] fruits = { "banana", "apple", "green apple", "yellow banana", "red cherry" };
```

**Sorted using ByLastWordComparator:**

```
[apple, green apple, banana, yellow banana, red cherry]
```

Since the last word is decisive, `"green apple"` is sorted as `"apple"`.

## Extended Version

The extended version of `ByLastWordComparator` allows a configurable sort strategy. It allows defining a custom comparator, where the current logic (by last word) is the default. If no configuration is given, only sorting by last word is allowed. You should be able to extend this class to handle other conditions as well, where the default behavior is not always desired.

---

This project demonstrates the practical use of Java's `Comparator` interface to implement custom sorting strategies for strings and characters.
