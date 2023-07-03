package HashTables;


import java.util.Hashtable;

//  RUN TIME COMPLEXITY
//  BEST CASE 0(1)
//  Worst CASE 0(n)
public class HashTables {
    public static void main(String[] args) {
        Hashtable<String,String> hashtable= new Hashtable<>(10);
        hashtable.put("100","GOKU");
        hashtable.put("123","NARUTO");
        hashtable.put("321","ICHIGO");
        hashtable.put("555","GON");
        hashtable.put("777","ASTA");

        for (String KEY: hashtable.keySet()){
            System.out.println(KEY.hashCode()%10 +"\t"+KEY+"\t"+hashtable.get(KEY));
        }
    }
}
