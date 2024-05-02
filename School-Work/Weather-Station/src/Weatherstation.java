import javax.swing.text.html.HTML.Tag;

/**
 * @Project Weatherstation
 * @author Tieno
 * @date 22.04.24
 * @version 1.5
 */
public class Weatherstation {
	private int[] temp;
	private int[] temp2;
	private Day [] january;

	public Weatherstation() {
		temp = new int[]{3, 4, 1, 0, 10, 12, 4, 5, 8, 2, 1, 3};
		temp2 = new int[69];
		january=new Day[31];

		for (int i = 0; i < temp2.length; i++) {
			temp2[i] = -1337;
		}
	}

	public void dump() {
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}

	public void average() {
		int tmp = 0;
		for (int i = 0; i < temp.length; i++) {
			tmp += temp[i];
		}
		System.out.println("Average temp is: " + tmp / temp.length);
	}

	public void max() {
		int tmp = temp[0];
		for (int i = 0; i < temp.length; i++) {
			if (tmp < temp[i]) {
				tmp = temp[i];
			}
		}
		System.out.println("Max temp is: " + tmp);
	}

	public void min() {
		int tmp = temp[0];
		for (int i = 0; i < temp.length; i++) {
			if (tmp > temp[i]) {
				tmp = temp[i];
			}
		}
		System.out.println("Min temp is: " + tmp);
	}

	public boolean search(int x) {
		for (int i = 0; i < temp.length; i++) {
			if (x == temp[i]) {
				return true;
			}
		}
		return false;
	}

	public void warning() {
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] <= 3) {
				System.out.println("Warning, temp lower than 3 deg at day: " + i);
			}
		}
	}

	public void min2() {
		int tmp = temp[0];
		int tmp2 = temp[0];
		for (int i = 0; i < temp.length; i++) {
			if (tmp > temp[i]) {
				tmp2 = tmp;
				tmp = temp[i];
			} else if (tmp2 > temp[i]) {
				tmp2 = temp[i];
			}
		}
		System.out.println("Min temp is: " + tmp);
		System.out.println("Second min temp is: " + tmp2);
	}

	public void addTemp(int ptemp2) {
		boolean isFull = true;
		for (int i = 0; i < temp2.length; i++) {
			if (temp2[i] == -1337) {
				temp2[i] = ptemp2;
				System.out.println(temp2[i]);
				isFull = false;
				break;
			}
		}
		if (isFull) {
			try {
				throw new ArrayIndexOutOfBoundsException("Array is full");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}

	public void insert_day(Day t){
		boolean isFull = true;
		for (int i = 0; i < january.length; i++) {
			if (january[i] == null) {
				january[i] = t;
				System.out.println(january[i]);
				isFull = false;
				break;
			}
		}
		if (isFull) {
			try {
				throw new ArrayIndexOutOfBoundsException("Array is full");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
        
	}
	
	public void output(){
		for (int i = 0; i < january.length; i++) {
			if (january[i] != null) {
				System.out.println(january[i]);
			}
		}
	}
	
	public void average_day(){
		
	}
	
	public void get_min_day(){
        System.out.println(january[0].getMinTemp());
    }
   
    public void max_day(){
		System.out.println(january[0].getMaxTemp());
      
    }
    
    public int search_day (int x){
        return -1;
    }
    
    public void weather_warning(){
        
    }
}
