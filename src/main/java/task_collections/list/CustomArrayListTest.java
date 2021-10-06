package task_collections.list;

public class CustomArrayListTest {
    public static void main(String[] args) {
        CustomArrayList customArrayList = new CustomArrayList();
        for (int i = 0; i < 20; i++) {
            customArrayList.add(i);
        }
        System.out.println(customArrayList);
    }
}
