import java.util.Scanner;
public class StMarksMgmt
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        int count = 0;
        int choice;
        do
        {
            System.out.println("\n--- Student Marks Management ---\n1. Add Marks\n2. View Marks\n3. Calculate Average\n4. Find Highest and Lowest\n5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1: if (count >= n)
                        System.out.println("All marks already entered!");
                    else
                    {
                        System.out.print("Enter marks for student " + (count + 1) + ": ");
                        marks[count] = sc.nextInt();
                        count++;
                        System.out.println("Marks added.");
                    } break;

                case 2: if (count == 0)
                        System.out.println("No marks entered yet!");
                    else
                    {
                        System.out.println("Marks of students:");
                        for (int i = 0; i < count; i++)
                            System.out.println("Student " + (i + 1) + ": " + marks[i]);
                    } break;

                case 3: if (count == 0)
                        System.out.println("No marks to calculate average!");
                        else
                        {
                            int sum = 0;
                            for (int i = 0; i < count; i++)
                                sum += marks[i];

                            double avg = (double) sum / count;
                            System.out.println("Average Marks: " + avg);
                        } break;

                case 4: if (count == 0)
                        System.out.println("No marks entered yet!");

                        else
                        {
                            int max = marks[0], min = marks[0];
                            for (int i = 1; i < count; i++)
                            {
                                if (marks[i] > max) max = marks[i];
                                if (marks[i] < min) min = marks[i];
                            }
                            System.out.println("Highest Marks: " + max);
                            System.out.println("Lowest Marks: " + min);
                        } break;

                case 5: System.out.println("Exiting...");   break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);
        sc.close();
    }
}
