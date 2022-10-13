public class LinkNode<E> {
    private E data;
    public LinkNode<E> prev;
    public LinkNode<E> next;

    public LinkNode(){
        data=null;
        prev=next=null;
    }

    public LinkNode(E _data){
        this.data=_data;
        prev=next=null;
    }

    public E getData(){
        return (E)data;
    }
    public void setData(E _data){
        this.data=_data;
    }
}
