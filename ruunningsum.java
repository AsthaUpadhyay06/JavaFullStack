public class ruunningsum {
    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4};

int[] ans = new int[arr.length];

for(int i = 0; i < arr.length - 1; i++) {
    ans[i] = arr[i]+ arr[i + 1];
    
}

for(int i = 0; i < ans.length; i++) {
    System.out.println(ans[i]);
}
    }
}

// int[] arr = {1, 2, 3, 4};

// int[] ans = new int[arr.length];

// ans[0] = arr[0];   // 1

// for(int i = 1; i < arr.length; i++) {
//     ans[i] = arr[i - 1] + arr[i];
// }

// for(int i = 0; i < ans.length; i++) {
//     System.out.println(ans[i]);
// }