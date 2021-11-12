package song;

import java.util.Scanner;
public class Input_15 {
public static void main(String[] args) {
int index = 0;
int[] array = new int[10];
int max;
int min;
while (true) {
if (index == array.length) {
break;
}
Scanner sc = new Scanner(System.in);
System.out.print("输入[" + (index + 1) + "]:");
try {
array[index] = sc.nextInt();
index++;
} catch (Exception e) {
System.out.println("输入错误，重新输入!");
e.printStackTrace();
}
}
max = array[0];
min = array[0];
for (int i = 1; i < array.length; i++) {
if (array[i] > max) {
max = array[i];
}
if (array[i] < min) {
min = array[i];
}
}
System.out.println("max = " + max);
System.out.println("min = " + min);
}
}