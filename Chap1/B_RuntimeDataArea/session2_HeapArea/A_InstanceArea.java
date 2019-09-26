package Chap1.B_RuntimeDataArea.session2_HeapArea;

import java.util.ArrayList;
import java.util.List;

public class A_InstanceArea {
	public static void main(String[] args) 
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		v(">>>>> 클래스 영역과 다른 점을 확인 하자 <<<<<");
		Class<?> c1 = Class.forName("Chap1.B_RuntimeDataArea.session2_HeapArea.InstanceClass");
		Class<?> c2 = Class.forName("Chap1.B_RuntimeDataArea.session2_HeapArea.InstanceClass");
		s("c1 hash code is : "+c1.hashCode());
		s("c2 hash code is : "+c2.hashCode());
		s("c1 == c2 ? : "+(c1 == c2));
		
		InstanceClass i1 = (InstanceClass)c1.newInstance();
		InstanceClass i2 = (InstanceClass)c1.newInstance();
		InstanceClass i3 = (InstanceClass)c1.newInstance();
		InstanceClass i4 = (InstanceClass)c1.newInstance();
		s("i1 == i2 ? : "+(i1 == i2));
		s("i1 == i3 ? : "+(i1 == i3));
		s("i1 == i4 ? : "+(i1 == i4));
		s("i2 == i3 ? : "+(i2 == i3));
		s("i2 == i4 ? : "+(i2 == i4));
		s("i3 == i4 ? : "+(i3 == i4));
		
		v(">>>>> 각각의 인스턴스는 hash라는 코드를 지닌다 <<<<<");
		i1.show();
		i2.show();
		i3.show();
		i4.show();
		v(">>>>> Array역시 동일 하다 <<<<<");
		Class<?> a1 = Class.forName("java.util.ArrayList");
		Class<?> a2 = Class.forName("java.util.ArrayList");
		s("a1 hash code is : "+System.identityHashCode(a1));
		s("a2 hash code is : "+System.identityHashCode(a2));
		s("a1 == a2 ? :"+(a1==a2));
		s("");
		List<String> l1 = (List<String>)a1.newInstance();
		List<String> l2 = (List<String>)a1.newInstance();
		List<String> l3 = (List<String>)a1.newInstance();
		List<String> l4 = (List<String>)a1.newInstance();
		
		// System.identityHashCode 메서드는 판별 할 오브젝트의 고유 해쉬 코드를 찾는 메서드
		// 자바 네이티브 인터페이스 이다.
		s("l1 hash code is : "+System.identityHashCode(l1));
		s("l2 hash code is : "+System.identityHashCode(l2));
		s("l3 hash code is : "+System.identityHashCode(l3));
		s("l4 hash code is : "+System.identityHashCode(l4));
		l1.add("a");
	}
	public static void s(Object o) {
		System.out.println(o);
	}
	public static void v(Object o) {
		System.out.println();
		System.out.println(o);
	}
}
class InstanceClass{
	public void show(){
		A_InstanceArea.s("hashcode at this Instance : "+System.identityHashCode(this));
	}
}