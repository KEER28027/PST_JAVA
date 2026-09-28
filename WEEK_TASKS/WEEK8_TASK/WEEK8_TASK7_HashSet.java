import java.util.*;

public class WEEK8_TASK7_HashSet {
    static final class Pair {
        final String first, second;
        Pair(String first,String second){this.first=first;this.second=second;}
        public boolean equals(Object other){if(this==other)return true;if(!(other instanceof Pair))return false;Pair p=(Pair)other;return first.equals(p.first)&&second.equals(p.second);}
        public int hashCode(){return Objects.hash(first,second);}
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); int n=in.nextInt();
        Set<Pair> pairs=new HashSet<>(); StringBuilder out=new StringBuilder();
        for(int i=0;i<n;i++){pairs.add(new Pair(in.next(),in.next()));out.append(pairs.size()).append('\n');}
        System.out.print(out);in.close();
    }
}
