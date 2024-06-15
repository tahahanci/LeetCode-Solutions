package hncdev;

public class NumberOfEmployees {

    /*
    There are n employees in a company, numbered from 0 to n - 1. Each employee i has worked for hours[i] hours in the
    company. The company requires each employee to work for at least target hours. You are given a 0-indexed array of
    non-negative integers hours of length n and a non-negative integer target. Return the integer denoting the number of
    employees who worked at least target hours.
     */

    public int numberOfEmployees(int[] hours, int target) {
        int count = 0;
        for (int hour : hours) {
            if (hour >= target)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] hours = {0,1,2,3,4};
        NumberOfEmployees numberOfEmployees = new NumberOfEmployees();
        int employees = numberOfEmployees.numberOfEmployees(hours, 2);
        System.out.println(employees);
    }
}
