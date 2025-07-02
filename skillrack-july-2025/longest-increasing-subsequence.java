// LEETCODE:300
  
// Approach:Binary Search
// Create a list
// Every iteration has two type of actions
//   ->If the list is empty(since arr[0] does not have greater element) ||the last element is lesser than the current element appends it 
//   ->Else use the binary search that find the pos for the current element and replace it

// Example:
// arr=10 9 2 5 3 7 101 18
// Iteration 1:
// list=10
// Iteration 2:
// list=9
// Iteration 3:
// list=2
// Iteration 4:
// list=2 5
// Iteration 5:
// list=2 3
// Iteration 6:
// list=2 3 7
// Iteration 7:
// list=2 3 7 101
// Iteration 8:
// list=2 3 7 18
// return 4(list size);

class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.isEmpty() || num > list.get(list.size() - 1)) {
                list.add(num);
            }else {
                int low = 0, high = list.size() - 1;
                while (low < high) {
                    int mid = low + (high - low) / 2;
                    if (list.get(mid) < num) {
                        low = mid + 1;
                    } else {
                        high = mid;
                    }
                }
                list.set(low, num); 
            }
        }
        return list.size();
    }
}

  
  
  
