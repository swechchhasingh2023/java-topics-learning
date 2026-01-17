package New;

public class StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Navin");
		System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" singh");
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.insert(0, "Java ");
        System.out.println(sb);
        sb.setLength(30);
        System.out.println(sb);
        sb.ensureCapacity(100);
        System.out.println(sb);
	}
	
}
