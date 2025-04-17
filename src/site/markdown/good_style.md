# Good Style Guide

## Writing Effective Code Comments

Effective code comments improve code readability and maintainability. Follow these best practices:

- **Be Clear and Concise**: Write comments that clearly explain the purpose of the code without unnecessary details.
- **Use Proper Grammar**: Ensure comments are grammatically correct and use consistent language (e.g., German for Javadoc in this project).
- **Comment Complex Logic**: Explain non-obvious code, such as algorithms or workarounds, to aid future developers.
- **Use Javadoc for APIs**: For public classes and methods, use Javadoc comments with `@param`, `@return`, and `@throws` to document functionality.
- **Avoid Redundant Comments**: Do not restate what the code already makes clear (e.g., `// Set x to 5` for `x = 5;`).

Example of a good Javadoc comment (in German, as used in this project):

```java
/**
 * Führt die Addition zweier Ganzzahlen durch.
 * @param a erste Ganzzahl
 * @param b zweite Ganzzahl
 * @return Summe der Ganzzahlen a und b
 */
public int add(int a, int b) {
    return a + b;
}
```

## Writing Effective Git Commit Messages

Good commit messages help track changes and collaborate effectively. Follow these guidelines:

- **Use Present Tense**: Write messages like "Add feature" instead of "Added feature".
- **Be Descriptive**: Summarize the change clearly, e.g., "Add German Javadoc comments for Calculator class".
- **Keep It Concise**: Aim for 50–72 characters for the first line, with details in the body if needed.
- **Reference Issues**: If applicable, include issue numbers, e.g., "Fix #123: Resolve division by zero error".
- **Separate Logical Changes**: Make small, focused commits rather than large, mixed changes.

Example of a good commit message:

```
Add site.xml to configure Maven Site structure

- Define menu with links to Introduction and Good Style Guide
- Include reports menu for Javadoc and JaCoCo integration
```

### References

- Oracle Javadoc Guide
- StackOverflow: Best Practices for Code Comments