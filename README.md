# CS 5800 Quiz 2

Calculator and DateChecker using Java, JUnit 5, and TDD.

## TDD reflection

This was my first time doing TDD. Writing a failing test first helped me understand what each method needed to do before implementing it. I found it interesting how assertTrue and assertFalse let me check both outcomes of the same method, and how parameterized tests let me test several months without writing separate tests for each one. I also learned how to check for a specific exception and its message when dividing by zero. When I extended the addition tests to include negative numbers and zero, they passed without changing the method. This showed me how tests can help avoid unnecessary code changes because the existing implementation already handled those cases. After each change, I ran the tests again to check that the new behavior worked and the earlier tests still passed.

## Final test summary

CompleteUnitTest runs both test classes:

- CalculatorTest: 11 tests passed.
- DateCheckerTest: 15 tests passed.
- Total: 26 tests, 0 failures, 0 errors, 0 skipped.

Run from the project folder with Java 17 or later and Maven on PATH:

```bash
mvn -Dtest=CompleteUnitTest test
```

```text
Tests run: 26, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```
