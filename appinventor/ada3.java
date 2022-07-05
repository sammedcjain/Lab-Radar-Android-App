package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class ada3 extends Form implements HandlesEventDispatching {
  private Label Label1;
  private Button Button1;
  private TextBox TextBox2;
  private TextBox TextBox1;
  private TextBox TextBox3;
  private TextBox TextBox4;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AlignVertical(2);
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("ada3");
    Label1 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< Main Menu");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0xFFFFC800);
    TextBox2.FontBold(true);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.Hint("Hint for TextBox2");
    TextBox2.MultiLine(true);
    TextBox2.Text("3. Problems on graphs
    a) Print all the nodes reachable from a given starting node in a digraph using BFS method.
    b) Check whether a given graph is connected or not using DFSmethod.
    c) Obtain the topological ordering of vertices in a given digraph using (i) DFSmethod (ii) Edge
    elimination method");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0xFFFFC800);
    TextBox1.Width(LENGTH_FILL_PARENT);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.MultiLine(true);
    TextBox1.Text("a )// BFS algorithm in C
    #include <stdio.h>
    #include <stdlib.h>
    #define SIZE 40
    struct queue {
      int items[SIZE];
      int front;
      int rear;
      };
      struct queue* createQueue();
      void enqueue(struct queue* q, int);
      int dequeue(struct queue* q);
      void display(struct queue* q);
      int isEmpty(struct queue* q);
      void printQueue(struct queue* q);
      struct node {
        int vertex;
        struct node* next;
        };
        struct node* createNode(int);
        struct Graph {
          int numVertices;
          struct node** adjLists;
          int* visited;
          };
          // BFS algorithm
          void bfs(struct Graph* graph, int startVertex) {
            struct queue* q = createQueue();
            graph->visited[startVertex] = 1;
            enqueue(q, startVertex);
            while (!isEmpty(q)) {
              printQueue(q);
              int currentVertex = dequeue(q);
              printf('Visited %d\n', currentVertex);
              struct node* temp = graph->adjLists[currentVertex];
              while (temp) {
                int adjVertex = temp->vertex;
                if (graph->visited[adjVertex] == 0) {
                  graph->visited[adjVertex] = 1;
                  enqueue(q, adjVertex);
                }
                temp = temp->next;
              }
            }
          }
          // Creating a node
          struct node* createNode(int v) {
            struct node* newNode = malloc(sizeof(struct node));
            newNode->vertex = v;
            newNode->next = NULL;
            return newNode;
          }
          // Creating a graph
          struct Graph* createGraph(int vertices) {
            struct Graph* graph = malloc(sizeof(struct Graph));
            graph->numVertices = vertices;
            graph->adjLists = malloc(vertices * sizeof(struct node*));
            graph->visited = malloc(vertices * sizeof(int));
            int i;
            for (i = 0; i < vertices; i++) {
              graph->adjLists[i] = NULL;
              graph->visited[i] = 0;
            }
            return graph;
          }
          // Add edge
          void addEdge(struct Graph* graph, int src, int dest) {
            // Add edge from src to dest
            struct node* newNode = createNode(dest);
            newNode->next = graph->adjLists[src];
            graph->adjLists[src] = newNode;
            // Add edge from dest to src
            newNode = createNode(src);
            newNode->next = graph->adjLists[dest];
            graph->adjLists[dest] = newNode;
          }
          // Create a queue
          struct queue* createQueue() {
            struct queue* q = malloc(sizeof(struct queue));
            q->front = -1;
            q->rear = -1;
            return q;
          }
          // Check if the queue is empty
          int isEmpty(struct queue* q) {
            if (q->rear == -1)
            return 1;
            else
            return 0;
          }
          // Adding elements into queue
          void enqueue(struct queue* q, int value) {
            if (q->rear == SIZE - 1)
            printf('\nQueue is Full!!');
            else {
              if (q->front == -1)
              q->front = 0;
              q->rear++;
              q->items[q->rear] = value;
            }
          }
          // Removing elements from queue
          int dequeue(struct queue* q) {
            int item;
            if (isEmpty(q)) {
              printf('Queue is empty');
              item = -1;
              } else {
                item = q->items[q->front];
                q->front++;
                if (q->front > q->rear) {
                  printf('Resetting queue ');
                  q->front = q->rear = -1;
                }
              }
              return item;
            }
            // Print the queue
            void printQueue(struct queue* q) {
              int i = q->front;
              if (isEmpty(q)) {
                printf('Queue is empty');
                } else {
                  printf('\nQueue contains \n');
                  for (i = q->front; i < q->rear + 1; i++) {
                    printf('%d ', q->items[i]);
                  }
                }
              }
              int main() {
                struct Graph* graph = createGraph(6);
                addEdge(graph, 0, 1);
                addEdge(graph, 0, 2);
                addEdge(graph, 1, 2);
                addEdge(graph, 1, 4);
                addEdge(graph, 1, 3);
                addEdge(graph, 2, 4);
                addEdge(graph, 3, 4);
                bfs(graph, 0);
                return 0;
                }");
                TextBox3 = new TextBox(this);
                TextBox3.BackgroundColor(0xFFFFC800);
                TextBox3.FontBold(true);
                TextBox3.Width(LENGTH_FILL_PARENT);
                TextBox3.Hint("Hint for TextBox3");
                TextBox3.MultiLine(true);
                TextBox3.Text("b)  // DFS algorithm in C
                #include <stdio.h>
                #include <stdlib.h>
                struct node {
                  int vertex;
                  struct node* next;
                  };
                  struct node* createNode(int v);
                  struct Graph {
                    int numVertices;
                    int* visited;
                    // We need int** to store a two dimensional array.
                    // Similary, we need struct node** to store an array of Linked lists
                    struct node** adjLists;
                    };
                    // DFS algo
                    void DFS(struct Graph* graph, int vertex) {
                      struct node* adjList = graph->adjLists[vertex];
                      struct node* temp = adjList;
                      graph->visited[vertex] = 1;
                      printf('Visited %d \n', vertex);
                      while (temp != NULL) {
                        int connectedVertex = temp->vertex;
                        if (graph->visited[connectedVertex] == 0) {
                          DFS(graph, connectedVertex);
                        }
                        temp = temp->next;
                      }
                    }
                    // Create a node
                    struct node* createNode(int v) {
                      struct node* newNode = malloc(sizeof(struct node));
                      newNode->vertex = v;
                      newNode->next = NULL;
                      return newNode;
                    }
                    // Create graph
                    struct Graph* createGraph(int vertices) {
                      struct Graph* graph = malloc(sizeof(struct Graph));
                      graph->numVertices = vertices;
                      graph->adjLists = malloc(vertices * sizeof(struct node*));
                      graph->visited = malloc(vertices * sizeof(int));
                      int i;
                      for (i = 0; i < vertices; i++) {
                        graph->adjLists[i] = NULL;
                        graph->visited[i] = 0;
                      }
                      return graph;
                    }
                    // Add edge
                    void addEdge(struct Graph* graph, int src, int dest) {
                      // Add edge from src to dest
                      struct node* newNode = createNode(dest);
                      newNode->next = graph->adjLists[src];
                      graph->adjLists[src] = newNode;
                      // Add edge from dest to src
                      newNode = createNode(src);
                      newNode->next = graph->adjLists[dest];
                      graph->adjLists[dest] = newNode;
                    }
                    // Print the graph
                    void printGraph(struct Graph* graph) {
                      int v;
                      for (v = 0; v < graph->numVertices; v++) {
                        struct node* temp = graph->adjLists[v];
                        printf('\n Adjacency list of vertex %d\n ', v);
                        while (temp) {
                          printf('%d -> ', temp->vertex);
                          temp = temp->next;
                        }
                        printf('\n');
                      }
                    }
                    int main() {
                      struct Graph* graph = createGraph(4);
                      addEdge(graph, 0, 1);
                      addEdge(graph, 0, 2);
                      addEdge(graph, 1, 2);
                      addEdge(graph, 2, 3);
                      printGraph(graph);
                      DFS(graph, 2);
                      return 0;
                      }");
                      TextBox4 = new TextBox(this);
                      TextBox4.BackgroundColor(0xFFFFC800);
                      TextBox4.Width(LENGTH_FILL_PARENT);
                      TextBox4.Hint("Hint for TextBox4");
                      TextBox4.MultiLine(true);
                      TextBox4.Text("c)  #include <stdio.h>
                      int main(){
                        int i,j,k,n,a[10][10],indeg[10],flag[10],count=0;
                        printf('Enter the no of vertices:\n');
                        scanf('%d',&n);
                        printf('Enter the adjacency matrix:\n');
                        for(i=0;i<n;i++){
                          printf('Enter row %d\n',i+1);
                          for(j=0;j<n;j++)
                          scanf('%d',&a[i][j]);
                        }
                        for(i=0;i<n;i++){
                          indeg[i]=0;
                          flag[i]=0;
                        }
                        for(i=0;i<n;i++)
                        for(j=0;j<n;j++)
                        indeg[i]=indeg[i]+a[j][i];
                        printf('\nThe topological order is:');
                        while(count<n){
                          for(k=0;k<n;k++){
                            if((indeg[k]==0) && (flag[k]==0)){
                              printf('%d ',(k+1));
                              flag [k]=1;
                            }
                            for(i=0;i<n;i++){
                              if(a[i][k]==1)
                              indeg[k]--;
                            }
                          }
                          count++;
                        }
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