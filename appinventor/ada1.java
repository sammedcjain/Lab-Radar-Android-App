package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class ada1 extends Form implements HandlesEventDispatching {
  private Label Label1;
  private Button Button2;
  private TextBox TextBox1;
  private TextBox TextBox2;
  private TextBox TextBox3;
  private TextBox TextBox4;
  private TextBox TextBox5;
  private Button Button1;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("ada1");
    Label1 = new Label(this);
    Button2 = new Button(this);
    Button2.Text("< Main menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0xFFFFC800);
    TextBox1.FontBold(true);
    TextBox1.FontSize(20);
    TextBox1.Width(LENGTH_FILL_PARENT);
    TextBox1.MultiLine(true);
    TextBox1.Text("ANALYSIS AND DESIGN OF ALGORITHMS LAB :");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0xFFFFC800);
    TextBox2.FontBold(true);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.Hint("Hint for TextBox2");
    TextBox2.MultiLine(true);
    TextBox2.Text("1. Search a key element in a given set of elements using the methods list below and determine the
    time required. Repeat the experiment for different values of n and plot a graph of the time taken
    to search a key in different positions versus n(n is the number of elements in the list). The
    elements can be read from file or can be generated using the random number generator.
    a) Linear search
    b) Binary search
    c) Interpolation search
    Analyze the time efficiency of each of these methods and compare their performances by
    referring the graphs plotted.");
    TextBox3 = new TextBox(this);
    TextBox3.BackgroundColor(0xFFFFC800);
    TextBox3.Width(LENGTH_FILL_PARENT);
    TextBox3.Hint("Hint for TextBox3");
    TextBox3.MultiLine(true);
    TextBox3.Text("a) // Linear Search in C
    #include <stdio.h>
    int search(int array[], int n, int x) {
      // Going through array sequencially
      for (int i = 0; i < n; i++)
      if (array[i] == x)
      return i;
      return -1;
    }
    int main() {
      int array[] = {2, 4, 0, 1, 9};
      int x = 1;
      int n = sizeof(array) / sizeof(array[0]);
      int result = search(array, n, x);
      (result == -1) ? printf('Element not found') : printf('Element found at index: %d', result);
      }");
      TextBox4 = new TextBox(this);
      TextBox4.BackgroundColor(0xFFFFC800);
      TextBox4.FontBold(true);
      TextBox4.Width(LENGTH_FILL_PARENT);
      TextBox4.Hint("Hint for TextBox4");
      TextBox4.MultiLine(true);
      TextBox4.Text("b)  // Binary Search in C
      #include <stdio.h>
      int binarySearch(int array[], int x, int low, int high) {
        // Repeat until the pointers low and high meet each other
        while (low <= high) {
          int mid = low + (high - low) / 2;
          if (array[mid] == x)
          return mid;
          if (array[mid] < x)
          low = mid + 1;
          else
          high = mid - 1;
        }
        return -1;
      }
      int main(void) {
        int array[] = {3, 4, 5, 6, 7, 8, 9};
        int n = sizeof(array) / sizeof(array[0]);
        int x = 4;
        int result = binarySearch(array, x, 0, n - 1);
        if (result == -1)
        printf('Not found');
        else
        printf('Element is found at index %d', result);
        return 0;
        }");
        TextBox5 = new TextBox(this);
        TextBox5.BackgroundColor(0xFFFFC800);
        TextBox5.Width(LENGTH_FILL_PARENT);
        TextBox5.Hint("Hint for TextBox5");
        TextBox5.MultiLine(true);
        TextBox5.Text("c)  // C program to implement interpolation search
        // with recursion
        #include <stdio.h>
        // If x is present in arr[0..n-1], then returns
        // index of it, else returns -1.
        int interpolationSearch(int arr[], int lo, int hi, int x)
        {
          int pos;
          // Since array is sorted, an element present
          // in array must be in range defined by corner
          if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {
            // Probing the position with keeping
            // uniform distribution in mind.
            pos = lo
            + (((double)(hi - lo) / (arr[hi] - arr[lo]))
            * (x - arr[lo]));
            // Condition of target found
            if (arr[pos] == x)
            return pos;
            // If x is larger, x is in right sub array
            if (arr[pos] < x)
            return interpolationSearch(arr, pos + 1, hi, x);
            // If x is smaller, x is in left sub array
            if (arr[pos] > x)
            return interpolationSearch(arr, lo, pos - 1, x);
          }
          return -1;
        }
        // Driver Code
        int main()
        {
          // Array of items on which search will
          // be conducted.
          int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21,
          22, 23, 24, 33, 35, 42, 47 };
          int n = sizeof(arr) / sizeof(arr[0]);
          int x = 18; // Element to be searched
          int index = interpolationSearch(arr, 0, n - 1, x);
          // If element was found
          if (index != -1)
          printf('Element found at index %d', index);
          else
          printf('Element not found.');
          return 0;
        }
        ");
        Button1 = new Button(this);
        Button1.Text("next >");
      }
      public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
        return false;
      }
    }