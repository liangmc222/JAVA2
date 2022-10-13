public class DoubleLinkList<E> {
    private int size;
    private LinkNode<E> first;
    private LinkNode<E> end;

    public DoubleLinkList(){
        this.size=0;
        first=end=null;
    }

    public boolean isEmpty(){                   //08�ж������Ƿ�Ϊ��
        return size==0;
    }

    public int size(){                          //09�ж�������
        return this.size;
    }

    public LinkNode<E> getNode(int index){
        if(index<0){
            throw new IllegalArgumentException("false ��ѯ:λ��indexС��0");
        }
        if(index>=size){
            throw new IllegalArgumentException("false ��ѯ:λ��index����˳�����Ԫ��");
        }
        LinkNode<E> node=first;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public E getData(int index){
        return getNode(index).getData();
    }



    public void addHead(E _data){               //ͷ��
        LinkNode<E> node=new LinkNode<>(_data);
        if(isEmpty()){
            first=node;
            end=node;
        }
        else{
            node.next=first;
            first.prev=node;
            first=node;
        }
        size++;
    }

    public void addEnd(E _data){                //β��
        if(isEmpty()){
            addHead(_data);
        }
        else {
            LinkNode<E> node = new LinkNode<>(_data);
            end.next = node;
            node.prev = end;
            end = node;
            size++;
        }
    }

    public void addIndex(E _data,int index){         //02����Ԫ�ص�ָ��λ��
        if(index<0){
            throw new IllegalArgumentException("false ����:λ��indexС��0");
        }
        if(index>size){
            throw new IllegalArgumentException("false ����:λ��index����˳�����Ԫ��");
        }
        if(index==0){
            addHead(_data);
            return;
        }
        if(index==size){
            addEnd(_data);
            return;
        }
        LinkNode<E> node=new LinkNode<>(_data);
        for (int i=0;i<index-1;i++){
            first=first.next;
        }
        node.next=first.next;
        node.prev=first;
        first.next=node;
        node.next.prev=node;
        size++;
    }

    public void deleteHead(){
        if(isEmpty()){
            throw new IllegalArgumentException("false ɾ��:����Ϊ��");
        }
        LinkNode<E> node=first.next;
        node.prev=null;
        first=node;
        size--;
    }

    public void deleteEnd(){
        if(isEmpty()){
            throw new IllegalArgumentException("false ɾ��:����Ϊ��");
        }
        LinkNode<E> node=end.prev;
        node.next=null;
        end=node;
        size--;
    }

    public void delete(int index){              //06ɾ��ָ��Ԫ��
        if(size==0){
            throw new IllegalArgumentException("false ɾ��:����Ϊ��");
        }
        if(index<0){
            throw new IllegalArgumentException("false ɾ��:index<0");
        }
        if(index>=size){
            System.out.println("index>size,��λ�ô��������ȣ��޷�ɾ����");
            throw new IllegalArgumentException("false ɾ��:λ��index����˳�����Ԫ��");
        }
        if(index==0){
            deleteHead();
            return;
        }
        LinkNode<E> node=first;
        for(int i=0;i<index-1;i++){
            node=node.next;
        }
        LinkNode<E> test=node.next;
        if(test==end){
            deleteEnd();
            return;
        }
        node.next=test.next;
        test.next.prev=node;
        test.next=null;
        size--;
    }

    public void deleteX(E _data){
        int i=0;
        while(i<this.size){
           if(getData(i)==_data){
               delete(i);
            }
           else{
                i++;
           }
        }
    }

    public void setDataE(E _data,E delete){
        int i=0;
        LinkNode<E> node;
        while(i<this.size){
            node=getNode(i);
            if(node.getData()==delete){
                node.setData(_data);
            }
            else{
                i++;
            }
        }
    }

    public void setDataIndex(E _data,int index){
        LinkNode<E> node=getNode(index);
        node.setData(_data);
    }

    public void swap(int indexa,int indexb){
        E data=getData(indexa);
        getNode(indexa).setData(getData(indexb));
        getNode(indexb).setData(data);

    }

    public boolean isData(E _data){
        LinkNode<E> node=first;
        String str="";
        while(node!=null){
            str=node.getData()+"";
            if(str.equals(_data+"")){
                return true;
            }
            node=node.next;
        }
        return false;
    }

    public String outListT(){
        if(isEmpty()){
            return "����Ϊ�ա�";
        }
        LinkNode<E> node=first;
        StringBuilder str= new StringBuilder();
        for (int i=0;i<size;i++){
            str.append(node.getData());
            str.append(" ");
            node=node.next;
        }
        return str.toString();
    }

    public String outListF(){
        if(isEmpty()){
            return "����Ϊ�ա�";
        }
        LinkNode<E> node=end;
        StringBuilder str= new StringBuilder();
        for (int i=0;i<size;i++){
            str.append(node.getData());
            str.append(" ");
            node=node.prev;
        }
        return str.toString();
    }
}
