package day2;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {3, 4, 2, 1, 5};
		int temp, min;
		
		for(int i = 0; i < arr.length - 1; i++) {
			min = i; 	// ���� ���� ��
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[min] > arr[j]) {		// ������ ���� ���� ���� ���� ���ϴ� �ڵ�
					min = j;
				}
			}
			temp = arr[i];		// ������ ��ġ�� ����
			arr[i] = arr[min];	// �ּҰ���
			arr[min] = temp;	// ��ȯ�ϴ� �ڵ�
		}
		System.out.print("�����: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
