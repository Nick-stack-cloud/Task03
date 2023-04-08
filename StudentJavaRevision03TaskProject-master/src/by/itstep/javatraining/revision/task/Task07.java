package by.itstep.javatraining.revision.task;

/*	Task 07. Chess & Queen [шахматный ферзь]
 *
 *	Шахматный ферзь (chess queen) ходит по диагонали, горизонтали или вертикали.
 *	Даны две различные клетки шахматной доски, определите,
 *	может ли ферзь попасть с первой клетки на вторую одним ходом.
 *
 *	Формат входных данных [input]
 *	Функция принимает на вход четыре числа от 1 до 8 каждое (не забудьте про "защиту от дурака"),
 *	задающие номер столбца и номер строки сначала для первой клетки (x1, y1),
 *	потом для второй клетки (x2, y2).
 *
 *	Формат выходных данных [output]
 *	Функция должна возвратить булевское значение - результат решения.
 *
 *	[ input 1]: 4 4 5 5
 *	[output 1]: true
 *
 *	[ input 2]: 4 4 5 8
 *	[output 2]: false
 */

public class Task07 {
    public static boolean task07(int x1, int y1, int x2, int y2) {

        return x1 > 0 && x2 > 0 && y1 > 0 && y2 > 0 && x1 < 9 && x2 < 9 && y1 < 9 && y2 < 9 &&
                ((x2 == x1 && Math.abs(y2 - y1) < 7) ||
                (Math.abs(x2 - x1) < 7 && y2 == y1) ||
                ((Math.abs(y2 - y1) == 1 && Math.abs(x2 - x1) == 1) ||
                (y2 == y1 && Math.abs(x2 - x1) == 1) ||
                (Math.abs(y2 - y1) == 1 && x2 == x1)) ||
                (Math.abs(x2 - x1) == 2 && Math.abs(y2 - y1) == 2) ||
                (Math.abs(x2 - x1) == 3 && Math.abs(y2 - y1) == 3) ||
                (Math.abs(x2 - x1) == 4 && Math.abs(y2 - y1) == 4) ||
                (Math.abs(x2 - x1) == 5 && Math.abs(y2 - y1) == 5) ||
                (Math.abs(x2 - x1) == 6 && Math.abs(y2 - y1) == 6) ||
                (Math.abs(x2 - x1) == 7 && Math.abs(y2 - y1) == 7)) &&
                !(x2 == x1 && y2 == y1);
    }
}
