# Mercedes-Benz Tech Innovation

## Coding Task: Interval Merge Application

---

Welcome to the Interval Merge Application.

#### Basic Information:
- Contains a simple console application for testing
- Automated test units (`com/mbti/codingtask/MergeTest.kt`) will run after each commit
- The actual `MERGE`-function can be found in `/src/main/kotlin/com/mbti/codingtask/IntervalMerger.kt`

#### Building & Running:
- This project can be built using Gradle 8.2, a script will automatically install the correct version.
- No GUI is required to execute the console application, so it can be executed in a container.
- Please pass intervals that should be merged in the format '[start,end]', each separated a space.
- Example build & execution commands:
  - Linux: `./gradlew run --args='[25,30] [2,19] [14,23] [4,8]'`
  - Windows:`./gradlew.bat run --args='[25,30] [2,19] [14,23] [4,8]'`
- Example commands for running test units:
  - Linux: `./gradlew test`
  - Windows:`./gradlew.bat test`

#### Own Assumptions:
- Intervals are always integer based.
- The first number of an interval is always less or equals to the second number.

#### Selected Technology Stack:

- Programming Language: **Kotlin** for better robustness against NullPointerExceptions and more readable code.
- Build Tool: **Gradle** with Kotlin DSL for consistent usage of Kotlin, even in build scripts.
- Tests:
  - **JUnit 5** to identify errors in the merge algorithm through automated test units.
- Continuous Integration (CI):
  - GitHub Actions to automatically execute all test units after every commit.
  - Earthly for reproducible execution, independent of GitHub Actions, Jenkins, CircleCI, etc.

#### License

This project is licensed under the [MIT license](https://github.com/Crusader99/mbti-coding-task/blob/main/LICENSE).
