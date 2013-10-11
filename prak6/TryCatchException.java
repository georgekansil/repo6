import java.io.*;

public class TryCatchException {
		static BufferedReader Input = new BufferedReader(new InputStreamReader (System.in));
		public static void main(String[] args) {
			try {
				System.out.println("choose one of the options, (1-3) " + "\n\t1.) Steak" + "\n\t2.) Lobster" + "\n\t3.) Cheeseburger");
				System.out.println("masukan pilihan anda : ");
				String choose = Input.readLine();
				if(choose.equals("1")){
					System.out.println("ANDA MEMILIH STEAK :-)");
				} else if(choose.equals("2")){
					System.out.println("ANDA MEMILIH LOBSTER :-D");
				} else if (choose.equals("3")){
					System.out.println("ANDA MEMILIH CHEESEBURGER ;-)");
				} else {
						throw new Exception("pilihan anda tidak ada gitu loh !");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}