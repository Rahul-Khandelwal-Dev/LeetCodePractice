package Questions;

import java.util.PriorityQueue;

/*
There is a school that has classes of students and each class will be having a final exam. You are given a 2D integer array classes, where classes[i] = [passi, totali]. You know beforehand that in the ith class, there are totali total students, but only passi number of students will pass the exam.
You are also given an integer extraStudents. There are another extraStudents brilliant students that are guaranteed to pass the exam of any class they are assigned to. You want to assign each of the extraStudents students to a class in a way that maximizes the average pass ratio across all the classes.
The pass ratio of a class is equal to the number of students of the class that will pass the exam divided by the total number of students of the class. The average pass ratio is the sum of pass ratios of all the classes divided by the number of the classes.
Return the maximum possible average pass ratio after assigning the extraStudents students. Answers within 10-5 of the actual answer will be accepted.
Example 1:
Input: classes = [[1,2],[3,5],[2,2]], extraStudents = 2
Output: 0.78333
Explanation: You can assign the two extra students to the first class. The average pass ratio will be equal to (3/4 + 3/5 + 2/2) / 3 = 0.78333.
 */
public class MaxAvgPassRatio {
        public double maxAverageRatio(int[][] classes, int extraStudents) {
            // Priority queue to store classes based on the maximum impact
            PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) ->  Double.compare(b[0], a[0]));

            // Initialize the priority queue with the impact of adding a student to each class
            for (int[] cls : classes) {
                int passi = cls[0], totali = cls[1];
                double impact = calculateImpact(passi, totali);
                pq.offer(new double[]{impact, passi, totali});
            }

            // Distribute the extra students
            while (extraStudents > 0) {
                double[] top = pq.poll();
                double impact = top[0];
                int passi = (int) top[1];
                int totali = (int) top[2];

                // Add one extra student to this class
                passi++;
                totali++;
                extraStudents--;

                // Recalculate the impact and reinsert the class into the priority queue
                pq.offer(new double[]{calculateImpact(passi, totali), passi, totali});
            }

            // Calculate the final average pass ratio
            double totalPassRatio = 0.0;
            while (!pq.isEmpty()) {
                double[] top = pq.poll();
                int passi = (int) top[1];
                int totali = (int) top[2];
                totalPassRatio += (double) passi / totali;
            }

            return totalPassRatio / classes.length;
        }

        // Helper function to calculate the impact of adding a student to a class
        private double calculateImpact(int passi, int totali) {
            return (double) (passi + 1) / (totali + 1) - (double) passi / totali;
        }
    }
