package GFG160Challenge.Sorting;

public class Solution027Approach2 {

    //TC = O(n), SC = O(n)
    public void mergeArrays(int a[], int b[]) {
        // code here
        int[] arr = new int[a.length + b.length];
        int indexForArr = 0;
        int indexForA = 0;
        int indexForB = 0;
        while (indexForA != a.length && indexForB != b.length) {
            if (a[indexForA] > b[indexForB]) {
                arr[indexForArr++] = b[indexForB];
                indexForB++;
            } else {
                arr[indexForArr++] = a[indexForA];
                indexForA++;
            }
        }

        if (indexForA == a.length) {
            //Put elements of B in arr
            while (indexForB != b.length)
                arr[indexForArr++] = b[indexForB++];
        } else {
            while (indexForA != a.length)
                arr[indexForArr++] = a[indexForA++];
        }
        indexForArr = 0;
        while (indexForArr < a.length) {
            a[indexForArr] = arr[indexForArr];
            indexForArr++;
        }

        int i = 0;
        while (i < b.length) {
            b[i] = arr[indexForArr];
            i++;
            indexForArr++;
        }

    }
}