public class BostonMarathon {
    public static void main(String[] args) {
        // Array of runners' names
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", 
                          "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", 
                          "Neda", "Aaron", "Kate"};

        // Array of corresponding times (in minutes)
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        // Variables to hold the index of the fastest and second fastest runners
        int first = 0;
        int second = 0;

        // Loop through the times array to find the fastest and second fastest
        for (int i = 1; i < times.length; i++) {
            if (times[i] < times[first]) {
                second = first;
                first = i;
            } else if (times[i] < times[second] && times[i] != times[first]) {
                second = i;
            }
        }

        // Print the results
        System.out.println("The fastest runner is " + names[first] + " with a time of " + times[first] + " minutes.");
        System.out.println("The second fastest runner is " + names[second] + " with a time of " + times[second] + " minutes.");
    }
}
