/*
Kotlin을 활용한 미니프로젝트 (1)
- 아래 주석을 보고 문제를 풀어 주세요.
- 문제 1번과 2번 사이에 1번 문제의 답을 적어주세요.
- 참고사항
    - 오답일 경우에도 부분 점수가 있기 때문에 모르시는 부분이 있더라도 최대한 작성 해주세요
    - 메소드 문제의 경우 함수 이름만 적어도 부분 점수가 있습니다
*/

/*
1번 문제(Part-변수 선언)
- 1-1. 가변 정수형 변수, 불변 정수형 변수를 각각 한개씩 선언하고 값은 10을 할당 해주세요.
         (변수명은 순서대로 mutableInt, immutableInt로 해주세요)
- 1-2. Null을 허용하지 않는 문자열 변수를 선언하고 "안녕하세요"를 값으로 할당 해주세요. (변수명은 notNullString으로 해주세요)
- 1-3. Null을 허용하는 정수형 변수를 선언하고 값은 10을 할당 해주세요. (변수명은 nullableInt로 해주세요)

힌트
1-1힌트 : 가변형 문자열 mutableString "안녕하세요" -> val mutableString : String = "안녕하세요"
1-1힌트 : 불변형 문자열 immutableString "안녕하세요" -> val immutableString : String = "안녕하세요"
1-2힌트 : null을 허용하는 정수형 변수 notNullInt 10 -> val notNullInt : Int = 10
1-3힌트 : null을 허용하지 않는 정수형 변수 nullableInt 10 -> val nullableInt : Int? = 10
 */
// 1번 문제 작성을 아래에 해주세요.
var mutableInt : Int = 10
val immutableInt : Int = 10

println(mutableInt)
println(immutableInt)

//2. null 허용하지 않는 문자열 변수 선언
var notNullString : String  = "안녕하세요"

//3. null 허용하는 정수형 변수 선언
var nullableInt : Int? = 10

println(notNullString)
println(nullableInt)


/*
2번 문제(Part-제어 흐름)
-1. 정수형 score 파라미터(인자)로 받고, score가 100일 경우에는 "합격" 100이 아닐 경우에는 "불합격"이 출력하는 함수 passOrNot 메소드를
선언해주세요"

힌트
- 아래 힌트를 보고 한글로 적힌 부분에 어떤 키워드와 이름을 사용할지 생각해보세요
- fun 함수이름 (파라미터 이름 : 파라미터 타입) {
    만약에 (score==100) println("합격")
    아니라면 println("불합격")
    }
 */
// 2번 문제 작성을 아래에 해주세요.
fun passOrNot(score:Int) {
    if (score == 100){
        println("합격")
    }else{
        println("불합격")
    }
}

passOrNot(100)
passOrNot(90)


/*
3번 문제 (Part-배열)
- 3-1. 정수만 들어 갈 수 있는 배열 intOnlyArray를 선언하고 10, 20, 30, 40을 넣어주세요
- 3-2. 문자열만 들어 갈 수 있는 배열 stringOnlyArray를 선언하고, "안녕", "Hello"를 넣어주세요

힌트
- 3-1 힌트 : 실수(소수점)만 들어 갈 수 있는 배열 floatOnlyArray -> val floatOnlyArray = floatArrayOf(10.0, 20.0, 30.0, 40.0)
- 3-2 힌트 : 정수만 들어 갈 수 있는 배열 intOnlyArray -> val intOnlyArray = arrayOf<Int>(10,20,30)
 */
// 3번 문제 작성을 아래에 해주세요.
//1. 정수형 변수 intOnlyArray
var intOnlyArray = arrayOf<Int>(10,20,30,40)


//2. 문자열 변수 stringOnlyArray
var stringOnlyArray = arrayOf<String>("안녕","Hello")

println(intOnlyArray[1])
println(stringOnlyArray[0])


/*
4번 문제(Part-메소드)
- 4-1. 정수형 number1과, 정수형 number2를 파라미터(인자)로받고, 두 수의 곱을 반환하는 메소드 multiplyNumbers메소드를 선언해주세요
- 4-2. 문자열 title 파라미터(인자)를 받고, 받은 파라미터를 출력 하고, 아무것도 반환하지 않는 메소드 showTitle 메소드를 선언해주세요

힌트
fun 함수명(파라미터1 이름 : 파라미터1 타입, 파라미터2 이름: 파리미터2 타입): 리턴타입{
    반환 파리미터1 * 파라미터2
}

fun 함수명(파라미터 이름 : 파라미터 타입): 리턴타입{
    println(파라미터)
}
 */
// 4번 문제 작성을 아래에 해주세요.
//메소드
// 1. 숫자 곱 리턴함수
fun multiplyNumbers(number1:Int, number2:Int):Int {
    return number1 * number2
}
// 2. title 출력 함수
fun showTitle(title:String){
    println(title)
}

//테스트
multiplyNumbers(10,20)
showTitle("타이틀")


/*
5번 문제(Part-반복문)
- 5-1. "안녕"을 열번 출력하는 메소드 helloTenTimes 을 선언해주세요 (반복문 키워드는 자유입니다, for, while, forEach 등등)
- 5-2. "2. 정수형 times라는 파라미터(인자)를 받고, times의 숫자번 만큼 ""Hello""를 출력하는 함수 helloManyTimes메소드를 선언해주세요
(인자로 받은 times의 값이 5인 경우 ""Hello""를 5번 출력 합니다)"

힌트 (힌트에서 제시하는 방법 이외에는 많은 풀이법이 있습니다)
fun 함수명(){
    반복자키워드 (i in 0..9){
        println("안녕")
    }
}

fun 함수명(파라미터 이름 : 파라미터 타입){
    반복자키워드 (i in 1..파라미터 이름){
        println("Hello")
    }
}
 */
// 5번 문제 작성을 아래에 해주세요.
//반복문
//1. 안녕 열번 출력 함수
fun helloTenTimes(){
    for(i in 1..10){
        println("안녕")
    }
}

//2. 안녕 여러번 출력
fun helloManyTimes(times:Int){
    for(i in 1..times){
        println("hello")
    }
}

helloTenTimes()
helloManyTimes(5)


