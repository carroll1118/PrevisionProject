package 算法.linkedList;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1,"宋江","及时雨");
        HeroNode hero2 = new HeroNode(2,"卢俊义","玉骑铃");
        HeroNode hero3 = new HeroNode(3,"吴用","智多星");
        HeroNode hero4 = new HeroNode(4,"林冲","豹子头");

        //创建链表
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(hero1);
        singleLinkedList.add(hero2);
        singleLinkedList.add(hero3);
        singleLinkedList.add(hero4);

        singleLinkedList.list();
    }
}
//定义SingleLinkedList   管理我们的英雄
class SingleLinkedList{
    private HeroNode head = new HeroNode(0,"","");

    //添加节点的方法
    public void add(HeroNode heroNode){
        HeroNode temp = head;
        while (true){
            //找到链表的最后
            if (temp.next == null){
                break;
            }
            temp = temp.next;
        }
        //当退出while循环时，temp就指向新的节点
        temp.next = heroNode;

    }


    //显示链表
    public void list(){
        //判断列表是否为空
        if (head.next == null){
            System.out.println("为空");
            return;
        }
        HeroNode temp =  head.next;
        while (true){
            if (temp == null){
                break;
            }
            System.out.println(temp);
            //将next后移（重要）
            temp = temp.next;

        }
    }

    //获取链表节点的个数
    public static int getLength(HeroNode head){
        if (head.next == null){
            return 0;
        }
        int length = 0;
        HeroNode cur = head.next;
        while(cur != null){
            length++;
            cur = cur.next;
        }
        return length;
    }

}

//定义HeroNode，每个对象就是一个节点
class HeroNode{
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;  //指向下一个节点
    //构造器
    public HeroNode(int hNo,String hName,String hNickname){
        this.no = hNo;
        this.name = hName;
        this.nickname = hNickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
