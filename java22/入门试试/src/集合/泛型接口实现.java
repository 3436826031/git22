package 集合;


//在创建实现类的时候，确定泛型的类型。
//这样方法就已经有了确定的数据类型

public class 泛型接口实现 implements 泛型接口<Integer>{

	@Override
	public void shuc(Integer i) {
		System.out.println(i);
		
	}

}
