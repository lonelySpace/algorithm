package sort;


/**
 * @program: algorithm
 * @description: 冒泡排序
 * 思路：依次比较相邻的两个数，将小数放在前面，大数放在后面。即在第一趟：首先比较第1个和第2个数，将小数放前，大数放后。
 * 然后比较第2个数和第3个数，将小数放前，大数放后，如此继续，直至比较最后两个数，将小数放前，大数放后。
 * 重复第一趟步骤，直至全部排序完成。
 * 第一趟比较完成后，最后一个数一定是数组中最大的一个数，所以第二趟比较的时候最后一个数不参与比较；
 * 第二趟比较完成后，倒数第二个数也一定是数组中第二大的数，所以第三趟比较的时候最后两个数不参与比较；
 * 依次类推，每一趟比较次数-1；
 * 时间复杂度为：O(n^2)
 * @author: liujiawei
 * @create: 2018-10-18 10:08
 **/
public class BubbleSort {

    public static void main(String[] args) throws Exception {
        int[] array = {6, 3, 8, 2, 9, 1};
        sort(array);
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static int[] sort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
