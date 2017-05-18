package snakecamel;
import java.util.Scanner;
public class Main {
	public void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String hako[] = new String[10];
		SnakeCamelUtil scutil = new SnakeCamelUtil();
		for(int i= 0; i<hako.length; i++){
			if(hako[0]=="[a-z]"){
				scutil.capitalize(str);
			}else if(hako[0]=="[A-Z]"){
				scutil.uncapitalize(str);
			}else if(hako[i]=="_"){
				scutil.snakeToCamelcase(str);
			}else if(hako[i] == "^[A-Z]+$"){
				scutil.camelToSnakecase(str);
			}
		}
		System.out.println(str);
	}
}
