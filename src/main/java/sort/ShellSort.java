package sort;

/**
 * @program: algorithm
 * @description:
 * 希尔排序
 * 希尔排序算法通过设置一个间隔，对同样间隔的数的集合进行插入排序，此数集合中的元素
 * 移位的长度是以间隔的长度为准，这样就实现了大步位移。但是最后需要对元素集合进行一次直接插入排序，所以
 * 最后的间隔一定是1。
 * 如何确定这个间隔？有个经验值 h=3*b+1
 * 排序步骤：
 * 已间隔h将集合分隔为多个集合，每个集合都进行直接插入排序，然后间隔逐步减小，最后为1在进行一次直接插入排序
 * @author: liujiawei
 * @create: 2018-10-17 11:08
 **/
public class ShellSort {

    public static void main(String[] args) throws Exception {
        int[] array = {3, 1, 5, 7, 2 ,4, 9, 6};
        array = sort(array);
        for (int a: array) {
            System.out.print(a + " ");
        }
    }

    public static int[] sort(int[] array) {
        int h = 1;
        // 根据经验值先获得第一次的间隔，然后逐步减小
        while (h < array.length / InsertSort.FACTOR) {
            h = InsertSort.FACTOR * h + 1;
        }
        return InsertSort.sort(array, h);
    }



}
