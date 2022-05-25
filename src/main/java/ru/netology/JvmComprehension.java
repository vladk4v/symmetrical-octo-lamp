package ru.netology;

public class JvmComprehension {
	/**
	 * Загрузка класса JvmComprehension
	 * JvmComprehension.class в Metaspace
	 *
	 */

	public static void main(String[] args) {
		/**
		 * Внутри фрейма для метода "main"
		 *
		 * */


		int i = 1;// 1
		/**
		 * iconst_1
		 * Загрузка константы типа "int" в "operand stack" (фрейм)
		 *
		 * istore_1
		 * Сохранение значения из "operand stack" в "local variable" (фрейм)
 		 *
		 */

		Object o = new Object();// 2
		/**
		 * invokespecial (java/lang/Object)
		 * Вызов метода инициализации нового экземпляра объекта "java.lang.Object" (new).
		 * Получение ссылки (на экземпляр объекта)
		 *
		 *
		 * Экземпляр класса "Object" - в "heap"
		 *
		 * astore_2
		 * Сохранение ссылки из "operand stack" в "local variable" (фрейм)
		 *
		 */

		Integer ii = 2;	// 3
		/**
		 * iconst_2
		 * Загрузка константы типа "int" в "operand stack" (фрейм)
		 *
		 * invokestatic (java/lang/Integer.valueOf)
		 * Вызов метода "valueOf" класса "Integer". Получение ссылки (на экземпляр объекта)
		 *
		 *
		 * Экземпляр класса "Integer" - в "heap"
		 *
		 * astore_3
		 * Сохранение ссылки из "operand stack" в "local variable" (фрейм)
		 *
		 */

		printAll(o, i, ii);	// 4
		/**
		 * aload_2
		 * Загрузка "local variable" (ссылки на экземпляр объекта) в "operand stack" ("о") (фрейм)
		 *
		 * iload_1
		 * Загрузка "local variable" (примитива типа int) в "operand stack" ("i") (фрейм)
		 *
		 * aload_3
		 * Загрузка "local variable" (ссылки на экземпляр объекта) в "operand stack" ("ii") (фрейм)
		 *
		 * invokestatic (ru/netology/JvmComprehension.printAll)
		 * Вызов метода "printAll" класса "JvmComprehension"
		 *
		 *
		 * Создание фрейма для этого метода
		 *
		 */

		System.out.println("finished"); // 7
		/**
		 *
		 * ldc (String "finished")
		 * Загрузка значения типа "String" ("finished") из "constant pool" класса "JvmComprehension"
		 *
		 * invokevirtual (java/io/PrintStream.println)
		 * Вызов метода "println" класса "PrintStream"
		 *
		 *
		 * Создание фрейма для этого метода
		 *
		 * return
		 *
		 *
		 *
		 */

	}

	private static void printAll(Object o, int i, Integer ii) {
		/**
		 *
		 * Внутри фрейма для метода "printAll"
		 *
		*/
		Integer uselessVar = 700;
		/**
		 *
		 *
		 * Загрузка константы типа "int" в "operand stack" (фрейм)
		 *
		 *
		 * Вызов метода "valueOf" класса "Integer". Получение ссылки (на экземпляр объекта)
		 *
		 *
		 * Экземпляр класса "Integer" - в "heap"
		 *
		 *
		 * Сохранение ссылки из "operand stack" в "local variable" (фрейм)
		 *
		 * Будет являться объектом внимания GC, т.к. не используется
		 *
		 */

		System.out.println(o.toString() + i + ii); // 6
		/**
		 *
		 *
		 * Загрузка (получение?) "local variable" (ссылки на экземпляр объекта) в "operand stack" ("о")
		 *
		 * Methodref (java/lang/Object.toString)
		 * Вызов метода "toString" класса "String"
		 *
		 * Создание фрейма для этого метода
		 *
		 *
		 * 		Внутри фрейма для "toString"
		 *
		 *
		 * 		Возврат строкового значения экземпляра объекта (имя класса + @ + хэшкод)
		 *
		 *
		 * 		Закрытие фрейма
		 *
		 *
		 * Загрузка (получение?) "local variable" (примитива типа int) в "operand stack" ("i")
		 *
		 *
		 * Загрузка (получение?) "local variable" (ссылки на экземпляр объекта) в "operand stack" ("ii")
		 *
		 *
		 * Вызов метода "println" класса "PrintStream"
		 *
		 *
		 * Создание фрейма для этого метода
		 *
		 * return
		 *
		 */

	}
}


