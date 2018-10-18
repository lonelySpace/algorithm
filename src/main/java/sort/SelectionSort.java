package sort;

/**
 * @program: algorithm
 * @description: 简单选择排序
 * 简单选择排序的基本思想：给定数组：int[] arr={里面n个数据}；第1趟排序，在待排序数据arr[1]~arr[n]中选出最小的数据，
 * 将它与arrr[1]交换；第2趟，在待排序数据arr[2]~arr[n]中选出最小的数据，将它与r[2]交换；
 * 以此类推，第i趟在待排序数据arr[i]~arr[n]中选出最小的数据，将它与r[i]交换，直到全部排序完成。
 * 时间复杂度O(n^2)
 * @author: liujiawei
 * @create: 2018-10-18 09:41
 **/
public class SelectionSort {

    public static void main(String[] args) throws Exception {
        int[] array = {1, 3, 2, 45, 65, 33, 12};
        array = sort(array);
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println("");
    }

    public static int[] sort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        for (int i = 0; i < array.length - 1; i++) {
            int k = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[k]) {
                    k = j;
                }
            }
            if (i != k) {
                int temp = array[i];
                array[i] = array[k];
                array[k] = temp;
            }
        }
        return array;
    }
}
