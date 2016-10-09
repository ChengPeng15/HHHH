package 枚举类型;
/*
 * 对于enum而言，实现接口是其实现子类化的唯一办法。在一个接口的内部，
 * 创建实现该接口的枚举，以此将元素进行分组，可以达到将枚举元素分类组织的目的。
 * 如下示例，用enum来表示不同类别的食物，但同时希望每个enum元素仍然保持Food类型。
 */
public enum Meal2 {
	APPETIZER(Food.Appetizer.class), MAINCOURSE(Food.MainCourse.class), DESSERT(
			Food.Dessert.class), COFFEE(Food.Coffee.class);
	private Food[] values;

	private Meal2(Class<? extends Food> kind) {
		values = kind.getEnumConstants();
	}

	public interface Food {
		enum Appetizer implements Food {
			SALAD, SOUP, SPRING_ROLLS;
		}

		enum MainCourse implements Food {
			LASAGNE, BURRITO, PAD_THAI, LENTILS, HUMMOUS, VINDALOO;
		}

		enum Dessert implements Food {
			TIRAMISU, GELATO, BLACK_FOREST_CAKE, FRUIT, CREME_CARAMEL;
		}

		enum Coffee implements Food {
			BLACK_COFFEE, DECAF_COFFEE, ESPRESSO, LATTE, CAPPUCCINO, TEA, HERB_TEA;
		}
	}

	public Food randomSelection() {
		return Enums.random(values);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (Meal2 meal : Meal2.values()) {
				Food food = meal.randomSelection();
				System.out.println(food);
			}
			System.out.println("---");
		}
	}
}
