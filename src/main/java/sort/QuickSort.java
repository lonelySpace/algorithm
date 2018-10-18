package sort;

/**
 * @program: algorithm
 * @description: 快速排序
 * 思想：
 * 1.从数列中选择一个数为基数
 * 2.然后将比它大的数都放在右边，比它小的数都放在它左边
 * 3.左右区间重复第2步
 * @author: liujiawei
 * @create: 2018-10-18 10:45
 **/
public class QuickSort {

    public static void main(String[] args) throws Exception {
        int[] array = {72, 6, 57, 88, 60, 42, 83, 73, 48, 85};
        sort(array, 0, array.length - 1);
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void sort(int[] array, int left, int right) {
        // 区间内只剩一个数的时候排序结束
        if (left < right) {
            int i = left;
            int j = right;
            // 现在区间内找一个基数
            int base = array[left];
            while (i < j) {
                // 从后往前找一个比基数小的数
                while (i < j && array[j] >= base) {
                    j--;
                }
                // 将比基数小的数放在左边区间
                if (i < j) {
                    array[i] = array[j];
                    i++;
                }
                // 从前往后找一个比基数大的数
                while (i < j && array[i] <= base) {
                    i++;
                }
                // 将比基数大的数放在右侧区间
                if (i < j) {
                    array[j] = array[i];
                    j--;
                }
            }
            // 最后将基数放在中间位置
            array[i] = base;
            // 左侧区间重复排序操作
            sort(array, left, i - 1);
            // 右侧区间重复排序操作
            sort(array, i + 1, right);
        }
    }
}
