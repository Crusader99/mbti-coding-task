# Mercedes-Benz Tech Innovation

## Coding Task: Interval Merge Application


Welcome to the Interval Merge Application.
This application contains a simple console application for testing.
The actual `MERGE`-function can be found in `src/main/kotlin/com/mbti/codingtask/IntervalMerger.kt`
All automated test units (`src/test/kotlin/com/mbti/codingtask`) will run on a CI server after each pushed commit.

---

#### Robustness
```
Wie kann die Robustheit sichergestellt werden, vor allem auch mit Hinblick auf sehr große Eingaben?
- Im MERGE-Algorithmus muss ständig ein Intervall zu einer Liste hinzugefügt werden. Bei Verwendung vieler Intervalle ist es sinnvoll, eine LinkedList anstatt eine ArrayList zu verwenden, weil die LinkedList effizienter erweitert werden kann.
- Mögliche Integer-Überläufe müssen bei großen Eingaben verhindert werden, zum Beispiel indem größere Datentypen bei Berechnungen verwendet werden.
- Die Robustheit kann mit Unit-Tests erhöht werden, indem Soderfälle abgedeckt werden oder randomisierte Tests durchgeführt werden.
- Durch strikte Typisierung und Definition von erlaubten Werten, kann vermieden werden, dass ungewollte Sonderfälle überhaupt erst eintreten. Dabei unterstützt z. B. das Verbieten von Null-Werten mittels Kotlin.
- Damit große Eingaben in angemessener Zeit gemerged werden, muss die Laufzeit von Schleifen geprüft werden, u.a. auch bei der Sortierung der Intervalle.
```

---

#### Own Assumptions
- Intervals are always integer based.
- The first number of an interval is always less or equals to the second number. (a <= b for [a,b])

---

#### Building & Running
- This project can be built using Gradle 8.2 and JDK 17.
- A script will automatically install the correct Gradle version.
- No GUI is required to execute the console application, so it can be executed in a container.
- Please pass intervals that should be merged in the format '[start,end]', each separated by a space.
- Example build & execution command:
  - Linux: `./gradlew run --args='[25,30] [2,19] [14,23] [4,8]'`
  - Windows:`./gradlew.bat run --args='[25,30] [2,19] [14,23] [4,8]'`
- Command for running test units:
  - Linux: `./gradlew test`
  - Windows:`./gradlew.bat test`

---

#### Selected Technology Stack

- Programming language: **Kotlin** for better robustness against NullPointerExceptions and more readable code.
- Build tool: **Gradle** with Kotlin DSL for consistent usage of Kotlin, even in build scripts.
- Tests:
  - **JUnit 5** to find errors in the MERGE-algorithm through automated test units.
- Continuous integration (CI):
  - GitHub Actions to automatically execute all test units after every commit.
  - Earthly for reproducible execution, independent of GitHub Actions, Jenkins, CircleCI, etc.

---

#### License

This project is licensed under the [MIT license](https://github.com/Crusader99/mbti-coding-task/blob/main/LICENSE).
