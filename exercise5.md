# Exercise 5: Logging and Git Branching

## Why are logging libraries used?
Logging libraries are used to:
- Track the execution flow of an application.
- Diagnose errors and debug issues.
- Monitor application behavior in real-time.
- Store records of events for auditing or analysis.
- Provide flexibility in output destinations (console, files, databases) and log levels.

---


## Log4J Log Levels
Log4J has the following log levels (from lowest to highest priority):

| Level   | Description                                                                 |
|---------|-----------------------------------------------------------------------------|
| **TRACE** | Detailed debug information, typically for development.                     |
| **DEBUG** | Information useful for debugging the application.                          |
| **INFO**  | General information about application execution.                           |
| **WARN**  | Potential issues that do not disrupt functionality but require attention.  |
| **ERROR** | Errors that affect functionality but allow the application to continue.    |
| **FATAL** | Critical errors that halt the application.                                 |

---

## Configuration Options in Log4J
Log4J provides the following configuration capabilities:

- **Appenders**: Define where logs are written (e.g., `Console`, `File`, `RollingFile`, `Database`).
- **Layouts**: Customize log message formats using patterns (e.g., `%d{yyyy-MM-dd HH:mm:ss} %-5level %msg%n`).
- **Filters**: Control which log messages are recorded based on level, content, or other criteria.
- **Async Logging**: Improve performance by logging asynchronously.
- **Configuration Formats**: XML, JSON, YAML, or `.properties` files.
- **Environment-Specific Configs**: Use placeholders (e.g., `${env:LOG_PATH}`) for dynamic values.

Example `log4j2.xml` configuration:
```xml
<Configuration>
  <Appenders>
    <Console name="Console" target="SYSTEM_OUT">
      <PatternLayout pattern="%d{HH:mm:ss} [%t] %-5level %logger{36} - %msg%n"/>
    </Console>
    <File name="File" fileName="logs/app.log" append="true">
      <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} %-5level %msg%n"/>
    </File>
  </Appenders>
  <Loggers>
    <Root level="debug">
      <AppenderRef ref="Console"/>
      <AppenderRef ref="File"/>
    </Root>
  </Loggers>
</Configuration>
