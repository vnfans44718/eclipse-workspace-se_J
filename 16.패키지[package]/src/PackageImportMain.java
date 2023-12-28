


import com.itwill.shop.ShopService;
import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberService;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductService;
/*
import com.itwill.shop.admin.Product;
import com.itwill.shop.admin.ProductService;
*/
public class PackageImportMain {

	public static void main(java.lang.String[] args) {
		/*
		 * << 자동 import단축키 >>
		 * ctrl+ shift + o
		 */
		ShopService shopService=
				new ShopService();
		System.out.println(shopService);
		Member member=
				new Member();
		System.out.println(member);
		MemberService memberService=
				new MemberService();
		System.out.println(memberService);
		
		System.out.println("------com.itwill.shop.product.Product,com.itwill.shop.product.ProductService-------");
		Product shopProduct=
				new Product();
		System.out.println(shopProduct);
		ProductService shopProductService=
				new ProductService();
		System.out.println(shopProductService);
		
		System.out.println("--------com.itwill.shop.admin.Product,com.itwill.shop.admin.ProductService-----------------------------------------------");
		com.itwill.shop.admin.Product adminProduct=
				new com.itwill.shop.admin.Product();
		System.out.println(adminProduct);
		com.itwill.shop.admin.ProductService adminProductService=
				new com.itwill.shop.admin.ProductService();
		System.out.println(adminProductService);
		
		
	}

}