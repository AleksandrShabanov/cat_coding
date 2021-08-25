package leetcode;

public class Task1 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] medianArray = new double[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, medianArray, 0, nums1.length);
        System.arraycopy(nums2, 0, medianArray, 0, nums2.length);

        for (int i = 0; i < medianArray.length; i++) {
            if (medianArray.length == 0) {
                return medianArray.length;
            }
            if (medianArray.length % 2 == 0) {

            }

        }
        return 0.0;
    }
}
