
public class WhileUseChar2 {

	public static void main(String[] args) {
		/*
		 * 문자출력
		 */
		char c1 = 0;
        while(c1 < 65535) {
        	System.out.print(c1);
        	c1++;
        	if (c1%100==0) {
        		System.out.println("\n");
				
			}
        }
        System.out.println();
        /*
         * 영소문자출력
         */
        
        int c2='a';
       
        while (c2<='z') {
       
        	while (c2%5 == 0) {
        		System.out.print("\n ");
					}
			c2++;
			
			}
        
	
        char eng='a';
    		while(eng<='z') {
    			System.out.printf("%c",eng);

    			if((eng-'a'+1)%5==0) {
    				System.out.print("\n");
    				
    			}
    			eng++;
    		}
    			
    	
        
        
        
	}

}
