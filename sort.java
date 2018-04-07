
//冒泡排序 Java
public void bubbleSort(int[] arr) {
    if (arr == null || arr.length < 2) return ; 
    for (int i = arr.length - 1; i > 0; i--) {
        boolean change = false;
        for (int j = 0; j < i; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
                change = true;
            }
        }
        if (!change) return;
    }
}

//交换算法
public void swap(int[] arr, int i, int j) {
    if (i == j) return ;
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
}
