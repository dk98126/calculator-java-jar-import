Демо 2 продолжение

Скомпилируем вместе с jar
```shell
javac -d output src/exercise/Exercise.java -cp ../calculator-java/output/Calculator.jar
```

Запустим вместе с jar
```shell
java -cp ../calculator-java/output/Calculator.jar:output/ exercise.Exercise
```

Демо 3

Библиотека для "красивого" консольного вывода
https://github.com/lalyos/jfiglet

Переключимся на ветку dep
```shell
git checkout dep
```

Скомпилируем с собранным jar и с jar (библиотекой) из интернета
```shell
javac -d output/ src/exercise/Exercise.java -cp ../calculator-java/output/Calculator.jar:jfiglet-0.0.9.jar
```

Запустим с собранным jar и с jar (библиотекой) из интернета
```shell
java -cp output/:../calculator-java/output/Calculator.jar:jfiglet-0.0.9.jar exercise.Exercise
```
