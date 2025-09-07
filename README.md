# Thread Programming in Java

[![Java](https://img.shields.io/badge/Java-11%2B-orange?logo=java)](https://www.oracle.com/java/technologies/javase-downloads.html)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
![Build](https://img.shields.io/badge/build-manual-lightgrey)
[![Docs](https://img.shields.io/badge/docs-Javadoc-green)](./doc/index.html)

This educational repository features a set of illustrative examples that demonstrate the use of various threading methods in Java. The learning objectives are:

- Demonstrate practical usage of key thread-related methods, including but not limited to:
    - The [`java.lang.Thread`](https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/lang/Thread.html) class and the [`java.lang.Runnable`](https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/lang/Runnable.html) interface
    - `start()`
    - `sleep()`
    - `join()`
    - `setPriority()`
- Serve as a reference for writing well-documented, multithreaded Java code.

This project is part of the **Concurrent Programming** module at the [Federal University of Rio Grande do Norte (UFRN)](https://www.ufrn.br), Natal, Brazil.

---

## Repository Structure

Each package in the repository contains source code demonstrating a different method for programming with threads in Java. Packages within [`src/thread`](src/thread) are organized as follows:

```
.
├── doc/            # Javadoc documentation
├── src/thread      # Source code
│   ├── join/       # Demonstration of the Thread.join() method
│   ├── priority/   # Demonstration of the assignment of priorities to threads
│   ├── runnable/   # Demonstration of thread creation and execution by using the Runnable interface
│   ├── sleep/      # Demonstration of the Thread.sleep() method
│   ├── start/      # Demonstration of thread creation and execution by extending the Thread class
└── README.md
```

---

## 🚀 Getting Started

### ✅ Prerequisites

- Java 11+ (works with any modern JDK)
- A terminal or IDE (IntelliJ, Eclipse, VS Code, etc.)

---

## 🤝 Contributing

Contributions are welcome! Fork this repository and submit a pull request 🚀

---

## 📜 License

This project is licensed under the [MIT License](LICENSE).
