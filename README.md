Демо 2 продолжение

Скомпилируем вместе с jar
```shell
javac -d output src/exercise/Exercise.java -cp ../calculator-java/output/Calculator.jar
```

Запустим вместе с jar
```shell
java -cp ../calculator-java/output/Calculator.jar:output/ exercise.Exercise
```
