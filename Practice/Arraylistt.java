package collections;
import java.util.ArrayList;
public class Arraylistt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> words=new ArrayList<String>();
		words.add("pavan");
		words.add("kalyan");
		words.add("prem");
		words.add("nath");
		//add the element at the specific index
		words.add(2,"hima");
		System.out.println(words);
	}
}
/* [pavan, kalyan, hima, prem, nath]*/
