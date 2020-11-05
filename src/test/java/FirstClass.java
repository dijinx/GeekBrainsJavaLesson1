public class FirstClass {

	byte aByte = 1;
	short aShort = 2;
	int anInt = 3;
	long aLong = 4l;

	double aDouble = 5.5;
	float aFloat = 6.6f;

	boolean aBoolean = true;

	char aChar = 'f';
	String aString = "Hi!";

	public static void main(String[]args) {

		System.out.println(result(1, 2, 3, 4));
		System.out.println(checkAmount(1, 2));
		positiveOrNegative(2);
		System.out.println(positiveOrNegative2(1));
		hiName("Картошкин Лаврентий Леопольдович");
		leapYear(2800);
	}

	//Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
	//где a, b, c, d – аргументы этого метода, имеющие тип float.
	public static float result(float a, float b, float c, float d) {
		float e = a * (b + (c / d));
		return e;
	}
	//Написать метод, принимающий на вход два целых числа и проверяющий,
	//что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

	public static boolean checkAmount(int a, int b) {
		if (a + b > 10 && a + b < 20)
			return true;
		else return false;
	}
	//Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
	//положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

	public static int positiveOrNegative(int a) {
		if (a >= 0)
			System.out.println("Number " + a + " is positive");
		else System.out.println("Number " + a + " is negative");
		return a;
	}
	//Написать метод, которому в качестве параметра передается целое число.
	//Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

	public static boolean positiveOrNegative2(int a) {
		if (a <= 0)
			return true;
		else {
			return false;
		}
	}
	//Написать метод, которому в качестве параметра передается строка, обозначающая имя.
	//Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

	public static void hiName(String a) {
		System.out.println("Привет, " + a + "!");
	}
	//* Написать метод, который определяет является ли год високосным,
	//и выводит сообщение в консоль. Каждый 4-й год является високосным,
	//кроме каждого 100-го, при этом каждый 400-й – високосный.

	public static void leapYear(int a) {
		if (a % 100 == 0 && a % 4 == 0 && a % 400 != 0)
			System.out.println("Год " + a + " не является високосным.");
		else if (a % 4 != 0)
			System.out.println("Год " + a + " не является високосным.");
		else if (a % 4 == 0)
			System.out.println("Год " + a + " является високосным.");

	}
}
