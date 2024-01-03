package struktury_A.Z5;

/*
Implementacja drzewa BST liczb całkowitych (dst – jedna funkcjonalność, db – dwie funkcjonalności, bdb – trzy
funkcjonalności) 
 */

//Klasa definujaca drzewo poszukiwan binarnych

import java.util.ArrayList;


public class BSTree
{
    private TreeNode root;    // pierwszy węzeł drzewa

    public BSTree()   // konstruktor
    {
        root = null;
    }

    public TreeNode getRoot()
    {
        return root;
    }

    public void insert(int elem)
    {
        TreeNode newNode = new TreeNode();    // tworzymy nowy węzeł
        newNode.iData = elem;        // zapisujemy w nim dane

        if (root == null)
            root = newNode; //Jesli drzewo jest puste
        else //Drzewo ma jednak korzen
        {
            TreeNode current = root;       // zaczynamy poszukiwania od korzenia
            while (true)                // (zakończenie pętli wewnątrz za pomoca return)
            {
                TreeNode parent = current;
                if (elem < current.iData)  // czy idziemy w lewo?
                {
                    current = current.left;
                    if (current == null)  // jeśli nie ma lewego,
                    {
                        parent.left = newNode; // wstawiamy po lewej stronie
                        newNode.parent = parent;
                        return;
                    }
                }
                else   // idziemy na prawo
                {
                    current = current.right;
                    if (current == null)  //jesli nie ma prawego
                    {
                        parent.right = newNode; // wstawiamy po prawej stronie
                        newNode.parent = parent;
                        return;
                    }
                }
            }
        }
    }

    public boolean find(int elem)     //sprawdzenie czy w drzewie jest element: elem
    {
        if (root==null) return false;       //puste drzewo

        TreeNode current = root;               // zaczynamy od korzenia drzewa
        while (current.iData != elem)        // dopóki nie odnaleziono,
        {
            if (elem < current.iData)         // czy przechodzimy na lewo?
                current = current.left;
            else                            // na prawo
                current = current.right;
            if (current == null)             // jeśli brak potomka,
                return false;                 // nie odnaleziono elementu
        }
        return true; // odnaleziono element
    }

    private TreeNode getSuccessor(TreeNode node) //Wyliczenie nastepnika wezla
    {
        TreeNode current = node.right;
        while (current.left != null) //Idziemy w lewy dolny lisc podrzewa
        {
            current = current.left;
        }
        return current;
    }

    private void deleteWithoutChilds(TreeNode current) //Usuniecie wezla bez potomkow
    {
        if (current == root)             // jeśli to korzeń,
        {
            root = null;                 // opróżniamy drzewo
        }
        else
        {
            if (current.parent.left == current) //usuwany byl lewym synem ojca
            {
                current.parent.left = null;    // odłączamy usuwany węzeł
            }
            else //byl prawym synem ojca
            {
                current.parent.right = null;  // odłączamy usuwany węzeł
            }
            current.parent = null; /////////////////////////////////////////////
        }
    }

    private void deleteWithOneLeftChild(TreeNode current) //Usuniecie wezla z jednym lewym potomkiem
    {
        if (current == root)
        {
            root = current.left;
        }
        else
        {
            if (current.parent.left == current) //usuwany byl lewym synem ojca
            {
                current.parent.left = current.left;
            }
            else //byl prawym synem ojca
            {
                current.parent.right = current.left;
            }
            current.left.parent = current.parent;  //////////////////////////////////
        }
    }

    private void deleteWithOneRightChild(TreeNode current) //Usuniecie wezla z jednym prawym potomkiem
    {
        if (current == root)
        {
            root = current.right;
        }
        else
        {
            if (current.parent.left == current) //usuwany byl lewym synem ojca
            {
                current.parent.left = current.right;
            }
            else //byl prawym synem ojca
            {
                current.parent.right = current.right;
            }
            current.right.parent = current.parent;  //////////////////////////////////////
        }
    }

