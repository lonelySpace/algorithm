package sort;

/**
 * @program: algorithm
 * @description:
 * 直接插入排序
 * 把n个待排序的元素看成一个有序表和一个无序表，开始时有序表中只有一个元素，无序表中有n-1个元素；
 * 排序过程即每次从无序表中取出第一个元素，将它插入到有序表中，使之成为新的有序表，重复n-1次完成整个排序过程。
 *    0.初始状态 3，1，5，7，2，4，9，6（共8个数）
 * 　　   有序表：3；无序表：1，5，7，2，4，9，6
 * 　　1.第一次循环，从无序表中取出第一个数 1，把它插入到有序表中，使新的数列依旧有序
 * 　　   有序表：1，3；无序表：5，7，2，4，9，6
 * 　　2.第二次循环，从无序表中取出第一个数 5，把它插入到有序表中，使新的数列依旧有序
 * 　　   有序表：1，3，5；无序表：7，2，4，9，6
 * 　　3.第三次循环，从无序表中取出第一个数 7，把它插入到有序表中，使新的数列依旧有序
 * 　　   有序表：1，3，5，7；无序表：2，4，9，6
 * 　　4.第四次循环，从无序表中取出第一个数 2，把它插入到有序表中，使新的数列依旧有序
 * 　　   有序表：1，2，3，5，7；无序表：4，9，6
 * 　　5.第五次循环，从无序表中取出第一个数 4，把它插入到有序表中，使新的数列依旧有序
 * 　　   有序表：1，2，3，4，5，7；无序表：9，6
 * 　　6.第六次循环，从无序表中取出第一个数 9，把它插入到有序表中，使新的数列依旧有序
 * 　　   有序表：1，2，3，4，5，7，9；无序表：6
 * 　　7.第七次循环，从无序表中取出第一个数 6，把它插入到有序表中，使新的数列依旧有序
 * 　　   有序表：1，2，3，4，5，6，7，9；无序表：（空）
 * @author: liujiawei
 * @create: 2018-10-17 11:27
 **/
public class InsertSort {

    public static int FACTOR = 3;

    public static void main(String[] args) throws Exception {
        int[] array = {3, 1, 5, 7, 2 ,4, 9, 6};
        array = sort(array);
        for (int a: array) {
            System.out.print(a + " ");
        }
    }

    /**
     * 直接插入排序
     * @param array
     * @return
     */
    public static int[] sort(int[] array) {
        return sort(array, 1);
    }

    public static int[] sort(int[] array, int h) {
        int i, j;
        if (array.length < 2) {
            return array;
        }
        while (h >= 1) {
            for (i = h; i < array.length; i++) {
                int temp = array[i];
                for (j = i; j >= h && array[j - h] > temp; j -= h) {
                    array[j] = array[j - h];
                }
                array[j] = temp;
            }
            h /= FACTOR;
        }
        return array;
    }
}
