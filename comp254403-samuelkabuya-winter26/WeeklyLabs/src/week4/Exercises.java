package week4;/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


/**
 * Code for end-of-chapter exercises on asymptotics.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
class Exercises {

  /** Returns the sum of the integers in given array. */
  /*
  Big-Oh: 0(n)
  Loop goes through the array once using a single loop that runs 'n' times. Each operation inside the loop takes constant time.
  */
  public static int example1(int[] arr) {
    int n = arr.length, total = 0;
    for (int j=0; j < n; j++)       // loop from 0 to n-1
      total += arr[j];
    return total;
  }

  /** Returns the sum of the integers with even index in given array. */
  /*
  Big-Oh: 0(n)
  Loop goes the array by incremation of 2(j += 2), so it does the n/2 iterations. In Big-Oh we will drop constants so 0(n/2) will become 0(n)
  */
  public static int example2(int[] arr) {
    int n = arr.length, total = 0;
    for (int j=0; j < n; j += 2)    // note the increment of 2
      total += arr[j];
    return total;
  }

  /** Returns the sum of the prefix sums of given array. */
  /*
  Big-Oh: 0(n^2)
  We have a nested loop with the outer loop that runs n times and the inner loop runs  j + 1 times. This makes an arithmetic progression (1+2+...+n),
  which will result in the operation that will work like this (n^2 + n)/2 operations.
  */
  public static int example3(int[] arr) {
    int n = arr.length, total = 0;
    for (int j=0; j < n; j++)       // loop from 0 to n-1
      for (int k=0; k <= j; k++)    // loop from 0 to j
        total += arr[j];
    return total;
  }

  /** Returns the sum of the prefix sums of given array. */
  /*
  Big-Oh: 0(n)
  This method uses a single loop to find the prefix sums incrementally.
  It works similar to example 3 but it only visits each element once.
  */
  public static int example4(int[] arr) {
    int n = arr.length, prefix = 0, total = 0;
    for (int j=0; j < n; j++) {     // loop from 0 to n-1
      prefix += arr[j];
      total += prefix;
    }
    return total;
  }

  /** Returns the number of times second array stores sum of prefix sums from first. */
  /*
  Big-Oh: 0(n^3)
  Here we have 3 levels of nested loops. The outer loop i runs n times. Inside it loops are j and k
  that perform a task similar to example3. we multiply them together which gives us n * O(n^2) = O(n^3)
  */
  public static int example5(int[] first, int[] second) { // assume equal-length arrays
    int n = first.length, count = 0;
    for (int i=0; i < n; i++) {     // loop from 0 to n-1
      int total = 0;
      for (int j=0; j < n; j++)     // loop from 0 to n-1
        for (int k=0; k <= j; k++)  // loop from 0 to j
          total += first[k];
      if (second[i] == total) count++;
    }
    return count;
  }

}
