package day1;

public class Main {	// ���� ���� ����
	public static void main(String[] args) {
		int[] arr = {6, 5, 4, 32, 1, 78, 9};	// �迭 ���� �� �� ����
		int i, j, temp;
		
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];		// temp�� j ����
					arr[j] = arr[j+1];	// j�� j+1 ����
					arr[j+1] = temp;	// j+1�� temp ����
				}
			}
		}
		System.out.print("�����: ");
		for(i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");		// �迭 arr ���
		}
	}
}
