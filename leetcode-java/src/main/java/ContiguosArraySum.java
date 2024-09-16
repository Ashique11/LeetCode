public class ContiguosArraySum {
    public int maxSum(int arr[], int windowSize){
        int windowSum=0;
        int sum = 0;
        for(int i = 0; i < windowSize; i++){
            System.out.println(arr[i]);
            windowSum = windowSum + arr[i];
        }
        sum = windowSum;
        System.out.println("Initial window sum: "+sum);
        for(int i = windowSize; i < (arr.length); i++){
            windowSum = arr[i]+ windowSum - arr[i-windowSize];
            System.out.println(arr[i]);
            System.out.println("wind sum: "+windowSum);
            sum = Math.max(sum, windowSum);
        }
        System.out.println(sum);
        return sum;
    }
}
