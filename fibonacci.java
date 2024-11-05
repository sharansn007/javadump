class fibonacci{
	public static void main(String[] args){
		int initial = 0, mid = 1, next, count = 10, i;
		System.out.print(initial+" "+mid);
		
		for(i=2;i<count;++i){
			next = initial + mid;
			System.out.print(" "+next);
			initial = mid;
			mid = next;
		}
	}
}
