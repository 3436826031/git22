package zuoye;

public class Continue {


public static void main(String[] args) {

   int i, count = 0;

for (i = 100; i <= 300; i++) {
	
if (i % 3 != 0 && i % 7 != 0) {
   System.out.print(i + " ");
   count++;
   
if (count % 10 == 0) {
System.out.println();

}

}

   continue;

}
}

}