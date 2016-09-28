/**
 * Created by hsenid on 9/28/16.
 */
public class Tag_Branch {

    public static void main(String[] args) {
        int k = 10;
        for (int u = 1; u <= k; u++) {
            for (int v = 1; v <= k; v++) {
                if (u == 1 || u == k || v == 1 || v == k || u == v || u == (k - v)) {
                    System.out.print("#");
                } else
                    System.out.print(" ");

            }
            System.out.println();
<<<<<<< HEAD
            System.out.println("After_Add_Tag_To_master");
=======
            System.out.println("----------");
            System.out.println("After_tag");
>>>>>>> NewTestBranch
        }
    }
}
