package JavaA5;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Questions4to7 {

	public static void main(String[] args) {
		List<News> details = Arrays.asList(
				new News(123,"Kumari","kumar","Good"),
				new News(345,"Manorama","Manoranjan","Bad"),
				new News(567,"Venkat","Venkatesvari","Average"),
				new News(789,"Karthika","Karthik","Good"),
				new News(901,"Sravan","Sravani","Bad")
			);	
//Question4
		System.out.println("Question4");
		Integer newsidmax= 
				details.stream()
				.collect(Collectors.groupingBy(News::getnewsid,Collectors.counting()))
				.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue())
				.get().getKey();
				System.out.println("News ID with the most comments is "+newsidmax);
				
				System.out.println();
//Question5
				System.out.println("Question5");
				Boolean commentsBased =
					    details.stream()
					                .anyMatch(d -> d.getcomment()
					                                .equals("budget"));	
				System.out.println(commentsBased);
				
//Question6
				System.out.println("Question6");
				String maxCommentUser= details.stream()
						.collect(Collectors.groupingBy(News::getcommentByUser,Collectors.counting()))
						.entrySet()
						.stream()
						.max(Map.Entry.comparingByValue())
						.get().getKey();
				
						
				System.out.println("user with the most comments is "+maxCommentUser);
//Question7
				System.out.println("Question7");
				Map<String, Long> kk= details.stream()
						.collect(Collectors.groupingBy(News::getcommentByUser,Collectors.counting()));
						System.out.println(kk);
						System.out.println();
				
				
   }				
}


