public class Client {
    public static void main(String[] args) {
        DoubleLinkList<Integer> list=new DoubleLinkList<>();

        System.out.println("01:添加元素");
        list.addHead(1);
        list.addEnd(100);
        list.addHead(3);
        list.addEnd(200);
        System.out.println("添加元素后双链表中的元素为："+list.outListT());
        System.out.println();

        System.out.println("02:插入元素到指定位置");
        list.addIndex(567,1);
        list.addIndex(211, list.size());
        list.addIndex(985,0);
        System.out.println("插入元素到指定位置后双链表中的元素为："+list.outListT());
        System.out.println();

        System.out.println("03:删除指定元素");
        list.delete(2);
        System.out.println("删除指定位置元素后双链表中的元素为："+list.outListT());
        list.deleteX(100);
        System.out.println("删除指定大小元素后双链表中的元素为："+list.outListT());
        System.out.println();

        System.out.println("04:修改某元素");
        list.setDataIndex(1000,4);
        System.out.println("修改某位置元素后双链表中的元素为："+list.outListT());
        list.setDataE(99,1);
        System.out.println("修改某大小元素后双链表中的元素为："+list.outListT());
        System.out.println();

        System.out.println("05:移动某元素");
        list.swap(1,3);
        list.swap(0,4);
        System.out.println("移动某元素后双链表中的元素为："+list.outListT());
        System.out.println();

        System.out.println("06:查询指定元素");
        System.out.println("查询坐标为3的元素："+list.getData(3));
        System.out.println("查询坐标为1的元素："+list.getData(1));
        System.out.println();

        System.out.println("07:判断是否存在某元素 ");
        System.out.println("查询指定元素"+40+":"+list.isData(40));
        System.out.println("查询指定元素"+985+":"+list.isData(985));
        System.out.println();

        System.out.println("08:判断链表是否为空 ");
        System.out.println("链表是否为空："+list.isEmpty());
        System.out.println();

        System.out.println("09:判断链表长度 ");
        System.out.println("链表长度为："+list.size());
        System.out.println();

        System.out.println("10:双向遍历链表 ");
        System.out.println("正向遍历链表：："+list.outListT());
        System.out.println("逆向遍历链表：："+list.outListF());
        System.out.println();
    }
}