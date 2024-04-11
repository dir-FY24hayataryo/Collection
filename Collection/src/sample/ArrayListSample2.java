//ArrayListの自主練習用クラス
package sample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample2 {

    public static void main(String[] args) {
        //ラッパークラスでのリスト作成練習
        List<Integer>list2=new ArrayList<>();
        
        list2.add(1);
        list2.add(3);
        list2.add(4);
        list2.add(18);
        list2.add(8);
        
        System.out.println(list2);
        
        
        int n1=list2.get(2);
        int n2=list2.get(3);
        System.out.println(n1);
        System.out.println(n2);
        
        var result=n1+n2;
        System.out.println(result);
        
        int n3=list2.get(3);//[3]の数字をn3に代入
        int n4=list2.get(4);//[4]の数字をn4に代入
        var result2_1=n3+n4;
        System.out.println("変更前の4番目と５番目の数の合計は、"+result2_1);
        list2.set(3, 3);//[3]の数字を３に変更
        list2.set(4, 4);//[4]の数字を４に変更
        int n3_2=list2.get(3);//新しいn3
        int n4_2=list2.get(4);//新しいn4
        var result2_2=n3_2+n4_2;
        System.out.println("変更後の4番目と５番目の数の合計は、"+result2_2);
        
    }

}
