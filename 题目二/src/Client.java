public class Client {
    public static void main(String[] args) {
        DoubleLinkList<Integer> list=new DoubleLinkList<>();

        System.out.println("01:���Ԫ��");
        list.addHead(1);
        list.addEnd(100);
        list.addHead(3);
        list.addEnd(200);
        System.out.println("���Ԫ�غ�˫�����е�Ԫ��Ϊ��"+list.outListT());
        System.out.println();

        System.out.println("02:����Ԫ�ص�ָ��λ��");
        list.addIndex(567,1);
        list.addIndex(211, list.size());
        list.addIndex(985,0);
        System.out.println("����Ԫ�ص�ָ��λ�ú�˫�����е�Ԫ��Ϊ��"+list.outListT());
        System.out.println();

        System.out.println("03:ɾ��ָ��Ԫ��");
        list.delete(2);
        System.out.println("ɾ��ָ��λ��Ԫ�غ�˫�����е�Ԫ��Ϊ��"+list.outListT());
        list.deleteX(100);
        System.out.println("ɾ��ָ����СԪ�غ�˫�����е�Ԫ��Ϊ��"+list.outListT());
        System.out.println();

        System.out.println("04:�޸�ĳԪ��");
        list.setDataIndex(1000,4);
        System.out.println("�޸�ĳλ��Ԫ�غ�˫�����е�Ԫ��Ϊ��"+list.outListT());
        list.setDataE(99,1);
        System.out.println("�޸�ĳ��СԪ�غ�˫�����е�Ԫ��Ϊ��"+list.outListT());
        System.out.println();

        System.out.println("05:�ƶ�ĳԪ��");
        list.swap(1,3);
        list.swap(0,4);
        System.out.println("�ƶ�ĳԪ�غ�˫�����е�Ԫ��Ϊ��"+list.outListT());
        System.out.println();

        System.out.println("06:��ѯָ��Ԫ��");
        System.out.println("��ѯ����Ϊ3��Ԫ�أ�"+list.getData(3));
        System.out.println("��ѯ����Ϊ1��Ԫ�أ�"+list.getData(1));
        System.out.println();

        System.out.println("07:�ж��Ƿ����ĳԪ�� ");
        System.out.println("��ѯָ��Ԫ��"+40+":"+list.isData(40));
        System.out.println("��ѯָ��Ԫ��"+985+":"+list.isData(985));
        System.out.println();

        System.out.println("08:�ж������Ƿ�Ϊ�� ");
        System.out.println("�����Ƿ�Ϊ�գ�"+list.isEmpty());
        System.out.println();

        System.out.println("09:�ж������� ");
        System.out.println("������Ϊ��"+list.size());
        System.out.println();

        System.out.println("10:˫��������� ");
        System.out.println("�������������"+list.outListT());
        System.out.println("�������������"+list.outListF());
        System.out.println();
    }
}