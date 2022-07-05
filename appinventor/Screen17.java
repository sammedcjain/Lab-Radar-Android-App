package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
class Screen17 extends Form implements HandlesEventDispatching {
  private Label Label3;
  private Button Button1;
  private Label Label1;
  private Label Label2;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("Screen17");
    Label3 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< Main menu");
    Label1 = new Label(this);
    Label1.FontBold(true);
    Label1.FontSize(16);
    Label1.Text("14 . Implement a program to construct a Binary Search Tree and also display the elements in the tree using Inorder , Preorder and Postorder traversals.");
    Label2 = new Label(this);
    Label2.Text(" #include <stdio.h>
    #include <stdlib.h>
    struct node {
      int data;
      struct node *leftChild;
      struct node *rightChild;
      };
      struct node *root = NULL;
      void insert(int data) {
        struct node *tempNode = (struct node*) malloc(sizeof(struct node));
        struct node *current;
        struct node *parent;
        tempNode->data = data;
        tempNode->leftChild = NULL;
        tempNode->rightChild = NULL;
        //if tree is empty
        if(root == NULL) {
          root = tempNode;
          } else {
            current = root;
            parent = NULL;
            while(1) {
              parent = current;
              //go to left of the tree
              if(data < parent->data) {
                current = current->leftChild;
                //insert to the left
                if(current == NULL) {
                  parent->leftChild = tempNode;
                  return;
                }
                }  //go to right of the tree
                else {
                  current = current->rightChild;
                  //insert to the right
                  if(current == NULL) {
                    parent->rightChild = tempNode;
                    return;
                  }
                }
              }
            }
          }
          struct node* search(int data) {
            struct node *current = root;
            printf('Visiting elements: ');
            while(current->data != data) {
              if(current != NULL)
              printf('%d ',current->data);
              //go to left tree
              if(current->data > data) {
                current = current->leftChild;
              }
              //else go to right tree
              else {
                current = current->rightChild;
              }
              //not found
              if(current == NULL) {
                return NULL;
              }
            }
            return current;
          }
          void pre_order_traversal(struct node* root) {
            if(root != NULL) {
              printf('%d ',root->data);
              pre_order_traversal(root->leftChild);
              pre_order_traversal(root->rightChild);
            }
          }
          void inorder_traversal(struct node* root) {
            if(root != NULL) {
              inorder_traversal(root->leftChild);
              printf('%d ',root->data);
              inorder_traversal(root->rightChild);
            }
          }
          void post_order_traversal(struct node* root) {
            if(root != NULL) {
              post_order_traversal(root->leftChild);
              post_order_traversal(root->rightChild);
              printf('%d ', root->data);
            }
          }
          int main() {
            char ch[10];
            while(ch[0] != 'n'){
              printf('Enter the element to be inserted in the tree\n');
              int n;
              scanf('%d', &n);
              insert(n);
              printf('Do you want to insert another element?\n');
              scanf('%s', ch);
            }
            printf('\nInorder Traversal : The elements in the tree are ');
            inorder_traversal(root);
            printf('\nPreorder Traversal : The elements in the tree are ');
            pre_order_traversal(root);
            printf('\nPostorder Traversal : The elements in the tree are ');
            post_order_traversal(root);
            return 0;
          }
          ");
          Button2 = new Button(this);
          Button2.Text("Next >");
          Button3 = new Button(this);
          Button3.Text("< Previous ");
        }
        public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
          return false;
        }
      }