//package 枚举类型;
//
//import java.util.Random;
//
//import 枚举类型.Meal2.Food;
//
//public enum Type {
//	coffee(Food.Coffee.class),	dessert(Food.Dessert.class);
//	private Food[] values;
//	private Type(Class<? extends Food> kind) {
//		values = kind.getEnumConstants();
//	}
//	public static <T> T random(T []values) {
//		  return values[new Random().nextInt(values.length)];
//		}
//
//	public Food randomSelection() {
//		return Type.random(values);
//	}
//	public static void main(String[] args) {
//		for (int i = 0; i < 3; i++) {
//			for (Type meal : Type.values()) {
//				Food food = meal.randomSelection();
//				System.out.println(food);
//			}
//			System.out.println("---");
//		}
//		
//	}
//
//}
