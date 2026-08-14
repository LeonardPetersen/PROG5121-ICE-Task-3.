# PROG5121-ICE-Task-3.

## Project Description

This project is a simple Java application developed for **PROG5121 ICE Task 3**. The program demonstrates the use of variables, arithmetic operators, and basic output in Java.

The application uses two marks to calculate:

- The total of the two marks
- The average of the two marks

## Features

- Stores two marks using integer variables
- Calculates the total of the marks
- Calculates the average of the marks
- Displays the marks, total, and average
- Uses simple Java statements only

## Technologies Used

- Java
- Apache NetBeans
- Maven

## Project Structure

```text
PROG5121ICETask3
├── src/main/java/za/ac/iie/prog5121/icetask3/
│   └── MarkCalculator.java
├── src/test/
└── README.md
```

## How the Program Works

The program contains two variables:

```java
int markOne = 40;
int markTwo = 50;
```

The total is calculated by adding the two marks:

```java
int total = markOne + markTwo;
```

The average is calculated by dividing the total by two:

```java
double average = total / 2.0;
```

The results are displayed using `System.out.println()`.

## How to Run the Project

1. Open **Apache NetBeans**.
2. Select **File > Open Project**.
3. Browse to the `PROG5121ICETask3` project folder.
4. Open the project.
5. Navigate to `Source Packages > za.ac.iie.prog5121.icetask3 > MarkCalculator.java`.
6. Run the `MarkCalculator` class.
7. The program will display Mark 1, Mark 2, the total, and the average.

## Example Output

```text
Total: 120
Average: 60.0
```

## Requirements

The `MarkCalculator` class was kept simple according to the task requirements.

The project does **not** use:

- Scanner
- JOptionPane
- Loops
- Decision statements such as `if`, `else`, or `switch`

## Author

Created by Leonard Petersen

## Purpose

The purpose of this task is to demonstrate a basic understanding of Java variables, arithmetic calculations, and console output.
