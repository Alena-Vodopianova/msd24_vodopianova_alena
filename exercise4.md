# Exercise 4: Testfälle für die Calculator-Klasse

## Testfälle für die Methoden

### 1. Methode `add()` (Addition)

| Testfall                 | Eingabe | Erwartetes Ergebnis | Beschreibung                      |
|--------------------------|---------|----------------------|-----------------------------------|
| testAddNormalValues()    | 2, 3    | 5                    | Addition positiver Zahlen         |
| testAddWithZero()        | 0, 0    | 0                    | Addition mit Null                 |
| testAddWithNegative()    | -2, 3   | 1                    | Addition mit negativer Zahl       |

### 2. Methode `minus()` (Subtraktion)

| Testfall                   | Eingabe | Erwartetes Ergebnis | Beschreibung                      |
|----------------------------|---------|----------------------|-----------------------------------|
| testMinusNormalValues()    | 5, 3    | 2                    | Subtraktion positiver Zahlen      |
| testMinusNegativeResult()  | 3, 5    | -2                   | Negatives Ergebnis                |
| testMinusWithZero()        | 0, 0    | 0                    | Subtraktion mit Null              |

### 3. Methode `multiply()` (Multiplikation)

| Testfall                      | Eingabe | Erwartetes Ergebnis | Beschreibung                      |
|-------------------------------|---------|----------------------|-----------------------------------|
| testMultiplyNormalValues()    | 2, 3    | 6                    | Multiplikation positiver Zahlen   |
| testMultiplyWithZero()        | 5, 0    | 0                    | Multiplikation mit Null           |
| testMultiplyWithNegative()    | -2, 3   | -6                   | Multiplikation mit negativer Zahl |

### 4. Methode `divide()` (Division)

| Testfall                    | Eingabe | Erwartetes Ergebnis | Beschreibung                      |
|-----------------------------|---------|----------------------|-----------------------------------|
| testDivideNormalValues()    | 6, 3    | 2.0                  | Division positiver Zahlen         |
| testDivideWithDecimal()     | 5, 2    | 2.5                  | Division mit Dezimalergebnis      |
| testDivideByZero()          | 5, 0    | Exception            | Division durch Null               |

### 5. Methode `factorial()` (Fakultät)

| Testfall                    | Eingabe | Erwartetes Ergebnis | Beschreibung                      |
|-----------------------------|---------|----------------------|-----------------------------------|
| testFactorialOfFive()       | 5       | 120                  | Fakultät einer positiven Zahl     |
| testFactorialOfZero()       | 0       | 1                    | Fakultät von Null                 |
| testFactorialOfNegative()   | -3      | 0                    | Fakultät einer negativen Zahl     |

## Testabdeckung

Die Testabdeckung wurde mittels JUnit-Tests sichergestellt. Ein Screenshot der Coverage ist unter `resources/images/ex4_1.png` zu finden.

## Test-Driven Development

Für die `factorial()`-Methode wurde der TDD-Ansatz (Red-Green-Refactor) angewendet. Der fehlgeschlagene Test vor der Implementierung ist in `resources/images/ex4_2.png` dokumentiert.