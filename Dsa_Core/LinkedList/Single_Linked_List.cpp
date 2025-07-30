#include <iostream>
#include "vector"
using namespace std;

class Node {
public:
    int data;
    Node *next;

    Node(int val){
        this->data = val;
        this->next = NULL;
    };

    ~Node(){};
};

class LinkedList{
private:
    Node*head;
    Node*tail;

public:
    LinkedList() {
        this->head = this->tail = NULL;
    }

    ~LinkedList() {
        Node *temp = this->head;
        this->head = this->tail = NULL;
        while(temp != NULL){
            Node * prev = temp;
            temp = temp->next;
            delete prev;
        }
        cout << "Linked List deleted" << "\n";
    };

    void push_front(int val){
        Node *newNode = new Node(val);
        if (this->head == NULL){
            this->head = this->tail = newNode;
        } else {
            newNode->next = head;
            this->head = newNode;
        }
        return;
    };

    void push_back(int val){
        Node *newNode = new Node(val);
        if (this->tail == NULL){
            this->head = this->tail = newNode;
        } else {
            this->tail->next = newNode;
            this->tail = newNode;
        }
        return;

    };

    void insert_at(int data, int index){
        int length = this->length();
        if (index >= 0 && index < length){
            if(index == 0){
                this->push_front(data);                
            } else {
                Node *newNode = new Node(data);
                Node *temp = this->head;
                int i = 0;
                while (temp != NULL){
                    if(i == index - 1){
                        newNode->next = temp->next;
                        temp->next = newNode;
                        break;
                    }
                    i++;
                    temp = temp->next;
                }
                delete temp;
            }
        } else {
            cout << "index out of range";
        }
    }

    void delete_at(int index){
        int length = this->length();
        if (index >= 0 && index < length){
            Node *temp = this->head;
            int i = 0;
            while(temp != NULL){
                if(i == index - 1){
                    Node *next = temp->next;
                    temp->next = next->next;
                    next->next = nullptr;
                    delete next;
                    break;
                }
                i++;
                temp=temp->next;
            }
            delete temp;
        }
    }

    int length(){
        Node *temp = head;
        int i = 0;
        while(temp != NULL){
            i++;
            temp = temp->next;
        };
        return i;
    }

    void reverse(){
        Node *cur = this->head;
        Node *prev = NULL;
        
        while(cur != NULL){
            Node *next = cur->next;
            cur->next = prev;
            prev = cur;
            this->head = cur;
            cur = next;
        }
    }


    bool compare(LinkedList llist){
        Node* temp1 = this->head;
        Node* temp2 = llist.head;
        while(temp1 != NULL || temp2 != NULL){
            
            if(temp1 == NULL || temp2 == NULL){
                return false;
            }
            
            if(temp1->data != temp2->data){
                return false;
            }
                        
            temp1 = temp1->next;
            temp2 = temp2->next;
        }
        return true;
    }

    bool is_sorted(){
        Node *temp = this->head;
        while(temp != NULL){
            if(temp->data > temp->next->data){
                return false;
            }
            temp = temp->next;
        }
        return true;
    }

    void mergeLists(LinkedList llist){
        Node dummy(0);
        


    }

    void print_reverse(){
        vector<int> reverse;
        Node *temp = this->head;
        while(temp != NULL) {
            reverse.push_back(temp->data);
            temp = temp->next;
        }
        for (int i = reverse.size() - 1; i >= 0 ; i-- ){
            cout << reverse[i] << "\n";
            reverse.pop_back();
        }
        delete temp;
    }


    void print(){
        Node *temp = this->head;
        while(temp != NULL) {
            cout << temp->data << "\n";
            temp = temp->next;
        }
    };


};

int main() {

    // LinkedList ll;

    // int n; cin >> n;
    // for(int i = 0; i < n ;i++){
    //     int x;
    //     cin >> x;
    //     ll.push_back(x);
    // }

    // cout << ll.length();
    // ll.print();


    // ll.push_back(1);
    // ll.push_back(2);
    // ll.push_back(3);
    // ll.print();

    // cout << "\n\n";
    // ll.insert_at(4,2);
    // ll.print();
    // cout << "\n\n";

    // ll.delete_at(2);
    // ll.print();

    // ll.print_reverse();
    // ll.reverse();
    // ll.print();


    LinkedList ll1;
    ll1.push_back(1);
    ll1.push_back(3);
    ll1.push_back(7);

    LinkedList ll2;
    ll2.push_back(1);
    ll2.push_back(2);

    LinkedList rs = ll1.mergeLists(ll1, ll2);
    rs.print();



    cout << "\n";
    return 0;
}