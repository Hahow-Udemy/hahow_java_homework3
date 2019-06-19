import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Box3 box3 = new Box3(23f, 14f, 13);
        Box5 box5 = new Box5(39.5f, 27.5f, 23);

        List list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter object`s length");
        Float length = sc.nextFloat();
        list.add(length);
        System.out.println("Please enter object`s width");
        Float width = sc.nextFloat();
        list.add(width);
        System.out.println("Please enter object`s height");
        int height = sc.nextInt();
        list.add(height);
        System.out.println(list);
        boolean boolean3 = box3.validate((float)list.get(0), (float)list.get(1), (int)list.get(2));
        boolean boolean5 = box5.validate((float)list.get(0), (float)list.get(1), (int)list.get(2));

        if (boolean3 && !boolean5)
            System.out.println("you can use box3");
        else if (!boolean3 && boolean5)
            System.out.println("you can use box5");
        else if (boolean3 && boolean5)
            System.out.println("you can use box3 or box5 ");
        else
            System.out.println("your object is too big , we can`t help you");
    }
}
