package 集合;


//在创建类的时候还是不确定泛型的数据类型，接口用什么泛型，实现类就用什么泛型
//在创建对象的时候确实其使用的是什么

public class 泛型接口实现2<I> implements 泛型接口<I> {

	@Override
	public void shuc(I i) {
		// TODO 自动生成的方法存根
		System.out.println(i);
	}
	
}