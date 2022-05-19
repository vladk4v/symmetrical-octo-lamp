package ru.netology;


/**
 * Hello world!
 */
public class JvmComprehension {
	/**
	 * class_loading "JvmComprehension"
	 * загрузка класса, класс в metaspace
	 *
	 *
	 */

	public static void main(String[] args) {
		/**
		 * создание фрейма метода "main"
		 * */


		int i = 1;// 1
		/**
		 * создание примитива, присвоение значения
		 * загрузить во фрейм/стек
		 */

		Object o = new Object();// 2
		/**
		 * загрузить клас "Object"
		 * класс в heap
		 *
		 * создание экземпляра класса, связывание
		 *
		 */

		Integer ii = 2;	// 3
		/**
		 * загрузить класс "Integer"
		 * класс в heap
		 *
		 * создание экземпляра класса "ii", присвоение значения, связывание
		 * "ii" в стек/фрейм
		 *
		 */

		printAll(o, i, ii);	// 4
		/**
		 * создание фрейма "printAll"
		 */

		System.out.println("finished"); // 7
		/**
		 *
		 * загрузить класс "System"
		 * загрузить класс "String"
		 * классы в heap
		 *
		 * 		Создание фрейма для метода "println"
		 * 		передача значения "finished"
		 *
		 */

	}

	private static void printAll(Object o, int i, Integer ii) {
		/**
		 * Создать фрейм для метода "printALL"
		 * загрузить во фрейм "о", "i", "ii"
		 *
		*/
		Integer uselessVar = 700;
		/**
		 * загрузить класс "Integer"
		 * загрузить ао фрейм метода "printAll" значение переменной "uselessVar" класса "Integer"
		 * эта переменная будет будет объектом внимания GC, т.к. не используется
		 *
		 */

		System.out.println(o.toString() + i + ii); // 6
		/**
		 * загрузить класс "System"
		 *
		 * Создание фрейма для метода "println"
		 *
		 * 		Создание фрейма для метода "toString"
		 * 		Загрузить во фрейм значение "id"(?) экземпляра "о" класса "Object"
		 * 		Закрыть ("destroy" (?)) фрейм
		 *
		 * Загрузить значение примитива "i"
		 * Загрузить значение экземпляра "ii" класса "Integer"
		 *
		 */

	}
}


