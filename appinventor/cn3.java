package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class cn3 extends Form implements HandlesEventDispatching {
  private Button Button1;
  private TextBox TextBox1;
  private TextBox TextBox2;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("cn3");
    Button1 = new Button(this);
    Button1.Text("Main Menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0xFFFFC800);
    TextBox1.FontBold(true);
    TextBox1.Width(LENGTH_FILL_PARENT);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.MultiLine(true);
    TextBox1.Text("3. Simulate the working of sliding window protocol for flow control in computer networks. (Using
    a C program)");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0xFFFFC800);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.Hint("Hint for TextBox2");
    TextBox2.MultiLine(true);
    TextBox2.Text("#include <stdio.h>
    #include <stdlib.h>
    #include <string.h>
    #include <limits.h>
    struct Edge
    {
      int source, destination, weight;
      };
      struct Graph
      {
        int V, E;
        struct Edge* edge;
        };
        struct Graph* createGraph(int V, int E)
        {
          struct Graph* graph = (struct Graph*) malloc( sizeof(struct Graph));
          graph->V = V;
          graph->E = E;
          graph->edge = (struct Edge*) malloc( graph->E * sizeof( struct Edge ) );
          return graph;
        }
        void FinalSolution(int dist[], int n)
        {
          printf('\nVertex\tDistance from Source Vertex\n');
          int i;
          for (i = 0; i < n; ++i){
            printf('%d \t\t %d\n', i, dist[i]);
          }
        }
        void BellmanFord(struct Graph* graph, int source)
        {
          int V = graph->V;
          int E = graph->E;
          int StoreDistance[V];
          int i,j;
          for (i = 0; i < V; i++)
          StoreDistance[i] = INT_MAX;
          StoreDistance[source] = 0;
          for (i = 1; i <= V-1; i++)
          {
            for (j = 0; j < E; j++)
            {
              int u = graph->edge[j].source;
              int v = graph->edge[j].destination;
              int weight = graph->edge[j].weight;
              if (StoreDistance[u] + weight < StoreDistance[v])
              StoreDistance[v] = StoreDistance[u] + weight;
            }
          }
          for (i = 0; i < E; i++)
          {
            int u = graph->edge[i].source;
            int v = graph->edge[i].destination;
            int weight = graph->edge[i].weight;
            if (StoreDistance[u] + weight < StoreDistance[v])
            printf('This graph contains negative edge cycle\n');
          }
          FinalSolution(StoreDistance, V);
          return;
        }
        int main()
        {
          int V,E,S;
          printf('Enter number of vertices in graph\n');
          scanf('%d',&V);
          printf('Enter number of edges in graph\n');
          scanf('%d',&E);
          printf('Enter your source vertex number\n');
          scanf('%d',&S);
          struct Graph* graph = createGraph(V, E);
          int i;
          for(i=0;i<E;i++){
            printf('\nEnter edge %d properties Source, destination, weight respectively\n',i+1);
            scanf('%d',&graph->edge[i].source);
            scanf('%d',&graph->edge[i].destination);
            scanf('%d',&graph->edge[i].weight);
          }
          BellmanFord(graph, S);
          return 0;
        }
        ");
        Button2 = new Button(this);
        Button2.Text("< prev");
        Button3 = new Button(this);
        Button3.Text("next >");
      }
      public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
        return false;
      }
    }