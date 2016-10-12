package 折半查找;

public class HalfSerach {

	public static void main(String[] args) {
		int[] data = { 1, 4, 5, 8, 15, 33, 48, 77, 96 };
		System.out.println(halfSerach(data, 48));
		System.out.println(RecurseHalfSerach(data, 0, data.length, 48));

	}

	private static int RecurseHalfSerach(int[] data, int begin, int end, int num) {
		if (data == null) {
			return -1;
		}
		if (begin <= end) {
			int middle = (begin + end) / 2;
			if (data[middle] == num) {
				return middle;
			} else if (data[middle] < num) {
				return RecurseHalfSerach(data, ++begin, end, num);
			} else {
				return RecurseHalfSerach(data, begin, --end, num);
			}
		} else
			return -1;
	}

	private static int halfSerach(int[] array, int num) {
		if (array == null) {
			return -1;
		}
		int begin = 0;
		int end = array.length - 1;
		while (begin <= end) {
			int middle = (begin + end) / 2;
			if (array[middle] == num) {
				return middle;
			} else if (array[middle] > num) {
				end = middle - 1;
			} else {
				begin = middle + 1;
			}
		}
		return -1;
	}

	//
}