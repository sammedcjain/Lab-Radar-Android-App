package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
class Screen18 extends Form implements HandlesEventDispatching {
  private Label Label3;
  private Button Button1;
  private Label Label1;
  private Label Label2;
  private Button Button3;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("Screen18");
    Label3 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< Main menu");
    Label1 = new Label(this);
    Label1.FontBold(true);
    Label1.FontSize(16);
    Label1.Text("15. Implement a C program to construct a Binary Search Tree, to search for an element in BST and to display the elements in the tree using Inorder traversals.");
    Label2 = new Label(this);
    Label2.Text("#include<stdio.h>
    #include<string.h>
    #include<stdlib.h>
    struct tnode
    {
      int data;
      struct tnode * leftc;
      struct tnode * rightc;
      };
      void insert(struct tnode **, int num);
      void inorder(struct tnode *);
      void printLevelOrder(struct tnode* root);
      void printGivenLevel(struct tnode* root, int level);
      int height(struct tnode* node);
      int search(struct tnode *root, int data){
        struct tnode *current = root;
        while(current->data != data){
          if(current != NULL) {
            //go to left tree
            if(current->data > data){
              current = current->leftc;
              }  //else go to right tree
              else {
                current = current->rightc;
              }
              //not found
              if(current == NULL){
                return 0;
              }
            }
          }
          return 1;
        }
        int main()
        {
          struct tnode * root=NULL;
          char ch[5];
          int num;
          do  {
            printf('Enter the element to be inserted in the tree\n');
            scanf('%d',&num);
            insert(&root, num);
            printf('Do you want to insert another element?\n');
            scanf('%s',ch);
            }while(strcmp(ch,'yes')==0);
            printf('Inorder Traversal : The elements in the tree are');
            inorder(root);
            printf('\n');
            printf('Enter the element to be searched\n');
            int e;
            scanf('%d', &e);
            int x = search(root, e);
            if(x){
              printf('%d found', e);
              }else{
                printf('%d not found', e);
              }
              printf('\n');
              return 0;
            }
            void insert(struct tnode ** s, int num) {
              if((*s) == NULL) 	{
                (*s) = (struct tnode *) malloc( sizeof (struct tnode));
                (*s)->data = num;
                (*s)->leftc = NULL;
                (*s)->rightc = NULL;
              }
              else 	{
                if(num < (*s)->data)
                insert(&( (*s)->leftc ), num);
                else
                insert(&( (*s)->rightc ), num);
              }
            }
            void inorder(struct tnode * s)  {
              if(s != NULL) 	{
                inorder(s->leftc);
                printf(' %d',s->data);
                inorder(s->rightc);
              }
            }
            int height(struct tnode* node) {
              if (node==NULL)
              return 0;
              else    {
                /* compute the height of each subtree */
                int lheight = height(node->leftc);
                int rheight = height(node->rightc);
                /* use the larger one */
                if (lheight > rheight)
                return(lheight+1);
                else return(rheight+1);
              }
            }
            ");
            Button3 = new Button(this);
            Button3.Text("< Previous ");
          }
          public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
            return false;
          }
        }