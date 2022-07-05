package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.Button;
class ada10 extends Form implements HandlesEventDispatching {
  private TextBox TextBox1;
  private TextBox TextBox2;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AlignVertical(2);
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("ada10");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0xFFFFC800);
    TextBox1.FontBold(true);
    TextBox1.Width(LENGTH_FILL_PARENT);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.MultiLine(true);
    TextBox1.Text("10. Find the optimal solution for the Travelling Salesperson problemand then solve the same
    problem instance using any approximation algorithm");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0xFFFFC800);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.Hint("Hint for TextBox2");
    TextBox2.MultiLine(true);
    TextBox2.Text("#include <bits/stdc++.h>
    using namespace std;
    // Number of vertices in the graph
    #define V 5
    // Dynamic array to store the final answer
    vector<int> final_ans;
    int minimum_key(int key[], bool mstSet[])
    {
      int min = INT_MAX, min_index;
      for (int v = 0; v < V; v++)
      if (mstSet[v] == false && key[v] < min)
      min = key[v], min_index = v;
      return min_index;
    }
    vector<vector<int>> MST(int parent[], int graph[V][V])
    {
      vector<vector<int>> v;
      for (int i = 1; i < V; i++)
      {
        vector<int> p;
        p.push_back(parent[i]);
        p.push_back(i);
        v.push_back(p);
        p.clear();
      }
      return v;
    }
    // getting the Minimum Spanning Tree from the given graph
    // using Prim's Algorithm
    vector<vector<int>> primMST(int graph[V][V])
    {
      int parent[V];
      int key[V];
      // to keep track of vertices already in MST
      bool mstSet[V];
      // initializing key value to INFINITE & false for all mstSet
      for (int i = 0; i < V; i++)
      key[i] = INT_MAX, mstSet[i] = false;
      // picking up the first vertex and assigning it to 0
      key[0] = 0;
      parent[0] = -1;
      // The Loop
      for (int count = 0; count < V - 1; count++)
      {
        // checking and updating values wrt minimum key
        int u = minimum_key(key, mstSet);
        mstSet[u] = true;
        for (int v = 0; v < V; v++)
        if (graph[u][v] && mstSet[v] == false && graph[u][v] < key[v])
        parent[v] = u, key[v] = graph[u][v];
      }
      vector<vector<int>> v;
      v = MST(parent, graph);
      return v;
    }
    // getting the preorder walk of the MST using DFS
    void DFS(int** edges_list,int num_nodes,int starting_vertex,bool* visited_nodes)
    {
      // adding the node to final answer
      final_ans.push_back(starting_vertex);
      // checking the visited status
      visited_nodes[starting_vertex] = true;
      // using a recursive call
      for(int i=0;i<num_nodes;i++)
      {
        if(i==starting_vertex)
        {
          continue;
        }
        if(edges_list[starting_vertex][i]==1)
        {
          if(visited_nodes[i])
          {
            continue;
          }
          DFS(edges_list,num_nodes,i,visited_nodes);
        }
      }
    }
    int main()
    {
      // initial graph
      int graph[V][V] = { { 0, 10, 18, 40, 20 },
      { 10, 0, 35, 15, 12 },
      { 18, 35, 0, 25, 25 },
      { 40, 15, 25, 0, 30 },
      { 20, 13, 25, 30, 0 } };
      vector<vector<int>> v;
      // getting the output as MST
      v = primMST(graph);
      // creating a dynamic matrix
      int** edges_list = new int*[V];
      for(int i=0;i<V;i++)
      {
        edges_list[i] = new int[V];
        for(int j=0;j<V;j++)
        {
          edges_list[i][j] = 0;
        }
      }
      // setting up MST as adjacency matrix
      for(int i=0;i<v.size();i++)
      {
        int first_node = v[i][0];
        int second_node = v[i][1];
        edges_list[first_node][second_node] = 1;
        edges_list[second_node][first_node] = 1;
      }
      // a checker function for the DFS
      bool* visited_nodes = new bool[V];
      for(int i=0;i<V;i++)
      {
        bool visited_node;
        visited_nodes[i] = false;
      }
      //performing DFS
      DFS(edges_list,V,0,visited_nodes);
      // adding the source node to the path
      final_ans.push_back(final_ans[0]);
      // printing the path
      for(int i=0;i<final_ans.size();i++)
      {
        cout << final_ans[i] << '-';
      }
      return 0;
      }");
      Button2 = new Button(this);
      Button2.Text("prev");
      Button3 = new Button(this);
      Button3.Text("next");
    }
    public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
      return false;
    }
  }