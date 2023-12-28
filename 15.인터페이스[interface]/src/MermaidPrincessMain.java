
public class MermaidPrincessMain {

	public static void main(String[] args) {
		System.out.println("-------MermaidPrincess------");
		MermaidPrincess  mermaidPrincess = new MermaidPrincess();
		
		mermaidPrincess.speak();
		mermaidPrincess.think();
		mermaidPrincess.fastSwim();
		mermaidPrincess.liveSea();
		
		System.out.println("-------Mermaid------");
		Mermaid mermaid = mermaidPrincess;
		/*
		 * mermaid.speak();
		 * mermaid.think();
		 */
		mermaid.fastSwim();
		mermaid.liveSea();
		
		
		System.out.println("-------Princess------");
		Princess princess=mermaidPrincess;
		princess.speak();
		princess.think();
		
		/*
		princess.fastSwim();
		princess.liveSea();
		 */
		
		System.out.println("-------Mermaid <--->Princess------");
		Mermaid mermaid2=new MermaidPrincess();
		mermaid2.fastSwim();
		mermaid2.liveSea();
		Princess princess2=(Princess)mermaid2;
		//부모끼리 캐스팅
		princess2.speak();
		princess2.think();
		
		
		
		
	}

}
