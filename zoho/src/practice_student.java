public class practice_student {

    public static void main(String[] args) {
        mark obj1 = new mark("BALA",100,100,100,100);
        mark obj2 = new mark("MAHA",100,99,98,97);
        mark obj3 = new mark("NISHAR",99,89,97,99);
    }

}
class mark{
    String name;
    int sub1,sub2,sub3,sub4;
    public mark(String name,int sub1,int sub2,int sub3,int sub4){
        this.name =name;
        this.sub1=sub1 ;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
        System.out.println(name+ " "+sub1+" "+sub2+" "+sub3+" "+sub4);
    }
}
