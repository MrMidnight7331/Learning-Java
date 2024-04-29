/**
 * @Project Weatherstation
 * @author Tieno
 * @date 22.04.24
 * @version 1.0
 */
public class Weatherstation
{
	private int[] temp;

	public Weatherstation()
	{
		temp = new int[]{3,4,1,0,10,12,4,5,8,2,1,3};
	}

	public void dump(){
		for (int i=0; i<temp.length; i++){
			System.out.println(temp[i]);
		}
	}

	public void average(){
		int tmp = 0;
		for (int i=0; i<temp.length; i++){
			tmp += temp[i];
		}
		System.out.println("Average temp is: " + tmp/temp.length);
	}

	public void max(){
		int tmp = temp[0];
		for(int i=0; i<temp.length; i++){
			if (tmp < temp[i]){
				tmp = temp[i];
			}
		}
		System.out.println("Max temp is: " + tmp);
	}

	public void min(){
		int tmp = temp[0];
		for(int i=0; i<temp.length; i++){
			if (tmp > temp[i]){
				tmp = temp[i];
			}
		}
		System.out.println("Min temp is: " + tmp);
	}

	public boolean search (int x){
		for(int i=0; i < temp.length; i++){
			if (x == temp[i]){
				return true;
			}
		}
		return false;
	}

	public void warning(){
		for(int i=0; i < temp.length; i++){
			if (temp[i] <= 3){
				System.out.println("Warning, temp lower than 3 deg at day: " + i);
			}
		}
	}
	public void min2(){
		int tmp = temp[0];
		int tmp2 = temp[0]; 
		for(int i=0; i<temp.length; i++){
			if (tmp > temp[i]){
				tmp2 = tmp;
				tmp = temp[i];
			} else if (tmp2 > temp[i]){
				tmp2 = temp[i];
			}
		}
		System.out.println("Min temp is: " + tmp);
		System.out.println("Second min temp is: " + tmp2);


	}

}