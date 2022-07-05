package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class ada8 extends Form implements HandlesEventDispatching {
  private Label Label1;
  private Button Button1;
  private TextBox TextBox1;
  private TextBox TextBox2;
  private TextBox TextBox3;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AlignVertical(2);
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("ada8");
    Label1 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< Main menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0xFFFFC800);
    TextBox1.FontBold(true);
    TextBox1.Width(LENGTH_FILL_PARENT);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.MultiLine(true);
    TextBox1.Text("8. Implement 0/1 Knapsack problem using dynamic programming.Analyze its time efficiency.
    9. Implement N Queen's problem using Back Tracking.Analyze its time efficiency.");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0xFFFFC800);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.Hint("Hint for TextBox2");
    TextBox2.MultiLine(true);
    TextBox2.Text("8)  /* A Naive recursive implementation
    of 0-1 Knapsack problem */
    #include <stdio.h>
    // A utility function that returns
    // maximum of two integers
  int max(int a, int b) { return (a > b) ? a : b; }
  // Returns the maximum value that can be
  // put in a knapsack of capacity W
  int knapSack(int W, int wt[], int val[], int n)
  {
    // Base Case
    if (n == 0 || W == 0)
    return 0;
    // If weight of the nth item is more than
    // Knapsack capacity W, then this item cannot
    // be included in the optimal solution
    if (wt[n - 1] > W)
    return knapSack(W, wt, val, n - 1);
    // Return the maximum of two cases:
    // (1) nth item included
    // (2) not included
    else
    return max(
    val[n - 1]
    + knapSack(W - wt[n - 1],
    wt, val, n - 1),
    knapSack(W, wt, val, n - 1));
  }
  // Driver program to test above function
  int main()
  {
    int val[] = { 60, 100, 120 };
    int wt[] = { 10, 20, 30 };
    int W = 50;
    int n = sizeof(val) / sizeof(val[0]);
    printf('%d', knapSack(W, wt, val, n));
    return 0;
    }");
    TextBox3 = new TextBox(this);
    TextBox3.BackgroundColor(0xFFFFC800);
    TextBox3.FontBold(true);
    TextBox3.Width(LENGTH_FILL_PARENT);
    TextBox3.Hint("Hint for TextBox3");
    TextBox3.MultiLine(true);
    TextBox3.Text("9)  * C program to solve N Queen Problem using
    backtracking */
    #define N 4
    #include <stdbool.h>
    #include <stdio.h>
    /* A utility function to print solution */
    void printSolution(int board[N][N])
    {
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++)
        printf(' %d ', board[i][j]);
        printf('\n');
      }
    }
    /* A utility function to check if a queen can
    be placed on board[row][col]. Note that this
    function is called when 'col' queens are
    already placed in columns from 0 to col -1.
    So we need to check only left side for
    attacking queens */
    bool isSafe(int board[N][N], int row, int col)
    {
      int i, j;
      /* Check this row on left side */
      for (i = 0; i < col; i++)
      if (board[row][i])
      return false;
      /* Check upper diagonal on left side */
      for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
      if (board[i][j])
      return false;
      /* Check lower diagonal on left side */
      for (i = row, j = col; j >= 0 && i < N; i++, j--)
      if (board[i][j])
      return false;
      return true;
    }
    /* A recursive utility function to solve N
    Queen problem */
    bool solveNQUtil(int board[N][N], int col)
    {
      /* base case: If all queens are placed
      then return true */
      if (col >= N)
      return true;
      /* Consider this column and try placing
      this queen in all rows one by one */
      for (int i = 0; i < N; i++) {
        /* Check if the queen can be placed on
        board[i][col] */
        if (isSafe(board, i, col)) {
          /* Place this queen in board[i][col] */
          board[i][col] = 1;
          /* recur to place rest of the queens */
          if (solveNQUtil(board, col + 1))
          return true;
          /* If placing queen in board[i][col]
          doesn't lead to a solution, then
          remove queen from board[i][col] */
          board[i][col] = 0; // BACKTRACK
        }
      }
      /* If the queen cannot be placed in any row in
      this column col then return false */
      return false;
    }
    /* This function solves the N Queen problem using
    Backtracking. It mainly uses solveNQUtil() to
    solve the problem. It returns false if queens
    cannot be placed, otherwise, return true and
    prints placement of queens in the form of 1s.
    Please note that there may be more than one
    solutions, this function prints one of the
    feasible solutions.*/
    bool solveNQ()
    {
      int board[N][N] = { { 0, 0, 0, 0 },
      { 0, 0, 0, 0 },
      { 0, 0, 0, 0 },
      { 0, 0, 0, 0 } };
      if (solveNQUtil(board, 0) == false) {
        printf('Solution does not exist');
        return false;
      }
      printSolution(board);
      return true;
    }
    // driver program to test above function
    int main()
    {
      solveNQ();
      return 0;
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