    private void deleteWithTwoChilds(TreeNode current) //Usuniecie wezla z dwoma potomkami
    {
        TreeNode successor = getSuccessor(current); //Wyszukanie nastepnika usuwanego wezla

        if (successor.left==null && successor.right==null) //nastepnik nie ma potomkow
            deleteWithoutChilds(successor);
        else //nastepnik ma jednego prawego potomka
            deleteWithOneRightChild(successor);

        TreeNode parentCurr = current.parent; //jesli current==root, to jego rodzicem jest null

        //Wymiana usuwanego wezla na jego nastepnik

        if(current!=root)////////////////////////////////////
        {////parentCurr dla roota jest null, wiec nie da sie uzyskac left/right dla nulla
            if (parentCurr.left==current)
                parentCurr.left = successor;
            else //(parentCurr.right==current)
                parentCurr.right = successor;
        }////

        successor.left = current.left;
        successor.right = current.right;

        successor.parent = parentCurr; //////////////////////////////////////////////////////
        if(successor.left != null) ///////////////////////////////////////////////////////
            successor.left.parent = successor; //////////////////////////////////////////
        if(successor.right != null) //////////////////////////////////////////////////////
            successor.right.parent = successor; //////////////////////////////////////////

        if(current==root)/////////////////po usunieciu roota succesor jest nowym rootem
            root = successor;
    }

    public boolean delete(int elem) // usunięcie węzła o podanej wartości elementu
    {
        if (root == null) return false;       //puste drzewo

        TreeNode current = root;

        while (current.iData != elem)        // szukamy węzła
        {
            if (elem < current.iData)         // czy przechodzimy w lewo?
                current = current.left;
            else                            // jednak na prawo
                current = current.right;

            if (current == null)             // koniec szukania i ...
                return false;                // ... nie znaleziono węzła
        }

        // znaleziono węzeł do usunięcia
        if (current.left == null && current.right == null) // usuniecie w przypadku braku potomkow
        {
            deleteWithoutChilds(current);
        }
        else
        if (current.right == null) //jeśli brak prawego potomka, zastępujemy węzeł lewym poddrzewem
        {
            deleteWithOneLeftChild(current);
        }
        else
        if (current.left == null) // jeśli brak lewego potomka, zastępujemy węzeł prawym poddrzewem
        {
            deleteWithOneRightChild(current);
        }
        else  // węzeł ma dwa potomki, zastępujemy go zatem jego następnikiem
        {
            deleteWithTwoChilds(current);
        }

        return true;
    }

    public void view(TreeNode node,int level) //wizualizacja tekstowa drzewa
    {
        if (node==null) return;
        for (int i=0; i<level; i++) System.out.print("- ");
        System.out.println(node.iData);
        view(node.left,level+1);
        view(node.right,level+1);
    }

    //Kopiowanie BST do tablicy dynamicznej
    private void copyBSTreeToArrayList(TreeNode node,ArrayList<TreeNode> nodeList)
    {
        if (node.left!=null) copyBSTreeToArrayList(node.left,nodeList);
        nodeList.add(node);
        if (node.right!=null) copyBSTreeToArrayList(node.right,nodeList);
    }

    public BSTreeIterator iterator() //Pobranie iteratora drzewa
    {
        ArrayList<TreeNode> nodeList = new ArrayList<TreeNode>();
        if (root!=null)
        {
            copyBSTreeToArrayList(root,nodeList);
        }
        return new BSTreeIterator(nodeList);
    }


    public void print() //Przegladanie drzewa wraz z wypisywaniem elementow
    {
        System.out.print("BST:");
        BSTreeIterator iterator = this.iterator();

        while (iterator.hasNext())      // Dopóki nie koniec elementow
        {
            TreeNode node = iterator.next();
            System.out.print(node.toString()); // ...wypisujemy dane i...
            System.out.print(" ");
        }
        System.out.println();
    }


    public static void main(String[] args) //test drzewa BST
    {
        BSTree tree = new BSTree();

        //Wstawianie elementow
        tree.insert(50);
        tree.insert(25);
        tree.insert(75);
        tree.insert(12);
        tree.insert(37);
        tree.insert(43);
        tree.insert(30);
        tree.insert(33);
        tree.insert(87);
        tree.insert(63);
        tree.insert(97);

        tree.view(tree.getRoot(),0);

        System.out.println("\n\t<< del(50) >>");
        tree.delete(50);
        tree.view(tree.getRoot(),0);

        tree.print();

        boolean result1 = tree.find(33);
        System.out.println("Wynik wyszukania 33:"+result1);

        boolean result2 = tree.find(40);
        System.out.println("Wynik wyszukania 40:"+result2);

        System.out.println("\n\t<< del(37) >>");
        tree.delete(37);
        tree.view(tree.getRoot(),0);
        System.out.println("\n");

        System.out.println("\n\t<< del(43) >>");
        tree.delete(43);
        tree.view(tree.getRoot(),0);
        System.out.println("\n");

        System.out.println("\n\t<< del(25) >>");
        tree.delete(25);
        tree.view(tree.getRoot(),0);
        System.out.println("\n");

        tree.print();
    }
}
