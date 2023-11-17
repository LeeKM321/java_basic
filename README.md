# Java-Basic

자바 기초 문법 및 객체 문법 활용 레포지토리
<br>
<br>

## 이클립스를 이용하여 git clone 하기

- 원하는 폴더 경로에서 git bash 열기
- 깃허브 원격 저장소의 주소를 이용하여 clone 진행

```cmd
git clone https://github.com/LeeKM321/java_basic.git .
```

- 폴더에 원격 저장소 내용이 잘 들어왔는 지 확인 후
  이클립스를 시동.
- 이클립스 내에서 file -> import 선택
- select import wizard가 뜬다면, general 폴더 내의 Existing Projects into Workspace 선택
- Select root directory를 선택하고, Browse를 눌러서
  깃허브 원격 저장소에서 clone한 프로젝트를 선택.
- 프로젝트가 인식되었다면 선택 후 finish.

---
# 인텔리제이 설정

1. 한글버전 설치
- shift 두번 연타 후 plugin 검색

2. 테마, 아이콘 테마 설치
- plugin에서 material검색
- Atom material icon, Material Theme UI
    - 테마 적용하기
    - 파일 -> 설정 -> 테마 검색 후 -> 모양 탭에서 테마 선택

3. 기본 폰트사이즈, 폰트사이즈 조절 설정
- 파일 -> 설정 -> 글꼴 검색 후 사이즈 조정
- 파일 -> 설정 -> 마우스 검색 후 -> 일반 탭에서 -> 마우스 휠로 크기조절 + 모든에디터 적용 체크

4. 깃허브 연동
- 파일 -> 설정 -> 버전관리 -> github 계정 등록
- 하단부 터미널 열고 $ git rm -r --cached 입력

## 자바 8 람다 문법
- 여러가지 람다 표현식
1. `(String s) -> s.length()` : String형식의 파라미터 하나를 가지며 int를 반환한다. 람다표현식에는 return이 함축되어 있다.
1. `(Apple a) -> a.getWeight() > 150` : Apple형식의 파라미터 하나를 가지며 boolean을 반환한다.
1. int형식의 2개의 파라미터를 가지며 리턴값이 없다.
    ```
         (int x, int y) -> {
             System.out.println("Result:");
             System.out.println(x + y);
         }
    ```
1. `() -> 42` : 파라미터가 없으며 42를 반환한다.
- 제공되는 함수형 인터페이스
함수형 인터페이스 | 함수 디스크립터 
```
Predicate<T> | T -> boolean
Consumer<T> | T -> void
Function<T, R> | T -> R
Supplier<T> | () -> T
UnaryOperator<T> | T -> T
BinaryOperator<T> | (T, T) -> T
BiPredicate<L, R> | (T, U) -> boolean
BiConsumer<T, U> | (T, U) -> void
BiFunction<T, U, R> | (T, U) -> R
```
- 메서드 참조
    - `(args) -> ClassName.staticMethod(args)` => `ClassName::staticMethod`
        - `() -> Math.random()` => `Math::random`
        - `message -> System.out.println(message)` => `System.out::println`
    - `(args0, rest) -> args0.instanceMethod(rest)` => `ClassName::instanceMethod`
        - `(str, i) -> str.substring(i)` => `String::substring`
        - `(apple) -> apple.getWeight()` => `Apple::getWeight`
    - `(args) -> expr.instanceMethod(args)` => `expr::instanceMethod`
        - `(s) -> this.isValidName(s)` => `this::isValidName`
- 생성자 참조
    - `() -> new Constructor()` => `ClassName::new`
        - `() -> new Apple()`  => `Apple::new`
    - `(args) -> new Constructor(args)` => `ClassName::new`
        - `(weight) -> new Apple(weight)` => `Apple::new`

