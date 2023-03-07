package Collection;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class collectionMap {
	private static Map<String, String> tuDien = new TreeMap<String, String>();

	public String insertTu(String tuKhoa, String yNghia) {
		return this.tuDien.put(tuKhoa, yNghia);
	}

	public String deleteTu(String tuKhoa) {
		return this.tuDien.remove(tuKhoa);
	}

	public String hienThiTu(String tuKhoa) {
		String yNghia = this.tuDien.get(tuKhoa);
		return yNghia;
	}

	public void inTuKhoa() {
		Set<String> setTuKhoa = this.tuDien.keySet();
		System.out.println(Arrays.toString(setTuKhoa.toArray()));
	}

	public int soLuong() {
		return this.tuDien.size();
	}

	public void deleteAll() {
		this.tuDien.clear();
	}

	public static void main(String[] args) {
		collectionMap collectionMap = new collectionMap();
		Scanner input = new Scanner(System.in);
		int choose;
		System.out.println("Nhap lua chon:");
		do {
			System.out.println("MENU");
			System.out.println("1. Them tu khoa");
			System.out.println("2. Xoa tu khoa");
			System.out.println("3. Xem tu khoa");
			System.out.println("4. Xem all tu khoa");
			System.out.println("5. Xem so luong tu khoa:");
			System.out.println("6. Xoa all tu khoa");
			choose = input.nextInt();
			input.nextLine();
			if (choose == 1) {
				System.out.println("Nhap tu khoa:");
				String tuKhoa = input.nextLine();
				System.out.println("Nhap y nghia;");
				String yNghia = input.nextLine();
				collectionMap.insertTu(tuKhoa, yNghia);
			} else if (choose == 2 || choose == 3) {
				System.out.println("Nhap tu khoa:");
				String tuKhoa = input.nextLine();
				if (choose == 2) {
					collectionMap.deleteTu(tuKhoa);
				} else {
					System.out.println("Y nghia la:" + collectionMap.hienThiTu(tuKhoa));
				}
			} else if (choose == 4) {
				collectionMap.inTuKhoa();

			} else if (choose == 5) {
				System.out.println("So luong tu khoa la:" + collectionMap.soLuong());
			} else if (choose == 6) {
				collectionMap.deleteAll();
			}
		} while (choose != 0);
	}
}
