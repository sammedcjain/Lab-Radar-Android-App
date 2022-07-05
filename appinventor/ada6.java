package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class ada6 extends Form implements HandlesEventDispatching {
  private Label Label1;
  private Button Button1;
  private TextBox TextBox1;
  private TextBox TextBox2;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AlignVertical(2);
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("ada6");
    Label1 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< Main Menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0xFFFFC800);
    TextBox1.FontBold(true);
    TextBox1.Width(LENGTH_FILL_PARENT);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.MultiLine(true);
    TextBox1.Text("6. Compute the transitive closure of a given directed graph using Warshall'salgor ithm. Analyze its
    time efficiency.
    7. Compute the All pair shortest path of a given directedweighted graph using
    Floyds'salgorithm.Analyze its time efficiency.");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0xFFFFC800);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.Hint("Hint for TextBox2");
    TextBox2.MultiLine(true);
    TextBox2.Text("// Floyd-Warshall Algorithm in C
    #include <stdio.h>
    // defining the number of vertices
    #define nV 4
    #define INF 999
    void printMatrix(int matrix[][nV]);
    // Implementing floyd warshall algorithm
    void floydWarshall(int graph[][nV]) {
      int matrix[nV][nV], i, j, k;
      for (i = 0; i < nV; i++)
      for (j = 0; j < nV; j++)
      matrix[i][j] = graph[i][j];
      // Adding vertices individually
      for (k = 0; k < nV; k++) {
        for (i = 0; i < nV; i++) {
          for (j = 0; j < nV; j++) {
            if (matrix[i][k] + matrix[k][j] < matrix[i][j])
            matrix[i][j] = matrix[i][k] + matrix[k][j];
          }
        }
      }
      printMatrix(matrix);
    }
    void printMatrix(int matrix[][nV]) {
      for (int i = 0; i < nV; i++) {
        for (int j = 0; j < nV; j++) {
          if (matrix[i][j] == INF)
          printf('%4s', 'INF');
          else
          printf('%4d', matrix[i][j]);
        }
        printf('\n');
      }
    }
    int main() {
      int graph[nV][nV] = {{0, 3, INF, 5},
      {2, 0, INF, 4},
      {INF, 1, 0, INF},
      {INF, INF, 2, 0}};
      floydWarshall(graph);
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