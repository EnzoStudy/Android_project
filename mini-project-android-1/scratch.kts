/////////////////////////////////////////////
// 변수선언
// 1. 가변 정수형 변수, 불변 정수형 번수
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

/////////////////////////////////////////////
// 제어흐름
fun passOrNot(score:Int) {
    if (score == 100){
        println("합격")
    }else{
        println("불합격")
    }
}

passOrNot(100)
passOrNot(90)

/////////////////////////////////////////////
// 배열
//1. 정수형 변수 intOnlyArray
var intOnlyArray:Array<Int> = arrayOf(10,20,30,40)


//2. 문자열 변수 stringOnlyArray
var stringOnlyArray:Array<String> = arrayOf("안녕","Hello")

println(intOnlyArray[1])
println(stringOnlyArray[0])


/////////////////////////////////////////////
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

/////////////////////////////////////////////
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