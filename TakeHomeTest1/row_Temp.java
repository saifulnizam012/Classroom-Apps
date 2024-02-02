package TakeHomeTest;

import java.util.ArrayList;
public class row_Temp {
	private static ArrayList<String> script = new ArrayList<String>();
	private static int numberSelected;
	
	public void setscript(String script_1) {
		script.add(script_1);
	}
	
	public static String getscript(int l) {
		return script.get(l);
	}
	
	public static int getscriptsize() {
		return script.size();
	}
	
	public static void clearScript() {
		script.clear();
	}
	
	public static void setnumberSelected(int numberSelected_1) {
		numberSelected = numberSelected_1;
	}
	
	public static int getnumberSelected() {
		return numberSelected;
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}