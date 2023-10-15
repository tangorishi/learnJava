# Java Stream API

The Java Stream API is a powerful feature introduced in Java 8 to manipulate and process collections of data in a more functional and expressive way. It provides a higher-level abstraction for working with sequences of elements, allowing developers to perform various operations on the data with concise and readable code.

## Purpose

The Stream API simplifies complex data processing tasks by allowing developers to express their intent more declaratively. It offers an efficient and streamlined approach for performing common operations on collections, such as filtering, mapping, reducing, and more. This results in code that is not only easier to read and maintain but also often more efficient due to potential optimizations by the underlying framework.

In essence, the Stream API promotes the following key benefits:

- **Conciseness**: Stream operations are typically shorter and more expressive than equivalent imperative code.
- **Readability**: Stream code reads like a series of data transformations, making it easier to understand.
- **Parallel Processing**: Streams can easily be parallelized for improved performance on multi-core processors.

Java Streams make it possible to process collections without manually writing loops, providing a more functional and declarative style of programming.

## Version

The Stream API was introduced in Java 8, and it represents a significant enhancement to the language's capabilities for handling collections and data manipulation. Since its introduction, it has become a fundamental tool in Java for working with data in a more modern and efficient way.

Whether you're dealing with lists, arrays, or any other data source, the Stream API can simplify your code and make it more maintainable.

# Java Stream API Examples

Java Stream API provides a powerful and expressive way to work with collections and process data. Here are examples of different Stream API methods and operations:

## Creating a Stream

You can create a Stream from various data sources, such as a collection, array, or using `Stream.of()`.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> numberStream = numbers.stream();

Stream<String> stringStream = Stream.of("apple", "banana", "cherry");
```

### Using Collection's stream() method

The most common way to get a Stream is by calling the `stream()` method on any collection object. This returns an immutable and ordered Stream consisting
The easiest way is by calling `.stream()` on any existing collection object (e.g., List). This returns an ordered sequential Stream containing all elements

Now let's discuss different methods of Stream API

# Java Stream API - `forEach()` Method

The `forEach()` method is a terminal operation in the Java Stream API that allows you to perform an action on each element of the stream. It is often used to iterate through the stream and apply a specific operation to each element without producing a new stream or collection.
It takes a `Consumer functional interface` as the argument.

## Example

Let's say you have a list of numbers and you want to print each number to the console using the `forEach()` method:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// Using forEach to print each number
numbers.stream()
        .forEach(number -> System.out.println(number));
```

In this example, the lambda expression `(number -> System.out.println(number))` is used as a Consumer to specify the action to be performed on each element.

# Java Stream API - `filter()` Method

The `filter()` method is an intermediate operation in the Java Stream API that allows you to select elements from a stream based on a specified condition. It is commonly used to filter out elements that do not meet a particular criteria, creating a new stream that contains only the elements that pass the filter.
It commonly takes a `Predicate` functional interface as the argument.

## Example

Let's say you have a list of numbers and you want to create a new stream that contains only the even numbers using the `filter()` method:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

// Using filter to select even numbers
Stream<Integer> evenNumbers = numbers.stream()
        .filter(number -> number % 2 == 0);
```

In this example, a lambda expression of the form `(number -> number % 2 == 0)` is used as the Predicate to filter out the even numbers.

# Java Stream API - `map()` Method

The `map()` method is an intermediate operation in the Java Stream API that allows you to transform each element of a stream into another object. It commonly takes a `Function` functional interface as the argument.

## Example

Let's say you have a list of integers, and you want to create a new stream that contains the square of each integer using the `map()` method:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// Using map to square each number
Stream<Integer> squaredNumbers = numbers.stream()
        .map(number -> number * number);
```

In this example, a lambda expression `(number -> number * number)` is used as a Function to square each integer in the stream. The resulting stream, squaredNumbers, contains the squared values.

# Java Stream API - `reduce()` Method

The `reduce()` method in the Java Stream API is a terminal operation used to combine elements of a stream into a single result. It allows you to perform reductions such as summing, finding the maximum or minimum, and more.

## Example

Let's say you have a list of numbers and you want to find the sum of all the numbers using the `reduce()` operation:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// Using reduce to calculate the sum of numbers
int sum = numbers.stream()
        .reduce(0, (a, b) -> a + b);
```

In this example, the reduce operation takes two arguments:

1. The identity value (0 in this case) is the initial value for the accumulation.
2. lambda expression (a, b) -> a + b is used as the binary operator to combine the elements. It defines how the accumulation is performed.

The result is the sum of all the numbers in the stream.

# Collectors in Java Stream API

Collectors are utility classes in the Java Stream API that facilitate the collection of elements from a stream into various data structures, such as lists, sets, and maps. They also enable operations like grouping, summing, averaging, and more. Let's explore some common collectors and their usage.

## Collecting to a List

You can use the `Collectors.toList()` collector to collect elements from a stream into a List.

## Example

- To collect elements into a List, you can use the `Collectors.toList()` collector:

```java
List<String> fruits = Stream.of("apple", "banana", "cherry")
        .collect(Collectors.toList());
```

This will create a list containing ["apple", "banana", "cherry"].

- To collect elements into a Set, you can use the `Collectors.toSet()` collector:

```java
Set<Integer> numbers = Stream.of(1, 2, 2, 3, 4)
        .collect(Collectors.toSet());
```

The elements in the stream are collected into a Set, which automatically removes duplicates.

- The Collectors.groupingBy() collector allows you to group elements based on a specific criterion. For example, to group a list of people by their age:

```java
List<Person> people = /* List of Person objects */;
Map<Integer, List<Person>> ageGroups = people.stream()
        .collect(Collectors.groupingBy(Person::getAge));
```

This creates a map where keys are ages, and values are lists of people of that age.

# Sorting in Java Stream API

Sorting is a common operation when working with data, and the Java Stream API provides a convenient way to sort elements in a stream. You can sort elements in ascending or descending order based on various criteria. Let's explore sorting using the Stream API.

## Example

Suppose you have a list of names and you want to sort them alphabetically in ascending order using the `sorted` method:

```java
List<String> names = Arrays.asList("Alice", "David", "Bob", "Eve", "Carol");

// Sorting names in ascending order
List<String> sortedNames = names.stream()
        .sorted()
        .collect(Collectors.toList());
```

This will sort the names alphabetically and return a new list with ["Alice", "Bob", "Carol", "David", "Eve"]
