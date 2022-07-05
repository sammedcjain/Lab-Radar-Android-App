package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class ada2 extends Form implements HandlesEventDispatching {
  private Label Label1;
  private Button Button1;
  private TextBox TextBox1;
  private TextBox TextBox2;
  private TextBox TextBox3;
  private TextBox TextBox4;
  private TextBox TextBox5;
  private TextBox TextBox6;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("ada2");
    Label1 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< main menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0xFFFFC800);
    TextBox1.FontBold(true);
    TextBox1.Width(LENGTH_FILL_PARENT);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.MultiLine(true);
    TextBox1.Text("2. Implement the following Sort algorithms to sort a given set ofelements and determine the time
    required to sort the elements. Repeat the experiment fordifferent values of n, the number of
    elements in the list to be sorted and plot a graph of thetime taken versus n. The elements can be
    read from a file or can be generated using therandom number generator.
    a) Selection Sort
    b) Merge Sort
    c) Quick Sort
    d) Insertion Sort
    e) Heap Sort
    Analyze the time efficiency of each of these methods and compare their performances by
    referring the graphs plotted.");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0xFFFFC800);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.Hint("Hint for TextBox2");
    TextBox2.MultiLine(true);
    TextBox2.Text("a)  // Selection sort in C
    #include <stdio.h>
    // function to swap the the position of two elements
    void swap(int *a, int *b) {
      int temp = *a;
      *a = *b;
      *b = temp;
    }
    void selectionSort(int array[], int size) {
      for (int step = 0; step < size - 1; step++) {
        int min_idx = step;
        for (int i = step + 1; i < size; i++) {
          // To sort in descending order, change > to < in this line.
          // Select the minimum element in each loop.
          if (array[i] < array[min_idx])
          min_idx = i;
        }
        // put min at the correct position
        swap(&array[min_idx], &array[step]);
      }
    }
    // function to print an array
    void printArray(int array[], int size) {
      for (int i = 0; i < size; ++i) {
        printf('%d  ', array[i]);
      }
      printf('\n');
      }");
      TextBox3 = new TextBox(this);
      TextBox3.BackgroundColor(0xFFFFC800);
      TextBox3.FontBold(true);
      TextBox3.Width(LENGTH_FILL_PARENT);
      TextBox3.Hint("Hint for TextBox3");
      TextBox3.MultiLine(true);
      TextBox3.Text("b)  // Merge sort in C
      #include <stdio.h>
      // Merge two subarrays L and M into arr
      void merge(int arr[], int p, int q, int r) {
        // Create L ← A[p..q] and M ← A[q+1..r]
        int n1 = q - p + 1;
        int n2 = r - q;
        int L[n1], M[n2];
        for (int i = 0; i < n1; i++)
        L[i] = arr[p + i];
        for (int j = 0; j < n2; j++)
        M[j] = arr[q + 1 + j];
        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = p;
        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        while (i < n1 && j < n2) {
          if (L[i] <= M[j]) {
            arr[k] = L[i];
            i++;
            } else {
              arr[k] = M[j];
              j++;
            }
            k++;
          }
          // When we run out of elements in either L or M,
          // pick up the remaining elements and put in A[p..r]
          while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
          }
          while (j < n2) {
            arr[k] = M[j];
            j++;
            k++;
          }
        }
        // Divide the array into two subarrays, sort them and merge them
        void mergeSort(int arr[], int l, int r) {
          if (l < r) {
            // m is the point where the array is divided into two subarrays
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            // Merge the sorted subarrays
            merge(arr, l, m, r);
          }
        }
        // Print the array
        void printArray(int arr[], int size) {
          for (int i = 0; i < size; i++)
          printf('%d ', arr[i]);
          printf('\n');
          }");
          TextBox4 = new TextBox(this);
          TextBox4.BackgroundColor(0xFFFFC800);
          TextBox4.Width(LENGTH_FILL_PARENT);
          TextBox4.Hint("Hint for TextBox4");
          TextBox4.MultiLine(true);
          TextBox4.Text("c)  // Quick sort in C
          #include <stdio.h>
          // function to swap elements
          void swap(int *a, int *b) {
            int t = *a;
            *a = *b;
            *b = t;
          }
          // function to find the partition position
          int partition(int array[], int low, int high) {
            // select the rightmost element as pivot
            int pivot = array[high];
            // pointer for greater element
            int i = (low - 1);
            // traverse each element of the array
            // compare them with the pivot
            for (int j = low; j < high; j++) {
              if (array[j] <= pivot) {
                // if element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;
                // swap element at i with element at j
                swap(&array[i], &array[j]);
              }
            }
            // swap the pivot element with the greater element at i
            swap(&array[i + 1], &array[high]);
            // return the partition point
            return (i + 1);
          }
          void quickSort(int array[], int low, int high) {
            if (low < high) {
              // find the pivot element such that
              // elements smaller than pivot are on left of pivot
              // elements greater than pivot are on right of pivot
              int pi = partition(array, low, high);
              // recursive call on the left of pivot
              quickSort(array, low, pi - 1);
              // recursive call on the right of pivot
              quickSort(array, pi + 1, high);
            }
          }
          // function to print array elements
          void printArray(int array[], int size) {
            for (int i = 0; i < size; ++i) {
              printf('%d  ', array[i]);
            }
            printf('\n');
          }
          // main function
          int main() {
            int data[] = {8, 7, 2, 1, 0, 9, 6};
            int n = sizeof(data) / sizeof(data[0]);
            printf('Unsorted Array\n');
            printArray(data, n);
            // perform quicksort on data
            quickSort(data, 0, n - 1);
            printf('Sorted array in ascending order: \n');
            printArray(data, n);
            }");
            TextBox5 = new TextBox(this);
            TextBox5.BackgroundColor(0xFFFFC800);
            TextBox5.FontBold(true);
            TextBox5.Width(LENGTH_FILL_PARENT);
            TextBox5.Hint("Hint for TextBox5");
            TextBox5.MultiLine(true);
            TextBox5.Text("d)  // Insertion sort in C
            #include <stdio.h>
            // Function to print an array
            void printArray(int array[], int size) {
              for (int i = 0; i < size; i++) {
                printf('%d ', array[i]);
              }
              printf('\n');
            }
            void insertionSort(int array[], int size) {
              for (int step = 1; step < size; step++) {
                int key = array[step];
                int j = step - 1;
                // Compare key with each element on the left of it until an element smaller than
                // it is found.
                // For descending order, change key<array[j] to key>array[j].
                while (key < array[j] && j >= 0) {
                  array[j + 1] = array[j];
                  --j;
                }
                array[j + 1] = key;
              }
            }
            // Driver code
            int main() {
              int data[] = {9, 5, 1, 4, 3};
              int size = sizeof(data) / sizeof(data[0]);
              insertionSort(data, size);
              printf('Sorted array in ascending order:\n');
              printArray(data, size);
              }");
              TextBox6 = new TextBox(this);
              TextBox6.BackgroundColor(0xFFFFC800);
              TextBox6.Width(LENGTH_FILL_PARENT);
              TextBox6.Hint("Hint for TextBox6");
              TextBox6.MultiLine(true);
              TextBox6.Text("e)  // Heap Sort in C
              #include <stdio.h>
              // Function to swap the the position of two elements
              void swap(int *a, int *b) {
                int temp = *a;
                *a = *b;
                *b = temp;
              }
              void heapify(int arr[], int n, int i) {
                // Find largest among root, left child and right child
                int largest = i;
                int left = 2 * i + 1;
                int right = 2 * i + 2;
                if (left < n && arr[left] > arr[largest])
                largest = left;
                if (right < n && arr[right] > arr[largest])
                largest = right;
                // Swap and continue heapifying if root is not largest
                if (largest != i) {
                  swap(&arr[i], &arr[largest]);
                  heapify(arr, n, largest);
                }
              }
              // Main function to do heap sort
              void heapSort(int arr[], int n) {
                // Build max heap
                for (int i = n / 2 - 1; i >= 0; i--)
                heapify(arr, n, i);
                // Heap sort
                for (int i = n - 1; i >= 0; i--) {
                  swap(&arr[0], &arr[i]);
                  // Heapify root element to get highest element at root again
                  heapify(arr, i, 0);
                }
              }
              // Print an array
              void printArray(int arr[], int n) {
                for (int i = 0; i < n; ++i)
                printf('%d ', arr[i]);
                printf('\n');
              }
              // Driver code
              int main() {
                int arr[] = {1, 12, 9, 5, 6, 10};
                int n = sizeof(arr) / sizeof(arr[0]);
                heapSort(arr, n);
                printf('Sorted array is \n');
                printArray(arr, n);
                }");
                Button2 = new Button(this);
                Button2.Text("< prev");
                Button3 = new Button(this);
                Button3.Text("next >");
              }
              public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
                return false;
              }
            }