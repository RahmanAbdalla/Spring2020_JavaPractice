package JavaInterviewQuestions;


import com.sun.source.tree.BinaryTree;

import java.util.*;

public class HARD_JAVA_QA {

    //1- Program to check whether the linked list is a palindrome or not
    public static boolean palindromeLinkList(LinkedList<String> linkedList) {

        String s1Original = "";

        for (int i = 0; i < linkedList.size(); i++) {
            for (int k = 0; k < linkedList.get(i).length(); k++) {
                s1Original += linkedList.get(i).charAt(k);
            }
        }

        Collections.reverse(linkedList);
        String s2Reversed = "";
        for (int i = 0; i < linkedList.size(); i++) {
            for (int k = linkedList.get(i).length() - 1; k >= 0; k--) {
                s2Reversed += linkedList.get(i).charAt(k);
            }
        }
        return s1Original.equals(s2Reversed);

    }

    //2- - Sort linked list containing 0’s and 1’s.
    public static LinkedList<Integer> sortLinkList(LinkedList<Integer> linkedList) {
        if (linkedList.contains(0) && linkedList.contains(1)) {
            Collections.sort(linkedList);
        }
        return linkedList;
    }

    //3- Given a tree try to print a mirror image of the tree.
    public static LinkedHashSet<String> treeMirrorImg(TreeSet<String> treeSet) {

        Iterator<String> iterator = treeSet.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.println();
        }

        ArrayList<String> list = new ArrayList<>(treeSet);
        Collections.reverse(list);

        LinkedHashSet<String> reversedTree = new LinkedHashSet<>(list);
        return reversedTree;
    }

    //4- - Given a boolean 2D matrix, find the number of islands. A group of connected 1s forms an island.
    // For example, the below matrix contains 5 islands
    //Example:
    //Input : mat[][] = {{1, 1, 0, 0, 0},
    //                   {0, 1, 0, 0, 1},
    //                   {1, 0, 0, 1, 1},
    //                   {0, 0, 0, 0, 0},
    //                   {1, 0, 1, 0, 1}
    //Output : 5


    public static void main(String[] args) {


        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList("Hello", "Java", "World"));

        System.out.println(treeMirrorImg(treeSet));


        int mat[][] = { {1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 1},
                        {1, 0, 0, 1, 1},
                        {0, 0, 0, 0, 0},
                        {1, 0, 1, 0, 1}  }  ;

        System.out.println(mat.length);
    }
}
