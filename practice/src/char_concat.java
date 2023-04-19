public class char_concat {
    public static void main(String[] args) {

        char[] ch={'b','a','l','a'};
        char[] ch1={'m','u','r','u','g','a','n'};
        String chs = new String(ch);
        String ch2 = new String(ch1);
        //System.out.println(chs.concat(ch2));
        int n=ch.length;
        int m=ch1.length;
        //System.out.println(chs);
        char[] res=new char[n+m];
        for(int i=0;i<n;i++){
            res[i]=ch[i];
        }
        for(int i=n,j=0;i<n+m;i++,j++) {
            res[i] = ch1[j];
        }
        for(int i=0;i<n+m;i++){
            System.out.print(res[i]);
        }

    }
}
